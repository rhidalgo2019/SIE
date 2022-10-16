package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xcalcular_subs_0 {


public static RemoteObject  _actualizar(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Actualizar (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("actualizar")) { return __ref.runUserSub(false, "b4xcalcular","actualizar", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mult_calcular = RemoteObject.createImmutable(0);
RemoteObject _mvalor = RemoteObject.createImmutable("");
RemoteObject _mtipo = RemoteObject.createImmutable("");
RemoteObject _mval_claves = null;
RemoteObject _mval_descripciones = null;
RemoteObject _mval_valores = null;
RemoteObject _mind_claves = null;
RemoteObject _mind_descripciones = null;
RemoteObject _mind_valores = null;
RemoteObject _mind_cumple = RemoteObject.createImmutable("");
RemoteObject _mind_minimo = RemoteObject.createImmutable("");
RemoteObject _mind_maximo = RemoteObject.createImmutable("");
RemoteObject _mind_meta = RemoteObject.createImmutable("");
RemoteObject _mval_clave = RemoteObject.createImmutable("");
RemoteObject _mval_valor = RemoteObject.createImmutable("");
RemoteObject _mfac = RemoteObject.createImmutable(0f);
RemoteObject _mcob = RemoteObject.createImmutable(0f);
RemoteObject _mve = RemoteObject.createImmutable(0f);
RemoteObject _mvf = RemoteObject.createImmutable(0f);
RemoteObject _mtc = RemoteObject.createImmutable(0f);
RemoteObject _mtsc = RemoteObject.createImmutable(0f);
RemoteObject _mcee = RemoteObject.createImmutable(0f);
RemoteObject _mcop = RemoteObject.createImmutable(0f);
RemoteObject _metc = RemoteObject.createImmutable(0f);
RemoteObject _mte = RemoteObject.createImmutable(0f);
RemoteObject _mgt = RemoteObject.createImmutable(0f);
RemoteObject _mtr = RemoteObject.createImmutable(0f);
RemoteObject _mpa = RemoteObject.createImmutable(0f);
RemoteObject _mtmp_str_1 = RemoteObject.createImmutable("");
RemoteObject _mtmp_str_2 = RemoteObject.createImmutable("");
RemoteObject _mtmp_str_3 = RemoteObject.createImmutable("");
RemoteObject _mec = RemoteObject.createImmutable("");
RemoteObject _mef = RemoteObject.createImmutable("");
RemoteObject _meg = RemoteObject.createImmutable("");
RemoteObject _mdh = RemoteObject.createImmutable("");
RemoteObject _mcs = RemoteObject.createImmutable("");
RemoteObject _miee = RemoteObject.createImmutable("");
RemoteObject _mie = RemoteObject.createImmutable("");
RemoteObject _mil = RemoteObject.createImmutable("");
RemoteObject _mrtm = RemoteObject.createImmutable("");
RemoteObject _mvbf = RemoteObject.createImmutable("");
RemoteObject _mcp = RemoteObject.createImmutable("");
RemoteObject _mcpc = RemoteObject.createImmutable("");
RemoteObject _mtmp_float = RemoteObject.createImmutable(0f);
RemoteObject _mcompletos = RemoteObject.createImmutable(false);
RemoteObject _mtotal_valores = RemoteObject.createImmutable(0);
RemoteObject _mret = RemoteObject.createImmutable(false);
RemoteObject _mcadena = RemoteObject.createImmutable("");
 BA.debugLineNum = 143;BA.debugLine="Public Sub Actualizar() As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim x, mULT_CALCULAR As Int";
Debug.ShouldStop(32768);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
_mult_calcular = RemoteObject.createImmutable(0);Debug.locals.put("mULT_CALCULAR", _mult_calcular);
 BA.debugLineNum = 145;BA.debugLine="Dim mVALOR, mTIPO As String";
Debug.ShouldStop(65536);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
_mtipo = RemoteObject.createImmutable("");Debug.locals.put("mTIPO", _mtipo);
 BA.debugLineNum = 146;BA.debugLine="Dim mVAL_CLAVES(50), mVAL_DESCRIPCIONES(50), mVAL";
Debug.ShouldStop(131072);
_mval_claves = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mVAL_CLAVES", _mval_claves);
_mval_descripciones = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mVAL_DESCRIPCIONES", _mval_descripciones);
_mval_valores = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mVAL_VALORES", _mval_valores);
 BA.debugLineNum = 147;BA.debugLine="Dim mIND_CLAVES(50), mIND_DESCRIPCIONES(50), mIND";
Debug.ShouldStop(262144);
_mind_claves = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mIND_CLAVES", _mind_claves);
_mind_descripciones = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mIND_DESCRIPCIONES", _mind_descripciones);
_mind_valores = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mIND_VALORES", _mind_valores);
 BA.debugLineNum = 148;BA.debugLine="Dim mIND_CUMPLE, mIND_MINIMO, mIND_MAXIMO, mIND_M";
Debug.ShouldStop(524288);
_mind_cumple = RemoteObject.createImmutable("");Debug.locals.put("mIND_CUMPLE", _mind_cumple);
_mind_minimo = RemoteObject.createImmutable("");Debug.locals.put("mIND_MINIMO", _mind_minimo);
_mind_maximo = RemoteObject.createImmutable("");Debug.locals.put("mIND_MAXIMO", _mind_maximo);
_mind_meta = RemoteObject.createImmutable("");Debug.locals.put("mIND_META", _mind_meta);
 BA.debugLineNum = 149;BA.debugLine="Dim mVAL_CLAVE, mVAL_VALOR As String";
Debug.ShouldStop(1048576);
_mval_clave = RemoteObject.createImmutable("");Debug.locals.put("mVAL_CLAVE", _mval_clave);
_mval_valor = RemoteObject.createImmutable("");Debug.locals.put("mVAL_VALOR", _mval_valor);
 BA.debugLineNum = 150;BA.debugLine="Dim mFAC, mCOB, mVE, mVF, mTC, mTSC, mCEE, mCOP,";
Debug.ShouldStop(2097152);
_mfac = RemoteObject.createImmutable(0f);Debug.locals.put("mFAC", _mfac);
_mcob = RemoteObject.createImmutable(0f);Debug.locals.put("mCOB", _mcob);
_mve = RemoteObject.createImmutable(0f);Debug.locals.put("mVE", _mve);
_mvf = RemoteObject.createImmutable(0f);Debug.locals.put("mVF", _mvf);
_mtc = RemoteObject.createImmutable(0f);Debug.locals.put("mTC", _mtc);
_mtsc = RemoteObject.createImmutable(0f);Debug.locals.put("mTSC", _mtsc);
_mcee = RemoteObject.createImmutable(0f);Debug.locals.put("mCEE", _mcee);
_mcop = RemoteObject.createImmutable(0f);Debug.locals.put("mCOP", _mcop);
_metc = RemoteObject.createImmutable(0f);Debug.locals.put("mETC", _metc);
_mte = RemoteObject.createImmutable(0f);Debug.locals.put("mTE", _mte);
_mgt = RemoteObject.createImmutable(0f);Debug.locals.put("mGT", _mgt);
_mtr = RemoteObject.createImmutable(0f);Debug.locals.put("mTR", _mtr);
_mpa = RemoteObject.createImmutable(0f);Debug.locals.put("mPA", _mpa);
 BA.debugLineNum = 151;BA.debugLine="Dim mTMP_STR_1, mTMP_STR_2, mTMP_STR_3 As String";
Debug.ShouldStop(4194304);
_mtmp_str_1 = RemoteObject.createImmutable("");Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
_mtmp_str_2 = RemoteObject.createImmutable("");Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
_mtmp_str_3 = RemoteObject.createImmutable("");Debug.locals.put("mTMP_STR_3", _mtmp_str_3);
 BA.debugLineNum = 152;BA.debugLine="Dim mEC, mEF, mEG, mDH, mCS, mIEE, mIE, mIL, mRTM";
Debug.ShouldStop(8388608);
_mec = RemoteObject.createImmutable("");Debug.locals.put("mEC", _mec);
_mef = RemoteObject.createImmutable("");Debug.locals.put("mEF", _mef);
_meg = RemoteObject.createImmutable("");Debug.locals.put("mEG", _meg);
_mdh = RemoteObject.createImmutable("");Debug.locals.put("mDH", _mdh);
_mcs = RemoteObject.createImmutable("");Debug.locals.put("mCS", _mcs);
_miee = RemoteObject.createImmutable("");Debug.locals.put("mIEE", _miee);
_mie = RemoteObject.createImmutable("");Debug.locals.put("mIE", _mie);
_mil = RemoteObject.createImmutable("");Debug.locals.put("mIL", _mil);
_mrtm = RemoteObject.createImmutable("");Debug.locals.put("mRTM", _mrtm);
_mvbf = RemoteObject.createImmutable("");Debug.locals.put("mVBF", _mvbf);
_mcp = RemoteObject.createImmutable("");Debug.locals.put("mCP", _mcp);
_mcpc = RemoteObject.createImmutable("");Debug.locals.put("mCPC", _mcpc);
 BA.debugLineNum = 153;BA.debugLine="Dim mTMP_FLOAT As Float";
Debug.ShouldStop(16777216);
_mtmp_float = RemoteObject.createImmutable(0f);Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 154;BA.debugLine="Dim mCOMPLETOS As Boolean";
Debug.ShouldStop(33554432);
_mcompletos = RemoteObject.createImmutable(false);Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 155;BA.debugLine="Dim mTOTAL_VALORES As Int";
Debug.ShouldStop(67108864);
_mtotal_valores = RemoteObject.createImmutable(0);Debug.locals.put("mTOTAL_VALORES", _mtotal_valores);
 BA.debugLineNum = 156;BA.debugLine="Dim mRET As Boolean";
Debug.ShouldStop(134217728);
_mret = RemoteObject.createImmutable(false);Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 157;BA.debugLine="Dim mCADENA As String";
Debug.ShouldStop(268435456);
_mcadena = RemoteObject.createImmutable("");Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 159;BA.debugLine="mFAC = 0.0";
Debug.ShouldStop(1073741824);
_mfac = BA.numberCast(float.class, 0.0);Debug.locals.put("mFAC", _mfac);
 BA.debugLineNum = 160;BA.debugLine="mCOB = 0.0";
Debug.ShouldStop(-2147483648);
_mcob = BA.numberCast(float.class, 0.0);Debug.locals.put("mCOB", _mcob);
 BA.debugLineNum = 161;BA.debugLine="mVE = 0.0";
Debug.ShouldStop(1);
_mve = BA.numberCast(float.class, 0.0);Debug.locals.put("mVE", _mve);
 BA.debugLineNum = 162;BA.debugLine="mVF = 0.0";
Debug.ShouldStop(2);
_mvf = BA.numberCast(float.class, 0.0);Debug.locals.put("mVF", _mvf);
 BA.debugLineNum = 163;BA.debugLine="mTC = 0.0";
Debug.ShouldStop(4);
_mtc = BA.numberCast(float.class, 0.0);Debug.locals.put("mTC", _mtc);
 BA.debugLineNum = 164;BA.debugLine="mTSC = 0.0";
Debug.ShouldStop(8);
_mtsc = BA.numberCast(float.class, 0.0);Debug.locals.put("mTSC", _mtsc);
 BA.debugLineNum = 165;BA.debugLine="mCEE = 0.0";
Debug.ShouldStop(16);
_mcee = BA.numberCast(float.class, 0.0);Debug.locals.put("mCEE", _mcee);
 BA.debugLineNum = 166;BA.debugLine="mCOP = 0.0";
Debug.ShouldStop(32);
_mcop = BA.numberCast(float.class, 0.0);Debug.locals.put("mCOP", _mcop);
 BA.debugLineNum = 167;BA.debugLine="mETC = 0.0";
Debug.ShouldStop(64);
_metc = BA.numberCast(float.class, 0.0);Debug.locals.put("mETC", _metc);
 BA.debugLineNum = 168;BA.debugLine="mTE = 0.0";
Debug.ShouldStop(128);
_mte = BA.numberCast(float.class, 0.0);Debug.locals.put("mTE", _mte);
 BA.debugLineNum = 169;BA.debugLine="mGT = 0.0";
Debug.ShouldStop(256);
_mgt = BA.numberCast(float.class, 0.0);Debug.locals.put("mGT", _mgt);
 BA.debugLineNum = 170;BA.debugLine="mTR = 0.0";
Debug.ShouldStop(512);
_mtr = BA.numberCast(float.class, 0.0);Debug.locals.put("mTR", _mtr);
 BA.debugLineNum = 171;BA.debugLine="mPA = 0.0";
Debug.ShouldStop(1024);
_mpa = BA.numberCast(float.class, 0.0);Debug.locals.put("mPA", _mpa);
 BA.debugLineNum = 172;BA.debugLine="mEC = \"0\"";
Debug.ShouldStop(2048);
_mec = BA.ObjectToString("0");Debug.locals.put("mEC", _mec);
 BA.debugLineNum = 173;BA.debugLine="mEF = \"0\"";
Debug.ShouldStop(4096);
_mef = BA.ObjectToString("0");Debug.locals.put("mEF", _mef);
 BA.debugLineNum = 174;BA.debugLine="mEG = \"0\"";
Debug.ShouldStop(8192);
_meg = BA.ObjectToString("0");Debug.locals.put("mEG", _meg);
 BA.debugLineNum = 175;BA.debugLine="mDH = \"0\"";
Debug.ShouldStop(16384);
_mdh = BA.ObjectToString("0");Debug.locals.put("mDH", _mdh);
 BA.debugLineNum = 176;BA.debugLine="mCS = \"0\"";
Debug.ShouldStop(32768);
_mcs = BA.ObjectToString("0");Debug.locals.put("mCS", _mcs);
 BA.debugLineNum = 177;BA.debugLine="mIEE = \"0\"";
Debug.ShouldStop(65536);
_miee = BA.ObjectToString("0");Debug.locals.put("mIEE", _miee);
 BA.debugLineNum = 178;BA.debugLine="mIE = \"0\"";
Debug.ShouldStop(131072);
_mie = BA.ObjectToString("0");Debug.locals.put("mIE", _mie);
 BA.debugLineNum = 179;BA.debugLine="mIL = \"0\"";
Debug.ShouldStop(262144);
_mil = BA.ObjectToString("0");Debug.locals.put("mIL", _mil);
 BA.debugLineNum = 180;BA.debugLine="mRTM = \"0\"";
Debug.ShouldStop(524288);
_mrtm = BA.ObjectToString("0");Debug.locals.put("mRTM", _mrtm);
 BA.debugLineNum = 181;BA.debugLine="mVBF = \"0\"";
Debug.ShouldStop(1048576);
_mvbf = BA.ObjectToString("0");Debug.locals.put("mVBF", _mvbf);
 BA.debugLineNum = 182;BA.debugLine="mCP = \"0\"";
Debug.ShouldStop(2097152);
_mcp = BA.ObjectToString("0");Debug.locals.put("mCP", _mcp);
 BA.debugLineNum = 183;BA.debugLine="mCPC = \"0\"";
Debug.ShouldStop(4194304);
_mcpc = BA.ObjectToString("0");Debug.locals.put("mCPC", _mcpc);
 BA.debugLineNum = 184;BA.debugLine="mRET = True";
Debug.ShouldStop(8388608);
_mret = b4xcalcular.__c.getField(true,"True");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 186;BA.debugLine="mTOTAL_VALORES = -1";
Debug.ShouldStop(33554432);
_mtotal_valores = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("mTOTAL_VALORES", _mtotal_valores);
 BA.debugLineNum = 187;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(67108864);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(268435456);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
Debug.ShouldStop(536870912);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_valores WHERE val_anio = "),b4xcalcular._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 191;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(1073741824);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 192;BA.debugLine="mTOTAL_VALORES = mTOTAL_VALORES + 1";
Debug.ShouldStop(-2147483648);
_mtotal_valores = RemoteObject.solve(new RemoteObject[] {_mtotal_valores,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mTOTAL_VALORES", _mtotal_valores);
 BA.debugLineNum = 193;BA.debugLine="mVAL_CLAVE = mRS.GetString(\"val_clave\")";
Debug.ShouldStop(1);
_mval_clave = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_clave")));Debug.locals.put("mVAL_CLAVE", _mval_clave);
 BA.debugLineNum = 194;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 196;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_ene\")";
Debug.ShouldStop(8);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_ene")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 1: {
 BA.debugLineNum = 198;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_feb\")";
Debug.ShouldStop(32);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_feb")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 2: {
 BA.debugLineNum = 200;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_mar\")";
Debug.ShouldStop(128);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_mar")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 3: {
 BA.debugLineNum = 202;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_abr\")";
Debug.ShouldStop(512);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_abr")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 4: {
 BA.debugLineNum = 204;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_may\")";
Debug.ShouldStop(2048);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_may")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 5: {
 BA.debugLineNum = 206;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_jun\")";
Debug.ShouldStop(8192);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_jun")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 6: {
 BA.debugLineNum = 208;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_jul\")";
Debug.ShouldStop(32768);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_jul")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 7: {
 BA.debugLineNum = 210;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_ago\")";
Debug.ShouldStop(131072);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_ago")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 8: {
 BA.debugLineNum = 212;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_sep\")";
Debug.ShouldStop(524288);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_sep")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 9: {
 BA.debugLineNum = 214;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_oct\")";
Debug.ShouldStop(2097152);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_oct")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 10: {
 BA.debugLineNum = 216;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_nov\")";
Debug.ShouldStop(8388608);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_nov")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
case 11: {
 BA.debugLineNum = 218;BA.debugLine="mVAL_VALOR = mRS.GetString(\"val_dic\")";
Debug.ShouldStop(33554432);
_mval_valor = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_dic")));Debug.locals.put("mVAL_VALOR", _mval_valor);
 break; }
}
;
 BA.debugLineNum = 220;BA.debugLine="If mVAL_CLAVE = \"TC\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("TC"))) { 
 BA.debugLineNum = 221;BA.debugLine="mTC = mVAL_VALOR.As(Float)";
Debug.ShouldStop(268435456);
_mtc = (BA.numberCast(float.class, _mval_valor));Debug.locals.put("mTC", _mtc);
 };
 BA.debugLineNum = 223;BA.debugLine="If mVAL_VALOR = \"0.00\" Or mVAL_VALOR = \"0\" Or m";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_mval_valor,BA.ObjectToString("0.00")) || RemoteObject.solveBoolean("=",_mval_valor,BA.ObjectToString("0")) || RemoteObject.solveBoolean("=",_mval_valor,BA.ObjectToString("0.0")) || RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("VE"))) { 
 BA.debugLineNum = 224;BA.debugLine="If mVAL_CLAVE = \"VE\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("VE"))) { 
 BA.debugLineNum = 225;BA.debugLine="mVE = Calcular_Volumen_Explotado";
Debug.ShouldStop(1);
_mve = BA.numberCast(float.class, __ref.runClassMethod (japam.SIE.b4xcalcular.class, "_calcular_volumen_explotado" /*RemoteObject*/ ));Debug.locals.put("mVE", _mve);
 BA.debugLineNum = 226;BA.debugLine="mVAL_VALOR = mFORMATO(mVE, \"T\")";
Debug.ShouldStop(2);
_mval_valor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mve)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mVAL_VALOR", _mval_valor);
 };
 BA.debugLineNum = 228;BA.debugLine="If mVAL_CLAVE = \"TSC\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("TSC"))) { 
 BA.debugLineNum = 229;BA.debugLine="mTSC = mTC * 0.97";
