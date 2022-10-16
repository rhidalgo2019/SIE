package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xcalcular extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xcalcular", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xcalcular.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public japam.sie.b4xcombobox _cb_anio = null;
public japam.sie.b4xcombobox _cb_mes = null;
public b4j.example.flexgrid _tbl_calcular = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_calcular = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_estado_1 = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_guardar = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public boolean  _actualizar() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
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
 //BA.debugLineNum = 95;BA.debugLine="Public Sub Actualizar() As Boolean";
 //BA.debugLineNum = 96;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 97;BA.debugLine="Dim x, mULT_CALCULAR As Int";
_x = 0;
_mult_calcular = 0;
 //BA.debugLineNum = 98;BA.debugLine="Dim mVALOR, mTIPO As String";
_mvalor = "";
_mtipo = "";
 //BA.debugLineNum = 99;BA.debugLine="Dim mVAL_CLAVES(50), mVAL_DESCRIPCIONES(50), mVAL";
_mval_claves = new String[(int) (50)];
java.util.Arrays.fill(_mval_claves,"");
_mval_descripciones = new String[(int) (50)];
java.util.Arrays.fill(_mval_descripciones,"");
_mval_valores = new String[(int) (50)];
java.util.Arrays.fill(_mval_valores,"");
 //BA.debugLineNum = 100;BA.debugLine="Dim mIND_CLAVES(50), mIND_DESCRIPCIONES(50), mIND";
_mind_claves = new String[(int) (50)];
java.util.Arrays.fill(_mind_claves,"");
_mind_descripciones = new String[(int) (50)];
java.util.Arrays.fill(_mind_descripciones,"");
_mind_valores = new String[(int) (50)];
java.util.Arrays.fill(_mind_valores,"");
 //BA.debugLineNum = 101;BA.debugLine="Dim mIND_CUMPLE, mIND_MINIMO, mIND_MAXIMO, mIND_M";
_mind_cumple = "";
_mind_minimo = "";
_mind_maximo = "";
_mind_meta = "";
 //BA.debugLineNum = 102;BA.debugLine="Dim mVAL_CLAVE, mVAL_VALOR As String";
_mval_clave = "";
_mval_valor = "";
 //BA.debugLineNum = 103;BA.debugLine="Dim mFAC, mCOB, mVE, mVF, mTC, mTSC, mCEE, mCOP,";
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
 //BA.debugLineNum = 104;BA.debugLine="Dim mTMP_STR_1, mTMP_STR_2, mTMP_STR_3 As String";
_mtmp_str_1 = "";
_mtmp_str_2 = "";
_mtmp_str_3 = "";
 //BA.debugLineNum = 105;BA.debugLine="Dim mEC, mEF, mEG, mDH, mCS, mIEE, mIE, mIL, mRTM";
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
 //BA.debugLineNum = 106;BA.debugLine="Dim mTMP_FLOAT As Float";
_mtmp_float = 0f;
 //BA.debugLineNum = 107;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
 //BA.debugLineNum = 108;BA.debugLine="Dim mTOTAL_VALORES As Int";
_mtotal_valores = 0;
 //BA.debugLineNum = 109;BA.debugLine="Dim mRET As Boolean";
_mret = false;
 //BA.debugLineNum = 110;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
 //BA.debugLineNum = 112;BA.debugLine="mFAC = 0.0";
_mfac = (float) (0.0);
 //BA.debugLineNum = 113;BA.debugLine="mCOB = 0.0";
_mcob = (float) (0.0);
 //BA.debugLineNum = 114;BA.debugLine="mVE = 0.0";
_mve = (float) (0.0);
 //BA.debugLineNum = 115;BA.debugLine="mVF = 0.0";
_mvf = (float) (0.0);
 //BA.debugLineNum = 116;BA.debugLine="mTC = 0.0";
_mtc = (float) (0.0);
 //BA.debugLineNum = 117;BA.debugLine="mTSC = 0.0";
_mtsc = (float) (0.0);
 //BA.debugLineNum = 118;BA.debugLine="mCEE = 0.0";
_mcee = (float) (0.0);
 //BA.debugLineNum = 119;BA.debugLine="mCOP = 0.0";
_mcop = (float) (0.0);
 //BA.debugLineNum = 120;BA.debugLine="mETC = 0.0";
_metc = (float) (0.0);
 //BA.debugLineNum = 121;BA.debugLine="mTE = 0.0";
_mte = (float) (0.0);
 //BA.debugLineNum = 122;BA.debugLine="mGT = 0.0";
_mgt = (float) (0.0);
 //BA.debugLineNum = 123;BA.debugLine="mTR = 0.0";
_mtr = (float) (0.0);
 //BA.debugLineNum = 124;BA.debugLine="mPA = 0.0";
_mpa = (float) (0.0);
 //BA.debugLineNum = 125;BA.debugLine="mEC = \"0\"";
_mec = "0";
 //BA.debugLineNum = 126;BA.debugLine="mEF = \"0\"";
_mef = "0";
 //BA.debugLineNum = 127;BA.debugLine="mEG = \"0\"";
_meg = "0";
 //BA.debugLineNum = 128;BA.debugLine="mDH = \"0\"";
_mdh = "0";
 //BA.debugLineNum = 129;BA.debugLine="mCS = \"0\"";
_mcs = "0";
 //BA.debugLineNum = 130;BA.debugLine="mIEE = \"0\"";
_miee = "0";
 //BA.debugLineNum = 131;BA.debugLine="mIE = \"0\"";
_mie = "0";
 //BA.debugLineNum = 132;BA.debugLine="mIL = \"0\"";
_mil = "0";
 //BA.debugLineNum = 133;BA.debugLine="mRTM = \"0\"";
_mrtm = "0";
 //BA.debugLineNum = 134;BA.debugLine="mVBF = \"0\"";
_mvbf = "0";
 //BA.debugLineNum = 135;BA.debugLine="mCP = \"0\"";
_mcp = "0";
 //BA.debugLineNum = 136;BA.debugLine="mCPC = \"0\"";
_mcpc = "0";
 //BA.debugLineNum = 137;BA.debugLine="mRET = True";
_mret = __c.True;
 //BA.debugLineNum = 139;BA.debugLine="mTOTAL_VALORES = -1";
_mtotal_valores = (int) (-1);
 //BA.debugLineNum = 140;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 142;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 143;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_val";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_valores WHERE val_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 144;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 145;BA.debugLine="mTOTAL_VALORES = mTOTAL_VALORES + 1";
_mtotal_valores = (int) (_mtotal_valores+1);
 //BA.debugLineNum = 146;BA.debugLine="mVAL_CLAVE = mRS.GetString(\"val_clave\")";
_mval_clave = _mrs.GetString("val_clave");
 //BA.debugLineNum = 147;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 149;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_ene\")";
