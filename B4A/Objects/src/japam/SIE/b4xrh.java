package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xrh extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xrh");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xrh.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _b_proceder = null;
public b4j.example.flexgrid _tbl_rh = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_guardar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_anio = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _sp_mes = null;
public japam.SIE.sd_sql _msql = null;
public japam.SIE.sd_resultset _mrs = null;
public b4a.example.dateutils _dateutils = null;
public japam.SIE.main _main = null;
public japam.SIE.starter _starter = null;
public japam.SIE.b4xpages _b4xpages = null;
public japam.SIE.b4xcollections _b4xcollections = null;
public japam.SIE.xuiviewsutils _xuiviewsutils = null;
public String  _b_guardar_click(japam.SIE.b4xrh __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "b_guardar_click", false))
	 {return ((String) Debug.delegate(ba, "b_guardar_click", null));}
int _x = 0;
String[] _mdatos = null;
String[] _mextraidos = null;
boolean _mcompletos = false;
int _anio = 0;
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Private Sub B_Guardar_Click";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="Dim mDATOS(50), mEXTRAIDOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
_mextraidos = new String[(int) (50)];
java.util.Arrays.fill(_mextraidos,"");
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="Dim ANIO As Int";
_anio = 0;
RDebugUtils.currentLine=42008582;
 //BA.debugLineNum = 42008582;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
RDebugUtils.currentLine=42008583;
 //BA.debugLineNum = 42008583;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=42008584;
 //BA.debugLineNum = 42008584;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step7 = 1;
final int limit7 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
RDebugUtils.currentLine=42008585;
 //BA.debugLineNum = 42008585;BA.debugLine="mDATOS(x) = TBL_RH.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=42008586;
 //BA.debugLineNum = 42008586;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_RH.GetCellValue(x,";
