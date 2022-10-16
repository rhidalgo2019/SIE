
package japam.SIE;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xenergia {
    public static RemoteObject myClass;
	public b4xenergia() {
	}
    public static PCBA staticBA = new PCBA(null, b4xenergia.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _root = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tbl_energia = RemoteObject.declareNull("b4j.example.flexgrid");
public static RemoteObject _b_proceder = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _b_regresar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _b_guardar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _sp_anio = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _sp_mes = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _msql = RemoteObject.declareNull("japam.SIE.sd_sql");
public static RemoteObject _mrs = RemoteObject.declareNull("japam.SIE.sd_resultset");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static japam.SIE.main _main = null;
public static japam.SIE.starter _starter = null;
public static japam.SIE.b4xpages _b4xpages = null;
public static japam.SIE.b4xcollections _b4xcollections = null;
public static japam.SIE.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"B_Guardar",_ref.getField(false, "_b_guardar"),"B_Proceder",_ref.getField(false, "_b_proceder"),"B_Regresar",_ref.getField(false, "_b_regresar"),"DateUtils",_ref.getField(false, "_dateutils"),"mRS",_ref.getField(false, "_mrs"),"mSQL",_ref.getField(false, "_msql"),"Root",_ref.getField(false, "_root"),"SP_Anio",_ref.getField(false, "_sp_anio"),"SP_Mes",_ref.getField(false, "_sp_mes"),"TBL_Energia",_ref.getField(false, "_tbl_energia"),"xui",_ref.getField(false, "_xui")};
}
}