_mval_valor = _mrs.GetString("val_ene");
 break; }
case 1: {
 //BA.debugLineNum = 151;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_feb\")";
_mval_valor = _mrs.GetString("val_feb");
 break; }
case 2: {
 //BA.debugLineNum = 153;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_mar\")";
_mval_valor = _mrs.GetString("val_mar");
 break; }
case 3: {
 //BA.debugLineNum = 155;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_abr\")";
_mval_valor = _mrs.GetString("val_abr");
 break; }
case 4: {
 //BA.debugLineNum = 157;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_may\")";
_mval_valor = _mrs.GetString("val_may");
 break; }
case 5: {
 //BA.debugLineNum = 159;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_jun\")";
_mval_valor = _mrs.GetString("val_jun");
 break; }
case 6: {
 //BA.debugLineNum = 161;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_jul\")";
_mval_valor = _mrs.GetString("val_jul");
 break; }
case 7: {
 //BA.debugLineNum = 163;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_ago\")";
_mval_valor = _mrs.GetString("val_ago");
 break; }
case 8: {
 //BA.debugLineNum = 165;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_sep\")";
_mval_valor = _mrs.GetString("val_sep");
 break; }
case 9: {
 //BA.debugLineNum = 167;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_oct\")";
_mval_valor = _mrs.GetString("val_oct");
 break; }
case 10: {
 //BA.debugLineNum = 169;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_nov\")";
_mval_valor = _mrs.GetString("val_nov");
 break; }
case 11: {
 //BA.debugLineNum = 171;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_dic\")";
_mval_valor = _mrs.GetString("val_dic");
 break; }
}
;
 //BA.debugLineNum = 173;BA.debugLine="If mVAL_CLAVE = \"TC\" Then";
if ((_mval_clave).equals("TC")) { 
 //BA.debugLineNum = 174;BA.debugLine="mTC = mVAL_VALOR.As(Float)";
_mtc = ((float)(Double.parseDouble(_mval_valor)));
 };
 //BA.debugLineNum = 176;BA.debugLine="If mVAL_VALOR = \"0.00\" Or mVAL_VALOR = \"0\" Or m";
if ((_mval_valor).equals("0.00") || (_mval_valor).equals("0") || (_mval_valor).equals("0.0") || (_mval_clave).equals("VE")) { 
 //BA.debugLineNum = 177;BA.debugLine="If mVAL_CLAVE = \"VE\" Then";
if ((_mval_clave).equals("VE")) { 
 //BA.debugLineNum = 178;BA.debugLine="mVE = Calcular_Volumen_Explotado";
_mve = (float)(Double.parseDouble(_calcular_volumen_explotado()));
 //BA.debugLineNum = 179;BA.debugLine="mVAL_VALOR = Main.mFORMATO(mVE, \"T\")";
_mval_valor = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mve),"T"));
 };
 //BA.debugLineNum = 181;BA.debugLine="If mVAL_CLAVE = \"TSC\" Then";
if ((_mval_clave).equals("TSC")) { 
 //BA.debugLineNum = 182;BA.debugLine="mTSC = mTC * 0.97";
_mtsc = (float) (_mtc*0.97);
 //BA.debugLineNum = 183;BA.debugLine="mVAL_VALOR = Main.mFORMATO(mTSC, \"T\")";
_mval_valor = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mtsc),"T"));
 };
 //BA.debugLineNum = 185;BA.debugLine="If mVAL_CLAVE = \"PA\" Then";
if ((_mval_clave).equals("PA")) { 
 //BA.debugLineNum = 186;BA.debugLine="mPA = mTC * 5";
_mpa = (float) (_mtc*5);
 //BA.debugLineNum = 187;BA.debugLine="mVAL_VALOR = Main.mFORMATO(mPA, \"T\")";
_mval_valor = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mpa),"T"));
 };
 //BA.debugLineNum = 189;BA.debugLine="If mVAL_CLAVE = \"CEE\" Then";
if ((_mval_clave).equals("CEE")) { 
 //BA.debugLineNum = 190;BA.debugLine="mCEE = Calcular_Costo_Energia_Electrica";
_mcee = (float)(Double.parseDouble(_calcular_costo_energia_electrica()));
 //BA.debugLineNum = 191;BA.debugLine="mVAL_VALOR = Main.mFORMATO(mCEE, \"T\")";
_mval_valor = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mcee),"T"));
 };
 //BA.debugLineNum = 193;BA.debugLine="If mVAL_CLAVE = \"ETC\" Then";
if ((_mval_clave).equals("ETC")) { 
 //BA.debugLineNum = 194;BA.debugLine="mCEE = Calcular_Energia_Total_Consumida";
_mcee = (float)(Double.parseDouble(_calcular_energia_total_consumida()));
 //BA.debugLineNum = 195;BA.debugLine="mVAL_VALOR = Main.mFORMATO(mCEE, \"T\")";
_mval_valor = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mcee),"T"));
 };
 //BA.debugLineNum = 197;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 199;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_ene =";
_mcadena = "UPDATE sie_valores SET val_ene = '";
 break; }
case 1: {
 //BA.debugLineNum = 201;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_feb =";
_mcadena = "UPDATE sie_valores SET val_feb = '";
 break; }
case 2: {
 //BA.debugLineNum = 203;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_mar =";
_mcadena = "UPDATE sie_valores SET val_mar = '";
 break; }
case 3: {
 //BA.debugLineNum = 205;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_abr =";
_mcadena = "UPDATE sie_valores SET val_abr = '";
 break; }
case 4: {
 //BA.debugLineNum = 207;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_may =";
_mcadena = "UPDATE sie_valores SET val_may = '";
 break; }
case 5: {
 //BA.debugLineNum = 209;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_jun =";
_mcadena = "UPDATE sie_valores SET val_jun = '";
 break; }
case 6: {
 //BA.debugLineNum = 211;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_jul =";
_mcadena = "UPDATE sie_valores SET val_jul = '";
 break; }
case 7: {
 //BA.debugLineNum = 213;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_ago =";
_mcadena = "UPDATE sie_valores SET val_ago = '";
 break; }
case 8: {
 //BA.debugLineNum = 215;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_sep =";
_mcadena = "UPDATE sie_valores SET val_sep = '";
 break; }
case 9: {
 //BA.debugLineNum = 217;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_oct =";
_mcadena = "UPDATE sie_valores SET val_oct = '";
 break; }
case 10: {
 //BA.debugLineNum = 219;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_nov =";
_mcadena = "UPDATE sie_valores SET val_nov = '";
 break; }
case 11: {
 //BA.debugLineNum = 221;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_dic =";
_mcadena = "UPDATE sie_valores SET val_dic = '";
 break; }
}
;
 //BA.debugLineNum = 223;BA.debugLine="mCADENA = mCADENA & mVAL_VALOR & \"' WHERE val_";
