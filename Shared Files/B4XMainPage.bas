B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private B_Ingresar As Button
	Private TXT_Clave As B4XFloatTextField
	Private TXT_Usuario As B4XFloatTextField
	Private xui As XUI
'	Public Menu As B4XMenu
'	Public Operacion As B4XOperacion
'	Public Comercial As B4XComercial
'	Public Energia As B4XEnergia
'	Public Contabilidad As B4XContabilidad
'	Public RH As B4XRH
'	Public Indicadores As B4XIndicadores
'	Public Calcular As B4XCalcular
	Public x As Int
	Public mSQL As SD_SQL
	Private Activity As Activity
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
'	Menu.Initialize
'	B4XPages.AddPage("Menu", Menu)
'	Operacion.Initialize
'	B4XPages.AddPage("Operacion", Operacion)
'	Comercial.Initialize
'	B4XPages.AddPage("Comercial", Comercial)
'	Energia.Initialize
'	B4XPages.AddPage("Energia", Energia)
'	Contabilidad.Initialize
'	B4XPages.AddPage("Contabilidad", Contabilidad)
'	RH.Initialize
'	B4XPages.AddPage("RH", RH)
'	Indicadores.Initialize
'	B4XPages.AddPage("Indicadores", Indicadores)
'	Calcular.Initialize
'	B4XPages.AddPage("Calcular", Calcular)
	TXT_Usuario.RequestFocusAndShowKeyboard
End Sub

Private Sub TXT_Usuario_FocusChanged (HasFocus As Boolean)
	If HasFocus = False Then
		Main.mUSUARIO = TXT_Usuario.Text		
	End If
End Sub

Private Sub TXT_Clave_FocusChanged (HasFocus As Boolean)
	If HasFocus = False Then
		Main.mCLAVE = TXT_Clave.Text
	End If
End Sub

Private Sub TXT_Usuario_EnterPressed
	Main.mUSUARIO = TXT_Usuario.Text
	B_Ingresar_Click
End Sub

Private Sub TXT_Clave_EnterPressed
	Main.mCLAVE = TXT_Clave.Text
	B_Ingresar_Click
End Sub

Private Sub B_Ingresar_Click
	If Main.mUSUARIO.Length <> 0 Then
		If Main.mCLAVE.Length <> 0 Then
         Verificar_Ingreso
      Else
		 xui.MsgboxAsync("Favor de indicar la clave de acceso", "Alerta")
      End If
   Else
      xui.MsgboxAsync("Favor de indicar el nombre del usuario", "Alerta")
   End If
End Sub

Public Sub Conectar_Servidor()
   mSQL.Initialize(Me,"MYSQL", "com.mysql.jdbc.Driver", $"jdbc:mysql://${Main.SERVIDOR}/u567762233_SIE?useSSL=false"$, Main.ADMINISTRADOR, Main.PASSWORD)
End Sub

Sub Verificar_Ingreso()
	Log("---------- SIE (" & Main.SERVIDOR & ") ----------")
	Conectar_Servidor
'	Conectar_Servidor
	If Main.mTIPO_SQL = 1 Then
		Leer_Usuarios
		Verificar_Usuario
	End If
End Sub

Public Sub Leer_Usuarios()
	Dim mRS As SD_ResultSet

	If mSQL.IsInitialized Then
		mRS = mSQL.ExecQuery("SELECT usu_nombre FROM sie_usuarios")
		Main.mULT_USUARIO = -1
		Do While mRS.NextRow
			Main.mULT_USUARIO = Main.mULT_USUARIO + 1
			Main.mUSUARIOS(Main.mULT_USUARIO) = mRS.GetString("usu_nombre")
		Loop
		Main.mULT_USUARIO = -1
		mRS = mSQL.ExecQuery("SELECT usu_clave FROM sie_usuarios")
		Do While mRS.NextRow
			Main.mULT_USUARIO = Main.mULT_USUARIO + 1
			Main.mCLAVES(Main.mULT_USUARIO) = mRS.GetString("usu_clave")
		Loop
		Main.mULT_USUARIO = -1
		mRS = mSQL.ExecQuery("SELECT usu_derecho FROM sie_usuarios")
		Do While mRS.NextRow
			Main.mULT_USUARIO = Main.mULT_USUARIO + 1
			Main.mDERECHOS(Main.mULT_USUARIO) = mRS.GetInt("usu_derecho")
		Loop
		mRS.Close
	End If
End Sub

Sub Verificar_Usuario()
	Dim x As Int
	Dim mEXISTE As Boolean
	
	For x = 0 To Main.mULT_USUARIO
		If Main.mUSUARIO = Main.mUSUARIOS(x) Then
			mEXISTE = True
			If Main.mCLAVE = Main.mCLAVES(x) Then
				Main.mDERECHO = Main.mDERECHOS(x)
				Select Case Main.mDERECHO
					Case 1
'						B4XPages.ShowPageAndRemovePreviousPages("Comercial")
					Case 2
'						B4XPages.ShowPageAndRemovePreviousPages("Operacion")
					Case 3
'						B4XPages.ShowPageAndRemovePreviousPages("Energia")
					Case 4
'						B4XPages.ShowPageAndRemovePreviousPages("Contabilidad")
					Case 5
'						B4XPages.ShowPageAndRemovePreviousPages("RH")
					Case 10
					Case 11
					Case 12
					Case 13
					Case 99
						B4XPages.ShowPageAndRemovePreviousPages("Menu")
				End Select
				Log("Usuario/Clave correctos")
			Else
				xui.MsgboxAsync("La CLAVE es incorrecta", "Precaución")
			End If
		End If
	Next
	If mEXISTE = False Then
		xui.MsgboxAsync("El USUARIO no existe", "Precaución")
	End If
End Sub
