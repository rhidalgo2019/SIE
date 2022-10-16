package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class sd_resultset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.sd_resultset", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.sd_resultset.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _nativers = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private NativeRS As JavaObject";
_nativers = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 11;BA.debugLine="NativeRS.RunMethod(\"close\",Null)";
_nativers.RunMethod("close",(Object[])(__c.Null));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public boolean  _first() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Public Sub first As Boolean";
 //BA.debugLineNum = 19;BA.debugLine="Return NativeRS.RunMethod(\"first\",Null)";
if (true) return BA.ObjectToBoolean(_nativers.RunMethod("first",(Object[])(__c.Null)));
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return false;
}
public byte[]  _getbytes(String _columnname) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub GetBytes(ColumnName As String) As Byte(";
 //BA.debugLineNum = 103;BA.debugLine="Return NativeRS.RunMethod(\"getBytes\",Array As Obj";
if (true) return (byte[])(_nativers.RunMethod("getBytes",new Object[]{(Object)(_columnname)}));
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public byte[]  _getbytes2(int _index) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Public Sub GetBytes2(index As Int) As Byte()";
 //BA.debugLineNum = 108;BA.debugLine="Return NativeRS.RunMethod(\"getBytes\",Array As Obj";
if (true) return (byte[])(_nativers.RunMethod("getBytes",new Object[]{(Object)(_index+1)}));
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public int  _getcolumncount() throws Exception{
anywheresoftware.b4j.object.JavaObject _metadata = null;
 //BA.debugLineNum = 48;BA.debugLine="Public Sub getColumnCount As Int";
 //BA.debugLineNum = 49;BA.debugLine="Dim Metadata As JavaObject = NativeRS.RunMethod(\"";
_metadata = new anywheresoftware.b4j.object.JavaObject();
_metadata = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nativers.RunMethod("getMetaData",(Object[])(__c.Null))));
 //BA.debugLineNum = 50;BA.debugLine="Return Metadata.RunMethod(\"getColumnCount\",Null)";
if (true) return (int)(BA.ObjectToNumber(_metadata.RunMethod("getColumnCount",(Object[])(__c.Null))));
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return 0;
}
public String  _getcolumnname(int _index) throws Exception{
anywheresoftware.b4j.object.JavaObject _metadata = null;
 //BA.debugLineNum = 43;BA.debugLine="Public Sub GetColumnName(index As Int) As String";
 //BA.debugLineNum = 44;BA.debugLine="Dim Metadata As JavaObject = NativeRS.RunMethod(\"";
_metadata = new anywheresoftware.b4j.object.JavaObject();
_metadata = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_nativers.RunMethod("getMetaData",(Object[])(__c.Null))));
 //BA.debugLineNum = 45;BA.debugLine="Return Metadata.RunMethod(\"getColumnLabel\",Array";
if (true) return BA.ObjectToString(_metadata.RunMethod("getColumnLabel",new Object[]{(Object)(_index+1)}));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public double  _getdouble(String _columnname) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub GetDouble(ColumnName As String) As Doub";
 //BA.debugLineNum = 86;BA.debugLine="Return NativeRS.RunMethod(\"getDouble\",Array As Ob";
if (true) return (double)(BA.ObjectToNumber(_nativers.RunMethod("getDouble",new Object[]{(Object)(_columnname)})));
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return 0;
}
public double  _getdouble2(int _index) throws Exception{
 //BA.debugLineNum = 89;BA.debugLine="Public Sub GetDouble2(index As Int) As Double";
 //BA.debugLineNum = 90;BA.debugLine="Return NativeRS.RunMethod(\"getDouble\",Array As Ob";
if (true) return (double)(BA.ObjectToNumber(_nativers.RunMethod("getDouble",new Object[]{(Object)(_index+1)})));
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return 0;
}
public float  _getfloat(String _columnname) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Public Sub GetFloat(ColumnName As String) As Float";
 //BA.debugLineNum = 94;BA.debugLine="Return NativeRS.RunMethod(\"getFloat\",Array As Obj";
if (true) return (float)(BA.ObjectToNumber(_nativers.RunMethod("getFloat",new Object[]{(Object)(_columnname)})));
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return 0f;
}
public float  _getfloat2(int _index) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub GetFloat2(index As Int) As Float";
 //BA.debugLineNum = 98;BA.debugLine="Return NativeRS.RunMethod(\"getFloat\",Array As Obj";
if (true) return (float)(BA.ObjectToNumber(_nativers.RunMethod("getFloat",new Object[]{(Object)(_index+1)})));
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return 0f;
}
public int  _getint(String _columnname) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub GetInt(ColumnName As String) As Int";
 //BA.debugLineNum = 54;BA.debugLine="Return NativeRS.RunMethod(\"getInt\",Array As Objec";
