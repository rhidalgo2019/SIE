package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xrh_subs_0 {


public static RemoteObject  _b_guardar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("B_Guardar_Click (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("b_guardar_click")) { return __ref.runUserSub(false, "b4xrh","b_guardar_click", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mdatos = null;
RemoteObject _mextraidos = null;
RemoteObject _mcompletos = RemoteObject.createImmutable(false);
RemoteObject _anio = RemoteObject.createImmutable(0);
 BA.debugLineNum = 144;BA.debugLine="Private Sub B_Guardar_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 145;BA.debugLine="Dim x As Int";
Debug.ShouldStop(65536);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 146;BA.debugLine="Dim mDATOS(50), mEXTRAIDOS(50) As String";
Debug.ShouldStop(131072);
_mdatos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mDATOS", _mdatos);
_mextraidos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mEXTRAIDOS", _mextraidos);
 BA.debugLineNum = 147;BA.debugLine="Dim mCOMPLETOS As Boolean";
Debug.ShouldStop(262144);
_mcompletos = RemoteObject.createImmutable(false);Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 148;BA.debugLine="Dim ANIO As Int";
Debug.ShouldStop(524288);
_anio = RemoteObject.createImmutable(0);Debug.locals.put("ANIO", _anio);
 BA.debugLineNum = 150;BA.debugLine="ANIO = Main.mANIO";
Debug.ShouldStop(2097152);
_anio = b4xrh._main._manio /*RemoteObject*/ ;Debug.locals.put("ANIO", _anio);
 BA.debugLineNum = 151;BA.debugLine="mCOMPLETOS = True";
Debug.ShouldStop(4194304);
_mcompletos = b4xrh.__c.getField(true,"True");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 152;BA.debugLine="For x = 0 To Main.mULT_DATOS";
Debug.ShouldStop(8388608);
{
final int step7 = 1;
final int limit7 = b4xrh._main._mult_datos /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _x.<Integer>get().intValue() <= limit7) || (step7 < 0 && _x.<Integer>get().intValue() >= limit7) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 153;BA.debugLine="mDATOS(x) = TBL_RH.GetCellValue(x, 0)";
Debug.ShouldStop(16777216);
_mdatos.setArrayElement (BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0)))),_x);
 BA.debugLineNum = 154;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_RH.GetCellValue(x,";
Debug.ShouldStop(33554432);
_mextraidos.setArrayElement (BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 1))))),(Object)(RemoteObject.createImmutable("T")))),_x);
 BA.debugLineNum = 155;BA.debugLine="If mEXTRAIDOS(x) = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_mextraidos.getArrayElement(true,_x),BA.NumberToString(0))) { 
 BA.debugLineNum = 156;BA.debugLine="mCOMPLETOS = False";
Debug.ShouldStop(134217728);
_mcompletos = b4xrh.__c.getField(true,"False");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 157;BA.debugLine="Exit";
Debug.ShouldStop(268435456);
if (true) break;
 };
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 161;BA.debugLine="mCOMPLETOS = True";
Debug.ShouldStop(1);
_mcompletos = b4xrh.__c.getField(true,"True");Debug.locals.put("mCOMPLETOS", _mcompletos);
 BA.debugLineNum = 163;BA.debugLine="If mCOMPLETOS Then";
Debug.ShouldStop(4);
if (_mcompletos.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 164;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(8);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="For x = 0 To Main.mULT_DATOS";
Debug.ShouldStop(16);
{
final int step18 = 1;
final int limit18 = b4xrh._main._mult_datos /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _x.<Integer>get().intValue() <= limit18) || (step18 < 0 && _x.<Integer>get().intValue() >= limit18) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 166;BA.debugLine="mDATOS(x) = TBL_RH.GetCellValue(x, 0)";
Debug.ShouldStop(32);
_mdatos.setArrayElement (BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 0)))),_x);
 BA.debugLineNum = 167;BA.debugLine="mEXTRAIDOS(x) = mFORMATO(TBL_RH.GetCellValue(x";
Debug.ShouldStop(64);
_mextraidos.setArrayElement (BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_x),(Object)(BA.numberCast(int.class, 1))))),(Object)(RemoteObject.createImmutable("T")))),_x);
 BA.debugLineNum = 168;BA.debugLine="Select Case Main.mMES";
