package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xenergia_subs_0 {


public static RemoteObject  _b_guardar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Guardar_Click (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("b_guardar_click")) { return __ref.runUserSub(false, "b4xenergia","b_guardar_click", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mservicios = null;
RemoteObject _mequipos = null;
RemoteObject _mgastos = null;
RemoteObject _mconsumos = null;
RemoteObject _mcompletos = RemoteObject.createImmutable(false);
 BA.debugLineNum = 149;BA.debugLine="Private Sub B_Guardar_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim x As Int";
Debug.ShouldStop(2097152);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 151;BA.debugLine="Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mC";
Debug.ShouldStop(4194304);
_mservicios = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mSERVICIOS", _mservicios);
_mequipos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mEQUIPOS", _mequipos);
_mgastos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mGASTOS", _mgastos);
_mconsumos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mCONSUMOS", _mconsumos);
 BA.debugLineNum = 152;BA.debugLine="Dim mCOMPLETOS As Boolean";
Debug.ShouldStop(8388608);
_mcompletos = RemoteObject.createImmutable(false);Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 154;BA.debugLine="mCOMPLETOS = True";
Debug.ShouldStop(33554432);
_mcompletos = b4xenergia.__c.getField(true,"True");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 155;BA.debugLine="If mCOMPLETOS Then";
Debug.ShouldStop(67108864);
if (_mcompletos.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 156;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(134217728);
__ref.runClassMethod (japam.SIE.b4xenergia.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 157;BA.debugLine="If Main.mCONEXION  Then";
Debug.ShouldStop(268435456);
if (b4xenergia._main._mconexion /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 158;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
Debug.ShouldStop(536870912);
{
final int step8 = 1;
final int limit8 = b4xenergia._main._mult_extraido /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step8 > 0 && _x.<Integer>get().intValue() <= limit8) || (step8 < 0 && _x.<Integer>get().intValue() >= limit8) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 159;BA.debugLine="mSERVICIOS(x) = TBL_Energia.GetCellValue(x, 0)";
Debug.ShouldStop(1073741824);
_mservicios.setArrayElement (BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0)))),_x);
 BA.debugLineNum = 160;BA.debugLine="mEQUIPOS(x) = TBL_Energia.GetCellValue(x, 1)";
Debug.ShouldStop(-2147483648);
_mequipos.setArrayElement (BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 1)))),_x);
 BA.debugLineNum = 161;BA.debugLine="mGASTOS(x) = mFORMATO(TBL_Energia.GetCellValue";
Debug.ShouldStop(1);
_mgastos.setArrayElement (BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 2))))),(Object)(RemoteObject.createImmutable("T")))),_x);
 BA.debugLineNum = 162;BA.debugLine="mCONSUMOS(x) = mFORMATO(TBL_Energia.GetCellVal";
Debug.ShouldStop(2);
_mconsumos.setArrayElement (BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 3))))),(Object)(RemoteObject.createImmutable("T")))),_x);
 BA.debugLineNum = 163;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(4);