Debug.ShouldStop(16);
_mtsc = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_mtc,RemoteObject.createImmutable(0.97)}, "*",0, 0));Debug.locals.put("mTSC", _mtsc);
 BA.debugLineNum = 230;BA.debugLine="mVAL_VALOR = mFORMATO(mTSC, \"T\")";
Debug.ShouldStop(32);
_mval_valor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mtsc)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mVAL_VALOR", _mval_valor);
 };
 BA.debugLineNum = 232;BA.debugLine="If mVAL_CLAVE = \"PA\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("PA"))) { 
 BA.debugLineNum = 233;BA.debugLine="mPA = mTC * 5";
Debug.ShouldStop(256);
_mpa = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_mtc,RemoteObject.createImmutable(5)}, "*",0, 0));Debug.locals.put("mPA", _mpa);
 BA.debugLineNum = 234;BA.debugLine="mVAL_VALOR = mFORMATO(mPA, \"T\")";
Debug.ShouldStop(512);
_mval_valor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mpa)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mVAL_VALOR", _mval_valor);
 };
 BA.debugLineNum = 236;BA.debugLine="If mVAL_CLAVE = \"CEE\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("CEE"))) { 
 BA.debugLineNum = 237;BA.debugLine="mCEE = Calcular_Costo_Energia_Electrica";
Debug.ShouldStop(4096);
_mcee = BA.numberCast(float.class, __ref.runClassMethod (japam.SIE.b4xcalcular.class, "_calcular_costo_energia_electrica" /*RemoteObject*/ ));Debug.locals.put("mCEE", _mcee);
 BA.debugLineNum = 238;BA.debugLine="mVAL_VALOR = mFORMATO(mCEE, \"T\")";
Debug.ShouldStop(8192);
_mval_valor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mcee)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mVAL_VALOR", _mval_valor);
 };
 BA.debugLineNum = 240;BA.debugLine="If mVAL_CLAVE = \"ETC\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_mval_clave,BA.ObjectToString("ETC"))) { 
 BA.debugLineNum = 241;BA.debugLine="mCEE = Calcular_Energia_Total_Consumida";
