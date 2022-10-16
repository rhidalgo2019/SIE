B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private B_Usuario As Button
	Private B_Comercial As Button
	Private B_Operacion As Button
	Private B_Mantenimiento As Button
	Private B_Contabilidad As Button
	Private B_RH As Button
	Private B_indicadores As Button
	Private B_Calcular As Button
	Private Activity As Activity
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("Menu")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub B_Comercial_Click
	B4XPages.ShowPageAndRemovePreviousPages("Comercial")
End Sub

Private Sub L_Comercial_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("Comercial")
End Sub

Private Sub B_Operacion_Click
	B4XPages.ShowPageAndRemovePreviousPages("Operacion")	
End Sub

Private Sub L_Operacion_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("Operacion")
End Sub

Private Sub B_Mantenimiento_Click
	B4XPages.ShowPageAndRemovePreviousPages("Energia")
End Sub

Private Sub L_Mantenimiento_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("Energia")	
End Sub

Private Sub B_Contabilidad_Click
	B4XPages.ShowPageAndRemovePreviousPages("Contabilidad")
End Sub

Private Sub L_Contabilidad_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("Contabilidad")	
End Sub

Private Sub B_RH_Click
	B4XPages.ShowPageAndRemovePreviousPages("RH")
End Sub

Private Sub L_RH_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("RH")
End Sub

Private Sub B_Usuario_Click
	
End Sub

Private Sub L_Usuarios_MouseClicked (EventData As MouseEvent)
	
End Sub

Private Sub B_indicadores_Click
	B4XPages.ShowPageAndRemovePreviousPages("Indicadores")
End Sub

Private Sub L_Indicadores_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("Indicadores")
End Sub

Private Sub B_Calcular_Click
	B4XPages.ShowPageAndRemovePreviousPages("Calcular")
End Sub

Private Sub L_Calcular_MouseClicked (EventData As MouseEvent)
	B4XPages.ShowPageAndRemovePreviousPages("Calcular")
End Sub

Private Sub B_Regresar_Click
	
End Sub