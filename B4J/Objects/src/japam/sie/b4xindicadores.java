package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xindicadores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xindicadores", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xindicadores.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public japam.sie.b4xcombobox _cb_anio = null;
public japam.sie.b4xcombobox _cb_mes = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_regresar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_proceder = null;
public b4j.example.flexgrid _tbl_indicadores = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
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
 //BA.debugLineNum = 169;BA.debugLine="Private Sub B_Regresar_Click";
 //BA.debugLineNum = 170;BA.debugLine="If Main.mDERECHO >= 10 Then";
if (_main._mderecho /*int*/ >=10) { 
 //BA.debugLineNum = 171;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 }else {
 //BA.debugLineNum = 173;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 };
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _x = 0;
 //BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 19;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 20;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 22;BA.debugLine="Log(\"B4XIndicadores\")";
__c.LogImpl("55111812","B4XIndicadores",0);
 //BA.debugLineNum = 23;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 24;BA.debugLine="Root.LoadLayout(\"Indicadores\")";
_root.LoadLayout("Indicadores",ba);
 //BA.debugLineNum = 25;BA.debugLine="TBL_Indicadores.ColsName=Array As String(\"Indicad";
_tbl_indicadores._setcolsname(new String[]{"Indicador","Valor","Meta","Cumple al","Mínimo","Máximo"});
 //BA.debugLineNum = 26;BA.debugLine="TBL_Indicadores.ColsWidth=Array As Int(400dip, 80";
_tbl_indicadores._setcolswidth(new int[]{__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80)),__c.DipToCurrent((int) (80))});
 //BA.debugLineNum = 27;BA.debugLine="TBL_Indicadores.ColsType=Array As Int(TBL_Indicad";
_tbl_indicadores._setcolstype(new int[]{_tbl_indicadores._typestring,_tbl_indicadores._typestring,_tbl_indicadores._typestring,_tbl_indicadores._typestring,_tbl_indicadores._typestring,_tbl_indicadores._typestring});
 //BA.debugLineNum = 28;BA.debugLine="TBL_Indicadores.ColsAlignment=Array As String(\"CE";
_tbl_indicadores._setcolsalignment(new String[]{"CENTER","CENTER","CENTER","CENTER","CENTER","CENTER"});
 //BA.debugLineNum = 29;BA.debugLine="TBL_Indicadores.SetColCustomize(0, xui.Color_RGB(";
