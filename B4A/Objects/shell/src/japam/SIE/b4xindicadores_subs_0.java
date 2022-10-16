package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xindicadores_subs_0 {


public static RemoteObject  _b_proceder_mouseclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Proceder_MouseClick (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("b_proceder_mouseclick")) { return __ref.runUserSub(false, "b4xindicadores","b_proceder_mouseclick", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Private Sub B_Proceder_MouseClick";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 60;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(134217728);
__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="Cargar_Valores";
Debug.ShouldStop(268435456);
__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_cargar_valores" /*RemoteObject*/ );
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("B_Regresar_Click (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("b_regresar_click")) { return __ref.runUserSub(false, "b4xindicadores","b_regresar_click", __ref);}
 BA.debugLineNum = 146;BA.debugLine="Private Sub B_Regresar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 147;BA.debugLine="If Main.mDERECHO = 99 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",b4xindicadores._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 148;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
Debug.ShouldStop(524288);
b4xindicadores._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu")));
 }else {
 BA.debugLineNum = 150;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2097152);
b4xindicadores._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("B4XPage_Created (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xindicadores","b4xpage_created", __ref, _root1);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Dim x As Int";
Debug.ShouldStop(8388608);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 26;BA.debugLine="Log(\"B4XIndicadores\")";
Debug.ShouldStop(33554432);
b4xindicadores.__c.runVoidMethod ("LogImpl","238731780",RemoteObject.createImmutable("B4XIndicadores"),0);
 BA.debugLineNum = 27;BA.debugLine="Root = Root1";
Debug.ShouldStop(67108864);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 28;BA.debugLine="Root.LoadLayout(\"Indicadores\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Indicadores")),__ref.getField(false, "ba"));
 BA.debugLineNum = 29;BA.debugLine="TBL_Indicadores.ColsName=Array As String(\"Indicad";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runMethod(false,"_setcolsname",RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("Indicador"),BA.ObjectToString("Valor"),BA.ObjectToString("Meta"),BA.ObjectToString("Cumple al"),BA.ObjectToString("Mínimo"),RemoteObject.createImmutable("Máximo")}));
 BA.debugLineNum = 30;BA.debugLine="TBL_Indicadores.ColsWidth=Array As Int(300dip, 80";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolswidth",RemoteObject.createNewArray("int",new int[] {6},new Object[] {b4xindicadores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300))),b4xindicadores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xindicadores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xindicadores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xindicadores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xindicadores.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}));
 BA.debugLineNum = 31;BA.debugLine="TBL_Indicadores.ColsType=Array As Int(TBL_Indicad";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolstype",RemoteObject.createNewArray("int",new int[] {6},new Object[] {__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).getField(true,"_typestring")}));
 BA.debugLineNum = 32;BA.debugLine="TBL_Indicadores.ColsAlignment=Array As String(\"LE";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolsalignment",RemoteObject.createNewArray("String",new int[] {6},new Object[] {BA.ObjectToString("LEFT"),BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER"),BA.ObjectToString("CENTER"),RemoteObject.createImmutable("CENTER")}));
 BA.debugLineNum = 33;BA.debugLine="TBL_Indicadores.SetColCustomize(0, xui.Color_RGB(";
