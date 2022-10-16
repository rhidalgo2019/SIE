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
	Private B_Proceder As Button
	Private B_Regresar As Button
	Private B_Guardar As Button
	Private SP_Anio As Spinner
	Private SP_Mes As Spinner
	Public mSQL As SD_SQL
	Public mRS As SD_ResultSet
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
	TBL_Pozos.ColsWidth=Array As Int(80dip, 202dip, 80dip)
	TBL_Pozos.ColsType=Array As Int(TBL_Pozos.TypeString, TBL_Pozos.TypeString, TBL_Pozos.TypeString)
	TBL_Pozos.ColsAlignment=Array As String("CENTER", "LEFT", "CENTER")
	TBL_Pozos.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Pozos.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Pozos.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
'	CB_Anio.Items.Clear
	For x = 2021 To 2027
'		CB_Anio.Items.Add(x)
		SP_Anio.add(x)
	Next
'	CB_Mes.Items.Clear
	For x = 1 To 12
'		CB_Mes.Items.Add(x)
		SP_Mes.Add(x)
	Next
End Sub

Private Sub SP_Anio_ItemClick (Position As Int, Value As Object)
	Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedIndex)
End Sub

Private Sub SP_Mes_ItemClick (Position As Int, Value As Object)
	Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)
End Sub

Private Sub B_Proceder_MouseClick
	Conectar_Servidor
	Cargar_Valores
'	MSSQL.Initialize(Me,"MSSQL","net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE"$, mADMINISTRADOR, mPASSWORD)
End Sub

'Connected to MS SQL Server
Sub Cargar_Valores()
	Dim x As Int
	Dim mRS As SD_ResultSet
	Dim mCLAVES(50), mDESCRIPCIONES(50) As String
	Dim mEXTRAIDOS(50) As Int
	Dim mCADENA As String

    TBL_Pozos.ClearRows
	If mSQL.IsInitialized Then
		mRS = mSQL.ExecQuery("SELECT * FROM sie_extraido WHERE ext_anio = " & Main.mANIO)
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
		Loop
		For x = 0 To Main.mULT_EXTRAIDO
'			Log(mCLAVES(X) & " - " & mDESCRIPCIONES(X) & " - " & mEXTRAIDOS(X))
			mCADENA = mFORMATO(mEXTRAIDOS(x).As(String), "N")
'			mCADENA = NumberFormat(mEXTRAIDOS(x).As(String), 2, 0)
			TBL_Pozos.AddRow(Array As Object(mCLAVES(x), mDESCRIPCIONES(x), mCADENA), True)
		Next
		mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
	End If
End Sub

Private Sub TBL_Pozos_CellClick(Row As Int, Col As Int)
	Dim mVALOR As Int

	If Col = 2 Then
		mVALOR = mFORMATO(TBL_Pozos.GetCellValue(Row, Col), "T").As(Int)
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
	Dim mEXTRAIDOS(50) As Int
	Dim mCOMPLETOS As Boolean
	
	mCOMPLETOS = True
	For x = 0 To Main.mULT_EXTRAIDO
		mEXTRAIDOS(x) = mFORMATO(TBL_Pozos.GetCellValue(x, 1), "T")
		If mEXTRAIDOS(x) = 0 Then
			mCOMPLETOS = False
			Exit
		End If
	Next
'****     BORRAR *************************
	mCOMPLETOS = True
'*****************************************
	If mCOMPLETOS Then
		If mSQL.IsInitialized  Then
			For x = 0 To Main.mULT_EXTRAIDO
				mCLAVES(x) = TBL_Pozos.GetCellValue(x, 0)
				mDESCRIPCIONES(x) = TBL_Pozos.GetCellValue(x, 1)
				mEXTRAIDOS(x) = mFORMATO(TBL_Pozos.GetCellValue(x, 2), "T")
				Select Case Main.mMES
					Case 1
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_ene = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 2
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_feb = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 3
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_mar = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 4
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_abr = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 5
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_may = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 6
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_jun = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 7
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_jul = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 8
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_ago = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 9
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_sep = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 10
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_oct = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 11
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_nov = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
					Case 12
						mSQL.ExecNonQuery("UPDATE sie_extraido SET ext_dic = " & mEXTRAIDOS(x) & " WHERE ext_clave = '" & mCLAVES(x) & "' AND ext_anio = " & Main.mANIO)
				End Select