_mcadena = _mcadena+_mval_valor+"' WHERE val_clave = '"+_mval_clave+"' AND val_anio = "+BA.NumberToString(_main._manio /*int*/ );
 //BA.debugLineNum = 224;BA.debugLine="Main.Conectar_Servidor_2";
_main._conectar_servidor_2 /*String*/ ();
 //BA.debugLineNum = 225;BA.debugLine="Main.mSQL2.ExecNonQuery(mCADENA)";
_main._msql2 /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery(_mcadena);
 //BA.debugLineNum = 226;BA.debugLine="Main.mSQL2.Close";
_main._msql2 /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
 }
;
 //BA.debugLineNum = 229;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 //BA.debugLineNum = 230;BA.debugLine="mRS.Close";
_mrs.Close();
 };
 //BA.debugLineNum = 233;BA.debugLine="x = -1";
_x = (int) (-1);
 //BA.debugLineNum = 234;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 235;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 236;BA.debugLine="mTIPO = \"V\"";
_mtipo = "V";
 //BA.debugLineNum = 237;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_val";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_valores WHERE val_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 238;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 239;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 //BA.debugLineNum = 240;BA.debugLine="mVAL_CLAVES(x) = mRS.GetString(\"val_clave\")";
_mval_claves[_x] = _mrs.GetString("val_clave");
 //BA.debugLineNum = 241;BA.debugLine="mVAL_DESCRIPCIONES(x) = mRS.GetString(\"val_desc";
_mval_descripciones[_x] = _mrs.GetString("val_descripcion");
 //BA.debugLineNum = 242;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 244;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_ene\")";
_mval_valores[_x] = _mrs.GetString("val_ene");
 break; }
case 1: {
 //BA.debugLineNum = 246;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_feb\")";
_mval_valores[_x] = _mrs.GetString("val_feb");
 break; }
case 2: {
 //BA.debugLineNum = 248;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_mar\")";
_mval_valores[_x] = _mrs.GetString("val_mar");
 break; }
case 3: {
 //BA.debugLineNum = 250;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_abr\")";
_mval_valores[_x] = _mrs.GetString("val_abr");
 break; }
case 4: {
 //BA.debugLineNum = 252;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_may\")";
_mval_valores[_x] = _mrs.GetString("val_may");
 break; }
case 5: {
 //BA.debugLineNum = 254;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_jun\")";
_mval_valores[_x] = _mrs.GetString("val_jun");
 break; }
case 6: {
 //BA.debugLineNum = 256;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_jul\")";
_mval_valores[_x] = _mrs.GetString("val_jul");
 break; }
case 7: {
 //BA.debugLineNum = 258;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_ago\")";
_mval_valores[_x] = _mrs.GetString("val_ago");
 break; }
case 8: {
 //BA.debugLineNum = 260;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_sep\")";
_mval_valores[_x] = _mrs.GetString("val_sep");
 break; }
case 9: {
 //BA.debugLineNum = 262;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_oct\")";
_mval_valores[_x] = _mrs.GetString("val_oct");
 break; }
case 10: {
 //BA.debugLineNum = 264;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_nov\")";
_mval_valores[_x] = _mrs.GetString("val_nov");
 break; }
case 11: {
 //BA.debugLineNum = 266;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_dic\")";
_mval_valores[_x] = _mrs.GetString("val_dic");
 break; }
}
;
 //BA.debugLineNum = 268;BA.debugLine="Select Case mVAL_CLAVES(x)";
