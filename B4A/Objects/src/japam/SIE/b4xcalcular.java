package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcalcular extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xcalcular");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xcalcular.class).invoke(this, new Object[] {null});
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
public b4j.example.flexgrid _tbl_calcular = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_proceder = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_guardar = null;
public japam.SIE.sd_sql _msql = null;
public japam.SIE.sd_sql _msql2 = null;
public japam.SIE.sd_resultset _mrs = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_anio = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_mes = null;
public anywheresoftware.b4a.objects.LabelWrapper _l_estado_1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _l_estado_2 = null;
public b4a.example.dateutils _dateutils = null;
public japam.SIE.main _main = null;
public japam.SIE.starter _starter = null;
public japam.SIE.b4xpages _b4xpages = null;
public japam.SIE.b4xcollections _b4xcollections = null;
public japam.SIE.xuiviewsutils _xuiviewsutils = null;
public boolean  _actualizar(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "actualizar", false))
	 {return ((Boolean) Debug.delegate(ba, "actualizar", null));}
int _x = 0;
int _mult_calcular = 0;
String _mvalor = "";
String _mtipo = "";
String[] _mval_claves = null;
String[] _mval_descripciones = null;
String[] _mval_valores = null;
String[] _mind_claves = null;
String[] _mind_descripciones = null;
String[] _mind_valores = null;
String _mind_cumple = "";
String _mind_minimo = "";
String _mind_maximo = "";
String _mind_meta = "";
String _mval_clave = "";
String _mval_valor = "";
float _mfac = 0f;
float _mcob = 0f;
float _mve = 0f;
float _mvf = 0f;
float _mtc = 0f;
float _mtsc = 0f;
float _mcee = 0f;
float _mcop = 0f;
float _metc = 0f;
float _mte = 0f;
float _mgt = 0f;
float _mtr = 0f;
float _mpa = 0f;
String _mtmp_str_1 = "";
String _mtmp_str_2 = "";
String _mtmp_str_3 = "";
String _mec = "";
String _mef = "";
String _meg = "";
String _mdh = "";
String _mcs = "";
String _miee = "";
String _mie = "";
String _mil = "";
String _mrtm = "";
String _mvbf = "";
String _mcp = "";
String _mcpc = "";
float _mtmp_float = 0f;
boolean _mcompletos = false;
int _mtotal_valores = 0;
boolean _mret = false;
String _mcadena = "";
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Actualizar() As Boolean";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Dim x, mULT_CALCULAR As Int";
_x = 0;
_mult_calcular = 0;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim mVALOR, mTIPO As String";
_mvalor = "";
_mtipo = "";
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Dim mVAL_CLAVES(50), mVAL_DESCRIPCIONES(50), mVAL";
_mval_claves = new String[(int) (50)];
java.util.Arrays.fill(_mval_claves,"");
_mval_descripciones = new String[(int) (50)];
java.util.Arrays.fill(_mval_descripciones,"");
_mval_valores = new String[(int) (50)];
java.util.Arrays.fill(_mval_valores,"");
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Dim mIND_CLAVES(50), mIND_DESCRIPCIONES(50), mIND";
_mind_claves = new String[(int) (50)];
java.util.Arrays.fill(_mind_claves,"");
_mind_descripciones = new String[(int) (50)];
java.util.Arrays.fill(_mind_descripciones,"");
_mind_valores = new String[(int) (50)];
java.util.Arrays.fill(_mind_valores,"");
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim mIND_CUMPLE, mIND_MINIMO, mIND_MAXIMO, mIND_M";
_mind_cumple = "";
_mind_minimo = "";
_mind_maximo = "";
_mind_meta = "";
RDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Dim mVAL_CLAVE, mVAL_VALOR As String";
_mval_clave = "";
_mval_valor = "";
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Dim mFAC, mCOB, mVE, mVF, mTC, mTSC, mCEE, mCOP,";
_mfac = 0f;
_mcob = 0f;
_mve = 0f;
_mvf = 0f;
_mtc = 0f;
_mtsc = 0f;
_mcee = 0f;
_mcop = 0f;
_metc = 0f;
_mte = 0f;
_mgt = 0f;
_mtr = 0f;
_mpa = 0f;
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim mTMP_STR_1, mTMP_STR_2, mTMP_STR_3 As String";
_mtmp_str_1 = "";
_mtmp_str_2 = "";
_mtmp_str_3 = "";
RDebugUtils.currentLine=983049;
 //BA.debugLineNum = 983049;BA.debugLine="Dim mEC, mEF, mEG, mDH, mCS, mIEE, mIE, mIL, mRTM";
_mec = "";
_mef = "";
_meg = "";
_mdh = "";
_mcs = "";
_miee = "";
_mie = "";
_mil = "";
_mrtm = "";
_mvbf = "";
_mcp = "";
_mcpc = "";
RDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Dim mTMP_FLOAT As Float";
_mtmp_float = 0f;
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim mTOTAL_VALORES As Int";
_mtotal_valores = 0;
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Dim mRET As Boolean";
_mret = false;
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="mFAC = 0.0";
_mfac = (float) (0.0);
RDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="mCOB = 0.0";
_mcob = (float) (0.0);
RDebugUtils.currentLine=983058;
 //BA.debugLineNum = 983058;BA.debugLine="mVE = 0.0";
_mve = (float) (0.0);
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="mVF = 0.0";
_mvf = (float) (0.0);
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="mTC = 0.0";
_mtc = (float) (0.0);
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="mTSC = 0.0";
_mtsc = (float) (0.0);
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="mCEE = 0.0";
_mcee = (float) (0.0);
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="mCOP = 0.0";
_mcop = (float) (0.0);
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="mETC = 0.0";
_metc = (float) (0.0);
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="mTE = 0.0";
_mte = (float) (0.0);
RDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="mGT = 0.0";
_mgt = (float) (0.0);
RDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="mTR = 0.0";
_mtr = (float) (0.0);
RDebugUtils.currentLine=983068;
 //BA.debugLineNum = 983068;BA.debugLine="mPA = 0.0";
_mpa = (float) (0.0);
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="mEC = \"0\"";
_mec = "0";
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="mEF = \"0\"";
_mef = "0";
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="mEG = \"0\"";
_meg = "0";
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="mDH = \"0\"";
_mdh = "0";
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="mCS = \"0\"";
_mcs = "0";
RDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="mIEE = \"0\"";
_miee = "0";
RDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="mIE = \"0\"";
_mie = "0";
RDebugUtils.currentLine=983076;
 //BA.debugLineNum = 983076;BA.debugLine="mIL = \"0\"";
_mil = "0";
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="mRTM = \"0\"";
_mrtm = "0";
RDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="mVBF = \"0\"";
_mvbf = "0";
RDebugUtils.currentLine=983079;
 //BA.debugLineNum = 983079;BA.debugLine="mCP = \"0\"";
_mcp = "0";
RDebugUtils.currentLine=983080;
 //BA.debugLineNum = 983080;BA.debugLine="mCPC = \"0\"";
_mcpc = "0";
RDebugUtils.currentLine=983081;
 //BA.debugLineNum = 983081;BA.debugLine="mRET = True";
_mret = __c.True;
RDebugUtils.currentLine=983083;
 //BA.debugLineNum = 983083;BA.debugLine="mTOTAL_VALORES = -1";
_mtotal_valores = (int) (-1);
RDebugUtils.currentLine=983084;
 //BA.debugLineNum = 983084;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=983086;
 //BA.debugLineNum = 983086;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=983087;
 //BA.debugLineNum = 983087;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_valores WHERE val_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=983088;
 //BA.debugLineNum = 983088;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=983089;
 //BA.debugLineNum = 983089;BA.debugLine="mTOTAL_VALORES = mTOTAL_VALORES + 1";
_mtotal_valores = (int) (_mtotal_valores+1);
RDebugUtils.currentLine=983090;
 //BA.debugLineNum = 983090;BA.debugLine="mVAL_CLAVE = mRS.GetString(\"val_clave\")";
_mval_clave = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_clave");
RDebugUtils.currentLine=983091;
 //BA.debugLineNum = 983091;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=983093;
 //BA.debugLineNum = 983093;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_ene\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ene");
 break; }
