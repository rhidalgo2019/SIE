package japam.sie;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "japam.sie.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 800, 600);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static String _servidor = "";
public static String _base_datos = "";
public static String _administrador = "";
public static String _password = "";
public static anywheresoftware.b4j.objects.SQL _msql = null;
public static anywheresoftware.b4j.objects.SQL _msql2 = null;
public static anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
public static anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs2 = null;
public static japam.sie.sd_sql _mssql = null;
public static String[] _musuarios = null;
public static String[] _mclaves = null;
public static int[] _mderechos = null;
public static int _x = 0;
public static int _mult_usuario = 0;
public static String _musuario = "";
public static String _mclave = "";
public static int _mderecho = 0;
public static int _manio = 0;
public static int _mmes = 0;
public static int _mult_extraido = 0;
public static int _mult_datos = 0;
public static int _mult_indicador = 0;
public static boolean _mconexion = false;
public static double _mpantalla_ancho = 0;
public static double _mpantalla_alto = 0;
public static b4j.example.dateutils _dateutils = null;
public static b4j.example.cssutils _cssutils = null;
public static japam.sie.b4xpages _b4xpages = null;
public static japam.sie.b4xcollections _b4xcollections = null;
public static japam.sie.xuiviewsutils _xuiviewsutils = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
japam.sie.b4xpagesmanager _pagesmanager = null;
 //BA.debugLineNum = 69;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 70;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 71;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 72;BA.debugLine="Dim PagesManager As B4XPagesManager";
_pagesmanager = new japam.sie.b4xpagesmanager();
 //BA.debugLineNum = 73;BA.debugLine="PagesManager.Initialize(MainForm)";
_pagesmanager._initialize /*String*/ (ba,_mainform);
 //BA.debugLineNum = 74;BA.debugLine="MainForm.Resizable = True";
_mainform.setResizable(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 75;BA.debugLine="Log(\"Ancho = \" & MainForm.RootPane.Width & \", Alt";
anywheresoftware.b4a.keywords.Common.LogImpl("565542","Ancho = "+BA.NumberToString(_mainform.getRootPane().getWidth())+", Alto = "+BA.NumberToString(_mainform.getRootPane().getHeight()),0);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public static String  _conectar_servidor() throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub Conectar_Servidor()";
 //BA.debugLineNum = 162;BA.debugLine="Log(\"Driver: com.mysql.jdbc.Driver\" & \"jdbc:mysql";
anywheresoftware.b4a.keywords.Common.LogImpl("555508993","Driver: com.mysql.jdbc.Driver"+"jdbc:mysql://${SERVIDOR}/${BASE_DATOS}?useSSL=false",0);
 //BA.debugLineNum = 163;BA.debugLine="Log(\"Base de datos: \" & BASE_DATOS)";
anywheresoftware.b4a.keywords.Common.LogImpl("555508994","Base de datos: "+_base_datos,0);
 //BA.debugLineNum = 164;BA.debugLine="Log(\"Administrador: \" & ADMINISTRADOR)";
anywheresoftware.b4a.keywords.Common.LogImpl("555508995","Administrador: "+_administrador,0);
 //BA.debugLineNum = 165;BA.debugLine="Log(\"Password: \" & PASSWORD)";
anywheresoftware.b4a.keywords.Common.LogImpl("555508996","Password: "+_password,0);
 //BA.debugLineNum = 166;BA.debugLine="mSQL.Initialize2(\"com.mysql.jdbc.Driver\", $\"jdbc:";
_msql.Initialize2("com.mysql.jdbc.Driver",("jdbc:mysql://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_servidor))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_base_datos))+"?useSSL=false"),_administrador,_password);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return "";
}
public static String  _conectar_servidor_2() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Public Sub Conectar_Servidor_2()";
 //BA.debugLineNum = 170;BA.debugLine="mSQL2.Initialize2(\"com.mysql.jdbc.Driver\", $\"jdbc";
_msql2.Initialize2("com.mysql.jdbc.Driver",("jdbc:mysql://"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_servidor))+"/"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_base_datos))+"?useSSL=false"),_administrador,_password);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public static String  _leer_usuarios() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Public Sub Leer_Usuarios()";
 //BA.debugLineNum = 174;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 176;BA.debugLine="If mSQL.IsInitialized Then";
if (_msql.IsInitialized()) { 
 //BA.debugLineNum = 177;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT usu_nombre FROM sie";
_mrs = _msql.ExecQuery("SELECT usu_nombre FROM sie_usuarios");
 //BA.debugLineNum = 178;BA.debugLine="mULT_USUARIO = -1";
_mult_usuario = (int) (-1);
 //BA.debugLineNum = 179;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 180;BA.debugLine="mULT_USUARIO = mULT_USUARIO + 1";
_mult_usuario = (int) (_mult_usuario+1);
 //BA.debugLineNum = 181;BA.debugLine="mUSUARIOS(mULT_USUARIO) = mRS.GetString(\"usu_no";
_musuarios[_mult_usuario] = _mrs.GetString("usu_nombre");
 }