switch (BA.switchObjectToInt(_mval_claves[_x],"FAC","COB","VE","VF","TC","TSC","CEE","COP","ETC","TE","GT","TR","PA")) {
case 0: {
 //BA.debugLineNum = 270;BA.debugLine="mFAC = mVAL_VALORES(x).As(Float)";
_mfac = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 1: {
 //BA.debugLineNum = 272;BA.debugLine="mCOB = mVAL_VALORES(x).As(Float)";
_mcob = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 2: {
 //BA.debugLineNum = 274;BA.debugLine="mVE = mVAL_VALORES(x).As(Float)";
_mve = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 3: {
 //BA.debugLineNum = 276;BA.debugLine="mVF = mVAL_VALORES(x).As(Float)";
_mvf = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 4: {
 //BA.debugLineNum = 278;BA.debugLine="mTC = mVAL_VALORES(x).As(Float)";
_mtc = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 5: {
 //BA.debugLineNum = 280;BA.debugLine="mTSC = mVAL_VALORES(x).As(Float)";
_mtsc = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 6: {
 //BA.debugLineNum = 282;BA.debugLine="mCEE = mVAL_VALORES(x).As(Float)";
_mcee = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 7: {
 //BA.debugLineNum = 284;BA.debugLine="mCOP = mVAL_VALORES(x).As(Float)";
_mcop = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 8: {
 //BA.debugLineNum = 286;BA.debugLine="mETC = mVAL_VALORES(x).As(Float)";
_metc = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 9: {
 //BA.debugLineNum = 288;BA.debugLine="mTE = mVAL_VALORES(x).As(Float)";
_mte = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 10: {
 //BA.debugLineNum = 290;BA.debugLine="mGT = mVAL_VALORES(x).As(Float)";
_mgt = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 11: {
 //BA.debugLineNum = 292;BA.debugLine="mTR = mVAL_VALORES(x).As(Float)";
_mtr = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
case 12: {
 //BA.debugLineNum = 294;BA.debugLine="mPA = mVAL_VALORES(x).As(Float)";
_mpa = ((float)(Double.parseDouble(_mval_valores[_x])));
 break; }
}
;
 //BA.debugLineNum = 296;BA.debugLine="TBL_Calcular.AddRow(Array As Object(mVAL_CLAVES";
_tbl_calcular._addrow(new Object[]{(Object)(_mval_claves[_x]),(Object)(_mval_descripciones[_x]),_main._mformato /*Object*/ (_mval_valores[_x],"N"),(Object)(_mtipo)},__c.True);
 }
;
 //BA.debugLineNum = 298;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 //BA.debugLineNum = 299;BA.debugLine="mRS.Close";
_mrs.Close();
 };
 //BA.debugLineNum = 301;BA.debugLine="mULT_CALCULAR = x";
_mult_calcular = _x;
 //BA.debugLineNum = 303;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 304;BA.debugLine="For x = 0 To mULT_CALCULAR";
{
final int step204 = 1;
final int limit204 = _mult_calcular;
_x = (int) (0) ;
for (;_x <= limit204 ;_x = _x + step204 ) {
 //BA.debugLineNum = 305;BA.debugLine="mVALOR= TBL_Calcular.GetCellValue(x, 2)";
_mvalor = BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (2)));
 //BA.debugLineNum = 306;BA.debugLine="mTIPO = TBL_Calcular.GetCellValue(x, 3)";
_mtipo = BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (3)));
 //BA.debugLineNum = 307;BA.debugLine="If mTIPO = \"V\" Then";
if ((_mtipo).equals("V")) { 
 //BA.debugLineNum = 308;BA.debugLine="If mVALOR = \"0.00\" Or mVALOR = \"\" Or mVALOR = \"";
if ((_mvalor).equals("0.00") || (_mvalor).equals("") || (_mvalor).equals("0")) { 
 //BA.debugLineNum = 309;BA.debugLine="mRET = False";
_mret = __c.False;
 //BA.debugLineNum = 310;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
 //BA.debugLineNum = 311;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
_tbl_calcular._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (255),(int) (255),(int) (0)),_xui.CreateDefaultFont((float) (12)));
 };
 };
 }
};
 //BA.debugLineNum = 315;BA.debugLine="If Not(mCOMPLETOS) Then";
if (__c.Not(_mcompletos)) { 
 //BA.debugLineNum = 316;BA.debugLine="L_Estado_1.Visible = True";
_l_estado_1.setVisible(__c.True);
 //BA.debugLineNum = 317;BA.debugLine="L_Estado_1.Text = \"Falta información para poder";
_l_estado_1.setText("Falta información para poder determinar los Indicadores de Efectividad");
 };
 //BA.debugLineNum = 319;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
 //BA.debugLineNum = 320;BA.debugLine="mIND_CUMPLE = \"\"";
_mind_cumple = "";
 //BA.debugLineNum = 321;BA.debugLine="x = mULT_CALCULAR";
_x = _mult_calcular;
 //BA.debugLineNum = 323;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 324;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 325;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_in";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 326;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 327;BA.debugLine="x = x + 1";
_x = (int) (_x+1);
 //BA.debugLineNum = 328;BA.debugLine="mIND_CLAVES(x) = mRS.GetString(\"ind_clave\")";
_mind_claves[_x] = _mrs.GetString("ind_clave");
 //BA.debugLineNum = 329;BA.debugLine="mIND_DESCRIPCIONES(x) = mRS.GetString(\"ind_des";
_mind_descripciones[_x] = _mrs.GetString("ind_descripcion");
 //BA.debugLineNum = 330;BA.debugLine="mIND_MINIMO = mRS.GetString(\"ind_minimo\")";
_mind_minimo = _mrs.GetString("ind_minimo");
 //BA.debugLineNum = 331;BA.debugLine="mIND_MAXIMO = mRS.GetString(\"ind_maximo\")";
_mind_maximo = _mrs.GetString("ind_maximo");
 //BA.debugLineNum = 332;BA.debugLine="mIND_META = mRS.GetString(\"ind_meta\")";
_mind_meta = _mrs.GetString("ind_meta");
 //BA.debugLineNum = 333;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 335;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_ene\")";
_mind_valores[_x] = _mrs.GetString("ind_ene");
 break; }
case 1: {
 //BA.debugLineNum = 337;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_feb\")";
_mind_valores[_x] = _mrs.GetString("ind_feb");
 break; }
case 2: {
 //BA.debugLineNum = 339;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_mar\")";
_mind_valores[_x] = _mrs.GetString("ind_mar");
 break; }
case 3: {
 //BA.debugLineNum = 341;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_abr\")";
_mind_valores[_x] = _mrs.GetString("ind_abr");
 break; }
case 4: {
 //BA.debugLineNum = 343;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_may\")";
_mind_valores[_x] = _mrs.GetString("ind_may");
 break; }
case 5: {
 //BA.debugLineNum = 345;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_jun\")";
_mind_valores[_x] = _mrs.GetString("ind_jun");
 break; }
case 6: {
 //BA.debugLineNum = 347;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_jul\")";
_mind_valores[_x] = _mrs.GetString("ind_jul");
 break; }
case 7: {
 //BA.debugLineNum = 349;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_ago\")";
_mind_valores[_x] = _mrs.GetString("ind_ago");
 break; }
case 8: {
 //BA.debugLineNum = 351;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_sep\")";
_mind_valores[_x] = _mrs.GetString("ind_sep");
 break; }
case 9: {
 //BA.debugLineNum = 353;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_oct\")";
_mind_valores[_x] = _mrs.GetString("ind_oct");
 break; }
case 10: {
 //BA.debugLineNum = 355;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_nov\")";
_mind_valores[_x] = _mrs.GetString("ind_nov");
 break; }
case 11: {
 //BA.debugLineNum = 357;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_dic\")";
_mind_valores[_x] = _mrs.GetString("ind_dic");
 break; }
}
;
 //BA.debugLineNum = 360;BA.debugLine="TBL_Calcular.AddRow(Array As Object(mIND_CLAVE";
_tbl_calcular._addrow(new Object[]{(Object)(_mind_claves[_x]),(Object)(_mind_descripciones[_x]),(Object)(_mind_valores[_x]),(Object)(_mind_meta),(Object)(_mind_cumple),(Object)(_mind_minimo),(Object)(_mind_maximo)},__c.True);
 }
;
 //BA.debugLineNum = 362;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 //BA.debugLineNum = 363;BA.debugLine="mRS.Close";
_mrs.Close();
 };
 //BA.debugLineNum = 365;BA.debugLine="mULT_CALCULAR = x";
_mult_calcular = _x;
 //BA.debugLineNum = 367;BA.debugLine="For x = 0 To mULT_CALCULAR";
{
final int step264 = 1;
final int limit264 = _mult_calcular;
_x = (int) (0) ;
for (;_x <= limit264 ;_x = _x + step264 ) {
 //BA.debugLineNum = 369;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"ECOB\" The";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("ECOB"))) { 
 //BA.debugLineNum = 370;BA.debugLine="If mFAC <> 0 Then";
if (_mfac!=0) { 
 //BA.debugLineNum = 371;BA.debugLine="mTMP_FLOAT = (mCOB / mFAC) * 100";
_mtmp_float = (float) ((_mcob/(double)_mfac)*100);
 //BA.debugLineNum = 372;BA.debugLine="mEC = Main.mFORMATO(mTMP_FLOAT.As(String), \"P";
_mec = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 373;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEC)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mec));
 }else {
 //BA.debugLineNum = 375;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, \"Falta FACTUR";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)("Falta FACTURADO ($)"));
 };
 };
 //BA.debugLineNum = 379;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EF\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("EF"))) { 
 //BA.debugLineNum = 380;BA.debugLine="If mVE <> 0 Then";
