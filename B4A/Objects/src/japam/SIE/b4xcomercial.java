package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xcomercial extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xcomercial");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xcomercial.class).invoke(this, new Object[] {null});
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
public b4j.example.flexgrid _tbl_comercial = null;
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
public String  _b_guardar_click(japam.SIE.b4xcomercial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "b_guardar_click", false))
	 {return ((String) Debug.delegate(ba, "b_guardar_click", null));}
int _x = 0;
String[] _mdatos = null;
String[] _mvalores = null;
boolean _mcompletos = false;
int _anio = 0;
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Private Sub B_Guardar_Click";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="Dim mDATOS(50), mVALORES(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="Dim ANIO As Int";
_anio = 0;
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
RDebugUtils.currentLine=36634631;
 //BA.debugLineNum = 36634631;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=36634632;
 //BA.debugLineNum = 36634632;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step7 = 1;
final int limit7 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
RDebugUtils.currentLine=36634633;
 //BA.debugLineNum = 36634633;BA.debugLine="mDATOS(x) = TBL_Comercial.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=36634634;
 //BA.debugLineNum = 36634634;BA.debugLine="mVALORES(x) = mFORMATO(TBL_Comercial.GetCellValu";
_mvalores[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T"));
RDebugUtils.currentLine=36634635;
 //BA.debugLineNum = 36634635;BA.debugLine="If mVALORES(x) = 0 Then";
if ((_mvalores[_x]).equals(BA.NumberToString(0))) { 
RDebugUtils.currentLine=36634636;
 //BA.debugLineNum = 36634636;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
RDebugUtils.currentLine=36634637;
 //BA.debugLineNum = 36634637;BA.debugLine="Exit";
if (true) break;
 };
 }
};
RDebugUtils.currentLine=36634641;
 //BA.debugLineNum = 36634641;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=36634643;
 //BA.debugLineNum = 36634643;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
RDebugUtils.currentLine=36634644;
 //BA.debugLineNum = 36634644;BA.debugLine="If mSQL.IsInitialized  Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=36634645;
 //BA.debugLineNum = 36634645;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step18 = 1;
final int limit18 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit18 ;_x = _x + step18 ) {
RDebugUtils.currentLine=36634646;
 //BA.debugLineNum = 36634646;BA.debugLine="mDATOS(x) = TBL_Comercial.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=36634647;
 //BA.debugLineNum = 36634647;BA.debugLine="mVALORES(x) = mFORMATO(TBL_Comercial.GetCellVa";
_mvalores[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1))),"T"));
RDebugUtils.currentLine=36634648;
 //BA.debugLineNum = 36634648;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=36634650;
 //BA.debugLineNum = 36634650;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_ene = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 1: {
RDebugUtils.currentLine=36634652;
 //BA.debugLineNum = 36634652;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_feb = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 2: {
RDebugUtils.currentLine=36634654;
 //BA.debugLineNum = 36634654;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_mar = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 3: {
RDebugUtils.currentLine=36634656;
 //BA.debugLineNum = 36634656;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_abr = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 4: {
RDebugUtils.currentLine=36634658;
 //BA.debugLineNum = 36634658;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_may = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 5: {
RDebugUtils.currentLine=36634660;
 //BA.debugLineNum = 36634660;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_jun = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 6: {
RDebugUtils.currentLine=36634662;
 //BA.debugLineNum = 36634662;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_jul = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 7: {
RDebugUtils.currentLine=36634664;
 //BA.debugLineNum = 36634664;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_ago = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 8: {
RDebugUtils.currentLine=36634666;
 //BA.debugLineNum = 36634666;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_sep = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 9: {
RDebugUtils.currentLine=36634668;
 //BA.debugLineNum = 36634668;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_oct = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 10: {
RDebugUtils.currentLine=36634670;
 //BA.debugLineNum = 36634670;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_nov = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 11: {
RDebugUtils.currentLine=36634672;
 //BA.debugLineNum = 36634672;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_valores SET va";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_valores SET val_dic = '"+_mvalores[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
}
;
 }
};
 };
 }else {
RDebugUtils.currentLine=36634678;
 //BA.debugLineNum = 36634678;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura"),BA.ObjectToCharSequence("Alerta"));
 };
