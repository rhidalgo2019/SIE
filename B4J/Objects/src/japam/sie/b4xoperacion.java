package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xoperacion extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xoperacion", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xoperacion.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.flexgrid _tbl_pozos = null;
public japam.sie.b4xcombobox _cb_anio = null;
public japam.sie.b4xcombobox _cb_mes = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_proceder = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_guardar = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _b_guardar_click() throws Exception{
int _x = 0;
String[] _mclaves = null;
String[] _mdescripciones = null;
String[] _mextraidos = null;
boolean _mcompletos = false;
 //BA.debugLineNum = 139;BA.debugLine="Private Sub B_Guardar_Click";
 //BA.debugLineNum = 140;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 141;BA.debugLine="Dim mCLAVES(50), mDESCRIPCIONES(50) As String";
_mclaves = new String[(int) (50)];
java.util.Arrays.fill(_mclaves,"");
_mdescripciones = new String[(int) (50)];
java.util.Arrays.fill(_mdescripciones,"");
 //BA.debugLineNum = 142;BA.debugLine="Dim mEXTRAIDOS(50) As String";
_mextraidos = new String[(int) (50)];
java.util.Arrays.fill(_mextraidos,"");
 //BA.debugLineNum = 143;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
 //BA.debugLineNum = 145;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 146;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 155;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 157;BA.debugLine="Log(\"Guardando\")";
__c.LogImpl("56094866","Guardando",0);
 //BA.debugLineNum = 158;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 159;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
 //BA.debugLineNum = 160;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 161;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 162;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step13 = 1;
final int limit13 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit13 ;_x = _x + step13 ) {
 //BA.debugLineNum = 163;BA.debugLine="mCLAVES(x) = TBL_Pozos.GetCellValue(x, 0)";
_mclaves[_x] = BA.ObjectToString(_tbl_pozos._getcellvalue(_x,(int) (0)));
 //BA.debugLineNum = 164;BA.debugLine="mDESCRIPCIONES(x) = TBL_Pozos.GetCellValue(x,";
_mdescripciones[_x] = BA.ObjectToString(_tbl_pozos._getcellvalue(_x,(int) (1)));
 //BA.debugLineNum = 165;BA.debugLine="mEXTRAIDOS(x) = Main.mFORMATO(TBL_Pozos.GetCel";
_mextraidos[_x] = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_pozos._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 166;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 168;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_ene = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 170;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_feb = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 172;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_mar = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 174;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_abr = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 4: {
 //BA.debugLineNum = 176;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_may = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 5: {
 //BA.debugLineNum = 178;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_jun = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 6: {
 //BA.debugLineNum = 180;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_jul = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 7: {
 //BA.debugLineNum = 182;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_ago = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 8: {
 //BA.debugLineNum = 184;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_sep = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 9: {
 //BA.debugLineNum = 186;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_oct = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 10: {
 //BA.debugLineNum = 188;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_nov = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 11: {
 //BA.debugLineNum = 190;BA.debugLine="Main.mSQL.ExecNonQuery(\"UPDATE sie_extraido";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_extraido SET ext_dic = "+_mextraidos[_x]+" WHERE ext_clave = '"+_mclaves[_x]+"' AND ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 194;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 196;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
_xui.MsgboxAsync(ba,"Faltan valores por capturar, favor de completar la captura","Alerta");
 };
 //BA.debugLineNum = 198;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 199;BA.debugLine="End Sub";
return "";
}
public String  _b_proceder_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Private Sub B_Proceder_MouseClicked (EventData As";
 //BA.debugLineNum = 53;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 54;BA.debugLine="Cargar_Valores";
_cargar_valores();
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click() throws Exception{
 //BA.debugLineNum = 201;BA.debugLine="Private Sub B_Regresar_Click";
 //BA.debugLineNum = 202;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 203;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 }else {
 //BA.debugLineNum = 205;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 };
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _x = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 20;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 22;BA.debugLine="Log(\"B4XOperacion\")";
__c.LogImpl("55636099","B4XOperacion",0);
 //BA.debugLineNum = 23;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"Operacion\")";
_root.LoadLayout("Operacion",ba);
 //BA.debugLineNum = 25;BA.debugLine="TBL_Pozos.ClearRows";
_tbl_pozos._clearrows();
 //BA.debugLineNum = 26;BA.debugLine="TBL_Pozos.ColsName=Array As String(\"Pozo\", \"Denom";
_tbl_pozos._setcolsname(new String[]{"Pozo","Denominación","Extraido"});
 //BA.debugLineNum = 27;BA.debugLine="TBL_Pozos.ColsWidth=Array As Int(130dip, 530dip,";
_tbl_pozos._setcolswidth(new int[]{__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (530)),__c.DipToCurrent((int) (130))});
 //BA.debugLineNum = 28;BA.debugLine="TBL_Pozos.ColsType=Array As Int(TBL_Pozos.TypeStr";
_tbl_pozos._setcolstype(new int[]{_tbl_pozos._typestring,_tbl_pozos._typestring,_tbl_pozos._typestring});
 //BA.debugLineNum = 29;BA.debugLine="TBL_Pozos.ColsAlignment=Array As String(\"CENTER\",";
_tbl_pozos._setcolsalignment(new String[]{"CENTER","CENTER","CENTER"});
 //BA.debugLineNum = 30;BA.debugLine="TBL_Pozos.SetColCustomize(0, xui.Color_RGB(0, 0,";
_tbl_pozos._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 31;BA.debugLine="TBL_Pozos.SetColCustomize(1, xui.Color_RGB(0, 0,";
_tbl_pozos._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 32;BA.debugLine="TBL_Pozos.SetColCustomize(2, xui.Color_RGB(0, 0,";
_tbl_pozos._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 33;BA.debugLine="CB_Anio.cmbBox.Items.Clear";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 34;BA.debugLine="For x = 2021 To 2027";
{
final int step14 = 1;
final int limit14 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit14 ;_x = _x + step14 ) {
 //BA.debugLineNum = 35;BA.debugLine="CB_Anio.cmbBox.Items.Add(x)";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 37;BA.debugLine="CB_Mes.cmbBox.Items.Clear";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 38;BA.debugLine="For x = 1 To 12";
{
final int step18 = 1;
final int limit18 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit18 ;_x = _x + step18 ) {
 //BA.debugLineNum = 39;BA.debugLine="CB_Mes.cmbBox.Items.Add(x)";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 41;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores() throws Exception{
int _x = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
String[] _mclaves = null;
String[] _mdescripciones = null;
String[] _mextraidos = null;
String _mcadena = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub Cargar_Valores()";
 //BA.debugLineNum = 60;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 61;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Dim mCLAVES(50), mDESCRIPCIONES(50) As String";
_mclaves = new String[(int) (50)];
java.util.Arrays.fill(_mclaves,"");
_mdescripciones = new String[(int) (50)];
java.util.Arrays.fill(_mdescripciones,"");
 //BA.debugLineNum = 63;BA.debugLine="Dim mEXTRAIDOS(50) As String";
_mextraidos = new String[(int) (50)];
java.util.Arrays.fill(_mextraidos,"");
 //BA.debugLineNum = 64;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
 //BA.debugLineNum = 67;BA.debugLine="TBL_Pozos.ClearRows";
_tbl_pozos._clearrows();
 //BA.debugLineNum = 68;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 69;BA.debugLine="Main.mCONEXION = True";
_main._mconexion /*boolean*/  = __c.True;
 //BA.debugLineNum = 70;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ext";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_extraido WHERE ext_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 71;BA.debugLine="Main.mULT_EXTRAIDO = -1";
_main._mult_extraido /*int*/  = (int) (-1);
 //BA.debugLineNum = 72;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 73;BA.debugLine="Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1";
_main._mult_extraido /*int*/  = (int) (_main._mult_extraido /*int*/ +1);
 //BA.debugLineNum = 74;BA.debugLine="mCLAVES(Main.mULT_EXTRAIDO) = mRS.GetString(\"ex";
_mclaves[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_clave");
 //BA.debugLineNum = 75;BA.debugLine="mDESCRIPCIONES(Main.mULT_EXTRAIDO) = mRS.GetStr";
_mdescripciones[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_descripcion");
 //BA.debugLineNum = 76;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 78;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_ene");
 break; }
case 1: {
 //BA.debugLineNum = 80;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_feb");
 break; }
case 2: {
 //BA.debugLineNum = 82;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_mar");
 break; }
case 3: {
 //BA.debugLineNum = 84;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_abr");
 break; }
case 4: {
 //BA.debugLineNum = 86;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_may");
 break; }
case 5: {
 //BA.debugLineNum = 88;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_jun");
 break; }
case 6: {
 //BA.debugLineNum = 90;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_jul");
 break; }
case 7: {
 //BA.debugLineNum = 92;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_ago");
 break; }
case 8: {
 //BA.debugLineNum = 94;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_sep");
 break; }
case 9: {
 //BA.debugLineNum = 96;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_oct");
 break; }
case 10: {
 //BA.debugLineNum = 98;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_nov");
 break; }
case 11: {
 //BA.debugLineNum = 100;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = mRS.GetStrin";
_mextraidos[_main._mult_extraido /*int*/ ] = _mrs.GetString("ext_dic");
 break; }
}
;
 //BA.debugLineNum = 102;BA.debugLine="If mEXTRAIDOS(Main.mULT_EXTRAIDO) = \"\" Then";
if ((_mextraidos[_main._mult_extraido /*int*/ ]).equals("")) { 
 //BA.debugLineNum = 103;BA.debugLine="mEXTRAIDOS(Main.mULT_EXTRAIDO) = \"0\"";
_mextraidos[_main._mult_extraido /*int*/ ] = "0";
 };
 }
;
 //BA.debugLineNum = 106;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step45 = 1;
final int limit45 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit45 ;_x = _x + step45 ) {
 //BA.debugLineNum = 108;BA.debugLine="mCADENA = Main.mFORMATO(mEXTRAIDOS(x).As(String";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ ((_mextraidos[_x]),"N"));
 //BA.debugLineNum = 110;BA.debugLine="TBL_Pozos.AddRow(Array As Object(mCLAVES(x), mD";
_tbl_pozos._addrow(new Object[]{(Object)(_mclaves[_x]),(Object)(_mdescripciones[_x]),(Object)(_mcadena)},__c.True);
 }
};
 //BA.debugLineNum = 112;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 114;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("55898295","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 //BA.debugLineNum = 115;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 };
 //BA.debugLineNum = 117;BA.debugLine="B_Guardar.Visible = True";