Debug.ShouldStop(1);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 34;BA.debugLine="TBL_Indicadores.SetColCustomize(1, xui.Color_RGB(";
Debug.ShouldStop(2);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 35;BA.debugLine="TBL_Indicadores.SetColCustomize(2, xui.Color_RGB(";
Debug.ShouldStop(4);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 36;BA.debugLine="TBL_Indicadores.SetColCustomize(3, xui.Color_RGB(";
Debug.ShouldStop(8);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 37;BA.debugLine="TBL_Indicadores.SetColCustomize(4, xui.Color_RGB(";
Debug.ShouldStop(16);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 4)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 38;BA.debugLine="TBL_Indicadores.SetColCustomize(5, xui.Color_RGB(";
Debug.ShouldStop(32);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 5)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 40;BA.debugLine="For x = 2021 To 2027";
Debug.ShouldStop(128);
{
final int step16 = 1;
final int limit16 = 2027;
_x = BA.numberCast(int.class, 2021) ;
for (;(step16 > 0 && _x.<Integer>get().intValue() <= limit16) || (step16 < 0 && _x.<Integer>get().intValue() >= limit16) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 42;BA.debugLine="SP_Anio.add(x)";
Debug.ShouldStop(512);
__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 45;BA.debugLine="For x = 1 To 12";
Debug.ShouldStop(4096);
{
final int step19 = 1;
final int limit19 = 12;
_x = BA.numberCast(int.class, 1) ;
for (;(step19 > 0 && _x.<Integer>get().intValue() <= limit19) || (step19 < 0 && _x.<Integer>get().intValue() >= limit19) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step19))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 47;BA.debugLine="SP_Mes.Add(x)";
Debug.ShouldStop(16384);
__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargar_valores(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Cargar_Valores (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("cargar_valores")) { return __ref.runUserSub(false, "b4xindicadores","cargar_valores", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mindicadores = null;
RemoteObject _mvalores = null;
RemoteObject _mmetas = null;
RemoteObject _mcumplimientos = null;
RemoteObject _mminimos = null;
RemoteObject _mmaximos = null;
RemoteObject _mindicador = RemoteObject.createImmutable("");
RemoteObject _mvalor = RemoteObject.createImmutable("");
RemoteObject _mmeta = RemoteObject.createImmutable("");
RemoteObject _mcumplimiento = RemoteObject.createImmutable("");
RemoteObject _mminimo = RemoteObject.createImmutable("");
RemoteObject _mmaximo = RemoteObject.createImmutable("");
 BA.debugLineNum = 66;BA.debugLine="Sub Cargar_Valores()";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="Dim x As Int";
Debug.ShouldStop(4);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 68;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(8);
b4xindicadores._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xindicadores._mrs);
 BA.debugLineNum = 69;BA.debugLine="Dim mINDICADORES(50), mVALORES(50), mMETAS(50) As";
Debug.ShouldStop(16);
_mindicadores = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mINDICADORES", _mindicadores);
_mvalores = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mVALORES", _mvalores);
_mmetas = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mMETAS", _mmetas);
 BA.debugLineNum = 70;BA.debugLine="Dim mCUMPLIMIENTOS(50), mMINIMOS(50), mMAXIMOS(50";
Debug.ShouldStop(32);
_mcumplimientos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mCUMPLIMIENTOS", _mcumplimientos);
_mminimos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mMINIMOS", _mminimos);
_mmaximos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mMAXIMOS", _mmaximos);
 BA.debugLineNum = 71;BA.debugLine="Dim mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMI";
Debug.ShouldStop(64);
_mindicador = RemoteObject.createImmutable("");Debug.locals.put("mINDICADOR", _mindicador);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
_mmeta = RemoteObject.createImmutable("");Debug.locals.put("mMETA", _mmeta);
_mcumplimiento = RemoteObject.createImmutable("");Debug.locals.put("mCUMPLIMIENTO", _mcumplimiento);
_mminimo = RemoteObject.createImmutable("");Debug.locals.put("mMINIMO", _mminimo);
_mmaximo = RemoteObject.createImmutable("");Debug.locals.put("mMAXIMO", _mmaximo);
 BA.debugLineNum = 73;BA.debugLine="TBL_Indicadores.ClearRows";
Debug.ShouldStop(256);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 74;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(512);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 75;BA.debugLine="Main.mCONEXION = True";
Debug.ShouldStop(1024);
b4xindicadores._main._mconexion /*RemoteObject*/  = b4xindicadores.__c.getField(true,"True");
 BA.debugLineNum = 76;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_indicado";
Debug.ShouldStop(2048);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_indicadores WHERE ind_anio = "),b4xindicadores._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 77;BA.debugLine="Main.mULT_INDICADOR = -1";
Debug.ShouldStop(4096);
b4xindicadores._main._mult_indicador /*RemoteObject*/  = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 78;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(8192);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 79;BA.debugLine="Main.mULT_INDICADOR = Main.mULT_INDICADOR + 1";
Debug.ShouldStop(16384);
b4xindicadores._main._mult_indicador /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4xindicadores._main._mult_indicador /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 80;BA.debugLine="mINDICADORES(Main.mULT_INDICADOR) = mRS.GetStri";
Debug.ShouldStop(32768);
_mindicadores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_descripcion"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="mMETAS(Main.mULT_INDICADOR) = mRS.GetString(\"in";
Debug.ShouldStop(65536);
_mmetas.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_meta"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="mMINIMOS(Main.mULT_INDICADOR) = mRS.GetString(\"";
Debug.ShouldStop(131072);
_mminimos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_minimo"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="mMAXIMOS(Main.mULT_INDICADOR) = mRS.GetString(\"";
Debug.ShouldStop(262144);
_mmaximos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_maximo"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 84;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(524288);
switch (BA.switchObjectToInt(b4xindicadores._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 86;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(2097152);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_ene"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(4194304);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_ene"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 89;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(16777216);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_feb"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 90;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(33554432);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_feb"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 92;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(134217728);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_mar"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(268435456);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_mar"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 95;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(1073741824);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_abr"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(-2147483648);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_abr"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 98;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(2);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_may"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 99;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(4);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_may"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 101;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(16);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_jun"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 102;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(32);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_jun"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 104;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(128);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_jul"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 105;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(256);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_jul"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 7: {
 BA.debugLineNum = 107;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(1024);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_ago"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(2048);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_ago"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 8: {
 BA.debugLineNum = 110;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(8192);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_sep"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 111;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(16384);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_sep"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 9: {
 BA.debugLineNum = 113;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(65536);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_oct"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 114;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(131072);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_oct"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 10: {
 BA.debugLineNum = 116;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(524288);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_nov"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(1048576);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_nov"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
case 11: {
 BA.debugLineNum = 119;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
Debug.ShouldStop(4194304);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_dic"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 BA.debugLineNum = 120;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
Debug.ShouldStop(8388608);
_mcumplimientos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ind_c_dic"))),b4xindicadores._main._mult_indicador /*RemoteObject*/ );
 break; }
}
;
 }
;
 BA.debugLineNum = 123;BA.debugLine="For x = 0 To Main.mULT_INDICADOR";
Debug.ShouldStop(67108864);
{
final int step56 = 1;
final int limit56 = b4xindicadores._main._mult_indicador /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step56 > 0 && _x.<Integer>get().intValue() <= limit56) || (step56 < 0 && _x.<Integer>get().intValue() >= limit56) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step56))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 125;BA.debugLine="mINDICADOR = mINDICADORES(x)";
Debug.ShouldStop(268435456);
_mindicador = _mindicadores.getArrayElement(true,_x);Debug.locals.put("mINDICADOR", _mindicador);
 BA.debugLineNum = 126;BA.debugLine="If mINDICADOR.Contains(\"%\") Then";
Debug.ShouldStop(536870912);
if (_mindicador.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("%"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 127;BA.debugLine="mVALOR = mFORMATO(mVALORES(x), \"P\")";
Debug.ShouldStop(1073741824);
_mvalor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mvalores.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 128;BA.debugLine="mMETA  = mFORMATO(mMETAS(x), \"P\")";
Debug.ShouldStop(-2147483648);
_mmeta = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mmetas.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mMETA", _mmeta);
 BA.debugLineNum = 129;BA.debugLine="mMINIMO  = mFORMATO(mMINIMOS(x), \"P\")";
Debug.ShouldStop(1);
_mminimo = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mminimos.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mMINIMO", _mminimo);
 BA.debugLineNum = 130;BA.debugLine="mMAXIMO = mFORMATO(mMAXIMOS(x), \"P\")";
Debug.ShouldStop(2);
_mmaximo = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mmaximos.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mMAXIMO", _mmaximo);
 }else {
 BA.debugLineNum = 132;BA.debugLine="mVALOR = mFORMATO(mVALORES(x), \"N\")";
Debug.ShouldStop(8);
_mvalor = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mvalores.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 133;BA.debugLine="mMETA  = mFORMATO(mMETAS(x), \"N\")";
Debug.ShouldStop(16);
_mmeta = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mmetas.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mMETA", _mmeta);
 BA.debugLineNum = 134;BA.debugLine="mMINIMO  = mFORMATO(mMINIMOS(x), \"N\")";
Debug.ShouldStop(32);
_mminimo = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mminimos.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mMINIMO", _mminimo);
 BA.debugLineNum = 135;BA.debugLine="mMAXIMO = mFORMATO(mMAXIMOS(x), \"N\")";
Debug.ShouldStop(64);
_mmaximo = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mmaximos.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mMAXIMO", _mmaximo);
 };
 BA.debugLineNum = 137;BA.debugLine="mCUMPLIMIENTO = mFORMATO(mCUMPLIMIENTOS(x), \"P\"";
Debug.ShouldStop(256);
_mcumplimiento = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xindicadores.class, "_mformato" /*RemoteObject*/ ,(Object)(_mcumplimientos.getArrayElement(true,_x)),(Object)(RemoteObject.createImmutable("P"))));Debug.locals.put("mCUMPLIMIENTO", _mcumplimiento);
 BA.debugLineNum = 138;BA.debugLine="TBL_Indicadores.AddRow(Array As Object(mINDICAD";
Debug.ShouldStop(512);
__ref.getField(false,"_tbl_indicadores" /*RemoteObject*/ ).runVoidMethod ("_addrow",(Object)(RemoteObject.createNewArray("Object",new int[] {6},new Object[] {(_mindicador),(_mvalor),(_mmeta),(_mcumplimiento),(_mminimo),(_mmaximo)})),(Object)(b4xindicadores.__c.getField(true,"True")));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 140;BA.debugLine="msql.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 142;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
Debug.ShouldStop(8192);
b4xindicadores.__c.runVoidMethod ("LogImpl","238993996",RemoteObject.createImmutable("---------- SIE Database (MSSQL)  Fallo de conexion ----------"),0);
 };
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
b4xindicadores._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xindicadores._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xindicadores._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xindicadores._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private B_Regresar As Button";
b4xindicadores._b_regresar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_regresar",b4xindicadores._b_regresar);
 //BA.debugLineNum = 8;BA.debugLine="Private B_Proceder As Button";
b4xindicadores._b_proceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_proceder",b4xindicadores._b_proceder);
 //BA.debugLineNum = 9;BA.debugLine="Private TBL_Indicadores As FlexGrid";
b4xindicadores._tbl_indicadores = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_indicadores",b4xindicadores._tbl_indicadores);
 //BA.debugLineNum = 10;BA.debugLine="Private SP_Anio As Spinner";
b4xindicadores._sp_anio = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_anio",b4xindicadores._sp_anio);
 //BA.debugLineNum = 11;BA.debugLine="Private SP_Mes As Spinner";
b4xindicadores._sp_mes = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_mes",b4xindicadores._sp_mes);
 //BA.debugLineNum = 12;BA.debugLine="Public mSQL As SD_SQL";
b4xindicadores._msql = RemoteObject.createNew ("japam.SIE.sd_sql");__ref.setField("_msql",b4xindicadores._msql);
 //BA.debugLineNum = 13;BA.debugLine="Public mRS As SD_ResultSet";
b4xindicadores._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xindicadores._mrs);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _conectar_servidor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conectar_Servidor (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("conectar_servidor")) { return __ref.runUserSub(false, "b4xindicadores","conectar_servidor", __ref);}
 BA.debugLineNum = 154;BA.debugLine="Public Sub Conectar_Servidor()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 155;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MYSQL")),(Object)(BA.ObjectToString("com.mysql.jdbc.Driver")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("jdbc:mysql://"),b4xindicadores.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xindicadores._main._servidor /*RemoteObject*/ ))),RemoteObject.createImmutable("/u567762233_SIE?useSSL=false")))),(Object)(b4xindicadores._main._administrador /*RemoteObject*/ ),(Object)(b4xindicadores._main._password /*RemoteObject*/ ));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("Initialize (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xindicadores","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(65536);
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.ShouldStop(131072);
if (true) return __ref;
 BA.debugLineNum = 19;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("mFORMATO (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("mformato")) { return __ref.runUserSub(false, "b4xindicadores","mformato", __ref, _valor, _formato);}
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
 BA.debugLineNum = 158;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 165;BA.debugLine="Dim mRET As String";
Debug.ShouldStop(16);
_mret = RemoteObject.createImmutable("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 166;BA.debugLine="Dim mVALOR As String";
Debug.ShouldStop(32);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 167;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
Debug.ShouldStop(64);
_menteros = RemoteObject.createImmutable("");Debug.locals.put("mENTEROS", _menteros);
_mdecimales = RemoteObject.createImmutable("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 168;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
Debug.ShouldStop(128);
_mlargo = RemoteObject.createImmutable(0);Debug.locals.put("mLARGO", _mlargo);
_mpos_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 169;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
Debug.ShouldStop(256);
_mmoneda = RemoteObject.createImmutable("");Debug.locals.put("mMONEDA", _mmoneda);
_mporcentaje = RemoteObject.createImmutable("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 BA.debugLineNum = 170;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
Debug.ShouldStop(512);
_mini_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
_mfin_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 172;BA.debugLine="mRET = \"\"";
Debug.ShouldStop(2048);
_mret = BA.ObjectToString("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 173;BA.debugLine="Formato = Formato.ToUpperCase";
Debug.ShouldStop(4096);
_formato = _formato.runMethod(true,"toUpperCase");Debug.locals.put("Formato", _formato);
 BA.debugLineNum = 174;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("N")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 175;BA.debugLine="mRET = Valor";
Debug.ShouldStop(16384);
_mret = _valor;Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 176;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
Debug.ShouldStop(32768);
_mret = _mret.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 177;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(65536);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 178;BA.debugLine="mLARGO = mRET.Length";
Debug.ShouldStop(131072);
_mlargo = _mret.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 179;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
Debug.ShouldStop(262144);
_mpos_decimal = _mret.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 180;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(524288);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 181;BA.debugLine="mDECIMALES = \"\"";
Debug.ShouldStop(1048576);
_mdecimales = BA.ObjectToString("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 182;BA.debugLine="If Formato = \"M\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M"))) { 
 BA.debugLineNum = 183;BA.debugLine="mMONEDA = \"$\"";
Debug.ShouldStop(4194304);
_mmoneda = BA.ObjectToString("$");Debug.locals.put("mMONEDA", _mmoneda);
 }else {
 BA.debugLineNum = 185;BA.debugLine="mMONEDA = \"\"";
Debug.ShouldStop(16777216);
_mmoneda = BA.ObjectToString("");Debug.locals.put("mMONEDA", _mmoneda);
 };
 BA.debugLineNum = 187;BA.debugLine="If Formato = \"P\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 188;BA.debugLine="mPORCENTAJE = \"%\"";
Debug.ShouldStop(134217728);
_mporcentaje = BA.ObjectToString("%");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 }else {
 BA.debugLineNum = 190;BA.debugLine="mPORCENTAJE = \"\"";
Debug.ShouldStop(536870912);
_mporcentaje = BA.ObjectToString("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 };
 BA.debugLineNum = 192;BA.debugLine="If mPOS_DECIMAL = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 193;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(1);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 194;BA.debugLine="mDECIMALES = mRET";
Debug.ShouldStop(2);
_mdecimales = _mret;Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 195;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
Debug.ShouldStop(4);
_mret = RemoteObject.concat(_mmoneda,RemoteObject.createImmutable("0"),_mdecimales,RemoteObject.createImmutable(" "),_mporcentaje);Debug.locals.put("mRET", _mret);
 }else {
 BA.debugLineNum = 197;BA.debugLine="If mPOS_DECIMAL = -1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 198;BA.debugLine="mENTEROS = mRET";
Debug.ShouldStop(32);
_menteros = _mret;Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 199;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(64);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 }else {
 BA.debugLineNum = 201;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
Debug.ShouldStop(256);
_menteros = _mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mpos_decimal));Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 202;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
Debug.ShouldStop(512);
_mini_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 BA.debugLineNum = 203;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_mini_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 204;BA.debugLine="mINI_DECIMAL = mLARGO";
Debug.ShouldStop(2048);
_mini_decimal = _mlargo;Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 };
 BA.debugLineNum = 206;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
Debug.ShouldStop(8192);
_mfin_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 207;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_mfin_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 208;BA.debugLine="mFIN_DECIMAL = mLARGO";
Debug.ShouldStop(32768);
_mfin_decimal = _mlargo;Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 };
 BA.debugLineNum = 210;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
Debug.ShouldStop(131072);
_mdecimales = _mret.runMethod(true,"substring",(Object)(_mini_decimal),(Object)(_mfin_decimal));Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 212;BA.debugLine="If mDECIMALES.Length = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_mdecimales.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 213;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(1048576);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 215;BA.debugLine="mLARGO = mENTEROS.Length";
Debug.ShouldStop(4194304);
_mlargo = _menteros.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 216;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 217;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
Debug.ShouldStop(16777216);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 219;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 4)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 220;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
Debug.ShouldStop(134217728);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 222;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 7)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 223;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
Debug.ShouldStop(1073741824);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1))),RemoteObject.createImmutable("'"),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 };
 };
 BA.debugLineNum = 227;BA.debugLine="If Formato = \"T\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("T"))) { 
 BA.debugLineNum = 228;BA.debugLine="mVALOR = Valor";
Debug.ShouldStop(8);
_mvalor = _valor;Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 229;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
Debug.ShouldStop(16);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 230;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
Debug.ShouldStop(32);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 231;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
Debug.ShouldStop(64);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 232;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
Debug.ShouldStop(128);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("%")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 233;BA.debugLine="mVALOR = mVALOR.Trim";
Debug.ShouldStop(256);
_mvalor = _mvalor.runMethod(true,"trim");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 234;BA.debugLine="mRET = mVALOR";
Debug.ShouldStop(512);
_mret = _mvalor;Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 236;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(2048);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 237;BA.debugLine="Return mRET";
Debug.ShouldStop(4096);
if (true) return (_mret);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("SP_Anio_ItemClick (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("sp_anio_itemclick")) { return __ref.runUserSub(false, "b4xindicadores","sp_anio_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 51;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
Debug.ShouldStop(524288);
b4xindicadores._main._manio /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("SP_Mes_ItemClick (b4xindicadores) ","b4xindicadores",6,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("sp_mes_itemclick")) { return __ref.runUserSub(false, "b4xindicadores","sp_mes_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 55;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
Debug.ShouldStop(8388608);
b4xindicadores._main._mmes /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}