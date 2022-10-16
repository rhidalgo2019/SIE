package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xenergia extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xenergia");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xenergia.class).invoke(this, new Object[] {null});
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
public b4j.example.flexgrid _tbl_energia = null;
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
public String  _b_guardar_click(japam.SIE.b4xenergia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "b_guardar_click", false))
	 {return ((String) Debug.delegate(ba, "b_guardar_click", null));}
int _x = 0;
String[] _mservicios = null;
String[] _mequipos = null;
String[] _mgastos = null;
String[] _mconsumos = null;
boolean _mcompletos = false;
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="Private Sub B_Guardar_Click";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mC";
_mservicios = new String[(int) (50)];
java.util.Arrays.fill(_mservicios,"");
_mequipos = new String[(int) (50)];
java.util.Arrays.fill(_mequipos,"");
_mgastos = new String[(int) (50)];
java.util.Arrays.fill(_mgastos,"");
_mconsumos = new String[(int) (50)];
java.util.Arrays.fill(_mconsumos,"");
RDebugUtils.currentLine=38338563;
 //BA.debugLineNum = 38338563;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
RDebugUtils.currentLine=38338565;
 //BA.debugLineNum = 38338565;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
RDebugUtils.currentLine=38338566;
 //BA.debugLineNum = 38338566;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
RDebugUtils.currentLine=38338567;
 //BA.debugLineNum = 38338567;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=38338568;
 //BA.debugLineNum = 38338568;BA.debugLine="If Main.mCONEXION  Then";
if (_main._mconexion /*boolean*/ ) { 
RDebugUtils.currentLine=38338569;
 //BA.debugLineNum = 38338569;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step8 = 1;
final int limit8 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
RDebugUtils.currentLine=38338570;
 //BA.debugLineNum = 38338570;BA.debugLine="mSERVICIOS(x) = TBL_Energia.GetCellValue(x, 0)";
_mservicios[_x] = BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (0)));
RDebugUtils.currentLine=38338571;
 //BA.debugLineNum = 38338571;BA.debugLine="mEQUIPOS(x) = TBL_Energia.GetCellValue(x, 1)";
_mequipos[_x] = BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (1)));
RDebugUtils.currentLine=38338572;
 //BA.debugLineNum = 38338572;BA.debugLine="mGASTOS(x) = mFORMATO(TBL_Energia.GetCellValue";
_mgastos[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (2))),"T"));
RDebugUtils.currentLine=38338573;
 //BA.debugLineNum = 38338573;BA.debugLine="mCONSUMOS(x) = mFORMATO(TBL_Energia.GetCellVal";
_mconsumos[_x] = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_x,(int) (3))),"T"));
RDebugUtils.currentLine=38338574;
 //BA.debugLineNum = 38338574;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=38338576;
 //BA.debugLineNum = 38338576;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_ene = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338577;
 //BA.debugLineNum = 38338577;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_ene = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 1: {
RDebugUtils.currentLine=38338579;
 //BA.debugLineNum = 38338579;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_feb = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338580;
 //BA.debugLineNum = 38338580;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_feb = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 2: {
RDebugUtils.currentLine=38338582;
 //BA.debugLineNum = 38338582;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie__energia SET s";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie__energia SET see_mon_mar = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338583;
 //BA.debugLineNum = 38338583;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_mar = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 3: {
RDebugUtils.currentLine=38338585;
 //BA.debugLineNum = 38338585;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_abr = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338586;
 //BA.debugLineNum = 38338586;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_abr = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 4: {
RDebugUtils.currentLine=38338588;
 //BA.debugLineNum = 38338588;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_may = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338589;
 //BA.debugLineNum = 38338589;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kww_may = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 5: {
RDebugUtils.currentLine=38338591;
 //BA.debugLineNum = 38338591;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_jun = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338592;
 //BA.debugLineNum = 38338592;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_jun = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 6: {
RDebugUtils.currentLine=38338594;
 //BA.debugLineNum = 38338594;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_jul = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338595;
 //BA.debugLineNum = 38338595;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_jul = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 7: {
RDebugUtils.currentLine=38338597;
 //BA.debugLineNum = 38338597;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_ago = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338598;
 //BA.debugLineNum = 38338598;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_ago = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 8: {
