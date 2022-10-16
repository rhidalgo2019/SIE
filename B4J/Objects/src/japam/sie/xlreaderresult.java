package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlreaderresult extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlreaderresult", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlreaderresult.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _data = null;
public japam.sie.xlutils._xladdress _topleft = null;
public japam.sie.xlutils._xladdress _bottomright = null;
public String _name = "";
public japam.sie.xlutils _xl = null;
public Object _defaultemptycellvalue = null;
public anywheresoftware.b4a.objects.collections.Map _hyperlinks = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public static class _xlhyperlink{
public boolean IsInitialized;
public String LinkType;
public String Address;
public String Label;
public void Initialize() {
IsInitialized = true;
LinkType = "";
Address = "";
Label = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Data As List";
_data = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 3;BA.debugLine="Public TopLeft As XLAddress";
_topleft = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 4;BA.debugLine="Public BottomRight As XLAddress";
_bottomright = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 5;BA.debugLine="Public Name As String";
_name = "";
 //BA.debugLineNum = 6;BA.debugLine="Private xl As XLUtils";
_xl = new japam.sie.xlutils();
 //BA.debugLineNum = 7;BA.debugLine="Public DefaultEmptyCellValue As Object = \"\"";
_defaultemptycellvalue = (Object)("");
 //BA.debugLineNum = 9;BA.debugLine="Type XLHyperlink (LinkType As String, Address As";
;
 //BA.debugLineNum = 10;BA.debugLine="Public Hyperlinks As Map";
_hyperlinks = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public Object  _get(japam.sie.xlutils._xladdress _address) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Public Sub Get(Address As XLAddress) As Object";
 //BA.debugLineNum = 63;BA.debugLine="Return GetDefault(Address, DefaultEmptyCellValue)";
if (true) return _getdefault(_address,_defaultemptycellvalue);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public Object  _getdefault(japam.sie.xlutils._xladdress _address,Object _defaultvalue) throws Exception{
int _row = 0;
int _col = 0;
Object[] _rrow = null;
Object _res = null;
 //BA.debugLineNum = 78;BA.debugLine="Public Sub GetDefault(Address As XLAddress, Defaul";
 //BA.debugLineNum = 79;BA.debugLine="Dim row As Int = Address.Row0Based - TopLeft.Row0";
_row = (int) (_address.Row0Based /*int*/ -_topleft.Row0Based /*int*/ );
 //BA.debugLineNum = 80;BA.debugLine="Dim col As Int = Address.Col0Based - TopLeft.Col0";
_col = (int) (_address.Col0Based /*int*/ -_topleft.Col0Based /*int*/ );
 //BA.debugLineNum = 81;BA.debugLine="If col < 0 Or row < 0 Or row >= Data.Size Then Re";
if (_col<0 || _row<0 || _row>=_data.getSize()) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 82;BA.debugLine="Dim rrow() As Object = Data.Get(row)";
_rrow = (Object[])(_data.Get(_row));
 //BA.debugLineNum = 83;BA.debugLine="If rrow.Length <= col Then Return DefaultValue";
if (_rrow.length<=_col) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 84;BA.debugLine="Dim res As Object = rrow(col)";
_res = _rrow[_col];
 //BA.debugLineNum = 85;BA.debugLine="If res = \"\" Then Return DefaultValue";
if ((_res).equals((Object)(""))) { 
if (true) return _defaultvalue;};
 //BA.debugLineNum = 86;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlreaderresult._xlhyperlink  _gethyperlink(japam.sie.xlutils._xladdress _address) throws Exception{
String _a = "";
japam.sie.xlreaderresult._xlhyperlink _empty = null;
 //BA.debugLineNum = 67;BA.debugLine="Public Sub GetHyperlink(Address As XLAddress) As X";
 //BA.debugLineNum = 68;BA.debugLine="Dim a As String = xl.AddressToString(Address)";
_a = _xl._addresstostring /*String*/ (_address);
 //BA.debugLineNum = 69;BA.debugLine="If Hyperlinks.ContainsKey(a) Then";
if (_hyperlinks.ContainsKey((Object)(_a))) { 
 //BA.debugLineNum = 70;BA.debugLine="Return Hyperlinks.Get(a)";
if (true) return (japam.sie.xlreaderresult._xlhyperlink)(_hyperlinks.Get((Object)(_a)));
 };
 //BA.debugLineNum = 72;BA.debugLine="Dim Empty As XLHyperlink";
_empty = new japam.sie.xlreaderresult._xlhyperlink();
 //BA.debugLineNum = 73;BA.debugLine="Return Empty";
if (true) return _empty;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,japam.sie.xlutils _vxl) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize (vXL As XLUtils)";
 //BA.debugLineNum = 14;BA.debugLine="xl = vXL";
_xl = _vxl;
 //BA.debugLineNum = 15;BA.debugLine="Hyperlinks.Initialize";
_hyperlinks.Initialize();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _logresult(boolean _withcontent) throws Exception{
boolean _isrectangle = false;
int _length = 0;
Object[] _first = null;
Object[] _row = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
boolean _firstcell = false;
Object _cell = null;
 //BA.debugLineNum = 20;BA.debugLine="Public Sub LogResult (WithContent As Boolean)";
 //BA.debugLineNum = 21;BA.debugLine="Log($\"*** ${Name} ***\"$)";
__c.LogImpl("946465025",("*** "+__c.SmartStringFormatter("",(Object)(_name))+" ***"),0);
 //BA.debugLineNum = 22;BA.debugLine="Log($\"Number of rows: ${Data.Size}\"$)";
__c.LogImpl("946465026",("Number of rows: "+__c.SmartStringFormatter("",(Object)(_data.getSize()))+""),0);
 //BA.debugLineNum = 23;BA.debugLine="If Data.Size > 0 Then";
if (_data.getSize()>0) { 
 //BA.debugLineNum = 24;BA.debugLine="Dim IsRectangle As Boolean = True";
_isrectangle = __c.True;
 //BA.debugLineNum = 25;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 26;BA.debugLine="Dim first() As Object = Data.Get(0)";
_first = (Object[])(_data.Get((int) (0)));
 //BA.debugLineNum = 27;BA.debugLine="length = first.Length";
_length = _first.length;
 //BA.debugLineNum = 28;BA.debugLine="For Each row() As Object In Data";
{
final anywheresoftware.b4a.BA.IterableList group8 = _data;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_row = (Object[])(group8.Get(index8));
 //BA.debugLineNum = 29;BA.debugLine="If row.Length <> length Then";
if (_row.length!=_length) { 
 //BA.debugLineNum = 30;BA.debugLine="IsRectangle = False";
_isrectangle = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 34;BA.debugLine="Log($\"Is rectangle region: ${IsRectangle}\"$)";
__c.LogImpl("946465038",("Is rectangle region: "+__c.SmartStringFormatter("",(Object)(_isrectangle))+""),0);
 //BA.debugLineNum = 35;BA.debugLine="Log($\"${xl.AddressToString(TopLeft)} -> ${xl.Add";
__c.LogImpl("946465039",(""+__c.SmartStringFormatter("",(Object)(_xl._addresstostring /*String*/ (_topleft)))+" -> "+__c.SmartStringFormatter("",(Object)(_xl._addresstostring /*String*/ (_bottomright)))+""),0);
 //BA.debugLineNum = 36;BA.debugLine="If WithContent Then";
if (_withcontent) { 
 //BA.debugLineNum = 37;BA.debugLine="Log(\"Content:\")";
__c.LogImpl("946465041","Content:",0);
 //BA.debugLineNum = 38;BA.debugLine="For Each row() As Object In Data";
{
final anywheresoftware.b4a.BA.IterableList group18 = _data;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_row = (Object[])(group18.Get(index18));
 //BA.debugLineNum = 39;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 40;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 41;BA.debugLine="Dim firstcell As Boolean = True";
_firstcell = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="If row.Length = 0 Then";
if (_row.length==0) { 
 //BA.debugLineNum = 43;BA.debugLine="sb.Append(\"(empty row)\")";
_sb.Append("(empty row)");
 }else {
 //BA.debugLineNum = 45;BA.debugLine="For Each cell As Object In row";
{
final Object[] group25 = _row;
final int groupLen25 = group25.length
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_cell = group25[index25];
 //BA.debugLineNum = 46;BA.debugLine="If firstcell = False Then sb.Append(\", \") El";
if (_firstcell==__c.False) { 
_sb.Append(", ");}
else {
_firstcell = __c.False;};
 //BA.debugLineNum = 47;BA.debugLine="If cell = \"\" Then cell = DefaultEmptyCellVal";
if ((_cell).equals((Object)(""))) { 
_cell = _defaultemptycellvalue;};
 //BA.debugLineNum = 48;BA.debugLine="If cell Is Long Then";
if (_cell instanceof Long) { 
 //BA.debugLineNum = 49;BA.debugLine="sb.Append(DateTime.Date(cell))";
_sb.Append(__c.DateTime.Date(BA.ObjectToLongNumber(_cell)));
 }else {
 //BA.debugLineNum = 51;BA.debugLine="sb.Append(cell)";
_sb.Append(BA.ObjectToString(_cell));
 };
 }
};
 };
 //BA.debugLineNum = 55;BA.debugLine="Log(sb.ToString)";
__c.LogImpl("946465059",_sb.ToString(),0);
 }
};
 };
 };
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