Debug.ShouldStop(65536);
_mcee = BA.numberCast(float.class, __ref.runClassMethod (japam.SIE.b4xcalcular.class, "_calcular_energia_total_consumida" /*RemoteObject*/ ));Debug.locals.put("mCEE", _mcee);
 BA.debugLineNum = 242;BA.debugLine="mVAL_VALOR = mFORMATO(mCEE, \"T\")";
Debug.ShouldStop(131072);
_mval_valor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mcee)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mVAL_VALOR", _mval_valor);
 };
 BA.debugLineNum = 244;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 246;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_ene =";
Debug.ShouldStop(2097152);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_ene = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 1: {
 BA.debugLineNum = 248;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_feb =";
Debug.ShouldStop(8388608);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_feb = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 2: {
 BA.debugLineNum = 250;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_mar =";
Debug.ShouldStop(33554432);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_mar = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 3: {
 BA.debugLineNum = 252;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_abr =";
Debug.ShouldStop(134217728);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_abr = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 4: {
 BA.debugLineNum = 254;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_may =";
Debug.ShouldStop(536870912);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_may = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 5: {
 BA.debugLineNum = 256;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_jun =";
Debug.ShouldStop(-2147483648);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_jun = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 6: {
 BA.debugLineNum = 258;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_jul =";
Debug.ShouldStop(2);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_jul = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 7: {
 BA.debugLineNum = 260;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_ago =";
Debug.ShouldStop(8);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_ago = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 8: {
 BA.debugLineNum = 262;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_sep =";
Debug.ShouldStop(32);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_sep = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 9: {
 BA.debugLineNum = 264;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_oct =";
Debug.ShouldStop(128);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_oct = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 10: {
 BA.debugLineNum = 266;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_nov =";
Debug.ShouldStop(512);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_nov = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
case 11: {
 BA.debugLineNum = 268;BA.debugLine="mCADENA = \"UPDATE sie_valores SET val_dic =";
Debug.ShouldStop(2048);
_mcadena = BA.ObjectToString("UPDATE sie_valores SET val_dic = '");Debug.locals.put("mCADENA", _mcadena);
 break; }
}
;
 BA.debugLineNum = 270;BA.debugLine="mCADENA = mCADENA & mVAL_VALOR & \"' WHERE val_";
Debug.ShouldStop(8192);
_mcadena = RemoteObject.concat(_mcadena,_mval_valor,RemoteObject.createImmutable("' WHERE val_clave = '"),_mval_clave,RemoteObject.createImmutable("' AND val_anio = "),b4xcalcular._main._manio /*RemoteObject*/ );Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 271;BA.debugLine="Conectar_Servidor_2";
Debug.ShouldStop(16384);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor_2" /*RemoteObject*/ );
 BA.debugLineNum = 272;BA.debugLine="mSQL2.ExecNonQuery(mCADENA)";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql2" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(_mcadena));
 BA.debugLineNum = 273;BA.debugLine="mSQL2.Close";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql2" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 };
 }
;
 BA.debugLineNum = 276;BA.debugLine="mSQL.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 277;BA.debugLine="mRS.Close";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 280;BA.debugLine="x = -1";
Debug.ShouldStop(8388608);
_x = BA.numberCast(int.class, -(double) (0 + 1));Debug.locals.put("x", _x);
 BA.debugLineNum = 281;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(16777216);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 282;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(33554432);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 283;BA.debugLine="mTIPO = \"V\"";
Debug.ShouldStop(67108864);
_mtipo = BA.ObjectToString("V");Debug.locals.put("mTIPO", _mtipo);
 BA.debugLineNum = 284;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
Debug.ShouldStop(134217728);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_valores WHERE val_anio = "),b4xcalcular._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 285;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(268435456);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 286;BA.debugLine="x = x + 1";
Debug.ShouldStop(536870912);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 BA.debugLineNum = 287;BA.debugLine="mVAL_CLAVES(x) = mRS.GetString(\"val_clave\")";
Debug.ShouldStop(1073741824);
_mval_claves.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_clave"))),_x);
 BA.debugLineNum = 288;BA.debugLine="mVAL_DESCRIPCIONES(x) = mRS.GetString(\"val_desc";
Debug.ShouldStop(-2147483648);
_mval_descripciones.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_descripcion"))),_x);
 BA.debugLineNum = 289;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(1);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 291;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_ene\")";
Debug.ShouldStop(4);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_ene"))),_x);
 break; }
case 1: {
 BA.debugLineNum = 293;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_feb\")";
Debug.ShouldStop(16);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_feb"))),_x);
 break; }
case 2: {
 BA.debugLineNum = 295;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_mar\")";
Debug.ShouldStop(64);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_mar"))),_x);
 break; }
case 3: {
 BA.debugLineNum = 297;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_abr\")";
Debug.ShouldStop(256);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_abr"))),_x);
 break; }
case 4: {
 BA.debugLineNum = 299;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_may\")";
Debug.ShouldStop(1024);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_may"))),_x);
 break; }
case 5: {
 BA.debugLineNum = 301;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_jun\")";
Debug.ShouldStop(4096);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_jun"))),_x);
 break; }
case 6: {
 BA.debugLineNum = 303;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_jul\")";
Debug.ShouldStop(16384);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_jul"))),_x);
 break; }
case 7: {
 BA.debugLineNum = 305;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_ago\")";
Debug.ShouldStop(65536);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_ago"))),_x);
 break; }
case 8: {
 BA.debugLineNum = 307;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_sep\")";
Debug.ShouldStop(262144);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_sep"))),_x);
 break; }
case 9: {
 BA.debugLineNum = 309;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_oct\")";
Debug.ShouldStop(1048576);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_oct"))),_x);
 break; }
case 10: {
 BA.debugLineNum = 311;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_nov\")";
Debug.ShouldStop(4194304);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_nov"))),_x);
 break; }
case 11: {
 BA.debugLineNum = 313;BA.debugLine="mVAL_VALORES(x) = mRS.GetString(\"val_dic\")";
Debug.ShouldStop(16777216);
_mval_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_dic"))),_x);
 break; }
}
;
 BA.debugLineNum = 315;BA.debugLine="Select Case mVAL_CLAVES(x)";
Debug.ShouldStop(67108864);
switch (BA.switchObjectToInt(_mval_claves.getArrayElement(true,_x),BA.ObjectToString("FAC"),BA.ObjectToString("COB"),BA.ObjectToString("VE"),BA.ObjectToString("VF"),BA.ObjectToString("TC"),BA.ObjectToString("TSC"),BA.ObjectToString("CEE"),BA.ObjectToString("COP"),BA.ObjectToString("ETC"),BA.ObjectToString("TE"),BA.ObjectToString("GT"),BA.ObjectToString("TR"),BA.ObjectToString("PA"))) {
case 0: {
 BA.debugLineNum = 317;BA.debugLine="mFAC = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(268435456);
_mfac = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mFAC", _mfac);
 break; }
case 1: {
 BA.debugLineNum = 319;BA.debugLine="mCOB = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(1073741824);
_mcob = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mCOB", _mcob);
 break; }
case 2: {
 BA.debugLineNum = 321;BA.debugLine="mVE = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(1);
_mve = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mVE", _mve);
 break; }
case 3: {
 BA.debugLineNum = 323;BA.debugLine="mVF = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(4);
_mvf = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mVF", _mvf);
 break; }
case 4: {
 BA.debugLineNum = 325;BA.debugLine="mTC = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(16);
_mtc = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mTC", _mtc);
 break; }
case 5: {
 BA.debugLineNum = 327;BA.debugLine="mTSC = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(64);
_mtsc = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mTSC", _mtsc);
 break; }
case 6: {
 BA.debugLineNum = 329;BA.debugLine="mCEE = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(256);
_mcee = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mCEE", _mcee);
 break; }
case 7: {
 BA.debugLineNum = 331;BA.debugLine="mCOP = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(1024);
_mcop = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mCOP", _mcop);
 break; }
case 8: {
 BA.debugLineNum = 333;BA.debugLine="mETC = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(4096);
_metc = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mETC", _metc);
 break; }
case 9: {
 BA.debugLineNum = 335;BA.debugLine="mTE = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(16384);
_mte = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mTE", _mte);
 break; }
case 10: {
 BA.debugLineNum = 337;BA.debugLine="mGT = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(65536);
_mgt = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mGT", _mgt);
 break; }
case 11: {
 BA.debugLineNum = 339;BA.debugLine="mTR = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(262144);
_mtr = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mTR", _mtr);
 break; }
case 12: {
 BA.debugLineNum = 341;BA.debugLine="mPA = mVAL_VALORES(x).As(Float)";
Debug.ShouldStop(1048576);
_mpa = (BA.numberCast(float.class, _mval_valores.getArrayElement(true,_x)));Debug.locals.put("mPA", _mpa);
 break; }
}
;
 BA.debugLineNum = 343;BA.debugLine="TBL_Calcular.AddRow(Array As Object(mVAL_CLAVES";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_addrow",(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_mval_claves.getArrayElement(true,_x)),(_mval_descripciones.getArrayElement(true,_x)),__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(_mval_valores.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("N"))),(_mtipo)})),(Object)(b4xcalcular.__c.getField(true,"True")));
 }
;
 BA.debugLineNum = 345;BA.debugLine="mSQL.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 346;BA.debugLine="mRS.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 348;BA.debugLine="mULT_CALCULAR = x";
Debug.ShouldStop(134217728);
_mult_calcular = _x;Debug.locals.put("mULT_CALCULAR", _mult_calcular);
 BA.debugLineNum = 350;BA.debugLine="mCOMPLETOS = True";
Debug.ShouldStop(536870912);
_mcompletos = b4xcalcular.__c.getField(true,"True");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 351;BA.debugLine="For x = 0 To mULT_CALCULAR";
Debug.ShouldStop(1073741824);
{
final int step203 = 1;
final int limit203 = _mult_calcular.<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step203 > 0 && _x.<Integer>get().intValue() <= limit203) || (step203 < 0 && _x.<Integer>get().intValue() >= limit203) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step203))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 352;BA.debugLine="mVALOR= TBL_Calcular.GetCellValue(x, 2)";
Debug.ShouldStop(-2147483648);
_mvalor = BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 353;BA.debugLine="mTIPO = TBL_Calcular.GetCellValue(x, 3)";
Debug.ShouldStop(1);
_mtipo = BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 3))));Debug.locals.put("mTIPO", _mtipo);
 BA.debugLineNum = 354;BA.debugLine="If mTIPO = \"V\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_mtipo,BA.ObjectToString("V"))) { 
 BA.debugLineNum = 355;BA.debugLine="If mVALOR = \"0.00\" Or mVALOR = \"\" Or mVALOR = \"";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_mvalor,BA.ObjectToString("0.00")) || RemoteObject.solveBoolean("=",_mvalor,BA.ObjectToString("")) || RemoteObject.solveBoolean("=",_mvalor,BA.ObjectToString("0"))) { 
 BA.debugLineNum = 356;BA.debugLine="mRET = False";
Debug.ShouldStop(8);
_mret = b4xcalcular.__c.getField(true,"False");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 357;BA.debugLine="mCOMPLETOS = False";
Debug.ShouldStop(16);
_mcompletos = b4xcalcular.__c.getField(true,"False");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 358;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
Debug.ShouldStop(32);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setrowcustomize",(Object)(_x),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 };
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 362;BA.debugLine="If Not(mCOMPLETOS) Then";
Debug.ShouldStop(512);
if (b4xcalcular.__c.runMethod(true,"Not",(Object)(_mcompletos)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 363;BA.debugLine="L_Estado_1.Visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"True"));
 BA.debugLineNum = 364;BA.debugLine="L_Estado_2.Visible = True";
Debug.ShouldStop(2048);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"True"));
 BA.debugLineNum = 365;BA.debugLine="L_Estado_1.Text = \"Falta información para poder";
Debug.ShouldStop(4096);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Falta información para poder determinar"));
 BA.debugLineNum = 366;BA.debugLine="L_Estado_2.Text = \"los Indicadores de Efectivida";
Debug.ShouldStop(8192);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("los Indicadores de Efectividad"));
 };
 BA.debugLineNum = 368;BA.debugLine="If mCOMPLETOS Then";