RDebugUtils.currentLine=38338600;
 //BA.debugLineNum = 38338600;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_sep = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338601;
 //BA.debugLineNum = 38338601;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_sep = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 9: {
RDebugUtils.currentLine=38338603;
 //BA.debugLineNum = 38338603;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_oct = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338604;
 //BA.debugLineNum = 38338604;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_oct = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 10: {
RDebugUtils.currentLine=38338606;
 //BA.debugLineNum = 38338606;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_nov = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338607;
 //BA.debugLineNum = 38338607;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_nov = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 11: {
RDebugUtils.currentLine=38338609;
 //BA.debugLineNum = 38338609;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_mon_dic = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38338610;
 //BA.debugLineNum = 38338610;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
__ref._msql /*japam.SIE.sd_sql*/ ._execnonquery /*String*/ (null,"UPDATE sie_energia SET see_kwh_dic = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
}
;
 }
};
 };
RDebugUtils.currentLine=38338615;
 //BA.debugLineNum = 38338615;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=38338617;
 //BA.debugLineNum = 38338617;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .MsgboxAsync(ba,BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura"),BA.ObjectToCharSequence("Alerta"));
 };
RDebugUtils.currentLine=38338619;
 //BA.debugLineNum = 38338619;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor(japam.SIE.b4xenergia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xenergia __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
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
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=38535175;
 //BA.debugLineNum = 38535175;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=38535176;
 //BA.debugLineNum = 38535176;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=38535177;
 //BA.debugLineNum = 38535177;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=38535178;
 //BA.debugLineNum = 38535178;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=38535179;
 //BA.debugLineNum = 38535179;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=38535180;
 //BA.debugLineNum = 38535180;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=38535182;
 //BA.debugLineNum = 38535182;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=38535183;
 //BA.debugLineNum = 38535183;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=38535184;
 //BA.debugLineNum = 38535184;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=38535185;
 //BA.debugLineNum = 38535185;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=38535186;
 //BA.debugLineNum = 38535186;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=38535187;
 //BA.debugLineNum = 38535187;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=38535188;
 //BA.debugLineNum = 38535188;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=38535189;
 //BA.debugLineNum = 38535189;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=38535190;
 //BA.debugLineNum = 38535190;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=38535191;
 //BA.debugLineNum = 38535191;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=38535192;
 //BA.debugLineNum = 38535192;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=38535193;
 //BA.debugLineNum = 38535193;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=38535195;
 //BA.debugLineNum = 38535195;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=38535197;
 //BA.debugLineNum = 38535197;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=38535198;
 //BA.debugLineNum = 38535198;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=38535200;
 //BA.debugLineNum = 38535200;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=38535202;
 //BA.debugLineNum = 38535202;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=38535203;
 //BA.debugLineNum = 38535203;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=38535204;
 //BA.debugLineNum = 38535204;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=38535205;
 //BA.debugLineNum = 38535205;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=38535207;
 //BA.debugLineNum = 38535207;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=38535208;
 //BA.debugLineNum = 38535208;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=38535209;
 //BA.debugLineNum = 38535209;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=38535211;
 //BA.debugLineNum = 38535211;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=38535212;
 //BA.debugLineNum = 38535212;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=38535213;
 //BA.debugLineNum = 38535213;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=38535214;
 //BA.debugLineNum = 38535214;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=38535216;
 //BA.debugLineNum = 38535216;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=38535217;
 //BA.debugLineNum = 38535217;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=38535218;
 //BA.debugLineNum = 38535218;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=38535220;
 //BA.debugLineNum = 38535220;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=38535222;
 //BA.debugLineNum = 38535222;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=38535223;
 //BA.debugLineNum = 38535223;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=38535225;
 //BA.debugLineNum = 38535225;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=38535226;
 //BA.debugLineNum = 38535226;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=38535227;
 //BA.debugLineNum = 38535227;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=38535229;
 //BA.debugLineNum = 38535229;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=38535230;
 //BA.debugLineNum = 38535230;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=38535232;
 //BA.debugLineNum = 38535232;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=38535233;
 //BA.debugLineNum = 38535233;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=38535237;
 //BA.debugLineNum = 38535237;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=38535238;
 //BA.debugLineNum = 38535238;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=38535239;
 //BA.debugLineNum = 38535239;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=38535240;
 //BA.debugLineNum = 38535240;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=38535241;
 //BA.debugLineNum = 38535241;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=38535242;
 //BA.debugLineNum = 38535242;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=38535243;
 //BA.debugLineNum = 38535243;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=38535244;
 //BA.debugLineNum = 38535244;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=38535246;
 //BA.debugLineNum = 38535246;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=38535247;
 //BA.debugLineNum = 38535247;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=38535248;
 //BA.debugLineNum = 38535248;BA.debugLine="End Sub";
