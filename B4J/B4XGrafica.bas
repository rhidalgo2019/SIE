B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private fx As JFX
	Private MainForm As Form
	Private xl As XLUtils

	
	Private CB_Anio As B4XComboBox
	Private B_Proceder As Button
	Private B_Regresar As Button

	Public LineChart As LineChart
	Dim ChartCanvas As Canvas
	Dim FullSeries As XYSeries
	Dim CurrentSeries As XYSeries

    Public mCLAVES(50) As String
	Public mDATOS(50) As String
	Public mMINIMOS(50) As String
	Public mMAXIMOS(50) As String
	Public mMETAS(50) As String
	Public mVALORES(50) As String
	Public mMESES(50) As String
	Public Serie_1, Serie_2, Serie_3, Serie_4 As XYSeries
	Public mINDICADOR As String
	Public mMESES(12) As String

	Private CB_Indicador As B4XComboBox
	Private L_Mensajes As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Dim x As Int
	
	Log("B4XGrafica")
	Root = Root1
	Root.LoadLayout("Grafica")
	CB_Anio.cmbBox.Items.Clear
	For x = 2021 To 2027
		CB_Anio.cmbBox.Items.Add(x)
	Next
	Cargar_Indicadores
	For x = 0 To Main.mULT_DATOS
		CB_Indicador.cmbBox.Items.Add(mDATOS(x))
	Next
	mMESES(0) = "1"
	mMESES(1) = "2"
	mMESES(2) = "3"
	mMESES(3) = "4"
	mMESES(4) = "5"
	mMESES(5) = "6"
	mMESES(6) = "7"
	mMESES(7) = "8"
	mMESES(8) = "9"
	mMESES(9) = "10"
	mMESES(10) = "11"
	mMESES(11) = "12"
	L_Mensajes.Text = ""
	
	'LINE CHART
	LineChart.Animated = False
	LineChart.CreateSymbols = False
	LineChart.LegendVisible = False
	FullSeries.Initialize("")
	CurrentSeries.Initialize("")
	LineChart.AddSeries(CurrentSeries)

	'CANVAS
	ChartCanvas.Initialize("")
	ChartCanvas.Enabled = False
	MainForm.Initialize("", 800, 600)
	MainForm.RootPane.AddNode(ChartCanvas, LineChart.Left, LineChart.Top, 0, 0)
End Sub

Private Sub CB_Anio_SelectedIndexChanged (Index As Int)
	Main.mANIO = CB_Anio.cmbBox.Value
End Sub

Private Sub CB_Indicador_SelectedIndexChanged (Index As Int)
	mINDICADOR = CB_Indicador.cmbBox.value
	LineChart.Title = mINDICADOR
	LineChart.RemoveAllSeries
End Sub

Private Sub B_Proceder_MouseClicked (EventData As MouseEvent)
	L_Mensajes.Text = "Generando gráfica..."
	Cargar_Valores
	L_Mensajes.Text = "Generando PDF..."
	LLenar_Excel
	LineChart.Visible = True
End Sub

Sub Cargar_Indicadores()
	Dim mRS As ResultSet

	Main.mULT_DATOS = -1
	Main.Conectar_Servidor
	If Main.mSQL.IsInitialized Then
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = 2022")
		Do While mRS.NextRow
			Main.mULT_DATOS = Main.mULT_DATOS + 1
			mCLAVES(Main.mULT_DATOS) = mRS.GetString("ind_clave")
			mDATOS(Main.mULT_DATOS) = mRS.GetString("ind_descripcion")
		Loop
		Main.mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
	End If
End Sub

Sub Cargar_Valores()
	Dim x As Int
	Dim mRS As ResultSet
	Dim ANIO As Int

	Main.Conectar_Servidor
	ANIO = Main.mANIO
	If Main.mSQL.IsInitialized Then
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_indicadores WHERE ind_descripcion = '" & mINDICADOR & "' AND ind_anio = " & ANIO)
		Do While mRS.NextRow
			For x = 0 To 11
				mMINIMOS(x) = mRS.GetString("ind_minimo")				
			Next
			For x = 0 To 11
				mMAXIMOS(x) = mRS.GetString("ind_maximo")				
			Next
			For x = 0 To 11
				mMETAS(x) = mRS.GetString("ind_meta")				
			Next
			mVALORES(0) = mRS.GetString("ind_ene")
			mVALORES(1) = mRS.GetString("ind_feb")
			mVALORES(2) = mRS.GetString("ind_mar")
			mVALORES(3) = mRS.GetString("ind_abr")
			mVALORES(4) = mRS.GetString("ind_may")
			mVALORES(5) = mRS.GetString("ind_jun")
			mVALORES(6) = mRS.GetString("ind_jul")
			mVALORES(7) = mRS.GetString("ind_ago")
			mVALORES(8) = mRS.GetString("ind_sep")
			mVALORES(9) = mRS.GetString("ind_oct")
			mVALORES(10) = mRS.GetString("ind_nov")
			mVALORES(11) = mRS.GetString("ind_dic")
			For x = 0 To 11
			   If mVALORES(x) = "" Then
				  mVALORES(x) = "0"
			   End If
			Next
		Loop
		Main.mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
	End If
	Corregir_Valores
	LLenar_Series
