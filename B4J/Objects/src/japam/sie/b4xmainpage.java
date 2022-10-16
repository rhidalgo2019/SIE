package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xmainpage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_ingresar = null;
public japam.sie.b4xfloattextfield _txt_clave = null;
public japam.sie.b4xfloattextfield _txt_usuario = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public japam.sie.b4xmenu _menu = null;
public japam.sie.b4xoperacion _operacion = null;
public japam.sie.b4xcomercial _comercial = null;
public japam.sie.b4xfinanciera _financiera = null;
public japam.sie.b4xenergia _energia = null;
public japam.sie.b4xcontabilidad _contabilidad = null;
public japam.sie.b4xrh _rh = null;
public japam.sie.b4xindicadores _indicadores = null;
public japam.sie.b4xgrafica _grafica = null;
public japam.sie.b4xcalcular _calcular = null;
public int _x = 0;
public japam.sie.sd_sql _msql = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _b_ingresar_click() throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Private Sub B_Ingresar_Click";
 //BA.debugLineNum = 82;BA.debugLine="If Main.mUSUARIO.Length <> 0 Then";
if (_main._musuario /*String*/ .length()!=0) { 
 //BA.debugLineNum = 83;BA.debugLine="If Main.mCLAVE.Length <> 0 Then";
if (_main._mclave /*String*/ .length()!=0) { 
 //BA.debugLineNum = 84;BA.debugLine="Verificar_Ingreso";
_verificar_ingreso();
 }else {
 //BA.debugLineNum = 86;BA.debugLine="xui.MsgboxAsync(\"Favor de indicar la clave de a";
_xui.MsgboxAsync(ba,"Favor de indicar la clave de acceso","Alerta");
 };
 }else {
 //BA.debugLineNum = 89;BA.debugLine="xui.MsgboxAsync(\"Favor de indicar el nombre";
_xui.MsgboxAsync(ba,"Favor de indicar el nombre del usuario","Alerta");
 };
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 34;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 35;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 36;BA.debugLine="Menu.Initialize";
_menu._initialize /*Object*/ (ba);
 //BA.debugLineNum = 37;BA.debugLine="B4XPages.AddPage(\"Menu\", Menu)";
_b4xpages._addpage /*String*/ ("Menu",(Object)(_menu));
 //BA.debugLineNum = 38;BA.debugLine="Operacion.Initialize";
_operacion._initialize /*Object*/ (ba);
 //BA.debugLineNum = 39;BA.debugLine="B4XPages.AddPage(\"Operacion\", Operacion)";
_b4xpages._addpage /*String*/ ("Operacion",(Object)(_operacion));
 //BA.debugLineNum = 40;BA.debugLine="Comercial.Initialize";
_comercial._initialize /*Object*/ (ba);
 //BA.debugLineNum = 41;BA.debugLine="B4XPages.AddPage(\"Comercial\", Comercial)";
_b4xpages._addpage /*String*/ ("Comercial",(Object)(_comercial));
 //BA.debugLineNum = 42;BA.debugLine="Financiera.Initialize";
_financiera._initialize /*Object*/ (ba);
 //BA.debugLineNum = 43;BA.debugLine="B4XPages.AddPage(\"Financiera\", Financiera)";
_b4xpages._addpage /*String*/ ("Financiera",(Object)(_financiera));
 //BA.debugLineNum = 44;BA.debugLine="Energia.Initialize";
_energia._initialize /*Object*/ (ba);
 //BA.debugLineNum = 45;BA.debugLine="B4XPages.AddPage(\"Energia\", Energia)";
_b4xpages._addpage /*String*/ ("Energia",(Object)(_energia));
 //BA.debugLineNum = 46;BA.debugLine="Contabilidad.Initialize";
_contabilidad._initialize /*Object*/ (ba);
 //BA.debugLineNum = 47;BA.debugLine="B4XPages.AddPage(\"Contabilidad\", Contabilidad)";
