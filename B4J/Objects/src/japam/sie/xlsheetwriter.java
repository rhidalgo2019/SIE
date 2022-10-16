package japam.sie;

import org.apache.poi.ss.usermodel.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlsheetwriter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlsheetwriter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlsheetwriter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.PoiSheetWrapper _poisheet = null;
public japam.sie.xlutils _xl = null;
public japam.sie.xlutils._xladdress _lastaccessed = null;
public anywheresoftware.b4j.object.JavaObject _jsheet = null;
public japam.sie.xlworkbookwriter _workbook = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public japam.sie.xlsheetwriter  _addconditionalformatting(japam.sie.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _rules) throws Exception{
Object[] _jrules = null;
int _i = 0;
japam.sie.xlconditionalformattingrule _r = null;
anywheresoftware.b4j.object.JavaObject _cfrules = null;
anywheresoftware.b4j.object.JavaObject _regions = null;
 //BA.debugLineNum = 230;BA.debugLine="Public Sub AddConditionalFormatting (Range As XLRa";
 //BA.debugLineNum = 231;BA.debugLine="Dim jrules(Rules.Size) As Object";
_jrules = new Object[_rules.getSize()];
{
int d0 = _jrules.length;
for (int i0 = 0;i0 < d0;i0++) {
_jrules[i0] = new Object();
}
}
;
 //BA.debugLineNum = 232;BA.debugLine="For i = 0 To Rules.Size - 1";
{
final int step2 = 1;
final int limit2 = (int) (_rules.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 233;BA.debugLine="Dim r As XLConditionalFormattingRule = Rules.Get";
_r = (japam.sie.xlconditionalformattingrule)(_rules.Get(_i));
 //BA.debugLineNum = 234;BA.debugLine="jrules(i) = r.jRule";
_jrules[_i] = (Object)(_r._jrule /*anywheresoftware.b4j.object.JavaObject*/ .getObject());
 }
};
 //BA.debugLineNum = 236;BA.debugLine="Dim cfrules As JavaObject";
_cfrules = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 237;BA.debugLine="cfrules.InitializeArray(\"org.apache.poi.ss.usermo";
_cfrules.InitializeArray("org.apache.poi.ss.usermodel.ConditionalFormattingRule",_jrules);
 //BA.debugLineNum = 238;BA.debugLine="Dim Regions As JavaObject";
_regions = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 239;BA.debugLine="Regions.InitializeArray(\"org.apache.poi.ss.util.C";
_regions.InitializeArray("org.apache.poi.ss.util.CellRangeAddress",new Object[]{(Object)(_xl._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (_range).getObject())});
 //BA.debugLineNum = 240;BA.debugLine="GetSheetConditionalFormatting.RunMethod(\"addCondi";
_getsheetconditionalformatting().RunMethod("addConditionalFormatting",new Object[]{(Object)(_regions.getObject()),(Object)(_cfrules.getObject())});
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _addmergedregion(japam.sie.xlutils._xlrange _range) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 101;BA.debugLine="Public Sub AddMergedRegion (Range As XLRange) As X";
 //BA.debugLineNum = 102;BA.debugLine="Dim jo As JavaObject = PoiSheet";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poisheet.getObject()));
 //BA.debugLineNum = 103;BA.debugLine="jo.RunMethod(\"addMergedRegion\", Array(xl.XLRangeT";
_jo.RunMethod("addMergedRegion",new Object[]{(Object)(_xl._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (_range).getObject())});
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _addstyle(japam.sie.xlutils._xladdress _address,japam.sie.xlstyle _style) throws Exception{
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 48;BA.debugLine="Public Sub AddStyle (Address As XLAddress, Style A";
 //BA.debugLineNum = 49;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _getcell(_address);
 //BA.debugLineNum = 50;BA.debugLine="ApplyStyle(cell, True, Style.StyleMap)";
_applystyle(_cell,__c.True,_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _addstyles(japam.sie.xlutils._xladdress _address,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 62;BA.debugLine="Public Sub AddStyles (Address As XLAddress, Styles";
 //BA.debugLineNum = 63;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _getcell(_address);
 //BA.debugLineNum = 64;BA.debugLine="ApplyStyle(cell, True, MergeStyles(Styles))";
_applystyle(_cell,__c.True,_mergestyles(_styles));
 //BA.debugLineNum = 65;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _addstylestorange(japam.sie.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Public Sub AddStylesToRange (Range As XLRange, Sty";
 //BA.debugLineNum = 86;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Tr";
if (true) return _internalsetstylestorange(_range,_styles,__c.True);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public String  _applystyle(anywheresoftware.b4j.objects.PoiCellWrapper _cell,boolean _add,anywheresoftware.b4a.objects.collections.Map _stylemap) throws Exception{
anywheresoftware.b4a.objects.collections.Map _props = null;
String _key = "";
 //BA.debugLineNum = 290;BA.debugLine="Private Sub ApplyStyle (Cell As PoiCell, Add As Bo";
 //BA.debugLineNum = 291;BA.debugLine="Dim props As Map";
_props = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 292;BA.debugLine="If Add = False Then";
if (_add==__c.False) { 
 //BA.debugLineNum = 293;BA.debugLine="props = StyleMap";
_props = _stylemap;
 }else {
 //BA.debugLineNum = 295;BA.debugLine="props.Initialize";
_props.Initialize();
 //BA.debugLineNum = 296;BA.debugLine="FillStyleFromCell(props, Cell.CellStyle)";
_fillstylefromcell(_props,_cell.getCellStyle());
 //BA.debugLineNum = 297;BA.debugLine="For Each key As String In StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _stylemap.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_key = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 298;BA.debugLine="props.Put(key, StyleMap.Get(key))";
_props.Put((Object)(_key),_stylemap.Get((Object)(_key)));
 }
};
 };
 //BA.debugLineNum = 301;BA.debugLine="Cell.CellStyle = CreateStyle(props)";
_cell.setCellStyle(_createstyle(_props));
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlsheetwriter  _autosizecolumn(int _column0based) throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Public Sub AutoSizeColumn (Column0Based As Int) As";
 //BA.debugLineNum = 141;BA.debugLine="jsheet.RunMethod(\"autoSizeColumn\", Array(Column0B";
_jsheet.RunMethod("autoSizeColumn",new Object[]{(Object)(_column0based)});
 //BA.debugLineNum = 142;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellStyleWrapper  _checkifstyleexists(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4j.objects.PoiCellStyleWrapper _empty = null;
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 334;BA.debugLine="Private Sub CheckIfStyleExists (props As Map) As P";
 //BA.debugLineNum = 335;BA.debugLine="Dim empty As PoiCellStyle";
_empty = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
 //BA.debugLineNum = 336;BA.debugLine="For Each m As Map In Workbook.InternalStylesCache";
_m = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _workbook._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_m = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group2.Get(index2)));
 //BA.debugLineNum = 337;BA.debugLine="If IsMapTheSameAsProps(m, props) Then";
if (_ismapthesameasprops(_m,_props)) { 
 //BA.debugLineNum = 338;BA.debugLine="Return Workbook.InternalStylesCache.Get(m)";
if (true) return (anywheresoftware.b4j.objects.PoiCellStyleWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellStyleWrapper(), (org.apache.poi.ss.usermodel.CellStyle)(_workbook._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_m.getObject()))));
 };
 }
};
 //BA.debugLineNum = 341;BA.debugLine="Return empty";
