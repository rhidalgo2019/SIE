package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_comercial = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_operacion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_mantenimiento = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_contabilidad = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_rh = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_indicadores = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_calcular = null;
public b4a.example.dateutils _dateutils = null;
public japam.SIE.main _main = null;
public japam.SIE.starter _starter = null;
public japam.SIE.b4xpages _b4xpages = null;
public japam.SIE.b4xcollections _b4xcollections = null;
public japam.SIE.xuiviewsutils _xuiviewsutils = null;
public String  _b_calcular_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_calcular_click", false))
	 {return ((String) Debug.delegate(ba, "b_calcular_click", null));}
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Private Sub B_Calcular_Click";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Calcular";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Calcular");
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="End Sub";
return "";
}
public String  _b_comercial_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_comercial_click", false))
	 {return ((String) Debug.delegate(ba, "b_comercial_click", null));}
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Private Sub B_Comercial_Click";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Comercia";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Comercial");
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="End Sub";
return "";
}
public String  _b_contabilidad_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_contabilidad_click", false))
	 {return ((String) Debug.delegate(ba, "b_contabilidad_click", null));}
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Private Sub B_Contabilidad_Click";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Contabil";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Contabilidad");
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="End Sub";
return "";
}
public String  _b_indicadores_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_indicadores_click", false))
	 {return ((String) Debug.delegate(ba, "b_indicadores_click", null));}
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Private Sub B_indicadores_Click";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Indicado";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Indicadores");
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="End Sub";
return "";
}
public String  _b_mantenimiento_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_mantenimiento_click", false))
	 {return ((String) Debug.delegate(ba, "b_mantenimiento_click", null));}
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Private Sub B_Mantenimiento_Click";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Energia\"";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Energia");
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="End Sub";
return "";
}
public String  _b_operacion_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_operacion_click", false))
	 {return ((String) Debug.delegate(ba, "b_operacion_click", null));}
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Private Sub B_Operacion_Click";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Operacio";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Operacion");
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="End Sub";
return "";
}
public String  _b_rh_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_rh_click", false))
	 {return ((String) Debug.delegate(ba, "b_rh_click", null));}
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Private Sub B_RH_Click";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"RH\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"RH");
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="End Sub";
return "";
}
public String  _b_usuario_click(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b_usuario_click", false))
	 {return ((String) Debug.delegate(ba, "b_usuario_click", null));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Private Sub B_Usuario_Click";
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xmenu __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="Root.LoadLayout(\"Menu\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Menu",ba);
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=39256068;
 //BA.debugLineNum = 39256068;BA.debugLine="Private B_Comercial As Button";
_b_comercial = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256069;
 //BA.debugLineNum = 39256069;BA.debugLine="Private B_Operacion As Button";
_b_operacion = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256070;
 //BA.debugLineNum = 39256070;BA.debugLine="Private B_Mantenimiento As Button";
_b_mantenimiento = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256071;
 //BA.debugLineNum = 39256071;BA.debugLine="Private B_Contabilidad As Button";
_b_contabilidad = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256072;
 //BA.debugLineNum = 39256072;BA.debugLine="Private B_RH As Button";
_b_rh = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256073;
 //BA.debugLineNum = 39256073;BA.debugLine="Private B_indicadores As Button";
_b_indicadores = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256074;
 //BA.debugLineNum = 39256074;BA.debugLine="Private B_Calcular As Button";
_b_calcular = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=39256075;
 //BA.debugLineNum = 39256075;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xmenu __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="End Sub";
return null;
}
public String  _l_calcular_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_calcular_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_calcular_mouseclick", null));}
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Private Sub L_Calcular_MouseClick";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Calcular";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Calcular");
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="End Sub";
return "";
}
public String  _l_comercial_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_comercial_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_comercial_mouseclick", null));}
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Private Sub L_Comercial_MouseClick";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Comercia";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Comercial");
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="End Sub";
return "";
}
public String  _l_contabilidad_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_contabilidad_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_contabilidad_mouseclick", null));}
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Private Sub L_Contabilidad_MouseClick";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Contabil";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Contabilidad");
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="End Sub";
return "";
}
public String  _l_indicadores_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_indicadores_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_indicadores_mouseclick", null));}
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Private Sub L_Indicadores_MouseClick";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Indicado";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Indicadores");
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="End Sub";
return "";
}
public String  _l_mantenimiento_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_mantenimiento_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_mantenimiento_mouseclick", null));}
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Private Sub L_Mantenimiento_MouseClick";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Energia\"";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Energia");
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="End Sub";
return "";
}
public String  _l_operacion_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_operacion_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_operacion_mouseclick", null));}
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Private Sub L_Operacion_MouseClick";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Operacio";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Operacion");
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="End Sub";
return "";
}
public String  _l_rh_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_rh_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_rh_mouseclick", null));}
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Private Sub L_RH_MouseClick";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"RH\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"RH");
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="End Sub";
return "";
}
public String  _l_usuarios_mouseclick(japam.SIE.b4xmenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmenu";
if (Debug.shouldDelegate(ba, "l_usuarios_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "l_usuarios_mouseclick", null));}
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Private Sub L_Usuarios_MouseClick";
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="End Sub";
return "";
}
}