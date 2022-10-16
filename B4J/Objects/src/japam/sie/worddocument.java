package japam.sie;

import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import org.apache.poi.xwpf.usermodel.*;
import java.math.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class worddocument extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.worddocument", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.worddocument.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.object.JavaObject _xwpfdocument = null;
public japam.sie.wordutils _mwu = null;
public japam.sie.b4xset _allowedtags = null;
public anywheresoftware.b4a.objects.collections.List _stack = null;
public int _start = 0;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstring = null;
public anywheresoftware.b4a.objects.collections.Map _colorsmap = null;
public anywheresoftware.b4a.objects.collections.Map _highlightcolorsmap = null;
public boolean _debuglog = false;
public anywheresoftware.b4j.object.JavaObject _jme = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public static class _wordtagnode{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public boolean CanHaveNestedTags;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
CanHaveNestedTags = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _wordtextnode{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.collections.List Tags;
public void Initialize() {
IsInitialized = true;
Text = "";
Tags = new anywheresoftware.b4a.objects.collections.List();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _worddocelement{
public boolean IsInitialized;
public String Tag;
public anywheresoftware.b4a.objects.collections.Map Extra;
public anywheresoftware.b4a.objects.collections.List Children;
public anywheresoftware.b4j.object.JavaObject JElement;
public void Initialize() {
IsInitialized = true;
Tag = "";
Extra = new anywheresoftware.b4a.objects.collections.Map();
Children = new anywheresoftware.b4a.objects.collections.List();
JElement = new anywheresoftware.b4j.object.JavaObject();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public japam.sie.worddocument  _append(String _bbtext) throws Exception{
japam.sie.worddocument._worddocelement _doc = null;
 //BA.debugLineNum = 59;BA.debugLine="Public Sub Append(BBText As String) As WordDocumen";
 //BA.debugLineNum = 60;BA.debugLine="Dim doc As WordDocElement = Parse(BBText)";
_doc = _parse(_bbtext);
 //BA.debugLineNum = 61;BA.debugLine="HandleElements(doc)";
_handleelements(_doc);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (japam.sie.worddocument)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public XWPFDocument As JavaObject";
_xwpfdocument = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 3;BA.debugLine="Private mWU As WordUtils 'ignore";
_mwu = new japam.sie.wordutils();
 //BA.debugLineNum = 4;BA.debugLine="Private AllowedTags As B4XSet";
_allowedtags = new japam.sie.b4xset();
 //BA.debugLineNum = 5;BA.debugLine="Private Stack As List";
_stack = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Private Start As Int";
_start = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public ErrorString As StringBuilder";
_errorstring = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Type WordTagNode (Tag As String, Extra As Map, Ca";
;
 //BA.debugLineNum = 9;BA.debugLine="Type WordTextNode (Text As String, Tags As List)";
;
 //BA.debugLineNum = 10;BA.debugLine="Type WordDocElement(Tag As String, Extra As Map,";
;
 //BA.debugLineNum = 11;BA.debugLine="Private ColorsMap As Map";
_colorsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Private HighlightColorsMap As Map";
_highlightcolorsmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Public DebugLog As Boolean";
_debuglog = false;
 //BA.debugLineNum = 14;BA.debugLine="Private jme As JavaObject";
_jme = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _configureparagraph(anywheresoftware.b4j.object.JavaObject _paragraph,japam.sie.worddocument._worddocelement _element) throws Exception{
anywheresoftware.b4a.objects.collections.Map _props = null;
String _alignment = "";
int _indentationleft = 0;
 //BA.debugLineNum = 383;BA.debugLine="Private Sub ConfigureParagraph (Paragraph As JavaO";
 //BA.debugLineNum = 384;BA.debugLine="Dim props As Map = Element.Extra";
_props = new anywheresoftware.b4a.objects.collections.Map();
_props = _element.Extra /*anywheresoftware.b4a.objects.collections.Map*/ ;
 //BA.debugLineNum = 385;BA.debugLine="Dim Alignment As String = props.GetDefault(\"align";
_alignment = BA.ObjectToString(_props.GetDefault((Object)("alignment"),(Object)("START")));
 //BA.debugLineNum = 386;BA.debugLine="Paragraph.RunMethod(\"setAlignment\", Array(Alignme";
_paragraph.RunMethod("setAlignment",new Object[]{(Object)(_alignment.toUpperCase())});
 //BA.debugLineNum = 387;BA.debugLine="Dim indentationLeft As Int = props.GetDefault(\"in";
_indentationleft = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("indentationleft"),(Object)(0))));
 //BA.debugLineNum = 388;BA.debugLine="If GetBoolean(props.GetDefault(\"pagebreak\", False";
if (_getboolean(BA.ObjectToString(_props.GetDefault((Object)("pagebreak"),(Object)(__c.False))))==__c.True) { 
 //BA.debugLineNum = 389;BA.debugLine="Paragraph.RunMethod(\"setPageBreak\", Array(True))";
_paragraph.RunMethod("setPageBreak",new Object[]{(Object)(__c.True)});
 };
 //BA.debugLineNum = 391;BA.debugLine="If indentationLeft <> 0 Then Paragraph.RunMethod(";
if (_indentationleft!=0) { 
_paragraph.RunMethod("setIndentationLeft",new Object[]{(Object)(_indentationleft*20)});};
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public japam.sie.worddocument._wordtagnode  _createtagnode(String _tag) throws Exception{
japam.sie.worddocument._wordtagnode _n = null;
 //BA.debugLineNum = 375;BA.debugLine="Private Sub CreateTagNode (Tag As String) As WordT";
 //BA.debugLineNum = 376;BA.debugLine="Dim n As WordTagNode";
_n = new japam.sie.worddocument._wordtagnode();
 //BA.debugLineNum = 377;BA.debugLine="n.Initialize";
_n.Initialize();
 //BA.debugLineNum = 378;BA.debugLine="n.Tag = Tag";
_n.Tag /*String*/  = _tag;
 //BA.debugLineNum = 379;BA.debugLine="n.CanHaveNestedTags = True";
_n.CanHaveNestedTags /*boolean*/  = __c.True;
 //BA.debugLineNum = 380;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return null;
}
public japam.sie.worddocument._wordtextnode  _createtextnode(String _text) throws Exception{
japam.sie.worddocument._wordtextnode _n = null;
 //BA.debugLineNum = 365;BA.debugLine="Private Sub CreateTextNode(Text As String) As Word";
 //BA.debugLineNum = 366;BA.debugLine="Dim n As WordTextNode";
_n = new japam.sie.worddocument._wordtextnode();
 //BA.debugLineNum = 367;BA.debugLine="n.Initialize";
_n.Initialize();
 //BA.debugLineNum = 368;BA.debugLine="n.Text = Text";
_n.Text /*String*/  = _text;
 //BA.debugLineNum = 369;BA.debugLine="n.Tags.Initialize";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 370;BA.debugLine="n.Tags.AddAll(Stack)";
_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .AddAll(_stack);
 //BA.debugLineNum = 371;BA.debugLine="Return n";
if (true) return _n;
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public japam.sie.worddocument._worddocelement  _createworddocelement(String _tag,anywheresoftware.b4a.objects.collections.Map _extra) throws Exception{
japam.sie.worddocument._worddocelement _t1 = null;
 //BA.debugLineNum = 487;BA.debugLine="Private Sub CreateWordDocElement (Tag As String, E";
 //BA.debugLineNum = 488;BA.debugLine="Dim t1 As WordDocElement";
_t1 = new japam.sie.worddocument._worddocelement();
 //BA.debugLineNum = 489;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 490;BA.debugLine="t1.Tag = Tag";
_t1.Tag /*String*/  = _tag;
 //BA.debugLineNum = 491;BA.debugLine="If Extra.IsInitialized = False Then Extra.Initial";
if (_extra.IsInitialized()==__c.False) { 
_extra.Initialize();};
 //BA.debugLineNum = 492;BA.debugLine="t1.Extra = Extra";
_t1.Extra /*anywheresoftware.b4a.objects.collections.Map*/  = _extra;
 //BA.debugLineNum = 493;BA.debugLine="t1.Children.Initialize";
_t1.Children /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 494;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 495;BA.debugLine="End Sub";
return null;
}
public String  _error(String _msg) throws Exception{
String _s = "";
 //BA.debugLineNum = 355;BA.debugLine="Private Sub Error (msg As String)";
 //BA.debugLineNum = 356;BA.debugLine="Dim s As String = $\"Error (position - ${Start}):";
_s = ("Error (position - "+__c.SmartStringFormatter("",(Object)(_start))+"): "+__c.SmartStringFormatter("",(Object)(_msg))+"");
 //BA.debugLineNum = 360;BA.debugLine="LogError(s)";
__c.LogError(_s);
 //BA.debugLineNum = 362;BA.debugLine="ErrorString.Append(s).Append(CRLF)";
_errorstring.Append(_s).Append(__c.CRLF);
 //BA.debugLineNum = 363;BA.debugLine="End Sub";
return "";
}
public boolean  _getboolean(String _s) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Private Sub GetBoolean(s As String) As Boolean";
 //BA.debugLineNum = 395;BA.debugLine="Return s.ToLowerCase = \"true\"";
if (true) return (_s.toLowerCase()).equals("true");
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return false;
}
public String  _handleelements(japam.sie.worddocument._worddocelement _parent) throws Exception{
int _index = 0;
japam.sie.worddocument._worddocelement _child = null;
anywheresoftware.b4j.object.JavaObject _par = null;
anywheresoftware.b4a.objects.collections.List _paragraphs = null;
anywheresoftware.b4j.object.JavaObject _j = null;
japam.sie.worddocument._wordtextnode _node = null;
int _rows = 0;
int _cols = 0;
String _alignment = "";
anywheresoftware.b4a.objects.collections.Map _fixedmap = null;
String _rh = "";
int _celloffset = 0;
int _colspan = 0;
int _rowspan = 0;
 //BA.debugLineNum = 65;BA.debugLine="Private Sub HandleElements(Parent As WordDocElemen";
 //BA.debugLineNum = 66;BA.debugLine="For index = 0 To Parent.Children.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_parent.Children /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_index = (int) (0) ;
for (;_index <= limit1 ;_index = _index + step1 ) {
 //BA.debugLineNum = 67;BA.debugLine="Dim child As WordDocElement = Parent.Children.Ge";
_child = (japam.sie.worddocument._worddocelement)(_parent.Children /*anywheresoftware.b4a.objects.collections.List*/ .Get(_index));
 //BA.debugLineNum = 68;BA.debugLine="If DebugLog Then";
if (_debuglog) { 
 //BA.debugLineNum = 69;BA.debugLine="Log(\"Tag: \" & child.Tag)";
__c.LogImpl("943319300","Tag: "+_child.Tag /*String*/ ,0);
 };
 //BA.debugLineNum = 71;BA.debugLine="Select child.Tag";
switch (BA.switchObjectToInt(_child.Tag /*String*/ ,"p","header","footer","table","row","cell")) {
case 0: {
 //BA.debugLineNum = 73;BA.debugLine="Dim par As JavaObject";
_par = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 74;BA.debugLine="Select Parent.Tag";
switch (BA.switchObjectToInt(_parent.Tag /*String*/ ,"doc","header","footer","cell")) {
case 0: {
 //BA.debugLineNum = 76;BA.debugLine="par = XWPFDocument.RunMethod(\"createParagrap";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_xwpfdocument.RunMethod("createParagraph",(Object[])(__c.Null))));
 break; }
case 1: 
case 2: {
 //BA.debugLineNum = 78;BA.debugLine="par = Parent.JElement.RunMethod(\"createParag";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("createParagraph",(Object[])(__c.Null))));
 break; }
case 3: {
 //BA.debugLineNum = 80;BA.debugLine="If index = 0 Then";
if (_index==0) { 
 //BA.debugLineNum = 81;BA.debugLine="Dim paragraphs As List";
_paragraphs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 82;BA.debugLine="paragraphs.Initialize";
_paragraphs.Initialize();
 //BA.debugLineNum = 83;BA.debugLine="Dim j As JavaObject = paragraphs";
_j = new anywheresoftware.b4j.object.JavaObject();
_j = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraphs.getObject()));
 //BA.debugLineNum = 84;BA.debugLine="j.RunMethod(\"addAll\", Array(Parent.JElement";
_j.RunMethod("addAll",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethodJO("getParagraphs",(Object[])(__c.Null)).getObject())});
 //BA.debugLineNum = 85;BA.debugLine="If paragraphs.Size > 0 Then";
if (_paragraphs.getSize()>0) { 
 //BA.debugLineNum = 86;BA.debugLine="par = paragraphs.Get(0)";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraphs.Get((int) (0))));
 };
 };
 //BA.debugLineNum = 89;BA.debugLine="If par.IsInitialized = False Then";
if (_par.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 90;BA.debugLine="par = Parent.JElement.RunMethod(\"addParagra";
_par = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("addParagraph",(Object[])(__c.Null))));
 };
 break; }
}
;
 //BA.debugLineNum = 93;BA.debugLine="ConfigureParagraph(par, child)";
_configureparagraph(_par,_child);
 //BA.debugLineNum = 94;BA.debugLine="For Each node As WordTextNode In child.Childre";
{
final anywheresoftware.b4a.BA.IterableList group29 = _child.Children /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen29 = group29.getSize()
;int index29 = 0;
;
for (; index29 < groupLen29;index29++){
_node = (japam.sie.worddocument._wordtextnode)(group29.Get(index29));
 //BA.debugLineNum = 95;BA.debugLine="TextToRuns(par, node)";
_texttoruns(_par,_node);
 }
};
 break; }
case 1: {
 //BA.debugLineNum = 98;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_xwpfdocument.RunMethod("createHeader",new Object[]{(Object)("DEFAULT")})));
 //BA.debugLineNum = 99;BA.debugLine="HandleElements(child)";
_handleelements(_child);
 break; }
case 2: {
 //BA.debugLineNum = 101;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_xwpfdocument.RunMethod("createFooter",new Object[]{(Object)("DEFAULT")})));
 //BA.debugLineNum = 102;BA.debugLine="HandleElements(child)";
_handleelements(_child);
 break; }
case 3: {
 //BA.debugLineNum = 104;BA.debugLine="Dim rows As Int = child.Extra.Get(\"rows\")";
_rows = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rows"))));
 //BA.debugLineNum = 105;BA.debugLine="Dim cols As Int = child.Extra.Get(\"cols\")";
_cols = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("cols"))));
 //BA.debugLineNum = 106;BA.debugLine="child.JElement = XWPFDocument.RunMethod(\"creat";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_xwpfdocument.RunMethod("createTable",new Object[]{(Object)(_rows),(Object)(_cols)})));
 //BA.debugLineNum = 107;BA.debugLine="If child.Extra.ContainsKey(\"alignment\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("alignment"))) { 
 //BA.debugLineNum = 108;BA.debugLine="Dim alignment As String = ToUpper(child.Extra";