case 1: {
RDebugUtils.currentLine=983095;
 //BA.debugLineNum = 983095;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_feb\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_feb");
 break; }
case 2: {
RDebugUtils.currentLine=983097;
 //BA.debugLineNum = 983097;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_mar\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_mar");
 break; }
case 3: {
RDebugUtils.currentLine=983099;
 //BA.debugLineNum = 983099;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_abr\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_abr");
 break; }
case 4: {
RDebugUtils.currentLine=983101;
 //BA.debugLineNum = 983101;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_may\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_may");
 break; }
case 5: {
RDebugUtils.currentLine=983103;
 //BA.debugLineNum = 983103;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_jun\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jun");
 break; }
case 6: {
RDebugUtils.currentLine=983105;
 //BA.debugLineNum = 983105;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_jul\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jul");
 break; }
case 7: {
RDebugUtils.currentLine=983107;
 //BA.debugLineNum = 983107;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_ago\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ago");
 break; }
case 8: {
RDebugUtils.currentLine=983109;
 //BA.debugLineNum = 983109;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_sep\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_sep");
 break; }
case 9: {
RDebugUtils.currentLine=983111;
 //BA.debugLineNum = 983111;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_oct\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_oct");
 break; }
case 10: {
RDebugUtils.currentLine=983113;
 //BA.debugLineNum = 983113;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_nov\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_nov");
 break; }
case 11: {
RDebugUtils.currentLine=983115;
 //BA.debugLineNum = 983115;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_dic\")";
_mval_valor = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_dic");
 break; }
}
;
RDebugUtils.currentLine=983117;
 //BA.debugLineNum = 983117;BA.debugLine="If mVAL_CLAVE = \"TC\" Then";
if ((_mval_clave).equals("TC")) { 
RDebugUtils.currentLine=983118;
 //BA.debugLineNum = 983118;BA.debugLine="mTC = mVAL_VALOR.As(Float)";
_mtc = ((float)(Double.parseDouble(_mval_valor)));
 };
RDebugUtils.currentLine=983120;
 //BA.debugLineNum = 983120;BA.debugLine="If mVAL_VALOR = \"0.00\" Or mVAL_VALOR = \"0\" Or m";
if ((_mval_valor).equals("0.00") || (_mval_valor).equals("0") || (_mval_valor).equals("0.0") || (_mval_clave).equals("VE")) { 
RDebugUtils.currentLine=983121;
 //BA.debugLineNum = 983121;BA.debugLine="If mVAL_CLAVE = \"VE\" Then";
if ((_mval_clave).equals("VE")) { 
RDebugUtils.currentLine=983122;
 //BA.debugLineNum = 983122;BA.debugLine="mVE = Calcular_Volumen_Explotado";
_mve = (float)(Double.parseDouble(__ref._calcular_volumen_explotado /*String*/ (null)));
RDebugUtils.currentLine=983123;
 //BA.debugLineNum = 983123;BA.debugLine="mVAL_VALOR = mFORMATO(mVE, \"T\")";
_mval_valor = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mve),"T"));
 };
RDebugUtils.currentLine=983125;
 //BA.debugLineNum = 983125;BA.debugLine="If mVAL_CLAVE = \"TSC\" Then";
if ((_mval_clave).equals("TSC")) { 
RDebugUtils.currentLine=983126;
 //BA.debugLineNum = 983126;BA.debugLine="mTSC = mTC * 0.97";
_mtsc = (float) (_mtc*0.97);
RDebugUtils.currentLine=983127;
 //BA.debugLineNum = 983127;BA.debugLine="mVAL_VALOR = mFORMATO(mTSC, \"T\")";
_mval_valor = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mtsc),"T"));
 };
RDebugUtils.currentLine=983129;
 //BA.debugLineNum = 983129;BA.debugLine="If mVAL_CLAVE = \"PA\" Then";
if ((_mval_clave).equals("PA")) { 
RDebugUtils.currentLine=983130;
 //BA.debugLineNum = 983130;BA.debugLine="mPA = mTC * 5";
_mpa = (float) (_mtc*5);
RDebugUtils.currentLine=983131;
 //BA.debugLineNum = 983131;BA.debugLine="mVAL_VALOR = mFORMATO(mPA, \"T\")";
_mval_valor = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mpa),"T"));
 };
RDebugUtils.currentLine=983133;
 //BA.debugLineNum = 983133;BA.debugLine="If mVAL_CLAVE = \"CEE\" Then";
if ((_mval_clave).equals("CEE")) { 
RDebugUtils.currentLine=983134;
 //BA.debugLineNum = 983134;BA.debugLine="mCEE = Calcular_Costo_Energia_Electrica";
_mcee = (float)(Double.parseDouble(__ref._calcular_costo_energia_electrica /*String*/ (null)));
RDebugUtils.currentLine=983135;
 //BA.debugLineNum = 983135;BA.debugLine="mVAL_VALOR = mFORMATO(mCEE, \"T\")";
_mval_valor = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mcee),"T"));
 };
RDebugUtils.currentLine=983137;
 //BA.debugLineNum = 983137;BA.debugLine="If mVAL_CLAVE = \"ETC\" Then";
if ((_mval_clave).equals("ETC")) { 
RDebugUtils.currentLine=983138;
 //BA.debugLineNum = 983138;BA.debugLine="mCEE = Calcular_Energia_Total_Consumida";
_mcee = (float)(Double.parseDouble(__ref._calcular_energia_total_consumida /*String*/ (null)));
RDebugUtils.currentLine=983139;
 //BA.debugLineNum = 983139;BA.debugLine="mVAL_VALOR = mFORMATO(mCEE, \"T\")";
_mval_valor = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mcee),"T"));
 };
RDebugUtils.currentLine=983141;
 //BA.debugLineNum = 983141;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=983143;
 //BA.debugLineNum = 983143;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_ene =";
_mcadena = "UPDATE sie_valores SET val_ene = '";
 break; }
case 1: {
RDebugUtils.currentLine=983145;
 //BA.debugLineNum = 983145;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_feb =";
_mcadena = "UPDATE sie_valores SET val_feb = '";
 break; }
case 2: {
RDebugUtils.currentLine=983147;
 //BA.debugLineNum = 983147;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_mar =";
_mcadena = "UPDATE sie_valores SET val_mar = '";
 break; }
case 3: {
RDebugUtils.currentLine=983149;
 //BA.debugLineNum = 983149;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_abr =";
_mcadena = "UPDATE sie_valores SET val_abr = '";
 break; }
case 4: {
RDebugUtils.currentLine=983151;
 //BA.debugLineNum = 983151;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_may =";
_mcadena = "UPDATE sie_valores SET val_may = '";
 break; }
case 5: {
RDebugUtils.currentLine=983153;
 //BA.debugLineNum = 983153;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_jun =";
_mcadena = "UPDATE sie_valores SET val_jun = '";
 break; }
case 6: {
RDebugUtils.currentLine=983155;
 //BA.debugLineNum = 983155;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_jul =";
_mcadena = "UPDATE sie_valores SET val_jul = '";
 break; }
case 7: {
RDebugUtils.currentLine=983157;
 //BA.debugLineNum = 983157;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_ago =";
_mcadena = "UPDATE sie_valores SET val_ago = '";
 break; }
case 8: {
RDebugUtils.currentLine=983159;
 //BA.debugLineNum = 983159;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_sep =";
_mcadena = "UPDATE sie_valores SET val_sep = '";
 break; }
case 9: {
RDebugUtils.currentLine=983161;
 //BA.debugLineNum = 983161;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_oct =";
_mcadena = "UPDATE sie_valores SET val_oct = '";
 break; }
case 10: {
RDebugUtils.currentLine=983163;
 //BA.debugLineNum = 983163;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_nov =";
_mcadena = "UPDATE sie_valores SET val_nov = '";
 break; }
case 11: {
RDebugUtils.currentLine=983165;
 //BA.debugLineNum = 983165;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_dic =";
_mcadena = "UPDATE sie_valores SET val_dic = '";
 break; }
}
;
RDebugUtils.currentLine=983167;
 //BA.debugLineNum = 983167;BA.debugLine="mCADENA = mCADENA & mVAL_VALOR & \"' WHERE val_";