_b4xpages._addpage /*String*/ ("Contabilidad",(Object)(_contabilidad));
 //BA.debugLineNum = 48;BA.debugLine="RH.Initialize";
_rh._initialize /*Object*/ (ba);
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.AddPage(\"RH\", RH)";
_b4xpages._addpage /*String*/ ("RH",(Object)(_rh));
 //BA.debugLineNum = 50;BA.debugLine="Indicadores.Initialize";
_indicadores._initialize /*Object*/ (ba);
 //BA.debugLineNum = 51;BA.debugLine="B4XPages.AddPage(\"Indicadores\", Indicadores)";
_b4xpages._addpage /*String*/ ("Indicadores",(Object)(_indicadores));
 //BA.debugLineNum = 52;BA.debugLine="Grafica.Initialize";
_grafica._initialize /*Object*/ (ba);
 //BA.debugLineNum = 53;BA.debugLine="B4XPages.AddPage(\"Grafica\", Grafica)";
_b4xpages._addpage /*String*/ ("Grafica",(Object)(_grafica));
 //BA.debugLineNum = 54;BA.debugLine="Calcular.Initialize";
_calcular._initialize /*Object*/ (ba);
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.AddPage(\"Calcular\", Calcular)";
_b4xpages._addpage /*String*/ ("Calcular",(Object)(_calcular));
 //BA.debugLineNum = 56;BA.debugLine="TXT_Usuario.RequestFocusAndShowKeyboard";
_txt_usuario._requestfocusandshowkeyboard /*String*/ ();
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private B_Ingresar As Button";
_b_ingresar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private TXT_Clave As B4XFloatTextField";
_txt_clave = new japam.sie.b4xfloattextfield();
 //BA.debugLineNum = 12;BA.debugLine="Private TXT_Usuario As B4XFloatTextField";
_txt_usuario = new japam.sie.b4xfloattextfield();
 //BA.debugLineNum = 13;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 14;BA.debugLine="Public Menu As B4XMenu";
_menu = new japam.sie.b4xmenu();
 //BA.debugLineNum = 15;BA.debugLine="Public Operacion As B4XOperacion";
_operacion = new japam.sie.b4xoperacion();
 //BA.debugLineNum = 16;BA.debugLine="Public Comercial As B4XComercial";
_comercial = new japam.sie.b4xcomercial();
 //BA.debugLineNum = 17;BA.debugLine="Public Financiera As B4XFinanciera";
_financiera = new japam.sie.b4xfinanciera();
 //BA.debugLineNum = 18;BA.debugLine="Public Energia As B4XEnergia";
_energia = new japam.sie.b4xenergia();
 //BA.debugLineNum = 19;BA.debugLine="Public Contabilidad As B4XContabilidad";
_contabilidad = new japam.sie.b4xcontabilidad();
 //BA.debugLineNum = 20;BA.debugLine="Public RH As B4XRH";
_rh = new japam.sie.b4xrh();
 //BA.debugLineNum = 21;BA.debugLine="Public Indicadores As B4XIndicadores";
_indicadores = new japam.sie.b4xindicadores();
 //BA.debugLineNum = 22;BA.debugLine="Public Grafica As B4XGrafica";
_grafica = new japam.sie.b4xgrafica();
 //BA.debugLineNum = 23;BA.debugLine="Public Calcular As B4XCalcular";
_calcular = new japam.sie.b4xcalcular();
 //BA.debugLineNum = 24;BA.debugLine="Public x As Int";
_x = 0;
 //BA.debugLineNum = 25;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.sie.sd_sql();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public String  _leer_usuarios() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
 //BA.debugLineNum = 104;BA.debugLine="Public Sub Leer_Usuarios()";
 //BA.debugLineNum = 105;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 107;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 108;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT usu_nombre FRO";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT usu_nombre FROM sie_usuarios");
 //BA.debugLineNum = 109;BA.debugLine="Main.mULT_USUARIO = -1";
_main._mult_usuario /*int*/  = (int) (-1);
 //BA.debugLineNum = 110;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 111;BA.debugLine="Main.mULT_USUARIO = Main.mULT_USUARIO + 1";
_main._mult_usuario /*int*/  = (int) (_main._mult_usuario /*int*/ +1);
 //BA.debugLineNum = 112;BA.debugLine="Main.mUSUARIOS(Main.mULT_USUARIO) = mRS.GetStri";
_main._musuarios /*String[]*/ [_main._mult_usuario /*int*/ ] = _mrs.GetString("usu_nombre");
 }
;
 //BA.debugLineNum = 114;BA.debugLine="Main.mULT_USUARIO = -1";
_main._mult_usuario /*int*/  = (int) (-1);
 //BA.debugLineNum = 115;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT usu_clave FROM";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT usu_clave FROM sie_usuarios");
 //BA.debugLineNum = 116;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 117;BA.debugLine="Main.mULT_USUARIO = Main.mULT_USUARIO + 1";
_main._mult_usuario /*int*/  = (int) (_main._mult_usuario /*int*/ +1);
 //BA.debugLineNum = 118;BA.debugLine="Main.mCLAVES(Main.mULT_USUARIO) = mRS.GetString";
_main._mclaves /*String[]*/ [_main._mult_usuario /*int*/ ] = _mrs.GetString("usu_clave");
 }