_alignment = _toupper(BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("alignment"))));
 //BA.debugLineNum = 110;BA.debugLine="Dim fixedMap As Map = CreateMap(\"LEFT\": \"RIGH";
_fixedmap = new anywheresoftware.b4a.objects.collections.Map();
_fixedmap = __c.createMap(new Object[] {(Object)("LEFT"),(Object)("RIGHT"),(Object)("CENTER"),(Object)("LEFT"),(Object)("RIGHT"),(Object)("CENTER")});
 //BA.debugLineNum = 111;BA.debugLine="child.JElement.RunMethod(\"setTableAlignment\",";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setTableAlignment",new Object[]{_fixedmap.Get((Object)(_alignment))});
 };
 //BA.debugLineNum = 113;BA.debugLine="HandleElements(child)";
_handleelements(_child);
 break; }
case 4: {
 //BA.debugLineNum = 115;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getRow",new Object[]{(Object)(_index)})));
 //BA.debugLineNum = 116;BA.debugLine="If child.Extra.ContainsKey(\"height\") Then chil";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("height"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setHeight",new Object[]{_to20thspoint((double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height")))),__c.False)});};
 //BA.debugLineNum = 117;BA.debugLine="If child.Extra.ContainsKey(\"repeatheader\") The";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("repeatheader"))) { 
 //BA.debugLineNum = 118;BA.debugLine="Dim rh As String = child.Extra.Get(\"repeathea";
_rh = BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("repeatheader")));
 //BA.debugLineNum = 119;BA.debugLine="child.JElement.RunMethod(\"setRepeatHeader\", A";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setRepeatHeader",new Object[]{(Object)((_rh.toLowerCase()).equals("true"))});
 };
 //BA.debugLineNum = 121;BA.debugLine="HandleElements(child)";
