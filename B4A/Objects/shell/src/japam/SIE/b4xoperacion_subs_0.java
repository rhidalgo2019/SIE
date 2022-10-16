package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xoperacion_subs_0 {


public static RemoteObject  _b_guardar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Guardar_Click (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("b_guardar_click")) { return __ref.runUserSub(false, "b4xoperacion","b_guardar_click", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mclaves = null;
RemoteObject _mdescripciones = null;
RemoteObject _mextraidos = null;
RemoteObject _mcompletos = RemoteObject.createImmutable(false);
 BA.debugLineNum = 135;BA.debugLine="Private Sub B_Guardar_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="Dim x As Int";
Debug.ShouldStop(128);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 137;BA.debugLine="Dim mCLAVES(50), mDESCRIPCIONES(50) As String";
Debug.ShouldStop(256);
_mclaves = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mCLAVES", _mclaves);
_mdescripciones = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mDESCRIPCIONES", _mdescripciones);
 BA.debugLineNum = 138;BA.debugLine="Dim mEXTRAIDOS(50) As Int";
Debug.ShouldStop(512);
_mextraidos = RemoteObject.createNewArray ("int", new int[] {50}, new Object[]{});Debug.locals.put("mEXTRAIDOS", _mextraidos);
 BA.debugLineNum = 139;BA.debugLine="Dim mCOMPLETOS As Boolean";
Debug.ShouldStop(1024);
_mcompletos = RemoteObject.createImmutable(false);Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 141;BA.debugLine="mCOMPLETOS = True";
Debug.ShouldStop(4096);
_mcompletos = b4xoperacion.__c.getField(true,"True");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 142;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
Debug.ShouldStop(8192);
{
final int step6 = 1;
final int limit6 = b4xoperacion._main._mult_extraido /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _x.<Integer>get().intValue() <= limit6) || (step6 < 0 && _x.<Integer>get().intValue() >= limit6) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 143;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_Pozos.GetCellValue(";
Debug.ShouldStop(16384);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.runClassMethod (japam.SIE.b4xoperacion.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 1))))),(Object)(RemoteObject.createImmutable("T")))),_x);
 BA.debugLineNum = 144;BA.debugLine="If mEXTRAIDOS(x) = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_mextraidos.getArrayElement(true,_x),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 145;BA.debugLine="mCOMPLETOS = False";
Debug.ShouldStop(65536);
_mcompletos = b4xoperacion.__c.getField(true,"False");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 146;BA.debugLine="Exit";
Debug.ShouldStop(131072);
if (true) break;
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 150;BA.debugLine="mCOMPLETOS = True";
Debug.ShouldStop(2097152);
_mcompletos = b4xoperacion.__c.getField(true,"True");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 152;BA.debugLine="If mCOMPLETOS Then";
Debug.ShouldStop(8388608);
if (_mcompletos.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 153;BA.debugLine="If mSQL.IsInitialized  Then";
Debug.ShouldStop(16777216);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 154;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
Debug.ShouldStop(33554432);
{
final int step16 = 1;
final int limit16 = b4xoperacion._main._mult_extraido /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _x.<Integer>get().intValue() <= limit16) || (step16 < 0 && _x.<Integer>get().intValue() >= limit16) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 155;BA.debugLine="mCLAVES(x) = TBL_Pozos.GetCellValue(x, 0)";
Debug.ShouldStop(67108864);
_mclaves.setArrayElement (BA.ObjectToString(__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0)))),_x);
 BA.debugLineNum = 156;BA.debugLine="mDESCRIPCIONES(x) = TBL_Pozos.GetCellValue(x,";
Debug.ShouldStop(134217728);
_mdescripciones.setArrayElement (BA.ObjectToString(__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 1)))),_x);
 BA.debugLineNum = 157;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_Pozos.GetCellValu";