Debug.ShouldStop(128);
switch (BA.switchObjectToInt(b4xrh._main._mmes /*RemoteObject*/ ,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 170;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(512);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_ene = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 1: {
 BA.debugLineNum = 172;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(2048);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_feb = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 2: {
 BA.debugLineNum = 174;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(8192);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_mar = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 3: {
 BA.debugLineNum = 176;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(32768);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_abr = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 4: {
 BA.debugLineNum = 178;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(131072);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_may = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 5: {
 BA.debugLineNum = 180;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_jun = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 6: {
 BA.debugLineNum = 182;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(2097152);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_jul = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 7: {
 BA.debugLineNum = 184;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(8388608);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_ago = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 8: {
 BA.debugLineNum = 186;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(33554432);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_sep = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 9: {
 BA.debugLineNum = 188;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(134217728);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_oct = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 10: {
 BA.debugLineNum = 190;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(536870912);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_nov = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
case 11: {
 BA.debugLineNum = 192;BA.debugLine="mSQL.ExecNonQuery(\"UPDATE dbo.sie_valores SE";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execnonquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE dbo.sie_valores SET val_dic = '"),_mextraidos.getArrayElement(true,_x),RemoteObject.createImmutable("' WHERE val_anio = "),_anio,RemoteObject.createImmutable(" AND val_descripcion = '"),_mdatos.getArrayElement(true,_x),RemoteObject.createImmutable("'"))));
 break; }
}
;
 }
}Debug.locals.put("x", _x);
;
 };
 BA.debugLineNum = 197;BA.debugLine="mSQL.Close";
Debug.ShouldStop(16);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 199;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
Debug.ShouldStop(64);
__ref.getField(false,"_xui" /*RemoteObject*/ ).runVoidMethod ("MsgboxAsync",__ref.getField(false, "ba"),(Object)(BA.ObjectToCharSequence("Faltan valores por capturar, favor de completar la captura")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Alerta"))));
 };
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("B_Proceder_MouseClick (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("b_proceder_mouseclick")) { return __ref.runUserSub(false, "b4xrh","b_proceder_mouseclick", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Private Sub B_Proceder_MouseClick";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Conectar_Servidor";
Debug.ShouldStop(16777216);
__ref.runClassMethod (japam.SIE.b4xrh.class, "_conectar_servidor" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="Cargar_Valores";
Debug.ShouldStop(33554432);
__ref.runClassMethod (japam.SIE.b4xrh.class, "_cargar_valores" /*RemoteObject*/ );
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("B_Regresar_Click (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("b_regresar_click")) { return __ref.runUserSub(false, "b4xrh","b_regresar_click", __ref);}
 BA.debugLineNum = 203;BA.debugLine="Private Sub B_Regresar_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="If Main.mDERECHO = 99 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",b4xrh._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 205;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
Debug.ShouldStop(4096);
b4xrh._b4xpages.runVoidMethod ("_showpageandremovepreviouspages" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("Menu")));
 }else {
 BA.debugLineNum = 207;BA.debugLine="B4XPages.ClosePage(Me)";
Debug.ShouldStop(16384);
b4xrh._b4xpages.runVoidMethod ("_closepage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref));
 };
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("B4XPage_Created (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xrh","b4xpage_created", __ref, _root1);}
RemoteObject _x = RemoteObject.createImmutable(0);
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 22;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 23;BA.debugLine="Dim x As Int";
Debug.ShouldStop(4194304);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 25;BA.debugLine="Log(\"B4XRH\")";
Debug.ShouldStop(16777216);
b4xrh.__c.runVoidMethod ("LogImpl","241549827",RemoteObject.createImmutable("B4XRH"),0);
 BA.debugLineNum = 26;BA.debugLine="Root = Root1";
Debug.ShouldStop(33554432);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 27;BA.debugLine="Root.LoadLayout(\"RH\")";
Debug.ShouldStop(67108864);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("RH")),__ref.getField(false, "ba"));
 BA.debugLineNum = 28;BA.debugLine="TBL_RH.ColsName=Array As String(\"Dato\", \"Valor\")";
Debug.ShouldStop(134217728);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_setcolsname",RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("Dato"),RemoteObject.createImmutable("Valor")}));
 BA.debugLineNum = 29;BA.debugLine="TBL_RH.ColsWidth=Array As Int(220dip, 150dip)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcolswidth",RemoteObject.createNewArray("int",new int[] {2},new Object[] {b4xrh.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 220))),b4xrh.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 150)))}));
 BA.debugLineNum = 30;BA.debugLine="TBL_RH.ColsType=Array As Int(TBL_RH.TypeString, T";
Debug.ShouldStop(536870912);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcolstype",RemoteObject.createNewArray("int",new int[] {2},new Object[] {__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).getField(true,"_typestring"),__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).getField(true,"_typestring")}));
 BA.debugLineNum = 31;BA.debugLine="TBL_RH.ColsAlignment=Array As String(\"CENTER\", \"C";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcolsalignment",RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("CENTER"),RemoteObject.createImmutable("CENTER")}));
 BA.debugLineNum = 32;BA.debugLine="TBL_RH.SetColCustomize(0, xui.Color_RGB(0, 0, 255";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 33;BA.debugLine="TBL_RH.SetColCustomize(1, xui.Color_RGB(0, 0, 255";
Debug.ShouldStop(1);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 1)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 34;BA.debugLine="TBL_RH.SetColCustomize(2, xui.Color_RGB(0, 0, 255";
Debug.ShouldStop(2);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcolcustomize",(Object)(BA.numberCast(int.class, 2)),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_RGB",(Object)(BA.numberCast(int.class, 224)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreateDefaultFont",(Object)(BA.numberCast(float.class, 14)))));
 BA.debugLineNum = 36;BA.debugLine="For x = 2021 To 2027";
Debug.ShouldStop(8);
{
final int step12 = 1;
final int limit12 = 2027;
_x = BA.numberCast(int.class, 2021) ;
for (;(step12 > 0 && _x.<Integer>get().intValue() <= limit12) || (step12 < 0 && _x.<Integer>get().intValue() >= limit12) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step12))  ) {
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
final int step15 = 1;
final int limit15 = 12;
_x = BA.numberCast(int.class, 1) ;
for (;(step15 > 0 && _x.<Integer>get().intValue() <= limit15) || (step15 < 0 && _x.<Integer>get().intValue() >= limit15) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step15))  ) {
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
		Debug.PushSubsStack("Cargar_Valores (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("cargar_valores")) { return __ref.runUserSub(false, "b4xrh","cargar_valores", __ref);}
RemoteObject _x = RemoteObject.createImmutable(0);
RemoteObject _mdatos = null;
RemoteObject _mvalores = null;
RemoteObject _mcadena = RemoteObject.createImmutable("");
RemoteObject _anio = RemoteObject.createImmutable(0);
RemoteObject _mes = RemoteObject.createImmutable(0);
 BA.debugLineNum = 63;BA.debugLine="Sub Cargar_Valores()";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 64;BA.debugLine="Dim x As Int";
Debug.ShouldStop(-2147483648);
_x = RemoteObject.createImmutable(0);Debug.locals.put("x", _x);
 BA.debugLineNum = 65;BA.debugLine="Dim mRS As SD_ResultSet";
Debug.ShouldStop(1);
b4xrh._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xrh._mrs);
 BA.debugLineNum = 66;BA.debugLine="Dim mDATOS(50) As String";
Debug.ShouldStop(2);
_mdatos = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mDATOS", _mdatos);
 BA.debugLineNum = 67;BA.debugLine="Dim mVALORES(50) As String";
Debug.ShouldStop(4);
_mvalores = RemoteObject.createNewArray ("String", new int[] {50}, new Object[]{});Debug.locals.put("mVALORES", _mvalores);
 BA.debugLineNum = 68;BA.debugLine="Dim mCADENA As String";
Debug.ShouldStop(8);
_mcadena = RemoteObject.createImmutable("");Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 69;BA.debugLine="Dim ANIO, MES As Int";
Debug.ShouldStop(16);
_anio = RemoteObject.createImmutable(0);Debug.locals.put("ANIO", _anio);
_mes = RemoteObject.createImmutable(0);Debug.locals.put("MES", _mes);
 BA.debugLineNum = 71;BA.debugLine="ANIO = Main.mANIO";
Debug.ShouldStop(64);
_anio = b4xrh._main._manio /*RemoteObject*/ ;Debug.locals.put("ANIO", _anio);
 BA.debugLineNum = 72;BA.debugLine="MES = Main.mMES";
Debug.ShouldStop(128);
_mes = b4xrh._main._mmes /*RemoteObject*/ ;Debug.locals.put("MES", _mes);
 BA.debugLineNum = 73;BA.debugLine="TBL_RH.ClearRows";
Debug.ShouldStop(256);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_clearrows");
 BA.debugLineNum = 74;BA.debugLine="If mSQL.IsInitialized Then";
Debug.ShouldStop(512);
if (__ref.getField(false,"_msql" /*RemoteObject*/ ).runMethod(true,"IsInitialized" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 75;BA.debugLine="mRS = mSQL.ExecQuery(\"SELECT * FROM sie_valores";
Debug.ShouldStop(1024);
__ref.setField ("_mrs" /*RemoteObject*/ ,__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_execquery" /*RemoteObject*/ ,(Object)(RemoteObject.concat(RemoteObject.createImmutable("SELECT * FROM sie_valores WHERE val_derecho = 5 AND val_anio = "),_anio))));
 BA.debugLineNum = 76;BA.debugLine="Main.mULT_DATOS = -1";
Debug.ShouldStop(2048);
b4xrh._main._mult_datos /*RemoteObject*/  = BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 77;BA.debugLine="Do While mRS.NextRow";
Debug.ShouldStop(4096);
while (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_nextrow" /*RemoteObject*/ ).<Boolean>get().booleanValue()) {
 BA.debugLineNum = 78;BA.debugLine="Main.mULT_DATOS = Main.mULT_DATOS + 1";
Debug.ShouldStop(8192);
b4xrh._main._mult_datos /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4xrh._main._mult_datos /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 79;BA.debugLine="mDATOS(Main.mULT_DATOS) = mRS.GetString(\"val_de";
Debug.ShouldStop(16384);
_mdatos.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_descripcion"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 BA.debugLineNum = 80;BA.debugLine="Select Case MES";
Debug.ShouldStop(32768);
switch (BA.switchObjectToInt(_mes,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8),BA.numberCast(int.class, 9),BA.numberCast(int.class, 10),BA.numberCast(int.class, 11),BA.numberCast(int.class, 12))) {
case 0: {
 BA.debugLineNum = 82;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(131072);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_ene"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 84;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(524288);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_feb"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 86;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(2097152);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_mar"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 88;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(8388608);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_abr"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 4: {
 BA.debugLineNum = 90;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(33554432);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_may"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 5: {
 BA.debugLineNum = 92;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(134217728);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_jun"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 6: {
 BA.debugLineNum = 94;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(536870912);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_jul"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 7: {
 BA.debugLineNum = 96;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(-2147483648);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_ago"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 8: {
 BA.debugLineNum = 98;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(2);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_sep"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 9: {
 BA.debugLineNum = 100;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(8);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_oct"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 10: {
 BA.debugLineNum = 102;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(32);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_nov"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
case 11: {
 BA.debugLineNum = 104;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
Debug.ShouldStop(128);
_mvalores.setArrayElement (__ref.getField(false,"_mrs" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_resultset.class, "_getstring" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("val_dic"))),b4xrh._main._mult_datos /*RemoteObject*/ );
 break; }
}
;
 }
;
 BA.debugLineNum = 107;BA.debugLine="For x = 0 To Main.mULT_DATOS";
Debug.ShouldStop(1024);
{
final int step43 = 1;
final int limit43 = b4xrh._main._mult_datos /*RemoteObject*/ .<Integer>get().intValue();
_x = BA.numberCast(int.class, 0) ;
for (;(step43 > 0 && _x.<Integer>get().intValue() <= limit43) || (step43 < 0 && _x.<Integer>get().intValue() >= limit43) ;_x = RemoteObject.createImmutable((int)(0 + _x.<Integer>get().intValue() + step43))  ) {
Debug.locals.put("x", _x);
 BA.debugLineNum = 108;BA.debugLine="If x < 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_x,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 109;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"T\"";
Debug.ShouldStop(4096);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)((_mvalores.getArrayElement(true,_x))),(Object)(RemoteObject.createImmutable("T"))));Debug.locals.put("mCADENA", _mcadena);
 }else {
 BA.debugLineNum = 111;BA.debugLine="mCADENA = mFORMATO(mVALORES(x).As(String), \"N\"";
Debug.ShouldStop(16384);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)((_mvalores.getArrayElement(true,_x))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCADENA", _mcadena);
 };
 BA.debugLineNum = 114;BA.debugLine="TBL_RH.AddRow(Array As Object(mDATOS(x), mCADEN";
Debug.ShouldStop(131072);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_addrow",(Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_mdatos.getArrayElement(true,_x)),(_mcadena)})),(Object)(b4xrh.__c.getField(true,"True")));
 }
}Debug.locals.put("x", _x);
;
 BA.debugLineNum = 116;BA.debugLine="mSQL.Close";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_close" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 118;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