_mcadena = _mcadena+_mval_valor+"' WHERE val_clave = '"+_mval_clave+"' AND val_anio = "+BA.NumberToString(_main._manio /*int*/ );
RDebugUtils.currentLine=983168;
 //BA.debugLineNum = 983168;BA.debugLine="Conectar_Servidor_2";
__ref._conectar_servidor_2 /*String*/ (null);
RDebugUtils.currentLine=983169;
 //BA.debugLineNum = 983169;BA.debugLine="mSQL2.ExecNonQuery(mCADENA)";
__ref._msql2 /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,_mcadena);
RDebugUtils.currentLine=983170;
 //BA.debugLineNum = 983170;BA.debugLine="mSQL2.Close";
__ref._msql2 /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 };
 }
;
RDebugUtils.currentLine=983173;
 //BA.debugLineNum = 983173;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
RDebugUtils.currentLine=983174;
 //BA.debugLineNum = 983174;BA.debugLine="mRS.Close";
__ref._mrs /*japam.SIE.sd_resultset*/ ._close /*String*/ (null);
 };
RDebugUtils.currentLine=983177;
 //BA.debugLineNum = 983177;BA.debugLine="x = -1";
_x = (int) (-1);
RDebugUtils.currentLine=983178;
 //BA.debugLineNum = 983178;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=983179;
 //BA.debugLineNum = 983179;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=983180;
 //BA.debugLineNum = 983180;BA.debugLine="mTIPO = \"V\"";
_mtipo = "V";
RDebugUtils.currentLine=983181;
 //BA.debugLineNum = 983181;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_valores WHERE val_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=983182;
 //BA.debugLineNum = 983182;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=983183;
 //BA.debugLineNum = 983183;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
RDebugUtils.currentLine=983184;
 //BA.debugLineNum = 983184;BA.debugLine="mVAL_CLAVES(x) = mRS.GetString(\"val_clave\")";
_mval_claves[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_clave");
RDebugUtils.currentLine=983185;
 //BA.debugLineNum = 983185;BA.debugLine="mVAL_DESCRIPCIONES(x) = mRS.GetString(\"val_desc";
_mval_descripciones[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_descripcion");
RDebugUtils.currentLine=983186;
 //BA.debugLineNum = 983186;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=983188;
 //BA.debugLineNum = 983188;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_ene\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ene");
 break; }
case 1: {
RDebugUtils.currentLine=983190;
 //BA.debugLineNum = 983190;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_feb\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_feb");
 break; }
case 2: {
RDebugUtils.currentLine=983192;
 //BA.debugLineNum = 983192;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_mar\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_mar");
 break; }
case 3: {
RDebugUtils.currentLine=983194;
 //BA.debugLineNum = 983194;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_abr\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_abr");
 break; }
case 4: {
RDebugUtils.currentLine=983196;
 //BA.debugLineNum = 983196;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_may\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_may");
 break; }
case 5: {
RDebugUtils.currentLine=983198;
 //BA.debugLineNum = 983198;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_jun\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jun");
 break; }
case 6: {
RDebugUtils.currentLine=983200;
 //BA.debugLineNum = 983200;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_jul\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jul");
 break; }
case 7: {
RDebugUtils.currentLine=983202;
 //BA.debugLineNum = 983202;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_ago\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ago");
 break; }
case 8: {
RDebugUtils.currentLine=983204;
 //BA.debugLineNum = 983204;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_sep\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_sep");
 break; }
case 9: {
RDebugUtils.currentLine=983206;
 //BA.debugLineNum = 983206;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_oct\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_oct");
 break; }
case 10: {
RDebugUtils.currentLine=983208;
 //BA.debugLineNum = 983208;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_nov\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_nov");
 break; }
case 11: {
RDebugUtils.currentLine=983210;
 //BA.debugLineNum = 983210;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_dic\")";
_mval_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_dic");
 break; }
}
;
RDebugUtils.currentLine=983212;
 //BA.debugLineNum = 983212;BA.debugLine="Select Case mVAL_CLAVES(x)";
