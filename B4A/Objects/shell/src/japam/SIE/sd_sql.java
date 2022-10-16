
package japam.SIE;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class sd_sql {
    public static RemoteObject myClass;
	public sd_sql() {
	}
    public static PCBA staticBA = new PCBA(null, sd_sql.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mevent = RemoteObject.createImmutable("");
public static RemoteObject _myconnection = RemoteObject.declareNull("Object");
public static RemoteObject _mssql_string = RemoteObject.createImmutable("");
public static RemoteObject _mysql_string = RemoteObject.createImmutable("");
public static RemoteObject _postgresql_string = RemoteObject.createImmutable("");
public static RemoteObject _mariadb = RemoteObject.createImmutable("");
public static RemoteObject _oracledb = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static japam.SIE.main _main = null;
public static japam.SIE.starter _starter = null;
public static japam.SIE.b4xpages _b4xpages = null;
public static japam.SIE.b4xcollections _b4xcollections = null;
public static japam.SIE.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"MariaDB",_ref.getField(false, "_mariadb"),"mCallBack",_ref.getField(false, "_mcallback"),"mEvent",_ref.getField(false, "_mevent"),"MsSql_String",_ref.getField(false, "_mssql_string"),"MyConnection",_ref.getField(false, "_myconnection"),"MySql_String",_ref.getField(false, "_mysql_string"),"OracleDB",_ref.getField(false, "_oracledb"),"PostgreSql_String",_ref.getField(false, "_postgresql_string")};
}
}