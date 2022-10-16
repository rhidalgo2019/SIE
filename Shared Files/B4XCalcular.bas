B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private CB_Anio As B4XComboBox
	Private CB_Mes As B4XComboBox
	Private TBL_Calcular As FlexGrid
	Private B_Calcular As Button
	Private B_Regresar As Button
	Private L_Estado_1 As Label
	Private L_Estado_2 As Label
	Private B_Guardar As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Log("B4XCalcular")
	Root = Root1
	Root.LoadLayout("Calcular")
	L_Estado_1.Visible = False
	L_Estado_2.Visible = False
	B_Guardar.Visible = False
	TBL_Calcular.ColsName=Array As String("Clave", "Denominación", "Valor", "Meta", "Cumple al", "Mínimo", "Máximo")
	TBL_Calcular.ColsWidth=Array As Int(50dip, 250dip, 80dip, 80dip, 80dip, 80dip, 80dip)
	TBL_Calcular.ColsType=Array As Int(TBL_Calcular.TypeString, TBL_Calcular.TypeString, TBL_Calcular.TypeString)
	TBL_Calcular.ColsAlignment=Array As String("CENTER", "LEFT", "CENTER", "CENTER", "CENTER", "CENTER", "CENTER")
	TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	CB_Anio.cmbBox.Items.Clear
	For x = 2021 To 2027
		CB_Anio.cmbBox.Items.Add(x)
	Next
	CB_Mes.cmbBox.Items.Clear
	For x = 1 To 12
		CB_Mes.cmbBox.Items.Add(x)
	Next
End Sub

Private Sub CB_Anio_SelectedIndexChanged (Index As Int)
	Main.mANIO = CB_Anio.cmbBox.Value
	L_Estado_1.Visible = False
	L_Estado_2.Visible = False
	B_Guardar.Visible = False
	TBL_Calcular.ClearRows
	TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
End Sub

Private Sub CB_Mes_SelectedIndexChanged (Index As Int)
	Main.mMES = CB_Mes.cmbBox.Value
	L_Estado_1.Visible = False
	L_Estado_2.Visible = False
	B_Guardar.Visible = False
	TBL_Calcular.ClearRows
	TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
End Sub

Private Sub B_Calcular_Click
	L_Estado_1.Visible = False
	L_Estado_2.Visible = False
	B_Guardar.Visible = False
	TBL_Calcular.ClearRows
	TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(12))
	L_Estado_1.Visible = True
	L_Estado_2.Visible = True
	L_Estado_1.Text = "Procesando la informacion..."
	L_Estado_2.Text = ""
	If Actualizar Then
		L_Estado_1.Visible = False
		L_Estado_2.Visible = False
		B_Guardar.visible = True
	End If
End Sub

Public Sub Actualizar() As Boolean
	Dim mRS As ResultSet
	Dim x, mULT_CALCULAR As Int
	Dim mVALOR, mTIPO As String
	Dim mVAL_CLAVES(50), mVAL_DESCRIPCIONES(50), mVAL_VALORES(50) As String
	Dim mIND_CLAVES(50), mIND_DESCRIPCIONES(50), mIND_VALORES(50) As String
	Dim mIND_CUMPLE, mIND_MINIMO, mIND_MAXIMO, mIND_META As String
	Dim mVAL_CLAVE, mVAL_VALOR As String
	Dim mFAC, mCOB, mVE, mVF, mTC, mTSC, mCEE, mCOP, mETC, mTE, mGT, mTR, mPA As Float
	Dim mTMP_STR_1, mTMP_STR_2, mTMP_STR_3 As String
	Dim mEC, mEF, mEG, mDH, mCS, mIEE, mIE, mIL, mRTM, mVBF, mCP, mCPC As String
	Dim mTMP_FLOAT As Float
	Dim mCOMPLETOS As Boolean
	Dim mTOTAL_VALORES As Int
 	Dim mRET As Boolean
	Dim mCADENA As String

  	mFAC = 0.0
	mCOB = 0.0
	mVE = 0.0
	mVF = 0.0
	mTC = 0.0
	mTSC = 0.0
	mCEE = 0.0
	mCOP = 0.0
	mETC = 0.0
	mTE = 0.0 
	mGT = 0.0
	mTR = 0.0
	mPA = 0.0
    mEC = "0"
 	mEF = "0"
	mEG = "0"
	mDH = "0"
	mCS = "0"
	mIEE = "0"
	mIE = "0"
	mIL = "0"
	mRTM = "0"
	mVBF = "0"
	mCP = "0"
	mCPC = "0"
	mRET = True
	' DETERMINAR VALORES FALTANTES
	mTOTAL_VALORES = -1
	Main.Conectar_Servidor
