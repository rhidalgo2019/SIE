package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcontabilidad extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xcontabilidad");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xcontabilidad.class).invoke(this, new Object[] {null});
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
public b4j.example.flexgrid _tbl_contabilidad = null;
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
public String  _b_guardar_click(japam.SIE.b4xcontabilidad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "b_guardar_click", false))
	 {return ((String) Debug.delegate(ba, "b_guardar_click", null));}
int _x = 0;
String[] _mdatos = null;
String[] _mextraidos = null;
boolean _mcompletos = false;
int _anio = 0;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Private Sub B_Guardar_Click";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="Dim mDATOS(50), mEXTRAIDOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
_mextraidos = new String[(int) (50)];
java.util.Arrays.fill(_mextraidos,"");
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="Dim ANIO As Int";
_anio = 0;
RDebugUtils.currentLine=37486598;
 //BA.debugLineNum = 37486598;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
RDebugUtils.currentLine=37486599;
 //BA.debugLineNum = 37486599;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=37486600;
 //BA.debugLineNum = 37486600;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step7 = 1;
final int limit7 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
RDebugUtils.currentLine=37486601;
 //BA.debugLineNum = 37486601;BA.debugLine="mDATOS(x) = TBL_Contabilidad.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=37486602;
 //BA.debugLineNum = 37486602;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_Contabilidad.GetCel";