Debug.ShouldStop(32768);
if (_mcompletos.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 369;BA.debugLine="mIND_CUMPLE = \"\"";
Debug.ShouldStop(65536);
_mind_cumple = BA.ObjectToString("");Debug.locals.put("mIND_CUMPLE", _mind_cumple);
 BA.debugLineNum = 370;BA.debugLine="x = mULT_CALCULAR";
Debug.ShouldStop(131072);
_x = _mult_calcular;Debug.locals.put("x", _x);
 BA.debugLineNum = 372;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(524288);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 373;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 374;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_indicad";
Debug.ShouldStop(2097152);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_indicadores WHERE ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 375;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(4194304);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 376;BA.debugLine="x = x + 1";
Debug.ShouldStop(8388608);
_x = RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("x", _x);
 BA.debugLineNum = 377;BA.debugLine="mIND_CLAVES(x) = mRS.GetString(\"ind_clave\")";
Debug.ShouldStop(16777216);
_mind_claves.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_clave"))),_x);
 BA.debugLineNum = 378;BA.debugLine="mIND_DESCRIPCIONES(x) = mRS.GetString(\"ind_des";
Debug.ShouldStop(33554432);
_mind_descripciones.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_descripcion"))),_x);
 BA.debugLineNum = 379;BA.debugLine="mIND_MINIMO = mRS.GetString(\"ind_minimo\")";
Debug.ShouldStop(67108864);
_mind_minimo = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_minimo")));Debug.locals.put("mIND_MINIMO", _mind_minimo);
 BA.debugLineNum = 380;BA.debugLine="mIND_MAXIMO = mRS.GetString(\"ind_maximo\")";
Debug.ShouldStop(134217728);
_mind_maximo = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_maximo")));Debug.locals.put("mIND_MAXIMO", _mind_maximo);
 BA.debugLineNum = 381;BA.debugLine="mIND_META = mRS.GetString(\"ind_meta\")";
Debug.ShouldStop(268435456);
_mind_meta = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_meta")));Debug.locals.put("mIND_META", _mind_meta);
 BA.debugLineNum = 382;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 384;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_ene\")";
Debug.ShouldStop(-2147483648);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_ene"))),_x);
 break; }
case 1: {
 BA.debugLineNum = 386;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_feb\")";
Debug.ShouldStop(2);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_feb"))),_x);
 break; }
case 2: {
 BA.debugLineNum = 388;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_mar\")";
Debug.ShouldStop(8);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_mar"))),_x);
 break; }
case 3: {
 BA.debugLineNum = 390;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_abr\")";
Debug.ShouldStop(32);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_abr"))),_x);
 break; }
case 4: {
 BA.debugLineNum = 392;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_may\")";
Debug.ShouldStop(128);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_may"))),_x);
 break; }
case 5: {
 BA.debugLineNum = 394;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_jun\")";
Debug.ShouldStop(512);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_jun"))),_x);
 break; }
case 6: {
 BA.debugLineNum = 396;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_jul\")";
Debug.ShouldStop(2048);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_jul"))),_x);
 break; }
case 7: {
 BA.debugLineNum = 398;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_ago\")";
Debug.ShouldStop(8192);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_ago"))),_x);
 break; }
case 8: {
 BA.debugLineNum = 400;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_sep\")";
Debug.ShouldStop(32768);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_sep"))),_x);
 break; }
case 9: {
 BA.debugLineNum = 402;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_oct\")";
Debug.ShouldStop(131072);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_oct"))),_x);
 break; }
case 10: {
 BA.debugLineNum = 404;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_nov\")";
Debug.ShouldStop(524288);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_nov"))),_x);
 break; }
case 11: {
 BA.debugLineNum = 406;BA.debugLine="mIND_VALORES(x) = mRS.GetString(\"ind_dic\")";
Debug.ShouldStop(2097152);
_mind_valores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_dic"))),_x);
 break; }
}
;
 BA.debugLineNum = 408;BA.debugLine="TBL_Calcular.AddRow(Array As Object(mIND_CLAVE";
Debug.ShouldStop(8388608);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_addrow",(Object)(RemoteObject.createNewArray("Object",new int[] {7},new Object[] {(_mind_claves.getArrayElement(true,_x)),(_mind_descripciones.getArrayElement(true,_x)),(_mind_valores.getArrayElement(true,_x)),(_mind_meta),(_mind_cumple),(_mind_minimo),(_mind_maximo)})),(Object)(b4xcalcular.__c.getField(true,"True")));
 }
;
 BA.debugLineNum = 410;BA.debugLine="mSQL.Close";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 BA.debugLineNum = 411;BA.debugLine="mRS.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 413;BA.debugLine="mULT_CALCULAR = x";
Debug.ShouldStop(268435456);
_mult_calcular = _x;Debug.locals.put("mULT_CALCULAR", _mult_calcular);
 BA.debugLineNum = 415;BA.debugLine="For x = 0 To mULT_CALCULAR";
Debug.ShouldStop(1073741824);
{
final int step265 = 1;
final int limit265 = _mult_calcular.<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step265 > 0 && _x.<Integer>get().intValue() <= limit265) || (step265 < 0 && _x.<Integer>get().intValue() >= limit265) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step265))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 417;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EC\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("EC")))) { 
 BA.debugLineNum = 418;BA.debugLine="If mFAC <> 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",_mfac,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 419;BA.debugLine="mTMP_FLOAT = (mCOB / mFAC) * 100";
Debug.ShouldStop(4);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_mcob,_mfac}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 420;BA.debugLine="mEC = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(8);
_mec = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mEC", _mec);
 BA.debugLineNum = 421;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEC)";
Debug.ShouldStop(16);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mec)));
 }else {
 BA.debugLineNum = 423;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, \"Falta FACTUR";
Debug.ShouldStop(64);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((RemoteObject.createImmutable("Falta FACTURADO ($)"))));
 };
 };
 BA.debugLineNum = 427;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EF\" Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("EF")))) { 
 BA.debugLineNum = 428;BA.debugLine="If mVE <> 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_mve,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 429;BA.debugLine="mTMP_FLOAT = (mVF / mVE) * 100";
Debug.ShouldStop(4096);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_mvf,_mve}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 430;BA.debugLine="mEF = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(8192);
_mef = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mEF", _mef);
 BA.debugLineNum = 431;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEF)";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mef)));
 }else {
 BA.debugLineNum = 433;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, \"Falta VOLUME";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((RemoteObject.createImmutable("Falta VOLUMEN EXPLOTADO (m3)"))));
 };
 };
 BA.debugLineNum = 437;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"EG\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("EG")))) { 
 BA.debugLineNum = 438;BA.debugLine="mTMP_STR_1 = mFORMATO(mEC, \"T\")";
Debug.ShouldStop(2097152);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(_mec),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 439;BA.debugLine="mTMP_STR_2 = mFORMATO(mEF, \"T\")";
Debug.ShouldStop(4194304);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(_mef),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 440;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 * mTMP_STR_2) / 100";
Debug.ShouldStop(8388608);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "*",0, 0)),RemoteObject.createImmutable(100)}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 441;BA.debugLine="mEG = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(16777216);
_meg = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mEG", _meg);
 BA.debugLineNum = 442;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mEG)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_meg)));
 };
 BA.debugLineNum = 445;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"DH\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("DH")))) { 
 BA.debugLineNum = 446;BA.debugLine="mTMP_STR_1 = mFORMATO(mVE, \"T\")";
Debug.ShouldStop(536870912);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mve)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 447;BA.debugLine="mTMP_STR_2 = mFORMATO(mPA, \"T\")";
Debug.ShouldStop(1073741824);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mpa)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 448;BA.debugLine="mTMP_FLOAT = ((mTMP_STR_1 * 1000) / mTMP_STR_2";
Debug.ShouldStop(-2147483648);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),RemoteObject.createImmutable(1000)}, "*",0, 0)),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0)),RemoteObject.createImmutable(30)}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 449;BA.debugLine="mDH = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
Debug.ShouldStop(1);
_mdh = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mDH", _mdh);
 BA.debugLineNum = 450;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mDH)";
Debug.ShouldStop(2);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mdh)));
 };
 BA.debugLineNum = 453;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CS\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("CS")))) { 
 BA.debugLineNum = 454;BA.debugLine="mTMP_STR_1 = mFORMATO(mTSC, \"T\")";
Debug.ShouldStop(32);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mtsc)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 455;BA.debugLine="mTMP_STR_2 = mFORMATO(mTC, \"T\")";
Debug.ShouldStop(64);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mtc)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 456;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
Debug.ShouldStop(128);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 457;BA.debugLine="mCS = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(256);
_mcs = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mCS", _mcs);
 BA.debugLineNum = 458;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCS)";
Debug.ShouldStop(512);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mcs)));
 };
 BA.debugLineNum = 461;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IEE\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("IEE")))) { 
 BA.debugLineNum = 462;BA.debugLine="mTMP_STR_1 = mFORMATO(mCEE, \"T\")";
Debug.ShouldStop(8192);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mcee)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 463;BA.debugLine="mTMP_STR_2 = mFORMATO(mCOP, \"T\")";
Debug.ShouldStop(16384);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mcop)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 464;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
Debug.ShouldStop(32768);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 465;BA.debugLine="mIEE = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(65536);
_miee = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mIEE", _miee);
 BA.debugLineNum = 466;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIEE)";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_miee)));
 };
 BA.debugLineNum = 469;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IE\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("IE")))) { 
 BA.debugLineNum = 470;BA.debugLine="mTMP_STR_1 = mFORMATO(mETC, \"T\")";
Debug.ShouldStop(2097152);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_metc)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 471;BA.debugLine="mTMP_STR_2 = mFORMATO(mVE, \"T\")";
Debug.ShouldStop(4194304);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mve)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 472;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
Debug.ShouldStop(8388608);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 473;BA.debugLine="mIE = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
Debug.ShouldStop(16777216);
_mie = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mIE", _mie);
 BA.debugLineNum = 474;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIE)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mie)));
 };
 BA.debugLineNum = 477;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"IL\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("IL")))) { 
 BA.debugLineNum = 478;BA.debugLine="mTMP_STR_1 = mFORMATO(mTE, \"T\")";
