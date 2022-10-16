package japam.SIE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import anywheresoftware.b4a.BA.Permissions;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_sql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.sd_sql");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.sd_sql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public Object _mcallback = null;
public String _mevent = "";
public Object _myconnection = null;
public String _mssql_string = "";
public String _mysql_string = "";
public String _postgresql_string = "";
public String _mariadb = "";
public String _oracledb = "";
public b4a.example.dateutils _dateutils = null;
public japam.SIE.main _main = null;
public japam.SIE.starter _starter = null;
public japam.SIE.b4xpages _b4xpages = null;
public japam.SIE.b4xcollections _b4xcollections = null;
public japam.SIE.xuiviewsutils _xuiviewsutils = null;
public japam.SIE.sd_resultset  _execquery(japam.SIE.sd_sql __ref,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "execquery", true))
	 {return ((japam.SIE.sd_resultset) Debug.delegate(ba, "execquery", new Object[] {_query}));}
anywheresoftware.b4j.object.JavaObject _j = null;
japam.SIE.sd_resultset _rs = null;
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Public Sub ExecQuery(Query As String) As SD_Result";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="Dim rs As SD_ResultSet";
_rs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="rs.Initialize(J.RunMethod(\"executequery\", Array(Q";
_rs._initialize /*String*/ (null,ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_j.RunMethod("executequery",new Object[]{(Object)(_query)}))));
RDebugUtils.currentLine=13107206;
 //BA.debugLineNum = 13107206;BA.debugLine="Return rs";
if (true) return _rs;
RDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="End Sub";
return null;
}
public String  _execnonquery(japam.SIE.sd_sql __ref,String _statement) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "execnonquery", true))
	 {return ((String) Debug.delegate(ba, "execnonquery", new Object[] {_statement}));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub ExecNonQuery (Statement As String)";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="J.RunMethod(\"execnonquery\", Array(Statement))";
_j.RunMethod("execnonquery",new Object[]{(Object)(_statement)});
RDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="End Sub";
return "";
}
public String  _close(japam.SIE.sd_sql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((String) Debug.delegate(ba, "close", null));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="J.RunMethod(\"close\", Null)";
_j.RunMethod("close",(Object[])(__c.Null));
RDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="End Sub";
return "";
}
public String  _initialize(japam.SIE.sd_sql __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _event,String _driverclass,String _jdbcurl,String _dbuser,String _dbpassword) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_event,_driverclass,_jdbcurl,_dbuser,_dbpassword}));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub Initialize(CallBack As Object, Event As";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="mCallBack=CallBack";
__ref._mcallback /*Object*/  = _callback;
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="mEvent=Event";
__ref._mevent /*String*/  = _event;
RDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="J.RunMethod(\"strictmode\",Null)";
_j.RunMethod("strictmode",(Object[])(__c.Null));
RDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="MyConnection = J.RunMethod(\"connect\", Array(Drive";
__ref._myconnection /*Object*/  = _j.RunMethod("connect",new Object[]{(Object)(_driverclass),(Object)(_jdbcurl),(Object)(_dbuser),(Object)(_dbpassword)});
RDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.sd_sql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Private mEvent As String";
_mevent = "";
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Public MyConnection As Object";
_myconnection = new Object();
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="Public const MsSql_String As String = \"net.source";
_mssql_string = "net.sourceforge.jtds.jdbc.Driver";
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="Public const MySql_String As String = \"com.mysql.";
_mysql_string = "com.mysql.jdbc.Driver";
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="Public const PostgreSql_String As String = \"org.p";
_postgresql_string = "org.postgresql.Driver";
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="Public const MariaDB As String = \"mariadb-java-cl";
_mariadb = "mariadb-java-client-2.4.2.jar";
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="Public const OracleDB As String = \"oracle.jdbc.dr";
_oracledb = "oracle.jdbc.driver.OracleDriver";
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="End Sub";
return "";
}
public Object  _execqueryresutset(japam.SIE.sd_sql __ref,String _query) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "execqueryresutset", true))
	 {return ((Object) Debug.delegate(ba, "execqueryresutset", new Object[] {_query}));}
