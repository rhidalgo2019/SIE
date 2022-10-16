package japam.SIE;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xindicadores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "japam.SIE.b4xindicadores");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", japam.SIE.b4xindicadores.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _b_proceder = null;
public b4j.example.flexgrid _tbl_indicadores = null;
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
public String  _b_proceder_mouseclick(japam.SIE.b4xindicadores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "b_proceder_mouseclick", false))
	 {return ((String) Debug.delegate(ba, "b_proceder_mouseclick", null));}
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Private Sub B_Proceder_MouseClick";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Conectar_Servidor";
__ref._conectar_servidor /*String*/ (null);
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="Cargar_Valores";
__ref._cargar_valores /*String*/ (null);
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="End Sub";
return "";
}
public String  _conectar_servidor(japam.SIE.b4xindicadores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "conectar_servidor", false))
	 {return ((String) Debug.delegate(ba, "conectar_servidor", null));}
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Public Sub Conectar_Servidor()";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
__ref._msql /*japam.SIE.sd_sql*/ ._initialize /*String*/ (null,ba,this,"MYSQL","com.mysql.jdbc.Driver",("jdbc:mysql://"+__c.SmartStringFormatter("",(Object)(_main._servidor /*String*/ ))+"/u567762233_SIE?useSSL=false"),_main._administrador /*String*/ ,_main._password /*String*/ );
RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores(japam.SIE.b4xindicadores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "cargar_valores", false))
	 {return ((String) Debug.delegate(ba, "cargar_valores", null));}
int _x = 0;
String[] _mindicadores = null;
String[] _mvalores = null;
String[] _mmetas = null;
String[] _mcumplimientos = null;
String[] _mminimos = null;
String[] _mmaximos = null;
String _mindicador = "";
String _mvalor = "";
String _mmeta = "";
String _mcumplimiento = "";
String _mminimo = "";
String _mmaximo = "";
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Sub Cargar_Valores()";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="Dim mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="Dim mINDICADORES(50), mVALORES(50), mMETAS(50) As";
_mindicadores = new String[(int) (50)];
java.util.Arrays.fill(_mindicadores,"");
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
_mmetas = new String[(int) (50)];
java.util.Arrays.fill(_mmetas,"");
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="Dim mCUMPLIMIENTOS(50), mMINIMOS(50), mMAXIMOS(50";
_mcumplimientos = new String[(int) (50)];
java.util.Arrays.fill(_mcumplimientos,"");
_mminimos = new String[(int) (50)];
java.util.Arrays.fill(_mminimos,"");
_mmaximos = new String[(int) (50)];
java.util.Arrays.fill(_mmaximos,"");
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="Dim mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMI";
_mindicador = "";
_mvalor = "";
_mmeta = "";
_mcumplimiento = "";
_mminimo = "";
_mmaximo = "";
RDebugUtils.currentLine=38993927;
 //BA.debugLineNum = 38993927;BA.debugLine="TBL_Indicadores.ClearRows";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._clearrows();
RDebugUtils.currentLine=38993928;
 //BA.debugLineNum = 38993928;BA.debugLine="If mSQL.IsInitialized Then";