Debug.ShouldStop(536870912);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mte)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 479;BA.debugLine="mTMP_STR_2 = mFORMATO(mTC, \"T\")";
Debug.ShouldStop(1073741824);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mtc)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 480;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / (mTMP_STR_2 / 1000)";
Debug.ShouldStop(-2147483648);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_2),RemoteObject.createImmutable(1000)}, "/",0, 0))}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 481;BA.debugLine="mIL = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
Debug.ShouldStop(1);
_mil = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mIL", _mil);
 BA.debugLineNum = 482;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mIL)";
Debug.ShouldStop(2);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mil)));
 };
 BA.debugLineNum = 485;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"RTM\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("RTM")))) { 
 BA.debugLineNum = 486;BA.debugLine="mTMP_STR_1 = mFORMATO(mGT, \"T\")";
Debug.ShouldStop(32);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mgt)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 487;BA.debugLine="mTMP_STR_2 = mFORMATO(mTR, \"T\")";
Debug.ShouldStop(64);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mtr)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 488;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
Debug.ShouldStop(128);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 489;BA.debugLine="mRTM = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
Debug.ShouldStop(256);
_mrtm = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mRTM", _mrtm);
 BA.debugLineNum = 490;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mRTM)";
Debug.ShouldStop(512);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mrtm)));
 };
 BA.debugLineNum = 493;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"VBF\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("VBF")))) { 
 BA.debugLineNum = 494;BA.debugLine="mTMP_STR_1 = mFORMATO(mRTM, \"T\")";
Debug.ShouldStop(8192);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(_mrtm),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 495;BA.debugLine="mTMP_FLOAT = (1 - mTMP_STR_1) * 100";
Debug.ShouldStop(16384);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),BA.numberCast(double.class, _mtmp_str_1)}, "-",1, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 496;BA.debugLine="mVBF = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(32768);
_mvbf = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mVBF", _mvbf);
 BA.debugLineNum = 497;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mVBF)";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mvbf)));
 };
 BA.debugLineNum = 500;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CP\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("CP")))) { 
 BA.debugLineNum = 501;BA.debugLine="mTMP_STR_1 = mFORMATO(mGT, \"T\")";
Debug.ShouldStop(1048576);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mgt)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 502;BA.debugLine="mTMP_STR_2 = mFORMATO(mVE, \"T\")";
Debug.ShouldStop(2097152);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mve)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 503;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
Debug.ShouldStop(4194304);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 504;BA.debugLine="mCP = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
Debug.ShouldStop(8388608);
_mcp = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCP", _mcp);
 BA.debugLineNum = 505;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCP)";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mcp)));
 };
 BA.debugLineNum = 508;BA.debugLine="If TBL_Calcular.GetCellValue(x, 0) = \"CPC\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))),RemoteObject.createImmutable(("CPC")))) { 
 BA.debugLineNum = 509;BA.debugLine="mTMP_STR_1 = mFORMATO(mVF, \"T\")";
Debug.ShouldStop(268435456);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mvf)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 510;BA.debugLine="mTMP_STR_2 = mFORMATO(mPA, \"T\")";
Debug.ShouldStop(536870912);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.NumberToString(_mpa)),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 511;BA.debugLine="mTMP_FLOAT = mTMP_STR_1 / mTMP_STR_2";
Debug.ShouldStop(1073741824);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 512;BA.debugLine="mCPC = mFORMATO(mTMP_FLOAT.As(String), \"N\")";
Debug.ShouldStop(-2147483648);
_mcpc = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCPC", _mcpc);
 BA.debugLineNum = 513;BA.debugLine="TBL_Calcular.SetCellValue(x, 2, mCPC)";
Debug.ShouldStop(1);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2)),(Object)((_mcpc)));
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 517;BA.debugLine="For x = 0 To mTOTAL_VALORES";
Debug.ShouldStop(16);
{
final int step354 = 1;
final int limit354 = _mtotal_valores.<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step354 > 0 && _x.<Integer>get().intValue() <= limit354) || (step354 < 0 && _x.<Integer>get().intValue() >= limit354) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step354))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 518;BA.debugLine="TBL_Calcular.RemoveRow(0)";
Debug.ShouldStop(32);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_removerow",(Object)(BA.numberCast(int.class, 0)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 520;BA.debugLine="For x = 0 To TBL_Calcular.RowCount -1";
Debug.ShouldStop(128);
{
final int step357 = 1;
final int limit357 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(true,"_getrowcount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step357 > 0 && _x.<Integer>get().intValue() <= limit357) || (step357 < 0 && _x.<Integer>get().intValue() >= limit357) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step357))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 521;BA.debugLine="mTMP_STR_1 = mFORMATO(TBL_Calcular.GetCellValue";
Debug.ShouldStop(256);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 522;BA.debugLine="mTMP_STR_2 = mFORMATO(TBL_Calcular.GetCellValue";
Debug.ShouldStop(512);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 3))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 523;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
Debug.ShouldStop(1024);
_mtmp_float = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2)}, "/",0, 0)),RemoteObject.createImmutable(100)}, "*",0, 0));Debug.locals.put("mTMP_FLOAT", _mtmp_float);
 BA.debugLineNum = 524;BA.debugLine="mVALOR = mFORMATO(mTMP_FLOAT.As(String), \"P\")";
Debug.ShouldStop(2048);
_mvalor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mtmp_float))),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 525;BA.debugLine="TBL_Calcular.SetCellValue(x, 4, mVALOR)";
Debug.ShouldStop(4096);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 4)),(Object)((_mvalor)));
 BA.debugLineNum = 527;BA.debugLine="mTMP_STR_1 = mFORMATO(TBL_Calcular.GetCellValue";
Debug.ShouldStop(16384);
_mtmp_str_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_1", _mtmp_str_1);
 BA.debugLineNum = 528;BA.debugLine="mTMP_STR_2 = mFORMATO(TBL_Calcular.GetCellValue";
Debug.ShouldStop(32768);
_mtmp_str_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 3))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_2", _mtmp_str_2);
 BA.debugLineNum = 529;BA.debugLine="mTMP_STR_3 = mFORMATO(TBL_Calcular.GetCellValue";
Debug.ShouldStop(65536);
_mtmp_str_3 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 5))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mTMP_STR_3", _mtmp_str_3);
 BA.debugLineNum = 530;BA.debugLine="If mTMP_STR_1 < mTMP_STR_3 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_3))) { 
 BA.debugLineNum = 531;BA.debugLine="TBL_Calcular.SetRowCustomize(x, xui.Color_RGB(";
Debug.ShouldStop(262144);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setrowcustomize",(Object)(_x),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 0)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 };
 BA.debugLineNum = 533;BA.debugLine="If mTMP_STR_1 > mTMP_STR_3 And mTMP_STR_1 < mTM";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_3)) && RemoteObject.solveBoolean("<",BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2))) { 
 BA.debugLineNum = 534;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setrowcustomize",(Object)(_x),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 70)),(Object)(BA.numberCast(int.class, 130)),(Object)(BA.numberCast(int.class, 180)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 };
 BA.debugLineNum = 536;BA.debugLine="If mTMP_STR_1 >= mTMP_STR_2 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",BA.numberCast(double.class, _mtmp_str_1),BA.numberCast(double.class, _mtmp_str_2))) { 
 BA.debugLineNum = 537;BA.debugLine="TBL_Calcular.SetrowCustomize(x, xui.Color_RGB(";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setrowcustomize",(Object)(_x),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 };
 }
}Debug.locals.put("x", _x);
;
 };
 BA.debugLineNum = 541;BA.debugLine="Return mRET";
Debug.ShouldStop(268435456);
if (true) return _mret;
 BA.debugLineNum = 542;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b_calcular_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Calcular_Click (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("b_calcular_click")) { return __ref.runUserSub(false, "b4xcalcular","b_calcular_click", __ref);}
 BA.debugLineNum = 120;BA.debugLine="Private Sub B_Calcular_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 121;BA.debugLine="L_Estado_1.Visible = False";
Debug.ShouldStop(16777216);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="L_Estado_2.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 123;BA.debugLine="B_Guardar.Visible = False";
Debug.ShouldStop(67108864);
__ref.getField(false,"_b_guardar" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 124;BA.debugLine="TBL_Calcular.ClearRows";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 125;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 126;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 127;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 128;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 129;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
Debug.ShouldStop(1);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 130;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
Debug.ShouldStop(2);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 5)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 131;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
Debug.ShouldStop(4);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 6)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 132;BA.debugLine="L_Estado_1.Visible = True";
Debug.ShouldStop(8);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"True"));
 BA.debugLineNum = 133;BA.debugLine="L_Estado_2.Visible = True";
Debug.ShouldStop(16);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"True"));
 BA.debugLineNum = 134;BA.debugLine="L_Estado_1.Text = \"Procesando la informacion...\"";
Debug.ShouldStop(32);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence("Procesando la informacion..."));
 BA.debugLineNum = 135;BA.debugLine="L_Estado_2.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 136;BA.debugLine="If Actualizar Then";