if (_mve!=0) { 
 //BA.debugLineNum = 381;BA.debugLine="mTMP_FLOAT = (mVF / mVE) * 100";
_mtmp_float = (float) ((_mvf/(double)_mve)*100);
 //BA.debugLineNum = 382;BA.debugLine="mEF = Main.mFORMATO(mTMP_FLOAT.As(String), \"P";
_mef = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 383;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEF)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mef));
 }else {
 //BA.debugLineNum = 385;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, \"Falta VOLUME";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)("Falta VOLUMEN EXPLOTADO (m3)"));
 };
 };
 //BA.debugLineNum = 389;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EG\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("EG"))) { 
 //BA.debugLineNum = 390;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mEC, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (_mec,"T"));
 //BA.debugLineNum = 391;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mEF, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (_mef,"T"));
 //BA.debugLineNum = 392;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 * mTMP_STR_2) / 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))*(double)(Double.parseDouble(_mtmp_str_2)))/(double)100);
 //BA.debugLineNum = 393;BA.debugLine="mEG = Main.mFORMATO(mTMP_FLOAT.As(String), \"P\"";
_meg = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 394;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEG)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_meg));
 };
 //BA.debugLineNum = 397;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"DH\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("DH"))) { 
 //BA.debugLineNum = 398;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mVE, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mve),"T"));
 //BA.debugLineNum = 399;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mPA, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mpa),"T"));
 //BA.debugLineNum = 400;BA.debugLine="mTMP_FLOAT = ((mTMP_STR_1 * 1000) / mTMP_STR_2";
_mtmp_float = (float) ((((double)(Double.parseDouble(_mtmp_str_1))*1000)/(double)(double)(Double.parseDouble(_mtmp_str_2)))/(double)30);
 //BA.debugLineNum = 401;BA.debugLine="mDH = Main.mFORMATO(mTMP_FLOAT.As(String), \"N\"";
_mdh = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"N"));
 //BA.debugLineNum = 402;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mDH)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mdh));
 };
 //BA.debugLineNum = 405;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CS\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("CS"))) { 
 //BA.debugLineNum = 406;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mTSC, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mtsc),"T"));
 //BA.debugLineNum = 407;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mTC, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mtc),"T"));
 //BA.debugLineNum = 408;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
 //BA.debugLineNum = 409;BA.debugLine="mCS = Main.mFORMATO(mTMP_FLOAT.As(String), \"P\"";
_mcs = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 410;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCS)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mcs));
 };
 //BA.debugLineNum = 413;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IEE\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("IEE"))) { 
 //BA.debugLineNum = 414;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mCEE, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mcee),"T"));
 //BA.debugLineNum = 415;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mCOP, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mcop),"T"));
 //BA.debugLineNum = 416;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
 //BA.debugLineNum = 417;BA.debugLine="mIEE = Main.mFORMATO(mTMP_FLOAT.As(String), \"P";
_miee = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 418;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIEE)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_miee));
 };
 //BA.debugLineNum = 421;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IE\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("IE"))) { 
 //BA.debugLineNum = 422;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mETC, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_metc),"T"));
 //BA.debugLineNum = 423;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mVE, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mve),"T"));
 //BA.debugLineNum = 424;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
 //BA.debugLineNum = 425;BA.debugLine="mIE = Main.mFORMATO(mTMP_FLOAT.As(String), \"N\"";
_mie = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"N"));
 //BA.debugLineNum = 426;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIE)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mie));
 };
 //BA.debugLineNum = 429;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IL\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("IL"))) { 
 //BA.debugLineNum = 430;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mTE, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mte),"T"));
 //BA.debugLineNum = 431;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mTC, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mtc),"T"));
 //BA.debugLineNum = 432;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / (mTMP_STR_2 / 1000)";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)((double)(Double.parseDouble(_mtmp_str_2))/(double)1000));
 //BA.debugLineNum = 433;BA.debugLine="mIL = Main.mFORMATO(mTMP_FLOAT.As(String), \"N\"";
_mil = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"N"));
 //BA.debugLineNum = 434;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIL)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mil));
 };
 //BA.debugLineNum = 437;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"RTM\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("RTM"))) { 
 //BA.debugLineNum = 438;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mGT, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mgt),"T"));
 //BA.debugLineNum = 439;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mTR, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mtr),"T"));
 //BA.debugLineNum = 440;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
 //BA.debugLineNum = 441;BA.debugLine="mRTM = Main.mFORMATO(mTMP_FLOAT.As(String), \"N";
_mrtm = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"N"));
 //BA.debugLineNum = 442;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mRTM)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mrtm));
 };
 //BA.debugLineNum = 445;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"VBF\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("VBF"))) { 
 //BA.debugLineNum = 446;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mRTM, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (_mrtm,"T"));
 //BA.debugLineNum = 447;BA.debugLine="mTMP_FLOAT = (1 - mTMP_STR_1) * 100";
_mtmp_float = (float) ((1-(double)(Double.parseDouble(_mtmp_str_1)))*100);
 //BA.debugLineNum = 448;BA.debugLine="mVBF = Main.mFORMATO(mTMP_FLOAT.As(String), \"P";
_mvbf = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 449;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mVBF)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mvbf));
 };
 //BA.debugLineNum = 452;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CP\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("CP"))) { 
 //BA.debugLineNum = 453;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mGT, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mgt),"T"));
 //BA.debugLineNum = 454;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mVE, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mve),"T"));
 //BA.debugLineNum = 455;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
 //BA.debugLineNum = 456;BA.debugLine="mCP = Main.mFORMATO(mTMP_FLOAT.As(String), \"N\"";
_mcp = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"N"));
 //BA.debugLineNum = 457;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCP)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mcp));
 };
 //BA.debugLineNum = 460;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CPC\" Then";
if ((_tbl_calcular._getcellvalue(_x,(int) (0))).equals((Object)("CPC"))) { 
 //BA.debugLineNum = 461;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(mVF, \"T\")";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mvf),"T"));
 //BA.debugLineNum = 462;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(mPA, \"T\")";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.NumberToString(_mpa),"T"));
 //BA.debugLineNum = 463;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
_mtmp_float = (float) ((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)));
 //BA.debugLineNum = 464;BA.debugLine="mCPC = Main.mFORMATO(mTMP_FLOAT.As(String), \"N";
_mcpc = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"N"));
 //BA.debugLineNum = 465;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCPC)";