_mextraidos[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T"));
RDebugUtils.currentLine=37486603;
 //BA.debugLineNum = 37486603;BA.debugLine="If mEXTRAIDOS(x) = 0 Then";
if ((_mextraidos[_x]).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=37486604;
 //BA.debugLineNum = 37486604;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
RDebugUtils.currentLine=37486605;
 //BA.debugLineNum = 37486605;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=37486609;
 //BA.debugLineNum = 37486609;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=37486611;
 //BA.debugLineNum = 37486611;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
RDebugUtils.currentLine=37486612;
 //BA.debugLineNum = 37486612;BA.debugLine="If mSQL.IsInitialized  Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=37486613;
 //BA.debugLineNum = 37486613;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step18 = 1;
final int limit18 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit18 ;_x = _x + step18 ) {
RDebugUtils.currentLine=37486614;
 //BA.debugLineNum = 37486614;BA.debugLine="mDATOS(x) = TBL_Contabilidad.GetCellValue(x, 0";
_mdatos[_x] = BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=37486615;
 //BA.debugLineNum = 37486615;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_Contabilidad.GetC";
_mextraidos[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T"));
RDebugUtils.currentLine=37486616;
 //BA.debugLineNum = 37486616;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=37486618;
 //BA.debugLineNum = 37486618;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_ene = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 1: {
RDebugUtils.currentLine=37486620;
 //BA.debugLineNum = 37486620;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_feb = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 2: {
RDebugUtils.currentLine=37486622;
 //BA.debugLineNum = 37486622;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_mar = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 3: {
RDebugUtils.currentLine=37486624;
 //BA.debugLineNum = 37486624;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_abr = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 4: {
RDebugUtils.currentLine=37486626;
 //BA.debugLineNum = 37486626;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_may = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 5: {
RDebugUtils.currentLine=37486628;
 //BA.debugLineNum = 37486628;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_jun = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 6: {
RDebugUtils.currentLine=37486630;
 //BA.debugLineNum = 37486630;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_jul = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 7: {
RDebugUtils.currentLine=37486632;
 //BA.debugLineNum = 37486632;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_ago = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 8: {
RDebugUtils.currentLine=37486634;
 //BA.debugLineNum = 37486634;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_sep = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 9: {
RDebugUtils.currentLine=37486636;
 //BA.debugLineNum = 37486636;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_oct = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 10: {
RDebugUtils.currentLine=37486638;
 //BA.debugLineNum = 37486638;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_nov = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 11: {
RDebugUtils.currentLine=37486640;
 //BA.debugLineNum = 37486640;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_dic = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=37486645;
 //BA.debugLineNum = 37486645;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=37486647;
 //BA.debugLineNum = 37486647;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura"),BA.ObjectToCharSequence("Alerta"));
 };
RDebugUtils.currentLine=37486649;
 //BA.debugLineNum = 37486649;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xcontabilidad __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
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
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=37683209;
 //BA.debugLineNum = 37683209;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=37683210;
 //BA.debugLineNum = 37683210;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=37683212;
 //BA.debugLineNum = 37683212;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=37683214;
 //BA.debugLineNum = 37683214;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=37683216;
 //BA.debugLineNum = 37683216;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=37683217;
 //BA.debugLineNum = 37683217;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=37683218;
 //BA.debugLineNum = 37683218;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=37683219;
 //BA.debugLineNum = 37683219;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=37683220;
 //BA.debugLineNum = 37683220;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=37683221;
 //BA.debugLineNum = 37683221;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=37683222;
 //BA.debugLineNum = 37683222;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=37683223;
 //BA.debugLineNum = 37683223;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=37683224;
 //BA.debugLineNum = 37683224;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=37683225;
 //BA.debugLineNum = 37683225;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=37683227;
 //BA.debugLineNum = 37683227;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=37683229;
 //BA.debugLineNum = 37683229;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=37683230;
 //BA.debugLineNum = 37683230;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=37683232;
 //BA.debugLineNum = 37683232;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=37683234;
 //BA.debugLineNum = 37683234;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=37683235;
 //BA.debugLineNum = 37683235;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=37683236;
 //BA.debugLineNum = 37683236;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=37683237;
 //BA.debugLineNum = 37683237;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=37683239;
 //BA.debugLineNum = 37683239;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=37683240;
 //BA.debugLineNum = 37683240;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=37683241;
 //BA.debugLineNum = 37683241;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=37683243;
 //BA.debugLineNum = 37683243;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=37683244;
 //BA.debugLineNum = 37683244;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=37683245;
 //BA.debugLineNum = 37683245;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=37683246;
 //BA.debugLineNum = 37683246;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=37683248;
 //BA.debugLineNum = 37683248;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=37683249;
 //BA.debugLineNum = 37683249;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=37683250;
 //BA.debugLineNum = 37683250;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=37683252;
 //BA.debugLineNum = 37683252;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=37683254;
 //BA.debugLineNum = 37683254;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=37683255;
 //BA.debugLineNum = 37683255;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=37683257;
 //BA.debugLineNum = 37683257;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=37683258;
 //BA.debugLineNum = 37683258;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=37683259;
 //BA.debugLineNum = 37683259;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=37683261;
 //BA.debugLineNum = 37683261;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=37683262;
 //BA.debugLineNum = 37683262;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=37683264;
 //BA.debugLineNum = 37683264;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=37683265;
 //BA.debugLineNum = 37683265;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=37683269;
 //BA.debugLineNum = 37683269;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=37683270;
 //BA.debugLineNum = 37683270;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=37683271;
 //BA.debugLineNum = 37683271;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=37683272;
 //BA.debugLineNum = 37683272;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=37683273;
 //BA.debugLineNum = 37683273;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=37683274;
 //BA.debugLineNum = 37683274;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=37683275;
 //BA.debugLineNum = 37683275;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=37683276;
 //BA.debugLineNum = 37683276;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=37683278;
 //BA.debugLineNum = 37683278;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=37683279;
 //BA.debugLineNum = 37683279;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=37683280;
 //BA.debugLineNum = 37683280;BA.debugLine="End Sub";
return null;
}
public String  _b_proceder_mouseclick(japam.SIE.b4xcontabilidad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "b_proceder_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "b_proceder_mouseclick", null));}
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Private Sub B_Proceder_MouseClick";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="Cargar_Valores";
__ref._cargar_valores /*String*/ (null);
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor(japam.SIE.b4xcontabilidad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores(japam.SIE.b4xcontabilidad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "cargar_valores", false))
	 {return ((String) Debug.delegate(ba, "cargar_valores", null));}
int _x = 0;
String[] _mdatos = null;
String[] _mvalores = null;
String _mcadena = "";
int _anio = 0;
int _mes = 0;
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Sub Cargar_Valores()";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="Dim mDATOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="Dim mVALORES(50) As String";
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=37289990;
 //BA.debugLineNum = 37289990;BA.debugLine="Dim ANIO, MES As Int";
_anio = 0;
_mes = 0;
RDebugUtils.currentLine=37289992;
 //BA.debugLineNum = 37289992;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
RDebugUtils.currentLine=37289993;
 //BA.debugLineNum = 37289993;BA.debugLine="MES = Main.mMES";
_mes = _main._mmes /*int*/ ;
RDebugUtils.currentLine=37289994;
 //BA.debugLineNum = 37289994;BA.debugLine="TBL_Contabilidad.ClearRows";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=37289995;
 //BA.debugLineNum = 37289995;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=37289996;
 //BA.debugLineNum = 37289996;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_valores WHERE val_derecho = 4 AND val_anio = "+BA.NumberToString(_anio));
RDebugUtils.currentLine=37289997;
 //BA.debugLineNum = 37289997;BA.debugLine="Main.mULT_DATOS = -1";
_main._mult_datos /*int*/  = (int) (-1);
RDebugUtils.currentLine=37289998;
 //BA.debugLineNum = 37289998;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=37289999;
 //BA.debugLineNum = 37289999;BA.debugLine="Main.mULT_DATOS = Main.mULT_DATOS + 1";
_main._mult_datos /*int*/  = (int) (_main._mult_datos /*int*/ +1);
RDebugUtils.currentLine=37290000;
 //BA.debugLineNum = 37290000;BA.debugLine="mDATOS(Main.mULT_DATOS) = mRS.GetString(\"val_de";
_mdatos[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_descripcion");
RDebugUtils.currentLine=37290001;
 //BA.debugLineNum = 37290001;BA.debugLine="Select Case MES";
switch (_mes) {
case 1: {
RDebugUtils.currentLine=37290003;
 //BA.debugLineNum = 37290003;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ene");
 break; }
case 2: {
RDebugUtils.currentLine=37290005;
 //BA.debugLineNum = 37290005;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_feb");
 break; }
case 3: {
RDebugUtils.currentLine=37290007;
 //BA.debugLineNum = 37290007;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_mar");
 break; }
case 4: {
RDebugUtils.currentLine=37290009;
 //BA.debugLineNum = 37290009;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_abr");
 break; }
case 5: {
RDebugUtils.currentLine=37290011;
 //BA.debugLineNum = 37290011;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_may");
 break; }
case 6: {
RDebugUtils.currentLine=37290013;
 //BA.debugLineNum = 37290013;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jun");
 break; }
case 7: {
RDebugUtils.currentLine=37290015;
 //BA.debugLineNum = 37290015;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jul");
 break; }
case 8: {
RDebugUtils.currentLine=37290017;
 //BA.debugLineNum = 37290017;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ago");
 break; }
case 9: {
RDebugUtils.currentLine=37290019;
 //BA.debugLineNum = 37290019;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_sep");
 break; }
case 10: {
RDebugUtils.currentLine=37290021;
 //BA.debugLineNum = 37290021;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_oct");
 break; }
case 11: {
RDebugUtils.currentLine=37290023;
 //BA.debugLineNum = 37290023;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_nov");
 break; }
case 12: {
RDebugUtils.currentLine=37290025;
 //BA.debugLineNum = 37290025;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_dic");
 break; }
}
;
 }
;
RDebugUtils.currentLine=37290028;
 //BA.debugLineNum = 37290028;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step43 = 1;
final int limit43 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit43 ;_x = _x + step43 ) {
RDebugUtils.currentLine=37290029;
 //BA.debugLineNum = 37290029;BA.debugLine="If x < 2 Then";
if (_x<2) { 
RDebugUtils.currentLine=37290030;
 //BA.debugLineNum = 37290030;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"M\"";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mvalores[_x]),"M"));
 }else {
RDebugUtils.currentLine=37290032;
 //BA.debugLineNum = 37290032;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"N\"";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mvalores[_x]),"N"));
 };
RDebugUtils.currentLine=37290035;
 //BA.debugLineNum = 37290035;BA.debugLine="TBL_Contabilidad.AddRow(Array As Object(mDATOS(";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mdatos[_x]),(Object)(_mcadena)},__c.True);
 }
};
RDebugUtils.currentLine=37290037;
 //BA.debugLineNum = 37290037;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=37290039;
 //BA.debugLineNum = 37290039;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("237290039","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
