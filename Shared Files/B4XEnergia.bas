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
	CB_Anio.cmbBox.Items.Clear
	For x = 2021 To 2027
		CB_Anio.cmbBox.Items.Add(x)
	Next
	For x = 1 To 12
		CB_Mes.cmbBox.Items.Add(x)
	Next
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

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
Sub Cargar_Valores ()
	Dim x As Int
	Dim mRS As ResultSet
	Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mCONSUMOS(50) As String
	Dim mCADENA_1, mCADENA_2 As String

	TBL_Energia.ClearRows
	If Main.mSQL.IsInitialized Then
		Main.mCONEXION = True
		mRS = Main.mSQL.ExecQuery("SELECT * FROM sie_energia WHERE see_anio = " & Main.mANIO)
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
			mCADENA_1 = Main.mFORMATO(mGASTOS(x).As(String), "M")
			mCADENA_2 = Main.mFORMATO(mCONSUMOS(x).As(String), "N")
'			mCADENA = NumberFormat(mEXTRAIDOS(x).As(String), 2, 0)
			TBL_Energia.AddRow(Array As Object(mSERVICIOS(x), mEQUIPOS(x), mCADENA_1, mCADENA_2), True)
		Next
		Main.mSQL.Close
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
	End If
End Sub

Private Sub TBL_Energia_CellClick(Row As Int, Col As Int)
	Dim mVALOR As Int

	If Col >= 2 Then
		mVALOR = Main.mFORMATO(TBL_Energia.GetCellValue(Row, Col), "T").As(Int)
		If mVALOR = 0 Or Main.mDERECHO = 99 Then
			TBL_Energia.EditCellonsite(Row, Col)
		End If
	End If
End Sub

Private Sub TBL_Energia_Modified(Row As Int, Col As Int)
	Dim mCADENA As String
	
	If Col = 2 Then
		mCADENA = Main.mFORMATO(TBL_Energia.GetCellValue(Row, Col), "M")
	Else
		mCADENA = Main.mFORMATO(TBL_Energia.GetCellValue(Row, Col), "N")
	End If
	TBL_Energia.SetCellValue(Row, Col, mCADENA)
End Sub

Private Sub B_Guardar_Click
	Dim x As Int
	Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mCONSUMOS(50) As String
	Dim mCOMPLETOS As Boolean
	
	mCOMPLETOS = True
	If mCOMPLETOS Then
		Main.Conectar_Servidor
		If Main.mCONEXION  Then
			For x = 0 To Main.mULT_EXTRAIDO
				mSERVICIOS(x) = TBL_Energia.GetCellValue(x, 0)
				mEQUIPOS(x) = TBL_Energia.GetCellValue(x, 1)
				mGASTOS(x) = Main.mFORMATO(TBL_Energia.GetCellValue(x, 2), "T")
				mCONSUMOS(x) = Main.mFORMATO(TBL_Energia.GetCellValue(x, 3), "T")
				Select Case Main.mMES
					Case 1
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_ene = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_ene = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 2
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_feb = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_feb = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 3
						Main.MSQL.ExecNonQuery("UPDATE sie__energia SET see_mon_mar = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_mar = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 4
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_abr = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_abr = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 5
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_may = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kww_may = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 6
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_jun = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_jun = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 7
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_jul = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_jul = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 8
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_ago = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_ago = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 9
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_sep = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_sep = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 10
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_oct = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_oct = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 11
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_nov = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_nov = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
					Case 12
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_mon_dic = " & mGASTOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
						Main.MSQL.ExecNonQuery("UPDATE sie_energia SET see_kwh_dic = " & mCONSUMOS(x) & " WHERE see_servicio = '" & mSERVICIOS(x) & "' AND see_anio = " & Main.mANIO)
				End Select
'Log(mSERVICIOS(x)  & " - " & mEQUIPOS(x) & " - " & mGASTOS(x) & " - " & mCONSUMOS(x))
			Next
		End If
		Main.mSQL.Close
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