if (__ref._msql /*japam.SIE.sd_sql*/ .IsInitialized /*boolean*/ ()) { 
RDebugUtils.currentLine=38993929;
 //BA.debugLineNum = 38993929;BA.debugLine="Main.mCONEXION = True";
_main._mconexion /*boolean*/  = __c.True;
RDebugUtils.currentLine=38993930;
 //BA.debugLineNum = 38993930;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_indicado";
__ref._mrs /*japam.SIE.sd_resultset*/  = __ref._msql /*japam.SIE.sd_sql*/ ._execquery /*japam.SIE.sd_resultset*/ (null,"SELECT * FROM sie_indicadores WHERE ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
RDebugUtils.currentLine=38993931;
 //BA.debugLineNum = 38993931;BA.debugLine="Main.mULT_INDICADOR = -1";
_main._mult_indicador /*int*/  = (int) (-1);
RDebugUtils.currentLine=38993932;
 //BA.debugLineNum = 38993932;BA.debugLine="Do While mRS.NextRow";
while (__ref._mrs /*japam.SIE.sd_resultset*/ ._nextrow /*boolean*/ (null)) {
RDebugUtils.currentLine=38993933;
 //BA.debugLineNum = 38993933;BA.debugLine="Main.mULT_INDICADOR = Main.mULT_INDICADOR + 1";
_main._mult_indicador /*int*/  = (int) (_main._mult_indicador /*int*/ +1);
RDebugUtils.currentLine=38993934;
 //BA.debugLineNum = 38993934;BA.debugLine="mINDICADORES(Main.mULT_INDICADOR) = mRS.GetStri";
_mindicadores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_descripcion");
RDebugUtils.currentLine=38993935;
 //BA.debugLineNum = 38993935;BA.debugLine="mMETAS(Main.mULT_INDICADOR) = mRS.GetString(\"in";
_mmetas[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_meta");
RDebugUtils.currentLine=38993936;
 //BA.debugLineNum = 38993936;BA.debugLine="mMINIMOS(Main.mULT_INDICADOR) = mRS.GetString(\"";
_mminimos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_minimo");
RDebugUtils.currentLine=38993937;
 //BA.debugLineNum = 38993937;BA.debugLine="mMAXIMOS(Main.mULT_INDICADOR) = mRS.GetString(\"";
_mmaximos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_maximo");
RDebugUtils.currentLine=38993938;
 //BA.debugLineNum = 38993938;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
RDebugUtils.currentLine=38993940;
 //BA.debugLineNum = 38993940;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_ene");
RDebugUtils.currentLine=38993941;
 //BA.debugLineNum = 38993941;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_ene");
 break; }
case 1: {
RDebugUtils.currentLine=38993943;
 //BA.debugLineNum = 38993943;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_feb");
RDebugUtils.currentLine=38993944;
 //BA.debugLineNum = 38993944;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_feb");
 break; }
case 2: {
RDebugUtils.currentLine=38993946;
 //BA.debugLineNum = 38993946;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_mar");
RDebugUtils.currentLine=38993947;
 //BA.debugLineNum = 38993947;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_mar");
 break; }
case 3: {
RDebugUtils.currentLine=38993949;
 //BA.debugLineNum = 38993949;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_abr");
RDebugUtils.currentLine=38993950;
 //BA.debugLineNum = 38993950;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_abr");
 break; }
case 4: {
RDebugUtils.currentLine=38993952;
 //BA.debugLineNum = 38993952;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_may");
RDebugUtils.currentLine=38993953;
 //BA.debugLineNum = 38993953;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_may");
 break; }
case 5: {
RDebugUtils.currentLine=38993955;
 //BA.debugLineNum = 38993955;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_jun");
RDebugUtils.currentLine=38993956;
 //BA.debugLineNum = 38993956;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_jun");
 break; }
case 6: {
RDebugUtils.currentLine=38993958;
 //BA.debugLineNum = 38993958;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_jul");
RDebugUtils.currentLine=38993959;
 //BA.debugLineNum = 38993959;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_jul");
 break; }
case 7: {
RDebugUtils.currentLine=38993961;
 //BA.debugLineNum = 38993961;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_ago");
RDebugUtils.currentLine=38993962;
 //BA.debugLineNum = 38993962;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_ago");
 break; }
case 8: {
RDebugUtils.currentLine=38993964;
 //BA.debugLineNum = 38993964;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_sep");
RDebugUtils.currentLine=38993965;
 //BA.debugLineNum = 38993965;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_sep");
 break; }
case 9: {
RDebugUtils.currentLine=38993967;
 //BA.debugLineNum = 38993967;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_oct");
RDebugUtils.currentLine=38993968;
 //BA.debugLineNum = 38993968;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_oct");
 break; }
case 10: {
RDebugUtils.currentLine=38993970;
 //BA.debugLineNum = 38993970;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_nov");
RDebugUtils.currentLine=38993971;
 //BA.debugLineNum = 38993971;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_nov");
 break; }
case 11: {
RDebugUtils.currentLine=38993973;
 //BA.debugLineNum = 38993973;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_dic");
RDebugUtils.currentLine=38993974;
 //BA.debugLineNum = 38993974;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = __ref._mrs /*japam.SIE.sd_resultset*/ ._getstring /*String*/ (null,"ind_c_dic");
 break; }
}
;
 }
;
RDebugUtils.currentLine=38993977;
 //BA.debugLineNum = 38993977;BA.debugLine="For x = 0 To Main.mULT_INDICADOR";
{
final int step56 = 1;
final int limit56 = _main._mult_indicador /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit56 ;_x = _x + step56 ) {
RDebugUtils.currentLine=38993979;
 //BA.debugLineNum = 38993979;BA.debugLine="mINDICADOR = mINDICADORES(x)";
_mindicador = _mindicadores[_x];
RDebugUtils.currentLine=38993980;
 //BA.debugLineNum = 38993980;BA.debugLine="If mINDICADOR.Contains(\"%\") Then";
if (_mindicador.contains("%")) { 
RDebugUtils.currentLine=38993981;
 //BA.debugLineNum = 38993981;BA.debugLine="mVALOR = mFORMATO(mVALORES(x), \"P\")";
_mvalor = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mvalores[_x],"P"));
RDebugUtils.currentLine=38993982;
 //BA.debugLineNum = 38993982;BA.debugLine="mMETA  = mFORMATO(mMETAS(x), \"P\")";
_mmeta = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mmetas[_x],"P"));
RDebugUtils.currentLine=38993983;
 //BA.debugLineNum = 38993983;BA.debugLine="mMINIMO  = mFORMATO(mMINIMOS(x), \"P\")";