if (true) return _empty;
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public PoiSheet As PoiSheet";
_poisheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public xl As XLUtils";
_xl = new japam.sie.xlutils();
 //BA.debugLineNum = 5;BA.debugLine="Public LastAccessed As XLAddress";
_lastaccessed = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 6;BA.debugLine="Private jsheet As JavaObject";
_jsheet = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 7;BA.debugLine="Public Workbook As XLWorkbookWriter";
_workbook = new japam.sie.xlworkbookwriter();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlconditionalformattingrule  _createconditionalformattingrule(String _formula) throws Exception{
japam.sie.xlconditionalformattingrule _x = null;
anywheresoftware.b4j.object.JavaObject _m = null;
 //BA.debugLineNum = 210;BA.debugLine="Public Sub CreateConditionalFormattingRule(Formula";
 //BA.debugLineNum = 211;BA.debugLine="Dim x As XLConditionalFormattingRule";
_x = new japam.sie.xlconditionalformattingrule();
 //BA.debugLineNum = 212;BA.debugLine="Dim m As JavaObject = Me";
_m = new anywheresoftware.b4j.object.JavaObject();
_m = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 213;BA.debugLine="x.Initialize(m.RunMethod(\"createConditionalFormat";
_x._initialize /*String*/ (ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_m.RunMethod("createConditionalFormattingRule",new Object[]{(Object)(_getsheetconditionalformatting().getObject()),(Object)(_formula)}))));
 //BA.debugLineNum = 214;BA.debugLine="Return x";
if (true) return _x;
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _createfreezepane(int _numberofcolumns,int _numberofrows) throws Exception{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub CreateFreezePane (NumberOfColumns As In";
 //BA.debugLineNum = 148;BA.debugLine="jsheet.RunMethod(\"createFreezePane\", Array(Number";
_jsheet.RunMethod("createFreezePane",new Object[]{(Object)(_numberofcolumns),(Object)(_numberofrows)});
 //BA.debugLineNum = 149;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _createhyperlink(japam.sie.xlutils._xladdress _address,String _hyperlinktype,String _url) throws Exception{
anywheresoftware.b4j.object.JavaObject _link = null;
anywheresoftware.b4j.object.JavaObject _jcell = null;
 //BA.debugLineNum = 176;BA.debugLine="Public Sub CreateHyperlink (Address As XLAddress,";
 //BA.debugLineNum = 177;BA.debugLine="Dim link As JavaObject = Workbook.jWorkbook.RunMe";
_link = new anywheresoftware.b4j.object.JavaObject();
_link = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_workbook._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethod("createHyperlink",new Object[]{(Object)(_hyperlinktype)})));
 //BA.debugLineNum = 178;BA.debugLine="link.RunMethod(\"setAddress\", Array(URL))";