End Sub

Sub Corregir_Valores
	Dim x As Int
	
	For x = 0 To 11
		If mVALORES(x)  = "" Then
			mVALORES (x) = mMINIMOS(x)
		End If
	Next
End Sub

Sub LLenar_Series()
	Dim x As Int
	Dim XAxisL As NumberAxis = LineChart.XAxis
	Dim YAxisL As NumberAxis = LineChart.YAxis
		
	XAxisL.Label = "Mes"
	XAxisL.LowerBound = 1
	XAxisL.UpperBound = 12
	YAxisL.Label = "Valor"
	YAxisL.LowerBound = mMINIMOS(0).As(Int) - 5
	YAxisL.UpperBound = mMAXIMOS(0).As(Int) + 5
	LineChart.RemoveAllSeries
	Serie_1.Initialize("Valor")
	Serie_1.Clear
	For x = 0 To 11
		If mVALORES(x) = "" Then
			Serie_1.Add(mMESES(x).As(Int), 0)
		Else
			Serie_1.Add(mMESES(x).As(Int), mVALORES(x).As(Int))
		End If
	Next
	Serie_2.Initialize("Minimo")
	Serie_2.Clear
	For x = 0 To 11
		If mVALORES(x) = "" Then
			Serie_2.Add(mMESES(x).As(Int), 0)
		Else
			Serie_2.Add(mMESES(x).As(Int) , mMINIMOS(x).As(Int))
		End If
	Next
	Serie_3.Initialize("Máximo")
	For x = 0 To 11
		If mMAXIMOS(x) = "" Then
			Serie_3.Add(mMESES(x).As(Int), 0)
		Else
			Serie_3.Add(mMESES(x).As(Int), mMAXIMOS(x).As(Int))
		End If
	Next
	Serie_4.Initialize("Meta")
	For x = 0 To 11
		If mMETAS(x) = "" Then
			Serie_4.Add(mMESES(x).As(Int), 0)
		Else
			Serie_4.Add(mMESES(x).As(Int), mMETAS(x).As(Int))
		End If
	Next
	LineChart.AddAllSeries(Array As XYSeries(Serie_1, Serie_2, Serie_3, Serie_4))
	
	Dim Color_1 As Map = LineChart.GetChildStyleMap(".default-color0.chart-series-line")
	Color_1.Put("-fx-stroke", "blue")
	LineChart.SetChildStyleMap(".default-color0.chart-series-line", Color_1)
	Dim Color_2 As Map = LineChart.GetChildStyleMap(".default-color1.chart-series-line")
	Color_2.Put("-fx-stroke", "red")
	LineChart.SetChildStyleMap(".default-color1.chart-series-line", Color_2)
	Dim Color_3 As Map = LineChart.GetChildStyleMap(".default-color2.chart-series-line")
	Color_3.Put("-fx-stroke", "green")
	LineChart.SetChildStyleMap(".default-color2.chart-series-line", Color_3)
	Dim Color_4 As Map = LineChart.GetChildStyleMap(".default-color3.chart-series-line")
	Color_4.Put("-fx-stroke", "orange")
	LineChart.SetChildStyleMap(".default-color3.chart-series-line", Color_4)
	
	
'	Dim mMAP As Map
'	LineChart.SetChildStyleMap("Mes", mMAP)
End Sub

Sub LLenar_Excel()
	xl.Initialize
	Dim mNOMBRE, mNOMBRE_2, mNOMBRE_PDF As String
	Dim Libro As XLWorkbookWriter
	Dim Hoja As XLSheetWriter
	Dim Color_Fondo As XLStyle
	Dim Estilo_Moneda As XLStyle
	Dim Estilo_Monto As XLStyle
	Dim Estilo As XLStyle
