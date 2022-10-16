package japam.sie;

import org.apache.poi.xssf.usermodel.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xltable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xltable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xltable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _jtable = null;
public japam.sie.xlsheetwriter _msheet = null;
public anywheresoftware.b4j.object.JavaObject _jme = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _addautofilter() throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub AddAutoFilter";
 //BA.debugLineNum = 78;BA.debugLine="jMe.RunMethod(\"addAutoFilter\", Array(jTable))";
_jme.RunMethod("addAutoFilter",new Object[]{(Object)(_jtable.getObject())});
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public jTable As JavaObject";
_jtable = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 3;BA.debugLine="Private mSheet As XLSheetWriter";
_msheet = new japam.sie.xlsheetwriter();
 //BA.debugLineNum = 4;BA.debugLine="Private jMe As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlutils._xlrange  _getcellreferences() throws Exception{
anywheresoftware.b4j.object.JavaObject _area = null;
 //BA.debugLineNum = 47;BA.debugLine="Public Sub getCellReferences As XLRange";
 //BA.debugLineNum = 48;BA.debugLine="Dim area As JavaObject = jTable.RunMethod(\"getCel";
_area = new anywheresoftware.b4j.object.JavaObject();
_area = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jtable.RunMethod("getCellReferences",(Object[])(__c.Null))));
 //BA.debugLineNum = 49;BA.debugLine="Return mSheet.xl.AreaReferenceToXLRange(mSheet.Wo";
if (true) return _msheet._xl /*japam.sie.xlutils*/ ._areareferencetoxlrange /*japam.sie.xlutils._xlrange*/ (_msheet._workbook /*japam.sie.xlworkbookwriter*/ ._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ ,_area);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public String  _getdisplayname() throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub getDisplayName As String";
 //BA.debugLineNum = 25;BA.debugLine="Return jTable.RunMethod(\"getDisplayName\", Null)";
if (true) return BA.ObjectToString(_jtable.RunMethod("getDisplayName",(Object[])(__c.Null)));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _getname() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Public Sub getName As String";
 //BA.debugLineNum = 16;BA.debugLine="Return jTable.RunMethod(\"getName\", Null)";
if (true) return BA.ObjectToString(_jtable.RunMethod("getName",(Object[])(__c.Null)));
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public boolean  _getshowcolumnstripes() throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Public Sub getShowColumnStripes As Boolean";
 //BA.debugLineNum = 60;BA.debugLine="Return GetStyle.RunMethod(\"isShowColumnStripes\",";
if (true) return BA.ObjectToBoolean(_getstyle().RunMethod("isShowColumnStripes",(Object[])(__c.Null)));
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowrowstripes() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub getShowRowStripes As Boolean";
 //BA.debugLineNum = 69;BA.debugLine="Return GetStyle.RunMethod(\"isShowRowStripes\", Nul";
if (true) return BA.ObjectToBoolean(_getstyle().RunMethod("isShowRowStripes",(Object[])(__c.Null)));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4j.object.JavaObject  _getstyle() throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Private Sub GetStyle As JavaObject";
 //BA.debugLineNum = 43;BA.debugLine="Return jTable.RunMethodJO(\"getStyle\", Null)";
if (true) return _jtable.RunMethodJO("getStyle",(Object[])(__c.Null));
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public String  _getstylename() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub getStyleName As String";
 //BA.debugLineNum = 35;BA.debugLine="Return jTable.RunMethod(\"getStyleName\", Null)";
if (true) return BA.ObjectToString(_jtable.RunMethod("getStyleName",(Object[])(__c.Null)));
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.object.JavaObject _xssftable,japam.sie.xlsheetwriter _sheet) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize (XSSFTable As JavaObject, Sh";
 //BA.debugLineNum = 9;BA.debugLine="jTable = XSSFTable";
_jtable = _xssftable;
 //BA.debugLineNum = 10;BA.debugLine="mSheet = Sheet";
_msheet = _sheet;
 //BA.debugLineNum = 11;BA.debugLine="jMe = Me";
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _setcellreferences(japam.sie.xlutils._xlrange _range) throws Exception{
Object _area = null;
 //BA.debugLineNum = 52;BA.debugLine="Public Sub setCellReferences (Range As XLRange)";
 //BA.debugLineNum = 53;BA.debugLine="Range.Sheet = mSheet.PoiSheet";
_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _msheet._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ ;
 //BA.debugLineNum = 54;BA.debugLine="Dim area As Object = mSheet.xl.XLRangeToAreaRefer";
_area = (Object)(_msheet._xl /*japam.sie.xlutils*/ ._xlrangetoareareference /*anywheresoftware.b4j.object.JavaObject*/ (_msheet._workbook /*japam.sie.xlworkbookwriter*/ ,_range).getObject());
 //BA.debugLineNum = 55;BA.debugLine="jTable.RunMethod(\"setArea\", Array(area))";
_jtable.RunMethod("setArea",new Object[]{_area});
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _setdisplayname(String _n) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub setDisplayName(n As String)";
 //BA.debugLineNum = 29;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
if (_msheet._validatetablename /*boolean*/ (_n)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 30;BA.debugLine="jTable.RunMethod(\"setDisplayName\", Array(n))";
_jtable.RunMethod("setDisplayName",new Object[]{(Object)(_n)});
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _setname(String _n) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub setName(n As String)";
 //BA.debugLineNum = 20;BA.debugLine="If mSheet.ValidateTableName(n) = False Then Retur";
if (_msheet._validatetablename /*boolean*/ (_n)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 21;BA.debugLine="jTable.RunMethod(\"setName\", Array(n))";
_jtable.RunMethod("setName",new Object[]{(Object)(_n)});
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _setshowcolumnstripes(boolean _b) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Public Sub setShowColumnStripes (b As Boolean)";
 //BA.debugLineNum = 64;BA.debugLine="GetStyle.RunMethod(\"setShowColumnStripes\", Array(";
_getstyle().RunMethod("setShowColumnStripes",new Object[]{(Object)(_b)});
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _setshowrowstripes(boolean _b) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub setShowRowStripes (b As Boolean)";
 //BA.debugLineNum = 73;BA.debugLine="GetStyle.RunMethod(\"setShowRowStripes\", Array(b))";
_getstyle().RunMethod("setShowRowStripes",new Object[]{(Object)(_b)});
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setstylename(String _n) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub setStyleName(n As String)";
 //BA.debugLineNum = 39;BA.debugLine="jTable.RunMethod(\"setStyleName\", Array(n))";
_jtable.RunMethod("setStyleName",new Object[]{(Object)(_n)});
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
public void addAutoFilter(XSSFTable table) {
	table.getCTTable().addNewAutoFilter().setRef(table.getArea().formatAsString());
}

public void setTotalsRowShown(XSSFTable table, boolean b) {
	table.getCTTable().setTotalsRowShown(b);
}
public void setTotalsRowCount(XSSFTable table, int b) {
	table.getCTTable().setTotalsRowCount(b);
}
}