_link.RunMethod("setAddress",new Object[]{(Object)(_url)});
 //BA.debugLineNum = 179;BA.debugLine="Dim jcell As JavaObject = GetCell(Address)";
_jcell = new anywheresoftware.b4j.object.JavaObject();
_jcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_getcell(_address).getObject()));
 //BA.debugLineNum = 180;BA.debugLine="jcell.RunMethod(\"setHyperlink\", Array(link))";
_jcell.RunMethod("setHyperlink",new Object[]{(Object)(_link.getObject())});
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellStyleWrapper  _createstyle(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
anywheresoftware.b4j.objects.PoiCellStyleWrapper _style = null;
anywheresoftware.b4j.object.JavaObject _jstyle = null;
String _key = "";
 //BA.debugLineNum = 317;BA.debugLine="Private Sub CreateStyle (props As Map) As PoiCellS";
 //BA.debugLineNum = 318;BA.debugLine="Dim style As PoiCellStyle = CheckIfStyleExists (p";
_style = new anywheresoftware.b4j.objects.PoiCellStyleWrapper();
_style = _checkifstyleexists(_props);
 //BA.debugLineNum = 319;BA.debugLine="If style.IsInitialized = False Then";
if (_style.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 320;BA.debugLine="style.Initialize(Workbook.PoiWorkbook)";
_style.Initialize(_workbook._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ );
 //BA.debugLineNum = 321;BA.debugLine="Workbook.InternalStylesCache.Put(props, style)";
_workbook._internalstylescache /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_props.getObject()),(Object)(_style.getObject()));
 //BA.debugLineNum = 322;BA.debugLine="Dim jstyle As JavaObject = style";
_jstyle = new anywheresoftware.b4j.object.JavaObject();
_jstyle = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_style.getObject()));
 //BA.debugLineNum = 323;BA.debugLine="For Each key As String In props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _props.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_key = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 324;BA.debugLine="If key = \"setFont\" Then";
if ((_key).equals("setFont")) { 
 //BA.debugLineNum = 325;BA.debugLine="jstyle.RunMethod(key, Array(Workbook.jWorkbook";
_jstyle.RunMethod(_key,new Object[]{_workbook._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getFontAt",new Object[]{_props.Get((Object)(_key))})});
 }else {
 //BA.debugLineNum = 327;BA.debugLine="jstyle.RunMethod(key, Array(props.Get(key)))";
_jstyle.RunMethod(_key,new Object[]{_props.Get((Object)(_key))});
 };
 }
};
 };
 //BA.debugLineNum = 331;BA.debugLine="Return style";
if (true) return _style;
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public japam.sie.xltable  _createtable(japam.sie.xlutils._xlrange _range,String _tablename,String _stylename) throws Exception{
anywheresoftware.b4j.object.JavaObject _areareference = null;
anywheresoftware.b4j.object.JavaObject _table = null;
japam.sie.xltable _t = null;
 //BA.debugLineNum = 248;BA.debugLine="Public Sub CreateTable (Range As XLRange, TableNam";
 //BA.debugLineNum = 249;BA.debugLine="If Workbook.IsXLSX = False Then";
if (_workbook._isxlsx /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 250;BA.debugLine="Log(\"Tables are supported in XLSX only.\")";
__c.LogImpl("948824322","Tables are supported in XLSX only.",0);
 //BA.debugLineNum = 251;BA.debugLine="Return Null";
if (true) return (japam.sie.xltable)(__c.Null);
 };
 //BA.debugLineNum = 253;BA.debugLine="If ValidateTableName(TableName) = False Then Retu";
if (_validatetablename(_tablename)==__c.False) { 
if (true) return (japam.sie.xltable)(__c.Null);};
 //BA.debugLineNum = 254;BA.debugLine="Range.Sheet = PoiSheet";
_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poisheet;
 //BA.debugLineNum = 255;BA.debugLine="Dim AreaReference As JavaObject = xl.XLRangeToAre";
_areareference = new anywheresoftware.b4j.object.JavaObject();
_areareference = _xl._xlrangetoareareference /*anywheresoftware.b4j.object.JavaObject*/ (_workbook,_range);
 //BA.debugLineNum = 256;BA.debugLine="Dim Table As JavaObject = jsheet.RunMethod(\"creat";
_table = new anywheresoftware.b4j.object.JavaObject();
_table = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jsheet.RunMethod("createTable",new Object[]{(Object)(_areareference.getObject())})));
 //BA.debugLineNum = 257;BA.debugLine="Table.RunMethod(\"setName\", Array(TableName))";
_table.RunMethod("setName",new Object[]{(Object)(_tablename)});
 //BA.debugLineNum = 258;BA.debugLine="Table.RunMethod(\"setStyleName\", Array(StyleName))";
_table.RunMethod("setStyleName",new Object[]{(Object)(_stylename)});
 //BA.debugLineNum = 259;BA.debugLine="Dim t As XLTable";
_t = new japam.sie.xltable();
 //BA.debugLineNum = 260;BA.debugLine="t.Initialize(Table, Me)";
_t._initialize /*String*/ (ba,_table,(japam.sie.xlsheetwriter)(this));
 //BA.debugLineNum = 261;BA.debugLine="Return t";
