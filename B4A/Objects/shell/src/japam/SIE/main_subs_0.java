package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_actionbarhomeclick() throws Exception{
try {
		Debug.PushSubsStack("Activity_ActionBarHomeClick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,72);
if (RapidSub.canDelegate("activity_actionbarhomeclick")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","activity_actionbarhomeclick");}
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_ActionBarHomeClick";
Debug.ShouldStop(128);
 BA.debugLineNum = 73;BA.debugLine="ActionBarHomeClicked = True";
Debug.ShouldStop(256);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 74;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
Debug.ShouldStop(512);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (japam.SIE.b4xpagesdelegator.class, "_activity_actionbarhomeclick" /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="ActionBarHomeClicked = False";
Debug.ShouldStop(1024);
main._actionbarhomeclicked = main.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,64);
if (RapidSub.canDelegate("activity_create")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _pm = RemoteObject.declareNull("japam.SIE.b4xpagesmanager");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 64;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 65;BA.debugLine="Dim pm As B4XPagesManager";
Debug.ShouldStop(1);
_pm = RemoteObject.createNew ("japam.SIE.b4xpagesmanager");Debug.locals.put("pm", _pm);
 BA.debugLineNum = 66;BA.debugLine="pm.Initialize(Activity)";
Debug.ShouldStop(2);
_pm.runClassMethod (japam.SIE.b4xpagesmanager.class, "_initialize" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._activity));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,78);
if (RapidSub.canDelegate("activity_keypress")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 78;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
Debug.ShouldStop(16384);
if (true) return main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (japam.SIE.b4xpagesdelegator.class, "_activity_keypress" /*RemoteObject*/ ,(Object)(_keycode));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,86);
if (RapidSub.canDelegate("activity_pause")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 86;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 87;BA.debugLine="B4XPages.Delegate.Activity_Pause";
Debug.ShouldStop(4194304);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (japam.SIE.b4xpagesdelegator.class, "_activity_pause" /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("Activity_PermissionResult (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,90);
if (RapidSub.canDelegate("activity_permissionresult")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","activity_permissionresult", _permission, _result);}
Debug.locals.put("Permission", _permission);
Debug.locals.put("Result", _result);
 BA.debugLineNum = 90;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 91;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
Debug.ShouldStop(67108864);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (japam.SIE.b4xpagesdelegator.class, "_activity_permissionresult" /*RemoteObject*/ ,(Object)(_permission),(Object)(_result));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,82);
if (RapidSub.canDelegate("activity_resume")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(131072);
 BA.debugLineNum = 83;BA.debugLine="B4XPages.Delegate.Activity_Resume";
Debug.ShouldStop(262144);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (japam.SIE.b4xpagesdelegator.class, "_activity_resume" /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _create_menu(RemoteObject _menu) throws Exception{
try {
		Debug.PushSubsStack("Create_Menu (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,94);
if (RapidSub.canDelegate("create_menu")) { return japam.SIE.main.remoteMe.runUserSub(false, "main","create_menu", _menu);}
Debug.locals.put("Menu", _menu);
 BA.debugLineNum = 94;BA.debugLine="Sub Create_Menu (Menu As Object)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 95;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
Debug.ShouldStop(1073741824);
main.mostCurrent._b4xpages._delegate /*RemoteObject*/ .runClassMethod (japam.SIE.b4xpagesdelegator.class, "_create_menu" /*RemoteObject*/ ,(Object)(_menu));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
b4xpages_subs_0._process_globals();
b4xcollections_subs_0._process_globals();
xuiviewsutils_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("japam.SIE.main");
b4xmainpage.myClass = BA.getDeviceClass ("japam.SIE.b4xmainpage");
b4xcalcular.myClass = BA.getDeviceClass ("japam.SIE.b4xcalcular");
b4xcomercial.myClass = BA.getDeviceClass ("japam.SIE.b4xcomercial");
b4xcontabilidad.myClass = BA.getDeviceClass ("japam.SIE.b4xcontabilidad");
b4xenergia.myClass = BA.getDeviceClass ("japam.SIE.b4xenergia");
b4xindicadores.myClass = BA.getDeviceClass ("japam.SIE.b4xindicadores");
b4xmenu.myClass = BA.getDeviceClass ("japam.SIE.b4xmenu");
b4xoperacion.myClass = BA.getDeviceClass ("japam.SIE.b4xoperacion");
b4xrh.myClass = BA.getDeviceClass ("japam.SIE.b4xrh");
starter.myClass = BA.getDeviceClass ("japam.SIE.starter");
b4xpages.myClass = BA.getDeviceClass ("japam.SIE.b4xpages");
b4xbitset.myClass = BA.getDeviceClass ("japam.SIE.b4xbitset");
b4xbytesbuilder.myClass = BA.getDeviceClass ("japam.SIE.b4xbytesbuilder");
b4xcollections.myClass = BA.getDeviceClass ("japam.SIE.b4xcollections");
b4xorderedmap.myClass = BA.getDeviceClass ("japam.SIE.b4xorderedmap");
b4xset.myClass = BA.getDeviceClass ("japam.SIE.b4xset");
b4xpagesdelegator.myClass = BA.getDeviceClass ("japam.SIE.b4xpagesdelegator");
b4xpagesmanager.myClass = BA.getDeviceClass ("japam.SIE.b4xpagesmanager");
b4xtable.myClass = BA.getDeviceClass ("japam.SIE.b4xtable");
b4xformatter.myClass = BA.getDeviceClass ("japam.SIE.b4xformatter");
sd_sql.myClass = BA.getDeviceClass ("japam.SIE.sd_sql");
sd_resultset.myClass = BA.getDeviceClass ("japam.SIE.sd_resultset");
animatedcounter.myClass = BA.getDeviceClass ("japam.SIE.animatedcounter");
anotherprogressbar.myClass = BA.getDeviceClass ("japam.SIE.anotherprogressbar");
b4xbreadcrumb.myClass = BA.getDeviceClass ("japam.SIE.b4xbreadcrumb");
b4xcolortemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xcolortemplate");
b4xcombobox.myClass = BA.getDeviceClass ("japam.SIE.b4xcombobox");
b4xdatetemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xdatetemplate");
b4xdialog.myClass = BA.getDeviceClass ("japam.SIE.b4xdialog");
b4xfloattextfield.myClass = BA.getDeviceClass ("japam.SIE.b4xfloattextfield");
b4ximageview.myClass = BA.getDeviceClass ("japam.SIE.b4ximageview");
b4xinputtemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xinputtemplate");
b4xlisttemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xlisttemplate");
b4xloadingindicator.myClass = BA.getDeviceClass ("japam.SIE.b4xloadingindicator");
b4xlongtexttemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xlongtexttemplate");
b4xplusminus.myClass = BA.getDeviceClass ("japam.SIE.b4xplusminus");
b4xradiobutton.myClass = BA.getDeviceClass ("japam.SIE.b4xradiobutton");
b4xsearchtemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xsearchtemplate");
b4xseekbar.myClass = BA.getDeviceClass ("japam.SIE.b4xseekbar");
b4xsignaturetemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xsignaturetemplate");
b4xswitch.myClass = BA.getDeviceClass ("japam.SIE.b4xswitch");
b4xtimedtemplate.myClass = BA.getDeviceClass ("japam.SIE.b4xtimedtemplate");
madewithlove.myClass = BA.getDeviceClass ("japam.SIE.madewithlove");
roundslider.myClass = BA.getDeviceClass ("japam.SIE.roundslider");
scrollinglabel.myClass = BA.getDeviceClass ("japam.SIE.scrollinglabel");
swiftbutton.myClass = BA.getDeviceClass ("japam.SIE.swiftbutton");
xuiviewsutils.myClass = BA.getDeviceClass ("japam.SIE.xuiviewsutils");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 26;BA.debugLine="Public ActionBarHomeClicked As Boolean";
main._actionbarhomeclicked = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 28;BA.debugLine="Public SERVIDOR As String = \"auth-db430.hostinger";
main._servidor = BA.ObjectToString("auth-db430.hostinger.com");
 //BA.debugLineNum = 29;BA.debugLine="Public ADMINISTRADOR As String = \"u567762233_admi";
main._administrador = BA.ObjectToString("u567762233_admin");
 //BA.debugLineNum = 30;BA.debugLine="Public PASSWORD As String = \"Admin2022\"";
main._password = BA.ObjectToString("Admin2022");
 //BA.debugLineNum = 31;BA.debugLine="Public mSQL, mSQL2 As SQL";
main._msql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
main._msql2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 32;BA.debugLine="Public mRS, mRS2 As ResultSet";
main._mrs = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
main._mrs2 = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Public MSSQL As SD_SQL";
main._mssql = RemoteObject.createNew ("japam.SIE.sd_sql");
 //BA.debugLineNum = 45;BA.debugLine="Public mUSUARIOS(50) As String";
main._musuarios = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});
 //BA.debugLineNum = 46;BA.debugLine="Public mCLAVES(50) As String";
main._mclaves = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});
 //BA.debugLineNum = 47;BA.debugLine="Public mDERECHOS(50) As Int";
main._mderechos = RemoteObject.createNewArray ("int", new int[] {50}, new Object[]{});
 //BA.debugLineNum = 48;BA.debugLine="Public x, mULT_USUARIO As Int";
main._x = RemoteObject.createImmutable(0);
main._mult_usuario = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 50;BA.debugLine="Public mUSUARIO, mCLAVE As String";
main._musuario = RemoteObject.createImmutable("");
main._mclave = RemoteObject.createImmutable("");
 //BA.debugLineNum = 51;BA.debugLine="Public mDERECHO As Int";
main._mderecho = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 52;BA.debugLine="Public mANIO, mMES As Int";
main._manio = RemoteObject.createImmutable(0);
main._mmes = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 54;BA.debugLine="Public mULT_EXTRAIDO As Int";
main._mult_extraido = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 55;BA.debugLine="Public mULT_DATOS As Int";
main._mult_datos = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 56;BA.debugLine="Public mULT_INDICADOR As Int";
main._mult_indicador = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 57;BA.debugLine="Public mCONEXION As Boolean";
main._mconexion = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}