Debug.ShouldStop(268435456);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.runClassMethod (japam.SIE.b4xoperacion.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("T")))),_x);
 BA.debugLineNum = 158;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(b4xoperacion._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 160;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_ene = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 162;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(2);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_feb = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 2: {
 BA.debugLineNum = 164;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_mar = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 3: {
 BA.debugLineNum = 166;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_abr = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 4: {
 BA.debugLineNum = 168;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_may = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 5: {
 BA.debugLineNum = 170;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_jun = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 6: {
 BA.debugLineNum = 172;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_jul = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 7: {
 BA.debugLineNum = 174;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_ago = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 8: {
 BA.debugLineNum = 176;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_sep = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 9: {
 BA.debugLineNum = 178;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_oct = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 10: {
 BA.debugLineNum = 180;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_nov = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 182;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_extraido SET e";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_extraido SET ext_dic = "),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE ext_clave = '"),_mclaves.getArrayElement(true,_x),RemoteObject.createImmutable("' AND ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ )));
 break; }
}
;
 }
}Debug.locals.put("x", _x);
;
 };
 BA.debugLineNum = 187;BA.debugLine="mSQL.Close";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 189;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
Debug.ShouldStop(268435456);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta"))));
 };
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _b_proceder_mouseclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Proceder_MouseClick (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("b_proceder_mouseclick")) { return __ref.runUserSub(false, "b4xoperacion","b_proceder_mouseclick", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub B_Proceder_MouseClick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(8388608);
__ref.runClassMethod (japam.SIE.b4xoperacion.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="Cargar_Valores";
Debug.ShouldStop(16777216);
__ref.runClassMethod (japam.SIE.b4xoperacion.class, "_cargar_valores" /*RemoteObject*/ );
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("B_Regresar_Click (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("b_regresar_click")) { return __ref.runUserSub(false, "b4xoperacion","b_regresar_click", __ref);}
 BA.debugLineNum = 193;BA.debugLine="Private Sub B_Regresar_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="If Main.mDERECHO = 99 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",b4xoperacion._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 195;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
Debug.ShouldStop(4);
b4xoperacion._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu")));
 }else {
 BA.debugLineNum = 197;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16);
b4xoperacion._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 199;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("B4XPage_Created (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xoperacion","b4xpage_created", __ref, _root1);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Dim x As Int";
Debug.ShouldStop(2097152);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 24;BA.debugLine="Log(\"B4XOperacion\")";
Debug.ShouldStop(8388608);
b4xoperacion.__c.runVoidMethod ("LogImpl","240697859",RemoteObject.createImmutable("B4XOperacion"),0);
 BA.debugLineNum = 25;BA.debugLine="Root = Root1";
Debug.ShouldStop(16777216);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"Operacion\")";
Debug.ShouldStop(33554432);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Operacion")),__ref.getField(false, "ba"));
 BA.debugLineNum = 27;BA.debugLine="TBL_Pozos.ClearRows";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 28;BA.debugLine="TBL_Pozos.ColsName=Array As String(\"Pozo\", \"Denom";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_setcolsname",RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("Pozo"),BA.ObjectToString("Denominación"),RemoteObject.createImmutable("Extraido")}));
 BA.debugLineNum = 29;BA.debugLine="TBL_Pozos.ColsWidth=Array As Int(80dip, 202dip, 8";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcolswidth",RemoteObject.createNewArray("int",new int[] {3},new Object[] {b4xoperacion.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),b4xoperacion.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 202))),b4xoperacion.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}));
 BA.debugLineNum = 30;BA.debugLine="TBL_Pozos.ColsType=Array As Int(TBL_Pozos.TypeStr";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcolstype",RemoteObject.createNewArray("int",new int[] {3},new Object[] {__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).getField(true,"_typestring")}));
 BA.debugLineNum = 31;BA.debugLine="TBL_Pozos.ColsAlignment=Array As String(\"CENTER\",";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcolsalignment",RemoteObject.createNewArray("String",new int[] {3},new Object[] {BA.ObjectToString("CENTER"),BA.ObjectToString("LEFT"),RemoteObject.createImmutable("CENTER")}));
 BA.debugLineNum = 32;BA.debugLine="TBL_Pozos.SetColCustomize(0, xui.Color_RGB(0, 0,";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 33;BA.debugLine="TBL_Pozos.SetColCustomize(1, xui.Color_RGB(0, 0,";
Debug.ShouldStop(1);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 34;BA.debugLine="TBL_Pozos.SetColCustomize(2, xui.Color_RGB(0, 0,";
Debug.ShouldStop(2);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 36;BA.debugLine="For x = 2021 To 2027";
Debug.ShouldStop(8);
{
final int step13 = 1;
final int limit13 = 2027;
_x = BA.numberCast(int.class, 2021) ;
for (;(step13 > 0 && _x.<Integer>get().intValue() <= limit13) || (step13 < 0 && _x.<Integer>get().intValue() >= limit13) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 38;BA.debugLine="SP_Anio.add(x)";
Debug.ShouldStop(32);
__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 41;BA.debugLine="For x = 1 To 12";
Debug.ShouldStop(256);
{
final int step16 = 1;
final int limit16 = 12;
_x = BA.numberCast(int.class, 1) ;
for (;(step16 > 0 && _x.<Integer>get().intValue() <= limit16) || (step16 < 0 && _x.<Integer>get().intValue() >= limit16) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 43;BA.debugLine="SP_Mes.Add(x)";
Debug.ShouldStop(1024);
__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Cargar_Valores (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("cargar_valores")) { return __ref.runUserSub(false, "b4xoperacion","cargar_valores", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mclaves = null;
RemoteObject _mdescripciones = null;
RemoteObject _mextraidos = null;
RemoteObject _mcadena = RemoteObject.createImmutable("");
 BA.debugLineNum = 62;BA.debugLine="Sub Cargar_Valores()";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim x As Int";
Debug.ShouldStop(1073741824);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 64;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(-2147483648);
b4xoperacion._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xoperacion._mrs);
 BA.debugLineNum = 65;BA.debugLine="Dim mCLAVES(50), mDESCRIPCIONES(50) As String";
Debug.ShouldStop(1);
_mclaves = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mCLAVES", _mclaves);
_mdescripciones = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mDESCRIPCIONES", _mdescripciones);
 BA.debugLineNum = 66;BA.debugLine="Dim mEXTRAIDOS(50) As Int";
Debug.ShouldStop(2);
_mextraidos = RemoteObject.createNewArray ("int", new int[] {50}, new Object[]{});Debug.locals.put("mEXTRAIDOS", _mextraidos);
 BA.debugLineNum = 67;BA.debugLine="Dim mCADENA As String";
Debug.ShouldStop(4);
_mcadena = RemoteObject.createImmutable("");Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 69;BA.debugLine="TBL_Pozos.ClearRows";
Debug.ShouldStop(16);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 70;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(32);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 71;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_extraido";
Debug.ShouldStop(64);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_extraido WHERE ext_anio = "),b4xoperacion._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 72;BA.debugLine="Main.mULT_EXTRAIDO = -1";
Debug.ShouldStop(128);
b4xoperacion._main._mult_extraido /*RemoteObject*/  = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 73;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(256);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 74;BA.debugLine="Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1";
Debug.ShouldStop(512);
b4xoperacion._main._mult_extraido /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4xoperacion._main._mult_extraido /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 75;BA.debugLine="mCLAVES(Main.mULT_EXTRAIDO) = mRS.GetString(\"ex";
Debug.ShouldStop(1024);
_mclaves.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_clave"))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="mDESCRIPCIONES(Main.mULT_EXTRAIDO) = mRS.GetStr";
Debug.ShouldStop(2048);
_mdescripciones.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_descripcion"))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(b4xoperacion._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 79;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(16384);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_ene")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 81;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(65536);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_feb")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 83;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(262144);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_mar")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 85;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(1048576);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_abr")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 87;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(4194304);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_may")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 89;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(16777216);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_jun")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 91;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(67108864);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_jul")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 7: {
 BA.debugLineNum = 93;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(268435456);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_ago")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 8: {
 BA.debugLineNum = 95;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(1073741824);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_sep")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 9: {
 BA.debugLineNum = 97;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(1);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_oct")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 10: {
 BA.debugLineNum = 99;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(4);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_nov")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
case 11: {
 BA.debugLineNum = 101;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
Debug.ShouldStop(16);
_mextraidos.setArrayElement (BA.numberCast(int.class, __ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ext_dic")))),b4xoperacion._main._mult_extraido /*RemoteObject*/ );
 break; }
}
;
 }
;
 BA.debugLineNum = 104;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
Debug.ShouldStop(128);
{
final int step41 = 1;
final int limit41 = b4xoperacion._main._mult_extraido /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step41 > 0 && _x.<Integer>get().intValue() <= limit41) || (step41 < 0 && _x.<Integer>get().intValue() >= limit41) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step41))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 106;BA.debugLine="mCADENA = mFORMATO(mEXTRAIDOS(x).As(String), \"N";
Debug.ShouldStop(512);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xoperacion.class, "_mformato" /*RemoteObject*/ ,(Object)((BA.NumberToString(_mextraidos.getArrayElement(true,_x)))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 108;BA.debugLine="TBL_Pozos.AddRow(Array As Object(mCLAVES(x), mD";
Debug.ShouldStop(2048);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_addrow",(Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_mclaves.getArrayElement(true,_x)),(_mdescripciones.getArrayElement(true,_x)),(_mcadena)})),(Object)(b4xoperacion.__c.getField(true,"True")));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 110;BA.debugLine="mSQL.Close";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 112;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
Debug.ShouldStop(32768);
b4xoperacion.__c.runVoidMethod ("LogImpl","240960050",RemoteObject.createImmutable("---------- SIE Database (MSSQL)  Fallo de conexion ----------"),0);
 };
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
b4xoperacion._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xoperacion._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xoperacion._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xoperacion._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private TBL_Pozos As FlexGrid";
b4xoperacion._tbl_pozos = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_pozos",b4xoperacion._tbl_pozos);
 //BA.debugLineNum = 6;BA.debugLine="Private B_Proceder As Button";
b4xoperacion._b_proceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_proceder",b4xoperacion._b_proceder);
 //BA.debugLineNum = 7;BA.debugLine="Private B_Regresar As Button";
b4xoperacion._b_regresar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_regresar",b4xoperacion._b_regresar);
 //BA.debugLineNum = 8;BA.debugLine="Private B_Guardar As Button";
b4xoperacion._b_guardar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_guardar",b4xoperacion._b_guardar);
 //BA.debugLineNum = 9;BA.debugLine="Private SP_Anio As Spinner";
b4xoperacion._sp_anio = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_anio",b4xoperacion._sp_anio);
 //BA.debugLineNum = 10;BA.debugLine="Private SP_Mes As Spinner";
b4xoperacion._sp_mes = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_mes",b4xoperacion._sp_mes);
 //BA.debugLineNum = 11;BA.debugLine="Public mSQL As SD_SQL";
b4xoperacion._msql = RemoteObject.createNew ("japam.SIE.sd_sql");__ref.setField("_msql",b4xoperacion._msql);
 //BA.debugLineNum = 12;BA.debugLine="Public mRS As SD_ResultSet";
b4xoperacion._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xoperacion._mrs);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _conectar_servidor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conectar_Servidor (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("conectar_servidor")) { return __ref.runUserSub(false, "b4xoperacion","conectar_servidor", __ref);}
 BA.debugLineNum = 201;BA.debugLine="Public Sub Conectar_Servidor()";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MYSQL")),(Object)(BA.ObjectToString("com.mysql.jdbc.Driver")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("jdbc:mysql://"),b4xoperacion.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xoperacion._main._servidor /*RemoteObject*/ ))),RemoteObject.createImmutable("/u567762233_SIE?useSSL=false")))),(Object)(b4xoperacion._main._administrador /*RemoteObject*/ ),(Object)(b4xoperacion._main._password /*RemoteObject*/ ));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Initialize (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xoperacion","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="Return Me";
Debug.ShouldStop(65536);
if (true) return __ref;
 BA.debugLineNum = 18;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("mFORMATO (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("mformato")) { return __ref.runUserSub(false, "b4xoperacion","mformato", __ref, _valor, _formato);}
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
 BA.debugLineNum = 205;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
Debug.ShouldStop(4096);
 BA.debugLineNum = 212;BA.debugLine="Dim mRET As String";
Debug.ShouldStop(524288);
_mret = RemoteObject.createImmutable("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 213;BA.debugLine="Dim mVALOR As String";
Debug.ShouldStop(1048576);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 214;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
Debug.ShouldStop(2097152);
_menteros = RemoteObject.createImmutable("");Debug.locals.put("mENTEROS", _menteros);
_mdecimales = RemoteObject.createImmutable("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 215;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
Debug.ShouldStop(4194304);
_mlargo = RemoteObject.createImmutable(0);Debug.locals.put("mLARGO", _mlargo);
_mpos_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 216;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
Debug.ShouldStop(8388608);
_mmoneda = RemoteObject.createImmutable("");Debug.locals.put("mMONEDA", _mmoneda);
_mporcentaje = RemoteObject.createImmutable("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 BA.debugLineNum = 217;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
Debug.ShouldStop(16777216);
_mini_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
_mfin_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 219;BA.debugLine="mRET = \"\"";
Debug.ShouldStop(67108864);
_mret = BA.ObjectToString("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 220;BA.debugLine="Formato = Formato.ToUpperCase";
Debug.ShouldStop(134217728);
_formato = _formato.runMethod(true,"toUpperCase");Debug.locals.put("Formato", _formato);
 BA.debugLineNum = 221;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("N")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 222;BA.debugLine="mRET = Valor";
Debug.ShouldStop(536870912);
_mret = _valor;Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 223;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
Debug.ShouldStop(1073741824);
_mret = _mret.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 224;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(-2147483648);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 225;BA.debugLine="mLARGO = mRET.Length";
Debug.ShouldStop(1);
_mlargo = _mret.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 226;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
Debug.ShouldStop(2);
_mpos_decimal = _mret.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 227;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(4);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 228;BA.debugLine="mDECIMALES = \"\"";
Debug.ShouldStop(8);
_mdecimales = BA.ObjectToString("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 229;BA.debugLine="If Formato = \"M\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M"))) { 
 BA.debugLineNum = 230;BA.debugLine="mMONEDA = \"$\"";
Debug.ShouldStop(32);
_mmoneda = BA.ObjectToString("$");Debug.locals.put("mMONEDA", _mmoneda);
 }else {
 BA.debugLineNum = 232;BA.debugLine="mMONEDA = \"\"";
Debug.ShouldStop(128);
_mmoneda = BA.ObjectToString("");Debug.locals.put("mMONEDA", _mmoneda);
 };
 BA.debugLineNum = 234;BA.debugLine="If Formato = \"P\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 235;BA.debugLine="mPORCENTAJE = \"%\"";
Debug.ShouldStop(1024);
_mporcentaje = BA.ObjectToString("%");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 }else {
 BA.debugLineNum = 237;BA.debugLine="mPORCENTAJE = \"\"";
Debug.ShouldStop(4096);
_mporcentaje = BA.ObjectToString("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 };
 BA.debugLineNum = 239;BA.debugLine="If mPOS_DECIMAL = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 240;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(32768);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 241;BA.debugLine="mDECIMALES = mRET";
Debug.ShouldStop(65536);
_mdecimales = _mret;Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 242;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
Debug.ShouldStop(131072);
_mret = RemoteObject.concat(_mmoneda,RemoteObject.createImmutable("0"),_mdecimales,RemoteObject.createImmutable(" "),_mporcentaje);Debug.locals.put("mRET", _mret);
 }else {
 BA.debugLineNum = 244;BA.debugLine="If mPOS_DECIMAL = -1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 245;BA.debugLine="mENTEROS = mRET";
Debug.ShouldStop(1048576);
_menteros = _mret;Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 246;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(2097152);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 }else {
 BA.debugLineNum = 248;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
Debug.ShouldStop(8388608);
_menteros = _mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mpos_decimal));Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 249;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
Debug.ShouldStop(16777216);
_mini_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 BA.debugLineNum = 250;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(">",_mini_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 251;BA.debugLine="mINI_DECIMAL = mLARGO";
Debug.ShouldStop(67108864);
_mini_decimal = _mlargo;Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 };
 BA.debugLineNum = 253;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
Debug.ShouldStop(268435456);
_mfin_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 254;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean(">",_mfin_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 255;BA.debugLine="mFIN_DECIMAL = mLARGO";
Debug.ShouldStop(1073741824);
_mfin_decimal = _mlargo;Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 };
 BA.debugLineNum = 257;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
Debug.ShouldStop(1);
_mdecimales = _mret.runMethod(true,"substring",(Object)(_mini_decimal),(Object)(_mfin_decimal));Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 259;BA.debugLine="If mDECIMALES.Length = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_mdecimales.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 260;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(8);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 262;BA.debugLine="mLARGO = mENTEROS.Length";
Debug.ShouldStop(32);
_mlargo = _menteros.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 263;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 264;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
Debug.ShouldStop(128);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 266;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 4)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 267;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
Debug.ShouldStop(1024);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 269;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 7)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 270;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
Debug.ShouldStop(8192);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1))),RemoteObject.createImmutable("'"),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 };
 };
 BA.debugLineNum = 274;BA.debugLine="If Formato = \"T\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("T"))) { 
 BA.debugLineNum = 275;BA.debugLine="mVALOR = Valor";