;
 //BA.debugLineNum = 120;BA.debugLine="Main.mULT_USUARIO = -1";
_main._mult_usuario /*int*/  = (int) (-1);
 //BA.debugLineNum = 121;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT usu_derecho FR";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT usu_derecho FROM sie_usuarios");
 //BA.debugLineNum = 122;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 123;BA.debugLine="Main.mULT_USUARIO = Main.mULT_USUARIO + 1";
_main._mult_usuario /*int*/  = (int) (_main._mult_usuario /*int*/ +1);
 //BA.debugLineNum = 124;BA.debugLine="Main.mDERECHOS(Main.mULT_USUARIO) = mRS.GetInt(";
_main._mderechos /*int[]*/ [_main._mult_usuario /*int*/ ] = _mrs.GetInt("usu_derecho");
 }
;
 //BA.debugLineNum = 126;BA.debugLine="mRS.Close";
_mrs.Close();
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _txt_clave_enterpressed() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub TXT_Clave_EnterPressed";
 //BA.debugLineNum = 77;BA.debugLine="Main.mCLAVE = TXT_Clave.Text";
_main._mclave /*String*/  = _txt_clave._gettext /*String*/ ();
 //BA.debugLineNum = 78;BA.debugLine="B_Ingresar_Click";
_b_ingresar_click();
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return "";
}
public String  _txt_clave_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Private Sub TXT_Clave_FocusChanged (HasFocus As Bo";
 //BA.debugLineNum = 66;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==__c.False) { 
 //BA.debugLineNum = 67;BA.debugLine="Main.mCLAVE = TXT_Clave.Text";
_main._mclave /*String*/  = _txt_clave._gettext /*String*/ ();
 };
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public String  _txt_usuario_enterpressed() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Private Sub TXT_Usuario_EnterPressed";
 //BA.debugLineNum = 72;BA.debugLine="Main.mUSUARIO = TXT_Usuario.Text";
_main._musuario /*String*/  = _txt_usuario._gettext /*String*/ ();
 //BA.debugLineNum = 73;BA.debugLine="B_Ingresar_Click";
_b_ingresar_click();
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _txt_usuario_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Private Sub TXT_Usuario_FocusChanged (HasFocus As";
 //BA.debugLineNum = 60;BA.debugLine="If HasFocus = False Then";
if (_hasfocus==__c.False) { 
 //BA.debugLineNum = 61;BA.debugLine="Main.mUSUARIO = TXT_Usuario.Text";
_main._musuario /*String*/  = _txt_usuario._gettext /*String*/ ();
 };
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return "";
}
public String  _verificar_ingreso() throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub Verificar_Ingreso()";
 //BA.debugLineNum = 94;BA.debugLine="Log(\"---------- SIE (\" & Main.SERVIDOR & \") -----";
