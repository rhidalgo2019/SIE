package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlworkbookwriter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlworkbookwriter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlworkbookwriter.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook = null;
public japam.sie.xlutils _xl = null;
public boolean _fromtemplate = false;
public anywheresoftware.b4j.object.JavaObject _jworkbook = null;
public int _maxrows = 0;
public int _maxcolumns = 0;
public String _mversionname = "";
public boolean _isxlsx = false;
public String _defaultfontname = "";
public short _defaultfontsize = (short)0;
public String _defaultextension = "";
public anywheresoftware.b4a.objects.collections.Map _internalstylescache = null;
public anywheresoftware.b4a.objects.collections.List _internalstyleshorts = null;
public anywheresoftware.b4a.objects.collections.List _internalstylebooleans = null;
public anywheresoftware.b4a.objects.collections.List _internalstyleints = null;
public anywheresoftware.b4a.objects.collections.List _internalstylestrings = null;
public anywheresoftware.b4a.objects.collections.List _internalallsimplemethods = null;
public String _internalnameregex = "";
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4j.object.JavaObject  _addnamedrange(String _name,japam.sie.xlutils._xlrange _range) throws Exception{
anywheresoftware.b4j.object.JavaObject _cellrangeaddress = null;
anywheresoftware.b4j.object.JavaObject _jname = null;
 //BA.debugLineNum = 149;BA.debugLine="Public Sub AddNamedRange (Name As String, Range As";
 //BA.debugLineNum = 150;BA.debugLine="RemoveNamedRange(Name)";
_removenamedrange(_name);
 //BA.debugLineNum = 151;BA.debugLine="If Range.Sheet.IsInitialized = False Then";
if (_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .IsInitialized()==__c.False) { 
 //BA.debugLineNum = 152;BA.debugLine="LogError(\"Range.Sheet must me set. Use xl.Create";
__c.LogError("Range.Sheet must me set. Use xl.CreateXLRangeWithSheet!");
 };
 //BA.debugLineNum = 154;BA.debugLine="Dim CellRangeAddress As JavaObject = xl.XLRangeTo";
_cellrangeaddress = new anywheresoftware.b4j.object.JavaObject();
_cellrangeaddress = _xl._xlrangetocellrangeaddress /*anywheresoftware.b4j.object.JavaObject*/ (_range);
 //BA.debugLineNum = 155;BA.debugLine="Dim jname As JavaObject = CreateName(Name, CellRa";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = _createname(_name,BA.ObjectToString(_cellrangeaddress.RunMethod("formatAsString",new Object[]{(Object)(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName()),(Object)(__c.True)})));
 //BA.debugLineNum = 156;BA.debugLine="Return jname";
if (true) return _jname;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public String  _addnamedrangeoffset(String _name,japam.sie.xlutils._xlrange _range) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 173;BA.debugLine="Public Sub AddNamedRangeOffset (Name As String, Ra";
 //BA.debugLineNum = 174;BA.debugLine="RemoveNamedRange(Name)";
_removenamedrange(_name);
 //BA.debugLineNum = 175;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 176;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 177;BA.debugLine="sb.Append(\"OFFSET(\").Append(xl.XLAddressToCellRef";
_sb.Append("OFFSET(").Append(BA.ObjectToString(_xl._xladdresstocellreference /*anywheresoftware.b4j.object.JavaObject*/ (_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.FirstAddress /*japam.sie.xlutils._xladdress*/ ).RunMethod("formatAsString",(Object[])(__c.Null))));
 //BA.debugLineNum = 178;BA.debugLine="sb.Append(\", 0, 0, \").Append(Range.SecondAddress.";
_sb.Append(", 0, 0, ").Append(BA.NumberToString(_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ -_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ +1)).Append(", ");
 //BA.debugLineNum = 179;BA.debugLine="sb.Append(Range.SecondAddress.Col0Based - Range.F";
_sb.Append(BA.NumberToString(_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ -_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ +1)).Append(")");
 //BA.debugLineNum = 180;BA.debugLine="CreateName(Name, sb.ToString)";
_createname(_name,_sb.ToString());
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return "";
}
public String  _addnamedrangescoped(String _name,japam.sie.xlutils._xlrange _range) throws Exception{
anywheresoftware.b4j.object.JavaObject _jname = null;
 //BA.debugLineNum = 167;BA.debugLine="Public Sub AddNamedRangeScoped (Name As String, Ra";
 //BA.debugLineNum = 168;BA.debugLine="Dim jName As JavaObject = AddNamedRange(Name, Ran";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = _addnamedrange(_name,_range);
 //BA.debugLineNum = 169;BA.debugLine="jName.RunMethod(\"setSheetIndex\", Array(Range.Shee";
_jname.RunMethod("setSheetIndex",new Object[]{(Object)(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())});
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public PoiWorkbook As PoiWorkbook";
_poiworkbook = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Public xl As XLUtils";
_xl = new japam.sie.xlutils();
 //BA.debugLineNum = 4;BA.debugLine="Private FromTemplate As Boolean 'ignore";
_fromtemplate = false;
 //BA.debugLineNum = 5;BA.debugLine="Public jWorkbook As JavaObject";
_jworkbook = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 6;BA.debugLine="Public MaxRows, MaxColumns As Int";
_maxrows = 0;
_maxcolumns = 0;
 //BA.debugLineNum = 7;BA.debugLine="Private mVersionName As String";
_mversionname = "";
 //BA.debugLineNum = 8;BA.debugLine="Public IsXLSX As Boolean";
_isxlsx = false;
 //BA.debugLineNum = 9;BA.debugLine="Public DefaultFontName As String";
_defaultfontname = "";
 //BA.debugLineNum = 10;BA.debugLine="Public DefaultFontSize As Short";
_defaultfontsize = (short)0;
 //BA.debugLineNum = 11;BA.debugLine="Public DefaultExtension As String";
_defaultextension = "";
 //BA.debugLineNum = 12;BA.debugLine="Public InternalStylesCache As Map";
_internalstylescache = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public InternalStyleShorts As List = Array(\"setBo";
_internalstyleshorts = new anywheresoftware.b4a.objects.collections.List();
_internalstyleshorts = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setBottomBorderColor"),(Object)("setLeftBorderColor"),(Object)("setRightBorderColor"),(Object)("setTopBorderColor"),(Object)("setFillForegroundColor"),(Object)("setFillBackgroundColor"),(Object)("setIndention"),(Object)("setDataFormat"),(Object)("setRotation")});
 //BA.debugLineNum = 14;BA.debugLine="Public InternalStyleBooleans As List = Array(\"set";
_internalstylebooleans = new anywheresoftware.b4a.objects.collections.List();
_internalstylebooleans = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setLocked"),(Object)("setHidden"),(Object)("setWrapText")});
 //BA.debugLineNum = 15;BA.debugLine="Public InternalStyleInts As List = Array(\"setFont";
_internalstyleints = new anywheresoftware.b4a.objects.collections.List();
_internalstyleints = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setFont")});
 //BA.debugLineNum = 16;BA.debugLine="Public InternalStyleStrings As List = Array(\"setB";
_internalstylestrings = new anywheresoftware.b4a.objects.collections.List();
_internalstylestrings = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("setBorderBottom"),(Object)("setBorderLeft"),(Object)("setBorderRight"),(Object)("setBorderTop"),(Object)("setAlignment"),(Object)("setVerticalAlignment"),(Object)("setFillPattern")});
 //BA.debugLineNum = 17;BA.debugLine="Public InternalAllSimpleMethods As List = Array(I";