RDebugUtils.currentLine=36634680;
 //BA.debugLineNum = 36634680;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xcomercial __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
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
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=36831241;
 //BA.debugLineNum = 36831241;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=36831242;
 //BA.debugLineNum = 36831242;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=36831244;
 //BA.debugLineNum = 36831244;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=36831246;
 //BA.debugLineNum = 36831246;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=36831247;
 //BA.debugLineNum = 36831247;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=36831248;
 //BA.debugLineNum = 36831248;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=36831249;
 //BA.debugLineNum = 36831249;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=36831250;
 //BA.debugLineNum = 36831250;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=36831251;
 //BA.debugLineNum = 36831251;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=36831252;
 //BA.debugLineNum = 36831252;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=36831253;
 //BA.debugLineNum = 36831253;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=36831254;
 //BA.debugLineNum = 36831254;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=36831255;
 //BA.debugLineNum = 36831255;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=36831256;
 //BA.debugLineNum = 36831256;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=36831257;
 //BA.debugLineNum = 36831257;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=36831259;
 //BA.debugLineNum = 36831259;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=36831261;
 //BA.debugLineNum = 36831261;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=36831262;
 //BA.debugLineNum = 36831262;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=36831264;
 //BA.debugLineNum = 36831264;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=36831266;
 //BA.debugLineNum = 36831266;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=36831267;
 //BA.debugLineNum = 36831267;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=36831268;
 //BA.debugLineNum = 36831268;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=36831269;
 //BA.debugLineNum = 36831269;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=36831271;
 //BA.debugLineNum = 36831271;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=36831272;
 //BA.debugLineNum = 36831272;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=36831273;
 //BA.debugLineNum = 36831273;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=36831275;
 //BA.debugLineNum = 36831275;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=36831276;
 //BA.debugLineNum = 36831276;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=36831277;
 //BA.debugLineNum = 36831277;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=36831278;
 //BA.debugLineNum = 36831278;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=36831280;
 //BA.debugLineNum = 36831280;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=36831281;
 //BA.debugLineNum = 36831281;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=36831282;
 //BA.debugLineNum = 36831282;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=36831284;
 //BA.debugLineNum = 36831284;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=36831286;
 //BA.debugLineNum = 36831286;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=36831287;
 //BA.debugLineNum = 36831287;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=36831289;
 //BA.debugLineNum = 36831289;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=36831290;
 //BA.debugLineNum = 36831290;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=36831291;
 //BA.debugLineNum = 36831291;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=36831293;
 //BA.debugLineNum = 36831293;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=36831294;
 //BA.debugLineNum = 36831294;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=36831296;
 //BA.debugLineNum = 36831296;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=36831297;
 //BA.debugLineNum = 36831297;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=36831301;
 //BA.debugLineNum = 36831301;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=36831302;
 //BA.debugLineNum = 36831302;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=36831303;
 //BA.debugLineNum = 36831303;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=36831304;
 //BA.debugLineNum = 36831304;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=36831305;
 //BA.debugLineNum = 36831305;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=36831306;
 //BA.debugLineNum = 36831306;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=36831307;
 //BA.debugLineNum = 36831307;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=36831308;
 //BA.debugLineNum = 36831308;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=36831310;
 //BA.debugLineNum = 36831310;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=36831311;
 //BA.debugLineNum = 36831311;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=36831312;
 //BA.debugLineNum = 36831312;BA.debugLine="End Sub";
