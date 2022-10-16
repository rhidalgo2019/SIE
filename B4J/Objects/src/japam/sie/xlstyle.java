package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class xlstyle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xlstyle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.xlstyle.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _style_key_horizontal_alignment = "";
public String _style_key_border_bottom = "";
public String _style_key_border_left = "";
public String _style_key_border_right = "";
public String _style_key_border_top = "";
public String _style_key_bottom_border_color = "";
public String _style_key_left_border_color = "";
public String _style_key_right_border_color = "";
public String _style_key_top_border_color = "";
public String _style_key_data_format = "";
public String _style_key_fill_foreground_color = "";
public String _style_key_fill_pattern = "";
public String _style_key_font = "";
public String _style_key_hidden = "";
public String _style_key_indention = "";
public String _style_key_locked = "";
public String _style_key_rotation = "";
public String _style_key_vertical_alignment = "";
public String _style_key_wrap_text = "";
public anywheresoftware.b4j.object.JavaObject _bba = null;
public anywheresoftware.b4a.objects.collections.Map _stylemap = null;
public japam.sie.xlworkbookwriter _writer = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public japam.sie.xlstyle  _borderbottom(String _borderstyle) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub BorderBottom (BorderStyle As String) As";
 //BA.debugLineNum = 106;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_BOTTOM, BorderS";
if (true) return _setborder(_style_key_border_bottom,_borderstyle);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _borderbottomcolor(short _color) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub BorderBottomColor (Color As Short) As X";
 //BA.debugLineNum = 73;BA.debugLine="Return SetBorderColor(STYLE_KEY_BOTTOM_BORDER_COL";
if (true) return _setbordercolor(_style_key_bottom_border_color,_color);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _borderleft(String _borderstyle) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub BorderLeft (BorderStyle As String) As X";
 //BA.debugLineNum = 116;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_LEFT, BorderSty";
if (true) return _setborder(_style_key_border_left,_borderstyle);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _borderleftcolor(short _color) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub BorderLeftColor (Color As Short) As XLS";
 //BA.debugLineNum = 83;BA.debugLine="Return SetBorderColor(STYLE_KEY_LEFT_BORDER_COLOR";
if (true) return _setbordercolor(_style_key_left_border_color,_color);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _borderright(String _borderstyle) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Public Sub BorderRight (BorderStyle As String) As";
 //BA.debugLineNum = 121;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_RIGHT, BorderSt";
if (true) return _setborder(_style_key_border_right,_borderstyle);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _borderrightcolor(short _color) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Public Sub BorderRightColor (Color As Short) As XL";
 //BA.debugLineNum = 88;BA.debugLine="Return SetBorderColor(STYLE_KEY_RIGHT_BORDER_COLO";
if (true) return _setbordercolor(_style_key_right_border_color,_color);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _bordertop(String _borderstyle) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Public Sub BorderTop (BorderStyle As String) As XL";
 //BA.debugLineNum = 111;BA.debugLine="Return SetBorder(STYLE_KEY_BORDER_TOP, BorderStyl";