switch (BA.switchObjectToInt(_mval_claves[_x],"FAC","COB","VE","VF","TC","TSC","CEE","COP","ETC","TE","GT","TR","PA")) {
case 0: {
RDebugUtils.currentLine=983214;
 //BA.debugLineNum = 983214;BA.debugLine="mFAC = mVAL_VALORES(x).As(Float)";
_mfac = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 1: {
RDebugUtils.currentLine=983216;
 //BA.debugLineNum = 983216;BA.debugLine="mCOB = mVAL_VALORES(x).As(Float)";
_mcob = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 2: {
RDebugUtils.currentLine=983218;
 //BA.debugLineNum = 983218;BA.debugLine="mVE = mVAL_VALORES(x).As(Float)";
_mve = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 3: {
RDebugUtils.currentLine=983220;
 //BA.debugLineNum = 983220;BA.debugLine="mVF = mVAL_VALORES(x).As(Float)";
_mvf = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 4: {
RDebugUtils.currentLine=983222;
 //BA.debugLineNum = 983222;BA.debugLine="mTC = mVAL_VALORES(x).As(Float)";
_mtc = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 5: {
RDebugUtils.currentLine=983224;
 //BA.debugLineNum = 983224;BA.debugLine="mTSC = mVAL_VALORES(x).As(Float)";
_mtsc = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 6: {
RDebugUtils.currentLine=983226;
 //BA.debugLineNum = 983226;BA.debugLine="mCEE = mVAL_VALORES(x).As(Float)";
_mcee = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 7: {
RDebugUtils.currentLine=983228;
 //BA.debugLineNum = 983228;BA.debugLine="mCOP = mVAL_VALORES(x).As(Float)";
_mcop = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 8: {
RDebugUtils.currentLine=983230;
 //BA.debugLineNum = 983230;BA.debugLine="mETC = mVAL_VALORES(x).As(Float)";
_metc = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 9: {
RDebugUtils.currentLine=983232;
 //BA.debugLineNum = 983232;BA.debugLine="mTE = mVAL_VALORES(x).As(Float)";
_mte = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 10: {
RDebugUtils.currentLine=983234;
 //BA.debugLineNum = 983234;BA.debugLine="mGT = mVAL_VALORES(x).As(Float)";
_mgt = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 11: {
RDebugUtils.currentLine=983236;
 //BA.debugLineNum = 983236;BA.debugLine="mTR = mVAL_VALORES(x).As(Float)";
_mtr = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 12: {
RDebugUtils.currentLine=983238;
 //BA.debugLineNum = 983238;BA.debugLine="mPA = mVAL_VALORES(x).As(Float)";
_mpa = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
}
;
RDebugUtils.currentLine=983240;
 //BA.debugLineNum = 983240;BA.debugLine="TBL_Calcular.AddRow(Array As Object(mVAL_CLAVES";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mval_claves[_x]),(Object)(_mval_descripciones[_x]),__ref._mformato /*Object*/ (null,_mval_valores[_x],"N"),(Object)(_mtipo)},__c.True);
 }
;
RDebugUtils.currentLine=983242;
 //BA.debugLineNum = 983242;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
RDebugUtils.currentLine=983243;
 //BA.debugLineNum = 983243;BA.debugLine="mRS.Close";
__ref._mrs /*japam.SIE.sd_resultset*/ ._close /*String*/ (null);
 };
RDebugUtils.currentLine=983245;
 //BA.debugLineNum = 983245;BA.debugLine="mULT_CALCULAR = x";
_mult_calcular = _x;
RDebugUtils.currentLine=983247;
 //BA.debugLineNum = 983247;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=983248;
 //BA.debugLineNum = 983248;BA.debugLine="For x = 0 To mULT_CALCULAR";
{
final int step203 = 1;
final int limit203 = _mult_calcular;
_x = (int) (0) ;
for (;_x <= limit203 ;_x = _x + step203 ) {
RDebugUtils.currentLine=983249;
 //BA.debugLineNum = 983249;BA.debugLine="mVALOR= TBL_Calcular.GetCellValue(x, 2)";
_mvalor = BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (2)));
RDebugUtils.currentLine=983250;
 //BA.debugLineNum = 983250;BA.debugLine="mTIPO = TBL_Calcular.GetCellValue(x, 3)";
_mtipo = BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (3)));
RDebugUtils.currentLine=983251;
 //BA.debugLineNum = 983251;BA.debugLine="If mTIPO = \"V\" Then";
if ((_mtipo).equals("V")) { 
RDebugUtils.currentLine=983252;
 //BA.debugLineNum = 983252;BA.debugLine="If mVALOR = \"0.00\" Or mVALOR = \"\" Or mVALOR = \"";
if ((_mvalor).equals("0.00") || (_mvalor).equals("") || (_mvalor).equals("0")) { 
RDebugUtils.currentLine=983253;
 //BA.debugLineNum = 983253;BA.debugLine="mRET = False";
_mret = __c.False;
RDebugUtils.currentLine=983254;
 //BA.debugLineNum = 983254;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
RDebugUtils.currentLine=983255;
 //BA.debugLineNum = 983255;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setrowcustomize(_x,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (255),(int) (255),(int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
 };
 };
 }
};
RDebugUtils.currentLine=983259;
 //BA.debugLineNum = 983259;BA.debugLine="If Not(mCOMPLETOS) Then";
if (__c.Not(_mcompletos)) { 
RDebugUtils.currentLine=983260;
 //BA.debugLineNum = 983260;BA.debugLine="L_Estado_1.Visible = True";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=983261;
 //BA.debugLineNum = 983261;BA.debugLine="L_Estado_2.Visible = True";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=983262;
 //BA.debugLineNum = 983262;BA.debugLine="L_Estado_1.Text = \"Falta información para poder";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Falta información para poder determinar"));
RDebugUtils.currentLine=983263;
 //BA.debugLineNum = 983263;BA.debugLine="L_Estado_2.Text = \"los Indicadores de Efectivida";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("los Indicadores de Efectividad"));
 };
RDebugUtils.currentLine=983265;
 //BA.debugLineNum = 983265;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
RDebugUtils.currentLine=983266;
 //BA.debugLineNum = 983266;BA.debugLine="mIND_CUMPLE = \"\"";
_mind_cumple = "";
RDebugUtils.currentLine=983267;
 //BA.debugLineNum = 983267;BA.debugLine="x = mULT_CALCULAR";
_x = _mult_calcular;
RDebugUtils.currentLine=983269;
 //BA.debugLineNum = 983269;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=983270;
 //BA.debugLineNum = 983270;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=983271;
 //BA.debugLineNum = 983271;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_indicad";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_indicadores WHERE ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=983272;
 //BA.debugLineNum = 983272;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=983273;
 //BA.debugLineNum = 983273;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
RDebugUtils.currentLine=983274;
 //BA.debugLineNum = 983274;BA.debugLine="mIND_CLAVES(x) = mRS.GetString(\"ind_clave\")";
_mind_claves[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_clave");
RDebugUtils.currentLine=983275;
 //BA.debugLineNum = 983275;BA.debugLine="mIND_DESCRIPCIONES(x) = mRS.GetString(\"ind_des";
_mind_descripciones[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_descripcion");
RDebugUtils.currentLine=983276;
 //BA.debugLineNum = 983276;BA.debugLine="mIND_MINIMO = mRS.GetString(\"ind_minimo\")";
_mind_minimo = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_minimo");
RDebugUtils.currentLine=983277;
 //BA.debugLineNum = 983277;BA.debugLine="mIND_MAXIMO = mRS.GetString(\"ind_maximo\")";
_mind_maximo = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_maximo");
RDebugUtils.currentLine=983278;
 //BA.debugLineNum = 983278;BA.debugLine="mIND_META = mRS.GetString(\"ind_meta\")";
_mind_meta = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_meta");
RDebugUtils.currentLine=983279;
 //BA.debugLineNum = 983279;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=983281;
 //BA.debugLineNum = 983281;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_ene\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_ene");
 break; }
case 1: {
RDebugUtils.currentLine=983283;
 //BA.debugLineNum = 983283;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_feb\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_feb");
 break; }
case 2: {
RDebugUtils.currentLine=983285;
 //BA.debugLineNum = 983285;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_mar\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_mar");
 break; }
case 3: {
RDebugUtils.currentLine=983287;
 //BA.debugLineNum = 983287;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_abr\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_abr");
 break; }
case 4: {
RDebugUtils.currentLine=983289;
 //BA.debugLineNum = 983289;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_may\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_may");
 break; }
case 5: {
RDebugUtils.currentLine=983291;
 //BA.debugLineNum = 983291;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_jun\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_jun");
 break; }
case 6: {
RDebugUtils.currentLine=983293;
 //BA.debugLineNum = 983293;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_jul\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_jul");
 break; }
case 7: {
RDebugUtils.currentLine=983295;
 //BA.debugLineNum = 983295;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_ago\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_ago");
 break; }
case 8: {
RDebugUtils.currentLine=983297;
 //BA.debugLineNum = 983297;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_sep\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_sep");
 break; }
case 9: {
RDebugUtils.currentLine=983299;
 //BA.debugLineNum = 983299;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_oct\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_oct");
 break; }
case 10: {
RDebugUtils.currentLine=983301;
 //BA.debugLineNum = 983301;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_nov\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_nov");
 break; }
case 11: {
RDebugUtils.currentLine=983303;
 //BA.debugLineNum = 983303;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_dic\")";
_mind_valores[_x] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_dic");
 break; }
}
;
RDebugUtils.currentLine=983305;
 //BA.debugLineNum = 983305;BA.debugLine="TBL_Calcular.AddRow(Array As Object(mIND_CLAVE";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mind_claves[_x]),(Object)(_mind_descripciones[_x]),(Object)(_mind_valores[_x]),(Object)(_mind_meta),(Object)(_mind_cumple),(Object)(_mind_minimo),(Object)(_mind_maximo)},__c.True);
 }
;
RDebugUtils.currentLine=983307;
 //BA.debugLineNum = 983307;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
RDebugUtils.currentLine=983308;
 //BA.debugLineNum = 983308;BA.debugLine="mRS.Close";
__ref._mrs /*japam.SIE.sd_resultset*/ ._close /*String*/ (null);
 };
RDebugUtils.currentLine=983310;
 //BA.debugLineNum = 983310;BA.debugLine="mULT_CALCULAR = x";
_mult_calcular = _x;
RDebugUtils.currentLine=983312;
 //BA.debugLineNum = 983312;BA.debugLine="For x = 0 To mULT_CALCULAR";
{
final int step265 = 1;
final int limit265 = _mult_calcular;
_x = (int) (0) ;
for (;_x <= limit265 ;_x = _x + step265 ) {
RDebugUtils.currentLine=983314;
 //BA.debugLineNum = 983314;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EC\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("EC"))) { 
RDebugUtils.currentLine=983315;
 //BA.debugLineNum = 983315;BA.debugLine="If mFAC <> 0 Then";
if (_mfac!=0) { 
RDebugUtils.currentLine=983316;
 //BA.debugLineNum = 983316;BA.debugLine="mTMP_FLOAT = (mCOB / mFAC) * 100";
_mtmp_float = (float) ((_mcob/(double)_mfac)*100);
RDebugUtils.currentLine=983317;
 //BA.debugLineNum = 983317;BA.debugLine="mEC = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_mec = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983318;
 //BA.debugLineNum = 983318;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEC)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mec));
 }else {
RDebugUtils.currentLine=983320;
 //BA.debugLineNum = 983320;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, \"Falta FACTUR";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)("Falta FACTURADO ($)"));
 };
 };
RDebugUtils.currentLine=983324;
 //BA.debugLineNum = 983324;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EF\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("EF"))) { 
RDebugUtils.currentLine=983325;
 //BA.debugLineNum = 983325;BA.debugLine="If mVE <> 0 Then";
if (_mve!=0) { 
RDebugUtils.currentLine=983326;
 //BA.debugLineNum = 983326;BA.debugLine="mTMP_FLOAT = (mVF / mVE) * 100";
_mtmp_float = (float) ((_mvf/(double)_mve)*100);
RDebugUtils.currentLine=983327;
 //BA.debugLineNum = 983327;BA.debugLine="mEF = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_mef = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983328;
 //BA.debugLineNum = 983328;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEF)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mef));
 }else {
RDebugUtils.currentLine=983330;
 //BA.debugLineNum = 983330;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, \"Falta VOLUME";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)("Falta VOLUMEN EXPLOTADO (m3)"));
 };
 };
RDebugUtils.currentLine=983334;
 //BA.debugLineNum = 983334;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EG\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("EG"))) { 
RDebugUtils.currentLine=983335;
 //BA.debugLineNum = 983335;BA.debugLine="mTMP_STR_1 = mFORMATO(mEC, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mec,"T"));
RDebugUtils.currentLine=983336;
 //BA.debugLineNum = 983336;BA.debugLine="mTMP_STR_2 = mFORMATO(mEF, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mef,"T"));
RDebugUtils.currentLine=983337;
 //BA.debugLineNum = 983337;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 * mTMP_STR_2) / 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))*(double)(Double.parseDouble(_mtmp_str_2)))/(double)100);
RDebugUtils.currentLine=983338;
 //BA.debugLineNum = 983338;BA.debugLine="mEG = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_meg = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983339;
 //BA.debugLineNum = 983339;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEG)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_meg));
 };
RDebugUtils.currentLine=983342;
 //BA.debugLineNum = 983342;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"DH\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("DH"))) { 
RDebugUtils.currentLine=983343;
 //BA.debugLineNum = 983343;BA.debugLine="mTMP_STR_1 = mFORMATO(mVE, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mve),"T"));
RDebugUtils.currentLine=983344;
 //BA.debugLineNum = 983344;BA.debugLine="mTMP_STR_2 = mFORMATO(mPA, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mpa),"T"));
RDebugUtils.currentLine=983345;
 //BA.debugLineNum = 983345;BA.debugLine="mTMP_FLOAT = ((mTMP_STR_1 * 1000) / mTMP_STR_2";
_mtmp_float = (float) ((((double)(Double.parseDouble(_mtmp_str_1))*1000)/(double)(double)(Double.parseDouble(_mtmp_str_2)))/(double)30);
RDebugUtils.currentLine=983346;
 //BA.debugLineNum = 983346;BA.debugLine="mDH = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
_mdh = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"N"));
RDebugUtils.currentLine=983347;
 //BA.debugLineNum = 983347;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mDH)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mdh));
 };
RDebugUtils.currentLine=983350;
 //BA.debugLineNum = 983350;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CS\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("CS"))) { 
RDebugUtils.currentLine=983351;
 //BA.debugLineNum = 983351;BA.debugLine="mTMP_STR_1 = mFORMATO(mTSC, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mtsc),"T"));
RDebugUtils.currentLine=983352;
 //BA.debugLineNum = 983352;BA.debugLine="mTMP_STR_2 = mFORMATO(mTC, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mtc),"T"));
RDebugUtils.currentLine=983353;
 //BA.debugLineNum = 983353;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
RDebugUtils.currentLine=983354;
 //BA.debugLineNum = 983354;BA.debugLine="mCS = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_mcs = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983355;
 //BA.debugLineNum = 983355;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCS)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mcs));
 };