_handleelements(_child);
 break; }
case 5: {
 //BA.debugLineNum = 123;BA.debugLine="Dim CellOffset As Int = index + child.Extra.Ge";
_celloffset = (int) (_index+(double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("offset"),(Object)(0)))));
 //BA.debugLineNum = 124;BA.debugLine="child.JElement = Parent.JElement.RunMethod(\"ge";
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/  = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("getCell",new Object[]{(Object)(_celloffset)})));
 //BA.debugLineNum = 125;BA.debugLine="If child.Extra.ContainsKey(\"color\") Then child";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setColor",new Object[]{(Object)(_parsecolorstring(BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});};
 //BA.debugLineNum = 126;BA.debugLine="If child.Extra.ContainsKey(\"verticalalignment\"";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("verticalalignment"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setVerticalAlignment",new Object[]{(Object)(_toupper(BA.ObjectToString(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("verticalalignment")))))});};
 //BA.debugLineNum = 127;BA.debugLine="If child.Extra.ContainsKey(\"width\") Then child";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("width"))) { 
_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .RunMethod("setWidth",new Object[]{_to20thspoint((double)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width")))),__c.True)});};
 //BA.debugLineNum = 128;BA.debugLine="If child.Extra.ContainsKey(\"colspan\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("colspan"))) { 
 //BA.debugLineNum = 129;BA.debugLine="Dim ColSpan As Int = child.Extra.Get(\"colspan";
_colspan = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("colspan"))));
 //BA.debugLineNum = 130;BA.debugLine="jme.RunMethod(\"MergeCellsHorizontal\", Array(P";
_jme.RunMethod("MergeCellsHorizontal",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_child.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_index),(Object)(_index+_colspan-1)});
 };
 //BA.debugLineNum = 132;BA.debugLine="If child.Extra.ContainsKey(\"rowspan\") Then";
if (_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("rowspan"))) { 
 //BA.debugLineNum = 133;BA.debugLine="Dim RowSpan As Int = child.Extra.Get(\"rowspan";
_rowspan = (int)(BA.ObjectToNumber(_child.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("rowspan"))));
 //BA.debugLineNum = 134;BA.debugLine="jme.RunMethod(\"MergeCellsVertical\", Array(Par";
_jme.RunMethod("MergeCellsVertical",new Object[]{(Object)(_parent.JElement /*anywheresoftware.b4j.object.JavaObject*/ .getObject()),(Object)(_index),(Object)(_rowspan)});
 };
 //BA.debugLineNum = 136;BA.debugLine="HandleElements(child)";
_handleelements(_child);
 break; }
}
;
 }
};
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,japam.sie.wordutils _wu,anywheresoftware.b4j.object.JavaObject _document) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize (wu As WordUtils, Document A";
 //BA.debugLineNum = 19;BA.debugLine="mWU = wu";
_mwu = _wu;
 //BA.debugLineNum = 20;BA.debugLine="XWPFDocument = Document";
_xwpfdocument = _document;
 //BA.debugLineNum = 21;BA.debugLine="AllowedTags = B4XCollections.CreateSet2(Array(\"p\"";
_allowedtags = _b4xcollections._createset2 /*japam.sie.b4xset*/ (anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("p"),(Object)("b"),(Object)("u"),(Object)("embossed"),(Object)("shadow"),(Object)("plain"),(Object)("color"),(Object)("font"),(Object)("textsize"),(Object)("break"),(Object)("i"),(Object)("strike"),(Object)("img"),(Object)("indentationleft"),(Object)("header"),(Object)("footer"),(Object)("table"),(Object)("row"),(Object)("cell"),(Object)("highlight"),(Object)("url"),(Object)("bookmark")}));
 //BA.debugLineNum = 23;BA.debugLine="ColorsMap = CreateMap(\"black\": 0xFF000000, _ 		\"d";
_colorsmap = __c.createMap(new Object[] {(Object)("black"),(Object)(((int)0xff000000)),(Object)("darkgray"),(Object)(((int)0xff444444)),(Object)("gray"),(Object)(((int)0xffcccccc)),(Object)("white"),(Object)(((int)0xffffffff)),(Object)("red"),(Object)(((int)0xffff0000)),(Object)("green"),(Object)(((int)0xff00ff00)),(Object)("blue"),(Object)(((int)0xff0000ff)),(Object)("yellow"),(Object)(((int)0xffffff00)),(Object)("cyan"),(Object)(((int)0xff00ffff)),(Object)("darkblue"),(Object)(((int)0xff000080)),(Object)("darkcyan"),(Object)(((int)0xff008080)),(Object)("darkgreen"),(Object)(((int)0xff008000)),(Object)("darkmagenta"),(Object)(((int)0xff800080)),(Object)("darkred"),(Object)(((int)0xff800000)),(Object)("darkyellow"),(Object)(((int)0xff808000)),(Object)("magenta"),(Object)(((int)0xffff00ff))});
 //BA.debugLineNum = 39;BA.debugLine="HighlightColorsMap = CreateMap(\"black\": \"black\",";
_highlightcolorsmap = __c.createMap(new Object[] {(Object)("black"),(Object)("black"),(Object)("blue"),(Object)("blue"),(Object)("cyan"),(Object)("cyan"),(Object)("green"),(Object)("green"),(Object)("magenta"),(Object)("magenta"),(Object)("red"),(Object)("red"),(Object)("yellow"),(Object)("yellow"),(Object)("white"),(Object)("white"),(Object)("darkblue"),(Object)("darkBlue"),(Object)("darkcyan"),(Object)("darkCyan"),(Object)("darkgreen"),(Object)("darkGreen"),(Object)("darkmagenta"),(Object)("darkMagenta"),(Object)("darkred"),(Object)("darkRed"),(Object)("darkyellow"),(Object)("darkYellow"),(Object)("darkgray"),(Object)("darkGray"),(Object)("gray"),(Object)("lightGray")});
 //BA.debugLineNum = 55;BA.debugLine="jme = Me";