'	mSQL.Initialize2("net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE;"$, mADMINISTRADOR, mPASSWORD)
	If Main.mSQL.IsInitialized Then
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_valores WHERE val_anio = " & Main.mANIO)
		Do While mRS.NextRow
			mTOTAL_VALORES = mTOTAL_VALORES + 1
			mVAL_CLAVE = mRS.GetString("val_clave")
			Select Case Main.mMES
				Case 1
					mVAL_VALOR = mRS.GetString("val_ene")
				Case 2
					mVAL_VALOR = mRS.GetString("val_feb")
				Case 3
					mVAL_VALOR = mRS.GetString("val_mar")
				Case 4
					mVAL_VALOR = mRS.GetString("val_abr")
				Case 5
					mVAL_VALOR = mRS.GetString("val_may")
				Case 6
					mVAL_VALOR = mRS.GetString("val_jun")
				Case 7
					mVAL_VALOR = mRS.GetString("val_jul")
				Case 8
					mVAL_VALOR = mRS.GetString("val_ago")
				Case 9
					mVAL_VALOR = mRS.GetString("val_sep")
				Case 10
					mVAL_VALOR = mRS.GetString("val_oct")
				Case 11
					mVAL_VALOR = mRS.GetString("val_nov")
				Case 12
					mVAL_VALOR = mRS.GetString("val_dic")
			End Select
			If mVAL_CLAVE = "TC" Then
				mTC = mVAL_VALOR.As(Float)				
			End If
			If mVAL_VALOR = "0.00" Or mVAL_VALOR = "0" Or mVAL_VALOR = "0.0" Or mVAL_CLAVE = "VE" Then
				If mVAL_CLAVE = "VE" Then
					mVE = Calcular_Volumen_Explotado
					mVAL_VALOR = Main.mFORMATO(mVE, "T")
				End If
				If mVAL_CLAVE = "TSC" Then
					mTSC = mTC * 0.97
					mVAL_VALOR = Main.mFORMATO(mTSC, "T")
				End If
				If mVAL_CLAVE = "PA" Then
					mPA = mTC * 5
					mVAL_VALOR = Main.mFORMATO(mPA, "T")
				End If
				If mVAL_CLAVE = "CEE" Then
					mCEE = Calcular_Costo_Energia_Electrica
					mVAL_VALOR = Main.mFORMATO(mCEE, "T")
				End If
				If mVAL_CLAVE = "ETC" Then
					mCEE = Calcular_Energia_Total_Consumida
					mVAL_VALOR = Main.mFORMATO(mCEE, "T")
				End If
				Select Case Main.mMES
					Case 1
						mCADENA = "UPDATE sie_valores SET val_ene = '"
					Case 2
						mCADENA = "UPDATE sie_valores SET val_feb = '"
					Case 3
						mCADENA = "UPDATE sie_valores SET val_mar = '"
					Case 4
						mCADENA = "UPDATE sie_valores SET val_abr = '"
					Case 5
						mCADENA = "UPDATE sie_valores SET val_may = '"
					Case 6
						mCADENA = "UPDATE sie_valores SET val_jun = '"
					Case 7
						mCADENA = "UPDATE sie_valores SET val_jul = '"
					Case 8
						mCADENA = "UPDATE sie_valores SET val_ago = '"
					Case 9
						mCADENA = "UPDATE sie_valores SET val_sep = '"
					Case 10
						mCADENA = "UPDATE sie_valores SET val_oct = '"
					Case 11
						mCADENA = "UPDATE sie_valores SET val_nov = '"
					Case 12
						mCADENA = "UPDATE sie_valores SET val_dic = '"
				End Select
				mCADENA = mCADENA & mVAL_VALOR & "' WHERE val_clave = '" & mVAL_CLAVE & "' AND val_anio = " & Main.mANIO
				Main.Conectar_Servidor_2
				Main.mSQL2.ExecNonQuery(mCADENA)
				Main.mSQL2.Close
			End If
		Loop
		Main.mSQL.Close
		mRS.Close
	End If
	' CARGAR VALORES
	x = -1
	Main.Conectar_Servidor
	If Main.mSQL.IsInitialized Then
		mTIPO = "V"
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_valores WHERE val_anio = " & Main.Manio)
		Do While mRS.NextRow
			x = x + 1
			mVAL_CLAVES(x) = mRS.GetString("val_clave")
			mVAL_DESCRIPCIONES(x) = mRS.GetString("val_descripcion")
			Select Case Main.mMES
				Case 1
					mVAL_VALORES(x) = mRS.GetString("val_ene")
				Case 2
					mVAL_VALORES(x) = mRS.GetString("val_feb")
				Case 3
					mVAL_VALORES(x) = mRS.GetString("val_mar")
				Case 4
					mVAL_VALORES(x) = mRS.GetString("val_abr")
				Case 5
					mVAL_VALORES(x) = mRS.GetString("val_may")
				Case 6
					mVAL_VALORES(x) = mRS.GetString("val_jun")
				Case 7
					mVAL_VALORES(x) = mRS.GetString("val_jul")
				Case 8
					mVAL_VALORES(x) = mRS.GetString("val_ago")
				Case 9
					mVAL_VALORES(x) = mRS.GetString("val_sep")
				Case 10
					mVAL_VALORES(x) = mRS.GetString("val_oct")
				Case 11
					mVAL_VALORES(x) = mRS.GetString("val_nov")
				Case 12
					mVAL_VALORES(x) = mRS.GetString("val_dic")
			End Select
			Select Case mVAL_CLAVES(x)
				Case "FAC"
					mFAC = mVAL_VALORES(x).As(Float)
				Case "COB"
					mCOB = mVAL_VALORES(x).As(Float)
				Case "VE"
					mVE = mVAL_VALORES(x).As(Float)
				Case "VF"
					mVF = mVAL_VALORES(x).As(Float)
				Case "TC"
					mTC = mVAL_VALORES(x).As(Float)
				Case "TSC"
					mTSC = mVAL_VALORES(x).As(Float)
				Case "CEE"
					mCEE = mVAL_VALORES(x).As(Float)
				Case "COP"
					mCOP = mVAL_VALORES(x).As(Float)
				Case "ETC"
					mETC = mVAL_VALORES(x).As(Float)
				Case "TE"
					mTE = mVAL_VALORES(x).As(Float)
				Case "GT"
					mGT = mVAL_VALORES(x).As(Float)
				Case "TR"
					mTR = mVAL_VALORES(x).As(Float)
				Case "PA"
					mPA = mVAL_VALORES(x).As(Float)
			End Select
			TBL_Calcular.AddRow(Array As Object(mVAL_CLAVES(x), mVAL_DESCRIPCIONES(x), Main.mFORMATO(mVAL_VALORES(x), "N"), mTIPO), True)
		Loop
		Main.mSQL.Close
		mRS.Close
	End If
	mULT_CALCULAR = x
	' DETERMINAR VALORES FALTANTES
	mCOMPLETOS = True
	For x = 0 To mULT_CALCULAR
		mVALOR= TBL_Calcular.GetCellValue(x, 2)
		mTIPO = TBL_Calcular.GetCellValue(x, 3)
		If mTIPO = "V" Then
			If mVALOR = "0.00" Or mVALOR = "" Or mVALOR = "0" Then
				mRET = False
				mCOMPLETOS = False
				TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(0, 0, 255), xui.Color_RGB(255, 255, 0), xui.CreateDefaultFont(12))
			End If
		End If
	Next
	If Not(mCOMPLETOS) Then
		L_Estado_1.Visible = True
		L_Estado_2.Visible = True
		L_Estado_1.Text = "Falta información para poder determinar"
		L_Estado_2.Text = "los Indicadores de Efectividad"
	End If
	If mCOMPLETOS Then
		mIND_CUMPLE = ""
		x = mULT_CALCULAR
		' CARGAR INDICADORES DE EFECTIVIDAD
		Main.Conectar_Servidor
		If Main.mSQL.IsInitialized Then
			mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = " & Main.Manio)
			Do While mRS.NextRow
				x = x + 1
				mIND_CLAVES(x) = mRS.GetString("ind_clave")
				mIND_DESCRIPCIONES(x) = mRS.GetString("ind_descripcion")
				mIND_MINIMO = mRS.GetString("ind_minimo")
				mIND_MAXIMO = mRS.GetString("ind_maximo")
				mIND_META = mRS.GetString("ind_meta")
				Select Case Main.mMES
					Case 1
						mIND_VALORES(x) = mRS.GetString("ind_ene")
					Case 2
						mIND_VALORES(x) = mRS.GetString("ind_feb")
					Case 3
						mIND_VALORES(x) = mRS.GetString("ind_mar")
					Case 4
						mIND_VALORES(x) = mRS.GetString("ind_abr")
					Case 5
						mIND_VALORES(x) = mRS.GetString("ind_may")
					Case 6
						mIND_VALORES(x) = mRS.GetString("ind_jun")
					Case 7
						mIND_VALORES(x) = mRS.GetString("ind_jul")
					Case 8
						mIND_VALORES(x) = mRS.GetString("ind_ago")
					Case 9
						mIND_VALORES(x) = mRS.GetString("ind_sep")
					Case 10
						mIND_VALORES(x) = mRS.GetString("ind_oct")
					Case 11
						mIND_VALORES(x) = mRS.GetString("ind_nov")
					Case 12
						mIND_VALORES(x) = mRS.GetString("ind_dic")
				End Select
				TBL_Calcular.AddRow(Array As Object(mIND_CLAVES(x), mIND_DESCRIPCIONES(x), mIND_VALORES(x), mIND_META, mIND_CUMPLE, mIND_MINIMO, mIND_MAXIMO), True)
			Loop
			Main.mSQL.Close
			mRS.Close
		End If
		mULT_CALCULAR = x
		' CALCULAR INDICADORES DE EFECTIVIDAD
		For x = 0 To mULT_CALCULAR
			' CALCULO DE LA EFICIENCIA COMERCIAL (%)
			If TBL_Calcular.GetCellValue(x, 0) = "EC" Then
				If mFAC <> 0 Then
					mTMP_FLOAT = (mCOB / mFAC) * 100
					mEC = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
					TBL_Calcular.SetCellValue(x, 2, mEC)
				Else
					TBL_Calcular.SetCellValue(x, 2, "Falta FACTURADO ($)")
				End If
			End If
			' CALCULO DE LA EFICIENCIA FISICA (%)
			If TBL_Calcular.GetCellValue(x, 0) = "EF" Then
				If mVE <> 0 Then
					mTMP_FLOAT = (mVF / mVE) * 100
					mEF = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
					TBL_Calcular.SetCellValue(x, 2, mEF)
				Else
					TBL_Calcular.SetCellValue(x, 2, "Falta VOLUMEN EXPLOTADO (m3)")
				End If
			End If
			' CALCULO DE LA EFICIENCIA GLOBAL (%)
			If TBL_Calcular.GetCellValue(x, 0) = "EG" Then
				mTMP_STR_1 = Main.mFORMATO(mEC, "T")
				mTMP_STR_2 = Main.mFORMATO(mEF, "T")
				mTMP_FLOAT = (mTMP_STR_1 * mTMP_STR_2) / 100
				mEG = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
				TBL_Calcular.SetCellValue(x, 2, mEG)
			End If
			' CALCULO DE LA DOTACION POR HABITANTE l/h/d
			If TBL_Calcular.GetCellValue(x, 0) = "DH" Then
				mTMP_STR_1 = Main.mFORMATO(mVE, "T")
				mTMP_STR_2 = Main.mFORMATO(mPA, "T")
				mTMP_FLOAT = ((mTMP_STR_1 * 1000) / mTMP_STR_2) / 30
				mDH = Main.mFORMATO(mTMP_FLOAT.As(String), "N")
				TBL_Calcular.SetCellValue(x, 2, mDH)
			End If
			' CALCULO DE LA CONTINUIDAD DEL SERVICIO (%)
			If TBL_Calcular.GetCellValue(x, 0) = "CS" Then
				mTMP_STR_1 = Main.mFORMATO(mTSC, "T")
				mTMP_STR_2 = Main.mFORMATO(mTC, "T")
				mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100
				mCS = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
				TBL_Calcular.SetCellValue(x, 2, mCS)
			End If
			' CALCULO DE LA INCIDENCIA DE LA ENERGIA ELECTRICA (%)
			If TBL_Calcular.GetCellValue(x, 0) = "IEE" Then
				mTMP_STR_1 = Main.mFORMATO(mCEE, "T")
				mTMP_STR_2 = Main.mFORMATO(mCOP, "T")
				mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100
				mIEE = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
				TBL_Calcular.SetCellValue(x, 2, mIEE)
			End If
			' CALCULO DEL INDICADOR ENERGETICO kWh / m3
			If TBL_Calcular.GetCellValue(x, 0) = "IE" Then
				mTMP_STR_1 = Main.mFORMATO(mETC, "T")
				mTMP_STR_2 = Main.mFORMATO(mVE, "T")
				mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2
				mIE = Main.mFORMATO(mTMP_FLOAT.As(String), "N")
				TBL_Calcular.SetCellValue(x, 2, mIE)
			End If
			' CALCULO DEL INDICE LABORAL #Empleados por cada 1,000 tomas
			If TBL_Calcular.GetCellValue(x, 0) = "IL" Then
				mTMP_STR_1 = Main.mFORMATO(mTE, "T")
				mTMP_STR_2 = Main.mFORMATO(mTC, "T")
				mTMP_FLOAT = mTMP_STR_1 / (mTMP_STR_2 / 1000)
				mIL = Main.mFORMATO(mTMP_FLOAT.As(String), "N")
				TBL_Calcular.SetCellValue(x, 2, mIL)
			End If
			' CALCULO DE LA RAZON DE TRABAJO MODIFICADA RECAUDADO / GASTO
			If TBL_Calcular.GetCellValue(x, 0) = "RTM" Then
				mTMP_STR_1 = Main.mFORMATO(mGT, "T")
				mTMP_STR_2 = Main.mFORMATO(mTR, "T")
				mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2
				mRTM = Main.mFORMATO(mTMP_FLOAT.As(String), "N")
				TBL_Calcular.SetCellValue(x, 2, mRTM)
			End If
			' CALCULO DE LA VIABILIDAD FINANCIERA (%)
			If TBL_Calcular.GetCellValue(x, 0) = "VBF" Then
				mTMP_STR_1 = Main.mFORMATO(mRTM, "T")
				mTMP_FLOAT = (1 - mTMP_STR_1) * 100
				mVBF = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
				TBL_Calcular.SetCellValue(x, 2, mVBF)
			End If
			' CALCULO DEL COSTO DE PRODUCCION ($/M3) GASTO TOTAL / VOLUMEN EXPLOTADO
			If TBL_Calcular.GetCellValue(x, 0) = "CP" Then
				mTMP_STR_1 = Main.mFORMATO(mGT, "T")
				mTMP_STR_2 = Main.mFORMATO(mVE, "T")
				mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2
				mCP = Main.mFORMATO(mTMP_FLOAT.As(String), "N")
				TBL_Calcular.SetCellValue(x, 2, mCP)
			End If
			' CALCULO DEL COSTO DE PRODUCCION ($/M3) GASTO TOTAL / VOLUMEN EXPLOTADO
			If TBL_Calcular.GetCellValue(x, 0) = "CPC" Then
				mTMP_STR_1 = Main.mFORMATO(mVF, "T")
				mTMP_STR_2 = Main.mFORMATO(mPA, "T")
				mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2
				mCPC = Main.mFORMATO(mTMP_FLOAT.As(String), "N")
				TBL_Calcular.SetCellValue(x, 2, mCPC)
			End If
		Next
		' ELIMINAR VALORES Y DEJAR SOLO INDICADORES
		For x = 0 To mTOTAL_VALORES
			TBL_Calcular.RemoveRow(0)
		Next
		For x = 0 To TBL_Calcular.RowCount -1
			mTMP_STR_1 = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 2), "T")
			mTMP_STR_2 = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 3), "T")
			mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100
			mVALOR = Main.mFORMATO(mTMP_FLOAT.As(String), "P")
			TBL_Calcular.SetCellValue(x, 4, mVALOR)
			'
			mTMP_STR_1 = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 2), "T")
			mTMP_STR_2 = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 3), "T")
			mTMP_STR_3 = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 5), "T")
			If mTMP_STR_1 < mTMP_STR_3 Then
				TBL_Calcular.SetRowCustomize(x, xui.Color_RGB(0, 0, 255), xui.Color_RGB(255, 255, 0), xui.CreateDefaultFont(12))
			End If
			If mTMP_STR_1 > mTMP_STR_3 And mTMP_STR_1 < mTMP_STR_2 Then
				TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(0, 0, 255), xui.Color_RGB(70, 130, 180), xui.CreateDefaultFont(12))
			End If
			If mTMP_STR_1 >= mTMP_STR_2 Then
				TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(0, 0, 255), xui.Color_RGB(0, 255, 255), xui.CreateDefaultFont(12))
			End If			
		Next
	End If
	Return mRET