if (true) return (int)(BA.ObjectToNumber(_nativers.RunMethod("getInt",new Object[]{(Object)(_columnname)})));
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return 0;
}
public int  _getint2(int _index) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Public Sub GetInt2(index As Int) As Int";
 //BA.debugLineNum = 58;BA.debugLine="Return NativeRS.RunMethod(\"getInt\",Array As Objec";
if (true) return (int)(BA.ObjectToNumber(_nativers.RunMethod("getInt",new Object[]{(Object)(_index+1)})));
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return 0;
}
public long  _getlong(String _columnname) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub GetLong(ColumnName As String) As Long";
 //BA.debugLineNum = 78;BA.debugLine="Return NativeRS.RunMethod(\"getLong\",Array As Obje";
if (true) return BA.ObjectToLongNumber(_nativers.RunMethod("getLong",new Object[]{(Object)(_columnname)}));
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return 0L;
}
public long  _getlong2(int _index) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Public Sub GetLong2(index As Int) As Long";
 //BA.debugLineNum = 82;BA.debugLine="Return NativeRS.RunMethod(\"getLong\",Array As Obje";
if (true) return BA.ObjectToLongNumber(_nativers.RunMethod("getLong",new Object[]{(Object)(_index+1)}));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return 0L;
}
public int  _getrow() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Public Sub GetRow As Int";
 //BA.debugLineNum = 40;BA.debugLine="Return NativeRS.RunMethod(\"getRow\",Null)";
if (true) return (int)(BA.ObjectToNumber(_nativers.RunMethod("getRow",(Object[])(__c.Null))));
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return 0;
}
public short  _getshort(String _columnname) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub GetShort(ColumnName As String) As Short";
 //BA.debugLineNum = 62;BA.debugLine="Return NativeRS.RunMethod(\"getShort\",Array As Obj";
if (true) return (short)(BA.ObjectToNumber(_nativers.RunMethod("getShort",new Object[]{(Object)(_columnname)})));
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return (short)0;
}
public short  _getshort2(int _index) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Public Sub GetShort2(index As Int) As Short";
 //BA.debugLineNum = 66;BA.debugLine="Return NativeRS.RunMethod(\"getShort\",Array As Obj";
if (true) return (short)(BA.ObjectToNumber(_nativers.RunMethod("getShort",new Object[]{(Object)(_index+1)})));
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return (short)0;
}
public String  _getstring(String _columnname) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Public Sub GetString(ColumnName As String) As Stri";
 //BA.debugLineNum = 70;BA.debugLine="Return NativeRS.RunMethod(\"getString\",Array As Ob";
if (true) return BA.ObjectToString(_nativers.RunMethod("getString",new Object[]{(Object)(_columnname)}));
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _getstring2(int _index) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub GetString2(index As Int) As String";
 //BA.debugLineNum = 74;BA.debugLine="Return NativeRS.RunMethod(\"getString\",Array As Ob";
if (true) return BA.ObjectToString(_nativers.RunMethod("getString",new Object[]{(Object)(_index+1)}));
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _originalresultset) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(OriginalResultSet As JavaObj";
 //BA.debugLineNum = 7;BA.debugLine="NativeRS=OriginalResultSet";
_nativers = _originalresultset;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public boolean  _isclosed() throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub isClosed As Boolean";
 //BA.debugLineNum = 15;BA.debugLine="Return NativeRS.RunMethod(\"isClosed\",Null)";
if (true) return BA.ObjectToBoolean(_nativers.RunMethod("isClosed",(Object[])(__c.Null)));
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return false;
}
public boolean  _last() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Public Sub last As Boolean";
 //BA.debugLineNum = 23;BA.debugLine="Return NativeRS.RunMethod(\"last\",Null)";
if (true) return BA.ObjectToBoolean(_nativers.RunMethod("last",(Object[])(__c.Null)));
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return false;
}
public boolean  _nextrow() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Public Sub NextRow As Boolean";
 //BA.debugLineNum = 27;BA.debugLine="Return NativeRS.RunMethod(\"next\",Null)";
if (true) return BA.ObjectToBoolean(_nativers.RunMethod("next",(Object[])(__c.Null)));
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return false;
}
public boolean  _previousrow() throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Public Sub PreviousRow As Boolean";
 //BA.debugLineNum = 31;BA.debugLine="Return NativeRS.RunMethod(\"previous\",Null)";
if (true) return BA.ObjectToBoolean(_nativers.RunMethod("previous",(Object[])(__c.Null)));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return false;
}
public boolean  _relativerow(int _row) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub relativeRow(row As Int) As Boolean";
 //BA.debugLineNum = 36;BA.debugLine="Return NativeRS.RunMethod(\"relative\",Array As Obj";
if (true) return BA.ObjectToBoolean(_nativers.RunMethod("relative",new Object[]{(Object)(_row)}));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