_mminimo = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mminimos[_x],"P"));
RDebugUtils.currentLine=38993984;
 //BA.debugLineNum = 38993984;BA.debugLine="mMAXIMO = mFORMATO(mMAXIMOS(x), \"P\")";
_mmaximo = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mmaximos[_x],"P"));
 }else {
RDebugUtils.currentLine=38993986;
 //BA.debugLineNum = 38993986;BA.debugLine="mVALOR = mFORMATO(mVALORES(x), \"N\")";
_mvalor = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mvalores[_x],"N"));
RDebugUtils.currentLine=38993987;
 //BA.debugLineNum = 38993987;BA.debugLine="mMETA  = mFORMATO(mMETAS(x), \"N\")";
_mmeta = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mmetas[_x],"N"));
RDebugUtils.currentLine=38993988;
 //BA.debugLineNum = 38993988;BA.debugLine="mMINIMO  = mFORMATO(mMINIMOS(x), \"N\")";
_mminimo = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mminimos[_x],"N"));
RDebugUtils.currentLine=38993989;
 //BA.debugLineNum = 38993989;BA.debugLine="mMAXIMO = mFORMATO(mMAXIMOS(x), \"N\")";
_mmaximo = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mmaximos[_x],"N"));
 };
RDebugUtils.currentLine=38993991;
 //BA.debugLineNum = 38993991;BA.debugLine="mCUMPLIMIENTO = mFORMATO(mCUMPLIMIENTOS(x), \"P\"";
_mcumplimiento = BA.ObjectToString(__ref._mformato /*Object*/ (null,_mcumplimientos[_x],"P"));
RDebugUtils.currentLine=38993992;
 //BA.debugLineNum = 38993992;BA.debugLine="TBL_Indicadores.AddRow(Array As Object(mINDICAD";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._addrow(new Object[]{(Object)(_mindicador),(Object)(_mvalor),(Object)(_mmeta),(Object)(_mcumplimiento),(Object)(_mminimo),(Object)(_mmaximo)},__c.True);
 }
};
RDebugUtils.currentLine=38993994;
 //BA.debugLineNum = 38993994;BA.debugLine="msql.Close";
__ref._msql /*japam.SIE.sd_sql*/ ._close /*String*/ (null);
 }else {
RDebugUtils.currentLine=38993996;
 //BA.debugLineNum = 38993996;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("238993996","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
RDebugUtils.currentLine=38993998;
 //BA.debugLineNum = 38993998;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click(japam.SIE.b4xindicadores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "b_regresar_click", false))
	 {return ((String) Debug.delegate(ba, "b_regresar_click", null));}
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Private Sub B_Regresar_Click";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"Menu");
 }else {
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (ba,this);
 };
RDebugUtils.currentLine=39059462;
 //BA.debugLineNum = 39059462;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(japam.SIE.b4xindicadores __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
int _x = 0;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="Dim x As Int";
_x = 0;
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="Log(\"B4XIndicadores\")";
__c.LogImpl("238731780","B4XIndicadores",0);
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=38731782;
 //BA.debugLineNum = 38731782;BA.debugLine="Root.LoadLayout(\"Indicadores\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("Indicadores",ba);
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="TBL_Indicadores.ColsName=Array As String(\"Indicad";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolsname(new String[]{"Indicador","Valor","Meta","Cumple al","Mínimo","Máximo"});
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="TBL_Indicadores.ColsWidth=Array As Int(300dip, 80";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolswidth(new int[]{__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80))});
RDebugUtils.currentLine=38731785;
 //BA.debugLineNum = 38731785;BA.debugLine="TBL_Indicadores.ColsType=Array As Int(TBL_Indicad";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolstype(new int[]{__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._typestring,__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._typestring});