Debug.ShouldStop(2097152);
b4xrh.__c.runVoidMethod ("LogImpl","241812023",RemoteObject.createImmutable("---------- SIE Database (MSSQL)  Fallo de conexion ----------"),0);
 };
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
b4xrh._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xrh._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
b4xrh._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xrh._xui);
 //BA.debugLineNum = 5;BA.debugLine="Private B_Proceder As Button";
b4xrh._b_proceder = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_proceder",b4xrh._b_proceder);
 //BA.debugLineNum = 6;BA.debugLine="Private TBL_RH As FlexGrid";
b4xrh._tbl_rh = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_rh",b4xrh._tbl_rh);
 //BA.debugLineNum = 7;BA.debugLine="Private B_Guardar As Button";
b4xrh._b_guardar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_guardar",b4xrh._b_guardar);
 //BA.debugLineNum = 8;BA.debugLine="Private B_Regresar As Button";
b4xrh._b_regresar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_b_regresar",b4xrh._b_regresar);
 //BA.debugLineNum = 9;BA.debugLine="Private TBL_RH As FlexGrid";
b4xrh._tbl_rh = RemoteObject.createNew ("b4j.example.flexgrid");__ref.setField("_tbl_rh",b4xrh._tbl_rh);
 //BA.debugLineNum = 10;BA.debugLine="Private SP_Anio As Spinner";