'Log(mCLAVES(x)  & " - " & mDESCRIPCIONES(x) & " - " & mEXTRAIDOS(x) & " - " & mRESPUESTA_QUERY)
			Next
		End If
		mSQL.Close
	Else
		xui.MsgboxAsync("Faltan valores por capturar, favor de completar la captura", "Alerta")
	End If	
End Sub

Private Sub B_Regresar_Click
	If Main.mDERECHO = 99 Then
		B4XPages.ShowPageAndRemovePreviousPages("Menu")
	Else
		B4XPages.ClosePage(Me)
	End If
End Sub

Public Sub Conectar_Servidor()
	mSQL.Initialize(Me,"MYSQL", "com.mysql.jdbc.Driver", $"jdbc:mysql://${Main.SERVIDOR}/u567762233_SIE?useSSL=false"$, Main.ADMINISTRADOR, Main.PASSWORD)
End Sub
'
Public Sub mFORMATO(Valor As String, Formato As String) As Object
	' Valor = Valor al cual se quiere dar formato
	' Formato =  'T' - Formato de texto simple
	'            'N' - Formato numérico, con separarión de miles y decimales
	'            'M' - Formato Monetario, con dos decimales
	'            'P' - Formato de porcentaje
	'
	Dim mRET As String
	Dim mVALOR As String
	Dim mENTEROS, mDECIMALES As String
	Dim mLARGO, mPOS_DECIMAL As Int
	Dim mMONEDA, mPORCENTAJE As String
	Dim mINI_DECIMAL, mFIN_DECIMAL As Int
	
	mRET = ""
	Formato = Formato.ToUpperCase
	If Formato = "N" Or Formato = "M" Or Formato = "P" Then
		mRET = Valor
		mRET = mRET.Replace("$", "")
		mRET = mRET.Trim
		mLARGO = mRET.Length
		mPOS_DECIMAL = mRET.LastIndexOf(".")
		mENTEROS = ""
		mDECIMALES = ""
		If Formato = "M" Then
			mMONEDA = "$"
		Else
			mMONEDA = ""
		End If
		If Formato = "P" Then
			mPORCENTAJE = "%"
		Else
			mPORCENTAJE = ""
		End If
		If mPOS_DECIMAL = 0 Then
			mENTEROS = ""
			mDECIMALES = mRET
			mRET = mMONEDA & "0" & mDECIMALES & " " & mPORCENTAJE
		Else
			If mPOS_DECIMAL = -1 Then
				mENTEROS = mRET
				mDECIMALES = "00"
			Else
				mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)
				mINI_DECIMAL = mPOS_DECIMAL + 1
				If mINI_DECIMAL > mLARGO Then
					mINI_DECIMAL = mLARGO
				End If
				mFIN_DECIMAL= mPOS_DECIMAL + 3
				If mFIN_DECIMAL > mLARGO Then
					mFIN_DECIMAL = mLARGO
				End If
				mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFIN_DECIMAL)
			End If
			If mDECIMALES.Length = 0 Then
				mDECIMALES = "00"
			End If
			mLARGO = mENTEROS.Length
			If mLARGO >= 1 And mLARGO <= 3 Then
				mRET = mMONEDA & mRET.SubString2(0, mLARGO) & "." & mDECIMALES & mPORCENTAJE
			End If
			If mLARGO >= 4 And mLARGO <= 6 Then
				mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3) & "," & mRET.SubString2(mLARGO - 3, mLARGO) & "." & mDECIMALES & mPORCENTAJE
			End If
			If mLARGO >= 7 And mLARGO <= 9 Then
				mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6) & "'" & mRET.SubString2(mLARGO - 6, mLARGO -3) & "," & mRET.SubString2(mLARGO - 3, mLARGO) & "." & mDECIMALES & mPORCENTAJE
			End If
		End If
	End If
	If Formato = "T" Then
		mVALOR = Valor
		mVALOR = mVALOR.Replace("'", "")
		mVALOR = mVALOR.Replace(",", "")
		mVALOR = mVALOR.Replace("$", "")
		mVALOR = mVALOR.Replace("%", "")
		mVALOR = mVALOR.Trim
		mRET = mVALOR
	End If
	mRET = mRET.Trim
	Return mRET
End Sub