'	Dim Centrado As XLStyle

	If Main.mmes < 10 Then
		mNOMBRE = "\GRAFICAS\SIE_G_" & mCLAVES(CB_Indicador.cmbBox.Items.IndexOf (CB_Indicador.cmbBox.value)) & "_" & Main.mANIO & "_0" & Main.mMES & ".xlsx"
		mNOMBRE_2 = "\GRAFICAS\SIE_G_" & mCLAVES(CB_Indicador.cmbBox.Items.IndexOf (CB_Indicador.cmbBox.value)) & "_" & Main.mANIO & "_0" & Main.mMES
	Else
		mNOMBRE = "\GRAFICAS\SIE_G_" & mCLAVES(CB_Indicador.cmbBox.Items.IndexOf (CB_Indicador.cmbBox.value)) & "_" & Main.mANIO & "_" & Main.mMES & ".xlsx"
		mNOMBRE_2 = "\GRAFICAS\SIE_G_" & mCLAVES(CB_Indicador.cmbBox.Items.IndexOf (CB_Indicador.cmbBox.value)) & "_" & Main.mANIO & "_" & Main.mMES
	End If
	Libro = xl.CreateWriterFromTemplate(File.DirAssets, "Grafica.xlsx")
	Hoja = Libro.CreateSheetWriterByName("Grafica")
	Estilo_Moneda = Libro.CreateStyle.DataFormat("$#,##0.0")
	Estilo_Monto = Libro.CreateStyle.DataFormat("#,##0")
