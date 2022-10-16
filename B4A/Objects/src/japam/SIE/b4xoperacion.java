package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xoperacion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xoperacion");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xoperacion.class).invoke(this, new Object[] {null});
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
public b4j.example.flexgrid _tbl_pozos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_proceder = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_guardar = null;
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
public String  _b_guardar_click(japam.SIE.b4xoperacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "b_guardar_click", false))
	 {return ((String) Debug.delegate(ba, "b_guardar_click", null));}
int _x = 0;
String[] _mclaves = null;
String[] _mdescripciones = null;
int[] _mextraidos = null;
boolean _mcompletos = false;
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Private Sub B_Guardar_Click";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="Dim mCLAVES(50), mDESCRIPCIONES(50) As String";
_mclaves = new String[(int) (50)];
java.util.Arrays.fill(_mclaves,"");
_mdescripciones = new String[(int) (50)];
java.util.Arrays.fill(_mdescripciones,"");
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="Dim mEXTRAIDOS(50) As Int";
_mextraidos = new int[(int) (50)];
;
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
RDebugUtils.currentLine=41156614;
 //BA.debugLineNum = 41156614;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=41156615;
 //BA.debugLineNum = 41156615;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step6 = 1;
final int limit6 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit6 ;_x = _x + step6 ) {
RDebugUtils.currentLine=41156616;
 //BA.debugLineNum = 41156616;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_Pozos.GetCellValue(";
_mextraidos[_x] = (int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_pozos /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T")));
RDebugUtils.currentLine=41156617;
 //BA.debugLineNum = 41156617;BA.debugLine="If mEXTRAIDOS(x) = 0 Then";
if (_mextraidos[_x]==0) { 
RDebugUtils.currentLine=41156618;
 //BA.debugLineNum = 41156618;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
RDebugUtils.currentLine=41156619;
 //BA.debugLineNum = 41156619;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=41156623;
 //BA.debugLineNum = 41156623;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=41156625;
 //BA.debugLineNum = 41156625;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
RDebugUtils.currentLine=41156626;
 //BA.debugLineNum = 41156626;BA.debugLine="If mSQL.IsInitialized  Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=41156627;
 //BA.debugLineNum = 41156627;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step16 = 1;
final int limit16 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=41156628;
 //BA.debugLineNum = 41156628;BA.debugLine="mCLAVES(x) = TBL_Pozos.GetCellValue(x, 0)";
_mclaves[_x] = BA.ObjectToString(__ref._tbl_pozos /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=41156629;
 //BA.debugLineNum = 41156629;BA.debugLine="mDESCRIPCIONES(x) = TBL_Pozos.GetCellValue(x,";
_mdescripciones[_x] = BA.ObjectToString(__ref._tbl_pozos /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1)));
RDebugUtils.currentLine=41156630;
 //BA.debugLineNum = 41156630;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_Pozos.GetCellValu";
_mextraidos[_x] = (int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_pozos /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (2))),"T")));
RDebugUtils.currentLine=41156631;
 //BA.debugLineNum = 41156631;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=41156633;
 //BA.debugLineNum = 41156633;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_ene = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 1: {
RDebugUtils.currentLine=41156635;
 //BA.debugLineNum = 41156635;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_feb = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 2: {
RDebugUtils.currentLine=41156637;
 //BA.debugLineNum = 41156637;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_mar = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 3: {
RDebugUtils.currentLine=41156639;
 //BA.debugLineNum = 41156639;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_abr = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 4: {
RDebugUtils.currentLine=41156641;
 //BA.debugLineNum = 41156641;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_may = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 5: {
RDebugUtils.currentLine=41156643;
 //BA.debugLineNum = 41156643;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_jun = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 6: {
RDebugUtils.currentLine=41156645;
 //BA.debugLineNum = 41156645;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_jul = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 7: {
RDebugUtils.currentLine=41156647;
 //BA.debugLineNum = 41156647;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_ago = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 8: {
RDebugUtils.currentLine=41156649;
 //BA.debugLineNum = 41156649;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_sep = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 9: {
RDebugUtils.currentLine=41156651;
 //BA.debugLineNum = 41156651;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_oct = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 10: {
RDebugUtils.currentLine=41156653;
 //BA.debugLineNum = 41156653;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_nov = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 11: {
RDebugUtils.currentLine=41156655;
 //BA.debugLineNum = 41156655;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_extraido SET ext_dic = "+BA.NumberToString(_mextraidos[_x])+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=41156660;
 //BA.debugLineNum = 41156660;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=41156662;
 //BA.debugLineNum = 41156662;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura"),BA.ObjectToCharSequence("Alerta"));
 };