return null;
}
public String  _b_proceder_mouseclick(japam.SIE.b4xenergia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "b_proceder_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "b_proceder_mouseclick", null));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Private Sub B_Proceder_MouseClick";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Cargar_Valores";
__ref._cargar_valores /*String*/ (null);
RDebugUtils.currentLine=38076420;
 //BA.debugLineNum = 38076420;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores(japam.SIE.b4xenergia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "cargar_valores", false))
	 {return ((String) Debug.delegate(ba, "cargar_valores", null));}
int _x = 0;
String[] _mservicios = null;
String[] _mequipos = null;
String[] _mgastos = null;
String[] _mconsumos = null;
String _mcadena_1 = "";
String _mcadena_2 = "";
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Sub Cargar_Valores ()";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=38141955;
 //BA.debugLineNum = 38141955;BA.debugLine="Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mC";
_mservicios = new String[(int) (50)];
java.util.Arrays.fill(_mservicios,"");
_mequipos = new String[(int) (50)];
java.util.Arrays.fill(_mequipos,"");
_mgastos = new String[(int) (50)];
java.util.Arrays.fill(_mgastos,"");
_mconsumos = new String[(int) (50)];
java.util.Arrays.fill(_mconsumos,"");
RDebugUtils.currentLine=38141956;
 //BA.debugLineNum = 38141956;BA.debugLine="Dim mCADENA_1, mCADENA_2 As String";
_mcadena_1 = "";
_mcadena_2 = "";
RDebugUtils.currentLine=38141958;
 //BA.debugLineNum = 38141958;BA.debugLine="TBL_Energia.ClearRows";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=38141959;
 //BA.debugLineNum = 38141959;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=38141960;
 //BA.debugLineNum = 38141960;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_energia";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_energia WHERE see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38141961;
 //BA.debugLineNum = 38141961;BA.debugLine="Main.mULT_EXTRAIDO = -1";
_main._mult_extraido /*int*/  = (int) (-1);
RDebugUtils.currentLine=38141962;
 //BA.debugLineNum = 38141962;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=38141963;
 //BA.debugLineNum = 38141963;BA.debugLine="Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1";
_main._mult_extraido /*int*/  = (int) (_main._mult_extraido /*int*/ +1);
RDebugUtils.currentLine=38141964;
 //BA.debugLineNum = 38141964;BA.debugLine="mSERVICIOS(Main.mULT_EXTRAIDO) = mRS.GetString(";
_mservicios[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_servicio");
RDebugUtils.currentLine=38141965;
 //BA.debugLineNum = 38141965;BA.debugLine="mEQUIPOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"s";
_mequipos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_equipo");
RDebugUtils.currentLine=38141966;
 //BA.debugLineNum = 38141966;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=38141968;
 //BA.debugLineNum = 38141968;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_ene");
RDebugUtils.currentLine=38141969;
 //BA.debugLineNum = 38141969;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_ene");
 break; }
case 1: {
RDebugUtils.currentLine=38141971;
 //BA.debugLineNum = 38141971;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_feb");
RDebugUtils.currentLine=38141972;
 //BA.debugLineNum = 38141972;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_feb");
 break; }
case 2: {
RDebugUtils.currentLine=38141974;
 //BA.debugLineNum = 38141974;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_mar");
RDebugUtils.currentLine=38141975;
 //BA.debugLineNum = 38141975;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_mar");
 break; }
case 3: {
RDebugUtils.currentLine=38141977;
 //BA.debugLineNum = 38141977;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_abr");
RDebugUtils.currentLine=38141978;
 //BA.debugLineNum = 38141978;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_abr");
 break; }
case 4: {
RDebugUtils.currentLine=38141980;
 //BA.debugLineNum = 38141980;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_may");
RDebugUtils.currentLine=38141981;
 //BA.debugLineNum = 38141981;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_may");
 break; }
case 5: {
RDebugUtils.currentLine=38141983;
 //BA.debugLineNum = 38141983;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_jun");
RDebugUtils.currentLine=38141984;
 //BA.debugLineNum = 38141984;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_jun");
 break; }
case 6: {
RDebugUtils.currentLine=38141986;
 //BA.debugLineNum = 38141986;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_jul");
RDebugUtils.currentLine=38141987;
 //BA.debugLineNum = 38141987;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_jul");
 break; }
case 7: {
RDebugUtils.currentLine=38141989;
 //BA.debugLineNum = 38141989;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_ago");
RDebugUtils.currentLine=38141990;
 //BA.debugLineNum = 38141990;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_ago");
 break; }
case 8: {
RDebugUtils.currentLine=38141992;
 //BA.debugLineNum = 38141992;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_sep");
RDebugUtils.currentLine=38141993;
 //BA.debugLineNum = 38141993;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_sep");
 break; }
case 9: {
RDebugUtils.currentLine=38141995;
 //BA.debugLineNum = 38141995;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_oct");
RDebugUtils.currentLine=38141996;
 //BA.debugLineNum = 38141996;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_oct");
 break; }
case 10: {
RDebugUtils.currentLine=38141998;
 //BA.debugLineNum = 38141998;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_nov");
RDebugUtils.currentLine=38141999;
 //BA.debugLineNum = 38141999;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_nov");
 break; }
case 11: {
RDebugUtils.currentLine=38142001;
 //BA.debugLineNum = 38142001;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_mon_dic");
RDebugUtils.currentLine=38142002;
 //BA.debugLineNum = 38142002;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"see_kwh_dic");
 break; }
}
;
 }