switch (BA.switchObjectToInt(b4xenergia._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 165;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_ene = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 166;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_ene = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 168;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(128);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_feb = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 169;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(256);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_feb = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 2: {
 BA.debugLineNum = 171;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie__energia SET s";
Debug.ShouldStop(1024);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie__energia SET see_mon_mar = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 172;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_mar = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 3: {
 BA.debugLineNum = 174;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_abr = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(16384);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_abr = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 4: {
 BA.debugLineNum = 177;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(65536);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_may = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 178;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kww_may = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 5: {
 BA.debugLineNum = 180;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_jun = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 181;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(1048576);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_jun = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 6: {
 BA.debugLineNum = 183;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(4194304);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_jul = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 184;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_jul = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 7: {
 BA.debugLineNum = 186;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_ago = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 187;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_ago = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 8: {
 BA.debugLineNum = 189;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(268435456);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_sep = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_sep = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 9: {
 BA.debugLineNum = 192;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_oct = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 193;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(1);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_oct = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 10: {
 BA.debugLineNum = 195;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(4);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_nov = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 196;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(8);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_nov = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 198;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(32);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_mon_dic = "),_mgastos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 BA.debugLineNum = 199;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE sie_energia SET se";
Debug.ShouldStop(64);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE sie_energia SET see_kwh_dic = "),_mconsumos.getArrayElement(true,_x),RemoteObject.createImmutable(" WHERE see_servicio = '"),_mservicios.getArrayElement(true,_x),RemoteObject.createImmutable("' AND see_anio = "),b4xenergia._main._manio /*RemoteObject*/ )));
 break; }
}
;
 }
}Debug.locals.put("x", _x);
;
 };
 BA.debugLineNum = 204;BA.debugLine="mSQL.Close";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 206;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
Debug.ShouldStop(8192);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta"))));
 };
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("B_Proceder_MouseClick (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("b_proceder_mouseclick")) { return __ref.runUserSub(false, "b4xenergia","b_proceder_mouseclick", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub B_Proceder_MouseClick";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(8388608);
__ref.runClassMethod (japam.SIE.b4xenergia.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="Cargar_Valores";
Debug.ShouldStop(16777216);
__ref.runClassMethod (japam.SIE.b4xenergia.class, "_cargar_valores" /*RemoteObject*/ );
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
		Debug.PushSubsStack("B_Regresar_Click (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("b_regresar_click")) { return __ref.runUserSub(false, "b4xenergia","b_regresar_click", __ref);}
 BA.debugLineNum = 210;BA.debugLine="Private Sub B_Regresar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="If Main.mDERECHO = 99 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",b4xenergia._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 212;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
Debug.ShouldStop(524288);
b4xenergia._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu")));
 }else {
 BA.debugLineNum = 214;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(2097152);
b4xenergia._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 216;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("B4XPage_Created (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xenergia","b4xpage_created", __ref, _root1);}
int _x = 0;
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 21;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 22;BA.debugLine="Log(\"B4XEnergia\")";
Debug.ShouldStop(2097152);
b4xenergia.__c.runVoidMethod ("LogImpl","237879809",RemoteObject.createImmutable("B4XEnergia"),0);
 BA.debugLineNum = 23;BA.debugLine="Root = Root1";
Debug.ShouldStop(4194304);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"Energia\")";
Debug.ShouldStop(8388608);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("Energia")),__ref.getField(false, "ba"));
 BA.debugLineNum = 25;BA.debugLine="TBL_Energia.ColsName=Array As String(\"Servicio\",";
Debug.ShouldStop(16777216);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_setcolsname",RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("Servicio"),BA.ObjectToString("Equipo"),BA.ObjectToString("Gasto ($)"),RemoteObject.createImmutable("Consumo (kWh)")}));
 BA.debugLineNum = 26;BA.debugLine="TBL_Energia.ColsWidth=Array As Int(130dip, 230dip";
Debug.ShouldStop(33554432);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolswidth",RemoteObject.createNewArray("int",new int[] {4},new Object[] {b4xenergia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130))),b4xenergia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 230))),b4xenergia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100))),b4xenergia.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))}));
 BA.debugLineNum = 27;BA.debugLine="TBL_Energia.ColsType=Array As Int(TBL_Energia.Typ";
Debug.ShouldStop(67108864);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolstype",RemoteObject.createNewArray("int",new int[] {4},new Object[] {__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).getField(true,"_typestring")}));
 BA.debugLineNum = 28;BA.debugLine="TBL_Energia.ColsAlignment=Array As String(\"CENTER";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolsalignment",RemoteObject.createNewArray("String",new int[] {4},new Object[] {BA.ObjectToString("CENTER"),BA.ObjectToString("LEFT"),BA.ObjectToString("RIGHT"),RemoteObject.createImmutable("RIGHT")}));
 BA.debugLineNum = 29;BA.debugLine="TBL_Energia.SetColCustomize(0, xui.Color_RGB(0, 0";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 30;BA.debugLine="TBL_Energia.SetColCustomize(1, xui.Color_RGB(0, 0";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 31;BA.debugLine="TBL_Energia.SetColCustomize(2, xui.Color_RGB(0, 0";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 32;BA.debugLine="TBL_Energia.SetColCustomize(3, xui.Color_RGB(0, 0";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 3)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 34;BA.debugLine="For x = 2021 To 2027";
Debug.ShouldStop(2);
{
final int step12 = 1;
final int limit12 = 2027;
_x = 2021 ;
for (;(step12 > 0 && _x <= limit12) || (step12 < 0 && _x >= limit12) ;_x = ((int)(0 + _x + step12))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 36;BA.debugLine="SP_Anio.add(x)";
Debug.ShouldStop(8);
__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 39;BA.debugLine="For x = 1 To 12";
Debug.ShouldStop(64);
{
final int step15 = 1;
final int limit15 = 12;
_x = 1 ;
for (;(step15 > 0 && _x <= limit15) || (step15 < 0 && _x >= limit15) ;_x = ((int)(0 + _x + step15))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 41;BA.debugLine="SP_Mes.Add(x)";
Debug.ShouldStop(256);
__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_x)));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Cargar_Valores (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("cargar_valores")) { return __ref.runUserSub(false, "b4xenergia","cargar_valores", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mservicios = null;
RemoteObject _mequipos = null;
RemoteObject _mgastos = null;
RemoteObject _mconsumos = null;
RemoteObject _mcadena_1 = RemoteObject.createImmutable("");
RemoteObject _mcadena_2 = RemoteObject.createImmutable("");
 BA.debugLineNum = 62;BA.debugLine="Sub Cargar_Valores ()";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim x As Int";
Debug.ShouldStop(1073741824);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 64;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(-2147483648);
b4xenergia._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xenergia._mrs);
 BA.debugLineNum = 65;BA.debugLine="Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mC";
Debug.ShouldStop(1);
_mservicios = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mSERVICIOS", _mservicios);
_mequipos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mEQUIPOS", _mequipos);
_mgastos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mGASTOS", _mgastos);
_mconsumos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mCONSUMOS", _mconsumos);
 BA.debugLineNum = 66;BA.debugLine="Dim mCADENA_1, mCADENA_2 As String";
Debug.ShouldStop(2);
_mcadena_1 = RemoteObject.createImmutable("");Debug.locals.put("mCADENA_1", _mcadena_1);
_mcadena_2 = RemoteObject.createImmutable("");Debug.locals.put("mCADENA_2", _mcadena_2);
 BA.debugLineNum = 68;BA.debugLine="TBL_Energia.ClearRows";
Debug.ShouldStop(8);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 69;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(16);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_energia";
Debug.ShouldStop(32);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_energia WHERE see_anio = "),b4xenergia._main._manio /*RemoteObject*/ ))));
 BA.debugLineNum = 71;BA.debugLine="Main.mULT_EXTRAIDO = -1";
Debug.ShouldStop(64);
b4xenergia._main._mult_extraido /*RemoteObject*/  = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 72;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(128);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 73;BA.debugLine="Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1";
Debug.ShouldStop(256);
b4xenergia._main._mult_extraido /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4xenergia._main._mult_extraido /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 74;BA.debugLine="mSERVICIOS(Main.mULT_EXTRAIDO) = mRS.GetString(";
Debug.ShouldStop(512);
_mservicios.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_servicio"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 75;BA.debugLine="mEQUIPOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"s";
Debug.ShouldStop(1024);
_mequipos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_equipo"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(b4xenergia._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 78;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(8192);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_ene"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 79;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(16384);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_ene"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 81;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(65536);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_feb"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(131072);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_feb"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 84;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(524288);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_mar"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 85;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(1048576);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_mar"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 87;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(4194304);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_abr"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 88;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(8388608);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_abr"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 90;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(33554432);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_may"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 91;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(67108864);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_may"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 93;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(268435456);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_jun"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 94;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(536870912);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_jun"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 96;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(-2147483648);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_jul"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(1);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_jul"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 7: {
 BA.debugLineNum = 99;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(4);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_ago"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 100;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(8);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_ago"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 8: {
 BA.debugLineNum = 102;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(32);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_sep"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 103;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(64);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_sep"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 9: {
 BA.debugLineNum = 105;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(256);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_oct"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(512);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_oct"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 10: {
 BA.debugLineNum = 108;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(2048);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_nov"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 109;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(4096);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_nov"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
case 11: {
 BA.debugLineNum = 111;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
Debug.ShouldStop(16384);
_mgastos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_mon_dic"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 BA.debugLineNum = 112;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
Debug.ShouldStop(32768);
_mconsumos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("see_kwh_dic"))),b4xenergia._main._mult_extraido /*RemoteObject*/ );
 break; }
}
;
 }
;
 BA.debugLineNum = 115;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
Debug.ShouldStop(262144);
{
final int step52 = 1;
final int limit52 = b4xenergia._main._mult_extraido /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step52 > 0 && _x.<Integer>get().intValue() <= limit52) || (step52 < 0 && _x.<Integer>get().intValue() >= limit52) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step52))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 116;BA.debugLine="mCADENA_1 = mFORMATO(mGASTOS(x).As(String), \"M\"";
Debug.ShouldStop(524288);
_mcadena_1 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)((_mgastos.getArrayElement(true,_x))),(Object)(RemoteObject.createImmutable("M"))));Debug.locals.put("mCADENA_1", _mcadena_1);
 BA.debugLineNum = 117;BA.debugLine="mCADENA_2 = mFORMATO(mCONSUMOS(x).As(String), \"";