RDebugUtils.currentLine=41156664;
 //BA.debugLineNum = 41156664;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xoperacion __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
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
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=41353223;
 //BA.debugLineNum = 41353223;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=41353224;
 //BA.debugLineNum = 41353224;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=41353225;
 //BA.debugLineNum = 41353225;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=41353226;
 //BA.debugLineNum = 41353226;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=41353227;
 //BA.debugLineNum = 41353227;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=41353228;
 //BA.debugLineNum = 41353228;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=41353230;
 //BA.debugLineNum = 41353230;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=41353231;
 //BA.debugLineNum = 41353231;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=41353232;
 //BA.debugLineNum = 41353232;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=41353233;
 //BA.debugLineNum = 41353233;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=41353234;
 //BA.debugLineNum = 41353234;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=41353235;
 //BA.debugLineNum = 41353235;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=41353236;
 //BA.debugLineNum = 41353236;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=41353237;
 //BA.debugLineNum = 41353237;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=41353238;
 //BA.debugLineNum = 41353238;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=41353239;
 //BA.debugLineNum = 41353239;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=41353240;
 //BA.debugLineNum = 41353240;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=41353241;
 //BA.debugLineNum = 41353241;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=41353243;
 //BA.debugLineNum = 41353243;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=41353245;
 //BA.debugLineNum = 41353245;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=41353246;
 //BA.debugLineNum = 41353246;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=41353248;
 //BA.debugLineNum = 41353248;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=41353250;
 //BA.debugLineNum = 41353250;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=41353251;
 //BA.debugLineNum = 41353251;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=41353252;
 //BA.debugLineNum = 41353252;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=41353253;
 //BA.debugLineNum = 41353253;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=41353255;
 //BA.debugLineNum = 41353255;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=41353256;
 //BA.debugLineNum = 41353256;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=41353257;
 //BA.debugLineNum = 41353257;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=41353259;
 //BA.debugLineNum = 41353259;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=41353260;
 //BA.debugLineNum = 41353260;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=41353261;
 //BA.debugLineNum = 41353261;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=41353262;
 //BA.debugLineNum = 41353262;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=41353264;
 //BA.debugLineNum = 41353264;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=41353265;
 //BA.debugLineNum = 41353265;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=41353266;
 //BA.debugLineNum = 41353266;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=41353268;
 //BA.debugLineNum = 41353268;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=41353270;
 //BA.debugLineNum = 41353270;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=41353271;
 //BA.debugLineNum = 41353271;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=41353273;
 //BA.debugLineNum = 41353273;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=41353274;
 //BA.debugLineNum = 41353274;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=41353275;
 //BA.debugLineNum = 41353275;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=41353277;
 //BA.debugLineNum = 41353277;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=41353278;
 //BA.debugLineNum = 41353278;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=41353280;
 //BA.debugLineNum = 41353280;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=41353281;
 //BA.debugLineNum = 41353281;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=41353285;
 //BA.debugLineNum = 41353285;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=41353286;
 //BA.debugLineNum = 41353286;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=41353287;
 //BA.debugLineNum = 41353287;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=41353288;
 //BA.debugLineNum = 41353288;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=41353289;
 //BA.debugLineNum = 41353289;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=41353290;
 //BA.debugLineNum = 41353290;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=41353291;
 //BA.debugLineNum = 41353291;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=41353292;
 //BA.debugLineNum = 41353292;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=41353294;
 //BA.debugLineNum = 41353294;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=41353295;
 //BA.debugLineNum = 41353295;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=41353296;
 //BA.debugLineNum = 41353296;BA.debugLine="End Sub";