_tbl_calcular._setcellvalue(_x,(int) (2),(Object)(_mcpc));
 };
 }
};
 //BA.debugLineNum = 469;BA.debugLine="For x = 0 To mTOTAL_VALORES";
{
final int step353 = 1;
final int limit353 = _mtotal_valores;
_x = (int) (0) ;
for (;_x <= limit353 ;_x = _x + step353 ) {
 //BA.debugLineNum = 470;BA.debugLine="TBL_Calcular.RemoveRow(0)";
_tbl_calcular._removerow((int) (0));
 }
};
 //BA.debugLineNum = 472;BA.debugLine="For x = 0 To TBL_Calcular.RowCount -1";
{
final int step356 = 1;
final int limit356 = (int) (_tbl_calcular._getrowcount()-1);
_x = (int) (0) ;
for (;_x <= limit356 ;_x = _x + step356 ) {
 //BA.debugLineNum = 473;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(TBL_Calcular.GetCell";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 474;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(TBL_Calcular.GetCell";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (3))),"T"));
 //BA.debugLineNum = 475;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
 //BA.debugLineNum = 476;BA.debugLine="mVALOR = Main.mFORMATO(mTMP_FLOAT.As(String), \"";
_mvalor = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 477;BA.debugLine="TBL_Calcular.SetCellValue(x, 4, mVALOR)";
_tbl_calcular._setcellvalue(_x,(int) (4),(Object)(_mvalor));
 //BA.debugLineNum = 479;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(TBL_Calcular.GetCell";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 480;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(TBL_Calcular.GetCell";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (3))),"T"));
 //BA.debugLineNum = 481;BA.debugLine="mTMP_STR_3 = Main.mFORMATO(TBL_Calcular.GetCell";
_mtmp_str_3 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (5))),"T"));
 //BA.debugLineNum = 482;BA.debugLine="If mTMP_STR_1 < mTMP_STR_3 Then";
if ((double)(Double.parseDouble(_mtmp_str_1))<(double)(Double.parseDouble(_mtmp_str_3))) { 
 //BA.debugLineNum = 483;BA.debugLine="TBL_Calcular.SetRowCustomize(x, xui.Color_RGB(";
_tbl_calcular._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (255),(int) (255),(int) (0)),_xui.CreateDefaultFont((float) (12)));
 };
 //BA.debugLineNum = 485;BA.debugLine="If mTMP_STR_1 > mTMP_STR_3 And mTMP_STR_1 < mTM";
if ((double)(Double.parseDouble(_mtmp_str_1))>(double)(Double.parseDouble(_mtmp_str_3)) && (double)(Double.parseDouble(_mtmp_str_1))<(double)(Double.parseDouble(_mtmp_str_2))) { 
 //BA.debugLineNum = 486;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
_tbl_calcular._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (70),(int) (130),(int) (180)),_xui.CreateDefaultFont((float) (12)));
 };
 //BA.debugLineNum = 488;BA.debugLine="If mTMP_STR_1 >= mTMP_STR_2 Then";
if ((double)(Double.parseDouble(_mtmp_str_1))>=(double)(Double.parseDouble(_mtmp_str_2))) { 
 //BA.debugLineNum = 489;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
_tbl_calcular._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (0),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 };
 }
};
 };
 //BA.debugLineNum = 493;BA.debugLine="Return mRET";
if (true) return _mret;
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return false;
}
public String  _b_calcular_click() throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Private Sub B_Calcular_Click";
 //BA.debugLineNum = 77;BA.debugLine="L_Estado_1.Visible = False";
_l_estado_1.setVisible(__c.False);
 //BA.debugLineNum = 78;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 79;BA.debugLine="TBL_Calcular.ClearRows";
_tbl_calcular._clearrows();
 //BA.debugLineNum = 80;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 81;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 82;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 83;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (3),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 84;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (4),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 85;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (5),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 86;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (6),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 87;BA.debugLine="L_Estado_1.Visible = True";
_l_estado_1.setVisible(__c.True);
 //BA.debugLineNum = 88;BA.debugLine="L_Estado_1.Text = \"Procesando la informacion...\"";
_l_estado_1.setText("Procesando la informacion...");
 //BA.debugLineNum = 89;BA.debugLine="If Actualizar Then";
if (_actualizar()) { 
 //BA.debugLineNum = 90;BA.debugLine="L_Estado_1.Visible = False";
_l_estado_1.setVisible(__c.False);
 //BA.debugLineNum = 91;BA.debugLine="B_Guardar.visible = True";
_b_guardar.setVisible(__c.True);
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _b_guardar_click() throws Exception{
int _x = 0;
String _mclave = "";
String _mvalor = "";
String _mcumple = "";
 //BA.debugLineNum = 635;BA.debugLine="Private Sub B_Guardar_Click";
 //BA.debugLineNum = 636;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 637;BA.debugLine="Dim mCLAVE, mVALOR, mCUMPLE As String";
_mclave = "";
_mvalor = "";
_mcumple = "";
 //BA.debugLineNum = 639;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 641;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 642;BA.debugLine="For x = 0 To TBL_Calcular.RowCount -1";
{
final int step5 = 1;
final int limit5 = (int) (_tbl_calcular._getrowcount()-1);
_x = (int) (0) ;
for (;_x <= limit5 ;_x = _x + step5 ) {
 //BA.debugLineNum = 643;BA.debugLine="mCLAVE = TBL_Calcular.GetCellValue(x, 0)";
_mclave = BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (0)));
 //BA.debugLineNum = 644;BA.debugLine="mVALOR = Main.mFORMATO(TBL_Calcular.GetCellValu";
_mvalor = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 645;BA.debugLine="mCUMPLE = Main.mFORMATO(TBL_Calcular.GetCellVal";
_mcumple = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_calcular._getcellvalue(_x,(int) (4))),"T"));
 //BA.debugLineNum = 646;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 648;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_ene = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 649;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_ene = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 651;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_feb = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 652;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_feb = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 654;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_mar = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 655;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_mar = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 657;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_abr = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 658;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_abr = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 4: {
 //BA.debugLineNum = 660;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_may = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 661;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_may = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 5: {
 //BA.debugLineNum = 663;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_jun = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 664;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_jun = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 6: {
 //BA.debugLineNum = 666;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_jul = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 667;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_jul = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 7: {
 //BA.debugLineNum = 669;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_ago = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 670;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_ago = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 8: {
 //BA.debugLineNum = 672;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_sep = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 673;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_sep = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 9: {
 //BA.debugLineNum = 675;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_oct = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 676;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_oct = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 10: {
 //BA.debugLineNum = 678;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_nov = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 679;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_nov = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 11: {
 //BA.debugLineNum = 681;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_dic = "+_mvalor+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 682;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_indicadore";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_indicadores SET ind_c_dic = "+_mcumple+" WHERE ind_clave = '"+_mclave+"' AND ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
}
;
 //BA.debugLineNum = 684;BA.debugLine="Log(mCLAVE  & \" - \" & mVALOR & \" - \" & mCUMPLE)";