b4xrh._sp_anio = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_anio",b4xrh._sp_anio);
 //BA.debugLineNum = 11;BA.debugLine="Private SP_Mes As Spinner";
b4xrh._sp_mes = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_sp_mes",b4xrh._sp_mes);
 //BA.debugLineNum = 12;BA.debugLine="Public mSQL As SD_SQL";
b4xrh._msql = RemoteObject.createNew ("japam.SIE.sd_sql");__ref.setField("_msql",b4xrh._msql);
 //BA.debugLineNum = 13;BA.debugLine="Public mRS As SD_ResultSet";
b4xrh._mrs = RemoteObject.createNew ("japam.SIE.sd_resultset");__ref.setField("_mrs",b4xrh._mrs);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _conectar_servidor(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Conectar_Servidor (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("conectar_servidor")) { return __ref.runUserSub(false, "b4xrh","conectar_servidor", __ref);}
 BA.debugLineNum = 211;BA.debugLine="Public Sub Conectar_Servidor()";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="mSQL.Initialize(Me,\"MYSQL\", \"com.mysql.jdbc.Drive";
Debug.ShouldStop(524288);
__ref.getField(false,"_msql" /*RemoteObject*/ ).runClassMethod (japam.SIE.sd_sql.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("MYSQL")),(Object)(BA.ObjectToString("com.mysql.jdbc.Driver")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("jdbc:mysql://"),b4xrh.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((b4xrh._main._servidor /*RemoteObject*/ ))),RemoteObject.createImmutable("/u567762233_SIE?useSSL=false")))),(Object)(b4xrh._main._administrador /*RemoteObject*/ ),(Object)(b4xrh._main._password /*RemoteObject*/ ));
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("Initialize (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xrh","initialize", __ref, _ba);}
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
		Debug.PushSubsStack("mFORMATO (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("mformato")) { return __ref.runUserSub(false, "b4xrh","mformato", __ref, _valor, _formato);}
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
 BA.debugLineNum = 215;BA.debugLine="Public Sub mFORMATO(Valor As String, Formato As St";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 222;BA.debugLine="Dim mRET As String";
Debug.ShouldStop(536870912);
_mret = RemoteObject.createImmutable("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 223;BA.debugLine="Dim mVALOR As String";
Debug.ShouldStop(1073741824);
_mvalor = RemoteObject.createImmutable("");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 224;BA.debugLine="Dim mENTEROS, mDECIMALES As String";
Debug.ShouldStop(-2147483648);
_menteros = RemoteObject.createImmutable("");Debug.locals.put("mENTEROS", _menteros);
_mdecimales = RemoteObject.createImmutable("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 225;BA.debugLine="Dim mLARGO, mPOS_DECIMAL As Int";
Debug.ShouldStop(1);
_mlargo = RemoteObject.createImmutable(0);Debug.locals.put("mLARGO", _mlargo);
_mpos_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 226;BA.debugLine="Dim mMONEDA, mPORCENTAJE As String";
Debug.ShouldStop(2);
_mmoneda = RemoteObject.createImmutable("");Debug.locals.put("mMONEDA", _mmoneda);
_mporcentaje = RemoteObject.createImmutable("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 BA.debugLineNum = 227;BA.debugLine="Dim mINI_DECIMAL, mFIN_DECIMAL As Int";
Debug.ShouldStop(4);
_mini_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
_mfin_decimal = RemoteObject.createImmutable(0);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 229;BA.debugLine="mRET = \"\"";
Debug.ShouldStop(16);
_mret = BA.ObjectToString("");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 230;BA.debugLine="Formato = Formato.ToUpperCase";
Debug.ShouldStop(32);
_formato = _formato.runMethod(true,"toUpperCase");Debug.locals.put("Formato", _formato);
 BA.debugLineNum = 231;BA.debugLine="If Formato = \"N\" Or Formato = \"M\" Or Formato = \"P";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("N")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M")) || RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 232;BA.debugLine="mRET = Valor";
Debug.ShouldStop(128);
_mret = _valor;Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 233;BA.debugLine="mRET = mRET.Replace(\"$\", \"\")";
Debug.ShouldStop(256);
_mret = _mret.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 234;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(512);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 235;BA.debugLine="mLARGO = mRET.Length";
Debug.ShouldStop(1024);
_mlargo = _mret.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 236;BA.debugLine="mPOS_DECIMAL = mRET.LastIndexOf(\".\")";
Debug.ShouldStop(2048);
_mpos_decimal = _mret.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("mPOS_DECIMAL", _mpos_decimal);
 BA.debugLineNum = 237;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(4096);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 238;BA.debugLine="mDECIMALES = \"\"";
Debug.ShouldStop(8192);
_mdecimales = BA.ObjectToString("");Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 239;BA.debugLine="If Formato = \"M\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("M"))) { 
 BA.debugLineNum = 240;BA.debugLine="mMONEDA = \"$\"";
Debug.ShouldStop(32768);
_mmoneda = BA.ObjectToString("$");Debug.locals.put("mMONEDA", _mmoneda);
 }else {
 BA.debugLineNum = 242;BA.debugLine="mMONEDA = \"\"";
Debug.ShouldStop(131072);
_mmoneda = BA.ObjectToString("");Debug.locals.put("mMONEDA", _mmoneda);
 };
 BA.debugLineNum = 244;BA.debugLine="If Formato = \"P\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("P"))) { 
 BA.debugLineNum = 245;BA.debugLine="mPORCENTAJE = \"%\"";
Debug.ShouldStop(1048576);
_mporcentaje = BA.ObjectToString("%");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 }else {
 BA.debugLineNum = 247;BA.debugLine="mPORCENTAJE = \"\"";
Debug.ShouldStop(4194304);
_mporcentaje = BA.ObjectToString("");Debug.locals.put("mPORCENTAJE", _mporcentaje);
 };
 BA.debugLineNum = 249;BA.debugLine="If mPOS_DECIMAL = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 250;BA.debugLine="mENTEROS = \"\"";
Debug.ShouldStop(33554432);
_menteros = BA.ObjectToString("");Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 251;BA.debugLine="mDECIMALES = mRET";
Debug.ShouldStop(67108864);
_mdecimales = _mret;Debug.locals.put("mDECIMALES", _mdecimales);
 BA.debugLineNum = 252;BA.debugLine="mRET = mMONEDA & \"0\" & mDECIMALES & \" \" & mPORC";
Debug.ShouldStop(134217728);
_mret = RemoteObject.concat(_mmoneda,RemoteObject.createImmutable("0"),_mdecimales,RemoteObject.createImmutable(" "),_mporcentaje);Debug.locals.put("mRET", _mret);
 }else {
 BA.debugLineNum = 254;BA.debugLine="If mPOS_DECIMAL = -1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_mpos_decimal,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 255;BA.debugLine="mENTEROS = mRET";
Debug.ShouldStop(1073741824);
_menteros = _mret;Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 256;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(-2147483648);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 }else {
 BA.debugLineNum = 258;BA.debugLine="mENTEROS = mRET.SubString2(0, mPOS_DECIMAL)";
Debug.ShouldStop(2);
_menteros = _mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mpos_decimal));Debug.locals.put("mENTEROS", _menteros);
 BA.debugLineNum = 259;BA.debugLine="mINI_DECIMAL = mPOS_DECIMAL + 1";