if (true) return _setborder(_style_key_border_top,_borderstyle);
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _bordertopcolor(short _color) throws Exception{
 //BA.debugLineNum = 77;BA.debugLine="Public Sub BorderTopColor (Color As Short) As XLSt";
 //BA.debugLineNum = 78;BA.debugLine="Return SetBorderColor(STYLE_KEY_TOP_BORDER_COLOR,";
if (true) return _setbordercolor(_style_key_top_border_color,_color);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private STYLE_KEY_HORIZONTAL_ALIGNMENT = \"setAlig";
_style_key_horizontal_alignment = "setAlignment";
 //BA.debugLineNum = 3;BA.debugLine="Private STYLE_KEY_BORDER_BOTTOM = \"setBorderBotto";
_style_key_border_bottom = "setBorderBottom";
 //BA.debugLineNum = 4;BA.debugLine="Private STYLE_KEY_BORDER_LEFT = \"setBorderLeft\" A";
_style_key_border_left = "setBorderLeft";
 //BA.debugLineNum = 5;BA.debugLine="Private STYLE_KEY_BORDER_RIGHT = \"setBorderRight\"";
_style_key_border_right = "setBorderRight";
 //BA.debugLineNum = 6;BA.debugLine="Private STYLE_KEY_BORDER_TOP = \"setBorderTop\" As";
_style_key_border_top = "setBorderTop";
 //BA.debugLineNum = 7;BA.debugLine="Private STYLE_KEY_BOTTOM_BORDER_COLOR = \"setBotto";
_style_key_bottom_border_color = "setBottomBorderColor";
 //BA.debugLineNum = 8;BA.debugLine="Private STYLE_KEY_LEFT_BORDER_COLOR = \"setLeftBor";
_style_key_left_border_color = "setLeftBorderColor";
 //BA.debugLineNum = 9;BA.debugLine="Private STYLE_KEY_RIGHT_BORDER_COLOR = \"setRightB";
_style_key_right_border_color = "setRightBorderColor";
 //BA.debugLineNum = 10;BA.debugLine="Private STYLE_KEY_TOP_BORDER_COLOR = \"setTopBorde";
_style_key_top_border_color = "setTopBorderColor";
 //BA.debugLineNum = 11;BA.debugLine="Private STYLE_KEY_DATA_FORMAT = \"setDataFormat\" A";
_style_key_data_format = "setDataFormat";
 //BA.debugLineNum = 13;BA.debugLine="Private STYLE_KEY_FILL_FOREGROUND_COLOR = \"setFil";
_style_key_fill_foreground_color = "setFillForegroundColor";
 //BA.debugLineNum = 14;BA.debugLine="Private STYLE_KEY_FILL_PATTERN = \"setFillPattern\"";
_style_key_fill_pattern = "setFillPattern";
 //BA.debugLineNum = 15;BA.debugLine="Private STYLE_KEY_FONT = \"setFont\" As String";
_style_key_font = "setFont";
 //BA.debugLineNum = 16;BA.debugLine="Private STYLE_KEY_HIDDEN = \"setHidden\" As String";
_style_key_hidden = "setHidden";
 //BA.debugLineNum = 17;BA.debugLine="Private STYLE_KEY_INDENTION = \"setIndention\" As S";
_style_key_indention = "setIndention";
 //BA.debugLineNum = 18;BA.debugLine="Private STYLE_KEY_LOCKED = \"setLocked\" As String";
_style_key_locked = "setLocked";
 //BA.debugLineNum = 19;BA.debugLine="Private STYLE_KEY_ROTATION = \"setRotation\" As Str";
_style_key_rotation = "setRotation";
 //BA.debugLineNum = 20;BA.debugLine="Private STYLE_KEY_VERTICAL_ALIGNMENT = \"setVertic";
_style_key_vertical_alignment = "setVerticalAlignment";
 //BA.debugLineNum = 21;BA.debugLine="Private STYLE_KEY_WRAP_TEXT = \"setWrapText\" As St";
_style_key_wrap_text = "setWrapText";
 //BA.debugLineNum = 22;BA.debugLine="Private bba As JavaObject";
_bba = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 23;BA.debugLine="Public StyleMap As Map";
_stylemap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Private writer As XLWorkbookWriter";
_writer = new japam.sie.xlworkbookwriter();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public japam.sie.xlstyle  _clone() throws Exception{
japam.sie.xlstyle _newstyle = null;
String _k = "";
 //BA.debugLineNum = 178;BA.debugLine="Public Sub Clone As XLStyle";
 //BA.debugLineNum = 179;BA.debugLine="Dim NewStyle As XLStyle";
_newstyle = new japam.sie.xlstyle();
 //BA.debugLineNum = 180;BA.debugLine="NewStyle.Initialize (writer)";
_newstyle._initialize /*japam.sie.xlstyle*/ (ba,_writer);
 //BA.debugLineNum = 181;BA.debugLine="For Each k As String In StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _stylemap.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 182;BA.debugLine="NewStyle.StyleMap.Put(k, StyleMap.Get(k))";
_newstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_stylemap.Get((Object)(_k)));
 }
};
 //BA.debugLineNum = 184;BA.debugLine="Return NewStyle";