;
RDebugUtils.currentLine=38142005;
 //BA.debugLineNum = 38142005;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step52 = 1;
final int limit52 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit52 ;_x = _x + step52 ) {
RDebugUtils.currentLine=38142006;
 //BA.debugLineNum = 38142006;BA.debugLine="mCADENA_1 = mFORMATO(mGASTOS(x).As(String), \"M\"";
_mcadena_1 = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mgastos[_x]),"M"));
RDebugUtils.currentLine=38142007;
 //BA.debugLineNum = 38142007;BA.debugLine="mCADENA_2 = mFORMATO(mCONSUMOS(x).As(String), \"";
_mcadena_2 = BA.ObjectToString(__ref._mformato /*Object*/ (null,(_mconsumos[_x]),"N"));
RDebugUtils.currentLine=38142009;
 //BA.debugLineNum = 38142009;BA.debugLine="TBL_Energia.AddRow(Array As Object(mSERVICIOS(x";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mservicios[_x]),(Object)(_mequipos[_x]),(Object)(_mcadena_1),(Object)(_mcadena_2)},__c.True);
 }
};
RDebugUtils.currentLine=38142011;
 //BA.debugLineNum = 38142011;BA.debugLine="mSQL.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=38142013;
 //BA.debugLineNum = 38142013;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("238142013","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
RDebugUtils.currentLine=38142015;
 //BA.debugLineNum = 38142015;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xenergia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=38404100;
 //BA.debugLineNum = 38404100;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=38404102;
 //BA.debugLineNum = 38404102;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xenergia __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Log(\"B4XEnergia\")";
__c.LogImpl("237879809","B4XEnergia",0);
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=37879811;
 //BA.debugLineNum = 37879811;BA.debugLine="Root.LoadLayout(\"Energia\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Energia",ba);
RDebugUtils.currentLine=37879812;
 //BA.debugLineNum = 37879812;BA.debugLine="TBL_Energia.ColsName=Array As String(\"Servicio\",";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Servicio","Equipo","Gasto ($)","Consumo (kWh)"});
RDebugUtils.currentLine=37879813;
 //BA.debugLineNum = 37879813;BA.debugLine="TBL_Energia.ColsWidth=Array As Int(130dip, 230dip";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (230)),__c.DipToCurrent((int) (100)),__c.DipToCurrent((int) (120))});
RDebugUtils.currentLine=37879814;
 //BA.debugLineNum = 37879814;BA.debugLine="TBL_Energia.ColsType=Array As Int(TBL_Energia.Typ";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_energia /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_energia /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_energia /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_energia /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=37879815;
 //BA.debugLineNum = 37879815;BA.debugLine="TBL_Energia.ColsAlignment=Array As String(\"CENTER";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"CENTER","LEFT","RIGHT","RIGHT"});