Debug.ShouldStop(4);
_mini_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 BA.debugLineNum = 260;BA.debugLine="If mINI_DECIMAL > mLARGO Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",_mini_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 261;BA.debugLine="mINI_DECIMAL = mLARGO";
Debug.ShouldStop(16);
_mini_decimal = _mlargo;Debug.locals.put("mINI_DECIMAL", _mini_decimal);
 };
 BA.debugLineNum = 263;BA.debugLine="mFIN_DECIMAL= mPOS_DECIMAL + 3";
Debug.ShouldStop(64);
_mfin_decimal = RemoteObject.solve(new RemoteObject[] {_mpos_decimal,RemoteObject.createImmutable(3)}, "+",1, 1);Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 BA.debugLineNum = 264;BA.debugLine="If mFIN_DECIMAL > mLARGO Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_mfin_decimal,BA.numberCast(double.class, _mlargo))) { 
 BA.debugLineNum = 265;BA.debugLine="mFIN_DECIMAL = mLARGO";
Debug.ShouldStop(256);
_mfin_decimal = _mlargo;Debug.locals.put("mFIN_DECIMAL", _mfin_decimal);
 };
 BA.debugLineNum = 267;BA.debugLine="mDECIMALES = mRET.SubString2(mINI_DECIMAL, mFI";