anywheresoftware.b4j.object.JavaObject _j = null;
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub ExecQueryResutSet(Query As String) As O";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="Return J.RunMethod(\"executequery\", Array(Query))";
if (true) return _j.RunMethod("executequery",new Object[]{(Object)(_query)});
RDebugUtils.currentLine=13172740;
 //BA.debugLineNum = 13172740;BA.debugLine="End Sub";
return null;
}
public String  _sql_connected(japam.SIE.sd_sql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "sql_connected", true))
	 {return ((String) Debug.delegate(ba, "sql_connected", null));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="private Sub sql_connected";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="If SubExists(mCallBack,mEvent & \"_Ready\") Then Ca";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._mevent /*String*/ +"_Ready")) { 
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._mevent /*String*/ +"_Ready",(Object)(__c.True));};
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return "";
}
public String  _sql_notconnected(japam.SIE.sd_sql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_sql";
if (Debug.shouldDelegate(ba, "sql_notconnected", true))
	 {return ((String) Debug.delegate(ba, "sql_notconnected", null));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub sql_notconnected";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="If SubExists(mCallBack,mEvent & \"_Ready\") Then Ca";
if (__c.SubExists(ba,__ref._mcallback /*Object*/ ,__ref._mevent /*String*/ +"_Ready")) { 
__c.CallSubDelayed2(ba,__ref._mcallback /*Object*/ ,__ref._mevent /*String*/ +"_Ready",(Object)(__c.False));};
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return "";
}


@Permissions(values={"android.permission.ACCESS_NETWORK_STATE","android.permission.INTERNET"})

 static Connection conn;
 static PreparedStatement st;
 static ResultSet rs;

 public Connection connect(String driverclass, String conname, String user, String password) throws SQLException {
   //ba.raiseEvent(this,EventName.toLowerCase(),result);
   try {
      Class.forName(driverclass);
    } catch (ClassNotFoundException e) {
      BA.Log("Class not found: " + driverclass + " in #AdditionalJar");
	  ba.raiseEventFromUI(null, "sql_notconnected");
    } 
  
  try
        {
    	  //Class.forName(driverclass);
		  this.conn=DriverManager.getConnection(conname,user,password);
		  BA.Log("connected");
		  ba.raiseEventFromUI(null, "sql_connected");
        }
        catch(Exception e)
        {
           e.printStackTrace();
		   BA.Log("Not connected: " + e);
		   ba.raiseEventFromUI(null, "sql_notconnected");
        }
 return conn;
 }
 
 public ResultSet executequery(String query) {

  try
        {
            st=this.conn.prepareStatement(query);
            rs=st.executeQuery();
           
        }
        catch(Exception e)
        {
           e.printStackTrace();
		   BA.Log("Query Error: " + e);
		   System.out.println("Error query");
        }
 return rs;
 }
 
 public void execnonquery(String Statement) throws SQLException {
    if (this.conn == null) {
		BA.Log("Object should first be initialized."); 
    } else {
		Statement stmn = this.conn.createStatement();
		try {
      		stmn.execute(Statement);
			
    		} catch(Exception e) 
			{
      		 e.printStackTrace();
		   BA.Log("EQ Error: " + e);
		   System.out.println("Error execute");
    		} 
		st.close();
	}
    
  }
 
 public void close() {
 try
        {
  		this.rs.close();
        this.st.close();
        this.conn.close();
		 }
 catch(Exception e)
        {
           e.printStackTrace();
		   System.out.println("Errore di query");
        }
		
 }
 
	 public void strictmode() {
		android.os.StrictMode.ThreadPolicy policy = new android.os.StrictMode.ThreadPolicy.Builder().permitAll().build();
		android.os.StrictMode.setThreadPolicy(policy);
	 }
}