;
 //BA.debugLineNum = 183;BA.debugLine="mULT_USUARIO = -1";
_mult_usuario = (int) (-1);
 //BA.debugLineNum = 184;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT usu_clave FROM sie_";
_mrs = _msql.ExecQuery("SELECT usu_clave FROM sie_usuarios");
 //BA.debugLineNum = 185;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 186;BA.debugLine="mULT_USUARIO = mULT_USUARIO + 1";
_mult_usuario = (int) (_mult_usuario+1);
 //BA.debugLineNum = 187;BA.debugLine="mCLAVES(mULT_USUARIO) = mRS.GetString(\"usu_clav";
_mclaves[_mult_usuario] = _mrs.GetString("usu_clave");
 }
;
 //BA.debugLineNum = 189;BA.debugLine="mULT_USUARIO = -1";
_mult_usuario = (int) (-1);
 //BA.debugLineNum = 190;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT usu_derecho FROM si";
_mrs = _msql.ExecQuery("SELECT usu_derecho FROM sie_usuarios");
 //BA.debugLineNum = 191;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 192;BA.debugLine="mULT_USUARIO = mULT_USUARIO + 1";
_mult_usuario = (int) (_mult_usuario+1);
 //BA.debugLineNum = 193;BA.debugLine="mDERECHOS(mULT_USUARIO) = mRS.GetInt(\"usu_derec";
_mderechos[_mult_usuario] = _mrs.GetInt("usu_derecho");
 }
;
 //BA.debugLineNum = 195;BA.debugLine="mRS.Close";
_mrs.Close();
 }else {
 //BA.debugLineNum = 197;BA.debugLine="Log(\"No conectado\")";
anywheresoftware.b4a.keywords.Common.LogImpl("555640088","No conectado",0);
 };
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closed() throws Exception{
 //BA.debugLineNum = 213;BA.debugLine="Sub MainForm_Closed";
 //BA.debugLineNum = 214;BA.debugLine="B4XPages.Delegate.MainForm_Closed";
_b4xpages._delegate /*japam.sie.b4xpagesdelegator*/ ._mainform_closed /*String*/ ();
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub MainForm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 218;BA.debugLine="B4XPages.Delegate.MainForm_CloseRequest(EventData";
_b4xpages._delegate /*japam.sie.b4xpagesdelegator*/ ._mainform_closerequest /*String*/ (_eventdata);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_focuschanged(boolean _hasfocus) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub MainForm_FocusChanged (HasFocus As Boolean)";
 //BA.debugLineNum = 204;BA.debugLine="B4XPages.Delegate.MainForm_FocusChanged(HasFocus)";
_b4xpages._delegate /*japam.sie.b4xpagesdelegator*/ ._mainform_focuschanged /*String*/ (_hasfocus);
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_iconifiedchanged(boolean _iconified) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
 //BA.debugLineNum = 222;BA.debugLine="B4XPages.Delegate.MainForm_IconifiedChanged(Iconi";
_b4xpages._delegate /*japam.sie.b4xpagesdelegator*/ ._mainform_iconifiedchanged /*String*/ (_iconified);
 //BA.debugLineNum = 223;BA.debugLine="End Sub";
return "";
}
public static String  _mainform_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 207;BA.debugLine="Sub MainForm_Resize (Width As Double, Height As Do";
 //BA.debugLineNum = 208;BA.debugLine="B4XPages.Delegate.MainForm_Resize(Width, Height)";
_b4xpages._delegate /*japam.sie.b4xpagesdelegator*/ ._mainform_resize /*String*/ (_width,_height);
 //BA.debugLineNum = 209;BA.debugLine="mPANTALLA_ANCHO = Width";
_mpantalla_ancho = _width;
 //BA.debugLineNum = 210;BA.debugLine="mPANTALLA_ALTO = Height";