_b_guardar.setVisible(__c.True);
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _cb_anio_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Private Sub CB_Anio_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 45;BA.debugLine="Main.mANIO = CB_Anio.cmbBox.Value";
_main._manio /*int*/  = (int)(BA.ObjectToNumber(_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _cb_mes_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub CB_Mes_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 49;BA.debugLine="Main.mMES = CB_Mes.cmbBox.Value";
_main._mmes /*int*/  = (int)(BA.ObjectToNumber(_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 5;BA.debugLine="Private TBL_Pozos As FlexGrid";
_tbl_pozos = new b4j.example.flexgrid();
 //BA.debugLineNum = 6;BA.debugLine="Private CB_Anio As B4XComboBox";
_cb_anio = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 7;BA.debugLine="Private CB_Mes As B4XComboBox";
_cb_mes = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 8;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private B_Guardar As Button";
_b_guardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public String  _tbl_pozos_cellclick(int _row,int _col) throws Exception{
int _mvalor = 0;
 //BA.debugLineNum = 120;BA.debugLine="Private Sub TBL_Pozos_CellClick(Row As Int, Col As";
 //BA.debugLineNum = 121;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
 //BA.debugLineNum = 123;BA.debugLine="If Col = 2 Then";
if (_col==2) { 
 //BA.debugLineNum = 124;BA.debugLine="mVALOR = Main.mFORMATO(TBL_Pozos.GetCellValue(Ro";
_mvalor = ((int)(BA.ObjectToNumber(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_pozos._getcellvalue(_row,_col)),"T"))));
 //BA.debugLineNum = 125;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 126;BA.debugLine="TBL_Pozos.EditCellonsite(Row, Col)";
_tbl_pozos._editcellonsite(_row,_col);
 };
 };
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return "";
}
public String  _tbl_pozos_modified(int _row,int _col) throws Exception{
String _mcadena = "";
 //BA.debugLineNum = 132;BA.debugLine="Private Sub TBL_Pozos_Modified(Row As Int, Col As";
 //BA.debugLineNum = 133;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
 //BA.debugLineNum = 135;BA.debugLine="mCADENA = NumberFormat(TBL_Pozos.GetCellValue(Row";
_mcadena = __c.NumberFormat((double)(BA.ObjectToNumber(_tbl_pozos._getcellvalue(_row,_col))),(int) (2),(int) (0));
 //BA.debugLineNum = 136;BA.debugLine="TBL_Pozos.SetCellValue(Row, Col, mCADENA)";
_tbl_pozos._setcellvalue(_row,_col,(Object)(_mcadena));
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
