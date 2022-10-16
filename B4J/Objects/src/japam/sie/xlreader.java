package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlreader extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlreader", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlreader.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object[] _emptyrow = null;
public String _password = "";
public japam.sie.xlutils _xl = null;
public Object _missingcellvalue = null;
public boolean _fetchformulasinsteadofcachedvalues = false;
public boolean _fetchhyperlinks = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public Object  _celltoobject(anywheresoftware.b4j.objects.PoiCellWrapper _cell,japam.sie.xlreaderresult _result) throws Exception{
anywheresoftware.b4j.object.JavaObject _jcell = null;
anywheresoftware.b4j.object.JavaObject _hyperlink = null;
japam.sie.xlreaderresult._xlhyperlink _h = null;
anywheresoftware.b4j.object.JavaObject _celladdress = null;
 //BA.debugLineNum = 168;BA.debugLine="Private Sub CellToObject (cell As PoiCell, Result";
 //BA.debugLineNum = 169;BA.debugLine="If cell.IsInitialized = False Then Return Missing";
if (_cell.IsInitialized()==__c.False) { 
if (true) return _missingcellvalue;};
 //BA.debugLineNum = 170;BA.debugLine="If FetchHyperlinks Then";
if (_fetchhyperlinks) { 
 //BA.debugLineNum = 171;BA.debugLine="Dim jcell As JavaObject = cell";
_jcell = new anywheresoftware.b4j.object.JavaObject();
_jcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_cell.getObject()));
 //BA.debugLineNum = 172;BA.debugLine="Dim hyperlink As JavaObject = jcell.RunMethod(\"g";
_hyperlink = new anywheresoftware.b4j.object.JavaObject();
_hyperlink = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcell.RunMethod("getHyperlink",(Object[])(__c.Null))));
 //BA.debugLineNum = 173;BA.debugLine="If hyperlink.IsInitialized Then";
if (_hyperlink.IsInitialized()) { 
 //BA.debugLineNum = 174;BA.debugLine="Dim h As XLHyperlink";
_h = new japam.sie.xlreaderresult._xlhyperlink();
 //BA.debugLineNum = 175;BA.debugLine="h.Initialize";
_h.Initialize();
 //BA.debugLineNum = 176;BA.debugLine="h.Address = ObjectToString(hyperlink.RunMethod(";
_h.Address /*String*/  = _objecttostring(_hyperlink.RunMethod("getAddress",(Object[])(__c.Null)));
 //BA.debugLineNum = 177;BA.debugLine="h.Label = ObjectToString(hyperlink.RunMethod(\"g";
_h.Label /*String*/  = _objecttostring(_hyperlink.RunMethod("getLabel",(Object[])(__c.Null)));
 //BA.debugLineNum = 178;BA.debugLine="h.LinkType = hyperlink.RunMethod(\"getType\", Nul";
_h.LinkType /*String*/  = BA.ObjectToString(_hyperlink.RunMethod("getType",(Object[])(__c.Null)));
 //BA.debugLineNum = 179;BA.debugLine="Dim CellAddress As JavaObject = jcell.RunMethod";
_celladdress = new anywheresoftware.b4j.object.JavaObject();
_celladdress = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jcell.RunMethod("getAddress",(Object[])(__c.Null))));
 //BA.debugLineNum = 180;BA.debugLine="Result.Hyperlinks.Put(CellAddress.RunMethod(\"fo";
_result._hyperlinks /*anywheresoftware.b4a.objects.collections.Map*/ .Put(_celladdress.RunMethod("formatAsString",(Object[])(__c.Null)),(Object)(_h));
 };
 };
 //BA.debugLineNum = 183;BA.debugLine="If FetchFormulasInsteadOfCachedValues Then Return";