RDebugUtils.currentLine=983358;
 //BA.debugLineNum = 983358;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IEE\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("IEE"))) { 
RDebugUtils.currentLine=983359;
 //BA.debugLineNum = 983359;BA.debugLine="mTMP_STR_1 = mFORMATO(mCEE, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mcee),"T"));
RDebugUtils.currentLine=983360;
 //BA.debugLineNum = 983360;BA.debugLine="mTMP_STR_2 = mFORMATO(mCOP, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mcop),"T"));
RDebugUtils.currentLine=983361;
 //BA.debugLineNum = 983361;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
RDebugUtils.currentLine=983362;
 //BA.debugLineNum = 983362;BA.debugLine="mIEE = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_miee = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983363;
 //BA.debugLineNum = 983363;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIEE)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_miee));
 };
RDebugUtils.currentLine=983366;
 //BA.debugLineNum = 983366;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IE\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("IE"))) { 
RDebugUtils.currentLine=983367;
 //BA.debugLineNum = 983367;BA.debugLine="mTMP_STR_1 = mFORMATO(mETC, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_metc),"T"));
RDebugUtils.currentLine=983368;
 //BA.debugLineNum = 983368;BA.debugLine="mTMP_STR_2 = mFORMATO(mVE, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mve),"T"));
RDebugUtils.currentLine=983369;
 //BA.debugLineNum = 983369;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
RDebugUtils.currentLine=983370;
 //BA.debugLineNum = 983370;BA.debugLine="mIE = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
_mie = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"N"));
RDebugUtils.currentLine=983371;
 //BA.debugLineNum = 983371;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIE)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mie));
 };
RDebugUtils.currentLine=983374;
 //BA.debugLineNum = 983374;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IL\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("IL"))) { 
RDebugUtils.currentLine=983375;
 //BA.debugLineNum = 983375;BA.debugLine="mTMP_STR_1 = mFORMATO(mTE, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mte),"T"));
RDebugUtils.currentLine=983376;
 //BA.debugLineNum = 983376;BA.debugLine="mTMP_STR_2 = mFORMATO(mTC, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mtc),"T"));
RDebugUtils.currentLine=983377;
 //BA.debugLineNum = 983377;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / (mTMP_STR_2 / 1000)";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)((double)(Double.parseDouble(_mtmp_str_2))/(double)1000));
RDebugUtils.currentLine=983378;
 //BA.debugLineNum = 983378;BA.debugLine="mIL = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
_mil = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"N"));
RDebugUtils.currentLine=983379;
 //BA.debugLineNum = 983379;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIL)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mil));
 };
RDebugUtils.currentLine=983382;
 //BA.debugLineNum = 983382;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"RTM\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("RTM"))) { 
RDebugUtils.currentLine=983383;
 //BA.debugLineNum = 983383;BA.debugLine="mTMP_STR_1 = mFORMATO(mGT, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mgt),"T"));
RDebugUtils.currentLine=983384;
 //BA.debugLineNum = 983384;BA.debugLine="mTMP_STR_2 = mFORMATO(mTR, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mtr),"T"));
RDebugUtils.currentLine=983385;
 //BA.debugLineNum = 983385;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
RDebugUtils.currentLine=983386;
 //BA.debugLineNum = 983386;BA.debugLine="mRTM = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
_mrtm = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"N"));
RDebugUtils.currentLine=983387;
 //BA.debugLineNum = 983387;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mRTM)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mrtm));
 };
RDebugUtils.currentLine=983390;
 //BA.debugLineNum = 983390;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"VBF\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("VBF"))) { 
RDebugUtils.currentLine=983391;
 //BA.debugLineNum = 983391;BA.debugLine="mTMP_STR_1 = mFORMATO(mRTM, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mrtm,"T"));
RDebugUtils.currentLine=983392;
 //BA.debugLineNum = 983392;BA.debugLine="mTMP_FLOAT = (1 - mTMP_STR_1) * 100";
_mtmp_float = (float) ((1-(double)(Double.parseDouble(_mtmp_str_1)))*100);
RDebugUtils.currentLine=983393;
 //BA.debugLineNum = 983393;BA.debugLine="mVBF = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_mvbf = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983394;
 //BA.debugLineNum = 983394;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mVBF)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mvbf));
 };
RDebugUtils.currentLine=983397;
 //BA.debugLineNum = 983397;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CP\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("CP"))) { 
RDebugUtils.currentLine=983398;
 //BA.debugLineNum = 983398;BA.debugLine="mTMP_STR_1 = mFORMATO(mGT, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mgt),"T"));
RDebugUtils.currentLine=983399;
 //BA.debugLineNum = 983399;BA.debugLine="mTMP_STR_2 = mFORMATO(mVE, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mve),"T"));
RDebugUtils.currentLine=983400;
 //BA.debugLineNum = 983400;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
RDebugUtils.currentLine=983401;
 //BA.debugLineNum = 983401;BA.debugLine="mCP = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
_mcp = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"N"));
RDebugUtils.currentLine=983402;
 //BA.debugLineNum = 983402;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCP)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mcp));
 };
RDebugUtils.currentLine=983405;
 //BA.debugLineNum = 983405;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CPC\" Then";