_mextraidos[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T"));
RDebugUtils.currentLine=42008587;
 //BA.debugLineNum = 42008587;BA.debugLine="If mEXTRAIDOS(x) = 0 Then";
if ((_mextraidos[_x]).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=42008588;
 //BA.debugLineNum = 42008588;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
RDebugUtils.currentLine=42008589;
 //BA.debugLineNum = 42008589;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=42008593;
 //BA.debugLineNum = 42008593;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=42008595;
 //BA.debugLineNum = 42008595;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
RDebugUtils.currentLine=42008596;
 //BA.debugLineNum = 42008596;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=42008597;
 //BA.debugLineNum = 42008597;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step18 = 1;
final int limit18 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit18 ;_x = _x + step18 ) {
RDebugUtils.currentLine=42008598;
 //BA.debugLineNum = 42008598;BA.debugLine="mDATOS(x) = TBL_RH.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=42008599;
 //BA.debugLineNum = 42008599;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_RH.GetCellValue(x";
_mextraidos[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T"));
RDebugUtils.currentLine=42008600;
 //BA.debugLineNum = 42008600;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=42008602;
 //BA.debugLineNum = 42008602;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_ene = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 1: {
RDebugUtils.currentLine=42008604;
 //BA.debugLineNum = 42008604;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_feb = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 2: {
RDebugUtils.currentLine=42008606;
 //BA.debugLineNum = 42008606;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_mar = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 3: {
RDebugUtils.currentLine=42008608;
 //BA.debugLineNum = 42008608;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_abr = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 4: {
RDebugUtils.currentLine=42008610;
 //BA.debugLineNum = 42008610;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_may = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 5: {
RDebugUtils.currentLine=42008612;
 //BA.debugLineNum = 42008612;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_jun = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 6: {
RDebugUtils.currentLine=42008614;
 //BA.debugLineNum = 42008614;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_jul = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 7: {
RDebugUtils.currentLine=42008616;
 //BA.debugLineNum = 42008616;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_ago = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 8: {
RDebugUtils.currentLine=42008618;
 //BA.debugLineNum = 42008618;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_sep = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 9: {
RDebugUtils.currentLine=42008620;
 //BA.debugLineNum = 42008620;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_oct = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 10: {
RDebugUtils.currentLine=42008622;
 //BA.debugLineNum = 42008622;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_nov = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 11: {
RDebugUtils.currentLine=42008624;
 //BA.debugLineNum = 42008624;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE dbo.sie_valores SET val_dic = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=42008629;
 //BA.debugLineNum = 42008629;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=42008631;
 //BA.debugLineNum = 42008631;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura"),BA.ObjectToCharSequence("Alerta"));
 };
RDebugUtils.currentLine=42008633;
 //BA.debugLineNum = 42008633;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xrh __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
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
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=42205191;
 //BA.debugLineNum = 42205191;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=42205192;
 //BA.debugLineNum = 42205192;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=42205193;
 //BA.debugLineNum = 42205193;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=42205194;
 //BA.debugLineNum = 42205194;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=42205195;
 //BA.debugLineNum = 42205195;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=42205196;
 //BA.debugLineNum = 42205196;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=42205198;
 //BA.debugLineNum = 42205198;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=42205199;
 //BA.debugLineNum = 42205199;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=42205200;
 //BA.debugLineNum = 42205200;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=42205201;
 //BA.debugLineNum = 42205201;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=42205202;
 //BA.debugLineNum = 42205202;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=42205203;
 //BA.debugLineNum = 42205203;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=42205204;
 //BA.debugLineNum = 42205204;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=42205205;
 //BA.debugLineNum = 42205205;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=42205206;
 //BA.debugLineNum = 42205206;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=42205207;
 //BA.debugLineNum = 42205207;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=42205208;
 //BA.debugLineNum = 42205208;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=42205209;
 //BA.debugLineNum = 42205209;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=42205211;
 //BA.debugLineNum = 42205211;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=42205213;
 //BA.debugLineNum = 42205213;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=42205214;
 //BA.debugLineNum = 42205214;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=42205216;
 //BA.debugLineNum = 42205216;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=42205218;
 //BA.debugLineNum = 42205218;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=42205219;
 //BA.debugLineNum = 42205219;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=42205220;
 //BA.debugLineNum = 42205220;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=42205221;
 //BA.debugLineNum = 42205221;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=42205223;
 //BA.debugLineNum = 42205223;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=42205224;
 //BA.debugLineNum = 42205224;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=42205225;
 //BA.debugLineNum = 42205225;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=42205227;
 //BA.debugLineNum = 42205227;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=42205228;
 //BA.debugLineNum = 42205228;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=42205229;
 //BA.debugLineNum = 42205229;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=42205230;
 //BA.debugLineNum = 42205230;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=42205232;
 //BA.debugLineNum = 42205232;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=42205233;
 //BA.debugLineNum = 42205233;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=42205234;
 //BA.debugLineNum = 42205234;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=42205236;
 //BA.debugLineNum = 42205236;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=42205238;
 //BA.debugLineNum = 42205238;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=42205239;
 //BA.debugLineNum = 42205239;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=42205241;
 //BA.debugLineNum = 42205241;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=42205242;
 //BA.debugLineNum = 42205242;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=42205243;
 //BA.debugLineNum = 42205243;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=42205245;
 //BA.debugLineNum = 42205245;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=42205246;
 //BA.debugLineNum = 42205246;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=42205248;
 //BA.debugLineNum = 42205248;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=42205249;
 //BA.debugLineNum = 42205249;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=42205253;
 //BA.debugLineNum = 42205253;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=42205254;
 //BA.debugLineNum = 42205254;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=42205255;
 //BA.debugLineNum = 42205255;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=42205256;
 //BA.debugLineNum = 42205256;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=42205257;
 //BA.debugLineNum = 42205257;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=42205258;
 //BA.debugLineNum = 42205258;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=42205259;
 //BA.debugLineNum = 42205259;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=42205260;
 //BA.debugLineNum = 42205260;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=42205262;
 //BA.debugLineNum = 42205262;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=42205263;
 //BA.debugLineNum = 42205263;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=42205264;
 //BA.debugLineNum = 42205264;BA.debugLine="End Sub";
return null;
}
public String  _b_proceder_mouseclick(japam.SIE.b4xrh __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "b_proceder_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "b_proceder_mouseclick", null));}
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Private Sub B_Proceder_MouseClick";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="Cargar_Valores";
__ref._cargar_valores /*String*/ (null);
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor(japam.SIE.b4xrh __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores(japam.SIE.b4xrh __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "cargar_valores", false))
	 {return ((String) Debug.delegate(ba, "cargar_valores", null));}
int _x = 0;
String[] _mdatos = null;
String[] _mvalores = null;
String _mcadena = "";
int _anio = 0;
int _mes = 0;
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Sub Cargar_Valores()";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="Dim mDATOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="Dim mVALORES(50) As String";
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="Dim ANIO, MES As Int";
_anio = 0;
_mes = 0;
RDebugUtils.currentLine=41811976;
 //BA.debugLineNum = 41811976;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
RDebugUtils.currentLine=41811977;
 //BA.debugLineNum = 41811977;BA.debugLine="MES = Main.mMES";
_mes = _main._mmes /*int*/ ;
RDebugUtils.currentLine=41811978;
 //BA.debugLineNum = 41811978;BA.debugLine="TBL_RH.ClearRows";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=41811979;
 //BA.debugLineNum = 41811979;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=41811980;
 //BA.debugLineNum = 41811980;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_valores WHERE val_derecho = 5 AND val_anio = "+BA.NumberToString(_anio));
RDebugUtils.currentLine=41811981;
 //BA.debugLineNum = 41811981;BA.debugLine="Main.mULT_DATOS = -1";
_main._mult_datos /*int*/  = (int) (-1);
RDebugUtils.currentLine=41811982;
 //BA.debugLineNum = 41811982;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=41811983;
 //BA.debugLineNum = 41811983;BA.debugLine="Main.mULT_DATOS = Main.mULT_DATOS + 1";
_main._mult_datos /*int*/  = (int) (_main._mult_datos /*int*/ +1);
RDebugUtils.currentLine=41811984;
 //BA.debugLineNum = 41811984;BA.debugLine="mDATOS(Main.mULT_DATOS) = mRS.GetString(\"val_de";
_mdatos[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_descripcion");
RDebugUtils.currentLine=41811985;
 //BA.debugLineNum = 41811985;BA.debugLine="Select Case MES";
switch (_mes) {
case 1: {
RDebugUtils.currentLine=41811987;
 //BA.debugLineNum = 41811987;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ene");
 break; }
case 2: {
RDebugUtils.currentLine=41811989;
 //BA.debugLineNum = 41811989;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_feb");
 break; }
case 3: {
RDebugUtils.currentLine=41811991;
 //BA.debugLineNum = 41811991;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_mar");
 break; }
case 4: {
RDebugUtils.currentLine=41811993;
 //BA.debugLineNum = 41811993;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_abr");
 break; }
case 5: {
RDebugUtils.currentLine=41811995;
 //BA.debugLineNum = 41811995;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_may");
 break; }
case 6: {
RDebugUtils.currentLine=41811997;
 //BA.debugLineNum = 41811997;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jun");
 break; }
case 7: {
RDebugUtils.currentLine=41811999;
 //BA.debugLineNum = 41811999;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jul");
 break; }
case 8: {
RDebugUtils.currentLine=41812001;
 //BA.debugLineNum = 41812001;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ago");
 break; }
case 9: {
RDebugUtils.currentLine=41812003;
 //BA.debugLineNum = 41812003;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_sep");
 break; }
case 10: {
RDebugUtils.currentLine=41812005;
 //BA.debugLineNum = 41812005;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_oct");
 break; }
case 11: {
RDebugUtils.currentLine=41812007;
 //BA.debugLineNum = 41812007;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_nov");
 break; }
case 12: {
RDebugUtils.currentLine=41812009;
 //BA.debugLineNum = 41812009;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_dic");
 break; }
}
;
 }
;
RDebugUtils.currentLine=41812012;
 //BA.debugLineNum = 41812012;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step43 = 1;
final int limit43 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit43 ;_x = _x + step43 ) {
RDebugUtils.currentLine=41812013;
 //BA.debugLineNum = 41812013;BA.debugLine="If x < 1 Then";
if (_x<1) { 
RDebugUtils.currentLine=41812014;
 //BA.debugLineNum = 41812014;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"T\"";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mvalores[_x]),"T"));
 }else {
RDebugUtils.currentLine=41812016;
 //BA.debugLineNum = 41812016;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"N\"";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mvalores[_x]),"N"));
 };
RDebugUtils.currentLine=41812019;
 //BA.debugLineNum = 41812019;BA.debugLine="TBL_RH.AddRow(Array As Object(mDATOS(x), mCADEN";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mdatos[_x]),(Object)(_mcadena)},__c.True);
 }
};
RDebugUtils.currentLine=41812021;
 //BA.debugLineNum = 41812021;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=41812023;
 //BA.debugLineNum = 41812023;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("241812023","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