RDebugUtils.currentLine=37879816;
 //BA.debugLineNum = 37879816;BA.debugLine="TBL_Energia.SetColCustomize(0, xui.Color_RGB(0, 0";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37879817;
 //BA.debugLineNum = 37879817;BA.debugLine="TBL_Energia.SetColCustomize(1, xui.Color_RGB(0, 0";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37879818;
 //BA.debugLineNum = 37879818;BA.debugLine="TBL_Energia.SetColCustomize(2, xui.Color_RGB(0, 0";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37879819;
 //BA.debugLineNum = 37879819;BA.debugLine="TBL_Energia.SetColCustomize(3, xui.Color_RGB(0, 0";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcolcustomize((int) (3),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=37879821;
 //BA.debugLineNum = 37879821;BA.debugLine="For x = 2021 To 2027";
{
final int step12 = 1;
final int limit12 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
RDebugUtils.currentLine=37879823;
 //BA.debugLineNum = 37879823;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=37879826;
 //BA.debugLineNum = 37879826;BA.debugLine="For x = 1 To 12";
{
final int step15 = 1;
final int limit15 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit15 ;_x = _x + step15 ) {
RDebugUtils.currentLine=37879828;
 //BA.debugLineNum = 37879828;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=37879830;
 //BA.debugLineNum = 37879830;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(japam.SIE.b4xenergia __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="Private TBL_Energia As FlexGrid";
_tbl_energia = new b4j.example.flexgrid();
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=37748743;
 //BA.debugLineNum = 37748743;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=37748744;
 //BA.debugLineNum = 37748744;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=37748745;
 //BA.debugLineNum = 37748745;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=37748746;
 //BA.debugLineNum = 37748746;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.SIE.sd_sql();
RDebugUtils.currentLine=37748747;
 //BA.debugLineNum = 37748747;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=37748748;
 //BA.debugLineNum = 37748748;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xenergia __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xenergia __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xenergia __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="Main.mMES =SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="End Sub";
return "";
}
public String  _tbl_energia_cellclick(japam.SIE.b4xenergia __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "tbl_energia_cellclick", false))
	 {return ((String) Debug.delegate(ba, "tbl_energia_cellclick", new Object[] {_row,_col}));}
int _mvalor = 0;
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Private Sub TBL_Energia_CellClick(Row As Int, Col";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="If Col >= 2 Then";
if (_col>=2) { 
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="mVALOR = mFORMATO(TBL_Energia.GetCellValue(Row,";
_mvalor = ((int)(BA.ObjectToNumber(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"T"))));
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=38207494;
 //BA.debugLineNum = 38207494;BA.debugLine="TBL_Energia.EditCellonsite(Row, Col)";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._editcellonsite(_row,_col);
 };
 };
RDebugUtils.currentLine=38207497;
 //BA.debugLineNum = 38207497;BA.debugLine="End Sub";
return "";
}
public String  _tbl_energia_modified(japam.SIE.b4xenergia __ref,int _row,int _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xenergia";
if (Debug.shouldDelegate(ba, "tbl_energia_modified", false))
	 {return ((String) Debug.delegate(ba, "tbl_energia_modified", new Object[] {_row,_col}));}
String _mcadena = "";
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Private Sub TBL_Energia_Modified(Row As Int, Col A";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="If Col = 2 Then";
if (_col==2) { 
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="mCADENA = mFORMATO(TBL_Energia.GetCellValue(Row,";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"M"));
 }else {
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="mCADENA = mFORMATO(TBL_Energia.GetCellValue(Row,";
_mcadena = BA.ObjectToString(__ref._mformato /*Object*/ (null,BA.ObjectToString(__ref._tbl_energia /*b4j.example.flexgrid*/ ._getcellvalue(_row,_col)),"N"));
 };
RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="TBL_Energia.SetCellValue(Row, Col, mCADENA)";
__ref._tbl_energia /*b4j.example.flexgrid*/ ._setcellvalue(_row,_col,(Object)(_mcadena));
RDebugUtils.currentLine=38273033;
 //BA.debugLineNum = 38273033;BA.debugLine="End Sub";
return "";
}
}