End Sub

Private Sub Calcular_Volumen_Explotado() As String
	Dim mRS As ResultSet
	Dim mTOTAL_EXPLOTADO, mEXPLOTADO As String

	mTOTAL_EXPLOTADO = 0
	Main.Conectar_Servidor
'	mSQL.Initialize2("net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE;"$, mADMINISTRADOR, mPASSWORD)
	If Main.mSQL.IsInitialized Then
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_extraido WHERE ext_anio = " & Main.Manio)
		Do While mRS.NextRow
			Select Case Main.mMES
				Case 1
					mEXPLOTADO = mRS.GetString("ext_ene")
				Case 2
					mEXPLOTADO = mRS.GetString("ext_feb")
				Case 3
					mEXPLOTADO = mRS.GetString("ext_mar")
				Case 4
					mEXPLOTADO = mRS.GetString("ext_abr")
				Case 5
					mEXPLOTADO = mRS.GetString("ext_may")
				Case 6
					mEXPLOTADO = mRS.GetString("ext_jun")
				Case 7
					mEXPLOTADO = mRS.GetString("ext_jul")
				Case 8
					mEXPLOTADO = mRS.GetString("ext_ago")
				Case 9
					mEXPLOTADO = mRS.GetString("ext_sep")
				Case 10
					mEXPLOTADO = mRS.GetString("ext_oct")
				Case 11
					mEXPLOTADO = mRS.GetString("ext_nov")
				Case 12
					mEXPLOTADO = mRS.GetString("ext_dic")
			End Select
			If mEXPLOTADO = "" Then
				mEXPLOTADO = "0"
			End If
			mTOTAL_EXPLOTADO = mTOTAL_EXPLOTADO + mEXPLOTADO
		Loop
		Main.mSQL.Close
	End If
	Return mTOTAL_EXPLOTADO