Debug.ShouldStop(1048576);
_mcadena_2 = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)((_mconsumos.getArrayElement(true,_x))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCADENA_2", _mcadena_2);
 BA.debugLineNum = 119;BA.debugLine="TBL_Energia.AddRow(Array As Object(mSERVICIOS(x";
Debug.ShouldStop(4194304);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_addrow",(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_mservicios.getArrayElement(true,_x)),(_mequipos.getArrayElement(true,_x)),(_mcadena_1),(_mcadena_2)})),(Object)(b4xenergia.__c.getField(true,"True")));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 121;BA.debugLine="mSQL.Close";
Debug.ShouldStop(16777216);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 123;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
Debug.ShouldStop(67108864);
b4xenergia.__c.runVoidMethod ("LogImpl","238142013",RemoteObject.createImmutable("---------- SIE Database (MSSQL)  Fallo de conexion ----------"),0);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
b4xenergia._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xenergia._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xenergia._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xenergia._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private TBL_Energia As FlexGrid";
b4xenergia._tbl_energia = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_energia",b4xenergia._tbl_energia);
 //BA.debugLineNum = 6;BA.debugLine="Private B_Proceder As Button";
b4xenergia._b_proceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_proceder",b4xenergia._b_proceder);
 //BA.debugLineNum = 7;BA.debugLine="Private B_Regresar As Button";
b4xenergia._b_regresar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_regresar",b4xenergia._b_regresar);
 //BA.debugLineNum = 8;BA.debugLine="Private B_Guardar As Button";
b4xenergia._b_guardar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_guardar",b4xenergia._b_guardar);
 //BA.debugLineNum = 9;BA.debugLine="Private SP_Anio As Spinner";
b4xenergia._sp_anio = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_anio",b4xenergia._sp_anio);
 //BA.debugLineNum = 10;BA.debugLine="Private SP_Mes As Spinner";
b4xenergia._sp_mes = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_mes",b4xenergia._sp_mes);
 //BA.debugLineNum = 11;BA.debugLine="Public mSQL As SD_SQL";
b4xenergia._msql = RemoteObject.createNew ("japam.SIE.sd_sql");__ref.setField("_msql",b4xenergia._msql);
 //BA.debugLineNum = 12;BA.debugLine="Public mRS As SD_ResultSet";
b4xenergia._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xenergia._mrs);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _conectar_servidor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conectar_Servidor (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("conectar_servidor")) { return __ref.runUserSub(false, "b4xenergia","conectar_servidor", __ref);}
 BA.debugLineNum = 218;BA.debugLine="Public Sub Conectar_Servidor()";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