RDebugUtils.currentLine=38731786;
 //BA.debugLineNum = 38731786;BA.debugLine="TBL_Indicadores.ColsAlignment=Array As String(\"LE";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolsalignment(new String[]{"LEFT","CENTER","CENTER","CENTER","CENTER","CENTER"});
RDebugUtils.currentLine=38731787;
 //BA.debugLineNum = 38731787;BA.debugLine="TBL_Indicadores.SetColCustomize(0, xui.Color_RGB(";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolcustomize((int) (0),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=38731788;
 //BA.debugLineNum = 38731788;BA.debugLine="TBL_Indicadores.SetColCustomize(1, xui.Color_RGB(";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolcustomize((int) (1),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=38731789;
 //BA.debugLineNum = 38731789;BA.debugLine="TBL_Indicadores.SetColCustomize(2, xui.Color_RGB(";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolcustomize((int) (2),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=38731790;
 //BA.debugLineNum = 38731790;BA.debugLine="TBL_Indicadores.SetColCustomize(3, xui.Color_RGB(";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolcustomize((int) (3),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=38731791;
 //BA.debugLineNum = 38731791;BA.debugLine="TBL_Indicadores.SetColCustomize(4, xui.Color_RGB(";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolcustomize((int) (4),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=38731792;
 //BA.debugLineNum = 38731792;BA.debugLine="TBL_Indicadores.SetColCustomize(5, xui.Color_RGB(";
__ref._tbl_indicadores /*b4j.example.flexgrid*/ ._setcolcustomize((int) (5),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (0),(int) (0),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .Color_RGB((int) (224),(int) (255),(int) (255)),__ref._xui /*anywheresoftware.b4a.objects.B4XViewWrapper.XUI*/ .CreateDefaultFont((float) (14)));
RDebugUtils.currentLine=38731794;
 //BA.debugLineNum = 38731794;BA.debugLine="For x = 2021 To 2027";
{
final int step16 = 1;
final int limit16 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
RDebugUtils.currentLine=38731796;
 //BA.debugLineNum = 38731796;BA.debugLine="SP_Anio.add(x)";
__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=38731799;
 //BA.debugLineNum = 38731799;BA.debugLine="For x = 1 To 12";
{
final int step19 = 1;
final int limit19 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit19 ;_x = _x + step19 ) {
RDebugUtils.currentLine=38731801;
 //BA.debugLineNum = 38731801;BA.debugLine="SP_Mes.Add(x)";
__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_x));
 }
};
RDebugUtils.currentLine=38731803;
 //BA.debugLineNum = 38731803;BA.debugLine="End Sub";
return "";
}
public Object  _mformato(japam.SIE.b4xindicadores __ref,String _valor,String _formato) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
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
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
RDebugUtils.currentLine=39190535;
 //BA.debugLineNum = 39190535;BA.debugLine="Dim mRET As String";
_mret = "";
RDebugUtils.currentLine=39190536;
 //BA.debugLineNum = 39190536;BA.debugLine="Dim mVALOR As String";
_mvalor = "";
RDebugUtils.currentLine=39190537;
 //BA.debugLineNum = 39190537;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
_menteros = "";
_mdecimales = "";
RDebugUtils.currentLine=39190538;
 //BA.debugLineNum = 39190538;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
_mlargo = 0;
_mpos_decimal = 0;
RDebugUtils.currentLine=39190539;
 //BA.debugLineNum = 39190539;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
_mmoneda = "";
_mporcentaje = "";
RDebugUtils.currentLine=39190540;
 //BA.debugLineNum = 39190540;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
_mini_decimal = 0;
_mfin_decimal = 0;
RDebugUtils.currentLine=39190542;
 //BA.debugLineNum = 39190542;BA.debugLine="mRET = \"\"";
_mret = "";
RDebugUtils.currentLine=39190543;
 //BA.debugLineNum = 39190543;BA.debugLine="Formato = Formato.ToUpperCase";
_formato = _formato.toUpperCase();
RDebugUtils.currentLine=39190544;
 //BA.debugLineNum = 39190544;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