RDebugUtils.currentLine=37290041;
 //BA.debugLineNum = 37290041;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xcontabilidad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=37552134;
 //BA.debugLineNum = 37552134;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xcontabilidad __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="Log(\"B4XContabilidad\")";
__c.LogImpl("237027843","B4XContabilidad",0);
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=37027845;
 //BA.debugLineNum = 37027845;BA.debugLine="Root.LoadLayout(\"Contabilidad\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Contabilidad",ba);
RDebugUtils.currentLine=37027846;
 //BA.debugLineNum = 37027846;BA.debugLine="TBL_Contabilidad.ColsName=Array As String(\"Dato\",";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Dato","Valor"});
RDebugUtils.currentLine=37027847;
 //BA.debugLineNum = 37027847;BA.debugLine="TBL_Contabilidad.ColsWidth=Array As Int(220dip, 1";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (220)),__c.DipToCurrent((int) (150))});
RDebugUtils.currentLine=37027848;
 //BA.debugLineNum = 37027848;BA.debugLine="TBL_Contabilidad.ColsType=Array As Int(TBL_Contab";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=37027849;
 //BA.debugLineNum = 37027849;BA.debugLine="TBL_Contabilidad.ColsAlignment=Array As String(\"C";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"CENTER","RIGHT"});
RDebugUtils.currentLine=37027850;
 //BA.debugLineNum = 37027850;BA.debugLine="TBL_Contabilidad.SetColCustomize(0, xui.Color_RGB";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37027851;
 //BA.debugLineNum = 37027851;BA.debugLine="TBL_Contabilidad.SetColCustomize(1, xui.Color_RGB";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37027852;
 //BA.debugLineNum = 37027852;BA.debugLine="TBL_Contabilidad.SetColCustomize(2, xui.Color_RGB";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37027854;
 //BA.debugLineNum = 37027854;BA.debugLine="For x = 2021 To 2027";
{
final int step12 = 1;
final int limit12 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=37027856;
 //BA.debugLineNum = 37027856;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=37027859;
 //BA.debugLineNum = 37027859;BA.debugLine="For x = 1 To 12";
{
final int step15 = 1;
final int limit15 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit15 ;_x = _x + step15 ) {
RDebugUtils.currentLine=37027861;
 //BA.debugLineNum = 37027861;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=37027863;
 //BA.debugLineNum = 37027863;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xcontabilidad __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36896769;
 //BA.debugLineNum = 36896769;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="Private TBL_Contabilidad As FlexGrid";
_tbl_contabilidad = new b4j.example.flexgrid();
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=36896775;
 //BA.debugLineNum = 36896775;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=36896776;
 //BA.debugLineNum = 36896776;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=36896777;
 //BA.debugLineNum = 36896777;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=36896778;
 //BA.debugLineNum = 36896778;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.SIE.sd_sql();
RDebugUtils.currentLine=36896779;
 //BA.debugLineNum = 36896779;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=36896780;
 //BA.debugLineNum = 36896780;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xcontabilidad __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xcontabilidad __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xcontabilidad __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="End Sub";
return "";
}
public String  _tbl_contabilidad_cellclick(japam.SIE.b4xcontabilidad __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "tbl_contabilidad_cellclick", false))
	 {return ((String) Debug.delegate(ba, "tbl_contabilidad_cellclick", new Object[] {_row,_col}));}
