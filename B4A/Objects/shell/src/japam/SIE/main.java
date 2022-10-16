
package japam.SIE;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "japam.SIE.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _actionbarhomeclicked = RemoteObject.createImmutable(false);
public static RemoteObject _servidor = RemoteObject.createImmutable("");
public static RemoteObject _administrador = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _msql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _msql2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _mrs = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
public static RemoteObject _mrs2 = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.ResultSetWrapper");
public static RemoteObject _mssql = RemoteObject.declareNull("japam.SIE.sd_sql");
public static RemoteObject _musuarios = null;
public static RemoteObject _mclaves = null;
public static RemoteObject _mderechos = null;
public static RemoteObject _x = RemoteObject.createImmutable(0);
public static RemoteObject _mult_usuario = RemoteObject.createImmutable(0);
public static RemoteObject _musuario = RemoteObject.createImmutable("");
public static RemoteObject _mclave = RemoteObject.createImmutable("");
public static RemoteObject _mderecho = RemoteObject.createImmutable(0);
public static RemoteObject _manio = RemoteObject.createImmutable(0);
public static RemoteObject _mmes = RemoteObject.createImmutable(0);
public static RemoteObject _mult_extraido = RemoteObject.createImmutable(0);
public static RemoteObject _mult_datos = RemoteObject.createImmutable(0);
public static RemoteObject _mult_indicador = RemoteObject.createImmutable(0);
public static RemoteObject _mconexion = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static japam.SIE.starter _starter = null;
public static japam.SIE.b4xpages _b4xpages = null;
public static japam.SIE.b4xcollections _b4xcollections = null;
public static japam.SIE.xuiviewsutils _xuiviewsutils = null;
  public Object[] GetGlobals() {
		return new Object[] {"ActionBarHomeClicked",main._actionbarhomeclicked,"Activity",main.mostCurrent._activity,"ADMINISTRADOR",main._administrador,"B4XCollections",Debug.moduleToString(japam.SIE.b4xcollections.class),"B4XPages",Debug.moduleToString(japam.SIE.b4xpages.class),"DateUtils",main.mostCurrent._dateutils,"mANIO",main._manio,"mCLAVE",main._mclave,"mCLAVES",main._mclaves,"mCONEXION",main._mconexion,"mDERECHO",main._mderecho,"mDERECHOS",main._mderechos,"mMES",main._mmes,"mRS",main._mrs,"mRS2",main._mrs2,"mSQL",main._msql,"mSQL2",main._msql2,"MSSQL",main._mssql,"mULT_DATOS",main._mult_datos,"mULT_EXTRAIDO",main._mult_extraido,"mULT_INDICADOR",main._mult_indicador,"mULT_USUARIO",main._mult_usuario,"mUSUARIO",main._musuario,"mUSUARIOS",main._musuarios,"PASSWORD",main._password,"SERVIDOR",main._servidor,"Starter",Debug.moduleToString(japam.SIE.starter.class),"x",main._x,"XUIViewsUtils",Debug.moduleToString(japam.SIE.xuiviewsutils.class)};
}
}