if ((_formato).equals("N") || (_formato).equals("M") || (_formato).equals("P")) { 
RDebugUtils.currentLine=39190545;
 //BA.debugLineNum = 39190545;BA.debugLine="mRET = Valor";
_mret = _valor;
RDebugUtils.currentLine=39190546;
 //BA.debugLineNum = 39190546;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
_mret = _mret.replace("$","");
RDebugUtils.currentLine=39190547;
 //BA.debugLineNum = 39190547;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=39190548;
 //BA.debugLineNum = 39190548;BA.debugLine="mLARGO = mRET.Length";
_mlargo = _mret.length();
RDebugUtils.currentLine=39190549;
 //BA.debugLineNum = 39190549;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
_mpos_decimal = _mret.lastIndexOf(".");
RDebugUtils.currentLine=39190550;
 //BA.debugLineNum = 39190550;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=39190551;
 //BA.debugLineNum = 39190551;BA.debugLine="mDECIMALES = \"\"";
_mdecimales = "";
RDebugUtils.currentLine=39190552;
 //BA.debugLineNum = 39190552;BA.debugLine="If Formato = \"M\" Then";
if ((_formato).equals("M")) { 
RDebugUtils.currentLine=39190553;
 //BA.debugLineNum = 39190553;BA.debugLine="mMONEDA = \"$\"";
_mmoneda = "$";
 }else {
RDebugUtils.currentLine=39190555;
 //BA.debugLineNum = 39190555;BA.debugLine="mMONEDA = \"\"";
_mmoneda = "";
 };
RDebugUtils.currentLine=39190557;
 //BA.debugLineNum = 39190557;BA.debugLine="If Formato = \"P\" Then";
if ((_formato).equals("P")) { 
RDebugUtils.currentLine=39190558;
 //BA.debugLineNum = 39190558;BA.debugLine="mPORCENTAJE = \"%\"";
_mporcentaje = "%";
 }else {
RDebugUtils.currentLine=39190560;
 //BA.debugLineNum = 39190560;BA.debugLine="mPORCENTAJE = \"\"";
_mporcentaje = "";
 };
RDebugUtils.currentLine=39190562;
 //BA.debugLineNum = 39190562;BA.debugLine="If mPOS_DECIMAL = 0 Then";
if (_mpos_decimal==0) { 
RDebugUtils.currentLine=39190563;
 //BA.debugLineNum = 39190563;BA.debugLine="mENTEROS = \"\"";
_menteros = "";
RDebugUtils.currentLine=39190564;
 //BA.debugLineNum = 39190564;BA.debugLine="mDECIMALES = mRET";
_mdecimales = _mret;
RDebugUtils.currentLine=39190565;
 //BA.debugLineNum = 39190565;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
_mret = _mmoneda+"0"+_mdecimales+" "+_mporcentaje;
 }else {
RDebugUtils.currentLine=39190567;
 //BA.debugLineNum = 39190567;BA.debugLine="If mPOS_DECIMAL = -1 Then";
if (_mpos_decimal==-1) { 
RDebugUtils.currentLine=39190568;
 //BA.debugLineNum = 39190568;BA.debugLine="mENTEROS = mRET";
_menteros = _mret;
RDebugUtils.currentLine=39190569;
 //BA.debugLineNum = 39190569;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 }else {
RDebugUtils.currentLine=39190571;
 //BA.debugLineNum = 39190571;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
_menteros = _mret.substring((int) (0),_mpos_decimal);
RDebugUtils.currentLine=39190572;
 //BA.debugLineNum = 39190572;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
_mini_decimal = (int) (_mpos_decimal+1);
RDebugUtils.currentLine=39190573;
 //BA.debugLineNum = 39190573;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
if (_mini_decimal>_mlargo) { 
RDebugUtils.currentLine=39190574;
 //BA.debugLineNum = 39190574;BA.debugLine="mINI_DECIMAL = mLARGO";
_mini_decimal = _mlargo;
 };
RDebugUtils.currentLine=39190576;
 //BA.debugLineNum = 39190576;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
_mfin_decimal = (int) (_mpos_decimal+3);
RDebugUtils.currentLine=39190577;
 //BA.debugLineNum = 39190577;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
if (_mfin_decimal>_mlargo) { 
RDebugUtils.currentLine=39190578;
 //BA.debugLineNum = 39190578;BA.debugLine="mFIN_DECIMAL = mLARGO";
_mfin_decimal = _mlargo;
 };
RDebugUtils.currentLine=39190580;
 //BA.debugLineNum = 39190580;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
_mdecimales = _mret.substring(_mini_decimal,_mfin_decimal);
 };
RDebugUtils.currentLine=39190582;
 //BA.debugLineNum = 39190582;BA.debugLine="If mDECIMALES.Length = 0 Then";
if (_mdecimales.length()==0) { 
RDebugUtils.currentLine=39190583;
 //BA.debugLineNum = 39190583;BA.debugLine="mDECIMALES = \"00\"";
_mdecimales = "00";
 };
RDebugUtils.currentLine=39190585;
 //BA.debugLineNum = 39190585;BA.debugLine="mLARGO = mENTEROS.Length";
_mlargo = _menteros.length();
RDebugUtils.currentLine=39190586;
 //BA.debugLineNum = 39190586;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
if (_mlargo>=1 && _mlargo<=3) { 
RDebugUtils.currentLine=39190587;
 //BA.debugLineNum = 39190587;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
_mret = _mmoneda+_mret.substring((int) (0),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=39190589;
 //BA.debugLineNum = 39190589;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
if (_mlargo>=4 && _mlargo<=6) { 
RDebugUtils.currentLine=39190590;
 //BA.debugLineNum = 39190590;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
RDebugUtils.currentLine=39190592;
 //BA.debugLineNum = 39190592;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
if (_mlargo>=7 && _mlargo<=9) { 
RDebugUtils.currentLine=39190593;
 //BA.debugLineNum = 39190593;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
_mret = _mmoneda+_mret.substring((int) (0),(int) (_mlargo-6))+"'"+_mret.substring((int) (_mlargo-6),(int) (_mlargo-3))+","+_mret.substring((int) (_mlargo-3),_mlargo)+"."+_mdecimales+_mporcentaje;
 };
 };
 };
RDebugUtils.currentLine=39190597;
 //BA.debugLineNum = 39190597;BA.debugLine="If Formato = \"T\" Then";
if ((_formato).equals("T")) { 
RDebugUtils.currentLine=39190598;
 //BA.debugLineNum = 39190598;BA.debugLine="mVALOR = Valor";
_mvalor = _valor;
RDebugUtils.currentLine=39190599;
 //BA.debugLineNum = 39190599;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
_mvalor = _mvalor.replace("'","");
RDebugUtils.currentLine=39190600;
 //BA.debugLineNum = 39190600;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
_mvalor = _mvalor.replace(",","");
RDebugUtils.currentLine=39190601;
 //BA.debugLineNum = 39190601;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
_mvalor = _mvalor.replace("$","");
RDebugUtils.currentLine=39190602;
 //BA.debugLineNum = 39190602;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
_mvalor = _mvalor.replace("%","");
RDebugUtils.currentLine=39190603;
 //BA.debugLineNum = 39190603;BA.debugLine="mVALOR = mVALOR.Trim";
_mvalor = _mvalor.trim();
RDebugUtils.currentLine=39190604;
 //BA.debugLineNum = 39190604;BA.debugLine="mRET = mVALOR";
_mret = _mvalor;
 };
RDebugUtils.currentLine=39190606;
 //BA.debugLineNum = 39190606;BA.debugLine="mRET = mRET.Trim";
_mret = _mret.trim();
RDebugUtils.currentLine=39190607;
 //BA.debugLineNum = 39190607;BA.debugLine="Return mRET";
if (true) return (Object)(_mret);
RDebugUtils.currentLine=39190608;
 //BA.debugLineNum = 39190608;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(japam.SIE.b4xindicadores __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="Private TBL_Indicadores As FlexGrid";
_tbl_indicadores = new b4j.example.flexgrid();
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="Private SP_Anio As Spinner";
_sp_anio = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="Private SP_Mes As Spinner";
_sp_mes = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="Public mSQL As SD_SQL";
_msql = new japam.SIE.sd_sql();
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="Public mRS As SD_ResultSet";
_mrs = new japam.SIE.sd_resultset();
RDebugUtils.currentLine=38600717;
 //BA.debugLineNum = 38600717;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(japam.SIE.b4xindicadores __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="End Sub";
return null;
}
public String  _sp_anio_itemclick(japam.SIE.b4xindicadores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "sp_anio_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_anio_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
_main._manio /*int*/  = (int)(Double.parseDouble(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_anio /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="End Sub";
return "";
}
public String  _sp_mes_itemclick(japam.SIE.b4xindicadores __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xindicadores";
if (Debug.shouldDelegate(ba, "sp_mes_itemclick", false))
	 {return ((String) Debug.delegate(ba, "sp_mes_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
_main._mmes /*int*/  = (int)(Double.parseDouble(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .GetItem(__ref._sp_mes /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .getSelectedIndex())));
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="End Sub";
return "";
}
}