_mpantalla_alto = _height;
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public static Object  _mformato(String _valor,String _formato) throws Exception{
String _mret = "";
String _mvalor = "";
String _menteros = "";
String _mdecimales = "";
int _mlargo = 0;
int _mpos_decimal = 0;
String _mmoneda = "";
String _mporcentaje = "";
int _mini_decimal = 0;
int _mfin_decimal = 0;
 //BA.debugLineNum = 79;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
 //BA.debugLineNum = 86;BA.debugLine="Dim mRET As String";
_mret = "";
 //BA.debugLineNum = 87;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
 //BA.debugLineNum = 88;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
 //BA.debugLineNum = 89;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
 //BA.debugLineNum = 90;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
 //BA.debugLineNum = 91;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
 //BA.debugLineNum = 93;BA.debugLine="mRET = \"\"";
_mret = "";
 //BA.debugLineNum = 94;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
 //BA.debugLineNum = 95;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
 //BA.debugLineNum = 96;BA.debugLine="mRET = Valor";
_mret = _valor;
 //BA.debugLineNum = 97;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
 //BA.debugLineNum = 98;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
 //BA.debugLineNum = 99;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
 //BA.debugLineNum = 100;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
 //BA.debugLineNum = 101;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
 //BA.debugLineNum = 102;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
 //BA.debugLineNum = 103;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
 //BA.debugLineNum = 104;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
 //BA.debugLineNum = 106;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
 //BA.debugLineNum = 108;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
 //BA.debugLineNum = 109;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
 //BA.debugLineNum = 111;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
 //BA.debugLineNum = 113;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
 //BA.debugLineNum = 114;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
 //BA.debugLineNum = 115;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
 //BA.debugLineNum = 116;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
 //BA.debugLineNum = 118;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
 //BA.debugLineNum = 119;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
 //BA.debugLineNum = 120;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
 //BA.debugLineNum = 122;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
 //BA.debugLineNum = 123;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
 //BA.debugLineNum = 124;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
 //BA.debugLineNum = 125;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
 //BA.debugLineNum = 127;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
 //BA.debugLineNum = 128;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
 //BA.debugLineNum = 129;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
 //BA.debugLineNum = 131;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
 //BA.debugLineNum = 133;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
 //BA.debugLineNum = 134;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
 //BA.debugLineNum = 136;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
 //BA.debugLineNum = 137;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
 //BA.debugLineNum = 138;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 //BA.debugLineNum = 140;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
 //BA.debugLineNum = 141;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 //BA.debugLineNum = 143;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
 //BA.debugLineNum = 144;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
 //BA.debugLineNum = 148;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
 //BA.debugLineNum = 149;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
 //BA.debugLineNum = 150;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
 //BA.debugLineNum = 151;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
 //BA.debugLineNum = 152;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
 //BA.debugLineNum = 153;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
 //BA.debugLineNum = 154;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
 //BA.debugLineNum = 155;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
 //BA.debugLineNum = 157;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
 //BA.debugLineNum = 158;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4j.example.dateutils._process_globals();
b4j.example.cssutils._process_globals();
main._process_globals();
b4xpages._process_globals();
b4xcollections._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 26;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 27;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 28;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 32;BA.debugLine="Public SERVIDOR As String = \"sql430.main-hosting.";
_servidor = "sql430.main-hosting.eu";
 //BA.debugLineNum = 34;BA.debugLine="Public BASE_DATOS As String = \"u567762233_SIE\"";
_base_datos = "u567762233_SIE";
 //BA.debugLineNum = 35;BA.debugLine="Public ADMINISTRADOR As String = \"u567762233_admi";
_administrador = "u567762233_admin";
 //BA.debugLineNum = 36;BA.debugLine="Public PASSWORD As String = \"Admin2022\"";
_password = "Admin2022";
 //BA.debugLineNum = 37;BA.debugLine="Public mSQL, mSQL2 As SQL";
_msql = new anywheresoftware.b4j.objects.SQL();
_msql2 = new anywheresoftware.b4j.objects.SQL();
 //BA.debugLineNum = 38;BA.debugLine="Public mRS, mRS2 As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
_mrs2 = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Public MSSQL As SD_SQL";
_mssql = new japam.sie.sd_sql();
 //BA.debugLineNum = 51;BA.debugLine="Public mUSUARIOS(50) As String";
_musuarios = new String[(int) (50)];
java.util.Arrays.fill(_musuarios,"");
 //BA.debugLineNum = 52;BA.debugLine="Public mCLAVES(50) As String";
_mclaves = new String[(int) (50)];
java.util.Arrays.fill(_mclaves,"");
 //BA.debugLineNum = 53;BA.debugLine="Public mDERECHOS(50) As Int";
_mderechos = new int[(int) (50)];
;
 //BA.debugLineNum = 54;BA.debugLine="Public x, mULT_USUARIO As Int";
_x = 0;
_mult_usuario = 0;
 //BA.debugLineNum = 56;BA.debugLine="Public mUSUARIO, mCLAVE As String";
_musuario = "";
_mclave = "";
 //BA.debugLineNum = 57;BA.debugLine="Public mDERECHO As Int";
_mderecho = 0;
 //BA.debugLineNum = 58;BA.debugLine="Public mANIO, mMES As Int";
_manio = 0;
_mmes = 0;
 //BA.debugLineNum = 60;BA.debugLine="Public mULT_EXTRAIDO As Int";
_mult_extraido = 0;
 //BA.debugLineNum = 61;BA.debugLine="Public mULT_DATOS As Int";
_mult_datos = 0;
 //BA.debugLineNum = 62;BA.debugLine="Public mULT_INDICADOR As Int";
_mult_indicador = 0;
 //BA.debugLineNum = 63;BA.debugLine="Public mCONEXION As Boolean";
_mconexion = false;
 //BA.debugLineNum = 65;BA.debugLine="Public mPANTALLA_ANCHO As Double";
_mpantalla_ancho = 0;
 //BA.debugLineNum = 66;BA.debugLine="Public mPANTALLA_ALTO As Double";
_mpantalla_alto = 0;
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
}