_jme = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public japam.sie.worddocument._worddocelement  _organizeelements(anywheresoftware.b4a.objects.collections.List _nodes) throws Exception{
japam.sie.worddocument._worddocelement _doc = null;
anywheresoftware.b4a.objects.collections.Map _elements = null;
japam.sie.worddocument._wordtextnode _node = null;
japam.sie.worddocument._worddocelement _currentelement = null;
japam.sie.worddocument._wordtagnode _tag = null;
japam.sie.worddocument._worddocelement _newelement = null;
 //BA.debugLineNum = 256;BA.debugLine="Private Sub OrganizeElements (Nodes As List) As Wo";
 //BA.debugLineNum = 257;BA.debugLine="RemoveInvalidNodes(Nodes)";
_removeinvalidnodes(_nodes);
 //BA.debugLineNum = 258;BA.debugLine="Dim doc As WordDocElement = CreateWordDocElement(";
_doc = _createworddocelement("doc",__c.createMap(new Object[] {}));
 //BA.debugLineNum = 259;BA.debugLine="Dim Elements As Map";
_elements = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 260;BA.debugLine="Elements.Initialize";
_elements.Initialize();
 //BA.debugLineNum = 261;BA.debugLine="For Each node As WordTextNode In Nodes";
{
final anywheresoftware.b4a.BA.IterableList group5 = _nodes;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_node = (japam.sie.worddocument._wordtextnode)(group5.Get(index5));
 //BA.debugLineNum = 262;BA.debugLine="Dim CurrentElement As WordDocElement = doc";
_currentelement = _doc;
 //BA.debugLineNum = 263;BA.debugLine="For Each tag As WordTagNode In node.Tags";
{
final anywheresoftware.b4a.BA.IterableList group7 = _node.Tags /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_tag = (japam.sie.worddocument._wordtagnode)(group7.Get(index7));
 //BA.debugLineNum = 264;BA.debugLine="If tag.Tag = \"noop\" Then Continue";
if ((_tag.Tag /*String*/ ).equals("noop")) { 
if (true) continue;};
 //BA.debugLineNum = 265;BA.debugLine="If Elements.ContainsKey(tag) Then";
if (_elements.ContainsKey((Object)(_tag))) { 
 //BA.debugLineNum = 266;BA.debugLine="CurrentElement = Elements.Get(tag)";
_currentelement = (japam.sie.worddocument._worddocelement)(_elements.Get((Object)(_tag)));
 }else {
 //BA.debugLineNum = 269;BA.debugLine="Dim NewElement As WordDocElement = CreateWordD";
_newelement = _createworddocelement(_tag.Tag /*String*/ ,_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 270;BA.debugLine="CurrentElement.Children.Add(NewElement)";
_currentelement.Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_newelement));
 //BA.debugLineNum = 271;BA.debugLine="Elements.Put(tag, NewElement)";
_elements.Put((Object)(_tag),(Object)(_newelement));
 //BA.debugLineNum = 272;BA.debugLine="CurrentElement = NewElement";
_currentelement = _newelement;
 };
 //BA.debugLineNum = 274;BA.debugLine="If tag.Tag = \"p\" Then";
if ((_tag.Tag /*String*/ ).equals("p")) { 
 //BA.debugLineNum = 275;BA.debugLine="CurrentElement.Children.Add(node)";
_currentelement.Children /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_node));
 //BA.debugLineNum = 276;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 }
};
 //BA.debugLineNum = 280;BA.debugLine="Return doc";
if (true) return _doc;
 //BA.debugLineNum = 281;BA.debugLine="End Sub";