_internalallsimplemethods = new anywheresoftware.b4a.objects.collections.List();
_internalallsimplemethods = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_internalstyleshorts.getObject()),(Object)(_internalstylebooleans.getObject())});
 //BA.debugLineNum = 18;BA.debugLine="Public InternalNameRegex As String = \"[_A-Za-z][_";
_internalnameregex = "[_A-Za-z][_\\.A-Za-z0-9]+";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlsheetwriter  _clonesheet(japam.sie.xlsheetwriter _sheet,String _newsheetname) throws Exception{
anywheresoftware.b4j.objects.PoiSheetWrapper _newpoisheet = null;
japam.sie.xlsheetwriter _writer = null;
 //BA.debugLineNum = 96;BA.debugLine="Public Sub CloneSheet (Sheet As XLSheetWriter, New";
 //BA.debugLineNum = 97;BA.debugLine="Dim NewPoiSheet As PoiSheet = jWorkbook.RunMethod";
_newpoisheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_newpoisheet = (anywheresoftware.b4j.objects.PoiSheetWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiSheetWrapper(), (org.apache.poi.ss.usermodel.Sheet)(_jworkbook.RunMethod("cloneSheet",new Object[]{(Object)(_sheet._poisheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getIndex())})));
 //BA.debugLineNum = 98;BA.debugLine="NewPoiSheet.Name = NewSheetName";
_newpoisheet.setName(_newsheetname);
 //BA.debugLineNum = 99;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new japam.sie.xlsheetwriter();
 //BA.debugLineNum = 100;BA.debugLine="writer.Initialize(xl, Me, NewPoiSheet)";
_writer._initialize /*String*/ (ba,_xl,(japam.sie.xlworkbookwriter)(this),_newpoisheet);
 //BA.debugLineNum = 101;BA.debugLine="Return writer";
if (true) return _writer;
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _createname(String _name,String _formula) throws Exception{
anywheresoftware.b4j.object.JavaObject _jname = null;
 //BA.debugLineNum = 159;BA.debugLine="Private Sub CreateName (Name As String, Formula As";
 //BA.debugLineNum = 160;BA.debugLine="Dim jname As JavaObject = jWorkbook.RunMethod(\"cr";
_jname = new anywheresoftware.b4j.object.JavaObject();
_jname = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jworkbook.RunMethod("createName",(Object[])(__c.Null))));
 //BA.debugLineNum = 161;BA.debugLine="jname.RunMethod(\"setNameName\", Array(Name))";