__c.LogImpl("5720897","---------- SIE ("+_main._servidor /*String*/ +") ----------",0);
 //BA.debugLineNum = 95;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 96;BA.debugLine="Leer_Usuarios";
_leer_usuarios();
 //BA.debugLineNum = 97;BA.debugLine="Verificar_Usuario";
_verificar_usuario();
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _verificar_usuario() throws Exception{
boolean _mexiste = false;
 //BA.debugLineNum = 130;BA.debugLine="Sub Verificar_Usuario()";
 //BA.debugLineNum = 131;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 132;BA.debugLine="Dim mEXISTE As Boolean";
_mexiste = false;
 //BA.debugLineNum = 134;BA.debugLine="For x = 0 To Main.mULT_USUARIO";
{
final int step3 = 1;
final int limit3 = _main._mult_usuario /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit3 ;_x = _x + step3 ) {
 //BA.debugLineNum = 135;BA.debugLine="If Main.mUSUARIO = Main.mUSUARIOS(x) Then";
if ((_main._musuario /*String*/ ).equals(_main._musuarios /*String[]*/ [_x])) { 
 //BA.debugLineNum = 136;BA.debugLine="mEXISTE = True";
_mexiste = __c.True;
 //BA.debugLineNum = 137;BA.debugLine="If Main.mCLAVE = Main.mCLAVES(x) Then";
if ((_main._mclave /*String*/ ).equals(_main._mclaves /*String[]*/ [_x])) { 
 //BA.debugLineNum = 138;BA.debugLine="Main.mDERECHO = Main.mDERECHOS(x)";
_main._mderecho /*int*/  = _main._mderechos /*int[]*/ [_x];
 //BA.debugLineNum = 139;BA.debugLine="Log(Main.mUSUARIO & \" - \" & Main.mCLAVE & \" -";
__c.LogImpl("5851977",_main._musuario /*String*/ +" - "+_main._mclave /*String*/ +" - "+BA.NumberToString(_main._mderecho /*int*/ ),0);
 //BA.debugLineNum = 140;BA.debugLine="Select Case Main.mDERECHO";
switch (BA.switchObjectToInt(_main._mderecho /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (10),(int) (11),(int) (12),(int) (13),(int) (99))) {
case 0: {
 //BA.debugLineNum = 142;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Com";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Comercial");
 break; }
case 1: {
 //BA.debugLineNum = 144;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Ope";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Operacion");
 break; }
case 2: {
 //BA.debugLineNum = 146;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Ene";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Energia");
 break; }
case 3: {
 //BA.debugLineNum = 148;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Con";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Contabilidad");
 break; }
case 4: {
 //BA.debugLineNum = 150;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"RH\"";
_b4xpages._showpageandremovepreviouspages /*String*/ ("RH");
 break; }
case 5: {
 //BA.debugLineNum = 152;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Men";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 break; }
case 6: {
 //BA.debugLineNum = 154;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Men";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 break; }
case 7: {
 break; }
case 8: {
 break; }
case 9: {
 //BA.debugLineNum = 158;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Men";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 break; }
}
;
 //BA.debugLineNum = 160;BA.debugLine="Log(\"Usuario/Clave correctos\")";
__c.LogImpl("5851998","Usuario/Clave correctos",0);
 }else {
 //BA.debugLineNum = 162;BA.debugLine="xui.MsgboxAsync(\"La CLAVE es incorrecta\", \"Pre";
_xui.MsgboxAsync(ba,"La CLAVE es incorrecta","Precaución");
 };
 };
 }
};
 //BA.debugLineNum = 166;BA.debugLine="If mEXISTE = False Then";
if (_mexiste==__c.False) { 
 //BA.debugLineNum = 167;BA.debugLine="xui.MsgboxAsync(\"El USUARIO no existe\", \"Precauc";
_xui.MsgboxAsync(ba,"El USUARIO no existe","Precaución");
 };
 //BA.debugLineNum = 169;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
