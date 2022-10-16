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
	Private B_Proceder As Button
	Private TBL_Comercial As FlexGrid
	Private B_Guardar As Button
	Private B_Regresar As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Dim x As Int
	
	Log("B4XComercial")
	Root = Root1
	Root.LoadLayout("Comercial")
	TBL_Comercial.ColsName=Array As String("Concepto", "Valor")
	TBL_Comercial.ColsWidth=Array As Int(630dip, 160dip)
	TBL_Comercial.ColsType=Array As Int(TBL_Comercial.TypeString, TBL_Comercial.TypeString)
	TBL_Comercial.ColsAlignment=Array As String("CENTER", "CENTER")
	TBL_Comercial.SetColCustomize(0, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Comercial.SetColCustomize(1, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	TBL_Comercial.SetColCustomize(2, xui.Color_RGB(0, 0, 255), xui.Color_RGB(224, 255, 255), xui.CreateDefaultFont(14))
	CB_Anio.cmbBox.Items.Clear
	For x = 2021 To 2027
		CB_Anio.cmbBox.Items.Add(x)
	Next
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
End Sub

Sub Cargar_Valores()
	Dim x As Int
	Dim RS As ResultSet
	Dim mDATOS(50) As String
	Dim mVALORES(50) As String
	Dim mCADENA As String
	Dim ANIO, MES As Int

	ANIO = Main.mANIO
	MES = Main.mMES
	TBL_Comercial.ClearRows
	If Main.mSQL.IsInitialized Then
		Main.mCONEXION = True
Log (ANIO)
		RS = Main.MSQL.ExecQuery("SELECT * FROM sie_valores WHERE val_derecho = 1 AND val_anio = " & ANIO)
		Main.mULT_DATOS = -1
		Do While RS.NextRow
			Main.mULT_DATOS = Main.mULT_DATOS + 1
			mDATOS(Main.mULT_DATOS) = RS.GetString("val_descripcion")
			Select Case MES
				Case 1
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_ene")
				Case 2
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_feb")
				Case 3
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_mar")
				Case 4
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_abr")
				Case 5
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_may")
				Case 6
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_jun")
				Case 7
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_jul")
				Case 8
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_ago")
				Case 9
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_sep")
				Case 10
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_oct")
				Case 11
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_nov")
				Case 12
					mVALORES(Main.mULT_DATOS) = RS.GetString("val_dic")
			End Select
			If mVALORES(Main.mULT_DATOS) = "" Then
				mVALORES(Main.mULT_DATOS) = "0"
			End If
		Loop
		For x = 0 To Main.mULT_DATOS
			If x < 2 Then
				mCADENA = Main.mFORMATO(mVALORES(x).As(String), "M")
			Else
				mCADENA = Main.mFORMATO(mVALORES(x).As(String), "N")
			End If
			'Log(mDATOS(x) & " - " & mVALORES(x) & " - " & mCADENA)
			TBL_Comercial.AddRow(Array As Object(mDATOS(x), mCADENA), True)
		Next
	Else
		Log("---------- SIE Database (MSSQL)  Fallo de conexion ----------")
		B_Guardar.Visible = False
	End If
	B_Guardar.Visible = True
End Sub

Private Sub TBL_Comercial_CellClick(Row As Int, Col As Int)
	Dim mVALOR As Int
	
	If Col = 1 Then
		mVALOR = Main.mFORMATO(TBL_Comercial.GetCellValue(Row, Col), "T").As(Int)
		If mVALOR = 0 Or Main.mDERECHO = 99 Then
			TBL_Comercial.EditCellonsite(Row, Col)
		End If
	End If
End Sub

Private Sub TBL_Comercial_Modified(Row As Int, Col As Int)
	Dim mCADENA As String
	
	If Row < 2 Then
		mCADENA = Main.mFORMATO(TBL_Comercial.GetCellValue(Row, Col), "M")
	Else
		mCADENA = Main.mFORMATO(TBL_Comercial.GetCellValue(Row, Col), "N")
	End If
	TBL_Comercial.SetCellValue(Row, Col, mCADENA)
End Sub

Private Sub B_Guardar_Click
	Dim x As Int
	Dim mDATOS(50), mVALORES(50) As String
	Dim mCOMPLETOS As Boolean
	Dim ANIO As Int

	ANIO = Main.mANIO
	mCOMPLETOS = True
	For x = 0 To Main.mULT_DATOS
		mDATOS(x) = TBL_Comercial.GetCellValue(x, 0)
		mVALORES(x) = Main.mFORMATO(TBL_Comercial.GetCellValue(x, 1), "T")
		If mVALORES(x) = 0 Then
			mCOMPLETOS = False
			Exit
		End If
	Next
'****     BORRAR *************************
	mCOMPLETOS = True
'*****************************************
	If mCOMPLETOS Then
		If Main.mCONEXION  Then
			For x = 0 To Main.mULT_DATOS
				mDATOS(x) = TBL_Comercial.GetCellValue(x, 0)
				mVALORES(x) = Main.mFORMATO(TBL_Comercial.GetCellValue(x, 1), "T")
				Select Case Main.mMES
					Case 1
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_ene = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 2
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_feb = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 3
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_mar = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 4
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_abr = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 5
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_may = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 6
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_jun = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 7
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_jul = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 8
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_ago = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 9
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_sep = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 10
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_oct = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 11
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_nov = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
					Case 12
						Main.MSQL.ExecNonQuery("UPDATE sie_valores SET val_dic = '" & mVALORES(x) & "' WHERE val_anio = " & ANIO & " AND val_descripcion = '" & mDATOS(x) & "'")
				End Select
'Log(mDATOS(x)  & " - " & " - " & mEXTRAIDOS(x) & " - " & mRESPUESTA_QUERY)
			Next
		End If
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
