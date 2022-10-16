B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore

	Private TBL_Energia As FlexGrid
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
	Log("B4XEnergia")
	Root = Root1
	Root.LoadLayout("Energia")
	TBL_Energia.ColsName=Array As String("Servicio", "Equipo", "Gasto ($)", "Consumo (kWh)")
	TBL_Energia.ColsWidth=Array As Int(130dip, 230dip, 100dip, 120dip)
	TBL_Energia.ColsType=Array As Int(TBL_Energia.TypeString, TBL_Energia.TypeString, TBL_Energia.TypeString, TBL_Energia.TypeString)
	TBL_Energia.ColsAlignment=Array As String("CENTER", "LEFT", "RIGHT", "RIGHT")
	TBL_Energia.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Energia.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Energia.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Energia.SetColCustomize(3, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
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

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub SP_Anio_ItemClick (Position As Int, Value As Object)
	Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedIndex)
End Sub

Private Sub SP_Mes_ItemClick (Position As Int, Value As Object)
	Main.mMES =SP_Mes.GetItem(SP_Mes.SelectedIndex)
End Sub

Private Sub B_Proceder_MouseClick
	Conectar_Servidor
	Cargar_Valores
'	MSSQL.Initialize(Me,"MSSQL","net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${mSERVIDOR};DatabaseName=SIE"$, mADMINISTRADOR, mPASSWORD)
End Sub

'Connected to MS SQL Server
Sub Cargar_Valores ()
	Dim x As Int
	Dim mRS As SD_ResultSet
	Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mCONSUMOS(50) As String
	Dim mCADENA_1, mCADENA_2 As String

	TBL_Energia.ClearRows
	If mSQL.IsInitialized Then
		mRS = mSQL.ExecQuery("SELECT * FROM sie_energia WHERE see_anio = " & Main.mANIO)
		Main.mULT_EXTRAIDO = -1
		Do While mRS.NextRow
			Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1
			mSERVICIOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_servicio")
			mEQUIPOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_equipo")
			Select Case Main.mMES
				Case 1
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_ene")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_ene")
				Case 2
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_feb")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_feb")
				Case 3
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_mar")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_mar")
				Case 4
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_abr")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_abr")
				Case 5
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_may")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_may")
				Case 6
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_jun")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_jun")
				Case 7
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_jul")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_jul")
				Case 8
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_ago")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_ago")
				Case 9
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_sep")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_sep")
				Case 10
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_oct")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_oct")
				Case 11
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_nov")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_nov")
				Case 12
					mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_mon_dic")
					mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString("see_kwh_dic")
			End Select
		Loop
		For x = 0 To Main.mULT_EXTRAIDO
			mCADENA_1 = mFORMATO(mGASTOS(x).As(String), "M")
			mCADENA_2 = mFORMATO(mCONSUMOS(x).As(String), "N")
'			mCADENA = NumberFormat(mEXTRAIDOS(x).As(String), 2, 0)
			TBL_Energia.AddRow(Array As Object(mSERVICIOS(x), mEQUIPOS(x), mCADENA_1, mCADENA_2), True)
		Next
		mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
	End If
End Sub

Private Sub TBL_Energia_CellClick(Row As Int, Col As Int)
	Dim mVALOR As Int

	If Col >= 2 Then
		mVALOR = mFORMATO(TBL_Energia.GetCellValue(Row, Col), "T").As(Int)
		If mVALOR = 0 Or Main.mDERECHO = 99 Then
			TBL_Energia.EditCellonsite(Row, Col)
		End If
	End If
End Sub

Private Sub TBL_Energia_Modified(Row As Int, Col As Int)
	Dim mCADENA As String
	
	If Col = 2 Then
		mCADENA = mFORMATO(TBL_Energia.GetCellValue(Row, Col), "M")
	Else
		mCADENA = mFORMATO(TBL_Energia.GetCellValue(Row, Col), "N")
	End If
	TBL_Energia.SetCellValue(Row, Col, mCADENA)
End Sub

Private Sub B_Guardar_Click
	Dim x As Int
	Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mCONSUMOS(50) As String
	Dim mCOMPLETOS As Boolean
	
	mCOMPLETOS = True
	If mCOMPLETOS Then
		Conectar_Servidor
		If Main.mCONEXION  Then
			For x = 0 To Main.mULT_EXTRAIDO
				mSERVICIOS(x) = TBL_Energia.GetCellValue(x, 0)
				mEQUIPOS(x) = TBL_Energia.GetCellValue(x, 1)
				mGASTOS(x) = mFORMATO(TBL_Energia.GetCellValue(x, 2), "T")
				mCONSUMOS(x) = mFORMATO(TBL_Energia.GetCellValue(x, 3), "T")
				Select Case Main.mMES
					Case 1
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_ene = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_ene = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 2
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_feb = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_feb = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 3
						mSQL.ExecNonQuery("UPDATE sie__energia SET see_mon_mar = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_mar = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 4
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_abr = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_abr = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 5
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_may = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kww_may = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 6
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_jun = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_jun = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 7
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_jul = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_jul = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 8
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_ago = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_ago = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 9
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_sep = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_sep = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 10
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_oct = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_oct = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 11
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_nov = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_nov = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 12
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_dic = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						mSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_dic = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
				End Select
'Log(mSERVICIOS(x)  & " - " & mEQUIPOS(x) & " - " & mGASTOS(x) & " - " & mCONSUMOS(x))
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