RDebugUtils.currentLine=41812025;
 //BA.debugLineNum = 41812025;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xrh __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=42074118;
 //BA.debugLineNum = 42074118;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xrh __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="Log(\"B4XRH\")";
__c.LogImpl("241549827","B4XRH",0);
RDebugUtils.currentLine=41549828;
 //BA.debugLineNum = 41549828;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=41549829;
 //BA.debugLineNum = 41549829;BA.debugLine="Root.LoadLayout(\"RH\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("RH",ba);
RDebugUtils.currentLine=41549830;
 //BA.debugLineNum = 41549830;BA.debugLine="TBL_RH.ColsName=Array As String(\"Dato\", \"Valor\")";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Dato","Valor"});
RDebugUtils.currentLine=41549831;
 //BA.debugLineNum = 41549831;BA.debugLine="TBL_RH.ColsWidth=Array As Int(220dip, 150dip)";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (220)),__c.DipToCurrent((int) (150))});
RDebugUtils.currentLine=41549832;
 //BA.debugLineNum = 41549832;BA.debugLine="TBL_RH.ColsType=Array As Int(TBL_RH.TypeString, T";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_rh /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_rh /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=41549833;
 //BA.debugLineNum = 41549833;BA.debugLine="TBL_RH.ColsAlignment=Array As String(\"CENTER\", \"C";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"CENTER","CENTER"});
