B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore

	Private TBL_Pozos As FlexGrid
	Private CB_Anio As B4XComboBox
	Private CB_Mes As B4XComboBox
	Private B_Proceder As Button
	Private B_Regresar As Button
	Private B_Guardar As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Dim x As Int

	Log("B4XOperacion")
	Root = Root1
	Root.LoadLayout("Operacion")
	TBL_Pozos.ClearRows
	TBL_Pozos.ColsName=Array As String("Pozo", "Denominación", "Extraido")
	TBL_Pozos.ColsWidth=Array As Int(130dip, 530dip, 130dip)
	TBL_Pozos.ColsType=Array As Int(TBL_Pozos.TypeString, TBL_Pozos.TypeString, TBL_Pozos.TypeString)
	TBL_Pozos.ColsAlignment=Array As String("CENTER", "CENTER", "CENTER")
	TBL_Pozos.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Pozos.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Pozos.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	CB_Anio.cmbBox.Items.Clear
	For x = 2021 To 2027
       CB_Anio.cmbBox.Items.Add(x)
	Next
	CB_Mes.cmbBox.Items.Clear
	For x = 1 To 12
		CB_Mes.cmbBox.Items.Add(x)
	Next
	B_Guardar.Visible = False
End Sub

Private Sub CB_Anio_SelectedIndexChanged (Index As Int)
	Main.mANIO = CB_Anio.cmbBox.Value
End Sub

Private Sub CB_Mes_SelectedIndexChanged (Index As Int)
	Main.mMES = CB_Mes.cmbBox.Value
End Sub

Private Sub B_Proceder_MouseClicked (EventData As MouseEvent)
	Main.Conectar_Servidor
	Cargar_Valores
'	MSSQL.Initialize(Me,"MSSQL","net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE"$, mADMINISTRADOR, mPASSWORD)
End Sub

'Connected to MS SQL Server
Sub Cargar_Valores()
	Dim x As Int
	Dim mRS As ResultSet
	Dim mCLAVES(50), mDESCRIPCIONES(50) As String
	Dim mEXTRAIDOS(50) As String
	Dim mCADENA As String

    
	TBL_Pozos.ClearRows
	If Main.mSQL.IsInitialized Then
		Main.mCONEXION = True
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_extraido WHERE ext_anio = " & Main.mANIO)
		Main.mULT_EXTRAIDO = -1
		Do While mRS.NextRow
			Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1
			mCLAVES(Main.mULT_EXTRAIDO) = mRS.GetString("ext_clave")
			mDESCRIPCIONES(Main.mULT_EXTRAIDO) = mRS.GetString("ext_descripcion")
			Select Case Main.mMES
				Case 1
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_ene")
				Case 2
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_feb")
				Case 3
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_mar")
				Case 4
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_abr")
				Case 5
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_may")
				Case 6
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_jun")
				Case 7
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_jul")
				Case 8
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_ago")
				Case 9
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_sep")
				Case 10
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_oct")
				Case 11
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_nov")
				Case 12
					mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetString("ext_dic")
			End Select
			If mEXTRAIDOS(Main.mULT_EXTRAIDO) = "" Then
				mEXTRAIDOS(Main.mULT_EXTRAIDO) = "0"
			End If
		Loop
		For x = 0 To Main.mULT_EXTRAIDO
'			Log(mCLAVES(X) & " - " & mDESCRIPCIONES(X) & " - " & mEXTRAIDOS(X))
			mCADENA = Main.mFORMATO(mEXTRAIDOS(x).As(String), "N")
'			mCADENA = NumberFormat(mEXTRAIDOS(x).As(String), 2, 0)
			TBL_Pozos.AddRow(Array As Object(mCLAVES(x), mDESCRIPCIONES(x), mCADENA), True)
		Next
		Main.mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
		B_Guardar.Visible = False
	End If
	B_Guardar.Visible = True
End Sub

Private Sub TBL_Pozos_CellClick(Row As Int, Col As Int)
	Dim mVALOR As Int

	If Col = 2 Then
		mVALOR = Main.mFORMATO(TBL_Pozos.GetCellValue(Row, Col), "T").As(Int)
		If mVALOR = 0 Or Main.mDERECHO = 99 Then
			TBL_Pozos.EditCellonsite(Row, Col)
		End If
	End If
End Sub


Private Sub TBL_Pozos_Modified(Row As Int, Col As Int)
	Dim mCADENA As String
	
	mCADENA = NumberFormat(TBL_Pozos.GetCellValue(Row, Col), 2, 0)
	TBL_Pozos.SetCellValue(Row, Col, mCADENA)
End Sub

Private Sub B_Guardar_Click
	Dim x As Int
	Dim mCLAVES(50), mDESCRIPCIONES(50) As String
	Dim mEXTRAIDOS(50) As String
	Dim mCOMPLETOS As Boolean
	
	Main.Conectar_Servidor
	mCOMPLETOS = True
'	For x = 0 To Main.mULT_EXTRAIDO
'		mEXTRAIDOS(x) = Main.mFORMATO(TBL_Pozos.GetCellValue(x, 2), "T")
'		If mEXTRAIDOS(x) = "" Then
'			mCOMPLETOS = False
'			Exit
'		End If
'	Next
'****     BORRAR *************************
	mCOMPLETOS = True
	'*****************************************
	Log("Guardando")
	mCOMPLETOS = True
	If mCOMPLETOS Then
		Main.Conectar_Servidor
		If Main.mSQL.IsInitialized Then
			For x = 0 To Main.mULT_EXTRAIDO
				mCLAVES(x) = TBL_Pozos.GetCellValue(x, 0)
				mDESCRIPCIONES(x) = TBL_Pozos.GetCellValue(x, 1)
				mEXTRAIDOS(x) = Main.mFORMATO(TBL_Pozos.GetCellValue(x, 2), "T")
				Select Case Main.mMES
					Case 1
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_ene = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 2
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_feb = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 3
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_mar = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 4
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_abr = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 5
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_may = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 6
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_jun = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 7
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_jul = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 8
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_ago = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 9
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_sep = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 10
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_oct = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 11
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_nov = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 12
						Main.mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_dic = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
				End Select
			Next
		End If
		Main.mSQL.Close
	Else
		xui.MsgboxAsync("Faltan valores por capturar, favor de completar la captura", "Alerta")
	End If
	B_Guardar.Visible = False
End Sub

Private Sub B_Regresar_Click
	If Main.mDERECHO = 99 Then
		B4XPages.ShowPageAndRemovePreviousPages("Menu")
	Else
		B4XPages.ClosePage(Me)
	End If
End Sub