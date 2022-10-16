package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlutils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlutils", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlutils.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public japam.sie.xlreader _reader = null;
public String _createwriterpassword = "";
public short _color_black = (short)0;
public short _color_white = (short)0;
public short _color_red = (short)0;
public short _color_bright_green = (short)0;
public short _color_blue = (short)0;
public short _color_yellow = (short)0;
public short _color_pink = (short)0;
public short _color_turquoise = (short)0;
public short _color_dark_red = (short)0;
public short _color_green = (short)0;
public short _color_dark_blue = (short)0;
public short _color_dark_yellow = (short)0;
public short _color_violet = (short)0;
public short _color_teal = (short)0;
public short _color_grey_25_percent = (short)0;
public short _color_grey_50_percent = (short)0;
public short _color_cornflower_blue = (short)0;
public short _color_maroon = (short)0;
public short _color_lemon_chiffon = (short)0;
public short _color_light_turquoise1 = (short)0;
public short _color_orchid = (short)0;
public short _color_coral = (short)0;
public short _color_royal_blue = (short)0;
public short _color_light_cornflower_blue = (short)0;
public short _color_sky_blue = (short)0;
public short _color_light_turquoise = (short)0;
public short _color_light_green = (short)0;
public short _color_light_yellow = (short)0;
public short _color_pale_blue = (short)0;
public short _color_rose = (short)0;
public short _color_lavender = (short)0;
public short _color_tan = (short)0;
public short _color_light_blue = (short)0;
public short _color_aqua = (short)0;
public short _color_lime = (short)0;
public short _color_gold = (short)0;
public short _color_light_orange = (short)0;
public short _color_orange = (short)0;
public short _color_blue_grey = (short)0;
public short _color_grey_40_percent = (short)0;
public short _color_dark_teal = (short)0;
public short _color_sea_green = (short)0;
public short _color_dark_green = (short)0;
public short _color_olive_green = (short)0;
public short _color_brown = (short)0;
public short _color_plum = (short)0;
public short _color_indigo = (short)0;
public short _color_grey_80_percent = (short)0;
public short _color_automatic = (short)0;
public boolean _blankworkbookis2007 = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public static class _xladdress{
public boolean IsInitialized;
public int Col0Based;
public int Row0Based;
public void Initialize() {
IsInitialized = true;
Col0Based = 0;
Row0Based = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _xlrange{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.PoiSheetWrapper Sheet;
public japam.sie.xlutils._xladdress FirstAddress;
public japam.sie.xlutils._xladdress SecondAddress;
public String Name;
public void Initialize() {
IsInitialized = true;
Sheet = new anywheresoftware.b4j.objects.PoiSheetWrapper();
FirstAddress = new japam.sie.xlutils._xladdress();
SecondAddress = new japam.sie.xlutils._xladdress();
Name = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public japam.sie.xlutils._xladdress  _addressname(String _address) throws Exception{
japam.sie.xlutils._xladdress _xa = null;
int _i = 0;
int _cp = 0;
 //BA.debugLineNum = 81;BA.debugLine="Public Sub AddressName (Address As String) As XLAd";
 //BA.debugLineNum = 82;BA.debugLine="Dim xa As XLAddress";
_xa = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 83;BA.debugLine="xa.Initialize";
_xa.Initialize();
 //BA.debugLineNum = 84;BA.debugLine="Address = Address.ToUpperCase";
_address = _address.toUpperCase();
 //BA.debugLineNum = 85;BA.debugLine="For i = 0 To Address.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_address.length()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 86;BA.debugLine="Dim cp As Int = Asc(Address.CharAt(i))";
_cp = __c.Asc(_address.charAt(_i));
 //BA.debugLineNum = 87;BA.debugLine="If cp >= 0x41 And cp <=	0x5A Then";
if (_cp>=((int)0x41) && _cp<=((int)0x5a)) { 
 //BA.debugLineNum = 88;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ *26+(_cp-((int)0x40)));
 }else if(_cp>=((int)0x30) && _cp<=((int)0x39)) { 
 //BA.debugLineNum = 90;BA.debugLine="xa.Row0Based = xa.Row0Based * 10 + cp - 0x30";
_xa.Row0Based /*int*/  = (int) (_xa.Row0Based /*int*/ *10+_cp-((int)0x30));
 };
 }
};
 //BA.debugLineNum = 93;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ -1);
 //BA.debugLineNum = 94;BA.debugLine="xa.Row0Based = xa.Row0Based - 1";
_xa.Row0Based /*int*/  = (int) (_xa.Row0Based /*int*/ -1);
 //BA.debugLineNum = 95;BA.debugLine="Return xa";
if (true) return _xa;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlutils._xladdress  _addressone(String _columnname,int _row1based) throws Exception{
japam.sie.xlutils._xladdress _xa = null;
byte[] _b = null;
int _i = 0;
int _cp = 0;
 //BA.debugLineNum = 101;BA.debugLine="Public Sub AddressOne(ColumnName As String, Row1Ba";
 //BA.debugLineNum = 102;BA.debugLine="Dim xa As XLAddress";
_xa = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 103;BA.debugLine="xa.Initialize";
_xa.Initialize();
 //BA.debugLineNum = 104;BA.debugLine="Dim b() As Byte = ColumnName.GetBytes(\"ASCII\")";
_b = _columnname.getBytes("ASCII");
 //BA.debugLineNum = 105;BA.debugLine="For i = 0 To b.Length - 1";
{
final int step4 = 1;
final int limit4 = (int) (_b.length-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 106;BA.debugLine="Dim cp As Int = b(i)";
_cp = (int) (_b[_i]);
 //BA.debugLineNum = 107;BA.debugLine="xa.Col0Based = xa.Col0Based * 26 + (cp - 0x40)";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ *26+(_cp-((int)0x40)));
 }
};
 //BA.debugLineNum = 109;BA.debugLine="xa.Col0Based = xa.Col0Based - 1";
_xa.Col0Based /*int*/  = (int) (_xa.Col0Based /*int*/ -1);
 //BA.debugLineNum = 110;BA.debugLine="xa.Row0Based = Row1Based - 1";
_xa.Row0Based /*int*/  = (int) (_row1based-1);
 //BA.debugLineNum = 111;BA.debugLine="Return xa";
if (true) return _xa;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public String  _addressonetostring(String _columnname,int _row1based) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub AddressOneToString(ColumnName As String";
 //BA.debugLineNum = 116;BA.debugLine="Return AddressToString(AddressOne(ColumnName, Row";
if (true) return _addresstostring(_addressone(_columnname,_row1based));
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _addresstostring(japam.sie.xlutils._xladdress _address) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub AddressToString (Address As XLAddress)";
 //BA.debugLineNum = 121;BA.debugLine="Return AddressToStringAbs(Address, False, False)";
if (true) return _addresstostringabs(_address,__c.False,__c.False);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _addresstostringabs(japam.sie.xlutils._xladdress _address,boolean _absolutecolumn,boolean _absoluterow) throws Exception{
int _c = 0;
String _col = "";
int _cmod = 0;
 //BA.debugLineNum = 125;BA.debugLine="Public Sub AddressToStringAbs(Address As XLAddress";
 //BA.debugLineNum = 126;BA.debugLine="Dim c As Int = Address.Col0Based + 1";
_c = (int) (_address.Col0Based /*int*/ +1);
 //BA.debugLineNum = 127;BA.debugLine="If Address.Col0Based < 0 Or Address.Row0Based < 0";
if (_address.Col0Based /*int*/ <0 || _address.Row0Based /*int*/ <0) { 
if (true) return "N/A";};
 //BA.debugLineNum = 128;BA.debugLine="Dim col As String";
_col = "";
 //BA.debugLineNum = 129;BA.debugLine="Do While c > 0";
while (_c>0) {
 //BA.debugLineNum = 130;BA.debugLine="Dim cmod As Int = c Mod 26";
_cmod = (int) (_c%26);
 //BA.debugLineNum = 131;BA.debugLine="If cmod = 0 Then cmod = 26";
if (_cmod==0) { 
_cmod = (int) (26);};
 //BA.debugLineNum = 132;BA.debugLine="col = Chr(0x40 + cmod) & col";
_col = BA.ObjectToString(__c.Chr((int) (((int)0x40)+_cmod)))+_col;
 //BA.debugLineNum = 133;BA.debugLine="c = Floor((c - 1) / 26)";
_c = (int) (__c.Floor((_c-1)/(double)26));
 }
;
 //BA.debugLineNum = 135;BA.debugLine="If AbsoluteColumn Then col = \"$\" & col";
if (_absolutecolumn) { 
_col = "$"+_col;};
 //BA.debugLineNum = 136;BA.debugLine="If AbsoluteRow Then col = col & \"$\"";
if (_absoluterow) { 
_col = _col+"$";};
 //BA.debugLineNum = 137;BA.debugLine="col = col & (Address.Row0Based + 1)";
_col = _col+BA.NumberToString((_address.Row0Based /*int*/ +1));
 //BA.debugLineNum = 138;BA.debugLine="Return col";
if (true) return _col;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlutils._xladdress  _addresszero(int _col0based,int _row0based) throws Exception{
japam.sie.xlutils._xladdress _xa = null;
 //BA.debugLineNum = 65;BA.debugLine="Public Sub AddressZero (Col0Based As Int, Row0Base";
 //BA.debugLineNum = 66;BA.debugLine="Dim xa As XLAddress";
_xa = new japam.sie.xlutils._xladdress();
 //BA.debugLineNum = 67;BA.debugLine="xa.Initialize";
_xa.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="xa.Col0Based = Col0Based";
_xa.Col0Based /*int*/  = _col0based;
 //BA.debugLineNum = 69;BA.debugLine="xa.Row0Based = Row0Based";
_xa.Row0Based /*int*/  = _row0based;
 //BA.debugLineNum = 70;BA.debugLine="Return xa";
if (true) return _xa;
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public String  _addresszerotostring(int _col0based,int _row0based) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub AddressZeroToString(Col0Based As Int, R";
 //BA.debugLineNum = 75;BA.debugLine="Return AddressToString(AddressZero(Col0Based, Row";
if (true) return _addresstostring(_addresszero(_col0based,_row0based));
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlutils._xlrange  _areareferencetoxlrange(anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,anywheresoftware.b4j.object.JavaObject _areareference) throws Exception{
japam.sie.xlutils._xlrange _res = null;
anywheresoftware.b4j.object.JavaObject _firstcell = null;
anywheresoftware.b4j.object.JavaObject _lastcell = null;
 //BA.debugLineNum = 186;BA.debugLine="Public Sub AreaReferenceToXLRange (PoiWorkbook As";
 //BA.debugLineNum = 187;BA.debugLine="Dim res As XLRange";
_res = new japam.sie.xlutils._xlrange();
 //BA.debugLineNum = 188;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 189;BA.debugLine="Dim FirstCell = AreaReference.RunMethod(\"getFirst";
_firstcell = new anywheresoftware.b4j.object.JavaObject();
_firstcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_areareference.RunMethod("getFirstCell",(Object[])(__c.Null))));
_lastcell = new anywheresoftware.b4j.object.JavaObject();
_lastcell = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_areareference.RunMethod("getLastCell",(Object[])(__c.Null))));
 //BA.debugLineNum = 190;BA.debugLine="res.FirstAddress = AddressZero(FirstCell.RunMetho";
_res.FirstAddress /*japam.sie.xlutils._xladdress*/  = _addresszero((int)(BA.ObjectToNumber(_firstcell.RunMethod("getCol",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_firstcell.RunMethod("getRow",(Object[])(__c.Null)))));
 //BA.debugLineNum = 191;BA.debugLine="res.SecondAddress = AddressZero(LastCell.RunMetho";
_res.SecondAddress /*japam.sie.xlutils._xladdress*/  = _addresszero((int)(BA.ObjectToNumber(_lastcell.RunMethod("getCol",(Object[])(__c.Null)))),(int)(BA.ObjectToNumber(_lastcell.RunMethod("getRow",(Object[])(__c.Null)))));
 //BA.debugLineNum = 192;BA.debugLine="res.Sheet = PoiWorkbook.GetSheetByName(FirstCell.";
_res.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poiworkbook.GetSheetByName(BA.ObjectToString(_firstcell.RunMethod("getSheetName",(Object[])(__c.Null))));
 //BA.debugLineNum = 193;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public Reader As XLReader";
_reader = new japam.sie.xlreader();
 //BA.debugLineNum = 3;BA.debugLine="Type XLAddress (Col0Based As Int, Row0Based As In";
;
 //BA.debugLineNum = 4;BA.debugLine="Type XLRange (Sheet As PoiSheet, FirstAddress As";
;
 //BA.debugLineNum = 5;BA.debugLine="Public CreateWriterPassword As String";
_createwriterpassword = "";
 //BA.debugLineNum = 6;BA.debugLine="Public COLOR_BLACK = 8 As Short";
_color_black = (short) (8);
 //BA.debugLineNum = 7;BA.debugLine="Public COLOR_WHITE = 9 As Short";
_color_white = (short) (9);
 //BA.debugLineNum = 8;BA.debugLine="Public COLOR_RED = 10 As Short";
_color_red = (short) (10);
 //BA.debugLineNum = 9;BA.debugLine="Public COLOR_BRIGHT_GREEN = 11 As Short";
_color_bright_green = (short) (11);
 //BA.debugLineNum = 10;BA.debugLine="Public COLOR_BLUE = 12 As Short";
_color_blue = (short) (12);
 //BA.debugLineNum = 11;BA.debugLine="Public COLOR_YELLOW = 13 As Short";
_color_yellow = (short) (13);
 //BA.debugLineNum = 12;BA.debugLine="Public COLOR_PINK = 14 As Short";
_color_pink = (short) (14);
 //BA.debugLineNum = 13;BA.debugLine="Public COLOR_TURQUOISE = 15 As Short";
_color_turquoise = (short) (15);
 //BA.debugLineNum = 14;BA.debugLine="Public COLOR_DARK_RED = 16 As Short";
_color_dark_red = (short) (16);
 //BA.debugLineNum = 15;BA.debugLine="Public COLOR_GREEN = 17 As Short";
_color_green = (short) (17);
 //BA.debugLineNum = 16;BA.debugLine="Public COLOR_DARK_BLUE = 18 As Short";
_color_dark_blue = (short) (18);
 //BA.debugLineNum = 17;BA.debugLine="Public COLOR_DARK_YELLOW = 19 As Short";
_color_dark_yellow = (short) (19);
 //BA.debugLineNum = 18;BA.debugLine="Public COLOR_VIOLET = 20 As Short";
_color_violet = (short) (20);
 //BA.debugLineNum = 19;BA.debugLine="Public COLOR_TEAL = 21 As Short";
_color_teal = (short) (21);
 //BA.debugLineNum = 20;BA.debugLine="Public COLOR_GREY_25_PERCENT = 22 As Short";
_color_grey_25_percent = (short) (22);
 //BA.debugLineNum = 21;BA.debugLine="Public COLOR_GREY_50_PERCENT = 23 As Short";
_color_grey_50_percent = (short) (23);
 //BA.debugLineNum = 22;BA.debugLine="Public COLOR_CORNFLOWER_BLUE = 24 As Short";
_color_cornflower_blue = (short) (24);
 //BA.debugLineNum = 23;BA.debugLine="Public COLOR_MAROON = 25 As Short";
_color_maroon = (short) (25);
 //BA.debugLineNum = 24;BA.debugLine="Public COLOR_LEMON_CHIFFON = 26 As Short";
_color_lemon_chiffon = (short) (26);
 //BA.debugLineNum = 25;BA.debugLine="Public COLOR_LIGHT_TURQUOISE1 = 27 As Short";
_color_light_turquoise1 = (short) (27);
 //BA.debugLineNum = 26;BA.debugLine="Public COLOR_ORCHID = 28 As Short";
_color_orchid = (short) (28);
 //BA.debugLineNum = 27;BA.debugLine="Public COLOR_CORAL = 29 As Short";
_color_coral = (short) (29);
 //BA.debugLineNum = 28;BA.debugLine="Public COLOR_ROYAL_BLUE = 30 As Short";
_color_royal_blue = (short) (30);
 //BA.debugLineNum = 29;BA.debugLine="Public COLOR_LIGHT_CORNFLOWER_BLUE = 31 As Short";
_color_light_cornflower_blue = (short) (31);
 //BA.debugLineNum = 30;BA.debugLine="Public COLOR_SKY_BLUE = 40 As Short";
_color_sky_blue = (short) (40);
 //BA.debugLineNum = 31;BA.debugLine="Public COLOR_LIGHT_TURQUOISE = 41 As Short";
_color_light_turquoise = (short) (41);
 //BA.debugLineNum = 32;BA.debugLine="Public COLOR_LIGHT_GREEN = 42 As Short";
_color_light_green = (short) (42);
 //BA.debugLineNum = 33;BA.debugLine="Public COLOR_LIGHT_YELLOW = 43 As Short";
_color_light_yellow = (short) (43);
 //BA.debugLineNum = 34;BA.debugLine="Public COLOR_PALE_BLUE = 44 As Short";
_color_pale_blue = (short) (44);
 //BA.debugLineNum = 35;BA.debugLine="Public COLOR_ROSE = 45 As Short";
_color_rose = (short) (45);
 //BA.debugLineNum = 36;BA.debugLine="Public COLOR_LAVENDER = 46 As Short";
_color_lavender = (short) (46);
 //BA.debugLineNum = 37;BA.debugLine="Public COLOR_TAN = 47 As Short";
_color_tan = (short) (47);
 //BA.debugLineNum = 38;BA.debugLine="Public COLOR_LIGHT_BLUE = 48 As Short";
_color_light_blue = (short) (48);
 //BA.debugLineNum = 39;BA.debugLine="Public COLOR_AQUA = 49 As Short";
_color_aqua = (short) (49);
 //BA.debugLineNum = 40;BA.debugLine="Public COLOR_LIME = 50 As Short";
_color_lime = (short) (50);
 //BA.debugLineNum = 41;BA.debugLine="Public COLOR_GOLD = 51 As Short";
_color_gold = (short) (51);
 //BA.debugLineNum = 42;BA.debugLine="Public COLOR_LIGHT_ORANGE = 52 As Short";
_color_light_orange = (short) (52);
 //BA.debugLineNum = 43;BA.debugLine="Public COLOR_ORANGE = 53 As Short";
_color_orange = (short) (53);
 //BA.debugLineNum = 44;BA.debugLine="Public COLOR_BLUE_GREY = 54 As Short";
_color_blue_grey = (short) (54);
 //BA.debugLineNum = 45;BA.debugLine="Public COLOR_GREY_40_PERCENT = 55 As Short";
_color_grey_40_percent = (short) (55);
 //BA.debugLineNum = 46;BA.debugLine="Public COLOR_DARK_TEAL = 56 As Short";
_color_dark_teal = (short) (56);
 //BA.debugLineNum = 47;BA.debugLine="Public COLOR_SEA_GREEN = 57 As Short";
_color_sea_green = (short) (57);
 //BA.debugLineNum = 48;BA.debugLine="Public COLOR_DARK_GREEN = 58 As Short";
_color_dark_green = (short) (58);
 //BA.debugLineNum = 49;BA.debugLine="Public COLOR_OLIVE_GREEN = 59 As Short";
_color_olive_green = (short) (59);
 //BA.debugLineNum = 50;BA.debugLine="Public COLOR_BROWN = 60 As Short";
_color_brown = (short) (60);
 //BA.debugLineNum = 51;BA.debugLine="Public COLOR_PLUM = 61 As Short";
_color_plum = (short) (61);
 //BA.debugLineNum = 52;BA.debugLine="Public COLOR_INDIGO = 62 As Short";
_color_indigo = (short) (62);
 //BA.debugLineNum = 53;BA.debugLine="Public COLOR_GREY_80_PERCENT = 63 As Short";
_color_grey_80_percent = (short) (63);
 //BA.debugLineNum = 54;BA.debugLine="Public COLOR_AUTOMATIC = 64 As Short";
_color_automatic = (short) (64);
 //BA.debugLineNum = 55;BA.debugLine="Public BlankWorkbookIs2007 As Boolean = True";
_blankworkbookis2007 = __c.True;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlworkbookwriter  _createwriterblank() throws Exception{
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
japam.sie.xlworkbookwriter _writer = null;
 //BA.debugLineNum = 142;BA.debugLine="Public Sub CreateWriterBlank As XLWorkbookWriter";
 //BA.debugLineNum = 143;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
 //BA.debugLineNum = 144;BA.debugLine="wb.InitializeNew(BlankWorkbookIs2007)";
_wb.InitializeNew(_blankworkbookis2007);
 //BA.debugLineNum = 145;BA.debugLine="Dim writer As XLWorkbookWriter";
_writer = new japam.sie.xlworkbookwriter();
 //BA.debugLineNum = 146;BA.debugLine="writer.Initialize(Me, wb, False)";
_writer._initialize /*String*/ (ba,(japam.sie.xlutils)(this),_wb,__c.False);
 //BA.debugLineNum = 147;BA.debugLine="Return writer";
if (true) return _writer;
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlworkbookwriter  _createwriterfromtemplate(String _dir,String _filename) throws Exception{
anywheresoftware.b4j.objects.PoiWorkbookWrapper _wb = null;
japam.sie.xlworkbookwriter _writer = null;
 //BA.debugLineNum = 151;BA.debugLine="Public Sub CreateWriterFromTemplate (Dir As String";
 //BA.debugLineNum = 152;BA.debugLine="Dim wb As PoiWorkbook";
_wb = new anywheresoftware.b4j.objects.PoiWorkbookWrapper();
 //BA.debugLineNum = 153;BA.debugLine="wb.InitializeExisting(Dir, FileName, CreateWriter";
_wb.InitializeExisting(_dir,_filename,_createwriterpassword,__c.False);
 //BA.debugLineNum = 154;BA.debugLine="Dim writer As XLWorkbookWriter";
_writer = new japam.sie.xlworkbookwriter();
 //BA.debugLineNum = 155;BA.debugLine="writer.Initialize(Me, wb, True)";
_writer._initialize /*String*/ (ba,(japam.sie.xlutils)(this),_wb,__c.True);
 //BA.debugLineNum = 156;BA.debugLine="Return writer";
if (true) return _writer;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlutils._xlrange  _createxlrange(japam.sie.xlutils._xladdress _firstaddress,japam.sie.xlutils._xladdress _secondaddress) throws Exception{
japam.sie.xlutils._xlrange _t1 = null;
 //BA.debugLineNum = 235;BA.debugLine="Public Sub CreateXLRange (FirstAddress As XLAddres";
 //BA.debugLineNum = 236;BA.debugLine="Dim t1 As XLRange";
_t1 = new japam.sie.xlutils._xlrange();
 //BA.debugLineNum = 237;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 238;BA.debugLine="t1.FirstAddress = FirstAddress";
_t1.FirstAddress /*japam.sie.xlutils._xladdress*/  = _firstaddress;
 //BA.debugLineNum = 239;BA.debugLine="t1.SecondAddress = SecondAddress";
_t1.SecondAddress /*japam.sie.xlutils._xladdress*/  = _secondaddress;
 //BA.debugLineNum = 240;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlutils._xlrange  _createxlrangewithsheet(japam.sie.xlutils._xladdress _firstaddress,japam.sie.xlutils._xladdress _secondaddress,anywheresoftware.b4j.objects.PoiSheetWrapper _poisheet) throws Exception{
japam.sie.xlutils._xlrange _t1 = null;
 //BA.debugLineNum = 244;BA.debugLine="Public Sub CreateXLRangeWithSheet (FirstAddress As";
 //BA.debugLineNum = 245;BA.debugLine="Dim t1 As XLRange";
_t1 = new japam.sie.xlutils._xlrange();
 //BA.debugLineNum = 246;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 247;BA.debugLine="t1.FirstAddress = FirstAddress";
_t1.FirstAddress /*japam.sie.xlutils._xladdress*/  = _firstaddress;
 //BA.debugLineNum = 248;BA.debugLine="t1.SecondAddress = SecondAddress";
_t1.SecondAddress /*japam.sie.xlutils._xladdress*/  = _secondaddress;
 //BA.debugLineNum = 249;BA.debugLine="t1.Sheet = PoiSheet";
_t1.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/  = _poisheet;
 //BA.debugLineNum = 250;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 251;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlutils._xlrange  _formulatorange(anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,String _formula,String _name) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _areareference = null;
japam.sie.xlutils._xlrange _res = null;
 //BA.debugLineNum = 177;BA.debugLine="Private Sub FormulaToRange (PoiWorkbook As PoiWork";
 //BA.debugLineNum = 178;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
 //BA.debugLineNum = 179;BA.debugLine="Dim AreaReference As JavaObject";
_areareference = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 180;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
_areareference.InitializeNewInstance("org.apache.poi.ss.util.AreaReference",new Object[]{(Object)(_formula),_jo.RunMethod("getSpreadsheetVersion",(Object[])(__c.Null))});
 //BA.debugLineNum = 181;BA.debugLine="Dim res As XLRange = AreaReferenceToXLRange(PoiWo";
_res = _areareferencetoxlrange(_poiworkbook,_areareference);
 //BA.debugLineNum = 182;BA.debugLine="res.Name = Name";
_res.Name /*String*/  = _name;
 //BA.debugLineNum = 183;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getworkbookrangenames(anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook) throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4a.objects.collections.List _names = null;
anywheresoftware.b4j.object.JavaObject _name = null;
String _formula = "";
String _namename = "";
 //BA.debugLineNum = 160;BA.debugLine="Public Sub GetWorkbookRangeNames (PoiWorkbook As P";
 //BA.debugLineNum = 161;BA.debugLine="Dim res As List";
_res = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 162;BA.debugLine="res.Initialize";
_res.Initialize();
 //BA.debugLineNum = 163;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
 //BA.debugLineNum = 164;BA.debugLine="Dim names As List = jo.RunMethod(\"getAllNames\", N";
_names = new anywheresoftware.b4a.objects.collections.List();
_names = (anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_jo.RunMethod("getAllNames",(Object[])(__c.Null))));
 //BA.debugLineNum = 165;BA.debugLine="For Each name As JavaObject In names";
_name = new anywheresoftware.b4j.object.JavaObject();
{
final anywheresoftware.b4a.BA.IterableList group5 = _names;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_name = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(group5.Get(index5)));
 //BA.debugLineNum = 166;BA.debugLine="Dim Formula As String = name.RunMethod(\"getRefer";
_formula = BA.ObjectToString(_name.RunMethod("getRefersToFormula",(Object[])(__c.Null)));
 //BA.debugLineNum = 167;BA.debugLine="Dim NameName As String = name.RunMethod(\"getName";
_namename = BA.ObjectToString(_name.RunMethod("getNameName",(Object[])(__c.Null)));
 //BA.debugLineNum = 168;BA.debugLine="Try";
try { //BA.debugLineNum = 169;BA.debugLine="res.Add(FormulaToRange(PoiWorkbook, Formula , N";
_res.Add((Object)(_formulatorange(_poiworkbook,_formula,_namename)));
 } 
       catch (Exception e11) {
			ba.setLastException(e11); //BA.debugLineNum = 171;BA.debugLine="Log($\"info: cannot get range of: ${NameName} -";
__c.LogImpl("953346315",("info: cannot get range of: "+__c.SmartStringFormatter("",(Object)(_namename))+" - "+__c.SmartStringFormatter("",(Object)(_formula))+" "),0);
 };
 }
};
 //BA.debugLineNum = 174;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 58;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 59;BA.debugLine="Reader.Initialize (Me)";
_reader._initialize /*String*/ (ba,(japam.sie.xlutils)(this));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _openexcel(String _filepath) throws Exception{
ResumableSub_OpenExcel rsub = new ResumableSub_OpenExcel(this,_filepath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenExcel extends BA.ResumableSub {
public ResumableSub_OpenExcel(japam.sie.xlutils parent,String _filepath) {
this.parent = parent;
this._filepath = _filepath;
}
japam.sie.xlutils parent;
String _filepath;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 258;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 259;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"cmd.exe\",";
_shl.InitializeDoNotHandleQuotes("shl","cmd.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("/c"),(Object)("start"),(Object)(("\"\"")),(Object)(("\""+parent.__c.SmartStringFormatter("",(Object)(_filepath))+"\""))}));
 //BA.debugLineNum = 260;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 //BA.debugLineNum = 261;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
 //BA.debugLineNum = 262;BA.debugLine="If ExitCode <> 0 Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_exitcode!=0) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 263;BA.debugLine="Log(StdOut)";
parent.__c.LogImpl("953936135",_stdout,0);
 //BA.debugLineNum = 264;BA.debugLine="Log(StdErr)";
parent.__c.LogImpl("953936136",_stderr,0);
 //BA.debugLineNum = 265;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 267;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 268;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _shl_processcompleted(boolean _success,int _exitcode,String _stdout,String _stderr) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellconverttopdf(String _inputfile,String _outputfile,int _sheetindex,boolean _openpdf) throws Exception{
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(this,_inputfile,_outputfile,_sheetindex,_openpdf);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(japam.sie.xlutils parent,String _inputfile,String _outputfile,int _sheetindex,boolean _openpdf) {
this.parent = parent;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._sheetindex = _sheetindex;
this._openpdf = _openpdf;
}
japam.sie.xlutils parent;
String _inputfile;
String _outputfile;
int _sheetindex;
boolean _openpdf;
String _objecttoconvert = "";
String _s = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 274;BA.debugLine="File.Delete(OutputFile, \"\")";
parent.__c.File.Delete(_outputfile,"");
 //BA.debugLineNum = 275;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.File.Exists(_outputfile,"")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 276;BA.debugLine="Log(\"Cannot delete output file\")";
parent.__c.LogImpl("954001667","Cannot delete output file",0);
 //BA.debugLineNum = 277;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 279;BA.debugLine="Dim ObjectToConvert As String";
_objecttoconvert = "";
 //BA.debugLineNum = 280;BA.debugLine="If SheetIndex < 0 Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_sheetindex<0) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 281;BA.debugLine="ObjectToConvert = \"$workbook\"";
_objecttoconvert = "$workbook";
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 283;BA.debugLine="ObjectToConvert = $\"$workbook.Sheets[${SheetInde";
_objecttoconvert = ("$workbook.Sheets["+parent.__c.SmartStringFormatter("",(Object)(_sheetindex+1))+"]");
 if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 285;BA.debugLine="Dim s As String = $\" 	& {$objExcel = New-Object -";
_s = ("\n"+"	& {$objExcel = New-Object -ComObject excel.application\n"+"$workbook = $objExcel.workbooks.open('"+parent.__c.SmartStringFormatter("",(Object)(_inputfile))+"', 3)\n"+""+parent.__c.SmartStringFormatter("",(Object)(_objecttoconvert))+".ExportAsFixedFormat($xlFixedFormat::xlTypePDF, '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"')\n"+"$objExcel.Workbooks.close()\n"+"$objExcel.Quit()}");
 //BA.debugLineNum = 291;BA.debugLine="Wait For (PowerShellScript(s)) Complete (Result A";
parent.__c.WaitFor("complete", ba, this, parent._powershellscript(_s));
this.state = 21;
return;
case 21:
//C
this.state = 11;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[0];
;
 //BA.debugLineNum = 292;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
if (true) break;

case 11:
//if
this.state = 16;
if (_result.ExitCode!=0) { 
this.state = 13;
;}if (true) break;

case 13:
//C
this.state = 16;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 293;BA.debugLine="If OpenPdf Then";
if (true) break;

case 17:
//if
this.state = 20;
if (_openpdf) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 294;BA.debugLine="Wait For (PowerShellScript($\"& {Invoke-Item '${O";
parent.__c.WaitFor("complete", ba, this, parent._powershellscript(("& {Invoke-Item '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"'}")));
this.state = 22;
return;
case 22:
//C
this.state = 20;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[0];
;
 //BA.debugLineNum = 295;BA.debugLine="Return Result.ExitCode = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result.ExitCode==0));return;};
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 297;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(anywheresoftware.b4j.objects.Shell.ShellSyncResult _result) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellscript(String _s) throws Exception{
ResumableSub_PowerShellScript rsub = new ResumableSub_PowerShellScript(this,_s);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellScript extends BA.ResumableSub {
public ResumableSub_PowerShellScript(japam.sie.xlutils parent,String _s) {
this.parent = parent;
this._s = _s;
}
japam.sie.xlutils parent;
String _s;
anywheresoftware.b4j.objects.Shell _shl = null;
boolean _success = false;
int _exitcode = 0;
String _stdout = "";
String _stderr = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _res = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 301;BA.debugLine="s = s.Replace(CRLF, \";\").Replace(\"\"\"\", \"'\")";
_s = _s.replace(parent.__c.CRLF,";").replace("\"","'");
 //BA.debugLineNum = 302;BA.debugLine="Dim shl As Shell";
_shl = new anywheresoftware.b4j.objects.Shell();
 //BA.debugLineNum = 303;BA.debugLine="shl.InitializeDoNotHandleQuotes(\"shl\", \"powershel";
_shl.InitializeDoNotHandleQuotes("shl","powershell.exe",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("-Command"),(Object)(_s)}));
 //BA.debugLineNum = 304;BA.debugLine="shl.Run(-1)";
_shl.Run(ba,(long) (-1));
 //BA.debugLineNum = 305;BA.debugLine="Wait For shl_ProcessCompleted (Success As Boolean";
parent.__c.WaitFor("shl_processcompleted", ba, this, null);
this.state = 11;
return;
case 11:
//C
this.state = 1;
_success = (boolean) result[0];
_exitcode = (int) result[1];
_stdout = (String) result[2];
_stderr = (String) result[3];
;
 //BA.debugLineNum = 306;BA.debugLine="Dim res As ShellSyncResult";
_res = new anywheresoftware.b4j.objects.Shell.ShellSyncResult();
 //BA.debugLineNum = 307;BA.debugLine="res.ExitCode = ExitCode";
_res.ExitCode = _exitcode;
 //BA.debugLineNum = 308;BA.debugLine="res.StdErr = StdErr";
_res.StdErr = _stderr;
 //BA.debugLineNum = 309;BA.debugLine="res.StdOut = StdOut";
_res.StdOut = _stdout;
 //BA.debugLineNum = 310;BA.debugLine="res.Success = Success";
_res.Success = _success;
 //BA.debugLineNum = 311;BA.debugLine="If StdErr <> \"\" Then";
if (true) break;

case 1:
//if
this.state = 10;
if ((_stderr).equals("") == false) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 312;BA.debugLine="Log(StdErr)";
parent.__c.LogImpl("954067212",_stderr,0);
 //BA.debugLineNum = 313;BA.debugLine="If ExitCode = 0 Then res.ExitCode = 1";
if (true) break;

case 4:
//if
this.state = 9;
if (_exitcode==0) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
_res.ExitCode = (int) (1);
if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 315;BA.debugLine="Return res";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_res));return;};
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public japam.sie.xlutils._xlrange  _rangestringornametorange(anywheresoftware.b4j.objects.PoiWorkbookWrapper _poiworkbook,String _rangeorname) throws Exception{
String _referstoformula = "";
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _name = null;
 //BA.debugLineNum = 197;BA.debugLine="Public Sub RangeStringOrNameToRange (PoiWorkbook A";
 //BA.debugLineNum = 198;BA.debugLine="Dim RefersToFormula As String";
_referstoformula = "";
 //BA.debugLineNum = 199;BA.debugLine="Dim jo As JavaObject = PoiWorkbook";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_poiworkbook.getObject()));
 //BA.debugLineNum = 200;BA.debugLine="Dim name As JavaObject = jo.RunMethod(\"getName\",";
_name = new anywheresoftware.b4j.object.JavaObject();
_name = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getName",new Object[]{(Object)(_rangeorname)})));
 //BA.debugLineNum = 201;BA.debugLine="If name.IsInitialized Then";
if (_name.IsInitialized()) { 
 //BA.debugLineNum = 202;BA.debugLine="RefersToFormula  = name.RunMethod(\"getRefersToFo";
_referstoformula = BA.ObjectToString(_name.RunMethod("getRefersToFormula",(Object[])(__c.Null)));
 }else {
 //BA.debugLineNum = 204;BA.debugLine="RefersToFormula = RangeOrName";
_referstoformula = _rangeorname;
 };
 //BA.debugLineNum = 206;BA.debugLine="Return FormulaToRange(PoiWorkbook, RefersToFormul";
if (true) return _formulatorange(_poiworkbook,_referstoformula,_rangeorname);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _xladdresstocellreference(String _sheetname,japam.sie.xlutils._xladdress _address) throws Exception{
anywheresoftware.b4j.object.JavaObject _cellreference1 = null;
 //BA.debugLineNum = 226;BA.debugLine="Public Sub XLAddressToCellReference (SheetName As";
 //BA.debugLineNum = 227;BA.debugLine="Dim CellReference1 As JavaObject";
_cellreference1 = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 228;BA.debugLine="CellReference1.InitializeNewInstance(\"org.apache.";
_cellreference1.InitializeNewInstance("org.apache.poi.ss.util.CellReference",new Object[]{(Object)(_sheetname),(Object)(_address.Row0Based /*int*/ ),(Object)(_address.Col0Based /*int*/ ),(Object)(__c.True),(Object)(__c.True)});
 //BA.debugLineNum = 229;BA.debugLine="Return CellReference1";
if (true) return _cellreference1;
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _xlrangetoareareference(japam.sie.xlworkbookwriter _workbook,japam.sie.xlutils._xlrange _range) throws Exception{
anywheresoftware.b4j.object.JavaObject _cellreference1 = null;
anywheresoftware.b4j.object.JavaObject _cellreference2 = null;
anywheresoftware.b4j.object.JavaObject _areareference = null;
 //BA.debugLineNum = 217;BA.debugLine="Public Sub XLRangeToAreaReference (Workbook As XLW";
 //BA.debugLineNum = 218;BA.debugLine="Dim CellReference1 = XLAddressToCellReference(Ran";
_cellreference1 = new anywheresoftware.b4j.object.JavaObject();
_cellreference1 = _xladdresstocellreference(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.FirstAddress /*japam.sie.xlutils._xladdress*/ );
 //BA.debugLineNum = 219;BA.debugLine="Dim CellReference2 = XLAddressToCellReference(Ran";
_cellreference2 = new anywheresoftware.b4j.object.JavaObject();
_cellreference2 = _xladdresstocellreference(_range.Sheet /*anywheresoftware.b4j.objects.PoiSheetWrapper*/ .getName(),_range.SecondAddress /*japam.sie.xlutils._xladdress*/ );
 //BA.debugLineNum = 220;BA.debugLine="Dim AreaReference As JavaObject";
_areareference = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 221;BA.debugLine="AreaReference.InitializeNewInstance(\"org.apache.p";
_areareference.InitializeNewInstance("org.apache.poi.ss.util.AreaReference",new Object[]{(Object)(_cellreference1.getObject()),(Object)(_cellreference2.getObject()),(Object)(_workbook._getversionname /*String*/ ())});
 //BA.debugLineNum = 222;BA.debugLine="Return AreaReference";
if (true) return _areareference;
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4j.object.JavaObject  _xlrangetocellrangeaddress(japam.sie.xlutils._xlrange _range) throws Exception{
anywheresoftware.b4j.object.JavaObject _cellrange = null;
 //BA.debugLineNum = 210;BA.debugLine="Public Sub XLRangeToCellRangeAddress (Range As XLR";
 //BA.debugLineNum = 211;BA.debugLine="Dim CellRange As JavaObject";
_cellrange = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 212;BA.debugLine="CellRange.InitializeNewInstance(\"org.apache.poi.s";
_cellrange.InitializeNewInstance("org.apache.poi.ss.util.CellRangeAddress",new Object[]{(Object)(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Row0Based /*int*/ ),(Object)(_range.FirstAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ ),(Object)(_range.SecondAddress /*japam.sie.xlutils._xladdress*/ .Col0Based /*int*/ )});
 //BA.debugLineNum = 213;BA.debugLine="Return CellRange";
if (true) return _cellrange;
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