Debug.ShouldStop(67108864);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MYSQL")),(Object)(BA.ObjectToString("com.mysql.jdbc.Driver")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("jdbc:mysql://"),b4xenergia.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xenergia._main._servidor /*RemoteObject*/ ))),RemoteObject.createImmutable("/u567762233_SIE?useSSL=false")))),(Object)(b4xenergia._main._administrador /*RemoteObject*/ ),(Object)(b4xenergia._main._password /*RemoteObject*/ ));
 BA.debugLineNum = 220;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xenergia","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("mFORMATO (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("mformato")) { return __ref.runUserSub(false, "b4xenergia","mformato", __ref, _valor, _formato);}
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
 BA.debugLineNum = 222;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 229;BA.debugLine="Dim mRET As String";
Debug.ShouldStop(16);
_mret = RemoteObject.createImmutable("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 230;BA.debugLine="Dim mVALOR As String";
Debug.ShouldStop(32);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 231;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
Debug.ShouldStop(64);
_menteros = RemoteObject.createImmutable("");Debug.locals.put("mENTEROS", _menteros);
_mdecimales = RemoteObject.createImmutable("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 232;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
Debug.ShouldStop(128);
_mlargo = RemoteObject.createImmutable(0);Debug.locals.put("mLARGO", _mlargo);
_mpos_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 233;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
Debug.ShouldStop(256);
_mmoneda = RemoteObject.createImmutable("");Debug.locals.put("mMONEDA", _mmoneda);
_mporcentaje = RemoteObject.createImmutable("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 BA.debugLineNum = 234;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
Debug.ShouldStop(512);
_mini_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
_mfin_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 236;BA.debugLine="mRET = \"\"";
Debug.ShouldStop(2048);
_mret = BA.ObjectToString("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 237;BA.debugLine="Formato = Formato.ToUpperCase";
Debug.ShouldStop(4096);
_formato = _formato.runMethod(true,"toUpperCase");Debug.locals.put("Formato", _formato);
 BA.debugLineNum = 238;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("N")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 239;BA.debugLine="mRET = Valor";
Debug.ShouldStop(16384);
_mret = _valor;Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 240;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
Debug.ShouldStop(32768);
_mret = _mret.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 241;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(65536);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 242;BA.debugLine="mLARGO = mRET.Length";
Debug.ShouldStop(131072);
_mlargo = _mret.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 243;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
Debug.ShouldStop(262144);
_mpos_decimal = _mret.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 244;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(524288);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 245;BA.debugLine="mDECIMALES = \"\"";
Debug.ShouldStop(1048576);
_mdecimales = BA.ObjectToString("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 246;BA.debugLine="If Formato = \"M\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M"))) { 
 BA.debugLineNum = 247;BA.debugLine="mMONEDA = \"$\"";
Debug.ShouldStop(4194304);
_mmoneda = BA.ObjectToString("$");Debug.locals.put("mMONEDA", _mmoneda);
 }else {
 BA.debugLineNum = 249;BA.debugLine="mMONEDA = \"\"";
Debug.ShouldStop(16777216);
_mmoneda = BA.ObjectToString("");Debug.locals.put("mMONEDA", _mmoneda);
 };
 BA.debugLineNum = 251;BA.debugLine="If Formato = \"P\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 252;BA.debugLine="mPORCENTAJE = \"%\"";
Debug.ShouldStop(134217728);
_mporcentaje = BA.ObjectToString("%");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 }else {
 BA.debugLineNum = 254;BA.debugLine="mPORCENTAJE = \"\"";
Debug.ShouldStop(536870912);
_mporcentaje = BA.ObjectToString("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 };
 BA.debugLineNum = 256;BA.debugLine="If mPOS_DECIMAL = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 257;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(1);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 258;BA.debugLine="mDECIMALES = mRET";
Debug.ShouldStop(2);
_mdecimales = _mret;Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 259;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
Debug.ShouldStop(4);
_mret = RemoteObject.concat(_mmoneda,RemoteObject.createImmutable("0"),_mdecimales,RemoteObject.createImmutable(" "),_mporcentaje);Debug.locals.put("mRET", _mret);
 }else {
 BA.debugLineNum = 261;BA.debugLine="If mPOS_DECIMAL = -1 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 262;BA.debugLine="mENTEROS = mRET";
Debug.ShouldStop(32);
_menteros = _mret;Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 263;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(64);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 }else {
 BA.debugLineNum = 265;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
Debug.ShouldStop(256);
_menteros = _mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mpos_decimal));Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 266;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
Debug.ShouldStop(512);
_mini_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 BA.debugLineNum = 267;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_mini_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 268;BA.debugLine="mINI_DECIMAL = mLARGO";
Debug.ShouldStop(2048);
_mini_decimal = _mlargo;Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 };
 BA.debugLineNum = 270;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
Debug.ShouldStop(8192);
_mfin_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 271;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_mfin_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 272;BA.debugLine="mFIN_DECIMAL = mLARGO";
Debug.ShouldStop(32768);
_mfin_decimal = _mlargo;Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 };
 BA.debugLineNum = 274;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