return null;
}
public String  _b_proceder_click(japam.SIE.b4xcomercial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "b_proceder_click", false))
	 {return ((String) Debug.delegate(ba, "b_proceder_click", null));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Private Sub B_Proceder_Click";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="Cargar_Valores";
__ref._cargar_valores /*String*/ (null);
RDebugUtils.currentLine=36372484;
 //BA.debugLineNum = 36372484;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor(japam.SIE.b4xcomercial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores(japam.SIE.b4xcomercial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "cargar_valores", false))
	 {return ((String) Debug.delegate(ba, "cargar_valores", null));}
int _x = 0;
String[] _mdatos = null;
String[] _mvalores = null;
String _mcadena = "";
int _anio = 0;
int _mes = 0;
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Sub Cargar_Valores()";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="Dim mDATOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="Dim mVALORES(50) As String";
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="Dim ANIO, MES As Int";
_anio = 0;
_mes = 0;
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="MES = Main.mMES";
_mes = _main._mmes /*int*/ ;
RDebugUtils.currentLine=36438025;
 //BA.debugLineNum = 36438025;BA.debugLine="TBL_Comercial.ClearRows";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=36438026;
 //BA.debugLineNum = 36438026;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=36438027;
 //BA.debugLineNum = 36438027;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_valores WHERE val_derecho = 1 AND val_anio = "+BA.NumberToString(_anio));
RDebugUtils.currentLine=36438028;
 //BA.debugLineNum = 36438028;BA.debugLine="Main.mULT_DATOS = -1";
_main._mult_datos /*int*/  = (int) (-1);
RDebugUtils.currentLine=36438029;
 //BA.debugLineNum = 36438029;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=36438030;
 //BA.debugLineNum = 36438030;BA.debugLine="Main.mULT_DATOS = Main.mULT_DATOS + 1";
_main._mult_datos /*int*/  = (int) (_main._mult_datos /*int*/ +1);
RDebugUtils.currentLine=36438031;
 //BA.debugLineNum = 36438031;BA.debugLine="mDATOS(Main.mULT_DATOS) = mRS.GetString(\"val_de";
_mdatos[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_descripcion");
RDebugUtils.currentLine=36438032;
 //BA.debugLineNum = 36438032;BA.debugLine="Select Case MES";
switch (_mes) {
case 1: {
RDebugUtils.currentLine=36438034;
 //BA.debugLineNum = 36438034;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ene");
 break; }
case 2: {
RDebugUtils.currentLine=36438036;
 //BA.debugLineNum = 36438036;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_feb");
 break; }
case 3: {
RDebugUtils.currentLine=36438038;
 //BA.debugLineNum = 36438038;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_mar");
 break; }
case 4: {
RDebugUtils.currentLine=36438040;
 //BA.debugLineNum = 36438040;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_abr");
 break; }
case 5: {
RDebugUtils.currentLine=36438042;
 //BA.debugLineNum = 36438042;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_may");
 break; }
case 6: {
RDebugUtils.currentLine=36438044;
 //BA.debugLineNum = 36438044;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jun");
 break; }
case 7: {
RDebugUtils.currentLine=36438046;
 //BA.debugLineNum = 36438046;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_jul");
 break; }
case 8: {
RDebugUtils.currentLine=36438048;
 //BA.debugLineNum = 36438048;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_ago");
 break; }
case 9: {
RDebugUtils.currentLine=36438050;
 //BA.debugLineNum = 36438050;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_sep");
 break; }
case 10: {
RDebugUtils.currentLine=36438052;
 //BA.debugLineNum = 36438052;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_oct");
 break; }
case 11: {
RDebugUtils.currentLine=36438054;
 //BA.debugLineNum = 36438054;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_nov");
 break; }
case 12: {
RDebugUtils.currentLine=36438056;
 //BA.debugLineNum = 36438056;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"val_dic");
 break; }
}
;
 }
;
RDebugUtils.currentLine=36438059;
 //BA.debugLineNum = 36438059;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step42 = 1;
final int limit42 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit42 ;_x = _x + step42 ) {
RDebugUtils.currentLine=36438060;
 //BA.debugLineNum = 36438060;BA.debugLine="If x < 2 Then";
if (_x<2) { 
RDebugUtils.currentLine=36438061;
 //BA.debugLineNum = 36438061;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"M\"";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mvalores[_x]),"M"));
 }else {
RDebugUtils.currentLine=36438063;
 //BA.debugLineNum = 36438063;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"N\"";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mvalores[_x]),"N"));
 };
RDebugUtils.currentLine=36438066;
 //BA.debugLineNum = 36438066;BA.debugLine="TBL_Comercial.AddRow(Array As Object(mDATOS(x),";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mdatos[_x]),(Object)(_mcadena)},__c.True);
 }
};
 }else {
RDebugUtils.currentLine=36438069;
 //BA.debugLineNum = 36438069;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("236438069","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
RDebugUtils.currentLine=36438071;
 //BA.debugLineNum = 36438071;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xcomercial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=36700164;
 //BA.debugLineNum = 36700164;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=36700166;
 //BA.debugLineNum = 36700166;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xcomercial __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="Log(\"B4XComercial\")";
__c.LogImpl("236175875","B4XComercial",0);
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="Root.LoadLayout(\"Comercial\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Comercial",ba);
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="TBL_Comercial.ColsName=Array As String(\"Dato\", \"V";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Dato","Valor"});
RDebugUtils.currentLine=36175879;
 //BA.debugLineNum = 36175879;BA.debugLine="TBL_Comercial.ColsWidth=Array As Int(220dip, 150d";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (220)),__c.DipToCurrent((int) (150))});
RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="TBL_Comercial.ColsType=Array As Int(TBL_Comercial";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_comercial /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_comercial /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=36175881;
 //BA.debugLineNum = 36175881;BA.debugLine="TBL_Comercial.ColsAlignment=Array As String(\"CENT";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"CENTER","RIGHT"});
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="TBL_Comercial.SetColCustomize(0, xui.Color_RGB(0,";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=36175883;
 //BA.debugLineNum = 36175883;BA.debugLine="TBL_Comercial.SetColCustomize(1, xui.Color_RGB(0,";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=36175884;
 //BA.debugLineNum = 36175884;BA.debugLine="TBL_Comercial.SetColCustomize(2, xui.Color_RGB(0,";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=36175886;
 //BA.debugLineNum = 36175886;BA.debugLine="For x = 2021 To 2027";
{
final int step12 = 1;
final int limit12 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=36175888;
 //BA.debugLineNum = 36175888;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=36175891;
 //BA.debugLineNum = 36175891;BA.debugLine="For x = 1 To 12";
{
final int step15 = 1;
final int limit15 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit15 ;_x = _x + step15 ) {
RDebugUtils.currentLine=36175893;
 //BA.debugLineNum = 36175893;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=36175895;
 //BA.debugLineNum = 36175895;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xcomercial __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="Private TBL_Comercial As FlexGrid";
_tbl_comercial = new b4j.example.flexgrid();
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=36044807;
 //BA.debugLineNum = 36044807;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=36044809;
 //BA.debugLineNum = 36044809;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.SIE.sd_sql();
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=36044811;
 //BA.debugLineNum = 36044811;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xcomercial __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xcomercial __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xcomercial __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="End Sub";
return "";
}
public String  _tbl_comercial_cellclick(japam.SIE.b4xcomercial __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "tbl_comercial_cellclick", false))
	 {return ((String) Debug.delegate(ba, "tbl_comercial_cellclick", new Object[] {_row,_col}));}
int _mvalor = 0;
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Private Sub TBL_Comercial_CellClick(Row As Int, Co";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="If Col = 1 Then";
if (_col==1) { 
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="mVALOR = mFORMATO(TBL_Comercial.GetCellValue(Row";
_mvalor = ((int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"T"))));
RDebugUtils.currentLine=36503557;
 //BA.debugLineNum = 36503557;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="TBL_Comercial.EditCellonsite(Row, Col)";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._editcellonsite(_row,_col);
 };
 };
RDebugUtils.currentLine=36503561;
 //BA.debugLineNum = 36503561;BA.debugLine="End Sub";
return "";
}
public String  _tbl_comercial_modified(japam.SIE.b4xcomercial __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xcomercial";
if (Debug.shouldDelegate(ba, "tbl_comercial_modified", false))
	 {return ((String) Debug.delegate(ba, "tbl_comercial_modified", new Object[] {_row,_col}));}
String _mcadena = "";
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Private Sub TBL_Comercial_Modified(Row As Int, Col";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="If Row < 2 Then";
if (_row<2) { 
RDebugUtils.currentLine=36569092;
 //BA.debugLineNum = 36569092;BA.debugLine="mCADENA = mFORMATO(TBL_Comercial.GetCellValue(Ro";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"M"));
 }else {
RDebugUtils.currentLine=36569094;
 //BA.debugLineNum = 36569094;BA.debugLine="mCADENA = mFORMATO(TBL_Comercial.GetCellValue(Ro";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_comercial /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"N"));
 };
RDebugUtils.currentLine=36569096;
 //BA.debugLineNum = 36569096;BA.debugLine="TBL_Comercial.SetCellValue(Row, Col, mCADENA)";
__ref._tbl_comercial /*b4j.example.flexgrid*/ ._setcellvalue(_row,_col,(Object)(_mcadena));
RDebugUtils.currentLine=36569097;
 //BA.debugLineNum = 36569097;BA.debugLine="End Sub";
return "";
}
}