B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	
'	Private CB_Anio As ComboBox
'	Private CB_Mes As ComboBox
	Private B_Regresar As Button
	Private B_Proceder As Button
	Private TBL_Indicadores As FlexGrid
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
	Root = Root1
	Dim x As Int

	Log("B4XIndicadores")
	Root = Root1
	Root.LoadLayout("Indicadores")
	TBL_Indicadores.ColsName=Array As String("Indicador", "Valor", "Meta", "Cumple al", "Mínimo", "Máximo")
	TBL_Indicadores.ColsWidth=Array As Int(300dip, 80dip, 80dip, 80dip, 80dip, 80dip)
	TBL_Indicadores.ColsType=Array As Int(TBL_Indicadores.TypeString, TBL_Indicadores.TypeString, TBL_Indicadores.TypeString, TBL_Indicadores.TypeString, TBL_Indicadores.TypeString, TBL_Indicadores.TypeString)
	TBL_Indicadores.ColsAlignment=Array As String("LEFT", "CENTER", "CENTER", "CENTER", "CENTER", "CENTER")
	TBL_Indicadores.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Indicadores.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Indicadores.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Indicadores.SetColCustomize(3, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Indicadores.SetColCustomize(4, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Indicadores.SetColCustomize(5, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
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
	Dim mINDICADORES(50), mVALORES(50), mMETAS(50) As String
	Dim mCUMPLIMIENTOS(50), mMINIMOS(50), mMAXIMOS(50) As String
	Dim mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMINIMO, mMAXIMO As String

	TBL_Indicadores.ClearRows
	If mSQL.IsInitialized Then
		Main.mCONEXION = True
		mRS = mSQL.ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = " & Main.mANIO)
		Main.mULT_INDICADOR = -1
		Do While mRS.NextRow
			Main.mULT_INDICADOR = Main.mULT_INDICADOR + 1
			mINDICADORES(Main.mULT_INDICADOR) = mRS.GetString("ind_descripcion")
			mMETAS(Main.mULT_INDICADOR) = mRS.GetString("ind_meta")
			mMINIMOS(Main.mULT_INDICADOR) = mRS.GetString("ind_minimo")
			mMAXIMOS(Main.mULT_INDICADOR) = mRS.GetString("ind_maximo")
			Select Case Main.mMES
				Case 1
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_ene")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_ene")
				Case 2
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_feb")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_feb")
				Case 3
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_mar")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_mar")
				Case 4
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_abr")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_abr")
				Case 5
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_may")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_may")
				Case 6
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_jun")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_jun")
				Case 7
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_jul")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_jul")
				Case 8
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_ago")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_ago")
				Case 9
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_sep")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_sep")
				Case 10
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_oct")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_oct")
				Case 11
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_nov")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_nov")
				Case 12
					mVALORES(Main.mULT_INDICADOR) = mRS.GetString("ind_dic")
					mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.GetString("ind_c_dic")
			End Select
		Loop
		For x = 0 To Main.mULT_INDICADOR
'			Log(mCLAVES(X) & " - " & mDESCRIPCIONES(X) & " - " & mEXTRAIDOS(X))
            mINDICADOR = mINDICADORES(x)
			If mINDICADOR.Contains("%") Then
				mVALOR = mFORMATO(mVALORES(x), "P")
				mMETA  = mFORMATO(mMETAS(x), "P")
				mMINIMO  = mFORMATO(mMINIMOS(x), "P")
				mMAXIMO = mFORMATO(mMAXIMOS(x), "P")
			Else
				mVALOR = mFORMATO(mVALORES(x), "N")
				mMETA  = mFORMATO(mMETAS(x), "N")
				mMINIMO  = mFORMATO(mMINIMOS(x), "N")
				mMAXIMO = mFORMATO(mMAXIMOS(x), "N")
			End If
			mCUMPLIMIENTO = mFORMATO(mCUMPLIMIENTOS(x), "P")
			TBL_Indicadores.AddRow(Array As Object(mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMINIMO, mMAXIMO), True)
		Next
		msql.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
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