return null;
}
public String  _b_proceder_mouseclick(japam.SIE.b4xoperacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "b_proceder_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "b_proceder_mouseclick", null));}
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Private Sub B_Proceder_MouseClick";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="Cargar_Valores";
__ref._cargar_valores /*String*/ (null);
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor(japam.SIE.b4xoperacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores(japam.SIE.b4xoperacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "cargar_valores", false))
	 {return ((String) Debug.delegate(ba, "cargar_valores", null));}
int _x = 0;
String[] _mclaves = null;
String[] _mdescripciones = null;
int[] _mextraidos = null;
String _mcadena = "";
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Sub Cargar_Valores()";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="Dim mCLAVES(50), mDESCRIPCIONES(50) As String";
_mclaves = new String[(int) (50)];
java.util.Arrays.fill(_mclaves,"");
_mdescripciones = new String[(int) (50)];
java.util.Arrays.fill(_mdescripciones,"");
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="Dim mEXTRAIDOS(50) As Int";
_mextraidos = new int[(int) (50)];
;
RDebugUtils.currentLine=40960005;
 //BA.debugLineNum = 40960005;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=40960007;
 //BA.debugLineNum = 40960007;BA.debugLine="TBL_Pozos.ClearRows";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=40960008;
 //BA.debugLineNum = 40960008;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=40960009;
 //BA.debugLineNum = 40960009;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_extraido";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_extraido WHERE ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=40960010;
 //BA.debugLineNum = 40960010;BA.debugLine="Main.mULT_EXTRAIDO = -1";
_main._mult_extraido /*int*/  = (int) (-1);
RDebugUtils.currentLine=40960011;
 //BA.debugLineNum = 40960011;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=40960012;
 //BA.debugLineNum = 40960012;BA.debugLine="Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1";
_main._mult_extraido /*int*/  = (int) (_main._mult_extraido /*int*/ +1);
RDebugUtils.currentLine=40960013;
 //BA.debugLineNum = 40960013;BA.debugLine="mCLAVES(Main.mULT_EXTRAIDO) = mRS.GetString(\"ex";
_mclaves[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_clave");
RDebugUtils.currentLine=40960014;
 //BA.debugLineNum = 40960014;BA.debugLine="mDESCRIPCIONES(Main.mULT_EXTRAIDO) = mRS.GetStr";
_mdescripciones[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_descripcion");
RDebugUtils.currentLine=40960015;
 //BA.debugLineNum = 40960015;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=40960017;
 //BA.debugLineNum = 40960017;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_ene")));
 break; }
case 1: {
RDebugUtils.currentLine=40960019;
 //BA.debugLineNum = 40960019;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_feb")));
 break; }
case 2: {
RDebugUtils.currentLine=40960021;
 //BA.debugLineNum = 40960021;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_mar")));
 break; }
case 3: {
RDebugUtils.currentLine=40960023;
 //BA.debugLineNum = 40960023;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_abr")));
 break; }
case 4: {
RDebugUtils.currentLine=40960025;
 //BA.debugLineNum = 40960025;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_may")));
 break; }
case 5: {
RDebugUtils.currentLine=40960027;
 //BA.debugLineNum = 40960027;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_jun")));
 break; }
case 6: {
RDebugUtils.currentLine=40960029;
 //BA.debugLineNum = 40960029;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_jul")));
 break; }
case 7: {
RDebugUtils.currentLine=40960031;
 //BA.debugLineNum = 40960031;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_ago")));
 break; }
case 8: {
RDebugUtils.currentLine=40960033;
 //BA.debugLineNum = 40960033;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_sep")));
 break; }
case 9: {
RDebugUtils.currentLine=40960035;
 //BA.debugLineNum = 40960035;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_oct")));
 break; }
case 10: {
RDebugUtils.currentLine=40960037;
 //BA.debugLineNum = 40960037;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_nov")));
 break; }
case 11: {
RDebugUtils.currentLine=40960039;
 //BA.debugLineNum = 40960039;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = (int)(Double.parseDouble(__ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ext_dic")));
 break; }
}
;
 }
;
RDebugUtils.currentLine=40960042;
 //BA.debugLineNum = 40960042;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step41 = 1;
final int limit41 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit41 ;_x = _x + step41 ) {
RDebugUtils.currentLine=40960044;
 //BA.debugLineNum = 40960044;BA.debugLine="mCADENA = mFORMATO(mEXTRAIDOS(x).As(String), \"N";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(BA.NumberToString(_mextraidos[_x])),"N"));
RDebugUtils.currentLine=40960046;
 //BA.debugLineNum = 40960046;BA.debugLine="TBL_Pozos.AddRow(Array As Object(mCLAVES(x), mD";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mclaves[_x]),(Object)(_mdescripciones[_x]),(Object)(_mcadena)},__c.True);
 }
};
RDebugUtils.currentLine=40960048;
 //BA.debugLineNum = 40960048;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=40960050;
 //BA.debugLineNum = 40960050;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("240960050","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
RDebugUtils.currentLine=40960052;
 //BA.debugLineNum = 40960052;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xoperacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xoperacion __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=40697859;
 //BA.debugLineNum = 40697859;BA.debugLine="Log(\"B4XOperacion\")";
__c.LogImpl("240697859","B4XOperacion",0);
RDebugUtils.currentLine=40697860;
 //BA.debugLineNum = 40697860;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=40697861;
 //BA.debugLineNum = 40697861;BA.debugLine="Root.LoadLayout(\"Operacion\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Operacion",ba);
RDebugUtils.currentLine=40697862;
 //BA.debugLineNum = 40697862;BA.debugLine="TBL_Pozos.ClearRows";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=40697863;
 //BA.debugLineNum = 40697863;BA.debugLine="TBL_Pozos.ColsName=Array As String(\"Pozo\", \"Denom";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Pozo","Denominación","Extraido"});
