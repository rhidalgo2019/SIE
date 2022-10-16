package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xmenu", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_comercial = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_financiera = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_operacion = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_mantenimiento = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_contabilidad = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_rh = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_indicadores = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_calcular = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_grafica = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_calcular = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_indicadores = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_grafica = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_operacion = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_comercial = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_financiera = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_mantenimiento = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_contabilidad = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_rh = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _b_calcular_click() throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Private Sub B_Calcular_Click";
 //BA.debugLineNum = 121;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Calcular";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Calcular");
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public String  _b_comercial_click() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Private Sub B_Comercial_Click";
 //BA.debugLineNum = 57;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Comercia";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Comercial");
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _b_contabilidad_click() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Private Sub B_Contabilidad_Click";
 //BA.debugLineNum = 89;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Contabil";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Contabilidad");
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _b_financiera_click() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Private Sub B_Financiera_Click";
 //BA.debugLineNum = 65;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Financie";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Financiera");
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _b_grafica_click() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Private Sub B_Grafica_Click";
 //BA.debugLineNum = 129;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Grafica\"";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Grafica");
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _b_indicadores_click() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Private Sub B_indicadores_Click";
 //BA.debugLineNum = 113;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Indicado";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Indicadores");
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _b_mantenimiento_click() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Private Sub B_Mantenimiento_Click";
 //BA.debugLineNum = 81;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Energia\"";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Energia");
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public String  _b_operacion_click() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Private Sub B_Operacion_Click";
 //BA.debugLineNum = 73;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Operacio";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Operacion");
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _b_rh_click() throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Private Sub B_RH_Click";
 //BA.debugLineNum = 97;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"RH\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("RH");
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _b_usuario_click() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Private Sub B_Usuario_Click";
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 32;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 33;BA.debugLine="Root.LoadLayout(\"Menu\")";
_root.LoadLayout("Menu",ba);
 //BA.debugLineNum = 34;BA.debugLine="Root.Height = Main.mPANTALLA_ALTO";
_root.setHeight(_main._mpantalla_alto /*double*/ );
 //BA.debugLineNum = 35;BA.debugLine="Root.Width = Main.mPANTALLA_ANCHO";
_root.setWidth(_main._mpantalla_ancho /*double*/ );
 //BA.debugLineNum = 36;BA.debugLine="If Main.mDERECHO = 10 Or Main.mDERECHO = 11 Then";
if (_main._mderecho /*int*/ ==10 || _main._mderecho /*int*/ ==11) { 
 //BA.debugLineNum = 37;BA.debugLine="B_Calcular.Visible = False";
_b_calcular.setVisible(__c.False);
 //BA.debugLineNum = 38;BA.debugLine="L_Calcular.Visible = False";
_l_calcular.setVisible(__c.False);
 //BA.debugLineNum = 39;BA.debugLine="B_Operacion.Visible = False";
_b_operacion.setVisible(__c.False);
 //BA.debugLineNum = 40;BA.debugLine="L_Operacion.Visible = False";
_l_operacion.setVisible(__c.False);
 //BA.debugLineNum = 41;BA.debugLine="B_Comercial.Visible = False";
_b_comercial.setVisible(__c.False);
 //BA.debugLineNum = 42;BA.debugLine="L_Comercial.visible = False";
_l_comercial.setVisible(__c.False);
 //BA.debugLineNum = 43;BA.debugLine="B_Financiera.Visible = False";
_b_financiera.setVisible(__c.False);
 //BA.debugLineNum = 44;BA.debugLine="L_Financiera.visible = False";
_l_financiera.setVisible(__c.False);
 //BA.debugLineNum = 45;BA.debugLine="B_Mantenimiento.Visible = False";
_b_mantenimiento.setVisible(__c.False);
 //BA.debugLineNum = 46;BA.debugLine="L_Mantenimiento.Visible = False";
_l_mantenimiento.setVisible(__c.False);
 //BA.debugLineNum = 47;BA.debugLine="B_Contabilidad.Visible = False";
_b_contabilidad.setVisible(__c.False);
 //BA.debugLineNum = 48;BA.debugLine="L_Contabilidad.Visible = False";
_l_contabilidad.setVisible(__c.False);
 //BA.debugLineNum = 49;BA.debugLine="B_RH.Visible = False";
_b_rh.setVisible(__c.False);
 //BA.debugLineNum = 50;BA.debugLine="L_RH.Visible = False";
_l_rh.setVisible(__c.False);
 };
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private B_Comercial As Button";
_b_comercial = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private B_Financiera As Button";
_b_financiera = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private B_Operacion As Button";
_b_operacion = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private B_Mantenimiento As Button";
_b_mantenimiento = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private B_Contabilidad As Button";
_b_contabilidad = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private B_RH As Button";
_b_rh = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private B_indicadores As Button";
_b_indicadores = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private B_Calcular As Button";
_b_calcular = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private B_Grafica As Button";
_b_grafica = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private L_Calcular As Label";
_l_calcular = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private L_Indicadores As Label";
_l_indicadores = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private L_Grafica As Label";
_l_grafica = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private L_Operacion As Label";
_l_operacion = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private L_Comercial As Label";
_l_comercial = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private L_Financiera As Label";
_l_financiera = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private L_Mantenimiento As Label";
_l_mantenimiento = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private L_Contabilidad As Label";
_l_contabilidad = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private L_RH As Label";
_l_rh = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _l_calcular_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Private Sub L_Calcular_MouseClicked (EventData As";
 //BA.debugLineNum = 125;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Calcular";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Calcular");
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return "";
}
public String  _l_comercial_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Private Sub L_Comercial_MouseClicked (EventData As";
 //BA.debugLineNum = 61;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Comercia";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Comercial");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public String  _l_contabilidad_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Private Sub L_Contabilidad_MouseClicked (EventData";
 //BA.debugLineNum = 93;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Contabil";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Contabilidad");
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return "";
}
public String  _l_financiera_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Private Sub L_Financiera_MouseClicked (EventData A";
 //BA.debugLineNum = 69;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Financie";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Financiera");
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _l_grafica_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 132;BA.debugLine="Private Sub L_Grafica_MouseClicked (EventData As M";
 //BA.debugLineNum = 133;BA.debugLine="Log(\"Entrar a grafica\")";
__c.LogImpl("53407873","Entrar a grafica",0);
 //BA.debugLineNum = 134;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Grafica\"";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Grafica");
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _l_indicadores_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Private Sub L_Indicadores_MouseClicked (EventData";
 //BA.debugLineNum = 117;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Indicado";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Indicadores");
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _l_mantenimiento_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 84;BA.debugLine="Private Sub L_Mantenimiento_MouseClicked (EventDat";
 //BA.debugLineNum = 85;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Energia\"";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Energia");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _l_operacion_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub L_Operacion_MouseClicked (EventData As";
 //BA.debugLineNum = 77;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Operacio";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Operacion");
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _l_rh_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Private Sub L_RH_MouseClicked (EventData As MouseE";
 //BA.debugLineNum = 101;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"RH\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("RH");
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _l_usuarios_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Private Sub L_Usuarios_MouseClicked (EventData As";
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