__c.LogImpl("54849713",_mclave+" - "+_mvalor+" - "+_mcumple,0);
 }
};
 };
 //BA.debugLineNum = 687;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click() throws Exception{
 //BA.debugLineNum = 689;BA.debugLine="Private Sub B_Regresar_Click";
 //BA.debugLineNum = 690;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 691;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 }else {
 //BA.debugLineNum = 693;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 };
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _x = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Log(\"B4XCalcular\")";
__c.LogImpl("54325378","B4XCalcular",0);
 //BA.debugLineNum = 23;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"Calcular\")";
_root.LoadLayout("Calcular",ba);
 //BA.debugLineNum = 25;BA.debugLine="L_Estado_1.Visible = False";
_l_estado_1.setVisible(__c.False);
 //BA.debugLineNum = 26;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 27;BA.debugLine="TBL_Calcular.ColsName=Array As String(\"Clave\", \"D";
_tbl_calcular._setcolsname(new String[]{"Clave","Denominación","Valor","Meta","Cumple al","Mínimo","Máximo"});
 //BA.debugLineNum = 28;BA.debugLine="TBL_Calcular.ColsWidth=Array As Int(80dip, 320dip";
_tbl_calcular._setcolswidth(new int[]{__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (320)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80))});
 //BA.debugLineNum = 29;BA.debugLine="TBL_Calcular.ColsType=Array As Int(TBL_Calcular.T";
_tbl_calcular._setcolstype(new int[]{_tbl_calcular._typestring,_tbl_calcular._typestring,_tbl_calcular._typestring});
 //BA.debugLineNum = 30;BA.debugLine="TBL_Calcular.ColsAlignment=Array As String(\"CENTE";
_tbl_calcular._setcolsalignment(new String[]{"CENTER","CENTER","CENTER","CENTER","CENTER","CENTER","CENTER"});
 //BA.debugLineNum = 31;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 32;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 33;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 34;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (3),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 35;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (4),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 36;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (5),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 37;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (6),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 38;BA.debugLine="CB_Anio.cmbBox.Items.Clear";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 39;BA.debugLine="For x = 2021 To 2027";
{
final int step19 = 1;
final int limit19 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit19 ;_x = _x + step19 ) {
 //BA.debugLineNum = 40;BA.debugLine="CB_Anio.cmbBox.Items.Add(x)";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 42;BA.debugLine="CB_Mes.cmbBox.Items.Clear";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 43;BA.debugLine="For x = 1 To 12";
{
final int step23 = 1;
final int limit23 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
 //BA.debugLineNum = 44;BA.debugLine="CB_Mes.cmbBox.Items.Add(x)";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _calcular_costo_energia_electrica() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
String _mtotal_monto = "";
String _mmonto = "";
 //BA.debugLineNum = 542;BA.debugLine="Private Sub Calcular_Costo_Energia_Electrica() As";
 //BA.debugLineNum = 543;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 544;BA.debugLine="Dim mTOTAL_MONTO, mMONTO As String";
_mtotal_monto = "";
_mmonto = "";
 //BA.debugLineNum = 546;BA.debugLine="mTOTAL_MONTO = 0";
_mtotal_monto = BA.NumberToString(0);
 //BA.debugLineNum = 547;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 549;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 550;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ene";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_energia WHERE see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 551;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 552;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 554;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_ene\")";
_mmonto = _mrs.GetString("see_mon_ene");
 break; }
case 1: {
 //BA.debugLineNum = 556;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_feb\")";
_mmonto = _mrs.GetString("see_mon_feb");
 break; }
case 2: {
 //BA.debugLineNum = 558;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_mar\")";
_mmonto = _mrs.GetString("see_mon_mar");
 break; }
case 3: {
 //BA.debugLineNum = 560;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_abr\")";
_mmonto = _mrs.GetString("see_mon_abr");
 break; }
case 4: {
 //BA.debugLineNum = 562;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_may\")";
_mmonto = _mrs.GetString("see_mon_may");
 break; }
case 5: {
 //BA.debugLineNum = 564;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_jun\")";
_mmonto = _mrs.GetString("see_mon_jun");
 break; }
case 6: {
 //BA.debugLineNum = 566;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_jul\")";
_mmonto = _mrs.GetString("see_mon_jul");
 break; }
case 7: {
 //BA.debugLineNum = 568;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_ago\")";
_mmonto = _mrs.GetString("see_mon_ago");
 break; }
case 8: {
 //BA.debugLineNum = 570;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_sep\")";
_mmonto = _mrs.GetString("see_mon_sep");
 break; }
case 9: {
 //BA.debugLineNum = 572;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_oct\")";
_mmonto = _mrs.GetString("see_mon_oct");
 break; }
case 10: {
 //BA.debugLineNum = 574;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_nov\")";
_mmonto = _mrs.GetString("see_mon_nov");
 break; }
case 11: {
 //BA.debugLineNum = 576;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_dic\")";
_mmonto = _mrs.GetString("see_mon_dic");
 break; }
}
;
 //BA.debugLineNum = 578;BA.debugLine="If mMONTO = \"\" Then";
if ((_mmonto).equals("")) { 
 //BA.debugLineNum = 579;BA.debugLine="mMONTO = \"0\"";
_mmonto = "0";
 };
 //BA.debugLineNum = 581;BA.debugLine="mTOTAL_MONTO = mTOTAL_MONTO + mMONTO";
_mtotal_monto = BA.NumberToString((double)(Double.parseDouble(_mtotal_monto))+(double)(Double.parseDouble(_mmonto)));
 }
;
 //BA.debugLineNum = 583;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
 //BA.debugLineNum = 585;BA.debugLine="Return mTOTAL_MONTO";
if (true) return _mtotal_monto;
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return "";
}
public String  _calcular_energia_total_consumida() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
String _mtotal_energia = "";
String _menergia = "";
 //BA.debugLineNum = 588;BA.debugLine="Private Sub Calcular_Energia_Total_Consumida() As";
 //BA.debugLineNum = 589;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 590;BA.debugLine="Dim mTOTAL_ENERGIA, mENERGIA As String";
_mtotal_energia = "";
_menergia = "";
 //BA.debugLineNum = 592;BA.debugLine="mTOTAL_ENERGIA = 0";
_mtotal_energia = BA.NumberToString(0);
 //BA.debugLineNum = 593;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 595;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 596;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ene";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_energia WHERE see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 597;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 598;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 600;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_ene\")";
_menergia = _mrs.GetString("see_kwh_ene");
 break; }
case 1: {
 //BA.debugLineNum = 602;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_feb\")";
_menergia = _mrs.GetString("see_kwh_feb");
 break; }
case 2: {
 //BA.debugLineNum = 604;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_mar\")";
_menergia = _mrs.GetString("see_kwh_mar");
 break; }
case 3: {
 //BA.debugLineNum = 606;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_abr\")";
_menergia = _mrs.GetString("see_kwh_abr");
 break; }
case 4: {
 //BA.debugLineNum = 608;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_may\")";
_menergia = _mrs.GetString("see_kwh_may");
 break; }
