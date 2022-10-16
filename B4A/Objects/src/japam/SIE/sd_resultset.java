package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class sd_resultset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.sd_resultset");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.sd_resultset.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.object.JavaObject _nativers = null;
public b4a.example.dateutils _dateutils = null;
public japam.SIE.main _main = null;
public japam.SIE.starter _starter = null;
public japam.SIE.b4xpages _b4xpages = null;
public japam.SIE.b4xcollections _b4xcollections = null;
public japam.SIE.xuiviewsutils _xuiviewsutils = null;
public boolean  _nextrow(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "nextrow", true))
	 {return ((Boolean) Debug.delegate(ba, "nextrow", null));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub NextRow As Boolean";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="Return NativeRS.RunMethod(\"next\",Null)";
if (true) return BA.ObjectToBoolean(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("next",(Object[])(__c.Null)));
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="End Sub";
return false;
}
public String  _getstring(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getstring", true))
	 {return ((String) Debug.delegate(ba, "getstring", new Object[] {_columnname}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub GetString(ColumnName As String) As Stri";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Return NativeRS.RunMethod(\"getString\",Array As Ob";
if (true) return BA.ObjectToString(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getString",new Object[]{(Object)(_columnname)}));
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="End Sub";
return "";
}
public String  _close(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "close", true))
	 {return ((String) Debug.delegate(ba, "close", null));}
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Public Sub Close";
RDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="NativeRS.RunMethod(\"close\",Null)";
__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("close",(Object[])(__c.Null));
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="End Sub";
return "";
}
public String  _initialize(japam.SIE.sd_resultset __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _originalresultset) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_originalresultset}));}
RDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Public Sub Initialize(OriginalResultSet As JavaObj";
RDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="NativeRS=OriginalResultSet";
__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/  = _originalresultset;
RDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
RDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="Private NativeRS As JavaObject";
_nativers = new anywheresoftware.b4j.object.JavaObject();
RDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return "";
}
public boolean  _first(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "first", true))
	 {return ((Boolean) Debug.delegate(ba, "first", null));}
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub first As Boolean";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Return NativeRS.RunMethod(\"first\",Null)";
if (true) return BA.ObjectToBoolean(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("first",(Object[])(__c.Null)));
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="End Sub";
return false;
}
public byte[]  _getbytes(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getbytes", true))
	 {return ((byte[]) Debug.delegate(ba, "getbytes", new Object[] {_columnname}));}
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Public Sub GetBytes(ColumnName As String) As Byte(";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Return NativeRS.RunMethod(\"getBytes\",Array As Obj";
if (true) return (byte[])(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getBytes",new Object[]{(Object)(_columnname)}));
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="End Sub";
return null;
}
public byte[]  _getbytes2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getbytes2", true))
	 {return ((byte[]) Debug.delegate(ba, "getbytes2", new Object[] {_index}));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Public Sub GetBytes2(index As Int) As Byte()";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Return NativeRS.RunMethod(\"getBytes\",Array As Obj";
if (true) return (byte[])(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getBytes",new Object[]{(Object)(_index+1)}));
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="End Sub";
return null;
}
public int  _getcolumncount(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getcolumncount", true))
	 {return ((Integer) Debug.delegate(ba, "getcolumncount", null));}
anywheresoftware.b4j.object.JavaObject _metadata = null;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub getColumnCount As Int";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Dim Metadata As JavaObject = NativeRS.RunMethod(\"";
_metadata = new anywheresoftware.b4j.object.JavaObject();
_metadata = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getMetaData",(Object[])(__c.Null))));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Return Metadata.RunMethod(\"getColumnCount\",Null)";
if (true) return (int)(BA.ObjectToNumber(_metadata.RunMethod("getColumnCount",(Object[])(__c.Null))));
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="End Sub";
return 0;
}
public String  _getcolumnname(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getcolumnname", true))
	 {return ((String) Debug.delegate(ba, "getcolumnname", new Object[] {_index}));}
anywheresoftware.b4j.object.JavaObject _metadata = null;
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub GetColumnName(index As Int) As String";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="Dim Metadata As JavaObject = NativeRS.RunMethod(\"";
_metadata = new anywheresoftware.b4j.object.JavaObject();
_metadata = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getMetaData",(Object[])(__c.Null))));
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="Return Metadata.RunMethod(\"getColumnLabel\",Array";
if (true) return BA.ObjectToString(_metadata.RunMethod("getColumnLabel",new Object[]{(Object)(_index+1)}));
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="End Sub";
return "";
}
public double  _getdouble(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getdouble", true))
	 {return ((Double) Debug.delegate(ba, "getdouble", new Object[] {_columnname}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub GetDouble(ColumnName As String) As Doub";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Return NativeRS.RunMethod(\"getDouble\",Array As Ob";
if (true) return (double)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDouble",new Object[]{(Object)(_columnname)})));
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="End Sub";
return 0;
}
public double  _getdouble2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getdouble2", true))
	 {return ((Double) Debug.delegate(ba, "getdouble2", new Object[] {_index}));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub GetDouble2(index As Int) As Double";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Return NativeRS.RunMethod(\"getDouble\",Array As Ob";
if (true) return (double)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getDouble",new Object[]{(Object)(_index+1)})));
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="End Sub";
return 0;
}
public float  _getfloat(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getfloat", true))
	 {return ((Float) Debug.delegate(ba, "getfloat", new Object[] {_columnname}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Public Sub GetFloat(ColumnName As String) As Float";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Return NativeRS.RunMethod(\"getFloat\",Array As Obj";
if (true) return (float)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFloat",new Object[]{(Object)(_columnname)})));
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return 0f;
}
public float  _getfloat2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getfloat2", true))
	 {return ((Float) Debug.delegate(ba, "getfloat2", new Object[] {_index}));}
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Public Sub GetFloat2(index As Int) As Float";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Return NativeRS.RunMethod(\"getFloat\",Array As Obj";
if (true) return (float)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFloat",new Object[]{(Object)(_index+1)})));
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return 0f;
}
public int  _getint(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getint", true))
	 {return ((Integer) Debug.delegate(ba, "getint", new Object[] {_columnname}));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub GetInt(ColumnName As String) As Int";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Return NativeRS.RunMethod(\"getInt\",Array As Objec";
if (true) return (int)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getInt",new Object[]{(Object)(_columnname)})));
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="End Sub";
return 0;
}
public int  _getint2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getint2", true))
	 {return ((Integer) Debug.delegate(ba, "getint2", new Object[] {_index}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub GetInt2(index As Int) As Int";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Return NativeRS.RunMethod(\"getInt\",Array As Objec";
if (true) return (int)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getInt",new Object[]{(Object)(_index+1)})));
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return 0;
}
public long  _getlong(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getlong", true))
	 {return ((Long) Debug.delegate(ba, "getlong", new Object[] {_columnname}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub GetLong(ColumnName As String) As Long";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Return NativeRS.RunMethod(\"getLong\",Array As Obje";
if (true) return BA.ObjectToLongNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getLong",new Object[]{(Object)(_columnname)}));
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return 0L;
}
public long  _getlong2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getlong2", true))
	 {return ((Long) Debug.delegate(ba, "getlong2", new Object[] {_index}));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub GetLong2(index As Int) As Long";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Return NativeRS.RunMethod(\"getLong\",Array As Obje";
if (true) return BA.ObjectToLongNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getLong",new Object[]{(Object)(_index+1)}));
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="End Sub";
return 0L;
}
public int  _getrow(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getrow", true))
	 {return ((Integer) Debug.delegate(ba, "getrow", null));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub GetRow As Int";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Return NativeRS.RunMethod(\"getRow\",Null)";
if (true) return (int)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getRow",(Object[])(__c.Null))));
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return 0;
}
public short  _getshort(japam.SIE.sd_resultset __ref,String _columnname) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getshort", true))
	 {return ((Short) Debug.delegate(ba, "getshort", new Object[] {_columnname}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub GetShort(ColumnName As String) As Short";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Return NativeRS.RunMethod(\"getShort\",Array As Obj";
if (true) return (short)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getShort",new Object[]{(Object)(_columnname)})));
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return (short)0;
}
public short  _getshort2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getshort2", true))
	 {return ((Short) Debug.delegate(ba, "getshort2", new Object[] {_index}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub GetShort2(index As Int) As Short";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Return NativeRS.RunMethod(\"getShort\",Array As Obj";
if (true) return (short)(BA.ObjectToNumber(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getShort",new Object[]{(Object)(_index+1)})));
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return (short)0;
}
public String  _getstring2(japam.SIE.sd_resultset __ref,int _index) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "getstring2", true))
	 {return ((String) Debug.delegate(ba, "getstring2", new Object[] {_index}));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub GetString2(index As Int) As String";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Return NativeRS.RunMethod(\"getString\",Array As Ob";
if (true) return BA.ObjectToString(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getString",new Object[]{(Object)(_index+1)}));
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return "";
}
public boolean  _isclosed(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "isclosed", true))
	 {return ((Boolean) Debug.delegate(ba, "isclosed", null));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Public Sub isClosed As Boolean";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Return NativeRS.RunMethod(\"isClosed\",Null)";
if (true) return BA.ObjectToBoolean(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("isClosed",(Object[])(__c.Null)));
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="End Sub";
return false;
}
public boolean  _last(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "last", true))
	 {return ((Boolean) Debug.delegate(ba, "last", null));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub last As Boolean";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="Return NativeRS.RunMethod(\"last\",Null)";
if (true) return BA.ObjectToBoolean(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("last",(Object[])(__c.Null)));
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="End Sub";
return false;
}
public boolean  _previousrow(japam.SIE.sd_resultset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "previousrow", true))
	 {return ((Boolean) Debug.delegate(ba, "previousrow", null));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub PreviousRow As Boolean";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Return NativeRS.RunMethod(\"previous\",Null)";
if (true) return BA.ObjectToBoolean(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("previous",(Object[])(__c.Null)));
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="End Sub";
return false;
}
public boolean  _relativerow(japam.SIE.sd_resultset __ref,int _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="sd_resultset";
if (Debug.shouldDelegate(ba, "relativerow", true))
	 {return ((Boolean) Debug.delegate(ba, "relativerow", new Object[] {_row}));}
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Public Sub relativeRow(row As Int) As Boolean";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Return NativeRS.RunMethod(\"relative\",Array As Obj";
if (true) return BA.ObjectToBoolean(__ref._nativers /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("relative",new Object[]{(Object)(_row)}));
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="End Sub";
return false;
}
}