RDebugUtils.currentLine=41549834;
 //BA.debugLineNum = 41549834;BA.debugLine="TBL_RH.SetColCustomize(0, xui.Color_RGB(0, 0, 255";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=41549835;
 //BA.debugLineNum = 41549835;BA.debugLine="TBL_RH.SetColCustomize(1, xui.Color_RGB(0, 0, 255";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=41549836;
 //BA.debugLineNum = 41549836;BA.debugLine="TBL_RH.SetColCustomize(2, xui.Color_RGB(0, 0, 255";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=41549838;
 //BA.debugLineNum = 41549838;BA.debugLine="For x = 2021 To 2027";
{
final int step12 = 1;
final int limit12 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=41549840;
 //BA.debugLineNum = 41549840;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=41549843;
 //BA.debugLineNum = 41549843;BA.debugLine="For x = 1 To 12";
{
final int step15 = 1;
final int limit15 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit15 ;_x = _x + step15 ) {
RDebugUtils.currentLine=41549845;
 //BA.debugLineNum = 41549845;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=41549847;
 //BA.debugLineNum = 41549847;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xrh __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=41418756;
 //BA.debugLineNum = 41418756;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=41418757;
 //BA.debugLineNum = 41418757;BA.debugLine="Private TBL_RH As FlexGrid";
_tbl_rh = new b4j.example.flexgrid();
RDebugUtils.currentLine=41418758;
 //BA.debugLineNum = 41418758;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=41418759;
 //BA.debugLineNum = 41418759;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=41418760;
 //BA.debugLineNum = 41418760;BA.debugLine="Private TBL_RH As FlexGrid";
_tbl_rh = new b4j.example.flexgrid();
RDebugUtils.currentLine=41418761;
 //BA.debugLineNum = 41418761;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=41418762;
 //BA.debugLineNum = 41418762;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=41418763;
 //BA.debugLineNum = 41418763;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.SIE.sd_sql();
RDebugUtils.currentLine=41418764;
 //BA.debugLineNum = 41418764;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=41418765;
 //BA.debugLineNum = 41418765;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xrh __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xrh __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xrh __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="End Sub";
return "";
}
public String  _tbl_rh_cellclick(japam.SIE.b4xrh __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "tbl_rh_cellclick", false))
	 {return ((String) Debug.delegate(ba, "tbl_rh_cellclick", new Object[] {_row,_col}));}
int _mvalor = 0;
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Private Sub TBL_RH_CellClick(Row As Int, Col As In";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="If Col >= 1 Then";
if (_col>=1) { 
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="mVALOR = mFORMATO(TBL_RH.GetCellValue(Row, Col),";
_mvalor = ((int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"T"))));
RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="TBL_RH.EditCellonsite(Row, Col)";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._editcellonsite(_row,_col);
 };
 };
RDebugUtils.currentLine=41877513;
 //BA.debugLineNum = 41877513;BA.debugLine="End Sub";
return "";
}
public String  _tbl_rh_modified(japam.SIE.b4xrh __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xrh";
if (Debug.shouldDelegate(ba, "tbl_rh_modified", false))
	 {return ((String) Debug.delegate(ba, "tbl_rh_modified", new Object[] {_row,_col}));}
String _mcadena = "";
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Private Sub TBL_RH_Modified(Row As Int, Col As Int";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="If Row < 2 Then";
if (_row<2) { 
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="mCADENA = mFORMATO(TBL_RH.GetCellValue(Row, Col)";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"M"));
 }else {
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="mCADENA = mFORMATO(TBL_RH.GetCellValue(Row, Col)";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_rh /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"N"));
 };
RDebugUtils.currentLine=41943048;
 //BA.debugLineNum = 41943048;BA.debugLine="TBL_RH.SetCellValue(Row, Col, mCADENA)";
__ref._tbl_rh /*b4j.example.flexgrid*/ ._setcellvalue(_row,_col,(Object)(_mcadena));
RDebugUtils.currentLine=41943049;
 //BA.debugLineNum = 41943049;BA.debugLine="End Sub";
return "";
}
}