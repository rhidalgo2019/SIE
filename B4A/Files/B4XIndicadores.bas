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
	Private B_Regresar As Button
	Private B_Proceder As Button
	Private TBL_Indicadores As FlexGrid
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
	CB_Anio.cmbBox.Items.Clear
	For x = 2021 To 2027
		CB_Anio.cmbBox.Items.Add(x)
	Next
	For x = 1 To 12
		CB_Mes.cmbBox.Items.Add(x)
	Next
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
	Dim mINDICADORES(50), mVALORES(50), mMETAS(50) As String
	Dim mCUMPLIMIENTOS(50), mMINIMOS(50), mMAXIMOS(50) As String
	Dim mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMINIMO, mMAXIMO As String

	TBL_Indicadores.ClearRows
	If Main.mSQL.IsInitialized Then
		Main.mCONEXION = True
		mRS = Main.MSQL.ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = " & Main.mANIO)
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
				mVALOR = Main.mFORMATO(mVALORES(x), "P")
				mMETA  = Main.mFORMATO(mMETAS(x), "P")
				mMINIMO  = Main.mFORMATO(mMINIMOS(x), "P")
				mMAXIMO = Main.mFORMATO(mMAXIMOS(x), "P")
			Else
				mVALOR = Main.mFORMATO(mVALORES(x), "N")
				mMETA  = Main.mFORMATO(mMETAS(x), "N")
				mMINIMO  = Main.mFORMATO(mMINIMOS(x), "N")
				mMAXIMO = Main.mFORMATO(mMAXIMOS(x), "N")
			End If
			mCUMPLIMIENTO = Main.mFORMATO(mCUMPLIMIENTOS(x), "P")
			TBL_Indicadores.AddRow(Array As Object(mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMINIMO, mMAXIMO), True)
		Next
		Main.msql.Close
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
