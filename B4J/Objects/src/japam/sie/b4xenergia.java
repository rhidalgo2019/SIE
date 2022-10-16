package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xenergia extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xenergia", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xenergia.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4j.example.flexgrid _tbl_energia = null;
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
String[] _mservicios = null;
String[] _mequipos = null;
String[] _mgastos = null;
String[] _mconsumos = null;
boolean _mcompletos = false;
 //BA.debugLineNum = 154;BA.debugLine="Private Sub B_Guardar_Click";
 //BA.debugLineNum = 155;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 156;BA.debugLine="Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mC";
_mservicios = new String[(int) (50)];
java.util.Arrays.fill(_mservicios,"");
_mequipos = new String[(int) (50)];
java.util.Arrays.fill(_mequipos,"");
_mgastos = new String[(int) (50)];
java.util.Arrays.fill(_mgastos,"");
_mconsumos = new String[(int) (50)];
java.util.Arrays.fill(_mconsumos,"");
 //BA.debugLineNum = 157;BA.debugLine="Dim mCOMPLETOS As Boolean";
_mcompletos = false;
 //BA.debugLineNum = 159;BA.debugLine="mCOMPLETOS = True";
_mcompletos = __c.True;
 //BA.debugLineNum = 160;BA.debugLine="If mCOMPLETOS Then";
if (_mcompletos) { 
 //BA.debugLineNum = 161;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 162;BA.debugLine="If Main.mCONEXION  Then";
if (_main._mconexion /*boolean*/ ) { 
 //BA.debugLineNum = 163;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step8 = 1;
final int limit8 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
 //BA.debugLineNum = 164;BA.debugLine="mSERVICIOS(x) = TBL_Energia.GetCellValue(x, 0)";
_mservicios[_x] = BA.ObjectToString(_tbl_energia._getcellvalue(_x,(int) (0)));
 //BA.debugLineNum = 165;BA.debugLine="mEQUIPOS(x) = TBL_Energia.GetCellValue(x, 1)";
_mequipos[_x] = BA.ObjectToString(_tbl_energia._getcellvalue(_x,(int) (1)));
 //BA.debugLineNum = 166;BA.debugLine="mGASTOS(x) = Main.mFORMATO(TBL_Energia.GetCell";
_mgastos[_x] = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_energia._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 167;BA.debugLine="mCONSUMOS(x) = Main.mFORMATO(TBL_Energia.GetCe";
_mconsumos[_x] = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_energia._getcellvalue(_x,(int) (3))),"T"));
 //BA.debugLineNum = 168;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 170;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_ene = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 171;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_ene = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 173;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_feb = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 174;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_feb = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 176;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie__energia";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie__energia SET see_mon_mar = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 177;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_mar = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 179;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_abr = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 180;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_abr = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 4: {
 //BA.debugLineNum = 182;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_may = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 183;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kww_may = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 5: {
 //BA.debugLineNum = 185;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_jun = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 186;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_jun = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 6: {
 //BA.debugLineNum = 188;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_jul = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 189;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_jul = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 7: {
 //BA.debugLineNum = 191;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_ago = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 192;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_ago = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 8: {
 //BA.debugLineNum = 194;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_sep = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 195;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_sep = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 9: {
 //BA.debugLineNum = 197;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_oct = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 198;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_oct = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 10: {
 //BA.debugLineNum = 200;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_nov = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 201;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_nov = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
case 11: {
 //BA.debugLineNum = 203;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_mon_dic = "+_mgastos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 204;BA.debugLine="Main.MSQL.ExecNonQuery(\"UPDATE sie_energia S";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecNonQuery("UPDATE sie_energia SET see_kwh_dic = "+_mconsumos[_x]+" WHERE see_servicio = '"+_mservicios[_x]+"' AND see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 break; }
}
;
 }
};
 };
 //BA.debugLineNum = 209;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 211;BA.debugLine="xui.MsgboxAsync(\"Faltan valores por capturar, fa";