_tbl_indicadores._setcolcustomize((int) (0),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 30;BA.debugLine="TBL_Indicadores.SetColCustomize(1, xui.Color_RGB(";
_tbl_indicadores._setcolcustomize((int) (1),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 31;BA.debugLine="TBL_Indicadores.SetColCustomize(2, xui.Color_RGB(";
_tbl_indicadores._setcolcustomize((int) (2),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 32;BA.debugLine="TBL_Indicadores.SetColCustomize(3, xui.Color_RGB(";
_tbl_indicadores._setcolcustomize((int) (3),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 33;BA.debugLine="TBL_Indicadores.SetColCustomize(4, xui.Color_RGB(";
_tbl_indicadores._setcolcustomize((int) (4),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 34;BA.debugLine="TBL_Indicadores.SetColCustomize(5, xui.Color_RGB(";
_tbl_indicadores._setcolcustomize((int) (5),_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (224),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (14)));
 //BA.debugLineNum = 35;BA.debugLine="CB_Anio.cmbBox.Items.Clear";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 36;BA.debugLine="For x = 2021 To 2027";
{
final int step17 = 1;
final int limit17 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
 //BA.debugLineNum = 37;BA.debugLine="CB_Anio.cmbBox.Items.Add(x)";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="For x = 1 To 12";
{
final int step20 = 1;
final int limit20 = (int) (12);
_x = (int) (1) ;
for (;_x <= limit20 ;_x = _x + step20 ) {
 //BA.debugLineNum = 40;BA.debugLine="CB_Mes.cmbBox.Items.Add(x)";
_cb_mes._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores() throws Exception{
int _x = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
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
String _mtmp_str_1 = "";
String _mtmp_str_2 = "";
String _mtmp_str_3 = "";
float _mtmp_float = 0f;
 //BA.debugLineNum = 59;BA.debugLine="Sub Cargar_Valores()";
 //BA.debugLineNum = 60;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 61;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Dim mINDICADORES(50), mVALORES(50), mMETAS(50) As";
_mindicadores = new String[(int) (50)];
java.util.Arrays.fill(_mindicadores,"");
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
_mmetas = new String[(int) (50)];
java.util.Arrays.fill(_mmetas,"");
 //BA.debugLineNum = 63;BA.debugLine="Dim mCUMPLIMIENTOS(50), mMINIMOS(50), mMAXIMOS(50";
_mcumplimientos = new String[(int) (50)];
java.util.Arrays.fill(_mcumplimientos,"");
_mminimos = new String[(int) (50)];
java.util.Arrays.fill(_mminimos,"");
_mmaximos = new String[(int) (50)];
java.util.Arrays.fill(_mmaximos,"");
 //BA.debugLineNum = 64;BA.debugLine="Dim mINDICADOR, mVALOR, mMETA, mCUMPLIMIENTO, mMI";
_mindicador = "";
_mvalor = "";
_mmeta = "";
_mcumplimiento = "";
_mminimo = "";
_mmaximo = "";
 //BA.debugLineNum = 65;BA.debugLine="Dim mTMP_STR_1, mTMP_STR_2, mTMP_STR_3 As String";
_mtmp_str_1 = "";
_mtmp_str_2 = "";
_mtmp_str_3 = "";
 //BA.debugLineNum = 66;BA.debugLine="Dim mTMP_FLOAT As Float";
_mtmp_float = 0f;
 //BA.debugLineNum = 68;BA.debugLine="TBL_Indicadores.ClearRows";
_tbl_indicadores._clearrows();
 //BA.debugLineNum = 69;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 70;BA.debugLine="Main.mCONEXION = True";
_main._mconexion /*boolean*/  = __c.True;
 //BA.debugLineNum = 71;BA.debugLine="mRS = Main.MSQL.ExecQuery(\"SELECT * FROM sie_ind";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = "+BA.NumberToString(_main._manio /*int*/ ));
 //BA.debugLineNum = 72;BA.debugLine="Main.mULT_INDICADOR = -1";
_main._mult_indicador /*int*/  = (int) (-1);
 //BA.debugLineNum = 73;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 74;BA.debugLine="Main.mULT_INDICADOR = Main.mULT_INDICADOR + 1";
_main._mult_indicador /*int*/  = (int) (_main._mult_indicador /*int*/ +1);
 //BA.debugLineNum = 75;BA.debugLine="mINDICADORES(Main.mULT_INDICADOR) = mRS.GetStri";
_mindicadores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_descripcion");
 //BA.debugLineNum = 76;BA.debugLine="mMETAS(Main.mULT_INDICADOR) = mRS.GetString(\"in";
_mmetas[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_meta");
 //BA.debugLineNum = 77;BA.debugLine="mMINIMOS(Main.mULT_INDICADOR) = mRS.GetString(\"";
_mminimos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_minimo");
 //BA.debugLineNum = 78;BA.debugLine="mMAXIMOS(Main.mULT_INDICADOR) = mRS.GetString(\"";
_mmaximos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_maximo");
 //BA.debugLineNum = 79;BA.debugLine="Select Case Main.mMES";
switch (BA.switchObjectToInt(_main._mmes /*int*/ ,(int) (1),(int) (2),(int) (3),(int) (4),(int) (5),(int) (6),(int) (7),(int) (8),(int) (9),(int) (10),(int) (11),(int) (12))) {
case 0: {
 //BA.debugLineNum = 81;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_ene");
 //BA.debugLineNum = 82;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_ene");
 break; }
case 1: {
 //BA.debugLineNum = 84;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_feb");
 //BA.debugLineNum = 85;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_feb");
 break; }
case 2: {
 //BA.debugLineNum = 87;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_mar");
 //BA.debugLineNum = 88;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_mar");
 break; }
case 3: {
 //BA.debugLineNum = 90;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_abr");
 //BA.debugLineNum = 91;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_abr");
 break; }
case 4: {
 //BA.debugLineNum = 93;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_may");
 //BA.debugLineNum = 94;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_may");
 break; }
case 5: {
 //BA.debugLineNum = 96;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_jun");
 //BA.debugLineNum = 97;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_jun");
 break; }
case 6: {
 //BA.debugLineNum = 99;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_jul");
 //BA.debugLineNum = 100;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_jul");
 break; }
case 7: {
 //BA.debugLineNum = 102;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_ago");
 //BA.debugLineNum = 103;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_ago");
 break; }
case 8: {
 //BA.debugLineNum = 105;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_sep");
 //BA.debugLineNum = 106;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_sep");
 break; }
case 9: {
 //BA.debugLineNum = 108;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_oct");
 //BA.debugLineNum = 109;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_oct");
 break; }
case 10: {
 //BA.debugLineNum = 111;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_nov");
 //BA.debugLineNum = 112;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_nov");
 break; }
case 11: {
 //BA.debugLineNum = 114;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = mRS.GetString";
_mvalores[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_dic");
 //BA.debugLineNum = 115;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = mRS.Get";
_mcumplimientos[_main._mult_indicador /*int*/ ] = _mrs.GetString("ind_c_dic");
 break; }
}
;
 //BA.debugLineNum = 117;BA.debugLine="If mVALORES(Main.mULT_INDICADOR) = \"\" Then";
if ((_mvalores[_main._mult_indicador /*int*/ ]).equals("")) { 
 //BA.debugLineNum = 118;BA.debugLine="mVALORES(Main.mULT_INDICADOR) = \"0\"";
_mvalores[_main._mult_indicador /*int*/ ] = "0";
 };
 //BA.debugLineNum = 120;BA.debugLine="If mCUMPLIMIENTOS(Main.mULT_INDICADOR) = \"\" The";
if ((_mcumplimientos[_main._mult_indicador /*int*/ ]).equals("")) { 
 //BA.debugLineNum = 121;BA.debugLine="mCUMPLIMIENTOS(Main.mULT_INDICADOR) = \"0\"";
_mcumplimientos[_main._mult_indicador /*int*/ ] = "0";
 };
 }
;
 //BA.debugLineNum = 124;BA.debugLine="For x = 0 To Main.mULT_INDICADOR";
{
final int step64 = 1;
final int limit64 = _main._mult_indicador /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit64 ;_x = _x + step64 ) {
 //BA.debugLineNum = 126;BA.debugLine="mINDICADOR = mINDICADORES(x)";
_mindicador = _mindicadores[_x];
 //BA.debugLineNum = 127;BA.debugLine="If mINDICADOR.Contains(\"%\") Then";
if (_mindicador.contains("%")) { 
 //BA.debugLineNum = 128;BA.debugLine="mVALOR = Main.mFORMATO(mVALORES(x), \"P\")";
_mvalor = BA.ObjectToString(_main._mformato /*Object*/ (_mvalores[_x],"P"));
 //BA.debugLineNum = 129;BA.debugLine="mMETA  = Main.mFORMATO(mMETAS(x), \"P\")";
_mmeta = BA.ObjectToString(_main._mformato /*Object*/ (_mmetas[_x],"P"));
 //BA.debugLineNum = 130;BA.debugLine="mMINIMO  = Main.mFORMATO(mMINIMOS(x), \"P\")";
_mminimo = BA.ObjectToString(_main._mformato /*Object*/ (_mminimos[_x],"P"));
 //BA.debugLineNum = 131;BA.debugLine="mMAXIMO = Main.mFORMATO(mMAXIMOS(x), \"P\")";
_mmaximo = BA.ObjectToString(_main._mformato /*Object*/ (_mmaximos[_x],"P"));
 }else {
 //BA.debugLineNum = 133;BA.debugLine="mVALOR = Main.mFORMATO(mVALORES(x), \"N\")";
_mvalor = BA.ObjectToString(_main._mformato /*Object*/ (_mvalores[_x],"N"));
 //BA.debugLineNum = 134;BA.debugLine="mMETA  = Main.mFORMATO(mMETAS(x), \"N\")";
_mmeta = BA.ObjectToString(_main._mformato /*Object*/ (_mmetas[_x],"N"));
 //BA.debugLineNum = 135;BA.debugLine="mMINIMO  = Main.mFORMATO(mMINIMOS(x), \"N\")";
_mminimo = BA.ObjectToString(_main._mformato /*Object*/ (_mminimos[_x],"N"));
 //BA.debugLineNum = 136;BA.debugLine="mMAXIMO = Main.mFORMATO(mMAXIMOS(x), \"N\")";
_mmaximo = BA.ObjectToString(_main._mformato /*Object*/ (_mmaximos[_x],"N"));
 };
 //BA.debugLineNum = 138;BA.debugLine="mCUMPLIMIENTO = Main.mFORMATO(mCUMPLIMIENTOS(x)";
_mcumplimiento = BA.ObjectToString(_main._mformato /*Object*/ (_mcumplimientos[_x],"P"));
 //BA.debugLineNum = 139;BA.debugLine="TBL_Indicadores.AddRow(Array As Object(mINDICAD";
_tbl_indicadores._addrow(new Object[]{(Object)(_mindicador),(Object)(_mvalor),(Object)(_mmeta),(Object)(_mcumplimiento),(Object)(_mminimo),(Object)(_mmaximo)},__c.True);
 }
};
 //BA.debugLineNum = 142;BA.debugLine="For x = 0 To TBL_Indicadores.RowCount -1";
{
final int step80 = 1;
final int limit80 = (int) (_tbl_indicadores._getrowcount()-1);
_x = (int) (0) ;
for (;_x <= limit80 ;_x = _x + step80 ) {
 //BA.debugLineNum = 143;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(TBL_Indicadores.GetC";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_indicadores._getcellvalue(_x,(int) (1))),"T"));
 //BA.debugLineNum = 144;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(TBL_Indicadores.GetC";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_indicadores._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 145;BA.debugLine="mTMP_FLOAT = (mTMP_STR_1 / mTMP_STR_2) * 100";
_mtmp_float = (float) (((double)(Double.parseDouble(_mtmp_str_1))/(double)(double)(Double.parseDouble(_mtmp_str_2)))*100);
 //BA.debugLineNum = 146;BA.debugLine="mVALOR = Main.mFORMATO(mTMP_FLOAT.As(String), \"";
_mvalor = BA.ObjectToString(_main._mformato /*Object*/ ((BA.NumberToString(_mtmp_float)),"P"));
 //BA.debugLineNum = 147;BA.debugLine="TBL_Indicadores.SetCellValue(x, 3, mVALOR)";
_tbl_indicadores._setcellvalue(_x,(int) (3),(Object)(_mvalor));
 //BA.debugLineNum = 149;BA.debugLine="mTMP_STR_1 = Main.mFORMATO(TBL_Indicadores.GetC";
_mtmp_str_1 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_indicadores._getcellvalue(_x,(int) (1))),"T"));
 //BA.debugLineNum = 150;BA.debugLine="mTMP_STR_2 = Main.mFORMATO(TBL_Indicadores.GetC";
_mtmp_str_2 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_indicadores._getcellvalue(_x,(int) (2))),"T"));
 //BA.debugLineNum = 151;BA.debugLine="mTMP_STR_3 = Main.mFORMATO(TBL_Indicadores.GetC";
_mtmp_str_3 = BA.ObjectToString(_main._mformato /*Object*/ (BA.ObjectToString(_tbl_indicadores._getcellvalue(_x,(int) (4))),"T"));
 //BA.debugLineNum = 152;BA.debugLine="If mTMP_STR_1 < mTMP_STR_3 Then";
if ((double)(Double.parseDouble(_mtmp_str_1))<(double)(Double.parseDouble(_mtmp_str_3))) { 
 //BA.debugLineNum = 153;BA.debugLine="TBL_Indicadores.SetRowCustomize(x, xui.Color_R";
_tbl_indicadores._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (255),(int) (255),(int) (0)),_xui.CreateDefaultFont((float) (12)));
 };
 //BA.debugLineNum = 155;BA.debugLine="If mTMP_STR_1 > mTMP_STR_3 And mTMP_STR_1 < mTM";
if ((double)(Double.parseDouble(_mtmp_str_1))>(double)(Double.parseDouble(_mtmp_str_3)) && (double)(Double.parseDouble(_mtmp_str_1))<(double)(Double.parseDouble(_mtmp_str_2))) { 
 //BA.debugLineNum = 156;BA.debugLine="TBL_Indicadores.SetrowCustomize(x, xui.Color_R";
_tbl_indicadores._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (70),(int) (130),(int) (180)),_xui.CreateDefaultFont((float) (12)));
 };
 //BA.debugLineNum = 158;BA.debugLine="If mTMP_STR_1 >= mTMP_STR_2 Then";
if ((double)(Double.parseDouble(_mtmp_str_1))>=(double)(Double.parseDouble(_mtmp_str_2))) { 
 //BA.debugLineNum = 159;BA.debugLine="TBL_Indicadores.SetrowCustomize(x, xui.Color_R";
_tbl_indicadores._setrowcustomize(_x,_xui.Color_RGB((int) (0),(int) (0),(int) (255)),_xui.Color_RGB((int) (0),(int) (255),(int) (255)),_xui.CreateDefaultFont((float) (12)));
 };
 }
};
 //BA.debugLineNum = 163;BA.debugLine="Main.msql.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 165;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("55374058","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 5;BA.debugLine="Private CB_Anio As B4XComboBox";
_cb_anio = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 6;BA.debugLine="Private CB_Mes As B4XComboBox";
_cb_mes = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 7;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private TBL_Indicadores As FlexGrid";
_tbl_indicadores = new b4j.example.flexgrid();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
