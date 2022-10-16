package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xset extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xset");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xset.class).invoke(this, new Object[] {null});
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
public japam.SIE.b4xorderedmap _map = null;
public b4a.example.dateutils _dateutils = null;
public japam.SIE.main _main = null;
public japam.SIE.starter _starter = null;
public japam.SIE.b4xpages _b4xpages = null;
public japam.SIE.b4xcollections _b4xcollections = null;
public japam.SIE.xuiviewsutils _xuiviewsutils = null;
public String  _initialize(japam.SIE.b4xset __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="map.Initialize";
__ref._map /*japam.SIE.b4xorderedmap*/ ._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return "";
}
public String  _add(japam.SIE.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "add", true))
	 {return ((String) Debug.delegate(ba, "add", new Object[] {_value}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Add(Value As Object)";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="map.Put(Value, \"\")";
__ref._map /*japam.SIE.b4xorderedmap*/ ._put /*String*/ (null,_value,(Object)(""));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _aslist(japam.SIE.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "aslist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "aslist", null));}
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub AsList As List";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Return map.Keys";
if (true) return __ref._map /*japam.SIE.b4xorderedmap*/ ._getkeys /*anywheresoftware.b4a.objects.collections.List*/ (null);
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(japam.SIE.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Private map As B4XOrderedMap";
_map = new japam.SIE.b4xorderedmap();
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="End Sub";
return "";
}
public String  _clear(japam.SIE.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub Clear";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="map.Clear";
__ref._map /*japam.SIE.b4xorderedmap*/ ._clear /*String*/ (null);
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return "";
}
public boolean  _contains(japam.SIE.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "contains", true))
	 {return ((Boolean) Debug.delegate(ba, "contains", new Object[] {_value}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub Contains (Value As Object) As Boolean";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Return map.ContainsKey(Value)";
if (true) return __ref._map /*japam.SIE.b4xorderedmap*/ ._containskey /*boolean*/ (null,_value);
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return false;
}
public int  _getsize(japam.SIE.b4xset __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "getsize", true))
	 {return ((Integer) Debug.delegate(ba, "getsize", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub getSize As Int";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Return map.Size";
if (true) return __ref._map /*japam.SIE.b4xorderedmap*/ ._getsize /*int*/ (null);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return 0;
}
public String  _remove(japam.SIE.b4xset __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xset";
if (Debug.shouldDelegate(ba, "remove", true))
	 {return ((String) Debug.delegate(ba, "remove", new Object[] {_value}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Remove(Value As Object)";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="map.Remove(Value)";
__ref._map /*japam.SIE.b4xorderedmap*/ ._remove /*String*/ (null,_value);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return "";
}
}