_xui.MsgboxAsync(ba,"Faltan valores por capturar, favor de completar la captura","Alerta");
 };
 //BA.debugLineNum = 213;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 216;BA.debugLine="Private Sub B_Regresar_Click";
 //BA.debugLineNum = 217;BA.debugLine="If Main.mDERECHO = 99 Then";
if (_main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 218;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 }else {
 //BA.debugLineNum = 220;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 };
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _x = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 20;BA.debugLine="Log(\"B4XEnergia\")";
__c.LogImpl("556164353","B4XEnergia",0);
 //BA.debugLineNum = 21;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"Energia\")";
_root.LoadLayout("Energia",ba);
 //BA.debugLineNum = 23;BA.debugLine="TBL_Energia.ColsName=Array As String(\"Servicio\",";
_tbl_energia._setcolsname(new String[]{"Servicio","Equipo","Gasto ($)","Consumo (kWh)"});
 //BA.debugLineNum = 24;BA.debugLine="TBL_Energia.ColsWidth=Array As Int(130dip, 400dip";
_tbl_energia._setcolswidth(new int[]{__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (130)),__c.DipToCurrent((int) (130))});
 //BA.debugLineNum = 25;BA.debugLine="TBL_Energia.ColsType=Array As Int(TBL_Energia.Typ";
_tbl_energia._setcolstype(new int[]{_tbl_energia._typestring,_tbl_energia._typestring,_tbl_energia._typestring,_tbl_energia._typestring});
 //BA.debugLineNum = 26;BA.debugLine="TBL_Energia.ColsAlignment=Array As String(\"CENTER";
_tbl_energia._setcolsalignment(new String[]{"CENTER","CENTER","CENTER","CENTER"});
 //BA.debugLineNum = 27;BA.debugLine="TBL_Energia.SetColCustomize(0, xui.Color_RGB(0, 0";
