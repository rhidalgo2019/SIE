package japam.sie;


import anywheresoftware.b4a.BA;

public class xuiviewsutils extends Object{
public static xuiviewsutils mostCurrent = new xuiviewsutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.xuiviewsutils", null);
		ba.loadHtSubs(xuiviewsutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "japam.sie.xuiviewsutils", ba);
		}
	}
    public static Class<?> getObject() {
		return xuiviewsutils.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _utilsinitialized = false;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static japam.sie.main _main = null;
public static japam.sie.b4xpages _b4xpages = null;
public static japam.sie.b4xcollections _b4xcollections = null;
public static String  _addstubtoclvifneeded(b4j.example.customlistview _customlistview1,int _color) throws Exception{
b4j.example.customlistview._clvitem _lastitem = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _height = 0;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub AddStubToCLVIfNeeded(CustomListView1 As";
 //BA.debugLineNum = 35;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if (_customlistview1._getsize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 36;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = _customlistview1._getrawlistitem((int) (_customlistview1._getsize()-1));
 //BA.debugLineNum = 37;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem.Offset+_lastitem.Panel.getHeight()<_customlistview1._asview().getHeight()) { 
 //BA.debugLineNum = 39;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"stub");
 //BA.debugLineNum = 40;BA.debugLine="p.Color = Color";
_p.setColor(_color);
 //BA.debugLineNum = 41;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) (_customlistview1._asview().getHeight()-_lastitem.Offset-_lastitem.Panel.getHeight()-anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
 //BA.debugLineNum = 42;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if (_xui.getIsB4J()) { 
_height = (int) (_height+5);};
 //BA.debugLineNum = 43;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
_p.SetLayoutAnimated((int) (0),0,0,_customlistview1._asview().getWidth(),_height);
 //BA.debugLineNum = 44;BA.debugLine="CustomListView1.Add(p, \"\")";
_customlistview1._add(_p,(Object)(""));
 //BA.debugLineNum = 45;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
_customlistview1._sv.setScrollViewContentHeight(_customlistview1._sv.getScrollViewContentHeight()-_customlistview1._getdividersize());
 };
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return "";
}
public static japam.sie.b4ximageview  _createb4ximageview() throws Exception{
japam.sie.b4ximageview _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
 //BA.debugLineNum = 85;BA.debugLine="Public Sub CreateB4XImageView As B4XImageView";
 //BA.debugLineNum = 86;BA.debugLine="Dim iv As B4XImageView";
_iv = new japam.sie.b4ximageview();
 //BA.debugLineNum = 87;BA.debugLine="iv.Initialize(Null, \"\")";
_iv._initialize /*String*/ (ba,anywheresoftware.b4a.keywords.Common.Null,"");
 //BA.debugLineNum = 88;BA.debugLine="Dim base As B4XView = xui.CreatePanel(\"\")";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
_base = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 89;BA.debugLine="base.SetLayoutAnimated(0, 0, 0, 100dip, 100dip)";
_base.SetLayoutAnimated((int) (0),0,0,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)));
 //BA.debugLineNum = 90;BA.debugLine="iv.DesignerCreateView(base, Null, CreateMap(\"Roun";
_iv._designercreateview /*String*/ ((Object)(_base.getObject()),(anywheresoftware.b4j.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.LabelWrapper(), (javafx.scene.control.Label)(anywheresoftware.b4a.keywords.Common.Null)),anywheresoftware.b4a.keywords.Common.createMap(new Object[] {(Object)("Round"),(Object)(anywheresoftware.b4a.keywords.Common.False),(Object)("ResizeMode"),(Object)("FIT"),(Object)("BackgroundColor"),(Object)(((int)0xffaaaaaa)),(Object)("CornersRadius"),(Object)(0)}));
 //BA.debugLineNum = 91;BA.debugLine="Return iv";
if (true) return _iv;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel() throws Exception{
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 78;BA.debugLine="Public Sub CreateLabel As B4XView";
 //BA.debugLineNum = 79;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 80;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 81;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public static String  _initialize() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Private Sub Initialize";
 //BA.debugLineNum = 11;BA.debugLine="If UtilsInitialized Then Return";
if (_utilsinitialized) { 
if (true) return "";};
 //BA.debugLineNum = 12;BA.debugLine="UtilsInitialized = True";
_utilsinitialized = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public static String  _performhapticfeedback(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub PerformHapticFeedback (View As B4XView)";
 //BA.debugLineNum = 22;BA.debugLine="Initialize";
_initialize();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private UtilsInitialized As Boolean";
_utilsinitialized = false;
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _setalpha(anywheresoftware.b4a.objects.B4XViewWrapper _view,float _level) throws Exception{
anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper _n = null;
 //BA.debugLineNum = 95;BA.debugLine="Public Sub SetAlpha (View As B4XView, Level As Flo";
 //BA.debugLineNum = 101;BA.debugLine="Dim n As Node = View";
_n = new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper();
_n = (anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_view.getObject()));
 //BA.debugLineNum = 102;BA.debugLine="n.Alpha = Level";
_n.setAlpha(_level);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public static String  _setbitmapandfill(anywheresoftware.b4a.objects.B4XViewWrapper _imageview,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
anywheresoftware.b4j.objects.ImageViewWrapper _iiv = null;
 //BA.debugLineNum = 65;BA.debugLine="Public Sub SetBitmapAndFill (ImageView As B4XView,";
 //BA.debugLineNum = 66;BA.debugLine="ImageView.SetBitmap(Bmp)";
_imageview.SetBitmap((javafx.scene.image.Image)(_bmp.getObject()));
 //BA.debugLineNum = 67;BA.debugLine="Dim iiv As ImageView = ImageView";
_iiv = new anywheresoftware.b4j.objects.ImageViewWrapper();
_iiv = (anywheresoftware.b4j.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.ImageViewWrapper(), (javafx.scene.image.ImageView)(_imageview.getObject()));
 //BA.debugLineNum = 71;BA.debugLine="iiv.PreserveRatio = False";
_iiv.setPreserveRatio(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public static String  _settextorcsbuildertolabel(anywheresoftware.b4a.objects.B4XViewWrapper _xlbl,Object _text) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub SetTextOrCSBuilderToLabel(xlbl As B4XVi";
 //BA.debugLineNum = 52;BA.debugLine="xlbl.Text = Text";
_xlbl.setText(BA.ObjectToString(_text));
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
}