End Sub

Private Sub Calcular_Costo_Energia_Electrica() As String
	Dim mRS As ResultSet
	Dim mTOTAL_MONTO, mMONTO As String

	mTOTAL_MONTO = 0
	Main.Conectar_Servidor
'	mSQL.Initialize2("net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE;"$, mADMINISTRADOR, mPASSWORD)
	If Main.mSQL.IsInitialized Then
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_energia WHERE see_anio = " & Main.Manio)
		Do While mRS.NextRow
			Select Case Main.mMES
				Case 1
					mMONTO = mRS.GetString("see_mon_ene")
				Case 2
					mMONTO = mRS.GetString("see_mon_feb")
				Case 3
					mMONTO = mRS.GetString("see_mon_mar")
				Case 4
					mMONTO = mRS.GetString("see_mon_abr")
				Case 5
					mMONTO = mRS.GetString("see_mon_may")
				Case 6
					mMONTO = mRS.GetString("see_mon_jun")
				Case 7
					mMONTO = mRS.GetString("see_mon_jul")
				Case 8
					mMONTO = mRS.GetString("see_mon_ago")
				Case 9
					mMONTO = mRS.GetString("see_mon_sep")
				Case 10
					mMONTO = mRS.GetString("see_mon_oct")
				Case 11
					mMONTO = mRS.GetString("see_mon_nov")
				Case 12
					mMONTO = mRS.GetString("see_mon_dic")
			End Select
			If mMONTO = "" Then
				mMONTO = "0"
			End If
			mTOTAL_MONTO = mTOTAL_MONTO + mMONTO
		Loop
		Main.mSQL.Close
	End If
	Return mTOTAL_MONTO