if (_fetchformulasinsteadofcachedvalues) { 
if (true) return _cell.getValue();}
else {
if (true) return _cell.getValueCached();};
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private EmptyRow() As Object";
_emptyrow = new Object[(int) (0)];
{
int d0 = _emptyrow.length;
for (int i0 = 0;i0 < d0;i0++) {
_emptyrow[i0] = new Object();
}
}
;
 //BA.debugLineNum = 3;BA.debugLine="Public Password As String";
_password = "";
 //BA.debugLineNum = 4;BA.debugLine="Private xl As XLUtils 'ignore";
_xl = new japam.sie.xlutils();
 //BA.debugLineNum = 5;BA.debugLine="Private MissingCellValue As Object = \"\"";
_missingcellvalue = (Object)("");
 //BA.debugLineNum = 6;BA.debugLine="Public FetchFormulasInsteadOfCachedValues As Bool";
_fetchformulasinsteadofcachedvalues = false;
 //BA.debugLineNum = 7;BA.debugLine="Public FetchHyperlinks As Boolean";
_fetchhyperlinks = false;
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public void  _closewbaftersleep(anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) throws Exception{
ResumableSub_CloseWBAfterSleep rsub = new ResumableSub_CloseWBAfterSleep(this,_wb);
rsub.resume(ba, null);
}
public static class ResumableSub_CloseWBAfterSleep extends BA.ResumableSub {
public ResumableSub_CloseWBAfterSleep(japam.sie.xlreader parent,anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) {
this.parent = parent;
this._wb = _wb;
}
japam.sie.xlreader parent;
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 34;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 7;
return;
case 7:
//C
this.state = 1;
;
 //BA.debugLineNum = 35;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 6;
this.catchState = 5;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 6;
this.catchState = 5;
 //BA.debugLineNum = 36;BA.debugLine="wb.Close";
_wb.Close();
 if (true) break;

case 5:
//C
this.state = 6;
this.catchState = 0;
 //BA.debugLineNum = 38;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("945547525",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 6:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public japam.sie.xlreaderresult  _createxlreaderresult(anywheresoftware.b4a.objects.collections.List _data,japam.sie.xlutils._xladdress _topleft,String _name) throws Exception{
japam.sie.xlreaderresult _t1 = null;
 //BA.debugLineNum = 191;BA.debugLine="Private Sub CreateXLReaderResult (Data As List, To";
 //BA.debugLineNum = 192;BA.debugLine="Dim t1 As XLReaderResult";
_t1 = new japam.sie.xlreaderresult();
 //BA.debugLineNum = 193;BA.debugLine="t1.Initialize(xl)";
_t1._initialize /*String*/ (ba,_xl);
 //BA.debugLineNum = 194;BA.debugLine="t1.Data = Data";
_t1._data /*anywheresoftware.b4a.objects.collections.List*/  = _data;
 //BA.debugLineNum = 195;BA.debugLine="t1.TopLeft = TopLeft";
_t1._topleft /*japam.sie.xlutils._xladdress*/  = _topleft;
 //BA.debugLineNum = 196;BA.debugLine="t1.Name = Name";
_t1._name /*String*/  = _name;
 //BA.debugLineNum = 197;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,japam.sie.xlutils _vxl) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
 //BA.debugLineNum = 12;BA.debugLine="xl = vXL";
_xl = _vxl;
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _objecttostring(Object _o) throws Exception{
 //BA.debugLineNum = 186;BA.debugLine="Private Sub ObjectToString(o As Object) As String";
 //BA.debugLineNum = 187;BA.debugLine="If o = Null Then Return \"\"";
if (_o== null) { 
if (true) return "";};
 //BA.debugLineNum = 188;BA.debugLine="Return o";
if (true) return BA.ObjectToString(_o);
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PoiWorkbookWrapper  _openworkbook(String _dir,String _filename) throws Exception{
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
 //BA.debugLineNum = 21;BA.debugLine="Private Sub OpenWorkbook (Dir As String, FileName";
 //BA.debugLineNum = 22;BA.debugLine="If Dir = \"\" Then";
if ((_dir).equals("")) { 
 //BA.debugLineNum = 23;BA.debugLine="Dir = FileName";
_dir = _filename;
 //BA.debugLineNum = 24;BA.debugLine="FileName = \"\"";
_filename = "";
 };
 //BA.debugLineNum = 26;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
 //BA.debugLineNum = 27;BA.debugLine="wb.InitializeExisting(Dir, FileName, Password, Tr";
_wb.InitializeExisting(_dir,_filename,_password,__c.True);
 //BA.debugLineNum = 28;BA.debugLine="CloseWBAfterSleep(wb)";
_closewbaftersleep(_wb);
 //BA.debugLineNum = 29;BA.debugLine="Return wb";
if (true) return _wb;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult  _rangetoresult(japam.sie.xlutils._xlrange _range) throws Exception{
int _left = 0;
int _right = 0;
int _top = 0;
int _bottom = 0;
anywheresoftware.b4a.objects.collections.List _rows = null;
japam.sie.xlreaderresult _res = null;
int _r = 0;
Object[] _row = null;
anywheresoftware.b4j.objects.PoiRowWrapper _prow = null;
int _c = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _cell = null;
 //BA.debugLineNum = 88;BA.debugLine="Public Sub RangeToResult (range As XLRange) As XLR";
 //BA.debugLineNum = 89;BA.debugLine="Dim left = Min(range.FirstAddress.Col0Based, rang";
_left = (int) (__c.Min(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ,_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ));
_right = (int) (__c.Max(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ,_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ));
_top = (int) (__c.Min(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ,_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ));
_bottom = (int) (__c.Max(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ,_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ));
 //BA.debugLineNum = 91;BA.debugLine="left = Max(0, left)";
_left = (int) (__c.Max(0,_left));
 //BA.debugLineNum = 92;BA.debugLine="bottom = Max(0, Min(range.sheet.LastRowNumber, bo";
_bottom = (int) (__c.Max(0,__c.Min(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getLastRowNumber(),_bottom)));
 //BA.debugLineNum = 93;BA.debugLine="right = Max(right, left)";
_right = (int) (__c.Max(_right,_left));
 //BA.debugLineNum = 94;BA.debugLine="top = Max(0, Min(top, bottom))";
_top = (int) (__c.Max(0,__c.Min(_top,_bottom)));
 //BA.debugLineNum = 95;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 96;BA.debugLine="rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 97;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
_res = _createxlreaderresult(_rows,_xl._addresszero /*japam.sie.xlutils._xladdress*/ (_left,_top),_range.Name /*String*/ );
 //BA.debugLineNum = 98;BA.debugLine="For r = top To bottom";
{
final int step9 = 1;
final int limit9 = _bottom;
_r = _top ;
for (;_r <= limit9 ;_r = _r + step9 ) {
 //BA.debugLineNum = 99;BA.debugLine="Dim row(right - left + 1) As Object";
_row = new Object[(int) (_right-_left+1)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
 //BA.debugLineNum = 100;BA.debugLine="Dim prow As PoiRow = range.sheet.GetRow(r)";
_prow = new anywheresoftware.b4j.objects.PoiRowWrapper();
_prow = _range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .GetRow(_r);
 //BA.debugLineNum = 101;BA.debugLine="If prow.IsInitialized = False Then";
if (_prow.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 102;BA.debugLine="For c = left To right";
{
final int step13 = 1;
final int limit13 = _right;
_c = _left ;
for (;_c <= limit13 ;_c = _c + step13 ) {
 //BA.debugLineNum = 103;BA.debugLine="row(c - left) = MissingCellValue";
_row[(int) (_c-_left)] = _missingcellvalue;
 }
};
 }else {
 //BA.debugLineNum = 106;BA.debugLine="For c = left To right";
{
final int step17 = 1;
final int limit17 = _right;
_c = _left ;
for (;_c <= limit17 ;_c = _c + step17 ) {
 //BA.debugLineNum = 107;BA.debugLine="Dim cell As PoiCell = prow.GetCell(c)";
_cell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_cell = _prow.GetCell(_c);
 //BA.debugLineNum = 108;BA.debugLine="row(c - left) = CellToObject(cell, res)";
_row[(int) (_c-_left)] = _celltoobject(_cell,_res);
 }
};
 };
 //BA.debugLineNum = 111;BA.debugLine="rows.Add(row)";
_rows.Add((Object)(_row));
 }
};
 //BA.debugLineNum = 113;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
if (true) return _removeemptyrowsfromendandsetbottomright(_res);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readall(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Public Sub ReadAll (Dir As String, FileName As Str";
 //BA.debugLineNum = 18;BA.debugLine="Return ReadWorkbook(OpenWorkbook(Dir, FileName))";
if (true) return _readworkbook(_openworkbook(_dir,_filename));
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult  _readrange(String _dir,String _filename,String _range) throws Exception{
anywheresoftware.b4a.objects.collections.List _om = null;
 //BA.debugLineNum = 70;BA.debugLine="Public Sub ReadRange (Dir As String, FileName As S";
 //BA.debugLineNum = 71;BA.debugLine="Dim om As List = ReadRanges(Dir, FileName, Array(";
_om = new anywheresoftware.b4a.objects.collections.List();
_om = _readranges(_dir,_filename,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_range)}));
 //BA.debugLineNum = 72;BA.debugLine="Return om.Get(0)";
if (true) return (japam.sie.xlreaderresult)(_om.Get((int) (0)));
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readranges(String _dir,String _filename,anywheresoftware.b4a.objects.collections.List _ranges) throws Exception{
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
anywheresoftware.b4a.objects.collections.List _result = null;
String _range = "";
 //BA.debugLineNum = 76;BA.debugLine="Public Sub ReadRanges(Dir As String, FileName As S";
 //BA.debugLineNum = 77;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = _openworkbook(_dir,_filename);
 //BA.debugLineNum = 78;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 79;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 80;BA.debugLine="For Each Range As String In Ranges";
{
final anywheresoftware.b4a.BA.IterableList group4 = _ranges;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_range = BA.ObjectToString(group4.Get(index4));
 //BA.debugLineNum = 81;BA.debugLine="result.Add(RangeToResult(xl.RangeStringOrNameToR";
_result.Add((Object)(_rangetoresult(_xl._rangestringornametorange /*japam.sie.xlutils._xlrange*/ (_wb,_range))));
 }
};
 //BA.debugLineNum = 83;BA.debugLine="wb.Close";
_wb.Close();
 //BA.debugLineNum = 84;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult  _readsheetbyindex(String _dir,String _filename,int _sheetindex) throws Exception{
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
japam.sie.xlreaderresult _res = null;
 //BA.debugLineNum = 54;BA.debugLine="Public Sub ReadSheetByIndex (Dir As String, FileNa";
 //BA.debugLineNum = 55;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = _openworkbook(_dir,_filename);
 //BA.debugLineNum = 56;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
_res = _sheettoresult(_wb.GetSheet(_sheetindex));
 //BA.debugLineNum = 57;BA.debugLine="wb.Close";
_wb.Close();
 //BA.debugLineNum = 58;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult  _readsheetbyname(String _dir,String _filename,String _sheetname) throws Exception{
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
japam.sie.xlreaderresult _res = null;
 //BA.debugLineNum = 62;BA.debugLine="Public Sub ReadSheetByName (Dir As String, FileNam";
 //BA.debugLineNum = 63;BA.debugLine="Dim wb As PoiWorkbook = OpenWorkbook(Dir, FileNam";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
_wb = _openworkbook(_dir,_filename);
 //BA.debugLineNum = 64;BA.debugLine="Dim res As XLReaderResult = SheetToResult(wb.GetS";
_res = _sheettoresult(_wb.GetSheetByName(_sheetname));
 //BA.debugLineNum = 65;BA.debugLine="wb.Close";
_wb.Close();
 //BA.debugLineNum = 66;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _readworkbook(anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
int _i = 0;
anywheresoftware.b4j.objects.PoiSheetWrapper _sheet = null;
 //BA.debugLineNum = 42;BA.debugLine="Private Sub ReadWorkbook (wb As PoiWorkbook) As Li";
 //BA.debugLineNum = 43;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 44;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="For i = 0 To wb.NumberOfSheets - 1";
{
final int step3 = 1;
final int limit3 = (int) (_wb.getNumberOfSheets()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 46;BA.debugLine="Dim sheet As PoiSheet = wb.GetSheet(i)";
_sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
_sheet = _wb.GetSheet(_i);
 //BA.debugLineNum = 47;BA.debugLine="res.add(SheetToResult(sheet))";
_res.Add((Object)(_sheettoresult(_sheet)));
 }
};
 //BA.debugLineNum = 49;BA.debugLine="wb.Close";
_wb.Close();
 //BA.debugLineNum = 50;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult  _removeemptyrowsfromendandsetbottomright(japam.sie.xlreaderresult _res) throws Exception{
Object[] _lastrow = null;
 //BA.debugLineNum = 152;BA.debugLine="Private Sub RemoveEmptyRowsFromEndAndSetBottomRigh";
 //BA.debugLineNum = 153;BA.debugLine="Do While res.Data.Size > 0";
while (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) {
 //BA.debugLineNum = 154;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
_lastrow = (Object[])(_res._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
 //BA.debugLineNum = 155;BA.debugLine="If lastrow.Length = 0 Then";
if (_lastrow.length==0) { 
 //BA.debugLineNum = 156;BA.debugLine="res.Data.RemoveAt(res.Data.Size - 1)";
_res._data /*anywheresoftware.b4a.objects.collections.List*/ .RemoveAt((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 }else {
 //BA.debugLineNum = 158;BA.debugLine="Exit";
if (true) break;
 };
 }
;
 //BA.debugLineNum = 161;BA.debugLine="If res.Data.Size > 0 Then";
if (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
 //BA.debugLineNum = 162;BA.debugLine="Dim lastrow() As Object = res.Data.Get(res.Data.";
_lastrow = (Object[])(_res._data /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
 //BA.debugLineNum = 163;BA.debugLine="res.BottomRight = xl.AddressZero(res.TopLeft.Col";
_res._bottomright /*japam.sie.xlutils._xladdress*/  = _xl._addresszero /*japam.sie.xlutils._xladdress*/ ((int) (_res._topleft /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ +_lastrow.length-1),(int) (_res._topleft /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ +_res._data /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1));
 };
 //BA.debugLineNum = 165;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult  _sheettoresult(anywheresoftware.b4j.objects.PoiSheetWrapper _sheet) throws Exception{
anywheresoftware.b4a.objects.collections.List _rows = null;
japam.sie.xlreaderresult _res = null;
int _lastrowindex = 0;
int _r = 0;
anywheresoftware.b4j.objects.PoiRowWrapper _prow = null;
anywheresoftware.b4a.objects.collections.List _cells = null;
anywheresoftware.b4j.objects.PoiCellWrapper _lastcell = null;
Object[] _row = null;
int _currentcellindex = 0;
anywheresoftware.b4j.objects.PoiCellWrapper _currentcell = null;
int _c = 0;
 //BA.debugLineNum = 117;BA.debugLine="Public Sub SheetToResult (sheet As PoiSheet) As XL";
 //BA.debugLineNum = 118;BA.debugLine="Dim rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 119;BA.debugLine="rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="Dim res As XLReaderResult = CreateXLReaderResult(";
_res = _createxlreaderresult(_rows,_xl._addresszero /*japam.sie.xlutils._xladdress*/ ((int) (0),(int) (0)),_sheet.getName());
 //BA.debugLineNum = 121;BA.debugLine="Dim LastRowIndex As Int = sheet.LastRowNumber";
_lastrowindex = _sheet.getLastRowNumber();
 //BA.debugLineNum = 122;BA.debugLine="For r = 0 To LastRowIndex";
{
final int step5 = 1;
final int limit5 = _lastrowindex;
_r = (int) (0) ;
for (;_r <= limit5 ;_r = _r + step5 ) {
 //BA.debugLineNum = 123;BA.debugLine="Dim prow As PoiRow = sheet.GetRow(r)";
_prow = new anywheresoftware.b4j.objects.PoiRowWrapper();
_prow = _sheet.GetRow(_r);
 //BA.debugLineNum = 124;BA.debugLine="If prow.IsInitialized = False Then";
if (_prow.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 125;BA.debugLine="rows.Add(EmptyRow)";
_rows.Add((Object)(_emptyrow));
 //BA.debugLineNum = 126;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 128;BA.debugLine="Dim cells As List = prow.Cells";
_cells = new anywheresoftware.b4a.objects.collections.List();
_cells = _prow.getCells();
 //BA.debugLineNum = 129;BA.debugLine="If cells.Size = 0 Then";
if (_cells.getSize()==0) { 
 //BA.debugLineNum = 130;BA.debugLine="rows.Add(EmptyRow)";
_rows.Add((Object)(_emptyrow));
 //BA.debugLineNum = 131;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 133;BA.debugLine="Dim LastCell As PoiCell = cells.Get(cells.Size -";
_lastcell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_lastcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get((int) (_cells.getSize()-1))));
 //BA.debugLineNum = 134;BA.debugLine="Dim row(LastCell.ColumnIndex + 1) As Object";
_row = new Object[(int) (_lastcell.getColumnIndex()+1)];
{
int d0 = _row.length;
for (int i0 = 0;i0 < d0;i0++) {
_row[i0] = new Object();
}
}
;
 //BA.debugLineNum = 135;BA.debugLine="Dim CurrentCellIndex As Int = 0";
_currentcellindex = (int) (0);
 //BA.debugLineNum = 136;BA.debugLine="Dim CurrentCell As PoiCell = cells.Get(CurrentCe";
_currentcell = new anywheresoftware.b4j.objects.PoiCellWrapper();
_currentcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get(_currentcellindex)));
 //BA.debugLineNum = 137;BA.debugLine="For c = 0 To row.Length - 1";
{
final int step20 = 1;
final int limit20 = (int) (_row.length-1);
_c = (int) (0) ;
for (;_c <= limit20 ;_c = _c + step20 ) {
 //BA.debugLineNum = 138;BA.debugLine="If c = CurrentCell.ColumnIndex Then";
if (_c==_currentcell.getColumnIndex()) { 
 //BA.debugLineNum = 139;BA.debugLine="row(c) = CellToObject(CurrentCell, res)";
_row[_c] = _celltoobject(_currentcell,_res);
 //BA.debugLineNum = 140;BA.debugLine="CurrentCellIndex = CurrentCellIndex + 1";
_currentcellindex = (int) (_currentcellindex+1);
 //BA.debugLineNum = 141;BA.debugLine="If CurrentCellIndex = cells.Size Then Exit";
if (_currentcellindex==_cells.getSize()) { 
if (true) break;};
 //BA.debugLineNum = 142;BA.debugLine="CurrentCell = cells.Get(CurrentCellIndex)";
_currentcell = (anywheresoftware.b4j.objects.PoiCellWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.PoiCellWrapper(), (org.apache.poi.ss.usermodel.Cell)(_cells.Get(_currentcellindex)));
 }else {
 //BA.debugLineNum = 144;BA.debugLine="row(c) = MissingCellValue";
_row[_c] = _missingcellvalue;
 };
 }
};
 //BA.debugLineNum = 147;BA.debugLine="rows.Add(row)";
_rows.Add((Object)(_row));
 }
};
 //BA.debugLineNum = 149;BA.debugLine="Return RemoveEmptyRowsFromEndAndSetBottomRight(re";
if (true) return _removeemptyrowsfromendandsetbottomright(_res);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
