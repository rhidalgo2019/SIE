B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
	Private CB_Anio As ComboBox
	Private CB_Mes As ComboBox
	Private B_Proceder As Button
	Private TBL_RH As FlexGrid
	Private B_Guardar As Button
	Private B_Regresar As Button
	Private TBL_RH As FlexGrid
	Public mSQL As SD_SQL
	Private Activity As Activity
	Public mRS As SD_ResultSet
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Dim x As Int
	
	Log("B4XRH")
	Root = Root1
	Root.LoadLayout("RH")
	TBL_RH.ColsName=Array As String("Dato", "Valor")
	TBL_RH.ColsWidth=Array As Int(220dip, 150dip)
	TBL_RH.ColsType=Array As Int(TBL_RH.TypeString, TBL_RH.TypeString)
	TBL_RH.ColsAlignment=Array As String("CENTER", "CENTER")
	TBL_RH.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_RH.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_RH.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	CB_Anio.Items.Clear
	For x = 2021 To 2027
		CB_Anio.Items.Add(x)
	Next
	For x = 1 To 12
		CB_Mes.Items.Add(x)
	Next
End Sub

Private Sub CB_Anio_SelectedIndexChanged (Index As Int)
	Main.mANIO = CB_Anio.Value
End Sub

Private Sub CB_Mes_SelectedIndexChanged (Index As Int)
	Main.mMES = CB_Mes.Value
End Sub

Private Sub B_Proceder_MouseClicked (EventData As MouseEvent)
	Conectar_Servidor
	Cargar_Valores
'	MSSQL.Initialize(Me,"MSSQL","net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE"$, mADMINISTRADOR, mPASSWORD)
End Sub

'Connected to MS SQL Server
Sub Cargar_Valores()
	Dim x As Int
	Dim mRS As SD_ResultSet
	Dim mDATOS(50) As String
	Dim mVALORES(50) As String
	Dim mCADENA As String
	Dim ANIO, MES As Int

	ANIO = Main.mANIO
	MES = Main.mMES
	TBL_RH.ClearRows
	If mSQL.IsInitialized Then
		mRS = mSQL.ExecQuery("SELECT * FROM sie_valores WHERE val_derecho = 5 AND val_anio = " & ANIO)
		Main.mULT_DATOS = -1
		Do While mRS.NextRow
			Main.mULT_DATOS = Main.mULT_DATOS + 1
			mDATOS(Main.mULT_DATOS) = mRS.GetString("val_descripcion")
			Select Case MES
				Case 1
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_ene")
				Case 2
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_feb")
				Case 3
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_mar")
				Case 4
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_abr")
				Case 5
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_may")
				Case 6
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_jun")
				Case 7
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_jul")
				Case 8
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_ago")
				Case 9
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_sep")
				Case 10
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_oct")
				Case 11
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_nov")
				Case 12
					mVALORES(Main.mULT_DATOS) = mRS.GetString("val_dic")
			End Select
		Loop
		For x = 0 To Main.mULT_DATOS
			If x < 1 Then
				mCADENA = mFORMATO(mVALORES(x).As(String), "T")
			Else
				mCADENA = mFORMATO(mVALORES(x).As(String), "N")
			End If
'Log(mDATOS(x) & " - " & mVALORES(x) & " - " & mCADENA)
			TBL_RH.AddRow(Array As Object(mDATOS(x), mCADENA), True)
		Next
		mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
	End If
End Sub

Private Sub TBL_RH_CellClick(Row As Int, Col As Int)
	Dim mVALOR As Int

	If Col >= 1 Then
		mVALOR = mFORMATO(TBL_RH.GetCellValue(Row, Col), "T").As(Int)
		If mVALOR = 0 Or Main.mDERECHO = 99 Then
			TBL_RH.EditCellonsite(Row, Col)
		End If
	End If
End Sub

Private Sub TBL_RH_Modified(Row As Int, Col As Int)
	Dim mCADENA As String
	
	If Row < 2 Then
		mCADENA = mFORMATO(TBL_RH.GetCellValue(Row, Col), "M")
	Else
		mCADENA = mFORMATO(TBL_RH.GetCellValue(Row, Col), "N")
	End If
	TBL_RH.SetCellValue(Row, Col, mCADENA)
End Sub

Private Sub B_Guardar_Click
	Dim x As Int
	Dim mDATOS(50), mEXTRAIDOS(50) As String
	Dim mCOMPLETOS As Boolean
	Dim ANIO As Int

	ANIO = Main.mANIO
	mCOMPLETOS = True
	For x = 0 To Main.mULT_DATOS
		mDATOS(x) = TBL_RH.GetCellValue(x, 0)
		mEXTRAIDOS(x) = mFORMATO(TBL_RH.GetCellValue(x, 1), "T")
		If mEXTRAIDOS(x) = 0 Then
			mCOMPLETOS = False
			Exit
		End If
	Next
'****     BORRAR *************************
	mCOMPLETOS = True
'*****************************************
	If mCOMPLETOS Then
		If mSQL.IsInitialized Then
			For x = 0 To Main.mULT_DATOS
				mDATOS(x) = TBL_RH.GetCellValue(x, 0)
				mEXTRAIDOS(x) = mFORMATO(TBL_RH.GetCellValue(x, 1), "T")
				Select Case Main.mMES
					Case 1
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_ene = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 2
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_feb = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 3
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_mar = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 4
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_abr = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 5
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_may = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 6
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_jun = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 7
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_jul = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 8
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_ago = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 9
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_sep = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 10
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_oct = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 11
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_nov = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 12
						mSQL.ExecNonQuery("UPDATE dbo.sie_valores SET val_dic = '" & mEXTRAIDOS(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
				End Select
'Log(mDATOS(x)  & " - " & " - " & mEXTRAIDOS(x) & " - " & mRESPUESTA_QUERY)
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