if (true) return _t;
 //BA.debugLineNum = 262;BA.debugLine="End Sub";
return null;
}
public String  _fillstylefromcell(anywheresoftware.b4a.objects.collections.Map _props,anywheresoftware.b4j.objects.PoiCellStyleWrapper _cellstyle) throws Exception{
anywheresoftware.b4j.object.JavaObject _jstyle = null;
anywheresoftware.b4a.objects.collections.List _methods = null;
String _method = "";
 //BA.debugLineNum = 304;BA.debugLine="Private Sub FillStyleFromCell (props As Map, CellS";
 //BA.debugLineNum = 305;BA.debugLine="Dim jStyle As JavaObject = CellStyle";
_jstyle = new anywheresoftware.b4j.object.JavaObject();
_jstyle = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cellstyle.getObject()));
 //BA.debugLineNum = 306;BA.debugLine="For Each methods As List In Workbook.InternalAllS";
_methods = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group2 = _workbook._internalallsimplemethods /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_methods = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(group2.Get(index2)));
 //BA.debugLineNum = 307;BA.debugLine="For Each method As String In methods";
{
final anywheresoftware.b4a.BA.IterableList group3 = _methods;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_method = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 308;BA.debugLine="props.Put(method, jStyle.RunMethod(\"g\" & method";
_props.Put((Object)(_method),_jstyle.RunMethod("g"+_method.substring((int) (1)),(Object[])(__c.Null)));
 }
};
 }
};
 //BA.debugLineNum = 311;BA.debugLine="props.Put(\"setFont\", jStyle.RunMethod(\"getFontInd";