if ((__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0))).equals((Object)("CPC"))) { 
RDebugUtils.currentLine=983406;
 //BA.debugLineNum = 983406;BA.debugLine="mTMP_STR_1 = mFORMATO(mVF, \"T\")";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mvf),"T"));
RDebugUtils.currentLine=983407;
 //BA.debugLineNum = 983407;BA.debugLine="mTMP_STR_2 = mFORMATO(mPA, \"T\")";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.NumberToString(_mpa),"T"));
RDebugUtils.currentLine=983408;
 //BA.debugLineNum = 983408;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
RDebugUtils.currentLine=983409;
 //BA.debugLineNum = 983409;BA.debugLine="mCPC = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
_mcpc = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"N"));
RDebugUtils.currentLine=983410;
 //BA.debugLineNum = 983410;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCPC)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (2),(Object)(_mcpc));
 };
 }
};
RDebugUtils.currentLine=983414;
 //BA.debugLineNum = 983414;BA.debugLine="For x = 0 To mTOTAL_VALORES";
{
final int step354 = 1;
final int limit354 = _mtotal_valores;
_x = (int) (0) ;
for (;_x <= limit354 ;_x = _x + step354 ) {
RDebugUtils.currentLine=983415;
 //BA.debugLineNum = 983415;BA.debugLine="TBL_Calcular.RemoveRow(0)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._removerow((int) (0));
 }
};
RDebugUtils.currentLine=983417;
 //BA.debugLineNum = 983417;BA.debugLine="For x = 0 To TBL_Calcular.RowCount -1";
{
final int step357 = 1;
final int limit357 = (int) (__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getrowcount()-1);
_x = (int) (0) ;
for (;_x <= limit357 ;_x = _x + step357 ) {
RDebugUtils.currentLine=983418;
 //BA.debugLineNum = 983418;BA.debugLine="mTMP_STR_1 = mFORMATO(TBL_Calcular.GetCellValue";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (2))),"T"));
RDebugUtils.currentLine=983419;
 //BA.debugLineNum = 983419;BA.debugLine="mTMP_STR_2 = mFORMATO(TBL_Calcular.GetCellValue";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (3))),"T"));
RDebugUtils.currentLine=983420;
 //BA.debugLineNum = 983420;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
RDebugUtils.currentLine=983421;
 //BA.debugLineNum = 983421;BA.debugLine="mVALOR = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
_mvalor = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mtmp_float)),"P"));
RDebugUtils.currentLine=983422;
 //BA.debugLineNum = 983422;BA.debugLine="TBL_Calcular.SetCellValue(x, 4, mVALOR)";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcellvalue(_x,(int) (4),(Object)(_mvalor));
RDebugUtils.currentLine=983424;
 //BA.debugLineNum = 983424;BA.debugLine="mTMP_STR_1 = mFORMATO(TBL_Calcular.GetCellValue";
_mtmp_str_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (2))),"T"));
RDebugUtils.currentLine=983425;
 //BA.debugLineNum = 983425;BA.debugLine="mTMP_STR_2 = mFORMATO(TBL_Calcular.GetCellValue";
_mtmp_str_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (3))),"T"));
RDebugUtils.currentLine=983426;
 //BA.debugLineNum = 983426;BA.debugLine="mTMP_STR_3 = mFORMATO(TBL_Calcular.GetCellValue";
_mtmp_str_3 = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (5))),"T"));
RDebugUtils.currentLine=983427;
 //BA.debugLineNum = 983427;BA.debugLine="If mTMP_STR_1 < mTMP_STR_3 Then";
if ((double)(Double.parseDouble(_mtmp_str_1))<(double)(Double.parseDouble(_mtmp_str_3))) { 
RDebugUtils.currentLine=983428;
 //BA.debugLineNum = 983428;BA.debugLine="TBL_Calcular.SetRowCustomize(x, xui.Color_RGB(";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setrowcustomize(_x,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (255),(int) (255),(int) (0)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
 };
RDebugUtils.currentLine=983430;
 //BA.debugLineNum = 983430;BA.debugLine="If mTMP_STR_1 > mTMP_STR_3 And mTMP_STR_1 < mTM";
if ((double)(Double.parseDouble(_mtmp_str_1))>(double)(Double.parseDouble(_mtmp_str_3)) && (double)(Double.parseDouble(_mtmp_str_1))<(double)(Double.parseDouble(_mtmp_str_2))) { 
RDebugUtils.currentLine=983431;
 //BA.debugLineNum = 983431;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setrowcustomize(_x,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (70),(int) (130),(int) (180)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
 };
RDebugUtils.currentLine=983433;
 //BA.debugLineNum = 983433;BA.debugLine="If mTMP_STR_1 >= mTMP_STR_2 Then";
if ((double)(Double.parseDouble(_mtmp_str_1))>=(double)(Double.parseDouble(_mtmp_str_2))) { 
RDebugUtils.currentLine=983434;
 //BA.debugLineNum = 983434;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setrowcustomize(_x,__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
 };
 }
};
 };
RDebugUtils.currentLine=983438;
 //BA.debugLineNum = 983438;BA.debugLine="Return mRET";
if (true) return _mret;
RDebugUtils.currentLine=983439;
 //BA.debugLineNum = 983439;BA.debugLine="End Sub";
return false;
}
public String  _conectar_servidor(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _calcular_volumen_explotado(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "calcular_volumen_explotado", false))
	 {return ((String) Debug.delegate(ba, "calcular_volumen_explotado", null));}
String _mtotal_explotado = "";
String _mexplotado = "";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub Calcular_Volumen_Explotado() As String";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim mTOTAL_EXPLOTADO, mEXPLOTADO As String";
_mtotal_explotado = "";
_mexplotado = "";
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="mTOTAL_EXPLOTADO = 0";
_mtotal_explotado = BA.NumberToString(0);
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_extraido";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_extraido WHERE ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_ene\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_ene");
 break; }
case 1: {
RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_feb\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_feb");
 break; }
case 2: {
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_mar\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_mar");
 break; }
case 3: {
RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_abr\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_abr");
 break; }
case 4: {
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_may\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_may");
 break; }
case 5: {
RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_jun\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_jun");
 break; }
case 6: {
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_jul\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_jul");
 break; }
case 7: {
RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_ago\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_ago");
 break; }
case 8: {
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_sep\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_sep");
 break; }
case 9: {
RDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_oct\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_oct");
 break; }
case 10: {
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_nov\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_nov");
 break; }
case 11: {
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_dic\")";
_mexplotado = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_dic");
 break; }
}
;
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="If mEXPLOTADO = \"\" Then";
if ((_mexplotado).equals("")) { 
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="mEXPLOTADO = \"0\"";
_mexplotado = "0";
 };
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="mTOTAL_EXPLOTADO = mTOTAL_EXPLOTADO + mEXPLOTAD";
_mtotal_explotado = BA.NumberToString((double)(Double.parseDouble(_mtotal_explotado))+(double)(Double.parseDouble(_mexplotado)));
 }