Debug.ShouldStop(128);
if (__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_actualizar" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 137;BA.debugLine="L_Estado_1.Visible = False";
Debug.ShouldStop(256);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="L_Estado_2.Visible = False";
Debug.ShouldStop(512);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="B_Guardar.visible = True";
Debug.ShouldStop(1024);
__ref.getField(false,"_b_guardar" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"True"));
 };
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b_guardar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Guardar_Click (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("b_guardar_click")) { return __ref.runUserSub(false, "b4xcalcular","b_guardar_click", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mclave = RemoteObject.createImmutable("");
RemoteObject _mvalor = RemoteObject.createImmutable("");
RemoteObject _mcumple = RemoteObject.createImmutable("");
 BA.debugLineNum = 681;BA.debugLine="Private Sub B_Guardar_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 682;BA.debugLine="Dim x As Int";
Debug.ShouldStop(512);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 683;BA.debugLine="Dim mCLAVE, mVALOR, mCUMPLE As String";
Debug.ShouldStop(1024);
_mclave = RemoteObject.createImmutable("");Debug.locals.put("mCLAVE", _mclave);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
_mcumple = RemoteObject.createImmutable("");Debug.locals.put("mCUMPLE", _mcumple);
 BA.debugLineNum = 685;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(4096);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 686;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(8192);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 687;BA.debugLine="For x = 0 To TBL_Calcular.RowCount -1";
Debug.ShouldStop(16384);
{
final int step5 = 1;
final int limit5 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(true,"_getrowcount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step5 > 0 && _x.<Integer>get().intValue() <= limit5) || (step5 < 0 && _x.<Integer>get().intValue() >= limit5) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 688;BA.debugLine="mCLAVE = TBL_Calcular.GetCellValue(x, 0)";
Debug.ShouldStop(32768);
_mclave = BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mCLAVE", _mclave);
 BA.debugLineNum = 689;BA.debugLine="mVALOR = mFORMATO(TBL_Calcular.GetCellValue(x,";
Debug.ShouldStop(65536);
_mvalor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 690;BA.debugLine="mCUMPLE = mFORMATO(TBL_Calcular.GetCellValue(x,";
Debug.ShouldStop(131072);
_mcumple = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 4))))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mCUMPLE", _mcumple);
 BA.debugLineNum = 691;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(262144);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 693;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_ene = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 694;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_ene = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 696;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_feb = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 697;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_feb = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 2: {
 BA.debugLineNum = 699;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_mar = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 700;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_mar = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 3: {
 BA.debugLineNum = 702;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_abr = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 703;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_abr = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 4: {
 BA.debugLineNum = 705;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_may = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 706;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_may = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 5: {
 BA.debugLineNum = 708;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_jun = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 709;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_jun = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 6: {
 BA.debugLineNum = 711;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_jul = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 712;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_jul = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 7: {
 BA.debugLineNum = 714;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_ago = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 715;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_ago = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 8: {
 BA.debugLineNum = 717;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(4096);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_sep = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 718;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_sep = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 9: {
 BA.debugLineNum = 720;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_oct = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 721;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_oct = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 10: {
 BA.debugLineNum = 723;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(262144);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_nov = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 724;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_nov = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 726;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_dic = "),_mvalor,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 727;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_indicadores SET";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_indicadores SET ind_c_dic = "),_mcumple,RemoteObject.createImmutable(" WHERE ind_clave = '"),_mclave,RemoteObject.createImmutable("' AND ind_anio = "),b4xcalcular._main._manio /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 729;BA.debugLine="Log(mCLAVE  & \" - \" & mVALOR & \" - \" & mCUMPLE)";
Debug.ShouldStop(16777216);
b4xcalcular.__c.runVoidMethod ("LogImpl","21245232",RemoteObject.concat(_mclave,RemoteObject.createImmutable(" - "),_mvalor,RemoteObject.createImmutable(" - "),_mcumple),0);
 }
}Debug.locals.put("x", _x);
;
 };
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b_regresar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Regresar_Click (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,734);
if (RapidSub.canDelegate("b_regresar_click")) { return __ref.runUserSub(false, "b4xcalcular","b_regresar_click", __ref);}
 BA.debugLineNum = 734;BA.debugLine="Private Sub B_Regresar_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 735;BA.debugLine="If Main.mDERECHO = 99 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",b4xcalcular._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 736;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
Debug.ShouldStop(-2147483648);
b4xcalcular._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu")));
 }else {
 BA.debugLineNum = 738;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2);
b4xcalcular._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 740;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xcalcular","b4xpage_created", __ref, _root1);}
int _x = 0;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 27;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Root = Root1";
Debug.ShouldStop(134217728);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 29;BA.debugLine="Log(\"B4XCalcular\")";
Debug.ShouldStop(268435456);
b4xcalcular.__c.runVoidMethod ("LogImpl","2720898",RemoteObject.createImmutable("B4XCalcular"),0);
 BA.debugLineNum = 30;BA.debugLine="Root = Root1";
Debug.ShouldStop(536870912);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 31;BA.debugLine="Root.LoadLayout(\"Calcular\")";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Calcular")),__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="L_Estado_1.Visible = False";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 33;BA.debugLine="L_Estado_2.Visible = False";
Debug.ShouldStop(1);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 34;BA.debugLine="B_Guardar.Visible = False";
Debug.ShouldStop(2);
__ref.getField(false,"_b_guardar" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 35;BA.debugLine="TBL_Calcular.ColsName=Array As String(\"Clave\", \"D";
Debug.ShouldStop(4);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runMethod(false,"_setcolsname",RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("Clave"),BA.ObjectToString("Denominación"),BA.ObjectToString("Valor"),BA.ObjectToString("Meta"),BA.ObjectToString("Cumple al"),BA.ObjectToString("Mínimo"),RemoteObject.createImmutable("Máximo")}));
 BA.debugLineNum = 36;BA.debugLine="TBL_Calcular.ColsWidth=Array As Int(50dip, 250dip";
Debug.ShouldStop(8);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolswidth",RemoteObject.createNewArray("int",new int[] {7},new Object[] {b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))),b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 250))),b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xcalcular.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}));
 BA.debugLineNum = 37;BA.debugLine="TBL_Calcular.ColsType=Array As Int(TBL_Calcular.T";
Debug.ShouldStop(16);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolstype",RemoteObject.createNewArray("int",new int[] {3},new Object[] {__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).getField(true,"_typestring")}));
 BA.debugLineNum = 38;BA.debugLine="TBL_Calcular.ColsAlignment=Array As String(\"CENTE";
Debug.ShouldStop(32);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolsalignment",RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("CENTER"),BA.ObjectToString("LEFT"),BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER"),RemoteObject.createImmutable("CENTER")}));
 BA.debugLineNum = 39;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
Debug.ShouldStop(64);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 40;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
Debug.ShouldStop(128);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 41;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
Debug.ShouldStop(256);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 42;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
Debug.ShouldStop(512);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 43;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
Debug.ShouldStop(1024);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 44;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
Debug.ShouldStop(2048);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 5)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 45;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
Debug.ShouldStop(4096);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 6)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 47;BA.debugLine="For x = 2021 To 2027";
Debug.ShouldStop(16384);
{
final int step19 = 1;
final int limit19 = 2027;
_x = 2021 ;
for (;(step19 > 0 && _x <= limit19) || (step19 < 0 && _x >= limit19) ;_x = ((int)(0 + _x + step19))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 49;BA.debugLine="SP_Anio.add(x)";
Debug.ShouldStop(65536);
__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 52;BA.debugLine="For x = 1 To 12";
Debug.ShouldStop(524288);
{
final int step22 = 1;
final int limit22 = 12;
_x = 1 ;
for (;(step22 > 0 && _x <= limit22) || (step22 < 0 && _x >= limit22) ;_x = ((int)(0 + _x + step22))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 54;BA.debugLine="SP_Mes.Add(x)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcular_costo_energia_electrica(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Calcular_Costo_Energia_Electrica (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,590);
if (RapidSub.canDelegate("calcular_costo_energia_electrica")) { return __ref.runUserSub(false, "b4xcalcular","calcular_costo_energia_electrica", __ref);}
RemoteObject _mtotal_monto = RemoteObject.createImmutable("");
RemoteObject _mmonto = RemoteObject.createImmutable("");
 BA.debugLineNum = 590;BA.debugLine="Private Sub Calcular_Costo_Energia_Electrica() As";
Debug.ShouldStop(8192);
 BA.debugLineNum = 591;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(16384);
b4xcalcular._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xcalcular._mrs);
 BA.debugLineNum = 592;BA.debugLine="Dim mTOTAL_MONTO, mMONTO As String";
Debug.ShouldStop(32768);
_mtotal_monto = RemoteObject.createImmutable("");Debug.locals.put("mTOTAL_MONTO", _mtotal_monto);
_mmonto = RemoteObject.createImmutable("");Debug.locals.put("mMONTO", _mmonto);
 BA.debugLineNum = 594;BA.debugLine="mTOTAL_MONTO = 0";
Debug.ShouldStop(131072);
_mtotal_monto = BA.NumberToString(0);Debug.locals.put("mTOTAL_MONTO", _mtotal_monto);
 BA.debugLineNum = 595;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(262144);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 597;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 598;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_energia";
Debug.ShouldStop(2097152);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_energia WHERE see_anio = "),b4xcalcular._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 599;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(4194304);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 600;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 602;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_ene\")";
Debug.ShouldStop(33554432);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_ene")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 1: {
 BA.debugLineNum = 604;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_feb\")";
Debug.ShouldStop(134217728);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_feb")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 2: {
 BA.debugLineNum = 606;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_mar\")";
Debug.ShouldStop(536870912);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_mar")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 3: {
 BA.debugLineNum = 608;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_abr\")";
Debug.ShouldStop(-2147483648);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_abr")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 4: {
 BA.debugLineNum = 610;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_may\")";
Debug.ShouldStop(2);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_may")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 5: {
 BA.debugLineNum = 612;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_jun\")";
Debug.ShouldStop(8);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_jun")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 6: {
 BA.debugLineNum = 614;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_jul\")";
Debug.ShouldStop(32);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_jul")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 7: {
 BA.debugLineNum = 616;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_ago\")";
Debug.ShouldStop(128);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_ago")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 8: {
 BA.debugLineNum = 618;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_sep\")";
Debug.ShouldStop(512);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_sep")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 9: {
 BA.debugLineNum = 620;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_oct\")";
Debug.ShouldStop(2048);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_oct")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 10: {
 BA.debugLineNum = 622;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_nov\")";
Debug.ShouldStop(8192);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_nov")));Debug.locals.put("mMONTO", _mmonto);
 break; }
case 11: {
 BA.debugLineNum = 624;BA.debugLine="mMONTO = mRS.GetString(\"see_mon_dic\")";
Debug.ShouldStop(32768);
_mmonto = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_dic")));Debug.locals.put("mMONTO", _mmonto);
 break; }
}
;
 BA.debugLineNum = 626;BA.debugLine="If mMONTO = \"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mmonto,BA.ObjectToString(""))) { 
 BA.debugLineNum = 627;BA.debugLine="mMONTO = \"0\"";
Debug.ShouldStop(262144);
_mmonto = BA.ObjectToString("0");Debug.locals.put("mMONTO", _mmonto);
 };
 BA.debugLineNum = 629;BA.debugLine="mTOTAL_MONTO = mTOTAL_MONTO + mMONTO";
Debug.ShouldStop(1048576);
_mtotal_monto = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtotal_monto),BA.numberCast(double.class, _mmonto)}, "+",1, 0));Debug.locals.put("mTOTAL_MONTO", _mtotal_monto);
 }
;
 BA.debugLineNum = 631;BA.debugLine="mSQL.Close";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 633;BA.debugLine="Return mTOTAL_MONTO";
Debug.ShouldStop(16777216);
if (true) return _mtotal_monto;
 BA.debugLineNum = 634;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcular_energia_total_consumida(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Calcular_Energia_Total_Consumida (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,636);
if (RapidSub.canDelegate("calcular_energia_total_consumida")) { return __ref.runUserSub(false, "b4xcalcular","calcular_energia_total_consumida", __ref);}
RemoteObject _mtotal_energia = RemoteObject.createImmutable("");
RemoteObject _menergia = RemoteObject.createImmutable("");
 BA.debugLineNum = 636;BA.debugLine="Private Sub Calcular_Energia_Total_Consumida() As";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 637;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(268435456);
b4xcalcular._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xcalcular._mrs);
 BA.debugLineNum = 638;BA.debugLine="Dim mTOTAL_ENERGIA, mENERGIA As String";