End Sub

Private Sub Calcular_Energia_Total_Consumida() As String
	Dim mRS As ResultSet
	Dim mTOTAL_ENERGIA, mENERGIA As String

	mTOTAL_ENERGIA = 0
	Main.Conectar_Servidor
'	mSQL.Initialize2("net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE;"$, mADMINISTRADOR, mPASSWORD)
	If Main.mSQL.IsInitialized Then
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_energia WHERE see_anio = " & Main.Manio)
		Do While mRS.NextRow
			Select Case Main.mMES
				Case 1
					mENERGIA = mRS.GetString("see_kwh_ene")
				Case 2
					mENERGIA = mRS.GetString("see_kwh_feb")
				Case 3
					mENERGIA = mRS.GetString("see_kwh_mar")
				Case 4
					mENERGIA = mRS.GetString("see_kwh_abr")
				Case 5
					mENERGIA = mRS.GetString("see_kwh_may")
				Case 6
					mENERGIA = mRS.GetString("see_kwh_jun")
				Case 7
					mENERGIA = mRS.GetString("see_kwh_jul")
				Case 8
					mENERGIA = mRS.GetString("see_kwh_ago")
				Case 9
					mENERGIA = mRS.GetString("see_kwh_sep")
				Case 10
					mENERGIA = mRS.GetString("see_kwh_oct")
				Case 11
					mENERGIA = mRS.GetString("see_kwh_nov")
				Case 12
					mENERGIA = mRS.GetString("see_kwh_dic")
			End Select
			If mENERGIA = "" Then
				mENERGIA = "0"
			End If
			mTOTAL_ENERGIA = mTOTAL_ENERGIA + mENERGIA
		Loop
		Main.mSQL.Close
	End If
	Return mTOTAL_ENERGIA
