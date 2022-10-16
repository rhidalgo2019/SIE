package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xrh extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xrh", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xrh.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public japam.sie.b4xcombobox _cb_anio = null;
public japam.sie.b4xcombobox _cb_mes = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_proceder = null;
public b4j.example.flexgrid _tbl_rh = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_guardar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_regresar = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _b_guardar_click() throws Exception{
int _x = 0;
String[] _mdatos = null;
String[] _mextraidos = null;
boolean _mcompletos = false;
int _anio = 0;
 //BA.debugLineNum = 145;BA.debugLine="Private Sub B_Guardar_Click";
 //BA.debugLineNum = 146;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 147;BA.debugLine="Dim mDATOS(50), mEXTRAIDOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
_mextraidos = new String[(int) (50)];
java.util.Arrays.fill(_mextraidos,"");
 //BA.debugLineNum = 148;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
 //BA.debugLineNum = 149;BA.debugLine="Dim ANIO As Int";
_anio = 0;
 //BA.debugLineNum = 151;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
 //BA.debugLineNum = 152;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 153;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step7 = 1;
final int limit7 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit7 ;_x = _x + step7 ) {
 //BA.debugLineNum = 154;BA.debugLine="mDATOS(x) = TBL_RH.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(_tbl_rh._getcellvalue(_x,(int) (0)));
 //BA.debugLineNum = 155;BA.debugLine="mEXTRAIDOS(x) = Main.mFORMATO(TBL_RH.GetCellValu";
_mextraidos[_x] = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_rh._getcellvalue(_x,(int) (1))),"T"));
 //BA.debugLineNum = 156;BA.debugLine="If mEXTRAIDOS(x) = 0 Then";
if ((_mextraidos[_x]).equals(BA.NumberToString(0))) { 
 //BA.debugLineNum = 157;BA.debugLine="mCOMPLETOS = False";
_mcompletos = __c.False;
 //BA.debugLineNum = 158;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 162;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 164;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
 //BA.debugLineNum = 165;BA.debugLine="If Main.msql.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 166;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step18 = 1;
final int limit18 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit18 ;_x = _x + step18 ) {
 //BA.debugLineNum = 167;BA.debugLine="mDATOS(x) = TBL_RH.GetCellValue(x, 0)";
_mdatos[_x] = BA.ObjectToString(_tbl_rh._getcellvalue(_x,(int) (0)));
 //BA.debugLineNum = 168;BA.debugLine="mEXTRAIDOS(x) = Main.mFORMATO(TBL_RH.GetCellVa";
_mextraidos[_x] = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_rh._getcellvalue(_x,(int) (1))),"T"));
 //BA.debugLineNum = 169;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 171;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_ene = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 1: {
 //BA.debugLineNum = 173;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_feb = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 2: {
 //BA.debugLineNum = 175;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_mar = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 3: {
 //BA.debugLineNum = 177;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_abr = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 4: {
 //BA.debugLineNum = 179;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_may = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 5: {
 //BA.debugLineNum = 181;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_jun = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 6: {
 //BA.debugLineNum = 183;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_jul = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 7: {
 //BA.debugLineNum = 185;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_ago = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 8: {
 //BA.debugLineNum = 187;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_sep = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 9: {
 //BA.debugLineNum = 189;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_oct = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 10: {
 //BA.debugLineNum = 191;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_nov = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