int _mvalor = 0;
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Private Sub TBL_Contabilidad_CellClick(Row As Int,";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
RDebugUtils.currentLine=37355523;
 //BA.debugLineNum = 37355523;BA.debugLine="If Col >= 1 Then";
if (_col>=1) { 
RDebugUtils.currentLine=37355524;
 //BA.debugLineNum = 37355524;BA.debugLine="mVALOR = mFORMATO(TBL_Contabilidad.GetCellValue(";
_mvalor = ((int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"T"))));
RDebugUtils.currentLine=37355525;
 //BA.debugLineNum = 37355525;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=37355526;
 //BA.debugLineNum = 37355526;BA.debugLine="TBL_Contabilidad.EditCellonsite(Row, Col)";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._editcellonsite(_row,_col);
 };
 };
RDebugUtils.currentLine=37355529;
 //BA.debugLineNum = 37355529;BA.debugLine="End Sub";
return "";
}
public String  _tbl_contabilidad_modified(japam.SIE.b4xcontabilidad __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcontabilidad";
if (Debug.shouldDelegate(ba, "tbl_contabilidad_modified", false))
	 {return ((String) Debug.delegate(ba, "tbl_contabilidad_modified", new Object[] {_row,_col}));}
String _mcadena = "";
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Private Sub TBL_Contabilidad_Modified(Row As Int,";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=37421059;
 //BA.debugLineNum = 37421059;BA.debugLine="If Row < 2 Then";
if (_row<2) { 
RDebugUtils.currentLine=37421060;
 //BA.debugLineNum = 37421060;BA.debugLine="mCADENA = mFORMATO(TBL_Contabilidad.GetCellValue";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"M"));
 }else {
RDebugUtils.currentLine=37421062;
 //BA.debugLineNum = 37421062;BA.debugLine="mCADENA = mFORMATO(TBL_Contabilidad.GetCellValue";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"N"));
 };
RDebugUtils.currentLine=37421064;
 //BA.debugLineNum = 37421064;BA.debugLine="TBL_Contabilidad.SetCellValue(Row, Col, mCADENA)";
__ref._tbl_contabilidad /*b4j.example.flexgrid*/ ._setcellvalue(_row,_col,(Object)(_mcadena));
RDebugUtils.currentLine=37421065;
 //BA.debugLineNum = 37421065;BA.debugLine="End Sub";
return "";
}
}