_jname.RunMethod("setNameName",new Object[]{(Object)(_name)});
 //BA.debugLineNum = 162;BA.debugLine="jname.RunMethod(\"setRefersToFormula\", Array(Formu";
_jname.RunMethod("setRefersToFormula",new Object[]{(Object)(_formula)});
 //BA.debugLineNum = 163;BA.debugLine="Return jname";
if (true) return _jname;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _createsheetwriterbyindex(int _sheetindex) throws Exception{
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
japam.sie.xlsheetwriter _writer = null;
 //BA.debugLineNum = 88;BA.debugLine="Public Sub CreateSheetWriterByIndex (SheetIndex As";
 //BA.debugLineNum = 89;BA.debugLine="Dim Sheet As PoiSheet = PoiWorkbook.GetSheet(Shee";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = _poiworkbook.GetSheet(_sheetindex);
 //BA.debugLineNum = 90;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new japam.sie.xlsheetwriter();
 //BA.debugLineNum = 91;BA.debugLine="writer.Initialize(xl, Me, Sheet)";
_writer._initialize /*String*/ (ba,_xl,(japam.sie.xlworkbookwriter)(this),_sheet);
 //BA.debugLineNum = 92;BA.debugLine="Return writer";
if (true) return _writer;
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlsheetwriter  _createsheetwriterbyname(String _sheetname) throws Exception{
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
japam.sie.xlsheetwriter _writer = null;
 //BA.debugLineNum = 77;BA.debugLine="Public Sub CreateSheetWriterByName (SheetName As S";
 //BA.debugLineNum = 78;BA.debugLine="Dim sheet As PoiSheet = PoiWorkbook.GetSheetByNam";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = _poiworkbook.GetSheetByName(_sheetname);
 //BA.debugLineNum = 79;BA.debugLine="If sheet.IsInitialized = False Then";
if (_sheet.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 80;BA.debugLine="sheet = PoiWorkbook.AddSheet(SheetName, PoiWorkb";
_sheet = _poiworkbook.AddSheet(_sheetname,_poiworkbook.getNumberOfSheets());
 };
 //BA.debugLineNum = 82;BA.debugLine="Dim writer As XLSheetWriter";
_writer = new japam.sie.xlsheetwriter();
 //BA.debugLineNum = 83;BA.debugLine="writer.Initialize(xl, Me, sheet)";
_writer._initialize /*String*/ (ba,_xl,(japam.sie.xlworkbookwriter)(this),_sheet);
 //BA.debugLineNum = 84;BA.debugLine="Return writer";
if (true) return _writer;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _createstyle() throws Exception{
japam.sie.xlstyle _style = null;
 //BA.debugLineNum = 123;BA.debugLine="Public Sub CreateStyle As XLStyle";
 //BA.debugLineNum = 124;BA.debugLine="Dim style As XLStyle";
_style = new japam.sie.xlstyle();
 //BA.debugLineNum = 125;BA.debugLine="style.Initialize (Me)";
_style._initialize /*japam.sie.xlstyle*/ (ba,(japam.sie.xlworkbookwriter)(this));
 //BA.debugLineNum = 126;BA.debugLine="Return style";
if (true) return _style;
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public String  _evaluateformulas() throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub EvaluateFormulas";
 //BA.debugLineNum = 131;BA.debugLine="jWorkbook.RunMethodJO(\"getCreationHelper\", Null).";
_jworkbook.RunMethodJO("getCreationHelper",(Object[])(__c.Null)).RunMethodJO("createFormulaEvaluator",(Object[])(__c.Null)).RunMethod("evaluateAll",(Object[])(__c.Null));
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public int  _getactivesheetindex() throws Exception{
 //BA.debugLineNum = 135;BA.debugLine="Public Sub getActiveSheetIndex As Int";
 //BA.debugLineNum = 136;BA.debugLine="Return jWorkbook.RunMethod(\"getActiveSheetIndex\",";
if (true) return (int)(BA.ObjectToNumber(_jworkbook.RunMethod("getActiveSheetIndex",(Object[])(__c.Null))));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4j.objects.PoiFontWrapper  _getfont(short _size,boolean _bold,String _name,boolean _italic,boolean _underline,int _indexedcolor) throws Exception{
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
 //BA.debugLineNum = 105;BA.debugLine="Public Sub GetFont (Size As Short, Bold As Boolean";
 //BA.debugLineNum = 106;BA.debugLine="For Each f As PoiFont In PoiWorkbook.Fonts";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _poiworkbook.getFonts();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_f = (anywheresoftware.b4j.objects.PoiFontWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiFontWrapper(), (org.apache.poi.ss.usermodel.Font)(group1.Get(index1)));
 //BA.debugLineNum = 107;BA.debugLine="If f.Size = Size And f.Bold = Bold And f.Name =";
if (_f.getSize()==_size && _f.getBold()==_bold && (_f.getName()).equals(_name) && _f.getItalic()==_italic && _f.getUnderline()==_underline && _f.getIndexedColor()==_indexedcolor) { 
 //BA.debugLineNum = 108;BA.debugLine="Return f";
if (true) return _f;
 };
 }
};
 //BA.debugLineNum = 111;BA.debugLine="Dim f As PoiFont";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
 //BA.debugLineNum = 112;BA.debugLine="f.Initialize(PoiWorkbook)";
_f.Initialize(_poiworkbook);
 //BA.debugLineNum = 113;BA.debugLine="f.Size = Size";
_f.setSize(_size);
 //BA.debugLineNum = 114;BA.debugLine="f.Bold = Bold";
_f.setBold(_bold);
 //BA.debugLineNum = 115;BA.debugLine="f.Name = Name";
_f.setName(_name);
 //BA.debugLineNum = 116;BA.debugLine="f.Italic = Italic";
_f.setItalic(_italic);
 //BA.debugLineNum = 117;BA.debugLine="f.Underline = Underline";
_f.setUnderline(_underline);
 //BA.debugLineNum = 118;BA.debugLine="f.IndexedColor = IndexedColor";
_f.setIndexedColor((short) (_indexedcolor));
 //BA.debugLineNum = 119;BA.debugLine="Return f";
if (true) return _f;
 //BA.debugLineNum = 120;BA.debugLine="End Sub";
return null;
}
public boolean  _getforceformularecalculation() throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Public Sub getForceFormulaRecalculation As Boolean";
 //BA.debugLineNum = 200;BA.debugLine="Return jWorkbook.RunMethod(\"getForceFormulaRecalc";
if (true) return BA.ObjectToBoolean(_jworkbook.RunMethod("getForceFormulaRecalculation",(Object[])(__c.Null)));
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return false;
}
public String  _getversionname() throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub getVersionName As String";
 //BA.debugLineNum = 47;BA.debugLine="Return mVersionName";
if (true) return _mversionname;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,japam.sie.xlutils _vxl,anywheresoftware.b4j.objects.PoiWorkbookWrapper _vworkbook,boolean _vfromtemplate) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize (vXL As XLUtils, vWorkbook A";
 //BA.debugLineNum = 23;BA.debugLine="xl = vXL";
_xl = _vxl;
 //BA.debugLineNum = 24;BA.debugLine="PoiWorkbook = vWorkbook";
_poiworkbook = _vworkbook;
 //BA.debugLineNum = 25;BA.debugLine="FromTemplate = vFromTemplate";
_fromtemplate = _vfromtemplate;
 //BA.debugLineNum = 26;BA.debugLine="jWorkbook = PoiWorkbook";
_jworkbook = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
 //BA.debugLineNum = 27;BA.debugLine="mVersionName = jWorkbook.RunMethodJO(\"getSpreadsh";
_mversionname = BA.ObjectToString(_jworkbook.RunMethodJO("getSpreadsheetVersion",(Object[])(__c.Null)).RunMethod("toString",(Object[])(__c.Null)));
 //BA.debugLineNum = 28;BA.debugLine="IsXLSX = mVersionName = \"EXCEL2007\"";
_isxlsx = (_mversionname).equals("EXCEL2007");
 //BA.debugLineNum = 29;BA.debugLine="If IsXLSX Then";
if (_isxlsx) { 
 //BA.debugLineNum = 30;BA.debugLine="MaxRows = 0x100000";
_maxrows = ((int)0x100000);
 //BA.debugLineNum = 31;BA.debugLine="MaxColumns = 0x4000";
_maxcolumns = ((int)0x4000);
 //BA.debugLineNum = 32;BA.debugLine="DefaultFontName = \"Calibri\"";
_defaultfontname = "Calibri";
 //BA.debugLineNum = 33;BA.debugLine="DefaultFontSize = 11";
_defaultfontsize = (short) (11);
 //BA.debugLineNum = 34;BA.debugLine="DefaultExtension = \".xlsx\"";
_defaultextension = ".xlsx";
 }else {
 //BA.debugLineNum = 36;BA.debugLine="MaxRows = 0x10000";
_maxrows = ((int)0x10000);
 //BA.debugLineNum = 37;BA.debugLine="MaxColumns = 0x0100";
_maxcolumns = ((int)0x0100);
 //BA.debugLineNum = 38;BA.debugLine="DefaultFontName = \"Arial\"";
_defaultfontname = "Arial";
 //BA.debugLineNum = 39;BA.debugLine="DefaultFontSize = 10";
_defaultfontsize = (short) (10);
 //BA.debugLineNum = 40;BA.debugLine="DefaultExtension = \".xls\"";
_defaultextension = ".xls";
 };
 //BA.debugLineNum = 42;BA.debugLine="InternalStylesCache.Initialize";
_internalstylescache.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _removenamedrange(String _name) throws Exception{
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4a.objects.collections.List _dontmodifylistwhileremoving = null;
Object _n = null;
 //BA.debugLineNum = 184;BA.debugLine="Public Sub RemoveNamedRange (Name As String)";
 //BA.debugLineNum = 185;BA.debugLine="Dim Names As List = jWorkbook.RunMethod(\"getNames";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jworkbook.RunMethod("getNames",new Object[]{(Object)(_name)})));
 //BA.debugLineNum = 186;BA.debugLine="Dim DontModifyListWhileRemoving As List";
_dontmodifylistwhileremoving = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 187;BA.debugLine="DontModifyListWhileRemoving.Initialize";
_dontmodifylistwhileremoving.Initialize();
 //BA.debugLineNum = 188;BA.debugLine="DontModifyListWhileRemoving.AddAll(Names)";
_dontmodifylistwhileremoving.AddAll(_names);
 //BA.debugLineNum = 189;BA.debugLine="For Each n As Object In DontModifyListWhileRemovi";
{
final anywheresoftware.b4a.BA.IterableList group5 = _dontmodifylistwhileremoving;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_n = group5.Get(index5);
 //BA.debugLineNum = 190;BA.debugLine="jWorkbook.RunMethod(\"removeName\", Array(n))";
_jworkbook.RunMethod("removeName",new Object[]{_n});
 }
};
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _removesheetat(int _index) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Public Sub RemoveSheetAt (Index As Int)";
 //BA.debugLineNum = 195;BA.debugLine="jWorkbook.RunMethod(\"removeSheetAt\", Array(Index)";
_jworkbook.RunMethod("removeSheetAt",new Object[]{(Object)(_index)});
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public String  _saveas(String _dir,String _filename,boolean _renameifneeded) throws Exception{
String _orig = "";
String _extension = "";
int _i = 0;
String _f = "";
 //BA.debugLineNum = 52;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
 //BA.debugLineNum = 53;BA.debugLine="If RenameIfNeeded Then";
if (_renameifneeded) { 
 //BA.debugLineNum = 54;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
_orig = __c.File.Combine(_dir,_filename);
 //BA.debugLineNum = 55;BA.debugLine="Dim extension As String";
_extension = "";
 //BA.debugLineNum = 56;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
_i = _orig.lastIndexOf(".");
 //BA.debugLineNum = 57;BA.debugLine="If i >-1 Then";
if (_i>-1) { 
 //BA.debugLineNum = 58;BA.debugLine="extension = orig.SubString(i)";
_extension = _orig.substring(_i);
 //BA.debugLineNum = 59;BA.debugLine="orig = orig.SubString2(0, i)";
_orig = _orig.substring((int) (0),_i);
 };
 //BA.debugLineNum = 61;BA.debugLine="For i = 0 To 10";
{
final int step9 = 1;
final int limit9 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 62;BA.debugLine="Dim f As String";
_f = "";
 //BA.debugLineNum = 63;BA.debugLine="Try";
try { //BA.debugLineNum = 64;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
if (_i==0) { 
_f = _orig+_extension;}
else {
_f = _orig+" ("+BA.NumberToString(_i)+")"+_extension;};
 //BA.debugLineNum = 65;BA.debugLine="PoiWorkbook.Save(f, \"\")";
_poiworkbook.Save(_f,"");
 //BA.debugLineNum = 66;BA.debugLine="Return f";
if (true) return _f;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 68;BA.debugLine="Log(\"Failed: \" & f)";
__c.LogImpl("954329360","Failed: "+_f,0);
 };
 }
};
 };
 //BA.debugLineNum = 72;BA.debugLine="PoiWorkbook.Save(Dir, FileName)";
_poiworkbook.Save(_dir,_filename);
 //BA.debugLineNum = 73;BA.debugLine="Return File.Combine(Dir, FileName)";
if (true) return __c.File.Combine(_dir,_filename);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setactivesheetindex(int _i) throws Exception{
int _ii = 0;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 139;BA.debugLine="Public Sub setActiveSheetIndex (i As Int)";
 //BA.debugLineNum = 140;BA.debugLine="For ii = 0 To PoiWorkbook.NumberOfSheets - 1";
{
final int step1 = 1;
final int limit1 = (int) (_poiworkbook.getNumberOfSheets()-1);
_ii = (int) (0) ;
for (;_ii <= limit1 ;_ii = _ii + step1 ) {
 //BA.debugLineNum = 141;BA.debugLine="Dim jo As JavaObject = PoiWorkbook.GetSheet(ii)";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.GetSheet(_ii).getObject()));
 //BA.debugLineNum = 142;BA.debugLine="jo.RunMethod(\"setSelected\", Array(False))";
_jo.RunMethod("setSelected",new Object[]{(Object)(__c.False)});
 }
};
 //BA.debugLineNum = 144;BA.debugLine="jWorkbook.RunMethod(\"setActiveSheet\", Array(i))";
_jworkbook.RunMethod("setActiveSheet",new Object[]{(Object)(_i)});
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return "";
}
public String  _setforceformularecalculation(boolean _b) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Public Sub setForceFormulaRecalculation (b As Bool";
 //BA.debugLineNum = 204;BA.debugLine="jWorkbook.RunMethod(\"setForceFormulaRecalculation";
_jworkbook.RunMethod("setForceFormulaRecalculation",new Object[]{(Object)(_b)});
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