Debug.ShouldStop(536870912);
_mtotal_energia = RemoteObject.createImmutable("");Debug.locals.put("mTOTAL_ENERGIA", _mtotal_energia);
_menergia = RemoteObject.createImmutable("");Debug.locals.put("mENERGIA", _menergia);
 BA.debugLineNum = 640;BA.debugLine="mTOTAL_ENERGIA = 0";
Debug.ShouldStop(-2147483648);
_mtotal_energia = BA.NumberToString(0);Debug.locals.put("mTOTAL_ENERGIA", _mtotal_energia);
 BA.debugLineNum = 641;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(1);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 642;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(2);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 643;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_energia";
Debug.ShouldStop(4);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_energia WHERE see_anio = "),b4xcalcular._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 644;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(8);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 645;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(16);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 647;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_ene\")";
Debug.ShouldStop(64);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_ene")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 1: {
 BA.debugLineNum = 649;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_feb\")";
Debug.ShouldStop(256);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_feb")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 2: {
 BA.debugLineNum = 651;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_mar\")";
Debug.ShouldStop(1024);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_mar")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 3: {
 BA.debugLineNum = 653;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_abr\")";
Debug.ShouldStop(4096);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_abr")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 4: {
 BA.debugLineNum = 655;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_may\")";
Debug.ShouldStop(16384);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_may")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 5: {
 BA.debugLineNum = 657;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_jun\")";
Debug.ShouldStop(65536);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_jun")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 6: {
 BA.debugLineNum = 659;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_jul\")";
Debug.ShouldStop(262144);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_jul")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 7: {
 BA.debugLineNum = 661;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_ago\")";
Debug.ShouldStop(1048576);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_ago")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 8: {
 BA.debugLineNum = 663;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_sep\")";
Debug.ShouldStop(4194304);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_sep")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 9: {
 BA.debugLineNum = 665;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_oct\")";
Debug.ShouldStop(16777216);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_oct")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 10: {
 BA.debugLineNum = 667;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_nov\")";
Debug.ShouldStop(67108864);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_nov")));Debug.locals.put("mENERGIA", _menergia);
 break; }
case 11: {
 BA.debugLineNum = 669;BA.debugLine="mENERGIA = mRS.GetString(\"see_kwh_dic\")";
Debug.ShouldStop(268435456);
_menergia = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_dic")));Debug.locals.put("mENERGIA", _menergia);
 break; }
}
;
 BA.debugLineNum = 671;BA.debugLine="If mENERGIA = \"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_menergia,BA.ObjectToString(""))) { 
 BA.debugLineNum = 672;BA.debugLine="mENERGIA = \"0\"";
Debug.ShouldStop(-2147483648);
_menergia = BA.ObjectToString("0");Debug.locals.put("mENERGIA", _menergia);
 };
 BA.debugLineNum = 674;BA.debugLine="mTOTAL_ENERGIA = mTOTAL_ENERGIA + mENERGIA";
Debug.ShouldStop(2);
_mtotal_energia = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtotal_energia),BA.numberCast(double.class, _menergia)}, "+",1, 0));Debug.locals.put("mTOTAL_ENERGIA", _mtotal_energia);
 }
;
 BA.debugLineNum = 676;BA.debugLine="mSQL.Close";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 678;BA.debugLine="Return mTOTAL_ENERGIA";
Debug.ShouldStop(32);
if (true) return _mtotal_energia;
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _calcular_volumen_explotado(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Calcular_Volumen_Explotado (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,544);
if (RapidSub.canDelegate("calcular_volumen_explotado")) { return __ref.runUserSub(false, "b4xcalcular","calcular_volumen_explotado", __ref);}
RemoteObject _mtotal_explotado = RemoteObject.createImmutable("");
RemoteObject _mexplotado = RemoteObject.createImmutable("");
 BA.debugLineNum = 544;BA.debugLine="Private Sub Calcular_Volumen_Explotado() As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 545;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(1);
b4xcalcular._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xcalcular._mrs);
 BA.debugLineNum = 546;BA.debugLine="Dim mTOTAL_EXPLOTADO, mEXPLOTADO As String";
Debug.ShouldStop(2);
_mtotal_explotado = RemoteObject.createImmutable("");Debug.locals.put("mTOTAL_EXPLOTADO", _mtotal_explotado);
_mexplotado = RemoteObject.createImmutable("");Debug.locals.put("mEXPLOTADO", _mexplotado);
 BA.debugLineNum = 548;BA.debugLine="mTOTAL_EXPLOTADO = 0";
Debug.ShouldStop(8);
_mtotal_explotado = BA.NumberToString(0);Debug.locals.put("mTOTAL_EXPLOTADO", _mtotal_explotado);
 BA.debugLineNum = 549;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(16);
__ref.runClassMethod (japam.SIE.b4xcalcular.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 551;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(64);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 552;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_extraido";
Debug.ShouldStop(128);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_extraido WHERE ext_anio = "),b4xcalcular._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 553;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(256);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 554;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(b4xcalcular._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 556;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_ene\")";
Debug.ShouldStop(2048);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_ene")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 1: {
 BA.debugLineNum = 558;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_feb\")";
Debug.ShouldStop(8192);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_feb")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 2: {
 BA.debugLineNum = 560;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_mar\")";
Debug.ShouldStop(32768);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_mar")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 3: {
 BA.debugLineNum = 562;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_abr\")";
Debug.ShouldStop(131072);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_abr")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 4: {
 BA.debugLineNum = 564;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_may\")";
Debug.ShouldStop(524288);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_may")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 5: {
 BA.debugLineNum = 566;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_jun\")";
Debug.ShouldStop(2097152);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_jun")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 6: {
 BA.debugLineNum = 568;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_jul\")";
Debug.ShouldStop(8388608);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_jul")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 7: {
 BA.debugLineNum = 570;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_ago\")";
Debug.ShouldStop(33554432);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_ago")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 8: {
 BA.debugLineNum = 572;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_sep\")";
Debug.ShouldStop(134217728);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_sep")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 9: {
 BA.debugLineNum = 574;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_oct\")";
Debug.ShouldStop(536870912);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_oct")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 10: {
 BA.debugLineNum = 576;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_nov\")";
Debug.ShouldStop(-2147483648);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_nov")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
case 11: {
 BA.debugLineNum = 578;BA.debugLine="mEXPLOTADO = mRS.GetString(\"ext_dic\")";
Debug.ShouldStop(2);
_mexplotado = __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_dic")));Debug.locals.put("mEXPLOTADO", _mexplotado);
 break; }
}
;
 BA.debugLineNum = 580;BA.debugLine="If mEXPLOTADO = \"\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_mexplotado,BA.ObjectToString(""))) { 
 BA.debugLineNum = 581;BA.debugLine="mEXPLOTADO = \"0\"";
Debug.ShouldStop(16);
_mexplotado = BA.ObjectToString("0");Debug.locals.put("mEXPLOTADO", _mexplotado);
 };
 BA.debugLineNum = 583;BA.debugLine="mTOTAL_EXPLOTADO = mTOTAL_EXPLOTADO + mEXPLOTAD";
Debug.ShouldStop(64);
_mtotal_explotado = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _mtotal_explotado),BA.numberCast(double.class, _mexplotado)}, "+",1, 0));Debug.locals.put("mTOTAL_EXPLOTADO", _mtotal_explotado);
 }
;
 BA.debugLineNum = 585;BA.debugLine="mSQL.Close";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 };
 BA.debugLineNum = 587;BA.debugLine="Return mTOTAL_EXPLOTADO";
Debug.ShouldStop(1024);
if (true) return _mtotal_explotado;
 BA.debugLineNum = 588;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xcalcular._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xcalcular._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xcalcular._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xcalcular._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private TBL_Calcular As FlexGrid";
b4xcalcular._tbl_calcular = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_calcular",b4xcalcular._tbl_calcular);
 //BA.debugLineNum = 8;BA.debugLine="Private B_Proceder As Button";
b4xcalcular._b_proceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_proceder",b4xcalcular._b_proceder);
 //BA.debugLineNum = 9;BA.debugLine="Private B_Regresar As Button";
b4xcalcular._b_regresar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_regresar",b4xcalcular._b_regresar);
 //BA.debugLineNum = 10;BA.debugLine="Private B_Guardar As Button";
b4xcalcular._b_guardar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_guardar",b4xcalcular._b_guardar);
 //BA.debugLineNum = 11;BA.debugLine="Public mSQL, mSQL2 As SD_SQL";
b4xcalcular._msql = RemoteObject.createNew ("japam.SIE.sd_sql");__ref.setField("_msql",b4xcalcular._msql);
b4xcalcular._msql2 = RemoteObject.createNew ("japam.SIE.sd_sql");__ref.setField("_msql2",b4xcalcular._msql2);
 //BA.debugLineNum = 12;BA.debugLine="Public mRS As SD_ResultSet";
b4xcalcular._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xcalcular._mrs);
 //BA.debugLineNum = 13;BA.debugLine="Private B_Proceder As Button";
b4xcalcular._b_proceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_proceder",b4xcalcular._b_proceder);
 //BA.debugLineNum = 14;BA.debugLine="Private TBL_Calcular As FlexGrid";
b4xcalcular._tbl_calcular = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_calcular",b4xcalcular._tbl_calcular);
 //BA.debugLineNum = 15;BA.debugLine="Private SP_Anio As Spinner";
b4xcalcular._sp_anio = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_anio",b4xcalcular._sp_anio);
 //BA.debugLineNum = 16;BA.debugLine="Private SP_Mes As Spinner";
b4xcalcular._sp_mes = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_mes",b4xcalcular._sp_mes);
 //BA.debugLineNum = 17;BA.debugLine="Private L_Estado_1 As Label";
b4xcalcular._l_estado_1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_l_estado_1",b4xcalcular._l_estado_1);
 //BA.debugLineNum = 18;BA.debugLine="Private L_Estado_2 As Label";
b4xcalcular._l_estado_2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_l_estado_2",b4xcalcular._l_estado_2);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _conectar_servidor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conectar_Servidor (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,744);
if (RapidSub.canDelegate("conectar_servidor")) { return __ref.runUserSub(false, "b4xcalcular","conectar_servidor", __ref);}
 BA.debugLineNum = 744;BA.debugLine="Public Sub Conectar_Servidor()";
Debug.ShouldStop(128);
 BA.debugLineNum = 745;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MYSQL")),(Object)(BA.ObjectToString("com.mysql.jdbc.Driver")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("jdbc:mysql://"),b4xcalcular.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xcalcular._main._servidor /*RemoteObject*/ ))),RemoteObject.createImmutable("/u567762233_SIE?useSSL=false")))),(Object)(b4xcalcular._main._administrador /*RemoteObject*/ ),(Object)(b4xcalcular._main._password /*RemoteObject*/ ));
 BA.debugLineNum = 746;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _conectar_servidor_2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conectar_Servidor_2 (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,748);
