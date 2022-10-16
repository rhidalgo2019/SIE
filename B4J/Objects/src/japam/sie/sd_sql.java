package japam.sie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import anywheresoftware.b4a.BA.Permissions;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class sd_sql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.sd_sql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.sd_sql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
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
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
 //BA.debugLineNum = 5;BA.debugLine="Private mEvent As String";
_mevent = "";
 //BA.debugLineNum = 6;BA.debugLine="Public MyConnection As Object";
_myconnection = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Public const MsSql_String As String = \"net.source";
_mssql_string = "net.sourceforge.jtds.jdbc.Driver";
 //BA.debugLineNum = 9;BA.debugLine="Public const MySql_String As String = \"com.mysql.";
_mysql_string = "com.mysql.jdbc.Driver";
 //BA.debugLineNum = 10;BA.debugLine="Public const PostgreSql_String As String = \"org.p";
_postgresql_string = "org.postgresql.Driver";
 //BA.debugLineNum = 11;BA.debugLine="Public const MariaDB As String = \"mariadb-java-cl";
_mariadb = "mariadb-java-client-2.4.2.jar";
 //BA.debugLineNum = 12;BA.debugLine="Public const OracleDB As String = \"oracle.jdbc.dr";
_oracledb = "oracle.jdbc.driver.OracleDriver";
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
anywheresoftware.b4j.object.JavaObject _j = null;
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 57;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 59;BA.debugLine="J.RunMethod(\"close\", Null)";
_j.RunMethod("close",(Object[])(__c.Null));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _execnonquery(String _statement) throws Exception{
anywheresoftware.b4j.object.JavaObject _j = null;
 //BA.debugLineNum = 50;BA.debugLine="Public Sub ExecNonQuery (Statement As String)";
 //BA.debugLineNum = 51;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 53;BA.debugLine="J.RunMethod(\"execnonquery\", Array(Statement))";
_j.RunMethod("execnonquery",new Object[]{(Object)(_statement)});
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public japam.sie.sd_resultset  _execquery(String _query) throws Exception{
anywheresoftware.b4j.object.JavaObject _j = null;
japam.sie.sd_resultset _rs = null;
 //BA.debugLineNum = 35;BA.debugLine="Public Sub ExecQuery(Query As String) As SD_Result";
 //BA.debugLineNum = 36;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 39;BA.debugLine="Dim rs As SD_ResultSet";
_rs = new japam.sie.sd_resultset();
 //BA.debugLineNum = 40;BA.debugLine="rs.Initialize(J.RunMethod(\"executequery\", Array(Q";
_rs._initialize /*String*/ (ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_j.RunMethod("executequery",new Object[]{(Object)(_query)}))));
 //BA.debugLineNum = 41;BA.debugLine="Return rs";
if (true) return _rs;
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public Object  _execqueryresutset(String _query) throws Exception{
anywheresoftware.b4j.object.JavaObject _j = null;
 //BA.debugLineNum = 44;BA.debugLine="Public Sub ExecQueryResutSet(Query As String) As O";
 //BA.debugLineNum = 45;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 47;BA.debugLine="Return J.RunMethod(\"executequery\", Array(Query))";
if (true) return _j.RunMethod("executequery",new Object[]{(Object)(_query)});
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _event,String _driverclass,String _jdbcurl,String _dbuser,String _dbpassword) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _j = null;
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(CallBack As Object, Event As";
 //BA.debugLineNum = 23;BA.debugLine="mCallBack=CallBack";
_mcallback = _callback;
 //BA.debugLineNum = 24;BA.debugLine="mEvent=Event";
_mevent = _event;
 //BA.debugLineNum = 26;BA.debugLine="Dim J As JavaObject = Me";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 31;BA.debugLine="MyConnection = J.RunMethod(\"connect\", Array(Drive";
_myconnection = _j.RunMethod("connect",new Object[]{(Object)(_driverclass),(Object)(_jdbcurl),(Object)(_dbuser),(Object)(_dbpassword)});
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _sql_connected() throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="private Sub sql_connected";
 //BA.debugLineNum = 63;BA.debugLine="If SubExists(mCallBack,mEvent & \"_Ready\") Then Ca";
if (__c.SubExists(ba,_mcallback,_mevent+"_Ready")) { 
__c.CallSubDelayed2(ba,_mcallback,_mevent+"_Ready",(Object)(__c.True));};
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _sql_notconnected() throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Private Sub sql_notconnected";
 //BA.debugLineNum = 67;BA.debugLine="If SubExists(mCallBack,mEvent & \"_Ready\") Then Ca";
if (__c.SubExists(ba,_mcallback,_mevent+"_Ready")) { 
__c.CallSubDelayed2(ba,_mcallback,_mevent+"_Ready",(Object)(__c.False));};
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
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
 
}