Debug.ShouldStop(1024);
_mdecimales = _mret.runMethod(true,"substring",(Object)(_mini_decimal),(Object)(_mfin_decimal));Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 269;BA.debugLine="If mDECIMALES.Length = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_mdecimales.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 270;BA.debugLine="mDECIMALES = \"00\"";
Debug.ShouldStop(8192);
_mdecimales = BA.ObjectToString("00");Debug.locals.put("mDECIMALES", _mdecimales);
 };
 BA.debugLineNum = 272;BA.debugLine="mLARGO = mENTEROS.Length";
Debug.ShouldStop(32768);
_mlargo = _menteros.runMethod(true,"length");Debug.locals.put("mLARGO", _mlargo);
 BA.debugLineNum = 273;BA.debugLine="If mLARGO >= 1 And mLARGO <= 3 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 274;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO) &";
Debug.ShouldStop(131072);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 276;BA.debugLine="If mLARGO >= 4 And mLARGO <= 6 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 4)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 277;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 3";
Debug.ShouldStop(1048576);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 279;BA.debugLine="If mLARGO >= 7 And mLARGO <= 9 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",_mlargo,BA.numberCast(double.class, 7)) && RemoteObject.solveBoolean("k",_mlargo,BA.numberCast(double.class, 9))) { 
 BA.debugLineNum = 280;BA.debugLine="mRET = mMONEDA & mRET.SubString2(0, mLARGO - 6";
Debug.ShouldStop(8388608);
_mret = RemoteObject.concat(_mmoneda,_mret.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1))),RemoteObject.createImmutable("'"),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(6)}, "-",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1))),RemoteObject.createImmutable(","),_mret.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mlargo,RemoteObject.createImmutable(3)}, "-",1, 1)),(Object)(_mlargo)),RemoteObject.createImmutable("."),_mdecimales,_mporcentaje);Debug.locals.put("mRET", _mret);
 };
 };
 };
 BA.debugLineNum = 284;BA.debugLine="If Formato = \"T\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_formato,BA.ObjectToString("T"))) { 
 BA.debugLineNum = 285;BA.debugLine="mVALOR = Valor";