_props.Put((Object)("setFont"),_jstyle.RunMethod("getFontIndex",(Object[])(__c.Null)));
 //BA.debugLineNum = 312;BA.debugLine="For Each method As String In Workbook.InternalSty";
{
final anywheresoftware.b4a.BA.IterableList group8 = _workbook._internalstylestrings /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_method = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 313;BA.debugLine="props.Put(method, jStyle.RunMethodJO(\"g\" & metho";
_props.Put((Object)(_method),_jstyle.RunMethodJO("g"+_method.substring((int) (1)),(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 }
};
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlutils._xladdress  _getactivecell() throws Exception{
japam.sie.xlutils._xladdress _res = null;
anywheresoftware.b4j.object.JavaObject _celladdress = null;
 //BA.debugLineNum = 153;BA.debugLine="Public Sub getActiveCell As XLAddress";
 //BA.debugLineNum = 154;BA.debugLine="Dim res As XLAddress";
_res = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 155;BA.debugLine="Dim celladdress As JavaObject = jsheet.RunMethod(";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
_celladdress = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jsheet.RunMethod("getActiveCell",(Object[])(__c.Null))));
 //BA.debugLineNum = 156;BA.debugLine="If celladdress.IsInitialized = False Then Return";
if (_celladdress.IsInitialized()==__c.False) { 
if (true) return _res;};
 //BA.debugLineNum = 157;BA.debugLine="Return xl.AddressZero(celladdress.RunMethod(\"getC";
if (true) return _xl._addresszero /*japam.sie.xlutils._xladdress*/ ((int)(BA.ObjectToNumber(_celladdress.RunMethod("getColumn",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_celladdress.RunMethod("getRow",(Object[])(__c.Null)))));
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiCellWrapper  _getcell(japam.sie.xlutils._xladdress _address) throws Exception{
anywheresoftware.b4j.objects.PoiRowWrapper _row = null;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 108;BA.debugLine="Public Sub GetCell (Address As XLAddress) As PoiCe";
 //BA.debugLineNum = 109;BA.debugLine="Dim row As PoiRow = GetRow(Address)";
_row = new anywheresoftware.b4j.objects.PoiRowWrapper();
_row = _getrow(_address);
 //BA.debugLineNum = 110;BA.debugLine="Dim Cell As PoiCell = row.GetCell(Address.Col0Bas";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _row.GetCell(_address.Col0Based /*int*/ );
 //BA.debugLineNum = 111;BA.debugLine="If Cell.IsInitialized = False Then";
if (_cell.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 112;BA.debugLine="Cell = row.CreateCellBlank(Address.Col0Based)";
_cell = _row.CreateCellBlank(_address.Col0Based /*int*/ );
 };
 //BA.debugLineNum = 114;BA.debugLine="LastAccessed = Address";
_lastaccessed = _address;
 //BA.debugLineNum = 115;BA.debugLine="Return Cell";
if (true) return _cell;
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlutils._xlrange  _getprintarea() throws Exception{
Object _ref = null;
japam.sie.xlutils._xlrange _res = null;
 //BA.debugLineNum = 392;BA.debugLine="Public Sub getPrintArea As XLRange";
 //BA.debugLineNum = 393;BA.debugLine="Dim ref As Object = Workbook.jWorkbook.RunMethod(";
_ref = _workbook._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getPrintArea",new Object[]{(Object)(_poisheet.getIndex())});
 //BA.debugLineNum = 394;BA.debugLine="If ref = Null Then";
if (_ref== null) { 
 //BA.debugLineNum = 395;BA.debugLine="Dim res As XLRange";
_res = new japam.sie.xlutils._xlrange();
 //BA.debugLineNum = 396;BA.debugLine="Return res";
if (true) return _res;
 };
 //BA.debugLineNum = 398;BA.debugLine="Return xl.RangeStringOrNameToRange(Workbook.PoiWo";
if (true) return _xl._rangestringornametorange /*japam.sie.xlutils._xlrange*/ (_workbook._poiworkbook /*anywheresoftware.b4j.objects.PoiWorkbookWrapper*/ ,BA.ObjectToString(_ref));
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getprintsetup() throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Public Sub getPrintSetup As JavaObject";
 //BA.debugLineNum = 414;BA.debugLine="Return jsheet.RunMethod(\"getPrintSetup\", Null)";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jsheet.RunMethod("getPrintSetup",(Object[])(__c.Null))));
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.objects.PoiRowWrapper  _getrow(japam.sie.xlutils._xladdress _address) throws Exception{
anywheresoftware.b4j.objects.PoiRowWrapper _row = null;
 //BA.debugLineNum = 118;BA.debugLine="Public Sub GetRow (Address As XLAddress) As PoiRow";
 //BA.debugLineNum = 119;BA.debugLine="Dim row As PoiRow = PoiSheet.GetRow(Address.Row0B";
_row = new anywheresoftware.b4j.objects.PoiRowWrapper();
_row = _poisheet.GetRow(_address.Row0Based /*int*/ );
 //BA.debugLineNum = 120;BA.debugLine="If row.IsInitialized = False Then";
if (_row.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 121;BA.debugLine="row = PoiSheet.CreateRow(Address.Row0Based)";
_row = _poisheet.CreateRow(_address.Row0Based /*int*/ );
 };
 //BA.debugLineNum = 123;BA.debugLine="Return row";
if (true) return _row;
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _getsheetconditionalformatting() throws Exception{
 //BA.debugLineNum = 225;BA.debugLine="Private Sub GetSheetConditionalFormatting As JavaO";
 //BA.debugLineNum = 226;BA.debugLine="Return jsheet.RunMethod(\"getSheetConditionalForma";
if (true) return (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jsheet.RunMethod("getSheetConditionalFormatting",(Object[])(__c.Null))));
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _gettables() throws Exception{
anywheresoftware.b4a.objects.collections.List _t = null;
anywheresoftware.b4a.objects.collections.List _res = null;
Object _j = null;
japam.sie.xltable _table = null;
 //BA.debugLineNum = 265;BA.debugLine="Public Sub GetTables As List";
 //BA.debugLineNum = 266;BA.debugLine="Dim t As List = jsheet.RunMethod(\"getTables\", Nul";
_t = new anywheresoftware.b4a.objects.collections.List();
_t = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jsheet.RunMethod("getTables",(Object[])(__c.Null))));
 //BA.debugLineNum = 267;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 268;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 269;BA.debugLine="For Each j As Object In t";
{
final anywheresoftware.b4a.BA.IterableList group4 = _t;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_j = group4.Get(index4);
 //BA.debugLineNum = 270;BA.debugLine="Dim table As XLTable";
_table = new japam.sie.xltable();
 //BA.debugLineNum = 271;BA.debugLine="table.Initialize(j, Me)";
_table._initialize /*String*/ (ba,(anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_j)),(japam.sie.xlsheetwriter)(this));
 //BA.debugLineNum = 272;BA.debugLine="res.Add(table)";
_res.Add((Object)(_table));
 }
};
 //BA.debugLineNum = 274;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _groupcolumns(int _fromcolumn0,int _tocolumn0,boolean _collapse) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Public Sub GroupColumns (FromColumn0 As Int, ToCol";
 //BA.debugLineNum = 186;BA.debugLine="jsheet.RunMethod(\"groupColumn\", Array (FromColumn";
_jsheet.RunMethod("groupColumn",new Object[]{(Object)(_fromcolumn0),(Object)(_tocolumn0)});
 //BA.debugLineNum = 187;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setColumnGroup";
if (_collapse) { 
_jsheet.RunMethod("setColumnGroupCollapsed",new Object[]{(Object)(_fromcolumn0),(Object)(_collapse)});};
 //BA.debugLineNum = 188;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _grouprows(int _fromrow0,int _torow0,boolean _collapse) throws Exception{
 //BA.debugLineNum = 191;BA.debugLine="Public Sub GroupRows (FromRow0 As Int, ToRow0 As I";
 //BA.debugLineNum = 192;BA.debugLine="jsheet.RunMethod(\"groupRow\", Array(FromRow0, ToRo";
_jsheet.RunMethod("groupRow",new Object[]{(Object)(_fromrow0),(Object)(_torow0)});
 //BA.debugLineNum = 193;BA.debugLine="If Collapse Then jsheet.RunMethod(\"setRowGroupCol";
if (_collapse) { 
_jsheet.RunMethod("setRowGroupCollapsed",new Object[]{(Object)(_fromrow0),(Object)(_collapse)});};
 //BA.debugLineNum = 194;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,japam.sie.xlutils _vxl,japam.sie.xlworkbookwriter _vworkbookwriter,anywheresoftware.b4j.objects.PoiSheetWrapper _vsheet) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (vxl As XLUtils, vWorkbookWr";
 //BA.debugLineNum = 12;BA.debugLine="PoiSheet = vSheet";
_poisheet = _vsheet;
 //BA.debugLineNum = 13;BA.debugLine="xl = vxl";
_xl = _vxl;
 //BA.debugLineNum = 14;BA.debugLine="Workbook = vWorkbookWriter";
_workbook = _vworkbookwriter;
 //BA.debugLineNum = 15;BA.debugLine="jsheet = PoiSheet";
_jsheet = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poisheet.getObject()));
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlsheetwriter  _internalsetstylestorange(japam.sie.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles,boolean _add) throws Exception{
anywheresoftware.b4a.objects.collections.Map _props = null;
int _col = 0;
int _row = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 89;BA.debugLine="Private Sub InternalSetStylesToRange (Range As XLR";
 //BA.debugLineNum = 90;BA.debugLine="Dim props As Map = MergeStyles(Styles)";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = _mergestyles(_styles);
 //BA.debugLineNum = 91;BA.debugLine="For col = Range.FirstAddress.Col0Based To Range.S";
{
final int step2 = 1;
final int limit2 = _range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ;
_col = _range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/  ;
for (;_col <= limit2 ;_col = _col + step2 ) {
 //BA.debugLineNum = 92;BA.debugLine="For row = Range.FirstAddress.Row0Based To Range.";
{
final int step3 = 1;
final int limit3 = _range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ;
_row = _range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/  ;
for (;_row <= limit3 ;_row = _row + step3 ) {
 //BA.debugLineNum = 93;BA.debugLine="Dim cell As PoiCell = GetCell(xl.AddressZero(co";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _getcell(_xl._addresszero /*japam.sie.xlutils._xladdress*/ (_col,_row));
 //BA.debugLineNum = 94;BA.debugLine="ApplyStyle(cell, Add, props)";
_applystyle(_cell,_add,_props);
 }
};
 }
};
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public boolean  _ismapthesameasprops(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
String _key = "";
int _i = 0;
boolean _b = false;
short _s = (short)0;
String _t = "";
 //BA.debugLineNum = 344;BA.debugLine="Private Sub IsMapTheSameAsProps (m As Map, Props A";
 //BA.debugLineNum = 345;BA.debugLine="If m.Size = Props.Size Then";
if (_m.getSize()==_props.getSize()) { 
 //BA.debugLineNum = 346;BA.debugLine="For Each key As String In Props.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _props.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_key = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 347;BA.debugLine="If m.ContainsKey(key) = False Then Return False";
if (_m.ContainsKey((Object)(_key))==__c.False) { 
if (true) return __c.False;};
 }
};
 //BA.debugLineNum = 349;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group5 = _workbook._internalstyleints /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_key = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 350;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
 //BA.debugLineNum = 351;BA.debugLine="Dim i As Int = Props.Get(key)";
_i = (int)(BA.ObjectToNumber(_props.Get((Object)(_key))));
 //BA.debugLineNum = 352;BA.debugLine="If i <> m.Get(key) Then";
if (_i!=(double)(BA.ObjectToNumber(_m.Get((Object)(_key))))) { 
 //BA.debugLineNum = 353;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
 //BA.debugLineNum = 357;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group13 = _workbook._internalstylebooleans /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen13 = group13.getSize()
;int index13 = 0;
;
for (; index13 < groupLen13;index13++){
_key = BA.ObjectToString(group13.Get(index13));
 //BA.debugLineNum = 358;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
 //BA.debugLineNum = 359;BA.debugLine="Dim b As Boolean = Props.Get(key)";
_b = BA.ObjectToBoolean(_props.Get((Object)(_key)));
 //BA.debugLineNum = 360;BA.debugLine="If b <> m.Get(key) Then";
if (_b!=BA.ObjectToBoolean(_m.Get((Object)(_key)))) { 
 //BA.debugLineNum = 361;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
 //BA.debugLineNum = 365;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group21 = _workbook._internalstyleshorts /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_key = BA.ObjectToString(group21.Get(index21));
 //BA.debugLineNum = 366;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
 //BA.debugLineNum = 367;BA.debugLine="Dim s As Short = Props.Get(key)";
_s = (short)(BA.ObjectToNumber(_props.Get((Object)(_key))));
 //BA.debugLineNum = 368;BA.debugLine="If s <> m.Get(key) Then";
if (_s!=(double)(BA.ObjectToNumber(_m.Get((Object)(_key))))) { 
 //BA.debugLineNum = 369;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
 //BA.debugLineNum = 373;BA.debugLine="For Each key As String In Workbook.InternalStyle";
{
final anywheresoftware.b4a.BA.IterableList group29 = _workbook._internalstylestrings /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_key = BA.ObjectToString(group29.Get(index29));
 //BA.debugLineNum = 374;BA.debugLine="If Props.ContainsKey(key) Then";
if (_props.ContainsKey((Object)(_key))) { 
 //BA.debugLineNum = 375;BA.debugLine="Dim t As String = Props.Get(key)";
_t = BA.ObjectToString(_props.Get((Object)(_key)));
 //BA.debugLineNum = 376;BA.debugLine="If t <> m.Get(key) Then";
if ((_t).equals(BA.ObjectToString(_m.Get((Object)(_key)))) == false) { 
 //BA.debugLineNum = 377;BA.debugLine="Return False";
if (true) return __c.False;
 };
 };
 }
};
 //BA.debugLineNum = 381;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 383;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.Map  _mergestyles(anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
anywheresoftware.b4a.objects.collections.Map _newprops = null;
japam.sie.xlstyle _style = null;
String _key = "";
 //BA.debugLineNum = 68;BA.debugLine="Private Sub MergeStyles (Styles As List) As Map";
 //BA.debugLineNum = 69;BA.debugLine="Dim NewProps As Map";
_newprops = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 70;BA.debugLine="NewProps.Initialize";
_newprops.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="For Each style As XLStyle In Styles";
{
final anywheresoftware.b4a.BA.IterableList group3 = _styles;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_style = (japam.sie.xlstyle)(group3.Get(index3));
 //BA.debugLineNum = 72;BA.debugLine="For Each key As String In style.StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group4 = _style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_key = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 73;BA.debugLine="NewProps.Put(key, style.StyleMap.Get(key))";
_newprops.Put((Object)(_key),_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_key)));
 }
};
 }
};
 //BA.debugLineNum = 76;BA.debugLine="Return NewProps";
