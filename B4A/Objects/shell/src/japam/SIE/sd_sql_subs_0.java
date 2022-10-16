package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sd_sql_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object";
sd_sql._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",sd_sql._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Private mEvent As String";
sd_sql._mevent = RemoteObject.createImmutable("");__ref.setField("_mevent",sd_sql._mevent);
 //BA.debugLineNum = 6;BA.debugLine="Public MyConnection As Object";
sd_sql._myconnection = RemoteObject.createNew ("Object");__ref.setField("_myconnection",sd_sql._myconnection);
 //BA.debugLineNum = 8;BA.debugLine="Public const MsSql_String As String = \"net.source";
sd_sql._mssql_string = BA.ObjectToString("net.sourceforge.jtds.jdbc.Driver");__ref.setField("_mssql_string",sd_sql._mssql_string);
 //BA.debugLineNum = 9;BA.debugLine="Public const MySql_String As String = \"com.mysql.";
sd_sql._mysql_string = BA.ObjectToString("com.mysql.jdbc.Driver");__ref.setField("_mysql_string",sd_sql._mysql_string);
 //BA.debugLineNum = 10;BA.debugLine="Public const PostgreSql_String As String = \"org.p";
sd_sql._postgresql_string = BA.ObjectToString("org.postgresql.Driver");__ref.setField("_postgresql_string",sd_sql._postgresql_string);
 //BA.debugLineNum = 11;BA.debugLine="Public const MariaDB As String = \"mariadb-java-cl";
sd_sql._mariadb = BA.ObjectToString("mariadb-java-client-2.4.2.jar");__ref.setField("_mariadb",sd_sql._mariadb);
 //BA.debugLineNum = 12;BA.debugLine="Public const OracleDB As String = \"oracle.jdbc.dr";
sd_sql._oracledb = BA.ObjectToString("oracle.jdbc.driver.OracleDriver");__ref.setField("_oracledb",sd_sql._oracledb);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "sd_sql","close", __ref);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 56;BA.debugLine="Public Sub Close";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="Dim J As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("J", _j);
 BA.debugLineNum = 59;BA.debugLine="J.RunMethod(\"close\", Null)";
Debug.JustUpdateDeviceLine();
_j.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("close")),(Object)((sd_sql.__c.getField(false,"Null"))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _execnonquery(RemoteObject __ref,RemoteObject _statement) throws Exception{
try {
		Debug.PushSubsStack("ExecNonQuery (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("execnonquery")) { return __ref.runUserSub(false, "sd_sql","execnonquery", __ref, _statement);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Statement", _statement);
 BA.debugLineNum = 50;BA.debugLine="Public Sub ExecNonQuery (Statement As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Dim J As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("J", _j);
 BA.debugLineNum = 53;BA.debugLine="J.RunMethod(\"execnonquery\", Array(Statement))";
Debug.JustUpdateDeviceLine();
_j.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("execnonquery")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_statement)})));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _execquery(RemoteObject __ref,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("ExecQuery (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("execquery")) { return __ref.runUserSub(false, "sd_sql","execquery", __ref, _query);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _rs = RemoteObject.declareNull("japam.SIE.sd_resultset");
Debug.locals.put("Query", _query);
 BA.debugLineNum = 35;BA.debugLine="Public Sub ExecQuery(Query As String) As SD_Result";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="Dim J As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("J", _j);
 BA.debugLineNum = 39;BA.debugLine="Dim rs As SD_ResultSet";
Debug.JustUpdateDeviceLine();
_rs = RemoteObject.createNew ("japam.SIE.sd_resultset");Debug.locals.put("rs", _rs);
 BA.debugLineNum = 40;BA.debugLine="rs.Initialize(J.RunMethod(\"executequery\", Array(Q";
Debug.JustUpdateDeviceLine();
_rs.runClassMethod (japam.SIE.sd_resultset.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), _j.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("executequery")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_query)})))));
 BA.debugLineNum = 41;BA.debugLine="Return rs";
Debug.JustUpdateDeviceLine();
if (true) return _rs;
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _execqueryresutset(RemoteObject __ref,RemoteObject _query) throws Exception{
try {
		Debug.PushSubsStack("ExecQueryResutSet (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("execqueryresutset")) { return __ref.runUserSub(false, "sd_sql","execqueryresutset", __ref, _query);}
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("Query", _query);
 BA.debugLineNum = 44;BA.debugLine="Public Sub ExecQueryResutSet(Query As String) As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim J As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("J", _j);
 BA.debugLineNum = 47;BA.debugLine="Return J.RunMethod(\"executequery\", Array(Query))";
Debug.JustUpdateDeviceLine();
if (true) return _j.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("executequery")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_query)})));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _event,RemoteObject _driverclass,RemoteObject _jdbcurl,RemoteObject _dbuser,RemoteObject _dbpassword) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sd_sql","initialize", __ref, _ba, _callback, _event, _driverclass, _jdbcurl, _dbuser, _dbpassword);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _j = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("ba", _ba);
Debug.locals.put("CallBack", _callback);
Debug.locals.put("Event", _event);
Debug.locals.put("DriverClass", _driverclass);
Debug.locals.put("JDBCurl", _jdbcurl);
Debug.locals.put("DBUser", _dbuser);
Debug.locals.put("DBPassword", _dbpassword);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(CallBack As Object, Event As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="mCallBack=CallBack";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 24;BA.debugLine="mEvent=Event";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mevent" /*RemoteObject*/ ,_event);
 BA.debugLineNum = 26;BA.debugLine="Dim J As JavaObject = Me";
Debug.JustUpdateDeviceLine();
_j = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_j = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref);Debug.locals.put("J", _j);
 BA.debugLineNum = 29;BA.debugLine="J.RunMethod(\"strictmode\",Null)";
Debug.JustUpdateDeviceLine();
_j.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("strictmode")),(Object)((sd_sql.__c.getField(false,"Null"))));
 BA.debugLineNum = 31;BA.debugLine="MyConnection = J.RunMethod(\"connect\", Array(Drive";
Debug.JustUpdateDeviceLine();
__ref.setField ("_myconnection" /*RemoteObject*/ ,_j.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("connect")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_driverclass),(_jdbcurl),(_dbuser),(_dbpassword)}))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sql_connected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sql_connected (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("sql_connected")) { return __ref.runUserSub(false, "sd_sql","sql_connected", __ref);}
 BA.debugLineNum = 62;BA.debugLine="private Sub sql_connected";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="If SubExists(mCallBack,mEvent & \"_Ready\") Then Ca";
Debug.JustUpdateDeviceLine();
if (sd_sql.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_mevent" /*RemoteObject*/ ),RemoteObject.createImmutable("_Ready")))).<Boolean>get().booleanValue()) { 
sd_sql.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_mevent" /*RemoteObject*/ ),RemoteObject.createImmutable("_Ready"))),(Object)((sd_sql.__c.getField(true,"True"))));};
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sql_notconnected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("sql_notconnected (sd_sql) ","sd_sql",21,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("sql_notconnected")) { return __ref.runUserSub(false, "sd_sql","sql_notconnected", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Private Sub sql_notconnected";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="If SubExists(mCallBack,mEvent & \"_Ready\") Then Ca";
Debug.JustUpdateDeviceLine();
if (sd_sql.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_mevent" /*RemoteObject*/ ),RemoteObject.createImmutable("_Ready")))).<Boolean>get().booleanValue()) { 
sd_sql.__c.runVoidMethod ("CallSubDelayed2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_mevent" /*RemoteObject*/ ),RemoteObject.createImmutable("_Ready"))),(Object)((sd_sql.__c.getField(true,"False"))));};
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}