if (true) return _newstyle;
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _dataformat(String _format) throws Exception{
short _ix = (short)0;
 //BA.debugLineNum = 96;BA.debugLine="Public Sub DataFormat (Format As String) As XLStyl";
 //BA.debugLineNum = 97;BA.debugLine="Dim ix As Short = writer.jWorkbook.RunMethodJO(\"c";
_ix = (short)(BA.ObjectToNumber(_writer._jworkbook /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("createDataFormat",(Object[])(__c.Null)).RunMethod("getFormat",new Object[]{(Object)(_format)})));
 //BA.debugLineNum = 98;BA.debugLine="StyleMap.Put(STYLE_KEY_DATA_FORMAT, ix)";
_stylemap.Put((Object)(_style_key_data_format),(Object)(_ix));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _font(short _size) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub Font (Size As Short) As XLStyle";
 //BA.debugLineNum = 143;BA.debugLine="Return FontColor(Size, writer.xl.COLOR_BLACK)";
if (true) return _fontcolor(_size,(int) (_writer._xl /*japam.sie.xlutils*/ ._color_black /*short*/ ));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _fontbold(short _size) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Public Sub FontBold (Size As Short) As XLStyle";
 //BA.debugLineNum = 155;BA.debugLine="Return FontBoldColor(Size, writer.xl.COLOR_BLACK)";
if (true) return _fontboldcolor(_size,(int) (_writer._xl /*japam.sie.xlutils*/ ._color_black /*short*/ ));
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _fontboldcolor(short _size,int _color) throws Exception{
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
 //BA.debugLineNum = 166;BA.debugLine="Public Sub FontBoldColor (Size As Short, Color As";
 //BA.debugLineNum = 167;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, True, wri";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = _writer._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (_size,__c.True,_writer._defaultfontname /*String*/ ,__c.False,__c.False,_color);
 //BA.debugLineNum = 168;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
_stylemap.Put((Object)(_style_key_font),(Object)(_f.getIndex()));
 //BA.debugLineNum = 169;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _fontcolor(short _size,int _color) throws Exception{
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
 //BA.debugLineNum = 147;BA.debugLine="Public Sub FontColor (Size As Short, Color As Int)";
 //BA.debugLineNum = 148;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, False, wr";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = _writer._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (_size,__c.False,_writer._defaultfontname /*String*/ ,__c.False,__c.False,_color);
 //BA.debugLineNum = 149;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
_stylemap.Put((Object)(_style_key_font),(Object)(_f.getIndex()));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _fontlink(short _size) throws Exception{
anywheresoftware.b4j.objects.PoiFontWrapper _f = null;
 //BA.debugLineNum = 159;BA.debugLine="Public Sub FontLink (Size As Short) As XLStyle";
 //BA.debugLineNum = 160;BA.debugLine="Dim f As PoiFont = writer.GetFont(Size, False, wr";
_f = new anywheresoftware.b4j.objects.PoiFontWrapper();
_f = _writer._getfont /*anywheresoftware.b4j.objects.PoiFontWrapper*/ (_size,__c.False,_writer._defaultfontname /*String*/ ,__c.False,__c.True,(int) (_writer._xl /*japam.sie.xlutils*/ ._color_blue /*short*/ ));
 //BA.debugLineNum = 161;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, f.Index)";
_stylemap.Put((Object)(_style_key_font),(Object)(_f.getIndex()));
 //BA.debugLineNum = 162;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 163;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _fontother(anywheresoftware.b4j.objects.PoiFontWrapper _pfont) throws Exception{
 //BA.debugLineNum = 172;BA.debugLine="Public Sub FontOther (PFont As PoiFont) As XLStyle";
 //BA.debugLineNum = 173;BA.debugLine="StyleMap.Put(STYLE_KEY_FONT, PFont.Index)";
_stylemap.Put((Object)(_style_key_font),(Object)(_pfont.getIndex()));
 //BA.debugLineNum = 174;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _foregroundcolor(short _color) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub ForegroundColor (Color As Short) As XLS";
 //BA.debugLineNum = 36;BA.debugLine="StyleMap.Put(STYLE_KEY_FILL_FOREGROUND_COLOR, Col";
_stylemap.Put((Object)(_style_key_fill_foreground_color),(Object)(_color));
 //BA.debugLineNum = 37;BA.debugLine="StyleMap.Put(STYLE_KEY_FILL_PATTERN, \"SOLID_FOREG";
_stylemap.Put((Object)(_style_key_fill_pattern),(Object)("SOLID_FOREGROUND"));
 //BA.debugLineNum = 38;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _hidden(boolean _value) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub Hidden (Value As Boolean) As XLStyle";
 //BA.debugLineNum = 49;BA.debugLine="StyleMap.Put(STYLE_KEY_HIDDEN, Value)";
_stylemap.Put((Object)(_style_key_hidden),(Object)(_value));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _horizontalalignment(String _alignment) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Public Sub HorizontalAlignment (Alignment As Strin";
 //BA.debugLineNum = 137;BA.debugLine="StyleMap.Put(STYLE_KEY_HORIZONTAL_ALIGNMENT, Alig";
_stylemap.Put((Object)(_style_key_horizontal_alignment),(Object)(_alignment));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _importstyle(japam.sie.xlstyle _otherstyle) throws Exception{
String _k = "";
 //BA.debugLineNum = 188;BA.debugLine="Public Sub ImportStyle (OtherStyle As XLStyle) As";
 //BA.debugLineNum = 189;BA.debugLine="For Each k As String In OtherStyle.StyleMap.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _otherstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 190;BA.debugLine="StyleMap.Put(k, OtherStyle.StyleMap.Get(k))";
_stylemap.Put((Object)(_k),_otherstyle._stylemap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k)));
 }
};
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _indention(short _value) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub Indention (Value As Short) As XLStyle";
 //BA.debugLineNum = 61;BA.debugLine="StyleMap.Put(STYLE_KEY_INDENTION, Value)";
_stylemap.Put((Object)(_style_key_indention),(Object)(_value));
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _initialize(anywheresoftware.b4a.BA _ba,japam.sie.xlworkbookwriter _vwriter) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize (vwriter As XLWorkbookWriter";
 //BA.debugLineNum = 28;BA.debugLine="bba.InitializeStatic(\"anywheresoftware.b4a.BA\")";
_bba.InitializeStatic("anywheresoftware.b4a.BA");
 //BA.debugLineNum = 29;BA.debugLine="StyleMap.Initialize";
_stylemap.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="writer = vwriter";
_writer = _vwriter;
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _locked(boolean _value) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Locked (Value As Boolean) As XLStyle";
 //BA.debugLineNum = 43;BA.debugLine="StyleMap.Put(STYLE_KEY_LOCKED, Value)";
_stylemap.Put((Object)(_style_key_locked),(Object)(_value));
 //BA.debugLineNum = 44;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _rotation(short _value) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub Rotation (Value As Short) As XLStyle";
 //BA.debugLineNum = 67;BA.debugLine="StyleMap.Put(STYLE_KEY_ROTATION, Value)";
_stylemap.Put((Object)(_style_key_rotation),(Object)(_value));
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _setborder(String _property,String _style) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Private Sub SetBorder (Property As String, Style A";
 //BA.debugLineNum = 125;BA.debugLine="StyleMap.Put(Property, Style)";
_stylemap.Put((Object)(_property),(Object)(_style));
 //BA.debugLineNum = 126;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _setbordercolor(String _property,short _color) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Private Sub SetBorderColor (Property As String, Co";
 //BA.debugLineNum = 92;BA.debugLine="StyleMap.Put(Property, Color)";
_stylemap.Put((Object)(_property),(Object)(_color));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _verticalalignment(String _alignment) throws Exception{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub VerticalAlignment (Alignment As String)";
 //BA.debugLineNum = 131;BA.debugLine="StyleMap.Put(STYLE_KEY_VERTICAL_ALIGNMENT, Alignm";
_stylemap.Put((Object)(_style_key_vertical_alignment),(Object)(_alignment));
 //BA.debugLineNum = 132;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return null;
}
public japam.sie.xlstyle  _wraptext(boolean _value) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub WrapText (Value As Boolean) As XLStyle";
 //BA.debugLineNum = 55;BA.debugLine="StyleMap.Put(STYLE_KEY_WRAP_TEXT, Value)";
_stylemap.Put((Object)(_style_key_wrap_text),(Object)(_value));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (japam.sie.xlstyle)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