'	Centrado = Libro.CreateStyle.HorizontalAlignment("CENTER")
	mINDICADOR = CB_Indicador.cmbBox.value
	If mINDICADOR.Contains("$") Then
		Estilo = Estilo_Moneda
	Else
		Estilo = Estilo_Monto
	End If
	Hoja.PutString(xl.AddressName("A4"), mINDICADOR)
	Color_Fondo = Libro.CreateStyle.ForegroundColor(xl.COLOR_GREEN)
	Hoja.PutNumber(xl.AddressOne("B", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("C", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("D", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("E", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("F", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("G", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("H", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("I", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("J", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("K", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("L", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("M", 32), mMAXIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))

	Color_Fondo = Libro.CreateStyle.ForegroundColor(xl.COLOR_ORANGE)
	Hoja.PutNumber(xl.AddressOne("B", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("C", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("D", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("E", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("F", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("G", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("H", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("I", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("J", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("K", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("L", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("M", 33), mMETAS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))

	Color_Fondo = Libro.CreateStyle.ForegroundColor(xl.COLOR_BLUE)
	Hoja.PutNumber(xl.AddressOne("B", 34), mVALORES(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("C", 34), mVALORES(1)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("D", 34), mVALORES(2)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("E", 34), mVALORES(3)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("F", 34), mVALORES(4)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("G", 34), mVALORES(5)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("H", 34), mVALORES(6)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("I", 34), mVALORES(7)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("J", 34), mVALORES(8)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("K", 34), mVALORES(9)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("L", 34), mVALORES(10)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("M", 34), mVALORES(11)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))

	Color_Fondo = Libro.CreateStyle.ForegroundColor(xl.COLOR_RED)
	Hoja.PutNumber(xl.AddressOne("B", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("C", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("D", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("E", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("F", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("G", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("H", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("I", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("J", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("K", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("L", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))
	Hoja.PutNumber(xl.AddressOne("M", 35), mMINIMOS(0)).SetStyles(Hoja.LastAccessed, Array(Estilo, Color_Fondo))

	Hoja.AddStylesToRange(xl.CreateXLRange(xl.AddressName("B32"), xl.Addressname("M35")), Array(Libro.CreateStyle.BorderTop ("THIN")))
	Hoja.AddStylesToRange(xl.CreateXLRange(xl.AddressName("B32"), xl.Addressname("M35")), Array(Libro.CreateStyle.BorderRight("THIN")))
	Hoja.AddStylesToRange(xl.CreateXLRange(xl.AddressName("B32"), xl.Addressname("M35")), Array(Libro.CreateStyle.BorderBottom("THIN")))
	Hoja.AddStylesToRange(xl.CreateXLRange(xl.AddressName("B32"), xl.Addressname("M35")), Array(Libro.CreateStyle.BorderLeft("THIN")))
	Hoja.AddStylesToRange(xl.CreateXLRange(xl.AddressName("B32"), xl.Addressname("M35")), Array(Libro.CreateStyle.HorizontalAlignment("CENTER")))
	Hoja.AddStylesToRange(xl.CreateXLRange(xl.AddressName("B32"), xl.Addressname("M35")), Array(Libro.CreateStyle.VerticalAlignment("CENTER")))

	L_Mensajes.Text = "Guardando PDF..."
	Dim f As String = Libro.SaveAs(File.DirApp, mNOMBRE, True)
	mNOMBRE_PDF = File.DirApp & "\" & mNOMBRE_2 & ".pdf"
	Libro.RemoveSheetAt(0)
	L_Mensajes.Text = "Abriendo PDF..."
	Wait For (xl.PowerShellConvertToPdf(f, mNOMBRE_PDF, 0, True)) Complete (Success As Boolean)
	L_Mensajes.Text = ""
End Sub

Sub LLenar_Excel_XLS()
	Dim x As Int
	Dim ExcelTemplate As ReadableWorkbook
	Dim NewWorkbook As WritableWorkbook
	Dim Worksheet As WritableSheet
	Dim Cell As WritableCell

	mINDICADOR = CB_Indicador.cmbBox.value
	ExcelTemplate.Initialize(File.DirAssets, "Grafica.xls")
	NewWorkbook.Initialize2(File.DirApp, "Grafica.xls", ExcelTemplate)
	Worksheet = NewWorkbook.AddSheet("Datos", 1)
	Cell.InitializeText(0, 0, mINDICADOR)
	Worksheet.AddCell(Cell)
	For x = 0 To 11
		Cell.InitializeNumber(x, 1, mMAXIMOS(0).As(Double))
		Worksheet.AddCell(Cell)
		Cell.InitializeNumber(x, 2, mMETAS(0).As(Double))
		Worksheet.AddCell(Cell)
		Cell.InitializeNumber(x, 3, mVALORES(x).As(Double))
		Worksheet.AddCell(Cell)
		Cell.InitializeNumber(x, 4, mMINIMOS(0).As(Double))
		Worksheet.AddCell(Cell)
	Next
	NewWorkbook.Write
	NewWorkbook.Close
	ExcelTemplate.Close
End Sub

Sub LC_MouseMoved(Event As MouseEvent)
	'Adjusts the canvas position and size to fit the plot area
	Dim NB As NodeBounds = LineChart.GetChildNodeBounds(".chart-plot-background")
	If ChartCanvas.Left <> NB.SceneX Then ChartCanvas.Left = NB.SceneX
	If ChartCanvas.Top <> NB.SceneY Then ChartCanvas.Top = NB.SceneY
	If ChartCanvas.Width <> NB.Width Then ChartCanvas.Width = NB.Width
	If ChartCanvas.Height <> NB.Height Then ChartCanvas.Height = NB.Height

	'Gets the X value according to the mouse position
	Dim AxisCoord As XYCoord = LineChart.MouseToAxis(Event)
	Dim XAxis As NumberAxis = LineChart.XAxis
	Dim XValue As Double = XAxis.GetValueForDisplay(AxisCoord.X)

	'Gets the data item with the closest value to X
	Dim NearestXY As XYCoord = CurrentSeries.FindNearestX(XValue)
	If NearestXY = Null Then Return

	'Computes the display position for X and Y
	Dim YAxis As NumberAxis = LineChart.YAxis
	Dim X As Double = XAxis.GetDisplayPosition(NearestXY.X)
	Dim Y As Double = YAxis.GetDisplayPosition(NearestXY.Y)

	'Draws the selection line
	ChartCanvas.ClearRect(0, 0, ChartCanvas.Width, ChartCanvas.Height)
	ChartCanvas.DrawLine(X, 0, X, ChartCanvas.Height, Null, 1)

	'Draws the X and Y values next to the selected point
	ChartCanvas.DrawCircle(X, Y, 6, fx.Colors.Red, False, 3)
	ChartCanvas.DrawText("X=" & NumberFormat(NearestXY.X, 1, 7) & CRLF & "Y=" & NumberFormat(NearestXY.Y, 1, 7), X + 10, Y - 4, fx.DefaultFont(12), fx.Colors.Black, "LEFT")
End Sub

Sub LC_MouseExited(Event As MouseEvent)
	ChartCanvas.ClearRect(0, 0, ChartCanvas.Width, ChartCanvas.Height)
End Sub

Private Sub B_Regresar_Click
	If Main.mDERECHO >= 10 Then
		B4XPages.ShowPageAndRemovePreviousPages("Menu")
	Else
		B4XPages.ClosePage(Me)
	End If
End Sub

Sub YAxisL_ToString(Nbr As Object) As String
	Dim IntNbr As Int = Nbr
	
	Return IntNbr & " m"
End Sub