Debug.ShouldStop(262144);
_mvalor = _valor;Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 276;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
Debug.ShouldStop(524288);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 277;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
Debug.ShouldStop(1048576);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 278;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
Debug.ShouldStop(2097152);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 279;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
Debug.ShouldStop(4194304);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("%")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 280;BA.debugLine="mVALOR = mVALOR.Trim";
Debug.ShouldStop(8388608);
_mvalor = _mvalor.runMethod(true,"trim");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 281;BA.debugLine="mRET = mVALOR";
Debug.ShouldStop(16777216);
_mret = _mvalor;Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 283;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(67108864);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 284;BA.debugLine="Return mRET";
Debug.ShouldStop(134217728);
if (true) return (_mret);
 BA.debugLineNum = 285;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("SP_Anio_ItemClick (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("sp_anio_itemclick")) { return __ref.runUserSub(false, "b4xoperacion","sp_anio_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 47;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
Debug.ShouldStop(32768);
b4xoperacion._main._manio /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
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
public static RemoteObject  _sp_mes_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SP_Mes_ItemClick (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("sp_mes_itemclick")) { return __ref.runUserSub(false, "b4xoperacion","sp_mes_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 51;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
Debug.ShouldStop(524288);
b4xoperacion._main._mmes /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
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
public static RemoteObject  _tbl_pozos_cellclick(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("TBL_Pozos_CellClick (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("tbl_pozos_cellclick")) { return __ref.runUserSub(false, "b4xoperacion","tbl_pozos_cellclick", __ref, _row, _col);}
RemoteObject _mvalor = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 116;BA.debugLine="Private Sub TBL_Pozos_CellClick(Row As Int, Col As";
Debug.ShouldStop(524288);
 BA.debugLineNum = 117;BA.debugLine="Dim mVALOR As Int";
Debug.ShouldStop(1048576);
_mvalor = RemoteObject.createImmutable(0);Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 119;BA.debugLine="If Col = 2 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_col,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 120;BA.debugLine="mVALOR = mFORMATO(TBL_Pozos.GetCellValue(Row, Co";
Debug.ShouldStop(8388608);
_mvalor = (BA.numberCast(int.class, __ref.runClassMethod (japam.SIE.b4xoperacion.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("T")))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 121;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_mvalor,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",b4xoperacion._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 122;BA.debugLine="TBL_Pozos.EditCellonsite(Row, Col)";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_editcellonsite",(Object)(_row),(Object)(_col));
 };
 };
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbl_pozos_modified(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("TBL_Pozos_Modified (b4xoperacion) ","b4xoperacion",8,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("tbl_pozos_modified")) { return __ref.runUserSub(false, "b4xoperacion","tbl_pozos_modified", __ref, _row, _col);}
RemoteObject _mcadena = RemoteObject.createImmutable("");
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 128;BA.debugLine="Private Sub TBL_Pozos_Modified(Row As Int, Col As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 129;BA.debugLine="Dim mCADENA As String";
Debug.ShouldStop(1);
_mcadena = RemoteObject.createImmutable("");Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 131;BA.debugLine="mCADENA = NumberFormat(TBL_Pozos.GetCellValue(Row";
Debug.ShouldStop(4);
_mcadena = b4xoperacion.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, __ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 132;BA.debugLine="TBL_Pozos.SetCellValue(Row, Col, mCADENA)";
Debug.ShouldStop(8);
__ref.getField(false,"_tbl_pozos" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_row),(Object)(_col),(Object)((_mcadena)));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}