Debug.ShouldStop(131072);
_mdecimales = _mret.runMethod(true,"substring",(Object)(_mini_decimal),(Object)(_mfin_decimal));Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 276;BA.debugLine="If mDECIMALES.Length = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_mdecimales.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 277;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(1048576);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 279;BA.debugLine="mLARGO = mENTEROS.Length";
Debug.ShouldStop(4194304);
_mlargo = _menteros.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 280;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 281;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
Debug.ShouldStop(16777216);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 283;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 4)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 284;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
Debug.ShouldStop(134217728);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 286;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 7)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 287;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
Debug.ShouldStop(1073741824);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1))),RemoteObject.createImmutable("'"),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 };
 };
 BA.debugLineNum = 291;BA.debugLine="If Formato = \"T\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("T"))) { 
 BA.debugLineNum = 292;BA.debugLine="mVALOR = Valor";
Debug.ShouldStop(8);
_mvalor = _valor;Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 293;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
Debug.ShouldStop(16);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 294;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
Debug.ShouldStop(32);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 295;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
Debug.ShouldStop(64);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 296;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
Debug.ShouldStop(128);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("%")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 297;BA.debugLine="mVALOR = mVALOR.Trim";
Debug.ShouldStop(256);
_mvalor = _mvalor.runMethod(true,"trim");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 298;BA.debugLine="mRET = mVALOR";
Debug.ShouldStop(512);
_mret = _mvalor;Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 300;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(2048);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 301;BA.debugLine="Return mRET";
Debug.ShouldStop(4096);
if (true) return (_mret);
 BA.debugLineNum = 302;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SP_Anio_ItemClick (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("sp_anio_itemclick")) { return __ref.runUserSub(false, "b4xenergia","sp_anio_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 47;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
Debug.ShouldStop(32768);
b4xenergia._main._manio /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
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
		Debug.PushSubsStack("SP_Mes_ItemClick (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("sp_mes_itemclick")) { return __ref.runUserSub(false, "b4xenergia","sp_mes_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 51;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Main.mMES =SP_Mes.GetItem(SP_Mes.SelectedIndex)";
Debug.ShouldStop(524288);
b4xenergia._main._mmes /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
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
public static RemoteObject  _tbl_energia_cellclick(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("TBL_Energia_CellClick (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("tbl_energia_cellclick")) { return __ref.runUserSub(false, "b4xenergia","tbl_energia_cellclick", __ref, _row, _col);}
RemoteObject _mvalor = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 127;BA.debugLine="Private Sub TBL_Energia_CellClick(Row As Int, Col";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 128;BA.debugLine="Dim mVALOR As Int";
Debug.ShouldStop(-2147483648);
_mvalor = RemoteObject.createImmutable(0);Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 130;BA.debugLine="If Col >= 2 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("g",_col,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 131;BA.debugLine="mVALOR = mFORMATO(TBL_Energia.GetCellValue(Row,";
Debug.ShouldStop(4);
_mvalor = (BA.numberCast(int.class, __ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("T")))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 132;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_mvalor,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",b4xenergia._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 133;BA.debugLine="TBL_Energia.EditCellonsite(Row, Col)";
Debug.ShouldStop(16);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_editcellonsite",(Object)(_row),(Object)(_col));
 };
 };
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbl_energia_modified(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("TBL_Energia_Modified (b4xenergia) ","b4xenergia",5,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("tbl_energia_modified")) { return __ref.runUserSub(false, "b4xenergia","tbl_energia_modified", __ref, _row, _col);}
RemoteObject _mcadena = RemoteObject.createImmutable("");
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 138;BA.debugLine="Private Sub TBL_Energia_Modified(Row As Int, Col A";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Dim mCADENA As String";
Debug.ShouldStop(1024);
_mcadena = RemoteObject.createImmutable("");Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 141;BA.debugLine="If Col = 2 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_col,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 142;BA.debugLine="mCADENA = mFORMATO(TBL_Energia.GetCellValue(Row,";
Debug.ShouldStop(8192);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("M"))));Debug.locals.put("mCADENA", _mcadena);
 }else {
 BA.debugLineNum = 144;BA.debugLine="mCADENA = mFORMATO(TBL_Energia.GetCellValue(Row,";
Debug.ShouldStop(32768);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xenergia.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCADENA", _mcadena);
 };
 BA.debugLineNum = 146;BA.debugLine="TBL_Energia.SetCellValue(Row, Col, mCADENA)";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbl_energia" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_row),(Object)(_col),(Object)((_mcadena)));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}