RDebugUtils.currentLine=40697864;
 //BA.debugLineNum = 40697864;BA.debugLine="TBL_Pozos.ColsWidth=Array As Int(80dip, 202dip, 8";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (202)),__c.DipToCurrent((int) (80))});
RDebugUtils.currentLine=40697865;
 //BA.debugLineNum = 40697865;BA.debugLine="TBL_Pozos.ColsType=Array As Int(TBL_Pozos.TypeStr";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_pozos /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_pozos /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_pozos /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=40697866;
 //BA.debugLineNum = 40697866;BA.debugLine="TBL_Pozos.ColsAlignment=Array As String(\"CENTER\",";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"CENTER","LEFT","CENTER"});
RDebugUtils.currentLine=40697867;
 //BA.debugLineNum = 40697867;BA.debugLine="TBL_Pozos.SetColCustomize(0, xui.Color_RGB(0, 0,";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=40697868;
 //BA.debugLineNum = 40697868;BA.debugLine="TBL_Pozos.SetColCustomize(1, xui.Color_RGB(0, 0,";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=40697869;
 //BA.debugLineNum = 40697869;BA.debugLine="TBL_Pozos.SetColCustomize(2, xui.Color_RGB(0, 0,";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=40697871;
 //BA.debugLineNum = 40697871;BA.debugLine="For x = 2021 To 2027";
{
final int step13 = 1;
final int limit13 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit13 ;_x = _x + step13 ) {
RDebugUtils.currentLine=40697873;
 //BA.debugLineNum = 40697873;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=40697876;
 //BA.debugLineNum = 40697876;BA.debugLine="For x = 1 To 12";
{
final int step16 = 1;
final int limit16 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=40697878;
 //BA.debugLineNum = 40697878;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=40697880;
 //BA.debugLineNum = 40697880;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xoperacion __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=40566788;
 //BA.debugLineNum = 40566788;BA.debugLine="Private TBL_Pozos As FlexGrid";
_tbl_pozos = new b4j.example.flexgrid();
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=40566790;
 //BA.debugLineNum = 40566790;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=40566791;
 //BA.debugLineNum = 40566791;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=40566792;
 //BA.debugLineNum = 40566792;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=40566793;
 //BA.debugLineNum = 40566793;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=40566794;
 //BA.debugLineNum = 40566794;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.SIE.sd_sql();
RDebugUtils.currentLine=40566795;
 //BA.debugLineNum = 40566795;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=40566796;
 //BA.debugLineNum = 40566796;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xoperacion __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xoperacion __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xoperacion __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="End Sub";
return "";
}
public String  _tbl_pozos_cellclick(japam.SIE.b4xoperacion __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "tbl_pozos_cellclick", false))
	 {return ((String) Debug.delegate(ba, "tbl_pozos_cellclick", new Object[] {_row,_col}));}
int _mvalor = 0;
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Private Sub TBL_Pozos_CellClick(Row As Int, Col As";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="If Col = 2 Then";
if (_col==2) { 
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="mVALOR = mFORMATO(TBL_Pozos.GetCellValue(Row, Co";
_mvalor = ((int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_pozos /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"T"))));
RDebugUtils.currentLine=41025541;
 //BA.debugLineNum = 41025541;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=41025542;
 //BA.debugLineNum = 41025542;BA.debugLine="TBL_Pozos.EditCellonsite(Row, Col)";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._editcellonsite(_row,_col);
 };
 };
RDebugUtils.currentLine=41025545;
 //BA.debugLineNum = 41025545;BA.debugLine="End Sub";
return "";
}
public String  _tbl_pozos_modified(japam.SIE.b4xoperacion __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xoperacion";
if (Debug.shouldDelegate(ba, "tbl_pozos_modified", false))
	 {return ((String) Debug.delegate(ba, "tbl_pozos_modified", new Object[] {_row,_col}));}
String _mcadena = "";
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Private Sub TBL_Pozos_Modified(Row As Int, Col As";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="mCADENA = NumberFormat(TBL_Pozos.GetCellValue(Row";
_mcadena = __c.NumberFormat((double)(BA.ObjectToNumber(__ref._tbl_pozos /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col))),(int) (2),(int) (0));
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="TBL_Pozos.SetCellValue(Row, Col, mCADENA)";
__ref._tbl_pozos /*b4j.example.flexgrid*/ ._setcellvalue(_row,_col,(Object)(_mcadena));
RDebugUtils.currentLine=41091077;
 //BA.debugLineNum = 41091077;BA.debugLine="End Sub";
return "";
}
}