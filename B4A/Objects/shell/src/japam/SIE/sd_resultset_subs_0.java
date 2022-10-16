package japam.SIE;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class sd_resultset_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private NativeRS As JavaObject";
sd_resultset._nativers = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");__ref.setField("_nativers",sd_resultset._nativers);
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _close(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Close (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("close")) { return __ref.runUserSub(false, "sd_resultset","close", __ref);}
 BA.debugLineNum = 10;BA.debugLine="Public Sub Close";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="NativeRS.RunMethod(\"close\",Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_nativers" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("close")),(Object)((sd_resultset.__c.getField(false,"Null"))));
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _first(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("first (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("first")) { return __ref.runUserSub(false, "sd_resultset","first", __ref);}
 BA.debugLineNum = 18;BA.debugLine="Public Sub first As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="Return NativeRS.RunMethod(\"first\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("first")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbytes(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetBytes (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("getbytes")) { return __ref.runUserSub(false, "sd_resultset","getbytes", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 102;BA.debugLine="Public Sub GetBytes(ColumnName As String) As Byte(";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="Return NativeRS.RunMethod(\"getBytes\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBytes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbytes2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetBytes2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("getbytes2")) { return __ref.runUserSub(false, "sd_resultset","getbytes2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 107;BA.debugLine="Public Sub GetBytes2(index As Int) As Byte()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="Return NativeRS.RunMethod(\"getBytes\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return (__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBytes")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumncount(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getColumnCount (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("getcolumncount")) { return __ref.runUserSub(false, "sd_resultset","getcolumncount", __ref);}
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
 BA.debugLineNum = 48;BA.debugLine="Public Sub getColumnCount As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="Dim Metadata As JavaObject = NativeRS.RunMethod(\"";
Debug.JustUpdateDeviceLine();
_metadata = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_metadata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMetaData")),(Object)((sd_resultset.__c.getField(false,"Null")))));Debug.locals.put("Metadata", _metadata);
 BA.debugLineNum = 50;BA.debugLine="Return Metadata.RunMethod(\"getColumnCount\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, _metadata.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getColumnCount")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumnname(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetColumnName (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("getcolumnname")) { return __ref.runUserSub(false, "sd_resultset","getcolumnname", __ref, _index);}
RemoteObject _metadata = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
Debug.locals.put("index", _index);
 BA.debugLineNum = 43;BA.debugLine="Public Sub GetColumnName(index As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim Metadata As JavaObject = NativeRS.RunMethod(\"";
Debug.JustUpdateDeviceLine();
_metadata = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_metadata = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4j.object.JavaObject"), __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getMetaData")),(Object)((sd_resultset.__c.getField(false,"Null")))));Debug.locals.put("Metadata", _metadata);
 BA.debugLineNum = 45;BA.debugLine="Return Metadata.RunMethod(\"getColumnLabel\",Array";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(_metadata.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getColumnLabel")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdouble(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetDouble (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("getdouble")) { return __ref.runUserSub(false, "sd_resultset","getdouble", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 85;BA.debugLine="Public Sub GetDouble(ColumnName As String) As Doub";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Return NativeRS.RunMethod(\"getDouble\",Array As Ob";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDouble")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdouble2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetDouble2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("getdouble2")) { return __ref.runUserSub(false, "sd_resultset","getdouble2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 89;BA.debugLine="Public Sub GetDouble2(index As Int) As Double";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Return NativeRS.RunMethod(\"getDouble\",Array As Ob";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(double.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getDouble")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfloat(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetFloat (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("getfloat")) { return __ref.runUserSub(false, "sd_resultset","getfloat", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 93;BA.debugLine="Public Sub GetFloat(ColumnName As String) As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Return NativeRS.RunMethod(\"getFloat\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFloat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfloat2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetFloat2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("getfloat2")) { return __ref.runUserSub(false, "sd_resultset","getfloat2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 97;BA.debugLine="Public Sub GetFloat2(index As Int) As Float";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="Return NativeRS.RunMethod(\"getFloat\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(float.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getFloat")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getint(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetInt (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("getint")) { return __ref.runUserSub(false, "sd_resultset","getint", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 53;BA.debugLine="Public Sub GetInt(ColumnName As String) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Return NativeRS.RunMethod(\"getInt\",Array As Objec";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getInt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getint2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetInt2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("getint2")) { return __ref.runUserSub(false, "sd_resultset","getint2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 57;BA.debugLine="Public Sub GetInt2(index As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Return NativeRS.RunMethod(\"getInt\",Array As Objec";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getInt")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlong(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetLong (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("getlong")) { return __ref.runUserSub(false, "sd_resultset","getlong", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 77;BA.debugLine="Public Sub GetLong(ColumnName As String) As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Return NativeRS.RunMethod(\"getLong\",Array As Obje";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(long.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLong")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlong2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetLong2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("getlong2")) { return __ref.runUserSub(false, "sd_resultset","getlong2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 81;BA.debugLine="Public Sub GetLong2(index As Int) As Long";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Return NativeRS.RunMethod(\"getLong\",Array As Obje";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(long.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getLong")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRow (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("getrow")) { return __ref.runUserSub(false, "sd_resultset","getrow", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Public Sub GetRow As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="Return NativeRS.RunMethod(\"getRow\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getRow")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshort(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetShort (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("getshort")) { return __ref.runUserSub(false, "sd_resultset","getshort", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 61;BA.debugLine="Public Sub GetShort(ColumnName As String) As Short";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Return NativeRS.RunMethod(\"getShort\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(short.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getShort")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable((short)0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getshort2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetShort2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("getshort2")) { return __ref.runUserSub(false, "sd_resultset","getshort2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 65;BA.debugLine="Public Sub GetShort2(index As Int) As Short";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Return NativeRS.RunMethod(\"getShort\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(short.class, __ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getShort")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable((short)0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("GetString (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("getstring")) { return __ref.runUserSub(false, "sd_resultset","getstring", __ref, _columnname);}
Debug.locals.put("ColumnName", _columnname);
 BA.debugLineNum = 69;BA.debugLine="Public Sub GetString(ColumnName As String) As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="Return NativeRS.RunMethod(\"getString\",Array As Ob";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getString")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_columnname)}))));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstring2(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetString2 (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("getstring2")) { return __ref.runUserSub(false, "sd_resultset","getstring2", __ref, _index);}
Debug.locals.put("index", _index);
 BA.debugLineNum = 73;BA.debugLine="Public Sub GetString2(index As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Return NativeRS.RunMethod(\"getString\",Array As Ob";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getString")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1))}))));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _originalresultset) throws Exception{
try {
		Debug.PushSubsStack("Initialize (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,6);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "sd_resultset","initialize", __ref, _ba, _originalresultset);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("OriginalResultSet", _originalresultset);
 BA.debugLineNum = 6;BA.debugLine="Public Sub Initialize(OriginalResultSet As JavaObj";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 7;BA.debugLine="NativeRS=OriginalResultSet";
Debug.JustUpdateDeviceLine();
__ref.setField ("_nativers" /*RemoteObject*/ ,_originalresultset);
 BA.debugLineNum = 8;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isclosed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("isClosed (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("isclosed")) { return __ref.runUserSub(false, "sd_resultset","isclosed", __ref);}
 BA.debugLineNum = 14;BA.debugLine="Public Sub isClosed As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="Return NativeRS.RunMethod(\"isClosed\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("isClosed")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 16;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _last(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("last (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("last")) { return __ref.runUserSub(false, "sd_resultset","last", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Public Sub last As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Return NativeRS.RunMethod(\"last\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("last")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nextrow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NextRow (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("nextrow")) { return __ref.runUserSub(false, "sd_resultset","nextrow", __ref);}
 BA.debugLineNum = 26;BA.debugLine="Public Sub NextRow As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Return NativeRS.RunMethod(\"next\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("next")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _previousrow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PreviousRow (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("previousrow")) { return __ref.runUserSub(false, "sd_resultset","previousrow", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Public Sub PreviousRow As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Return NativeRS.RunMethod(\"previous\",Null)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("previous")),(Object)((sd_resultset.__c.getField(false,"Null")))));
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _relativerow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("relativeRow (sd_resultset) ","sd_resultset",22,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("relativerow")) { return __ref.runUserSub(false, "sd_resultset","relativerow", __ref, _row);}
Debug.locals.put("row", _row);
 BA.debugLineNum = 35;BA.debugLine="Public Sub relativeRow(row As Int) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="Return NativeRS.RunMethod(\"relative\",Array As Obj";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(__ref.getField(false,"_nativers" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("relative")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_row)}))));
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}