;
RDebugUtils.currentLine=1048617;
 //BA.debugLineNum = 1048617;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 };
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="Return mTOTAL_EXPLOTADO";
if (true) return _mtotal_explotado;
RDebugUtils.currentLine=1048620;
 //BA.debugLineNum = 1048620;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xcalcular __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "mformato", false))
	 {return ((Object) Debug.delegate(ba, "mformato", new Object[] {_valor,_formato}));}
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
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=1507339;
 //BA.debugLineNum = 1507339;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=1507342;
 //BA.debugLineNum = 1507342;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=1507343;
 //BA.debugLineNum = 1507343;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=1507348;
 //BA.debugLineNum = 1507348;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=1507349;
 //BA.debugLineNum = 1507349;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=1507350;
 //BA.debugLineNum = 1507350;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=1507351;
 //BA.debugLineNum = 1507351;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=1507352;
 //BA.debugLineNum = 1507352;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=1507353;
 //BA.debugLineNum = 1507353;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=1507355;
 //BA.debugLineNum = 1507355;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=1507357;
 //BA.debugLineNum = 1507357;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=1507358;
 //BA.debugLineNum = 1507358;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=1507360;
 //BA.debugLineNum = 1507360;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=1507362;
 //BA.debugLineNum = 1507362;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=1507363;
 //BA.debugLineNum = 1507363;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=1507364;
 //BA.debugLineNum = 1507364;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=1507365;
 //BA.debugLineNum = 1507365;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=1507367;
 //BA.debugLineNum = 1507367;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=1507368;
 //BA.debugLineNum = 1507368;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=1507369;
 //BA.debugLineNum = 1507369;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=1507371;
 //BA.debugLineNum = 1507371;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=1507372;
 //BA.debugLineNum = 1507372;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=1507373;
 //BA.debugLineNum = 1507373;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=1507374;
 //BA.debugLineNum = 1507374;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=1507376;
 //BA.debugLineNum = 1507376;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=1507377;
 //BA.debugLineNum = 1507377;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=1507378;
 //BA.debugLineNum = 1507378;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=1507380;
 //BA.debugLineNum = 1507380;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=1507382;
 //BA.debugLineNum = 1507382;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=1507383;
 //BA.debugLineNum = 1507383;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=1507385;
 //BA.debugLineNum = 1507385;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=1507386;
 //BA.debugLineNum = 1507386;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=1507387;
 //BA.debugLineNum = 1507387;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=1507389;
 //BA.debugLineNum = 1507389;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=1507390;
 //BA.debugLineNum = 1507390;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=1507392;
 //BA.debugLineNum = 1507392;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=1507393;
 //BA.debugLineNum = 1507393;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=1507397;
 //BA.debugLineNum = 1507397;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=1507398;
 //BA.debugLineNum = 1507398;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=1507399;
 //BA.debugLineNum = 1507399;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=1507400;
 //BA.debugLineNum = 1507400;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=1507401;
 //BA.debugLineNum = 1507401;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=1507402;
 //BA.debugLineNum = 1507402;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=1507403;
 //BA.debugLineNum = 1507403;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=1507404;
 //BA.debugLineNum = 1507404;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=1507406;
 //BA.debugLineNum = 1507406;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=1507407;
 //BA.debugLineNum = 1507407;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=1507408;
 //BA.debugLineNum = 1507408;BA.debugLine="End Sub";
return null;
}
public String  _calcular_costo_energia_electrica(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "calcular_costo_energia_electrica", false))
	 {return ((String) Debug.delegate(ba, "calcular_costo_energia_electrica", null));}
String _mtotal_monto = "";
String _mmonto = "";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Private Sub Calcular_Costo_Energia_Electrica() As";
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim mTOTAL_MONTO, mMONTO As String";
_mtotal_monto = "";
_mmonto = "";
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="mTOTAL_MONTO = 0";
_mtotal_monto = BA.NumberToString(0);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_energia";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_energia WHERE see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=1114122;
 //BA.debugLineNum = 1114122;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_ene\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_ene");
 break; }
case 1: {
RDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_feb\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_feb");
 break; }
case 2: {
RDebugUtils.currentLine=1114128;
 //BA.debugLineNum = 1114128;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_mar\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_mar");
 break; }
case 3: {
RDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_abr\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_abr");
 break; }
case 4: {
RDebugUtils.currentLine=1114132;
 //BA.debugLineNum = 1114132;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_may\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_may");
 break; }
case 5: {
RDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_jun\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_jun");
 break; }
case 6: {
RDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_jul\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_jul");
 break; }
case 7: {
RDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_ago\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_ago");
 break; }
case 8: {
RDebugUtils.currentLine=1114140;
 //BA.debugLineNum = 1114140;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_sep\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_sep");
 break; }
case 9: {
RDebugUtils.currentLine=1114142;
 //BA.debugLineNum = 1114142;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_oct\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_oct");
 break; }
case 10: {
RDebugUtils.currentLine=1114144;
 //BA.debugLineNum = 1114144;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_nov\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_nov");
 break; }
case 11: {
RDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_dic\")";
_mmonto = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_dic");
 break; }
}
;
RDebugUtils.currentLine=1114148;
 //BA.debugLineNum = 1114148;BA.debugLine="If mMONTO = \"\" Then";
if ((_mmonto).equals("")) { 
RDebugUtils.currentLine=1114149;
 //BA.debugLineNum = 1114149;BA.debugLine="mMONTO = \"0\"";
_mmonto = "0";
 };
RDebugUtils.currentLine=1114151;
 //BA.debugLineNum = 1114151;BA.debugLine="mTOTAL_MONTO = mTOTAL_MONTO + mMONTO";
_mtotal_monto = BA.NumberToString((double)(Double.parseDouble(_mtotal_monto))+(double)(Double.parseDouble(_mmonto)));
 }
;
RDebugUtils.currentLine=1114153;
 //BA.debugLineNum = 1114153;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 };
RDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="Return mTOTAL_MONTO";
if (true) return _mtotal_monto;
RDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="End Sub";
return "";
}
public String  _calcular_energia_total_consumida(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "calcular_energia_total_consumida", false))
	 {return ((String) Debug.delegate(ba, "calcular_energia_total_consumida", null));}
String _mtotal_energia = "";
String _menergia = "";
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Private Sub Calcular_Energia_Total_Consumida() As";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="Dim mTOTAL_ENERGIA, mENERGIA As String";
_mtotal_energia = "";
_menergia = "";
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="mTOTAL_ENERGIA = 0";
_mtotal_energia = BA.NumberToString(0);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_energia";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_energia WHERE see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=1179657;
 //BA.debugLineNum = 1179657;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=1179659;
 //BA.debugLineNum = 1179659;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_ene\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_ene");
 break; }
case 1: {
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_feb\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_feb");
 break; }
case 2: {
RDebugUtils.currentLine=1179663;
 //BA.debugLineNum = 1179663;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_mar\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_mar");
 break; }
case 3: {
RDebugUtils.currentLine=1179665;
 //BA.debugLineNum = 1179665;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_abr\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_abr");
 break; }
case 4: {
RDebugUtils.currentLine=1179667;
 //BA.debugLineNum = 1179667;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_may\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_may");
 break; }
case 5: {
RDebugUtils.currentLine=1179669;
 //BA.debugLineNum = 1179669;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_jun\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_jun");
 break; }
case 6: {
RDebugUtils.currentLine=1179671;
 //BA.debugLineNum = 1179671;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_jul\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_jul");
 break; }
case 7: {
RDebugUtils.currentLine=1179673;
 //BA.debugLineNum = 1179673;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_ago\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_ago");
 break; }
case 8: {
RDebugUtils.currentLine=1179675;
 //BA.debugLineNum = 1179675;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_sep\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_sep");
 break; }
case 9: {
RDebugUtils.currentLine=1179677;
 //BA.debugLineNum = 1179677;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_oct\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_oct");
 break; }
case 10: {
RDebugUtils.currentLine=1179679;
 //BA.debugLineNum = 1179679;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_nov\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_nov");
 break; }
case 11: {
RDebugUtils.currentLine=1179681;
 //BA.debugLineNum = 1179681;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_dic\")";
_menergia = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_dic");
 break; }
}
;
RDebugUtils.currentLine=1179683;
 //BA.debugLineNum = 1179683;BA.debugLine="If mENERGIA = \"\" Then";
if ((_menergia).equals("")) { 
RDebugUtils.currentLine=1179684;
 //BA.debugLineNum = 1179684;BA.debugLine="mENERGIA = \"0\"";
_menergia = "0";
 };
RDebugUtils.currentLine=1179686;
 //BA.debugLineNum = 1179686;BA.debugLine="mTOTAL_ENERGIA = mTOTAL_ENERGIA + mENERGIA";
_mtotal_energia = BA.NumberToString((double)(Double.parseDouble(_mtotal_energia))+(double)(Double.parseDouble(_menergia)));
 }
;
RDebugUtils.currentLine=1179688;
 //BA.debugLineNum = 1179688;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 };
RDebugUtils.currentLine=1179690;
 //BA.debugLineNum = 1179690;BA.debugLine="Return mTOTAL_ENERGIA";
if (true) return _mtotal_energia;
RDebugUtils.currentLine=1179691;
 //BA.debugLineNum = 1179691;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor_2(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "conectar_servidor_2", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor_2", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="public Sub Conectar_Servidor_2()";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="mSQL2.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Driv";