Debug.ShouldStop(268435456);
_mvalor = _valor;Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 286;BA.debugLine="mVALOR = mVALOR.Replace(\"'\", \"\")";
Debug.ShouldStop(536870912);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 287;BA.debugLine="mVALOR = mVALOR.Replace(\",\", \"\")";
Debug.ShouldStop(1073741824);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString(",")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 288;BA.debugLine="mVALOR = mVALOR.Replace(\"$\", \"\")";
Debug.ShouldStop(-2147483648);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("$")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 289;BA.debugLine="mVALOR = mVALOR.Replace(\"%\", \"\")";
Debug.ShouldStop(1);
_mvalor = _mvalor.runMethod(true,"replace",(Object)(BA.ObjectToString("%")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 290;BA.debugLine="mVALOR = mVALOR.Trim";
Debug.ShouldStop(2);
_mvalor = _mvalor.runMethod(true,"trim");Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 291;BA.debugLine="mRET = mVALOR";
Debug.ShouldStop(4);
_mret = _mvalor;Debug.locals.put("mRET", _mret);
 };
 BA.debugLineNum = 293;BA.debugLine="mRET = mRET.Trim";
Debug.ShouldStop(16);
_mret = _mret.runMethod(true,"trim");Debug.locals.put("mRET", _mret);
 BA.debugLineNum = 294;BA.debugLine="Return mRET";
Debug.ShouldStop(32);
if (true) return (_mret);
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("SP_Anio_ItemClick (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("sp_anio_itemclick")) { return __ref.runUserSub(false, "b4xrh","sp_anio_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 48;BA.debugLine="Private Sub SP_Anio_ItemClick (Position As Int, Va";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="Main.mANIO = SP_Anio.GetItem(SP_Anio.SelectedInde";
Debug.ShouldStop(65536);
b4xrh._main._manio /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_anio" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("SP_Mes_ItemClick (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("sp_mes_itemclick")) { return __ref.runUserSub(false, "b4xrh","sp_mes_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 52;BA.debugLine="Private Sub SP_Mes_ItemClick (Position As Int, Val";
Debug.ShouldStop(524288);
 BA.debugLineNum = 53;BA.debugLine="Main.mMES = SP_Mes.GetItem(SP_Mes.SelectedIndex)";
Debug.ShouldStop(1048576);
b4xrh._main._mmes /*RemoteObject*/  = BA.numberCast(int.class, __ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"GetItem",(Object)(__ref.getField(false,"_sp_mes" /*RemoteObject*/ ).runMethod(true,"getSelectedIndex"))));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbl_rh_cellclick(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("TBL_RH_CellClick (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("tbl_rh_cellclick")) { return __ref.runUserSub(false, "b4xrh","tbl_rh_cellclick", __ref, _row, _col);}
RemoteObject _mvalor = RemoteObject.createImmutable(0);
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 122;BA.debugLine="Private Sub TBL_RH_CellClick(Row As Int, Col As In";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 123;BA.debugLine="Dim mVALOR As Int";
Debug.ShouldStop(67108864);
_mvalor = RemoteObject.createImmutable(0);Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 125;BA.debugLine="If Col >= 1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("g",_col,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 126;BA.debugLine="mVALOR = mFORMATO(TBL_RH.GetCellValue(Row, Col),";
Debug.ShouldStop(536870912);
_mvalor = (BA.numberCast(int.class, __ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("T")))));Debug.locals.put("mVALOR", _mvalor);
 BA.debugLineNum = 127;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_mvalor,BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",b4xrh._main._mderecho /*RemoteObject*/ ,BA.numberCast(double.class, 99))) { 
 BA.debugLineNum = 128;BA.debugLine="TBL_RH.EditCellonsite(Row, Col)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_editcellonsite",(Object)(_row),(Object)(_col));
 };
 };
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tbl_rh_modified(RemoteObject __ref,RemoteObject _row,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("TBL_RH_Modified (b4xrh) ","b4xrh",9,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("tbl_rh_modified")) { return __ref.runUserSub(false, "b4xrh","tbl_rh_modified", __ref, _row, _col);}
RemoteObject _mcadena = RemoteObject.createImmutable("");
Debug.locals.put("Row", _row);
Debug.locals.put("Col", _col);
 BA.debugLineNum = 133;BA.debugLine="Private Sub TBL_RH_Modified(Row As Int, Col As Int";
Debug.ShouldStop(16);
 BA.debugLineNum = 134;BA.debugLine="Dim mCADENA As String";
Debug.ShouldStop(32);
_mcadena = RemoteObject.createImmutable("");Debug.locals.put("mCADENA", _mcadena);
 BA.debugLineNum = 136;BA.debugLine="If Row < 2 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("<",_row,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 137;BA.debugLine="mCADENA = mFORMATO(TBL_RH.GetCellValue(Row, Col)";
Debug.ShouldStop(256);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("M"))));Debug.locals.put("mCADENA", _mcadena);
 }else {
 BA.debugLineNum = 139;BA.debugLine="mCADENA = mFORMATO(TBL_RH.GetCellValue(Row, Col)";
Debug.ShouldStop(1024);
_mcadena = BA.ObjectToString(__ref.runClassMethod (japam.SIE.b4xrh.class, "_mformato" /*RemoteObject*/ ,(Object)(BA.ObjectToString(__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runMethod(false,"_getcellvalue",(Object)(_row),(Object)(_col)))),(Object)(RemoteObject.createImmutable("N"))));Debug.locals.put("mCADENA", _mcadena);
 };
 BA.debugLineNum = 141;BA.debugLine="TBL_RH.SetCellValue(Row, Col, mCADENA)";
Debug.ShouldStop(4096);
__ref.getField(false,"_tbl_rh" /*RemoteObject*/ ).runVoidMethod ("_setcellvalue",(Object)(_row),(Object)(_col),(Object)((_mcadena)));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}