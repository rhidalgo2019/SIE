B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.3
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	
End Sub

Public Sub Conectar_Servidor()
	If Main.mTIPO_SQL = 1 Then
		Main.mSQL.Initialize2("com.mysql.jdbc.Driver", $"jdbc:mysql://${Main.SERVIDOR}/u567762233_SIE?useSSL=false"$,  Main.ADMINISTRADOR, Main.PASSWORD)
'		mSQL.Initialize2("net.sourceforge.jtds.jdbc.Driver", $"jdbc:sqlserver://${Main.SERVIDOR};DatabaseName=u567762233_SIE"$, Main.ADMINISTRADOR, Main.PASSWORD)
		'   "jdbc:sqlserver://localhost:1433;databaseName=AdventureWorks;user=MyUserName;password=*****;"
	Else
		Main.MSSQL.Initialize(Me,"MSSQL","net.sourceforge.jtds.jdbc.Driver", $"jdbc:jtds:sqlserver://${Main.SERVIDOR};DatabaseName=SIE;"$, Main.ADMINISTRADOR, Main.PASSWORD)
	End If
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.