__ref._msql2 /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="End Sub";
return "";
}
public String  _b_calcular_click(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "b_calcular_click", false))
	 {return ((String) Debug.delegate(ba, "b_calcular_click", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Private Sub B_Calcular_Click";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="L_Estado_1.Visible = False";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="L_Estado_2.Visible = False";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="B_Guardar.Visible = False";
__ref._b_guardar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="TBL_Calcular.ClearRows";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (3),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (4),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (5),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (6),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="L_Estado_1.Visible = True";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="L_Estado_2.Visible = True";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="L_Estado_1.Text = \"Procesando la informacion...\"";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence("Procesando la informacion..."));
RDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="L_Estado_2.Text = \"\"";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="If Actualizar Then";
if (__ref._actualizar /*boolean*/ (null)) { 
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="L_Estado_1.Visible = False";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="L_Estado_2.Visible = False";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="B_Guardar.visible = True";
__ref._b_guardar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.True);
 };
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="End Sub";
return "";
}
public String  _b_guardar_click(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "b_guardar_click", false))
	 {return ((String) Debug.delegate(ba, "b_guardar_click", null));}
int _x = 0;
String _mclave = "";
String _mvalor = "";
String _mcumple = "";
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Private Sub B_Guardar_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim mCLAVE, mVALOR, mCUMPLE As String";
_mclave = "";
_mvalor = "";
_mcumple = "";
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="For x = 0 To TBL_Calcular.RowCount -1";
{
final int step5 = 1;
final int limit5 = (int) (__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getrowcount()-1);
_x = (int) (0) ;
for (;_x <= limit5 ;_x = _x + step5 ) {
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="mCLAVE = TBL_Calcular.GetCellValue(x, 0)";
_mclave = BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=1245192;
 //BA.debugLineNum = 1245192;BA.debugLine="mVALOR = mFORMATO(TBL_Calcular.GetCellValue(x,";
_mvalor = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (2))),"T"));
RDebugUtils.currentLine=1245193;
 //BA.debugLineNum = 1245193;BA.debugLine="mCUMPLE = mFORMATO(TBL_Calcular.GetCellValue(x,";
_mcumple = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_calcular /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (4))),"T"));
RDebugUtils.currentLine=1245194;
 //BA.debugLineNum = 1245194;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=1245196;
 //BA.debugLineNum = 1245196;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_ene = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245197;
 //BA.debugLineNum = 1245197;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_ene = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 1: {
RDebugUtils.currentLine=1245199;
 //BA.debugLineNum = 1245199;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_feb = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245200;
 //BA.debugLineNum = 1245200;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_feb = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 2: {
RDebugUtils.currentLine=1245202;
 //BA.debugLineNum = 1245202;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_mar = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245203;
 //BA.debugLineNum = 1245203;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_mar = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 3: {
RDebugUtils.currentLine=1245205;
 //BA.debugLineNum = 1245205;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_abr = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245206;
 //BA.debugLineNum = 1245206;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_abr = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 4: {
RDebugUtils.currentLine=1245208;
 //BA.debugLineNum = 1245208;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_may = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245209;
 //BA.debugLineNum = 1245209;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_may = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 5: {
RDebugUtils.currentLine=1245211;
 //BA.debugLineNum = 1245211;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_jun = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245212;
 //BA.debugLineNum = 1245212;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_jun = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 6: {
RDebugUtils.currentLine=1245214;
 //BA.debugLineNum = 1245214;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_jul = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245215;
 //BA.debugLineNum = 1245215;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_jul = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 7: {
RDebugUtils.currentLine=1245217;
 //BA.debugLineNum = 1245217;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_ago = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245218;
 //BA.debugLineNum = 1245218;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_ago = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 8: {
RDebugUtils.currentLine=1245220;
 //BA.debugLineNum = 1245220;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_sep = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245221;
 //BA.debugLineNum = 1245221;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_sep = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 9: {
RDebugUtils.currentLine=1245223;
 //BA.debugLineNum = 1245223;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_oct = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245224;
 //BA.debugLineNum = 1245224;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_oct = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 10: {
RDebugUtils.currentLine=1245226;
 //BA.debugLineNum = 1245226;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_nov = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245227;
 //BA.debugLineNum = 1245227;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_nov = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 11: {
RDebugUtils.currentLine=1245229;
 //BA.debugLineNum = 1245229;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_dic = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=1245230;
 //BA.debugLineNum = 1245230;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_indicadores SET ind_c_dic = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
}
;
RDebugUtils.currentLine=1245232;
 //BA.debugLineNum = 1245232;BA.debugLine="Log(mCLAVE  & \" - \" & mVALOR & \" - \" & mCUMPLE)";
__c.LogImpl("21245232",_mclave+" - "+_mvalor+" - "+_mcumple,0);
 }
};
 };
RDebugUtils.currentLine=1245235;
 //BA.debugLineNum = 1245235;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xcalcular __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Log(\"B4XCalcular\")";
__c.LogImpl("2720898","B4XCalcular",0);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="Root.LoadLayout(\"Calcular\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Calcular",ba);
RDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="L_Estado_1.Visible = False";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=720902;
 //BA.debugLineNum = 720902;BA.debugLine="L_Estado_2.Visible = False";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="B_Guardar.Visible = False";
__ref._b_guardar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="TBL_Calcular.ColsName=Array As String(\"Clave\", \"D";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Clave","Denominación","Valor","Meta","Cumple al","Mínimo","Máximo"});
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="TBL_Calcular.ColsWidth=Array As Int(50dip, 250dip";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (50)),__c.DipToCurrent((int) (250)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80))});
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="TBL_Calcular.ColsType=Array As Int(TBL_Calcular.T";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_calcular /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_calcular /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_calcular /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="TBL_Calcular.ColsAlignment=Array As String(\"CENTE";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"CENTER","LEFT","CENTER","CENTER","CENTER","CENTER","CENTER"});
RDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720910;
 //BA.debugLineNum = 720910;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (3),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (4),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (5),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720914;
 //BA.debugLineNum = 720914;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (6),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="For x = 2021 To 2027";
{
final int step19 = 1;
final int limit19 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit19 ;_x = _x + step19 ) {
RDebugUtils.currentLine=720918;
 //BA.debugLineNum = 720918;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="For x = 1 To 12";
{
final int step22 = 1;
final int limit22 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit22 ;_x = _x + step22 ) {
RDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xcalcular __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Private TBL_Calcular As FlexGrid";
_tbl_calcular = new b4j.example.flexgrid();
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Public mSQL, mSQL2 As SD_SQL";
_msql = new japam.SIE.sd_sql();
_msql2 = new japam.SIE.sd_sql();
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Private TBL_Calcular As FlexGrid";
_tbl_calcular = new b4j.example.flexgrid();
RDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Private L_Estado_1 As Label";
_l_estado_1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Private L_Estado_2 As Label";
_l_estado_2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xcalcular __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xcalcular __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="L_Estado_1.Visible = False";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="L_Estado_2.Visible = False";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="B_Guardar.Visible = False";
__ref._b_guardar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45416453;
 //BA.debugLineNum = 45416453;BA.debugLine="TBL_Calcular.ClearRows";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=45416454;
 //BA.debugLineNum = 45416454;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416455;
 //BA.debugLineNum = 45416455;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416456;
 //BA.debugLineNum = 45416456;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416457;
 //BA.debugLineNum = 45416457;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (3),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416458;
 //BA.debugLineNum = 45416458;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (4),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416459;
 //BA.debugLineNum = 45416459;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (5),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416460;
 //BA.debugLineNum = 45416460;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (6),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45416461;
 //BA.debugLineNum = 45416461;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xcalcular __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcalcular";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="L_Estado_1.Visible = False";
__ref._l_estado_1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45875203;
 //BA.debugLineNum = 45875203;BA.debugLine="L_Estado_2.Visible = False";
__ref._l_estado_2 /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="B_Guardar.Visible = False";
__ref._b_guardar /*anywheresoftware.b4a.objects.ButtonWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="TBL_Calcular.ClearRows";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=45875206;
 //BA.debugLineNum = 45875206;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875207;
 //BA.debugLineNum = 45875207;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875208;
 //BA.debugLineNum = 45875208;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875209;
 //BA.debugLineNum = 45875209;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (3),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875210;
 //BA.debugLineNum = 45875210;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (4),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875211;
 //BA.debugLineNum = 45875211;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (5),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875212;
 //BA.debugLineNum = 45875212;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
__ref._tbl_calcular /*b4j.example.flexgrid*/ ._setcolcustomize((int) (6),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (12)));
RDebugUtils.currentLine=45875213;
 //BA.debugLineNum = 45875213;BA.debugLine="End Sub";
return "";
}
}