End Sub


Private Sub B_Guardar_Click
	Dim x As Int
	Dim mCLAVE, mVALOR, mCUMPLE As String
	
	Main.Conectar_Servidor
'	mSQL.Initialize2("net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE;"$, mADMINISTRADOR, mPASSWORD)
	If Main.mSQL.IsInitialized Then
		For x = 0 To TBL_Calcular.RowCount -1
			mCLAVE = TBL_Calcular.GetCellValue(x, 0)
			mVALOR = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 2), "T")
			mCUMPLE = Main.mFORMATO(TBL_Calcular.GetCellValue(x, 4), "T")
			Select Case Main.mMES
				Case 1
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_ene = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_ene = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 2
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_feb = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_feb = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 3
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_mar = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_mar = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 4
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_abr = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_abr = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 5
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_may = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_may = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 6
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_jun = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_jun = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 7
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_jul = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_jul = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 8
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_ago = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_ago = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 9
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_sep = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_sep = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 10
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_oct = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_oct = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 11
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_nov = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_nov = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
				Case 12
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_dic = " & mVALOR & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
					Main.mSQL.ExecNonQuery("UPDATE sie_indicadores SET ind_c_dic = " & mCUMPLE & " WHERE ind_clave = '" & mCLAVE & "' AND ind_anio = " & Main.mANIO)
			End Select
			Log(mCLAVE  & " - " & mVALOR & " - " & mCUMPLE)
		Next
	End If
End Sub

Private Sub B_Regresar_Click
	If Main.mDERECHO = 99 Then
		B4XPages.ShowPageAndRemovePreviousPages("Menu")
	Else
		B4XPages.ClosePage(Me)
	End If
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