if (true) return _newprops;
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _putdate(japam.sie.xlutils._xladdress _address,long _value) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Public Sub PutDate (Address As XLAddress, Value As";
 //BA.debugLineNum = 30;BA.debugLine="GetCell(Address).ValueDate = Value";
_getcell(_address).setValueDate(_value);
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _putformula(japam.sie.xlutils._xladdress _address,String _value) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub PutFormula (Address As XLAddress, Value";
 //BA.debugLineNum = 35;BA.debugLine="If Value.StartsWith(\"=\") Then Value = Value.SubSt";
if (_value.startsWith("=")) { 
_value = _value.substring((int) (1));};
 //BA.debugLineNum = 36;BA.debugLine="GetCell(Address).ValueFormula = Value";
_getcell(_address).setValueFormula(_value);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _putnumber(japam.sie.xlutils._xladdress _address,double _value) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Public Sub PutNumber (Address As XLAddress, Value";
 //BA.debugLineNum = 20;BA.debugLine="GetCell(Address).ValueNumeric = Value";
_getcell(_address).setValueNumeric(_value);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _putstring(japam.sie.xlutils._xladdress _address,String _value) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Public Sub PutString (Address As XLAddress, Value";
 //BA.debugLineNum = 25;BA.debugLine="GetCell(Address).ValueString = Value";
_getcell(_address).setValueString(_value);
 //BA.debugLineNum = 26;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public String  _removetable(japam.sie.xltable _table) throws Exception{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub RemoveTable (Table As XLTable)";
 //BA.debugLineNum = 279;BA.debugLine="jsheet.RunMethod(\"removeTable\", Array(Table))";
_jsheet.RunMethod("removeTable",new Object[]{(Object)(_table)});
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _setactivecell(japam.sie.xlutils._xladdress _address) throws Exception{
anywheresoftware.b4j.object.JavaObject _celladdress = null;
 //BA.debugLineNum = 160;BA.debugLine="Public Sub setActiveCell (Address As XLAddress)";
 //BA.debugLineNum = 161;BA.debugLine="Dim celladdress As JavaObject";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 162;BA.debugLine="celladdress.InitializeNewInstance(\"org.apache.poi";
_celladdress.InitializeNewInstance("org.apache.poi.ss.util.CellAddress",new Object[]{(Object)(_address.Row0Based /*int*/ ),(Object)(_address.Col0Based /*int*/ )});
 //BA.debugLineNum = 163;BA.debugLine="jsheet.RunMethod(\"setActiveCell\", Array(celladdre";
_jsheet.RunMethod("setActiveCell",new Object[]{(Object)(_celladdress.getObject())});
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlsheetwriter  _setautofilter(japam.sie.xlutils._xlrange _range) throws Exception{
Object _c = null;
 //BA.debugLineNum = 167;BA.debugLine="Public Sub SetAutoFilter (Range As XLRange) As XLS";
 //BA.debugLineNum = 168;BA.debugLine="Dim c As Object = xl.XLRangeToCellRangeAddress(Ra";
_c = (Object)(_xl._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (_range).getObject());
 //BA.debugLineNum = 169;BA.debugLine="jsheet.RunMethod(\"setAutoFilter\", Array(c))";
_jsheet.RunMethod("setAutoFilter",new Object[]{_c});
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _setfittopage(short _pageswide,short _pagestall) throws Exception{
anywheresoftware.b4j.object.JavaObject _ps = null;
 //BA.debugLineNum = 404;BA.debugLine="Public Sub SetFitToPage (PagesWide As Short, Pages";
 //BA.debugLineNum = 405;BA.debugLine="jsheet.RunMethod(\"setFitToPage\", Array(True))";
_jsheet.RunMethod("setFitToPage",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 406;BA.debugLine="Dim ps As JavaObject = getPrintSetup";
_ps = new anywheresoftware.b4j.object.JavaObject();
_ps = _getprintsetup();
 //BA.debugLineNum = 407;BA.debugLine="ps.RunMethod(\"setFitWidth\", Array(PagesWide))";
_ps.RunMethod("setFitWidth",new Object[]{(Object)(_pageswide)});
 //BA.debugLineNum = 408;BA.debugLine="ps.RunMethod(\"setFitHeight\", Array(PagesTall))";
_ps.RunMethod("setFitHeight",new Object[]{(Object)(_pagestall)});
 //BA.debugLineNum = 409;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return null;
}
public String  _setprintarea(japam.sie.xlutils._xlrange _range) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Public Sub setPrintArea(Range As XLRange)";
 //BA.debugLineNum = 388;BA.debugLine="Workbook.jWorkbook.RunMethod(\"setPrintArea\", Arra";
_workbook._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setPrintArea",new Object[]{(Object)(_poisheet.getIndex()),(Object)(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ )});
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlsheetwriter  _setstyle(japam.sie.xlutils._xladdress _address,japam.sie.xlstyle _style) throws Exception{
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 41;BA.debugLine="Public Sub SetStyle (Address As XLAddress, Style A";
 //BA.debugLineNum = 42;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _getcell(_address);
 //BA.debugLineNum = 43;BA.debugLine="ApplyStyle(cell, False, Style.StyleMap)";
_applystyle(_cell,__c.False,_style._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _setstyles(japam.sie.xlutils._xladdress _address,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 55;BA.debugLine="Public Sub SetStyles (Address As XLAddress, Styles";
 //BA.debugLineNum = 56;BA.debugLine="Dim cell As PoiCell = GetCell(Address)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _getcell(_address);
 //BA.debugLineNum = 57;BA.debugLine="ApplyStyle(cell, False, MergeStyles(Styles))";
_applystyle(_cell,__c.False,_mergestyles(_styles));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _setstylestorange(japam.sie.xlutils._xlrange _range,anywheresoftware.b4a.objects.collections.List _styles) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub SetStylesToRange (Range As XLRange, Sty";
 //BA.debugLineNum = 81;BA.debugLine="Return InternalSetStylesToRange(Range, Styles, Fa";
if (true) return _internalsetstylestorange(_range,_styles,__c.False);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _shiftcolumns(int _startcolumn0based,int _endcolumn0based,int _shiftamount) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Public Sub ShiftColumns (StartColumn0Based As Int,";
 //BA.debugLineNum = 134;BA.debugLine="jsheet.RunMethod(\"shiftColumns\", Array(StartColum";
_jsheet.RunMethod("shiftColumns",new Object[]{(Object)(_startcolumn0based),(Object)(_endcolumn0based),(Object)(_shiftamount)});
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _shiftrows(int _startrow0based,int _endrow0based,int _shiftamount) throws Exception{
 //BA.debugLineNum = 127;BA.debugLine="Public Sub ShiftRows (StartRow0Based As Int, EndRo";
 //BA.debugLineNum = 128;BA.debugLine="jsheet.RunMethod(\"shiftRows\", Array(StartRow0Base";
_jsheet.RunMethod("shiftRows",new Object[]{(Object)(_startrow0based),(Object)(_endrow0based),(Object)(_shiftamount)});
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _ungroupcolumns(int _fromcolumn0,int _tocolumn0) throws Exception{
 //BA.debugLineNum = 198;BA.debugLine="Public Sub UngroupColumns (FromColumn0 As Int, ToC";
 //BA.debugLineNum = 199;BA.debugLine="jsheet.RunMethod(\"ungroupColumn\", Array (FromColu";
_jsheet.RunMethod("ungroupColumn",new Object[]{(Object)(_fromcolumn0),(Object)(_tocolumn0)});
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _ungrouprows(int _fromrow0,int _torow0) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Public Sub UngroupRows (FromRow0 As Int, ToRow0 As";
 //BA.debugLineNum = 204;BA.debugLine="jsheet.RunMethod(\"ungroupRow\", Array(FromRow0, To";
_jsheet.RunMethod("ungroupRow",new Object[]{(Object)(_fromrow0),(Object)(_torow0)});
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (japam.sie.xlsheetwriter)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public boolean  _validatetablename(String _name) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Public Sub ValidateTableName (Name As String) As B";
 //BA.debugLineNum = 283;BA.debugLine="If Regex.IsMatch(Workbook.InternalNameRegex, Name";
if (__c.Regex.IsMatch(_workbook._internalnameregex /*String*/ ,_name)==__c.False) { 
 //BA.debugLineNum = 284;BA.debugLine="LogError(\"Invalid name: \" & Name)";
__c.LogError("Invalid name: "+_name);
 //BA.debugLineNum = 285;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 287;BA.debugLine="Return True";
if (true) return __c.True;
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
public Object createConditionalFormattingRule (SheetConditionalFormatting s, String formula) {
	return s.createConditionalFormattingRule(formula);
}
}