return null;
}
public japam.sie.worddocument._worddocelement  _parse(String _text) throws Exception{
anywheresoftware.b4a.objects.collections.List _parsedelements = null;
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matcher = null;
int _lastmatchend = 0;
boolean _skipuntilendtag = false;
String _tag = "";
boolean _closedtag = false;
japam.sie.worddocument._wordtagnode _t = null;
japam.sie.worddocument._wordtagnode _n = null;
 //BA.debugLineNum = 190;BA.debugLine="Private Sub Parse (Text As String) As WordDocEleme";
 //BA.debugLineNum = 191;BA.debugLine="ErrorString.Initialize";
_errorstring.Initialize();
 //BA.debugLineNum = 192;BA.debugLine="Dim ParsedElements As List";
_parsedelements = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 193;BA.debugLine="ParsedElements.Initialize";
_parsedelements.Initialize();
 //BA.debugLineNum = 194;BA.debugLine="Stack.Initialize";
_stack.Initialize();
 //BA.debugLineNum = 195;BA.debugLine="Stack.Add(CreateTagNode(\"noop\"))";
_stack.Add((Object)(_createtagnode("noop")));
 //BA.debugLineNum = 196;BA.debugLine="Text = Text.Replace(CRLF, \"[break/]\")";
_text = _text.replace(__c.CRLF,"[break/]");
 //BA.debugLineNum = 197;BA.debugLine="Dim matcher As Matcher = Regex.Matcher(\"(?<!\\[)\\[";
_matcher = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matcher = __c.Regex.Matcher("(?<!\\[)\\[[^\\[\\]]+\\]",_text);
 //BA.debugLineNum = 198;BA.debugLine="Dim LastMatchEnd As Int = 0";
_lastmatchend = (int) (0);
 //BA.debugLineNum = 199;BA.debugLine="Dim skipUntilEndTag As Boolean = False";
_skipuntilendtag = __c.False;
 //BA.debugLineNum = 200;BA.debugLine="Do While matcher.Find";
while (_matcher.Find()) {
 //BA.debugLineNum = 201;BA.debugLine="Start = matcher.GetStart(0)";
_start = _matcher.GetStart((int) (0));
 //BA.debugLineNum = 202;BA.debugLine="If Start > LastMatchEnd And skipUntilEndTag = Fa";
if (_start>_lastmatchend && _skipuntilendtag==__c.False) { 
 //BA.debugLineNum = 203;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStrin";
_parsedelements.Add((Object)(_createtextnode(_text.substring(_lastmatchend,_start))));
 };
 //BA.debugLineNum = 205;BA.debugLine="Dim tag As String = matcher.Match.SubString2(1,";
_tag = _matcher.getMatch().substring((int) (1),(int) (_matcher.getMatch().length()-1));
 //BA.debugLineNum = 206;BA.debugLine="If tag.StartsWith(\"/\") Then";
if (_tag.startsWith("/")) { 
 //BA.debugLineNum = 207;BA.debugLine="tag = tag.SubString(1).ToLowerCase";
_tag = _tag.substring((int) (1)).toLowerCase();
 //BA.debugLineNum = 208;BA.debugLine="If StackPeek.Tag <> tag Then";
if ((_stackpeek().Tag /*String*/ ).equals(_tag) == false) { 
 //BA.debugLineNum = 209;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then";
if (_stackpeek().CanHaveNestedTags /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 210;BA.debugLine="Continue";
if (true) continue;
 };
 //BA.debugLineNum = 212;BA.debugLine="Error(\"Closing tag does not match: \" & tag)";
_error("Closing tag does not match: "+_tag);
 //BA.debugLineNum = 213;BA.debugLine="Return Null";
if (true) return (japam.sie.worddocument._worddocelement)(__c.Null);
 };
 //BA.debugLineNum = 215;BA.debugLine="If skipUntilEndTag Then";
if (_skipuntilendtag) { 
 //BA.debugLineNum = 216;BA.debugLine="If Start > LastMatchEnd Then";
if (_start>_lastmatchend) { 
 //BA.debugLineNum = 217;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubStr";
_parsedelements.Add((Object)(_createtextnode(_text.substring(_lastmatchend,_start))));
 };
 };
 //BA.debugLineNum = 220;BA.debugLine="StackPop";
_stackpop();
 //BA.debugLineNum = 221;BA.debugLine="skipUntilEndTag = False";
_skipuntilendtag = __c.False;
 }else {
 //BA.debugLineNum = 223;BA.debugLine="If StackPeek.CanHaveNestedTags = False Then Con";
if (_stackpeek().CanHaveNestedTags /*boolean*/ ==__c.False) { 
if (true) continue;};
 //BA.debugLineNum = 224;BA.debugLine="Dim ClosedTag As Boolean";
_closedtag = false;
 //BA.debugLineNum = 225;BA.debugLine="If tag.EndsWith(\"/\") Then";
if (_tag.endsWith("/")) { 
 //BA.debugLineNum = 226;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 //BA.debugLineNum = 227;BA.debugLine="tag = tag.SubString2(0, tag.Length - 1)";
_tag = _tag.substring((int) (0),(int) (_tag.length()-1));
 }else if((_tag).equals("*")) { 
 //BA.debugLineNum = 229;BA.debugLine="ClosedTag = True";
_closedtag = __c.True;
 };
 //BA.debugLineNum = 231;BA.debugLine="tag = tag.Trim";
_tag = _tag.trim();
 //BA.debugLineNum = 232;BA.debugLine="Dim t As WordTagNode = ParseTag(tag)";
_t = _parsetag(_tag);
 //BA.debugLineNum = 233;BA.debugLine="If AllowedTags.Contains(t.Tag) = False Then";
if (_allowedtags._contains /*boolean*/ ((Object)(_t.Tag /*String*/ ))==__c.False) { 
 //BA.debugLineNum = 234;BA.debugLine="Error(\"Invalid tag: \" & tag)";
_error("Invalid tag: "+_tag);
 //BA.debugLineNum = 235;BA.debugLine="Return Null";
if (true) return (japam.sie.worddocument._worddocelement)(__c.Null);
 };
 //BA.debugLineNum = 237;BA.debugLine="StackPush(t)";
_stackpush(_t);
 //BA.debugLineNum = 238;BA.debugLine="If t.Tag = \"plain\" Or t.Tag = \"url\" Then";
if ((_t.Tag /*String*/ ).equals("plain") || (_t.Tag /*String*/ ).equals("url")) { 
 //BA.debugLineNum = 239;BA.debugLine="Dim n As WordTagNode = StackPeek";
_n = _stackpeek();
 //BA.debugLineNum = 240;BA.debugLine="n.CanHaveNestedTags = False";
_n.CanHaveNestedTags /*boolean*/  = __c.False;
 //BA.debugLineNum = 241;BA.debugLine="skipUntilEndTag = True";
_skipuntilendtag = __c.True;
 };
 //BA.debugLineNum = 243;BA.debugLine="If ClosedTag Then";
if (_closedtag) { 
 //BA.debugLineNum = 244;BA.debugLine="ParsedElements.Add(CreateTextNode(\"\"))";
_parsedelements.Add((Object)(_createtextnode("")));
 //BA.debugLineNum = 245;BA.debugLine="StackPop";
_stackpop();
 };
 };
 //BA.debugLineNum = 248;BA.debugLine="LastMatchEnd = matcher.GetEnd(0)";
_lastmatchend = _matcher.GetEnd((int) (0));
 }
;
 //BA.debugLineNum = 250;BA.debugLine="If Text.Length > LastMatchEnd Then";
if (_text.length()>_lastmatchend) { 
 //BA.debugLineNum = 251;BA.debugLine="ParsedElements.Add(CreateTextNode(Text.SubString";
_parsedelements.Add((Object)(_createtextnode(_text.substring(_lastmatchend,_text.length()))));
 };
 //BA.debugLineNum = 253;BA.debugLine="Return OrganizeElements( ParsedElements)";
if (true) return _organizeelements(_parsedelements);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public String  _parsecolorstring(String _clr) throws Exception{
int _i = 0;
String _s = "";
 //BA.debugLineNum = 467;BA.debugLine="Private Sub ParseColorString(clr As String) As Str";
 //BA.debugLineNum = 468;BA.debugLine="clr = clr.ToLowerCase";
_clr = _clr.toLowerCase();
 //BA.debugLineNum = 469;BA.debugLine="If clr.StartsWith(\"#\") Then";
if (_clr.startsWith("#")) { 
 //BA.debugLineNum = 470;BA.debugLine="Return clr.SubString(1)";
if (true) return _clr.substring((int) (1));
 }else if(_clr.startsWith("0x")) { 
 //BA.debugLineNum = 472;BA.debugLine="Return clr.SubString(4)";
if (true) return _clr.substring((int) (4));
 }else if(_colorsmap.ContainsKey((Object)(_clr))) { 
 //BA.debugLineNum = 474;BA.debugLine="Dim i As Int = Bit.And(0x00ffffff, ColorsMap.Get";
_i = __c.Bit.And(((int)0x00ffffff),(int)(BA.ObjectToNumber(_colorsmap.Get((Object)(_clr)))));
 //BA.debugLineNum = 475;BA.debugLine="Dim s As String = Bit.ToHexString(i)";
_s = __c.Bit.ToHexString(_i);
 //BA.debugLineNum = 476;BA.debugLine="Do While s.Length < 6";
while (_s.length()<6) {
 //BA.debugLineNum = 477;BA.debugLine="s = \"0\" & s";
_s = "0"+_s;
 }
;
 //BA.debugLineNum = 479;BA.debugLine="Return s";
if (true) return _s;
 }else {
 //BA.debugLineNum = 481;BA.debugLine="Error(\"Invalid color value: \" & clr)";
_error("Invalid color value: "+_clr);
 //BA.debugLineNum = 482;BA.debugLine="Return \"000000\"";
if (true) return "000000";
 };
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public japam.sie.worddocument._wordtagnode  _parsetag(String _tag) throws Exception{
japam.sie.worddocument._wordtagnode _res = null;
int _i = 0;
int _last = 0;
String _c = "";
String _key = "";
int _i2 = 0;
 //BA.debugLineNum = 303;BA.debugLine="Private Sub ParseTag (tag As String) As WordTagNod";
 //BA.debugLineNum = 307;BA.debugLine="If tag.Contains(\"=\") = False Then Return CreateTa";
if (_tag.contains("=")==__c.False) { 
if (true) return _createtagnode(_tag.toLowerCase());};
 //BA.debugLineNum = 308;BA.debugLine="Dim res As WordTagNode = CreateTagNode(\"\")";
_res = _createtagnode("");
 //BA.debugLineNum = 309;BA.debugLine="res.Extra.Initialize";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
 //BA.debugLineNum = 310;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 311;BA.debugLine="Dim last As Int = -1";
_last = (int) (-1);
 //BA.debugLineNum = 312;BA.debugLine="Do While i < tag.Length";
while (_i<_tag.length()) {
 //BA.debugLineNum = 313;BA.debugLine="Dim c As String = tag.CharAt(i)";
_c = BA.ObjectToString(_tag.charAt(_i));
 //BA.debugLineNum = 314;BA.debugLine="If c = \"=\" Then";
if ((_c).equals("=")) { 
 //BA.debugLineNum = 315;BA.debugLine="Dim key As String = tag.SubString2(last + 1, i)";
_key = _tag.substring((int) (_last+1),_i).toLowerCase();
 //BA.debugLineNum = 316;BA.debugLine="If res.tag = \"\" Then 'option #2";
if ((_res.Tag /*String*/ ).equals("")) { 
 //BA.debugLineNum = 317;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
 //BA.debugLineNum = 319;BA.debugLine="Dim i2 As Int";
_i2 = 0;
 //BA.debugLineNum = 320;BA.debugLine="If tag.CharAt(i + 1) = QUOTE Then";
if (_tag.charAt((int) (_i+1))==BA.ObjectToChar(__c.QUOTE)) { 
 //BA.debugLineNum = 321;BA.debugLine="i2 = tag.IndexOf2(QUOTE, i + 2)";
_i2 = _tag.indexOf(__c.QUOTE,(int) (_i+2));
 //BA.debugLineNum = 322;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 2, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+2),_i2)));
 }else {
 //BA.debugLineNum = 324;BA.debugLine="i2 = tag.IndexOf2(\" \", i + 2)";
_i2 = _tag.indexOf(" ",(int) (_i+2));
 //BA.debugLineNum = 325;BA.debugLine="If i2 = -1 Then i2 = tag.Length";
if (_i2==-1) { 
_i2 = _tag.length();};
 //BA.debugLineNum = 326;BA.debugLine="res.Extra.Put(key, tag.SubString2(i + 1, i2))";
_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_key),(Object)(_tag.substring((int) (_i+1),_i2)));
 };
 //BA.debugLineNum = 328;BA.debugLine="i = i2";
_i = _i2;
 //BA.debugLineNum = 329;BA.debugLine="last = i";
_last = _i;
 };
 //BA.debugLineNum = 331;BA.debugLine="If c = \" \" Then";
if ((_c).equals(" ")) { 
 //BA.debugLineNum = 332;BA.debugLine="If res.Extra.Size = 0 Then";
if (_res.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
 //BA.debugLineNum = 333;BA.debugLine="Dim key As String = tag.SubString2(0, i).ToLow";
_key = _tag.substring((int) (0),_i).toLowerCase();
 //BA.debugLineNum = 334;BA.debugLine="res.Tag = key";
_res.Tag /*String*/  = _key;
 };
 //BA.debugLineNum = 336;BA.debugLine="last = i";
_last = _i;
 };
 //BA.debugLineNum = 338;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
;
 //BA.debugLineNum = 340;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public String  _removeinvalidnodes(anywheresoftware.b4a.objects.collections.List _nodes) throws Exception{
int[] _paragraphindices = null;
int _i = 0;
japam.sie.worddocument._wordtextnode _n = null;
boolean _valid = false;
int _p = 0;
japam.sie.worddocument._wordtagnode _t = null;
 //BA.debugLineNum = 283;BA.debugLine="Private Sub RemoveInvalidNodes (Nodes As List)";
 //BA.debugLineNum = 284;BA.debugLine="Dim ParagraphIndices() As Int = Array As Int(1, 2";
_paragraphindices = new int[]{(int) (1),(int) (2),(int) (4)};
 //BA.debugLineNum = 285;BA.debugLine="For i = Nodes.Size - 1 To 0 Step -1";
{
final int step2 = -1;
final int limit2 = (int) (0);
_i = (int) (_nodes.getSize()-1) ;
for (;_i >= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 286;BA.debugLine="Dim n As WordTextNode = Nodes.Get(i)";
_n = (japam.sie.worddocument._wordtextnode)(_nodes.Get(_i));
 //BA.debugLineNum = 287;BA.debugLine="Dim valid As Boolean";
_valid = false;
 //BA.debugLineNum = 288;BA.debugLine="For Each p As Int In ParagraphIndices";
{
final int[] group5 = _paragraphindices;
final int groupLen5 = group5.length
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_p = group5[index5];
 //BA.debugLineNum = 289;BA.debugLine="If n.Tags.Size > p Then";
if (_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>_p) { 
 //BA.debugLineNum = 290;BA.debugLine="Dim t As WordTagNode = n.Tags.Get(p)";
_t = (japam.sie.worddocument._wordtagnode)(_n.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_p));
 //BA.debugLineNum = 291;BA.debugLine="If t.Tag = \"p\" Then";
if ((_t.Tag /*String*/ ).equals("p")) { 
 //BA.debugLineNum = 292;BA.debugLine="valid = True";
_valid = __c.True;
 //BA.debugLineNum = 293;BA.debugLine="Exit";
if (true) break;
 };
 };
 }
};
 //BA.debugLineNum = 297;BA.debugLine="If valid = False Then Nodes.RemoveAt(i)";
if (_valid==__c.False) { 
_nodes.RemoveAt(_i);};
 }
};
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _saveas(String _dir,String _filename,boolean _renameifneeded) throws Exception{
String _orig = "";
String _extension = "";
int _i = 0;
String _f = "";
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 162;BA.debugLine="Public Sub SaveAs (Dir As String, FileName As Stri";
 //BA.debugLineNum = 163;BA.debugLine="If RenameIfNeeded Then";
if (_renameifneeded) { 
 //BA.debugLineNum = 164;BA.debugLine="Dim orig As String = File.Combine(Dir, FileName)";
_orig = __c.File.Combine(_dir,_filename);
 //BA.debugLineNum = 165;BA.debugLine="Dim extension As String";
_extension = "";
 //BA.debugLineNum = 166;BA.debugLine="Dim i As Int = orig.LastIndexOf(\".\")";
_i = _orig.lastIndexOf(".");
 //BA.debugLineNum = 167;BA.debugLine="If i >-1 Then";
if (_i>-1) { 
 //BA.debugLineNum = 168;BA.debugLine="extension = orig.SubString(i)";
_extension = _orig.substring(_i);
 //BA.debugLineNum = 169;BA.debugLine="orig = orig.SubString2(0, i)";
_orig = _orig.substring((int) (0),_i);
 };
 //BA.debugLineNum = 171;BA.debugLine="For i = 0 To 10";
{
final int step9 = 1;
final int limit9 = (int) (10);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 172;BA.debugLine="Dim f As String";
_f = "";
 //BA.debugLineNum = 173;BA.debugLine="Try";
try { //BA.debugLineNum = 174;BA.debugLine="If i = 0 Then f = orig & extension Else f = or";
if (_i==0) { 
_f = _orig+_extension;}
else {
_f = _orig+" ("+BA.NumberToString(_i)+")"+_extension;};
 //BA.debugLineNum = 175;BA.debugLine="Dim out As OutputStream = File.OpenOutput(f, \"";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_f,"",__c.False);
 //BA.debugLineNum = 176;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
_xwpfdocument.RunMethod("write",new Object[]{(Object)(_out.getObject())});
 //BA.debugLineNum = 177;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 178;BA.debugLine="Return f";
if (true) return _f;
 } 
       catch (Exception e18) {
			ba.setLastException(e18); //BA.debugLineNum = 180;BA.debugLine="Log(\"Failed: \" & f)";
__c.LogImpl("943515922","Failed: "+_f,0);
 };
 }
};
 };
 //BA.debugLineNum = 184;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = __c.File.OpenOutput(_dir,_filename,__c.False);
 //BA.debugLineNum = 185;BA.debugLine="XWPFDocument.RunMethod(\"write\", Array(out))";
_xwpfdocument.RunMethod("write",new Object[]{(Object)(_out.getObject())});
 //BA.debugLineNum = 186;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 187;BA.debugLine="Return File.Combine(Dir, FileName)";
if (true) return __c.File.Combine(_dir,_filename);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public japam.sie.worddocument._wordtagnode  _stackpeek() throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Private Sub StackPeek As WordTagNode";
 //BA.debugLineNum = 352;BA.debugLine="Return Stack.Get(Stack.Size - 1)";
if (true) return (japam.sie.worddocument._wordtagnode)(_stack.Get((int) (_stack.getSize()-1)));
 //BA.debugLineNum = 353;BA.debugLine="End Sub";
return null;
}
public String  _stackpop() throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Private Sub StackPop";
 //BA.debugLineNum = 344;BA.debugLine="Stack.RemoveAt(Stack.Size - 1)";
