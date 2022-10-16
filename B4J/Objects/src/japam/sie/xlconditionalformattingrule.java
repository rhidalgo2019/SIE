package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlconditionalformattingrule extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlconditionalformattingrule", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlconditionalformattingrule.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _jrule = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public jRule As JavaObject";
_jrule = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlconditionalformattingrule  _fontstyle(boolean _italic,boolean _bold,short _color) throws Exception{
anywheresoftware.b4j.object.JavaObject _fontformatting = null;
 //BA.debugLineNum = 22;BA.debugLine="Public Sub FontStyle (Italic As Boolean, Bold As B";
 //BA.debugLineNum = 23;BA.debugLine="Dim FontFormatting As JavaObject = jRule.RunMetho";
_fontformatting = new anywheresoftware.b4j.object.JavaObject();
_fontformatting = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jrule.RunMethod("createFontFormatting",(Object[])(__c.Null))));
 //BA.debugLineNum = 24;BA.debugLine="FontFormatting.RunMethod(\"setFontStyle\", Array(It";
_fontformatting.RunMethod("setFontStyle",new Object[]{(Object)(_italic),(Object)(_bold)});
 //BA.debugLineNum = 25;BA.debugLine="If Color > 0 Then";
if (_color>0) { 
 //BA.debugLineNum = 26;BA.debugLine="FontFormatting.RunMethod(\"setFontColorIndex\", Ar";
_fontformatting.RunMethod("setFontColorIndex",new Object[]{(Object)(_color)});
 };
 //BA.debugLineNum = 28;BA.debugLine="Return Me";
if (true) return (japam.sie.xlconditionalformattingrule)(this);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlconditionalformattingrule  _foregroundcolor(short _color) throws Exception{
anywheresoftware.b4j.object.JavaObject _patternformatting = null;
short _solid = (short)0;
 //BA.debugLineNum = 12;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLC";
 //BA.debugLineNum = 13;BA.debugLine="Dim patternformatting As JavaObject = jRule.RunMe";
_patternformatting = new anywheresoftware.b4j.object.JavaObject();
_patternformatting = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jrule.RunMethod("createPatternFormatting",(Object[])(__c.Null))));
 //BA.debugLineNum = 14;BA.debugLine="patternformatting.RunMethod(\"setFillBackgroundCol";
_patternformatting.RunMethod("setFillBackgroundColor",new Object[]{(Object)(_color)});
 //BA.debugLineNum = 15;BA.debugLine="Dim solid As Short = 1";
_solid = (short) (1);
 //BA.debugLineNum = 16;BA.debugLine="patternformatting.RunMethod(\"setFillPattern\", Arr";
_patternformatting.RunMethod("setFillPattern",new Object[]{(Object)(_solid)});
 //BA.debugLineNum = 17;BA.debugLine="Return Me";
if (true) return (japam.sie.xlconditionalformattingrule)(this);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _rule) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize (Rule As JavaObject)";
 //BA.debugLineNum = 7;BA.debugLine="jRule = Rule";
_jrule = _rule;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