_tbl_energia._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 28;BA.debugLine="TBL_Energia.SetColCustomize(1, xui.Color_RGB(0, 0";
_tbl_energia._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 29;BA.debugLine="TBL_Energia.SetColCustomize(2, xui.Color_RGB(0, 0";
_tbl_energia._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 30;BA.debugLine="TBL_Energia.SetColCustomize(3, xui.Color_RGB(0, 0";
_tbl_energia._setcolcustomize((int) (3),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 31;BA.debugLine="CB_Anio.cmbBox.Items.Clear";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 32;BA.debugLine="For x = 2021 To 2027";
{
final int step13 = 1;
final int limit13 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit13 ;_x = _x + step13 ) {
 //BA.debugLineNum = 33;BA.debugLine="CB_Anio.cmbBox.Items.Add(x)";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 35;BA.debugLine="For x = 1 To 12";
{
final int step16 = 1;
final int limit16 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit16 ;_x = _x + step16 ) {
 //BA.debugLineNum = 36;BA.debugLine="CB_Mes.cmbBox.Items.Add(x)";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 38;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores() throws Exception{
int _x = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
String[] _mservicios = null;
String[] _mequipos = null;
String[] _mgastos = null;
String[] _mconsumos = null;
String _mcadena_1 = "";
String _mcadena_2 = "";
 //BA.debugLineNum = 58;BA.debugLine="Sub Cargar_Valores ()";
 //BA.debugLineNum = 59;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 60;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Dim mSERVICIOS(50), mEQUIPOS(50), mGASTOS(50), mC";
_mservicios = new String[(int) (50)];
java.util.Arrays.fill(_mservicios,"");
_mequipos = new String[(int) (50)];
java.util.Arrays.fill(_mequipos,"");
_mgastos = new String[(int) (50)];
java.util.Arrays.fill(_mgastos,"");
_mconsumos = new String[(int) (50)];
java.util.Arrays.fill(_mconsumos,"");
 //BA.debugLineNum = 62;BA.debugLine="Dim mCADENA_1, mCADENA_2 As String";
_mcadena_1 = "";
_mcadena_2 = "";
 //BA.debugLineNum = 64;BA.debugLine="TBL_Energia.ClearRows";
_tbl_energia._clearrows();
 //BA.debugLineNum = 65;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 66;BA.debugLine="Main.mCONEXION = True";
_main._mconexion /*boolean*/  = __c.True;
 //BA.debugLineNum = 67;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ene";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_energia WHERE see_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 68;BA.debugLine="Main.mULT_EXTRAIDO = -1";
_main._mult_extraido /*int*/  = (int) (-1);
 //BA.debugLineNum = 69;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 70;BA.debugLine="Main.mULT_EXTRAIDO = Main.mULT_EXTRAIDO + 1";
_main._mult_extraido /*int*/  = (int) (_main._mult_extraido /*int*/ +1);
 //BA.debugLineNum = 71;BA.debugLine="mSERVICIOS(Main.mULT_EXTRAIDO) = mRS.GetString(";
_mservicios[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_servicio");
 //BA.debugLineNum = 72;BA.debugLine="mEQUIPOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"s";
_mequipos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_equipo");
 //BA.debugLineNum = 73;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 75;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_ene");
 //BA.debugLineNum = 76;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_ene");
 break; }
case 1: {
 //BA.debugLineNum = 78;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_feb");
 //BA.debugLineNum = 79;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_feb");
 break; }
case 2: {
 //BA.debugLineNum = 81;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_mar");
 //BA.debugLineNum = 82;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_mar");
 break; }
case 3: {
 //BA.debugLineNum = 84;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_abr");
 //BA.debugLineNum = 85;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_abr");
 break; }
case 4: {
 //BA.debugLineNum = 87;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_may");
 //BA.debugLineNum = 88;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_may");
 break; }
case 5: {
 //BA.debugLineNum = 90;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_jun");
 //BA.debugLineNum = 91;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_jun");
 break; }
case 6: {
 //BA.debugLineNum = 93;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_jul");
 //BA.debugLineNum = 94;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_jul");
 break; }
case 7: {
 //BA.debugLineNum = 96;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_ago");
 //BA.debugLineNum = 97;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_ago");
 break; }
case 8: {
 //BA.debugLineNum = 99;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_sep");
 //BA.debugLineNum = 100;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_sep");
 break; }
case 9: {
 //BA.debugLineNum = 102;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_oct");
 //BA.debugLineNum = 103;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_oct");
 break; }
case 10: {
 //BA.debugLineNum = 105;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_nov");
 //BA.debugLineNum = 106;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_nov");
 break; }
case 11: {
 //BA.debugLineNum = 108;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = mRS.GetString(\"";
_mgastos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_mon_dic");
 //BA.debugLineNum = 109;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = mRS.GetString";
_mconsumos[_main._mult_extraido /*int*/ ] = _mrs.GetString("see_kwh_dic");
 break; }
}
;
 //BA.debugLineNum = 111;BA.debugLine="If mGASTOS(Main.mULT_EXTRAIDO) = \"\" Then";
if ((_mgastos[_main._mult_extraido /*int*/ ]).equals("")) { 
 //BA.debugLineNum = 112;BA.debugLine="mGASTOS(Main.mULT_EXTRAIDO) = \"0\"";
_mgastos[_main._mult_extraido /*int*/ ] = "0";
 };
 //BA.debugLineNum = 114;BA.debugLine="If mCONSUMOS(Main.mULT_EXTRAIDO) = \"\" Then";
if ((_mconsumos[_main._mult_extraido /*int*/ ]).equals("")) { 
 //BA.debugLineNum = 115;BA.debugLine="mCONSUMOS(Main.mULT_EXTRAIDO) = \"0\"";
_mconsumos[_main._mult_extraido /*int*/ ] = "0";
 };
 }
;
 //BA.debugLineNum = 118;BA.debugLine="For x = 0 To Main.mULT_EXTRAIDO";
{
final int step59 = 1;
final int limit59 = _main._mult_extraido /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit59 ;_x = _x + step59 ) {
 //BA.debugLineNum = 119;BA.debugLine="mCADENA_1 = Main.mFORMATO(mGASTOS(x).As(String)";
_mcadena_1 = BA.ObjectToString(_main._mformato /*Object*/ ((_mgastos[_x]),"M"));
 //BA.debugLineNum = 120;BA.debugLine="mCADENA_2 = Main.mFORMATO(mCONSUMOS(x).As(Strin";
_mcadena_2 = BA.ObjectToString(_main._mformato /*Object*/ ((_mconsumos[_x]),"N"));
 //BA.debugLineNum = 122;BA.debugLine="TBL_Energia.AddRow(Array As Object(mSERVICIOS(x";
_tbl_energia._addrow(new Object[]{(Object)(_mservicios[_x]),(Object)(_mequipos[_x]),(Object)(_mcadena_1),(Object)(_mcadena_2)},__c.True);
 }
};
 //BA.debugLineNum = 124;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 126;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("556426564","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 //BA.debugLineNum = 127;BA.debugLine="B_Guardar.Visible = False";