case 11: {
 //BA.debugLineNum = 193;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE dbo.sie_valor";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE dbo.sie_valores SET val_dic = '"+_mextraidos[_x]+"' WHERE val_anio = "+BA.NumberToString(_anio)+" AND val_descripcion = '"+_mdatos[_x]+"'");
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 198;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 200;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
_xui.MsgboxAsync(ba,"Faltan valores por capturar, favor de completar la captura","Alerta");
 };
 //BA.debugLineNum = 202;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return "";
}
public String  _b_proceder_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub B_Proceder_MouseClicked (EventData As";
 //BA.debugLineNum = 52;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 53;BA.debugLine="Cargar_Valores";
_cargar_valores();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click() throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Private Sub B_Regresar_Click";
 //BA.debugLineNum = 206;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 207;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 }else {
 //BA.debugLineNum = 209;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 };
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _x = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 21;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 23;BA.debugLine="Log(\"B4XRH\")";
__c.LogImpl("557606147","B4XRH",0);
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"RH\")";
_root.LoadLayout("RH",ba);
 //BA.debugLineNum = 26;BA.debugLine="TBL_RH.ColsName=Array As String(\"Concepto\", \"Valo";
_tbl_rh._setcolsname(new String[]{"Concepto","Valor"});
 //BA.debugLineNum = 27;BA.debugLine="TBL_RH.ColsWidth=Array As Int(630dip, 160dip)";
_tbl_rh._setcolswidth(new int[]{__c.DipToCurrent((int) (630)),__c.DipToCurrent((int) (160))});
 //BA.debugLineNum = 28;BA.debugLine="TBL_RH.ColsType=Array As Int(TBL_RH.TypeString, T";
_tbl_rh._setcolstype(new int[]{_tbl_rh._typestring,_tbl_rh._typestring});
 //BA.debugLineNum = 29;BA.debugLine="TBL_RH.ColsAlignment=Array As String(\"CENTER\", \"C";
_tbl_rh._setcolsalignment(new String[]{"CENTER","CENTER"});
 //BA.debugLineNum = 30;BA.debugLine="TBL_RH.SetColCustomize(0, xui.Color_RGB(0, 0, 255";
_tbl_rh._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 31;BA.debugLine="TBL_RH.SetColCustomize(1, xui.Color_RGB(0, 0, 255";
_tbl_rh._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 32;BA.debugLine="TBL_RH.SetColCustomize(2, xui.Color_RGB(0, 0, 255";
_tbl_rh._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 33;BA.debugLine="CB_Anio.cmbBox.Items.Clear";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 34;BA.debugLine="For x = 2021 To 2027";
{
final int step13 = 1;
final int limit13 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit13 ;_x = _x + step13 ) {
 //BA.debugLineNum = 35;BA.debugLine="CB_Anio.cmbBox.Items.Add(x)";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="For x = 1 To 12";
{
final int step16 = 1;
final int limit16 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
 //BA.debugLineNum = 38;BA.debugLine="CB_Mes.cmbBox.Items.Add(x)";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 40;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores() throws Exception{
int _x = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
String[] _mdatos = null;
String[] _mvalores = null;
String _mcadena = "";
int _anio = 0;
int _mes = 0;
 //BA.debugLineNum = 58;BA.debugLine="Sub Cargar_Valores()";
 //BA.debugLineNum = 59;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 60;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Dim mDATOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
 //BA.debugLineNum = 62;BA.debugLine="Dim mVALORES(50) As String";
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
 //BA.debugLineNum = 63;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
 //BA.debugLineNum = 64;BA.debugLine="Dim ANIO, MES As Int";
_anio = 0;
_mes = 0;
 //BA.debugLineNum = 66;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
 //BA.debugLineNum = 67;BA.debugLine="MES = Main.mMES";
_mes = _main._mmes /*int*/ ;
 //BA.debugLineNum = 68;BA.debugLine="TBL_RH.ClearRows";
_tbl_rh._clearrows();
 //BA.debugLineNum = 69;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 70;BA.debugLine="Main.mCONEXION = True";
_main._mconexion /*boolean*/  = __c.True;
 //BA.debugLineNum = 71;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_val";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_valores WHERE val_derecho = 5 AND val_anio = "+BA.NumberToString(_anio));
 //BA.debugLineNum = 72;BA.debugLine="Main.mULT_DATOS = -1";
_main._mult_datos /*int*/  = (int) (-1);
 //BA.debugLineNum = 73;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 74;BA.debugLine="Main.mULT_DATOS = Main.mULT_DATOS + 1";
_main._mult_datos /*int*/  = (int) (_main._mult_datos /*int*/ +1);
 //BA.debugLineNum = 75;BA.debugLine="mDATOS(Main.mULT_DATOS) = mRS.GetString(\"val_de";
_mdatos[_main._mult_datos /*int*/ ] = _mrs.GetString("val_descripcion");
 //BA.debugLineNum = 76;BA.debugLine="Select Case MES";
switch (_mes) {
case 1: {
 //BA.debugLineNum = 78;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_ene");
 break; }
case 2: {
 //BA.debugLineNum = 80;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_feb");
 break; }
case 3: {
 //BA.debugLineNum = 82;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_mar");
 break; }
case 4: {
 //BA.debugLineNum = 84;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_abr");
 break; }
case 5: {
 //BA.debugLineNum = 86;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_may");
 break; }
case 6: {
 //BA.debugLineNum = 88;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_jun");
 break; }
case 7: {
 //BA.debugLineNum = 90;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_jul");
 break; }
case 8: {
 //BA.debugLineNum = 92;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_ago");
 break; }
case 9: {
 //BA.debugLineNum = 94;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_sep");
 break; }
case 10: {
 //BA.debugLineNum = 96;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_oct");
 break; }
case 11: {
 //BA.debugLineNum = 98;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_nov");
 break; }
case 12: {
 //BA.debugLineNum = 100;BA.debugLine="mVALORES(Main.mULT_DATOS) = mRS.GetString(\"va";
_mvalores[_main._mult_datos /*int*/ ] = _mrs.GetString("val_dic");
 break; }
}
;
 //BA.debugLineNum = 102;BA.debugLine="If mVALORES(Main.mULT_DATOS) = \"\" Then";
if ((_mvalores[_main._mult_datos /*int*/ ]).equals("")) { 
 //BA.debugLineNum = 103;BA.debugLine="mVALORES(Main.mULT_DATOS) = \"0\"";
_mvalores[_main._mult_datos /*int*/ ] = "0";
 };
 }
;
 //BA.debugLineNum = 106;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step47 = 1;
final int limit47 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit47 ;_x = _x + step47 ) {
 //BA.debugLineNum = 107;BA.debugLine="If x < 1 Then";
if (_x<1) { 
 //BA.debugLineNum = 108;BA.debugLine="mCADENA = Main.mFORMATO(mVALORES(x).As(String)";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ ((_mvalores[_x]),"T"));
 }else {
 //BA.debugLineNum = 110;BA.debugLine="mCADENA = Main.mFORMATO(mVALORES(x).As(String)";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ ((_mvalores[_x]),"N"));
 };
 //BA.debugLineNum = 113;BA.debugLine="TBL_RH.AddRow(Array As Object(mDATOS(x), mCADEN";
_tbl_rh._addrow(new Object[]{(Object)(_mdatos[_x]),(Object)(_mcadena)},__c.True);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 117;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("557868347","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 //BA.debugLineNum = 118;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 };
 //BA.debugLineNum = 120;BA.debugLine="B_Guardar.Visible = True";
_b_guardar.setVisible(__c.True);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public String  _cb_anio_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub CB_Anio_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 44;BA.debugLine="Main.mANIO = CB_Anio.cmbBox.Value";
_main._manio /*int*/  = (int)(BA.ObjectToNumber(_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _cb_mes_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Private Sub CB_Mes_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 48;BA.debugLine="Main.mMES = CB_Mes.cmbBox.Value";
_main._mmes /*int*/  = (int)(BA.ObjectToNumber(_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private CB_Anio As B4XComboBox";
_cb_anio = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 6;BA.debugLine="Private CB_Mes As B4XComboBox";
_cb_mes = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 7;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private TBL_RH As FlexGrid";
_tbl_rh = new b4j.example.flexgrid();
 //BA.debugLineNum = 9;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private TBL_RH As FlexGrid";
_tbl_rh = new b4j.example.flexgrid();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 16;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return null;
}
public String  _tbl_rh_cellclick(int _row,int _col) throws Exception{
int _mvalor = 0;
 //BA.debugLineNum = 123;BA.debugLine="Private Sub TBL_RH_CellClick(Row As Int, Col As In";
 //BA.debugLineNum = 124;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
 //BA.debugLineNum = 126;BA.debugLine="If Col >= 1 Then";
if (_col>=1) { 
 //BA.debugLineNum = 127;BA.debugLine="mVALOR = Main.mFORMATO(TBL_RH.GetCellValue(Row,";
_mvalor = ((int)(BA.ObjectToNumber(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_rh._getcellvalue(_row,_col)),"T"))));
 //BA.debugLineNum = 128;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 129;BA.debugLine="TBL_RH.EditCellonsite(Row, Col)";
_tbl_rh._editcellonsite(_row,_col);
 };
 };
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _tbl_rh_modified(int _row,int _col) throws Exception{
String _mcadena = "";
 //BA.debugLineNum = 134;BA.debugLine="Private Sub TBL_RH_Modified(Row As Int, Col As Int";
 //BA.debugLineNum = 135;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
 //BA.debugLineNum = 137;BA.debugLine="If Row < 2 Then";
if (_row<2) { 
 //BA.debugLineNum = 138;BA.debugLine="mCADENA = Main.mFORMATO(TBL_RH.GetCellValue(Row,";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_rh._getcellvalue(_row,_col)),"M"));
 }else {
 //BA.debugLineNum = 140;BA.debugLine="mCADENA = Main.mFORMATO(TBL_RH.GetCellValue(Row,";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_rh._getcellvalue(_row,_col)),"N"));
 };
 //BA.debugLineNum = 142;BA.debugLine="TBL_RH.SetCellValue(Row, Col, mCADENA)";
_tbl_rh._setcellvalue(_row,_col,(Object)(_mcadena));
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