_stack.RemoveAt((int) (_stack.getSize()-1));
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return "";
}
public String  _stackpush(japam.sie.worddocument._wordtagnode _tag) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Private Sub StackPush (Tag As WordTagNode)";
 //BA.debugLineNum = 348;BA.debugLine="Stack.Add(Tag)";
_stack.Add((Object)(_tag));
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return "";
}
public String  _texttoruns(anywheresoftware.b4j.object.JavaObject _paragraph,japam.sie.worddocument._wordtextnode _text) throws Exception{
anywheresoftware.b4j.object.JavaObject _run = null;
japam.sie.worddocument._wordtagnode _lasttag = null;
String _url = "";
int _i = 0;
japam.sie.worddocument._wordtagnode _tag = null;
String _underlinepattern = "";
String _dir = "";
String _filename = "";
int _width = 0;
int _height = 0;
byte[] _b = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
int _picturetype = 0;
String _f = "";
int _size = 0;
String _color = "";
String _hc = "";
 //BA.debugLineNum = 398;BA.debugLine="Private Sub TextToRuns (Paragraph As JavaObject, T";
 //BA.debugLineNum = 399;BA.debugLine="Dim Run As JavaObject";
_run = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 400;BA.debugLine="Dim LastTag As WordTagNode = Text.Tags.Get(Text.T";
_lasttag = (japam.sie.worddocument._wordtagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1)));
 //BA.debugLineNum = 401;BA.debugLine="If LastTag.Tag = \"url\" Then";