_b_guardar.setVisible(__c.False);
 };
 //BA.debugLineNum = 129;BA.debugLine="B_Guardar.Visible = True";
_b_guardar.setVisible(__c.True);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 5;BA.debugLine="Private TBL_Energia As FlexGrid";
_tbl_energia = new b4j.example.flexgrid();
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
public String  _tbl_energia_cellclick(int _row,int _col) throws Exception{
int _mvalor = 0;
 //BA.debugLineNum = 132;BA.debugLine="Private Sub TBL_Energia_CellClick(Row As Int, Col";
 //BA.debugLineNum = 133;BA.debugLine="Dim mVALOR As Int";
_mvalor = 0;
 //BA.debugLineNum = 135;BA.debugLine="If Col >= 2 Then";
if (_col>=2) { 
 //BA.debugLineNum = 136;BA.debugLine="mVALOR = Main.mFORMATO(TBL_Energia.GetCellValue(";
_mvalor = ((int)(BA.ObjectToNumber(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_energia._getcellvalue(_row,_col)),"T"))));
 //BA.debugLineNum = 137;BA.debugLine="If mVALOR = 0 Or Main.mDERECHO = 99 Then";
if (_mvalor==0 || _main._mderecho /*int*/ ==99) { 
 //BA.debugLineNum = 138;BA.debugLine="TBL_Energia.EditCellonsite(Row, Col)";
_tbl_energia._editcellonsite(_row,_col);
 };
 };
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _tbl_energia_modified(int _row,int _col) throws Exception{
String _mcadena = "";
 //BA.debugLineNum = 143;BA.debugLine="Private Sub TBL_Energia_Modified(Row As Int, Col A";
 //BA.debugLineNum = 144;BA.debugLine="Dim mCADENA As String";
_mcadena = "";
 //BA.debugLineNum = 146;BA.debugLine="If Col = 2 Then";
if (_col==2) { 
 //BA.debugLineNum = 147;BA.debugLine="mCADENA = Main.mFORMATO(TBL_Energia.GetCellValue";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_energia._getcellvalue(_row,_col)),"M"));
 }else {
 //BA.debugLineNum = 149;BA.debugLine="mCADENA = Main.mFORMATO(TBL_Energia.GetCellValue";
_mcadena = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_energia._getcellvalue(_row,_col)),"N"));
 };
 //BA.debugLineNum = 151;BA.debugLine="TBL_Energia.SetCellValue(Row, Col, mCADENA)";
_tbl_energia._setcellvalue(_row,_col,(Object)(_mcadena));
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