if (RapidSub.canDelegate("conectar_servidor_2")) { return __ref.runUserSub(false, "b4xcalcular","conectar_servidor_2", __ref);}
 BA.debugLineNum = 748;BA.debugLine="public Sub Conectar_Servidor_2()";
Debug.ShouldStop(2048);
 BA.debugLineNum = 749;BA.debugLine="mSQL2.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Driv";
Debug.ShouldStop(4096);
__ref.getField(false,"_msql2" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MYSQL")),(Object)(BA.ObjectToString("com.mysql.jdbc.Driver")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("jdbc:mysql://"),b4xcalcular.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xcalcular._main._servidor /*RemoteObject*/ ))),RemoteObject.createImmutable("/u567762233_SIE?useSSL=false")))),(Object)(b4xcalcular._main._administrador /*RemoteObject*/ ),(Object)(b4xcalcular._main._password /*RemoteObject*/ ));
 BA.debugLineNum = 750;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcalcular","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Return Me";
Debug.ShouldStop(4194304);
if (true) return __ref;
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mformato(RemoteObject __ref,RemoteObject _valor,RemoteObject _formato) throws Exception{
try {
		Debug.PushSubsStack("mFORMATO (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,752);
if (RapidSub.canDelegate("mformato")) { return __ref.runUserSub(false, "b4xcalcular","mformato", __ref, _valor, _formato);}
RemoteObject _mret = RemoteObject.createImmutable("");
RemoteObject _mvalor = RemoteObject.createImmutable("");
RemoteObject _menteros = RemoteObject.createImmutable("");
RemoteObject _mdecimales = RemoteObject.createImmutable("");
RemoteObject _mlargo = RemoteObject.createImmutable(0);
RemoteObject _mpos_decimal = RemoteObject.createImmutable(0);
RemoteObject _mmoneda = RemoteObject.createImmutable("");
RemoteObject _mporcentaje = RemoteObject.createImmutable("");
RemoteObject _mini_decimal = RemoteObject.createImmutable(0);
RemoteObject _mfin_decimal = RemoteObject.createImmutable(0);
Debug.locals.put("Valor", _valor);
Debug.locals.put("Formato", _formato);
 BA.debugLineNum = 752;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
Debug.ShouldStop(32768);
 BA.debugLineNum = 759;BA.debugLine="Dim mRET As String";
Debug.ShouldStop(4194304);
_mret = RemoteObject.createImmutable("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 760;BA.debugLine="Dim mVALOR As String";
Debug.ShouldStop(8388608);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 761;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
Debug.ShouldStop(16777216);
_menteros = RemoteObject.createImmutable("");Debug.locals.put("mENTEROS", _menteros);
_mdecimales = RemoteObject.createImmutable("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 762;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
Debug.ShouldStop(33554432);
_mlargo = RemoteObject.createImmutable(0);Debug.locals.put("mLARGO", _mlargo);
_mpos_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 763;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
Debug.ShouldStop(67108864);
_mmoneda = RemoteObject.createImmutable("");Debug.locals.put("mMONEDA", _mmoneda);
_mporcentaje = RemoteObject.createImmutable("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 BA.debugLineNum = 764;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
Debug.ShouldStop(134217728);
_mini_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
_mfin_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 766;BA.debugLine="mRET = \"\"";
Debug.ShouldStop(536870912);
_mret = BA.ObjectToString("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 767;BA.debugLine="Formato = Formato.ToUpperCase";
Debug.ShouldStop(1073741824);
_formato = _formato.runMethod(true,"toUpperCase");Debug.locals.put("Formato", _formato);
 BA.debugLineNum = 768;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("N")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 769;BA.debugLine="mRET = Valor";
Debug.ShouldStop(1);
_mret = _valor;Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 770;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
Debug.ShouldStop(2);
_mret = _mret.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 771;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(4);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 772;BA.debugLine="mLARGO = mRET.Length";
Debug.ShouldStop(8);
_mlargo = _mret.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 773;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
Debug.ShouldStop(16);
_mpos_decimal = _mret.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 774;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(32);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 775;BA.debugLine="mDECIMALES = \"\"";
Debug.ShouldStop(64);
_mdecimales = BA.ObjectToString("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 776;BA.debugLine="If Formato = \"M\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M"))) { 
 BA.debugLineNum = 777;BA.debugLine="mMONEDA = \"$\"";
Debug.ShouldStop(256);
_mmoneda = BA.ObjectToString("$");Debug.locals.put("mMONEDA", _mmoneda);
 }else {
 BA.debugLineNum = 779;BA.debugLine="mMONEDA = \"\"";
Debug.ShouldStop(1024);
_mmoneda = BA.ObjectToString("");Debug.locals.put("mMONEDA", _mmoneda);
 };
 BA.debugLineNum = 781;BA.debugLine="If Formato = \"P\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 782;BA.debugLine="mPORCENTAJE = \"%\"";
Debug.ShouldStop(8192);
_mporcentaje = BA.ObjectToString("%");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 }else {
 BA.debugLineNum = 784;BA.debugLine="mPORCENTAJE = \"\"";
Debug.ShouldStop(32768);
_mporcentaje = BA.ObjectToString("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 };
 BA.debugLineNum = 786;BA.debugLine="If mPOS_DECIMAL = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 787;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(262144);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 788;BA.debugLine="mDECIMALES = mRET";
Debug.ShouldStop(524288);
_mdecimales = _mret;Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 789;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
Debug.ShouldStop(1048576);
_mret = RemoteObject.concat(_mmoneda,RemoteObject.createImmutable("0"),_mdecimales,RemoteObject.createImmutable(" "),_mporcentaje);Debug.locals.put("mRET", _mret);
 }else {
 BA.debugLineNum = 791;BA.debugLine="If mPOS_DECIMAL = -1 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 792;BA.debugLine="mENTEROS = mRET";
Debug.ShouldStop(8388608);
_menteros = _mret;Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 793;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(16777216);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 }else {
 BA.debugLineNum = 795;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
Debug.ShouldStop(67108864);
_menteros = _mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mpos_decimal));Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 796;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
Debug.ShouldStop(134217728);
_mini_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 BA.debugLineNum = 797;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_mini_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 798;BA.debugLine="mINI_DECIMAL = mLARGO";
Debug.ShouldStop(536870912);
_mini_decimal = _mlargo;Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 };
 BA.debugLineNum = 800;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
Debug.ShouldStop(-2147483648);
_mfin_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 801;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_mfin_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 802;BA.debugLine="mFIN_DECIMAL = mLARGO";
Debug.ShouldStop(2);
_mfin_decimal = _mlargo;Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 };
 BA.debugLineNum = 804;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
Debug.ShouldStop(8);
_mdecimales = _mret.runMethod(true,"substring",(Object)(_mini_decimal),(Object)(_mfin_decimal));Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 806;BA.debugLine="If mDECIMALES.Length = 0 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_mdecimales.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 807;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(64);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 809;BA.debugLine="mLARGO = mENTEROS.Length";
Debug.ShouldStop(256);
_mlargo = _menteros.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 810;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 811;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
Debug.ShouldStop(1024);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 813;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 4)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 814;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
Debug.ShouldStop(8192);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 816;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 7)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 817;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
Debug.ShouldStop(65536);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1))),RemoteObject.createImmutable("'"),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 };
 };
 BA.debugLineNum = 821;BA.debugLine="If Formato = \"T\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("T"))) { 
 BA.debugLineNum = 822;BA.debugLine="mVALOR = Valor";
Debug.ShouldStop(2097152);
_mvalor = _valor;Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 823;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
Debug.ShouldStop(4194304);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 824;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
Debug.ShouldStop(8388608);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 825;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
Debug.ShouldStop(16777216);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 826;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
Debug.ShouldStop(33554432);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("%")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 827;BA.debugLine="mVALOR = mVALOR.Trim";
Debug.ShouldStop(67108864);
_mvalor = _mvalor.runMethod(true,"trim");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 828;BA.debugLine="mRET = mVALOR";
Debug.ShouldStop(134217728);
_mret = _mvalor;Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 830;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(536870912);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 831;BA.debugLine="Return mRET";
Debug.ShouldStop(1073741824);
if (true) return (_mret);
 BA.debugLineNum = 832;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sp_anio_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SP_Anio_ItemClick (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("sp_anio_itemclick")) { return __ref.runUserSub(false, "b4xcalcular","sp_anio_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 74;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
Debug.ShouldStop(512);
 BA.debugLineNum = 75;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
Debug.ShouldStop(1024);
b4xcalcular._main._manio /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 76;BA.debugLine="L_Estado_1.Visible = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="L_Estado_2.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 78;BA.debugLine="B_Guardar.Visible = False";
Debug.ShouldStop(8192);
__ref.getField(false,"_b_guardar" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="TBL_Calcular.ClearRows";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 80;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
Debug.ShouldStop(32768);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 81;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 82;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 83;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
Debug.ShouldStop(262144);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 84;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
Debug.ShouldStop(524288);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 85;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 5)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 86;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
Debug.ShouldStop(2097152);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 6)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sp_mes_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SP_Mes_ItemClick (b4xcalcular) ","b4xcalcular",2,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("sp_mes_itemclick")) { return __ref.runUserSub(false, "b4xcalcular","sp_mes_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 105;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
Debug.ShouldStop(256);
 BA.debugLineNum = 106;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
Debug.ShouldStop(512);
b4xcalcular._main._mmes /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 107;BA.debugLine="L_Estado_1.Visible = False";
Debug.ShouldStop(1024);
__ref.getField(false,"_l_estado_1" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 108;BA.debugLine="L_Estado_2.Visible = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_l_estado_2" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 109;BA.debugLine="B_Guardar.Visible = False";
Debug.ShouldStop(4096);
__ref.getField(false,"_b_guardar" /*RemoteObject*/ ).runMethod(true,"setVisible",b4xcalcular.__c.getField(true,"False"));
 BA.debugLineNum = 110;BA.debugLine="TBL_Calcular.ClearRows";
Debug.ShouldStop(8192);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 111;BA.debugLine="TBL_Calcular.SetColCustomize(0, xui.Color_RGB(0,";
Debug.ShouldStop(16384);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 112;BA.debugLine="TBL_Calcular.SetColCustomize(1, xui.Color_RGB(0,";
Debug.ShouldStop(32768);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 113;BA.debugLine="TBL_Calcular.SetColCustomize(2, xui.Color_RGB(0,";
Debug.ShouldStop(65536);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 114;BA.debugLine="TBL_Calcular.SetColCustomize(3, xui.Color_RGB(0,";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 115;BA.debugLine="TBL_Calcular.SetColCustomize(4, xui.Color_RGB(0,";
Debug.ShouldStop(262144);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 116;BA.debugLine="TBL_Calcular.SetColCustomize(5, xui.Color_RGB(0,";
Debug.ShouldStop(524288);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 5)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 117;BA.debugLine="TBL_Calcular.SetColCustomize(6, xui.Color_RGB(0,";
Debug.ShouldStop(1048576);
__ref.getField(false,"_tbl_calcular" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 6)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 12)))));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}