if ((_lasttag.Tag /*String*/ ).equals("url")) { 
 //BA.debugLineNum = 402;BA.debugLine="Dim url As String = LastTag.Extra.Get(\"url\")";
_url = BA.ObjectToString(_lasttag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("url")));
 //BA.debugLineNum = 403;BA.debugLine="If url.StartsWith(\"bookmark://\") Then";
if (_url.startsWith("bookmark://")) { 
 //BA.debugLineNum = 404;BA.debugLine="Run = jme.RunMethod(\"CreateHyperlinkRunToAnchor";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jme.RunMethod("CreateHyperlinkRunToAnchor",new Object[]{(Object)(_paragraph.getObject()),(Object)(_url.substring("bookmark://".length()))})));
 }else {
 //BA.debugLineNum = 406;BA.debugLine="Run = Paragraph.RunMethod(\"createHyperlinkRun\",";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraph.RunMethod("createHyperlinkRun",new Object[]{(Object)(_url)})));
 };
 }else {
 //BA.debugLineNum = 409;BA.debugLine="Run = Paragraph.RunMethod(\"createRun\", Null)";
_run = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_paragraph.RunMethod("createRun",(Object[])(__c.Null))));
 };
 //BA.debugLineNum = 411;BA.debugLine="Run.RunMethod(\"setText\", Array(Text.Text))";
_run.RunMethod("setText",new Object[]{(Object)(_text.Text /*String*/ )});
 //BA.debugLineNum = 412;BA.debugLine="For i = 2 To Text.Tags.Size - 1";
{
final int step14 = 1;
final int limit14 = (int) (_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (2) ;
for (;_i <= limit14 ;_i = _i + step14 ) {
 //BA.debugLineNum = 413;BA.debugLine="Dim tag As WordTagNode = Text.Tags.Get(i)";
_tag = (japam.sie.worddocument._wordtagnode)(_text.Tags /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i));
 //BA.debugLineNum = 414;BA.debugLine="Select tag.Tag";
switch (BA.switchObjectToInt(_tag.Tag /*String*/ ,"b","break","i","u","img","color","textsize","embossed","shadow","strike","font","highlight","bookmark")) {
case 0: {
 //BA.debugLineNum = 416;BA.debugLine="Run.RunMethod(\"setBold\", Array(True))";
_run.RunMethod("setBold",new Object[]{(Object)(__c.True)});
 break; }
case 1: {
 //BA.debugLineNum = 418;BA.debugLine="Run.RunMethod(\"addBreak\", Null)";
_run.RunMethod("addBreak",(Object[])(__c.Null));
 break; }
case 2: {
 //BA.debugLineNum = 420;BA.debugLine="Run.RunMethod(\"setItalic\", Array(True))";
_run.RunMethod("setItalic",new Object[]{(Object)(__c.True)});
 break; }
case 3: {
 //BA.debugLineNum = 422;BA.debugLine="Dim UnderlinePattern As String = \"SINGLE\"";
_underlinepattern = "SINGLE";
 //BA.debugLineNum = 423;BA.debugLine="If tag.Extra.IsInitialized Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .IsInitialized()) { 
 //BA.debugLineNum = 424;BA.debugLine="UnderlinePattern = tag.Extra.GetDefault(\"patt";
_underlinepattern = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)("pattern"),(Object)(_underlinepattern)));
 //BA.debugLineNum = 425;BA.debugLine="If tag.Extra.ContainsKey(\"color\") Then";
if (_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)("color"))) { 
 //BA.debugLineNum = 426;BA.debugLine="Run.RunMethod(\"setUnderlineColor\", Array(Par";
_run.RunMethod("setUnderlineColor",new Object[]{(Object)(_parsecolorstring(BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});
 };
 };
 //BA.debugLineNum = 429;BA.debugLine="Run.RunMethod(\"setUnderline\", Array(UnderlineP";
_run.RunMethod("setUnderline",new Object[]{(Object)(_underlinepattern.toUpperCase())});
 break; }
case 4: {
 //BA.debugLineNum = 431;BA.debugLine="Dim Dir As String = tag.Extra.Get(\"dir\")";
_dir = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("dir")));
 //BA.debugLineNum = 432;BA.debugLine="If Dir = \"assets\" Then Dir = File.DirAssets";
if ((_dir).equals("assets")) { 
_dir = __c.File.getDirAssets();};
 //BA.debugLineNum = 433;BA.debugLine="Dim FileName As String = tag.Extra.Get(\"filena";
_filename = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("filename")));
 //BA.debugLineNum = 434;BA.debugLine="Dim width As Int = tag.Extra.Get(\"width\") * 12";
_width = (int) ((double)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("width"))))*12700);
 //BA.debugLineNum = 435;BA.debugLine="Dim height As Int = tag.Extra.Get(\"height\") *";
_height = (int) ((double)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("height"))))*12700);
 //BA.debugLineNum = 436;BA.debugLine="Dim b() As Byte = File.ReadBytes(Dir, FileName";
_b = __c.File.ReadBytes(_dir,_filename);
 //BA.debugLineNum = 437;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
 //BA.debugLineNum = 438;BA.debugLine="in.InitializeFromBytesArray(b, 0, b.Length)";
