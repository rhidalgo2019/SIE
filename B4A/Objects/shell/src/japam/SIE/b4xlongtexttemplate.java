
package japam.SIE;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4xlongtexttemplate {
    public static RemoteObject myClass;
	public b4xlongtexttemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4xlongtexttemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4a.example3.customlistview");
public static RemoteObject _text = RemoteObject.declareNull("Object");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static japam.SIE.main _main = null;
public static japam.SIE.starter _starter = null;
public static japam.SIE.b4xpages _b4xpages = null;
public static japam.SIE.b4xcollections _b4xcollections = null;
public static japam.SIE.xuiviewsutils _xuiviewsutils = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"Text",_ref.getField(false, "_text"),"xui",_ref.getField(false, "_xui")};
}
}