case 5: {
 //BA.debugLineNum = 610;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_jun\")";
_menergia = _mrs.GetString("see_kwh_jun");
 break; }
case 6: {
 //BA.debugLineNum = 612;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_jul\")";
_menergia = _mrs.GetString("see_kwh_jul");
 break; }
case 7: {
 //BA.debugLineNum = 614;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_ago\")";
_menergia = _mrs.GetString("see_kwh_ago");
 break; }
case 8: {
 //BA.debugLineNum = 616;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_sep\")";
_menergia = _mrs.GetString("see_kwh_sep");
 break; }
case 9: {
 //BA.debugLineNum = 618;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_oct\")";
_menergia = _mrs.GetString("see_kwh_oct");
 break; }
case 10: {
 //BA.debugLineNum = 620;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_nov\")";
_menergia = _mrs.GetString("see_kwh_nov");
 break; }
case 11: {
 //BA.debugLineNum = 622;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_dic\")";
_menergia = _mrs.GetString("see_kwh_dic");
 break; }
}
;
 //BA.debugLineNum = 624;BA.debugLine="If mENERGIA = \"\" Then";
if ((_menergia).equals("")) { 
 //BA.debugLineNum = 625;BA.debugLine="mENERGIA = \"0\"";
_menergia = "0";
 };
 //BA.debugLineNum = 627;BA.debugLine="mTOTAL_ENERGIA = mTOTAL_ENERGIA + mENERGIA";
_mtotal_energia = BA.NumberToString((double)(Double.parseDouble(_mtotal_energia))+(double)(Double.parseDouble(_menergia)));
 }
;
 //BA.debugLineNum = 629;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
 //BA.debugLineNum = 631;BA.debugLine="Return mTOTAL_ENERGIA";
if (true) return _mtotal_energia;
 //BA.debugLineNum = 632;BA.debugLine="End Sub";
return "";
}
public String  _calcular_volumen_explotado() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
String _mtotal_explotado = "";
String _mexplotado = "";
 //BA.debugLineNum = 496;BA.debugLine="Private Sub Calcular_Volumen_Explotado() As String";
 //BA.debugLineNum = 497;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 498;BA.debugLine="Dim mTOTAL_EXPLOTADO, mEXPLOTADO As String";
_mtotal_explotado = "";
_mexplotado = "";
 //BA.debugLineNum = 500;BA.debugLine="mTOTAL_EXPLOTADO = 0";
_mtotal_explotado = BA.NumberToString(0);
 //BA.debugLineNum = 501;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 503;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 504;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ext";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_extraido WHERE ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 505;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 506;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 508;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_ene\")";
_mexplotado = _mrs.GetString("ext_ene");
 break; }
case 1: {
 //BA.debugLineNum = 510;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_feb\")";
_mexplotado = _mrs.GetString("ext_feb");
 break; }
case 2: {
 //BA.debugLineNum = 512;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_mar\")";
_mexplotado = _mrs.GetString("ext_mar");
 break; }
case 3: {
 //BA.debugLineNum = 514;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_abr\")";
_mexplotado = _mrs.GetString("ext_abr");
 break; }
case 4: {
 //BA.debugLineNum = 516;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_may\")";
_mexplotado = _mrs.GetString("ext_may");
 break; }
case 5: {
 //BA.debugLineNum = 518;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_jun\")";
_mexplotado = _mrs.GetString("ext_jun");
 break; }
case 6: {
 //BA.debugLineNum = 520;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_jul\")";
_mexplotado = _mrs.GetString("ext_jul");
 break; }
case 7: {
 //BA.debugLineNum = 522;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_ago\")";
_mexplotado = _mrs.GetString("ext_ago");
 break; }
case 8: {
 //BA.debugLineNum = 524;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_sep\")";
_mexplotado = _mrs.GetString("ext_sep");
 break; }
case 9: {
 //BA.debugLineNum = 526;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_oct\")";
_mexplotado = _mrs.GetString("ext_oct");
 break; }
case 10: {
 //BA.debugLineNum = 528;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_nov\")";
_mexplotado = _mrs.GetString("ext_nov");
 break; }
case 11: {
 //BA.debugLineNum = 530;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_dic\")";
_mexplotado = _mrs.GetString("ext_dic");
 break; }
}
;
 //BA.debugLineNum = 532;BA.debugLine="If mEXPLOTADO = \"\" Then";
if ((_mexplotado).equals("")) { 
 //BA.debugLineNum = 533;BA.debugLine="mEXPLOTADO = \"0\"";
_mexplotado = "0";
 };
 //BA.debugLineNum = 535;BA.debugLine="mTOTAL_EXPLOTADO = mTOTAL_EXPLOTADO + mEXPLOTAD";
_mtotal_explotado = BA.NumberToString((double)(Double.parseDouble(_mtotal_explotado))+(double)(Double.parseDouble(_mexplotado)));
 }
;
 //BA.debugLineNum = 537;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 };
 //BA.debugLineNum = 539;BA.debugLine="Return mTOTAL_EXPLOTADO";
if (true) return _mtotal_explotado;
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return "";
}
public String  _cb_anio_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub CB_Anio_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 49;BA.debugLine="Main.mANIO = CB_Anio.cmbBox.Value";
_main._manio /*int*/  = (int)(BA.ObjectToNumber(_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 50;BA.debugLine="L_Estado_1.Visible = False";
_l_estado_1.setVisible(__c.False);
 //BA.debugLineNum = 51;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 52;BA.debugLine="TBL_Calcular.ClearRows";
_tbl_calcular._clearrows();
 //BA.debugLineNum = 53;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 54;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 55;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 56;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (3),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 57;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (4),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 58;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (5),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 59;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (6),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _cb_mes_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Private Sub CB_Mes_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 63;BA.debugLine="Main.mMES = CB_Mes.cmbBox.Value";
_main._mmes /*int*/  = (int)(BA.ObjectToNumber(_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 64;BA.debugLine="L_Estado_1.Visible = False";
_l_estado_1.setVisible(__c.False);
 //BA.debugLineNum = 65;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 66;BA.debugLine="TBL_Calcular.ClearRows";
_tbl_calcular._clearrows();
 //BA.debugLineNum = 67;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 68;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 69;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 70;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (3),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 71;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (4),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 72;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (5),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 73;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
_tbl_calcular._setcolcustomize((int) (6),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private CB_Anio As B4XComboBox";
_cb_anio = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 6;BA.debugLine="Private CB_Mes As B4XComboBox";
_cb_mes = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 7;BA.debugLine="Private TBL_Calcular As FlexGrid";
_tbl_calcular = new b4j.example.flexgrid();
 //BA.debugLineNum = 8;BA.debugLine="Private B_Calcular As Button";
_b_calcular = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private L_Estado_1 As Label";
_l_estado_1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