_in.InitializeFromBytesArray(_b,(int) (0),_b.length);
 //BA.debugLineNum = 439;BA.debugLine="Dim PictureType As Int";
_picturetype = 0;
 //BA.debugLineNum = 440;BA.debugLine="Dim f As String = Dir & FileName";
_f = _dir+_filename;
 //BA.debugLineNum = 441;BA.debugLine="If f.ToLowerCase.EndsWith(\".png\") Then Picture";
if (_f.toLowerCase().endsWith(".png")) { 
_picturetype = (int) (6);}
else {
_picturetype = (int) (5);};
 //BA.debugLineNum = 442;BA.debugLine="Run.RunMethod(\"addPicture\", Array(in, PictureT";
_run.RunMethod("addPicture",new Object[]{(Object)(_in.getObject()),(Object)(_picturetype),(Object)(_filename),(Object)(_width),(Object)(_height)});
 break; }
case 5: {
 //BA.debugLineNum = 444;BA.debugLine="Run.RunMethod(\"setColor\", Array(ParseColorStri";
_run.RunMethod("setColor",new Object[]{(Object)(_parsecolorstring(BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("color")))))});
 break; }
case 6: {
 //BA.debugLineNum = 446;BA.debugLine="Dim size As Int = tag.Extra.Get(\"textsize\")";
_size = (int)(BA.ObjectToNumber(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("textsize"))));
 //BA.debugLineNum = 447;BA.debugLine="Run.RunMethod(\"setFontSize\", Array(size))";
_run.RunMethod("setFontSize",new Object[]{(Object)(_size)});
 break; }
case 7: {
 //BA.debugLineNum = 449;BA.debugLine="Run.RunMethod(\"setEmbossed\", Array(True))";
_run.RunMethod("setEmbossed",new Object[]{(Object)(__c.True)});
 break; }
case 8: {
 //BA.debugLineNum = 451;BA.debugLine="Run.RunMethod(\"setShadow\", Array(True))";
_run.RunMethod("setShadow",new Object[]{(Object)(__c.True)});
 break; }
case 9: {
 //BA.debugLineNum = 453;BA.debugLine="Run.RunMethod(\"setStrikeThrough\", Array(True))";
_run.RunMethod("setStrikeThrough",new Object[]{(Object)(__c.True)});
 break; }
case 10: {
 //BA.debugLineNum = 455;BA.debugLine="Run.RunMethod(\"setFontFamily\", Array(tag.Extra";
_run.RunMethod("setFontFamily",new Object[]{_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("font"))});
 break; }
case 11: {
 //BA.debugLineNum = 457;BA.debugLine="Dim color As String = tag.Extra.Get(\"highlight";
_color = BA.ObjectToString(_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("highlight")));
 //BA.debugLineNum = 458;BA.debugLine="Dim hc As String = HighlightColorsMap.GetDefau";
_hc = BA.ObjectToString(_highlightcolorsmap.GetDefault((Object)(_color.toLowerCase()),(Object)("")));
 //BA.debugLineNum = 459;BA.debugLine="If hc = \"\" Then Error(\"Invalid highlight color";
if ((_hc).equals("")) { 
_error("Invalid highlight color: "+_color);};
 //BA.debugLineNum = 460;BA.debugLine="Run.RunMethod(\"setTextHighlightColor\", Array(h";
_run.RunMethod("setTextHighlightColor",new Object[]{(Object)(_hc)});
 break; }
case 12: {
 //BA.debugLineNum = 462;BA.debugLine="jme.RunMethod(\"createBookmark\", Array(Paragrap";
_jme.RunMethod("createBookmark",new Object[]{(Object)(_paragraph.getObject()),_tag.Extra /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("bookmark"))});
 break; }
}
;
 }
};
 //BA.debugLineNum = 465;BA.debugLine="End Sub";
return "";
}
public Object  _to20thspoint(double _points,boolean _tostring) throws Exception{
int _i = 0;
String _s = "";
 //BA.debugLineNum = 148;BA.debugLine="Private Sub To20thsPoint(Points As Double, ToStrin";
 //BA.debugLineNum = 149;BA.debugLine="Dim i As Int = Round(Points * 20)";
_i = (int) (__c.Round(_points*20));
 //BA.debugLineNum = 150;BA.debugLine="If ToString Then";
if (_tostring) { 
 //BA.debugLineNum = 151;BA.debugLine="Dim s As String = i";
_s = BA.NumberToString(_i);
 //BA.debugLineNum = 152;BA.debugLine="Return s";
if (true) return (Object)(_s);
 }else {
 //BA.debugLineNum = 154;BA.debugLine="Return i";
if (true) return (Object)(_i);
 };
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public String  _toupper(String _s) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Private Sub ToUpper(s As String) As String";
 //BA.debugLineNum = 143;BA.debugLine="Return s.ToUpperCase";
if (true) return _s.toUpperCase();
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
int BookmarksId;
public void MergeCellsHorizontal (XWPFTableRow row, XWPFTableCell cell, int fromCol, int toCol) {
	CTTcPr tcPr = cell.getCTTc().getTcPr();
  	if (tcPr == null) 
		tcPr = cell.getCTTc().addNewTcPr();
  	if (tcPr.isSetGridSpan()) {
   		tcPr.getGridSpan().setVal(BigInteger.valueOf(toCol-fromCol+1));
  } else {
  	tcPr.addNewGridSpan().setVal(BigInteger.valueOf(toCol-fromCol+1));
  }
  for(int colIndex = toCol; colIndex > fromCol; colIndex--) {
   row.removeCell(colIndex);
  }
}

public void MergeCellsVertical(XWPFTableRow row, int col, int rowSpan) {
	XWPFTable table = row.getTable();
	int fromRow = table.getRows().indexOf(row);
	int toRow = fromRow + rowSpan - 1;
  for(int rowIndex = fromRow; rowIndex <= toRow; rowIndex++) {
   XWPFTableCell cell = table.getRow(rowIndex).getCell(col);
   CTVMerge vmerge = CTVMerge.Factory.newInstance();
   if(rowIndex == fromRow){
    // The first merged cell is set with RESTART merge value
    vmerge.setVal(STMerge.RESTART);
   } else {
    // Cells which join (merge) the first one, are set with CONTINUE
    vmerge.setVal(STMerge.CONTINUE);
    // and the content should be removed
    for (int i = cell.getParagraphs().size(); i > 0; i--) {
     cell.removeParagraph(0);
    }
    cell.addParagraph();
   }
   // Try getting the TcPr. Not simply setting an new one every time.
   CTTcPr tcPr = cell.getCTTc().getTcPr();
   if (tcPr == null) tcPr = cell.getCTTc().addNewTcPr();
   tcPr.setVMerge(vmerge);
  }
 }
 
 public void createBookmark(XWPFParagraph paragraph, String anchor) {
  CTBookmark bookmark = paragraph.getCTP().addNewBookmarkStart();
  bookmark.setName(anchor);
  bookmark.setId(BigInteger.valueOf(++BookmarksId));
  paragraph.getCTP().addNewBookmarkEnd().setId(BigInteger.valueOf(BookmarksId));
 }
 public XWPFHyperlinkRun CreateHyperlinkRunToAnchor(XWPFParagraph paragraph, String anchor) throws Exception {
  CTHyperlink cthyperLink=paragraph.getCTP().addNewHyperlink();
  cthyperLink.setAnchor(anchor);
  cthyperLink.addNewR();
  return new XWPFHyperlinkRun(
    cthyperLink,
    cthyperLink.getRArray(0),
    paragraph
   );
 }
 
}
