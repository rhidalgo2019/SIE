package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xgrafica extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xgrafica", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xgrafica.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _mainform = null;
public japam.sie.xlutils _xl = null;
public japam.sie.b4xcombobox _cb_anio = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_proceder = null;
public anywheresoftware.b4j.objects.ButtonWrapper _b_regresar = null;
public flm.b4j.charts.b4jLineChart _linechart = null;
public anywheresoftware.b4j.objects.CanvasWrapper _chartcanvas = null;
public flm.b4j.charts.b4jXYSeries _fullseries = null;
public flm.b4j.charts.b4jXYSeries _currentseries = null;
public String[] _mclaves = null;
public String[] _mdatos = null;
public String[] _mminimos = null;
public String[] _mmaximos = null;
public String[] _mmetas = null;
public String[] _mvalores = null;
public String[] _mmeses = null;
public flm.b4j.charts.b4jXYSeries _serie_1 = null;
public flm.b4j.charts.b4jXYSeries _serie_2 = null;
public flm.b4j.charts.b4jXYSeries _serie_3 = null;
public flm.b4j.charts.b4jXYSeries _serie_4 = null;
public String _mindicador = "";
public japam.sie.b4xcombobox _cb_indicador = null;
public anywheresoftware.b4j.objects.LabelWrapper _l_mensajes = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _b_proceder_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Private Sub B_Proceder_MouseClicked (EventData As";
 //BA.debugLineNum = 93;BA.debugLine="L_Mensajes.Text = \"Generando gráfica...\"";
_l_mensajes.setText("Generando gráfica...");
 //BA.debugLineNum = 94;BA.debugLine="Cargar_Valores";
_cargar_valores();
 //BA.debugLineNum = 95;BA.debugLine="L_Mensajes.Text = \"Generando PDF...\"";
_l_mensajes.setText("Generando PDF...");
 //BA.debugLineNum = 96;BA.debugLine="LLenar_Excel";
_llenar_excel();
 //BA.debugLineNum = 97;BA.debugLine="LineChart.Visible = True";
_linechart.setVisible(__c.True);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _b_regresar_click() throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Private Sub B_Regresar_Click";
 //BA.debugLineNum = 405;BA.debugLine="If Main.mDERECHO >= 10 Then";
if (_main._mderecho /*int*/ >=10) { 
 //BA.debugLineNum = 406;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"Menu\")";
_b4xpages._showpageandremovepreviouspages /*String*/ ("Menu");
 }else {
 //BA.debugLineNum = 408;BA.debugLine="B4XPages.ClosePage(Me)";
_b4xpages._closepage /*String*/ (this);
 };
 //BA.debugLineNum = 410;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
int _x = 0;
 //BA.debugLineNum = 39;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 40;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 42;BA.debugLine="Log(\"B4XGrafica\")";
__c.LogImpl("51048579","B4XGrafica",0);
 //BA.debugLineNum = 43;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 44;BA.debugLine="Root.LoadLayout(\"Grafica\")";
_root.LoadLayout("Grafica",ba);
 //BA.debugLineNum = 45;BA.debugLine="CB_Anio.cmbBox.Items.Clear";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Clear();
 //BA.debugLineNum = 46;BA.debugLine="For x = 2021 To 2027";
{
final int step6 = 1;
final int limit6 = (int) (2027);
_x = (int) (2021) ;
for (;_x <= limit6 ;_x = _x + step6 ) {
 //BA.debugLineNum = 47;BA.debugLine="CB_Anio.cmbBox.Items.Add(x)";
_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_x));
 }
};
 //BA.debugLineNum = 49;BA.debugLine="Cargar_Indicadores";
_cargar_indicadores();
 //BA.debugLineNum = 50;BA.debugLine="For x = 0 To Main.mULT_DATOS";
{
final int step10 = 1;
final int limit10 = _main._mult_datos /*int*/ ;
_x = (int) (0) ;
for (;_x <= limit10 ;_x = _x + step10 ) {
 //BA.debugLineNum = 51;BA.debugLine="CB_Indicador.cmbBox.Items.Add(mDATOS(x))";
_cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().Add((Object)(_mdatos[_x]));
 }
};
 //BA.debugLineNum = 53;BA.debugLine="mMESES(0) = \"1\"";
_mmeses[(int) (0)] = "1";
 //BA.debugLineNum = 54;BA.debugLine="mMESES(1) = \"2\"";
_mmeses[(int) (1)] = "2";
 //BA.debugLineNum = 55;BA.debugLine="mMESES(2) = \"3\"";
_mmeses[(int) (2)] = "3";
 //BA.debugLineNum = 56;BA.debugLine="mMESES(3) = \"4\"";
_mmeses[(int) (3)] = "4";
 //BA.debugLineNum = 57;BA.debugLine="mMESES(4) = \"5\"";
_mmeses[(int) (4)] = "5";
 //BA.debugLineNum = 58;BA.debugLine="mMESES(5) = \"6\"";
_mmeses[(int) (5)] = "6";
 //BA.debugLineNum = 59;BA.debugLine="mMESES(6) = \"7\"";
_mmeses[(int) (6)] = "7";
 //BA.debugLineNum = 60;BA.debugLine="mMESES(7) = \"8\"";
_mmeses[(int) (7)] = "8";
 //BA.debugLineNum = 61;BA.debugLine="mMESES(8) = \"9\"";
_mmeses[(int) (8)] = "9";
 //BA.debugLineNum = 62;BA.debugLine="mMESES(9) = \"10\"";
_mmeses[(int) (9)] = "10";
 //BA.debugLineNum = 63;BA.debugLine="mMESES(10) = \"11\"";
_mmeses[(int) (10)] = "11";
 //BA.debugLineNum = 64;BA.debugLine="mMESES(11) = \"12\"";
_mmeses[(int) (11)] = "12";
 //BA.debugLineNum = 65;BA.debugLine="L_Mensajes.Text = \"\"";
_l_mensajes.setText("");
 //BA.debugLineNum = 68;BA.debugLine="LineChart.Animated = False";
_linechart.setAnimated(__c.False);
 //BA.debugLineNum = 69;BA.debugLine="LineChart.CreateSymbols = False";
_linechart.setCreateSymbols(__c.False);
 //BA.debugLineNum = 70;BA.debugLine="LineChart.LegendVisible = False";
_linechart.setLegendVisible(__c.False);
 //BA.debugLineNum = 71;BA.debugLine="FullSeries.Initialize(\"\")";
_fullseries.Initialize("");
 //BA.debugLineNum = 72;BA.debugLine="CurrentSeries.Initialize(\"\")";
_currentseries.Initialize("");
 //BA.debugLineNum = 73;BA.debugLine="LineChart.AddSeries(CurrentSeries)";
_linechart.AddSeries(_currentseries);
 //BA.debugLineNum = 76;BA.debugLine="ChartCanvas.Initialize(\"\")";
_chartcanvas.Initialize(ba,"");
 //BA.debugLineNum = 77;BA.debugLine="ChartCanvas.Enabled = False";
_chartcanvas.setEnabled(__c.False);
 //BA.debugLineNum = 78;BA.debugLine="MainForm.Initialize(\"\", 800, 600)";
_mainform.Initialize(ba,"",800,600);
 //BA.debugLineNum = 79;BA.debugLine="MainForm.RootPane.AddNode(ChartCanvas, LineChart.";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_chartcanvas.getObject()),_linechart.getLeft(),_linechart.getTop(),0,0);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return "";
}
public String  _cargar_indicadores() throws Exception{
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub Cargar_Indicadores()";
 //BA.debugLineNum = 101;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 103;BA.debugLine="Main.mULT_DATOS = -1";
_main._mult_datos /*int*/  = (int) (-1);
 //BA.debugLineNum = 104;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 105;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 106;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ind";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_indicadores WHERE ind_anio = 2022");
 //BA.debugLineNum = 107;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 108;BA.debugLine="Main.mULT_DATOS = Main.mULT_DATOS + 1";
_main._mult_datos /*int*/  = (int) (_main._mult_datos /*int*/ +1);
 //BA.debugLineNum = 109;BA.debugLine="mCLAVES(Main.mULT_DATOS) = mRS.GetString(\"ind_c";
_mclaves[_main._mult_datos /*int*/ ] = _mrs.GetString("ind_clave");
 //BA.debugLineNum = 110;BA.debugLine="mDATOS(Main.mULT_DATOS) = mRS.GetString(\"ind_de";
_mdatos[_main._mult_datos /*int*/ ] = _mrs.GetString("ind_descripcion");
 }
;
 //BA.debugLineNum = 112;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 114;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("51310734","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return "";
}
public String  _cargar_valores() throws Exception{
int _x = 0;
anywheresoftware.b4j.objects.SQL.ResultSetWrapper _mrs = null;
int _anio = 0;
 //BA.debugLineNum = 118;BA.debugLine="Sub Cargar_Valores()";
 //BA.debugLineNum = 119;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 120;BA.debugLine="Dim mRS As ResultSet";
_mrs = new anywheresoftware.b4j.objects.SQL.ResultSetWrapper();
 //BA.debugLineNum = 121;BA.debugLine="Dim ANIO As Int";
_anio = 0;
 //BA.debugLineNum = 123;BA.debugLine="Main.Conectar_Servidor";
_main._conectar_servidor /*String*/ ();
 //BA.debugLineNum = 124;BA.debugLine="ANIO = Main.mANIO";
_anio = _main._manio /*int*/ ;
 //BA.debugLineNum = 125;BA.debugLine="If Main.mSQL.IsInitialized Then";
if (_main._msql /*anywheresoftware.b4j.objects.SQL*/ .IsInitialized()) { 
 //BA.debugLineNum = 126;BA.debugLine="mRS = Main.mSQL.ExecQuery(\"SELECT * FROM sie_ind";
_mrs = _main._msql /*anywheresoftware.b4j.objects.SQL*/ .ExecQuery("SELECT * FROM sie_indicadores WHERE ind_descripcion = '"+_mindicador+"' AND ind_anio = "+BA.NumberToString(_anio));
 //BA.debugLineNum = 127;BA.debugLine="Do While mRS.NextRow";
while (_mrs.NextRow()) {
 //BA.debugLineNum = 128;BA.debugLine="For x = 0 To 11";
{
final int step9 = 1;
final int limit9 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit9 ;_x = _x + step9 ) {
 //BA.debugLineNum = 129;BA.debugLine="mMINIMOS(x) = mRS.GetString(\"ind_minimo\")";
_mminimos[_x] = _mrs.GetString("ind_minimo");
 }
};
 //BA.debugLineNum = 131;BA.debugLine="For x = 0 To 11";
{
final int step12 = 1;
final int limit12 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
 //BA.debugLineNum = 132;BA.debugLine="mMAXIMOS(x) = mRS.GetString(\"ind_maximo\")";
_mmaximos[_x] = _mrs.GetString("ind_maximo");
 }
};
 //BA.debugLineNum = 134;BA.debugLine="For x = 0 To 11";
{
final int step15 = 1;
final int limit15 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit15 ;_x = _x + step15 ) {
 //BA.debugLineNum = 135;BA.debugLine="mMETAS(x) = mRS.GetString(\"ind_meta\")";
_mmetas[_x] = _mrs.GetString("ind_meta");
 }
};
 //BA.debugLineNum = 137;BA.debugLine="mVALORES(0) = mRS.GetString(\"ind_ene\")";
_mvalores[(int) (0)] = _mrs.GetString("ind_ene");
 //BA.debugLineNum = 138;BA.debugLine="mVALORES(1) = mRS.GetString(\"ind_feb\")";
_mvalores[(int) (1)] = _mrs.GetString("ind_feb");
 //BA.debugLineNum = 139;BA.debugLine="mVALORES(2) = mRS.GetString(\"ind_mar\")";
_mvalores[(int) (2)] = _mrs.GetString("ind_mar");
 //BA.debugLineNum = 140;BA.debugLine="mVALORES(3) = mRS.GetString(\"ind_abr\")";
_mvalores[(int) (3)] = _mrs.GetString("ind_abr");
 //BA.debugLineNum = 141;BA.debugLine="mVALORES(4) = mRS.GetString(\"ind_may\")";
_mvalores[(int) (4)] = _mrs.GetString("ind_may");
 //BA.debugLineNum = 142;BA.debugLine="mVALORES(5) = mRS.GetString(\"ind_jun\")";
_mvalores[(int) (5)] = _mrs.GetString("ind_jun");
 //BA.debugLineNum = 143;BA.debugLine="mVALORES(6) = mRS.GetString(\"ind_jul\")";
_mvalores[(int) (6)] = _mrs.GetString("ind_jul");
 //BA.debugLineNum = 144;BA.debugLine="mVALORES(7) = mRS.GetString(\"ind_ago\")";
_mvalores[(int) (7)] = _mrs.GetString("ind_ago");
 //BA.debugLineNum = 145;BA.debugLine="mVALORES(8) = mRS.GetString(\"ind_sep\")";
_mvalores[(int) (8)] = _mrs.GetString("ind_sep");
 //BA.debugLineNum = 146;BA.debugLine="mVALORES(9) = mRS.GetString(\"ind_oct\")";
_mvalores[(int) (9)] = _mrs.GetString("ind_oct");
 //BA.debugLineNum = 147;BA.debugLine="mVALORES(10) = mRS.GetString(\"ind_nov\")";
_mvalores[(int) (10)] = _mrs.GetString("ind_nov");
 //BA.debugLineNum = 148;BA.debugLine="mVALORES(11) = mRS.GetString(\"ind_dic\")";
_mvalores[(int) (11)] = _mrs.GetString("ind_dic");
 //BA.debugLineNum = 149;BA.debugLine="For x = 0 To 11";
{
final int step30 = 1;
final int limit30 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit30 ;_x = _x + step30 ) {
 //BA.debugLineNum = 150;BA.debugLine="If mVALORES(x) = \"\" Then";
if ((_mvalores[_x]).equals("")) { 
 //BA.debugLineNum = 151;BA.debugLine="mVALORES(x) = \"0\"";
_mvalores[_x] = "0";
 };
 }
};
 }
;
 //BA.debugLineNum = 155;BA.debugLine="Main.mSQL.Close";
_main._msql /*anywheresoftware.b4j.objects.SQL*/ .Close();
 }else {
 //BA.debugLineNum = 157;BA.debugLine="Log(\"---------- SIE Database (MSSQL)  Fallo de c";
__c.LogImpl("51376295","---------- SIE Database (MSSQL)  Fallo de conexion ----------",0);
 };
 //BA.debugLineNum = 159;BA.debugLine="Corregir_Valores";
_corregir_valores();
 //BA.debugLineNum = 160;BA.debugLine="LLenar_Series";
_llenar_series();
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public String  _cb_anio_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Private Sub CB_Anio_SelectedIndexChanged (Index As";
 //BA.debugLineNum = 83;BA.debugLine="Main.mANIO = CB_Anio.cmbBox.Value";
_main._manio /*int*/  = (int)(BA.ObjectToNumber(_cb_anio._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue()));
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _cb_indicador_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Private Sub CB_Indicador_SelectedIndexChanged (Ind";
 //BA.debugLineNum = 87;BA.debugLine="mINDICADOR = CB_Indicador.cmbBox.value";
_mindicador = BA.ObjectToString(_cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 //BA.debugLineNum = 88;BA.debugLine="LineChart.Title = mINDICADOR";
_linechart.setTitle(_mindicador);
 //BA.debugLineNum = 89;BA.debugLine="LineChart.RemoveAllSeries";
_linechart.RemoveAllSeries();
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 6;BA.debugLine="Private xl As XLUtils";
_xl = new japam.sie.xlutils();
 //BA.debugLineNum = 9;BA.debugLine="Private CB_Anio As B4XComboBox";
_cb_anio = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 10;BA.debugLine="Private B_Proceder As Button";
_b_proceder = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private B_Regresar As Button";
_b_regresar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Public LineChart As LineChart";
_linechart = new flm.b4j.charts.b4jLineChart();
 //BA.debugLineNum = 14;BA.debugLine="Dim ChartCanvas As Canvas";
_chartcanvas = new anywheresoftware.b4j.objects.CanvasWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim FullSeries As XYSeries";
_fullseries = new flm.b4j.charts.b4jXYSeries();
 //BA.debugLineNum = 16;BA.debugLine="Dim CurrentSeries As XYSeries";
_currentseries = new flm.b4j.charts.b4jXYSeries();
 //BA.debugLineNum = 18;BA.debugLine="Public mCLAVES(50) As String";
_mclaves = new String[(int) (50)];
java.util.Arrays.fill(_mclaves,"");
 //BA.debugLineNum = 19;BA.debugLine="Public mDATOS(50) As String";
_mdatos = new String[(int) (50)];
java.util.Arrays.fill(_mdatos,"");
 //BA.debugLineNum = 20;BA.debugLine="Public mMINIMOS(50) As String";
_mminimos = new String[(int) (50)];
java.util.Arrays.fill(_mminimos,"");
 //BA.debugLineNum = 21;BA.debugLine="Public mMAXIMOS(50) As String";
_mmaximos = new String[(int) (50)];
java.util.Arrays.fill(_mmaximos,"");
 //BA.debugLineNum = 22;BA.debugLine="Public mMETAS(50) As String";
_mmetas = new String[(int) (50)];
java.util.Arrays.fill(_mmetas,"");
 //BA.debugLineNum = 23;BA.debugLine="Public mVALORES(50) As String";
_mvalores = new String[(int) (50)];
java.util.Arrays.fill(_mvalores,"");
 //BA.debugLineNum = 24;BA.debugLine="Public mMESES(50) As String";
_mmeses = new String[(int) (50)];
java.util.Arrays.fill(_mmeses,"");
 //BA.debugLineNum = 25;BA.debugLine="Public Serie_1, Serie_2, Serie_3, Serie_4 As XYSe";
_serie_1 = new flm.b4j.charts.b4jXYSeries();
_serie_2 = new flm.b4j.charts.b4jXYSeries();
_serie_3 = new flm.b4j.charts.b4jXYSeries();
_serie_4 = new flm.b4j.charts.b4jXYSeries();
 //BA.debugLineNum = 26;BA.debugLine="Public mINDICADOR As String";
_mindicador = "";
 //BA.debugLineNum = 27;BA.debugLine="Public mMESES(12) As String";
_mmeses = new String[(int) (12)];
java.util.Arrays.fill(_mmeses,"");
 //BA.debugLineNum = 29;BA.debugLine="Private CB_Indicador As B4XComboBox";
_cb_indicador = new japam.sie.b4xcombobox();
 //BA.debugLineNum = 30;BA.debugLine="Private L_Mensajes As Label";
_l_mensajes = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public String  _corregir_valores() throws Exception{
int _x = 0;
 //BA.debugLineNum = 163;BA.debugLine="Sub Corregir_Valores";
 //BA.debugLineNum = 164;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 166;BA.debugLine="For x = 0 To 11";
{
final int step2 = 1;
final int limit2 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit2 ;_x = _x + step2 ) {
 //BA.debugLineNum = 167;BA.debugLine="If mVALORES(x)  = \"\" Then";
if ((_mvalores[_x]).equals("")) { 
 //BA.debugLineNum = 168;BA.debugLine="mVALORES (x) = mMINIMOS(x)";
_mvalores[_x] = _mminimos[_x];
 };
 }
};
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public String  _lc_mouseexited(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _event) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub LC_MouseExited(Event As MouseEvent)";
 //BA.debugLineNum = 401;BA.debugLine="ChartCanvas.ClearRect(0, 0, ChartCanvas.Width, Ch";
_chartcanvas.ClearRect(0,0,_chartcanvas.getWidth(),_chartcanvas.getHeight());
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return "";
}
public String  _lc_mousemoved(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _event) throws Exception{
flm.b4j.charts.b4jNodeBounds _nb = null;
flm.b4j.charts.b4jXYCoord _axiscoord = null;
flm.b4j.charts.b4jNumberAxis _xaxis = null;
double _xvalue = 0;
flm.b4j.charts.b4jXYCoord _nearestxy = null;
flm.b4j.charts.b4jNumberAxis _yaxis = null;
double _x = 0;
double _y = 0;
 //BA.debugLineNum = 369;BA.debugLine="Sub LC_MouseMoved(Event As MouseEvent)";
 //BA.debugLineNum = 371;BA.debugLine="Dim NB As NodeBounds = LineChart.GetChildNodeBoun";
_nb = _linechart.GetChildNodeBounds(".chart-plot-background");
 //BA.debugLineNum = 372;BA.debugLine="If ChartCanvas.Left <> NB.SceneX Then ChartCanvas";
if (_chartcanvas.getLeft()!=_nb.getSceneX()) { 
_chartcanvas.setLeft(_nb.getSceneX());};
 //BA.debugLineNum = 373;BA.debugLine="If ChartCanvas.Top <> NB.SceneY Then ChartCanvas.";
if (_chartcanvas.getTop()!=_nb.getSceneY()) { 
_chartcanvas.setTop(_nb.getSceneY());};
 //BA.debugLineNum = 374;BA.debugLine="If ChartCanvas.Width <> NB.Width Then ChartCanvas";
if (_chartcanvas.getWidth()!=_nb.getWidth()) { 
_chartcanvas.setWidth(_nb.getWidth());};
 //BA.debugLineNum = 375;BA.debugLine="If ChartCanvas.Height <> NB.Height Then ChartCanv";
if (_chartcanvas.getHeight()!=_nb.getHeight()) { 
_chartcanvas.setHeight(_nb.getHeight());};
 //BA.debugLineNum = 378;BA.debugLine="Dim AxisCoord As XYCoord = LineChart.MouseToAxis(";
_axiscoord = _linechart.MouseToAxis(_event);
 //BA.debugLineNum = 379;BA.debugLine="Dim XAxis As NumberAxis = LineChart.XAxis";
_xaxis = new flm.b4j.charts.b4jNumberAxis();
_xaxis = (flm.b4j.charts.b4jNumberAxis) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new flm.b4j.charts.b4jNumberAxis(), (javafx.scene.chart.Axis)(_linechart.getXAxis()));
 //BA.debugLineNum = 380;BA.debugLine="Dim XValue As Double = XAxis.GetValueForDisplay(A";
_xvalue = (double)(BA.ObjectToNumber(_xaxis.GetValueForDisplay((double)(BA.ObjectToNumber(_axiscoord.X)))));
 //BA.debugLineNum = 383;BA.debugLine="Dim NearestXY As XYCoord = CurrentSeries.FindNear";
_nearestxy = _currentseries.FindNearestX(_xvalue);
 //BA.debugLineNum = 384;BA.debugLine="If NearestXY = Null Then Return";
if (_nearestxy== null) { 
if (true) return "";};
 //BA.debugLineNum = 387;BA.debugLine="Dim YAxis As NumberAxis = LineChart.YAxis";
_yaxis = new flm.b4j.charts.b4jNumberAxis();
_yaxis = (flm.b4j.charts.b4jNumberAxis) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new flm.b4j.charts.b4jNumberAxis(), (javafx.scene.chart.Axis)(_linechart.getYAxis()));
 //BA.debugLineNum = 388;BA.debugLine="Dim X As Double = XAxis.GetDisplayPosition(Neares";
_x = _xaxis.GetDisplayPosition((java.lang.Number)(_nearestxy.X));
 //BA.debugLineNum = 389;BA.debugLine="Dim Y As Double = YAxis.GetDisplayPosition(Neares";
_y = _yaxis.GetDisplayPosition((java.lang.Number)(_nearestxy.Y));
 //BA.debugLineNum = 392;BA.debugLine="ChartCanvas.ClearRect(0, 0, ChartCanvas.Width, Ch";
_chartcanvas.ClearRect(0,0,_chartcanvas.getWidth(),_chartcanvas.getHeight());
 //BA.debugLineNum = 393;BA.debugLine="ChartCanvas.DrawLine(X, 0, X, ChartCanvas.Height,";
_chartcanvas.DrawLine(_x,0,_x,_chartcanvas.getHeight(),(javafx.scene.paint.Paint)(__c.Null),1);
 //BA.debugLineNum = 396;BA.debugLine="ChartCanvas.DrawCircle(X, Y, 6, fx.Colors.Red, Fa";
_chartcanvas.DrawCircle(_x,_y,6,_fx.Colors.Red,__c.False,3);
 //BA.debugLineNum = 397;BA.debugLine="ChartCanvas.DrawText(\"X=\" & NumberFormat(NearestX";
_chartcanvas.DrawText("X="+__c.NumberFormat((double)(BA.ObjectToNumber(_nearestxy.X)),(int) (1),(int) (7))+__c.CRLF+"Y="+__c.NumberFormat((double)(BA.ObjectToNumber(_nearestxy.Y)),(int) (1),(int) (7)),_x+10,_y-4,(javafx.scene.text.Font)(_fx.DefaultFont(12).getObject()),_fx.Colors.Black,BA.getEnumFromString(javafx.scene.text.TextAlignment.class,"LEFT"));
 //BA.debugLineNum = 398;BA.debugLine="End Sub";
return "";
}
public void  _llenar_excel() throws Exception{
ResumableSub_LLenar_Excel rsub = new ResumableSub_LLenar_Excel(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LLenar_Excel extends BA.ResumableSub {
public ResumableSub_LLenar_Excel(japam.sie.b4xgrafica parent) {
this.parent = parent;
}
japam.sie.b4xgrafica parent;
String _mnombre = "";
String _mnombre_2 = "";
String _mnombre_pdf = "";
japam.sie.xlworkbookwriter _libro = null;
japam.sie.xlsheetwriter _hoja = null;
japam.sie.xlstyle _color_fondo = null;
japam.sie.xlstyle _estilo_moneda = null;
japam.sie.xlstyle _estilo_monto = null;
japam.sie.xlstyle _estilo = null;
String _f = "";
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 240;BA.debugLine="xl.Initialize";
parent._xl._initialize /*String*/ (ba);
 //BA.debugLineNum = 241;BA.debugLine="Dim mNOMBRE, mNOMBRE_2, mNOMBRE_PDF As String";
_mnombre = "";
_mnombre_2 = "";
_mnombre_pdf = "";
 //BA.debugLineNum = 242;BA.debugLine="Dim Libro As XLWorkbookWriter";
_libro = new japam.sie.xlworkbookwriter();
 //BA.debugLineNum = 243;BA.debugLine="Dim Hoja As XLSheetWriter";
_hoja = new japam.sie.xlsheetwriter();
 //BA.debugLineNum = 244;BA.debugLine="Dim Color_Fondo As XLStyle";
_color_fondo = new japam.sie.xlstyle();
 //BA.debugLineNum = 245;BA.debugLine="Dim Estilo_Moneda As XLStyle";
_estilo_moneda = new japam.sie.xlstyle();
 //BA.debugLineNum = 246;BA.debugLine="Dim Estilo_Monto As XLStyle";
_estilo_monto = new japam.sie.xlstyle();
 //BA.debugLineNum = 247;BA.debugLine="Dim Estilo As XLStyle";
_estilo = new japam.sie.xlstyle();
 //BA.debugLineNum = 250;BA.debugLine="If Main.mmes < 10 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._main._mmes /*int*/ <10) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 251;BA.debugLine="mNOMBRE = \"\\GRAFICAS\\SIE_G_\" & mCLAVES(CB_Indica";
_mnombre = "\\GRAFICAS\\SIE_G_"+parent._mclaves[parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().IndexOf(parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())]+"_"+BA.NumberToString(parent._main._manio /*int*/ )+"_0"+BA.NumberToString(parent._main._mmes /*int*/ )+".xlsx";
 //BA.debugLineNum = 252;BA.debugLine="mNOMBRE_2 = \"\\GRAFICAS\\SIE_G_\" & mCLAVES(CB_Indi";
_mnombre_2 = "\\GRAFICAS\\SIE_G_"+parent._mclaves[parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().IndexOf(parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())]+"_"+BA.NumberToString(parent._main._manio /*int*/ )+"_0"+BA.NumberToString(parent._main._mmes /*int*/ );
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 254;BA.debugLine="mNOMBRE = \"\\GRAFICAS\\SIE_G_\" & mCLAVES(CB_Indica";
_mnombre = "\\GRAFICAS\\SIE_G_"+parent._mclaves[parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().IndexOf(parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())]+"_"+BA.NumberToString(parent._main._manio /*int*/ )+"_"+BA.NumberToString(parent._main._mmes /*int*/ )+".xlsx";
 //BA.debugLineNum = 255;BA.debugLine="mNOMBRE_2 = \"\\GRAFICAS\\SIE_G_\" & mCLAVES(CB_Indi";
_mnombre_2 = "\\GRAFICAS\\SIE_G_"+parent._mclaves[parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getItems().IndexOf(parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue())]+"_"+BA.NumberToString(parent._main._manio /*int*/ )+"_"+BA.NumberToString(parent._main._mmes /*int*/ );
 if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 257;BA.debugLine="Libro = xl.CreateWriterFromTemplate(File.DirAsset";
_libro = parent._xl._createwriterfromtemplate /*japam.sie.xlworkbookwriter*/ (parent.__c.File.getDirAssets(),"Grafica.xlsx");
 //BA.debugLineNum = 258;BA.debugLine="Hoja = Libro.CreateSheetWriterByName(\"Grafica\")";
_hoja = _libro._createsheetwriterbyname /*japam.sie.xlsheetwriter*/ ("Grafica");
 //BA.debugLineNum = 259;BA.debugLine="Estilo_Moneda = Libro.CreateStyle.DataFormat(\"$#,";
_estilo_moneda = _libro._createstyle /*japam.sie.xlstyle*/ ()._dataformat /*japam.sie.xlstyle*/ ("$#,##0.0");
 //BA.debugLineNum = 260;BA.debugLine="Estilo_Monto = Libro.CreateStyle.DataFormat(\"#,##";
_estilo_monto = _libro._createstyle /*japam.sie.xlstyle*/ ()._dataformat /*japam.sie.xlstyle*/ ("#,##0");
 //BA.debugLineNum = 262;BA.debugLine="mINDICADOR = CB_Indicador.cmbBox.value";
parent._mindicador = BA.ObjectToString(parent._cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 //BA.debugLineNum = 263;BA.debugLine="If mINDICADOR.Contains(\"$\") Then";
if (true) break;

case 7:
//if
this.state = 12;
if (parent._mindicador.contains("$")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 264;BA.debugLine="Estilo = Estilo_Moneda";
_estilo = _estilo_moneda;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 266;BA.debugLine="Estilo = Estilo_Monto";
_estilo = _estilo_monto;
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 268;BA.debugLine="Hoja.PutString(xl.AddressName(\"A4\"), mINDICADOR)";
_hoja._putstring /*japam.sie.xlsheetwriter*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("A4"),parent._mindicador);
 //BA.debugLineNum = 269;BA.debugLine="Color_Fondo = Libro.CreateStyle.ForegroundColor(x";
_color_fondo = _libro._createstyle /*japam.sie.xlstyle*/ ()._foregroundcolor /*japam.sie.xlstyle*/ (parent._xl._color_green /*short*/ );
 //BA.debugLineNum = 270;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"B\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("B",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 271;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"C\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("C",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 272;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"D\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("D",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 273;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"E\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("E",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 274;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"F\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("F",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 275;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"G\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("G",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 276;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"H\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("H",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 277;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"I\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("I",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 278;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"J\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("J",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 279;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"K\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("K",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 280;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"L\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("L",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 281;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"M\", 32), mMAXIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("M",(int) (32)),(double)(Double.parseDouble(parent._mmaximos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 283;BA.debugLine="Color_Fondo = Libro.CreateStyle.ForegroundColor(x";
_color_fondo = _libro._createstyle /*japam.sie.xlstyle*/ ()._foregroundcolor /*japam.sie.xlstyle*/ (parent._xl._color_orange /*short*/ );
 //BA.debugLineNum = 284;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"B\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("B",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 285;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"C\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("C",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 286;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"D\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("D",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 287;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"E\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("E",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 288;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"F\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("F",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 289;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"G\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("G",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 290;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"H\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("H",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 291;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"I\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("I",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 292;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"J\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("J",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 293;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"K\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("K",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 294;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"L\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("L",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 295;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"M\", 33), mMETAS(0))";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("M",(int) (33)),(double)(Double.parseDouble(parent._mmetas[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 297;BA.debugLine="Color_Fondo = Libro.CreateStyle.ForegroundColor(x";
_color_fondo = _libro._createstyle /*japam.sie.xlstyle*/ ()._foregroundcolor /*japam.sie.xlstyle*/ (parent._xl._color_blue /*short*/ );
 //BA.debugLineNum = 298;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"B\", 34), mVALORES(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("B",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 299;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"C\", 34), mVALORES(1";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("C",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (1)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 300;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"D\", 34), mVALORES(2";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("D",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (2)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 301;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"E\", 34), mVALORES(3";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("E",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (3)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 302;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"F\", 34), mVALORES(4";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("F",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (4)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 303;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"G\", 34), mVALORES(5";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("G",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (5)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 304;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"H\", 34), mVALORES(6";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("H",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (6)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 305;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"I\", 34), mVALORES(7";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("I",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (7)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 306;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"J\", 34), mVALORES(8";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("J",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (8)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 307;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"K\", 34), mVALORES(9";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("K",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (9)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 308;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"L\", 34), mVALORES(1";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("L",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (10)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 309;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"M\", 34), mVALORES(1";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("M",(int) (34)),(double)(Double.parseDouble(parent._mvalores[(int) (11)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 311;BA.debugLine="Color_Fondo = Libro.CreateStyle.ForegroundColor(x";
_color_fondo = _libro._createstyle /*japam.sie.xlstyle*/ ()._foregroundcolor /*japam.sie.xlstyle*/ (parent._xl._color_red /*short*/ );
 //BA.debugLineNum = 312;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"B\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("B",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 313;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"C\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("C",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 314;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"D\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("D",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 315;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"E\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("E",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 316;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"F\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("F",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 317;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"G\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("G",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 318;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"H\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("H",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 319;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"I\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("I",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 320;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"J\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("J",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 321;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"K\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("K",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 322;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"L\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("L",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 323;BA.debugLine="Hoja.PutNumber(xl.AddressOne(\"M\", 35), mMINIMOS(0";
_hoja._putnumber /*japam.sie.xlsheetwriter*/ (parent._xl._addressone /*japam.sie.xlutils._xladdress*/ ("M",(int) (35)),(double)(Double.parseDouble(parent._mminimos[(int) (0)])))._setstyles /*japam.sie.xlsheetwriter*/ (_hoja._lastaccessed /*japam.sie.xlutils._xladdress*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_estilo),(Object)(_color_fondo)}));
 //BA.debugLineNum = 325;BA.debugLine="Hoja.AddStylesToRange(xl.CreateXLRange(xl.Address";
_hoja._addstylestorange /*japam.sie.xlsheetwriter*/ (parent._xl._createxlrange /*japam.sie.xlutils._xlrange*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("B32"),parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("M35")),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_libro._createstyle /*japam.sie.xlstyle*/ ()._bordertop /*japam.sie.xlstyle*/ ("THIN"))}));
 //BA.debugLineNum = 326;BA.debugLine="Hoja.AddStylesToRange(xl.CreateXLRange(xl.Address";
_hoja._addstylestorange /*japam.sie.xlsheetwriter*/ (parent._xl._createxlrange /*japam.sie.xlutils._xlrange*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("B32"),parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("M35")),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_libro._createstyle /*japam.sie.xlstyle*/ ()._borderright /*japam.sie.xlstyle*/ ("THIN"))}));
 //BA.debugLineNum = 327;BA.debugLine="Hoja.AddStylesToRange(xl.CreateXLRange(xl.Address";
_hoja._addstylestorange /*japam.sie.xlsheetwriter*/ (parent._xl._createxlrange /*japam.sie.xlutils._xlrange*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("B32"),parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("M35")),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_libro._createstyle /*japam.sie.xlstyle*/ ()._borderbottom /*japam.sie.xlstyle*/ ("THIN"))}));
 //BA.debugLineNum = 328;BA.debugLine="Hoja.AddStylesToRange(xl.CreateXLRange(xl.Address";
_hoja._addstylestorange /*japam.sie.xlsheetwriter*/ (parent._xl._createxlrange /*japam.sie.xlutils._xlrange*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("B32"),parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("M35")),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_libro._createstyle /*japam.sie.xlstyle*/ ()._borderleft /*japam.sie.xlstyle*/ ("THIN"))}));
 //BA.debugLineNum = 329;BA.debugLine="Hoja.AddStylesToRange(xl.CreateXLRange(xl.Address";
_hoja._addstylestorange /*japam.sie.xlsheetwriter*/ (parent._xl._createxlrange /*japam.sie.xlutils._xlrange*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("B32"),parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("M35")),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_libro._createstyle /*japam.sie.xlstyle*/ ()._horizontalalignment /*japam.sie.xlstyle*/ ("CENTER"))}));
 //BA.debugLineNum = 330;BA.debugLine="Hoja.AddStylesToRange(xl.CreateXLRange(xl.Address";
_hoja._addstylestorange /*japam.sie.xlsheetwriter*/ (parent._xl._createxlrange /*japam.sie.xlutils._xlrange*/ (parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("B32"),parent._xl._addressname /*japam.sie.xlutils._xladdress*/ ("M35")),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_libro._createstyle /*japam.sie.xlstyle*/ ()._verticalalignment /*japam.sie.xlstyle*/ ("CENTER"))}));
 //BA.debugLineNum = 332;BA.debugLine="L_Mensajes.Text = \"Guardando PDF...\"";
parent._l_mensajes.setText("Guardando PDF...");
 //BA.debugLineNum = 333;BA.debugLine="Dim f As String = Libro.SaveAs(File.DirApp, mNOMB";
_f = _libro._saveas /*String*/ (parent.__c.File.getDirApp(),_mnombre,parent.__c.True);
 //BA.debugLineNum = 334;BA.debugLine="mNOMBRE_PDF = File.DirApp & \"\\\" & mNOMBRE_2 & \".p";
_mnombre_pdf = parent.__c.File.getDirApp()+"\\"+_mnombre_2+".pdf";
 //BA.debugLineNum = 335;BA.debugLine="Libro.RemoveSheetAt(0)";
_libro._removesheetat /*String*/ ((int) (0));
 //BA.debugLineNum = 336;BA.debugLine="L_Mensajes.Text = \"Abriendo PDF...\"";
parent._l_mensajes.setText("Abriendo PDF...");
 //BA.debugLineNum = 337;BA.debugLine="Wait For (xl.PowerShellConvertToPdf(f, mNOMBRE_PD";
parent.__c.WaitFor("complete", ba, this, parent._xl._powershellconverttopdf /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_f,_mnombre_pdf,(int) (0),parent.__c.True));
this.state = 13;
return;
case 13:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 338;BA.debugLine="L_Mensajes.Text = \"\"";
parent._l_mensajes.setText("");
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _success) throws Exception{
}
public String  _llenar_excel_xls() throws Exception{
int _x = 0;
anywheresoftware.b4a.objects.WorkbookWrapper _exceltemplate = null;
anywheresoftware.b4a.objects.WorkbookWrapper.WritableWorkbookWrapper _newworkbook = null;
anywheresoftware.b4a.objects.WorkbookWrapper.AbsSheetWrapper.WritableSheetWrapper _worksheet = null;
anywheresoftware.b4a.objects.WorkbookWrapper.AbsSheetWrapper.WritableCellWrapper _cell = null;
 //BA.debugLineNum = 341;BA.debugLine="Sub LLenar_Excel_XLS()";
 //BA.debugLineNum = 342;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 343;BA.debugLine="Dim ExcelTemplate As ReadableWorkbook";
_exceltemplate = new anywheresoftware.b4a.objects.WorkbookWrapper();
 //BA.debugLineNum = 344;BA.debugLine="Dim NewWorkbook As WritableWorkbook";
_newworkbook = new anywheresoftware.b4a.objects.WorkbookWrapper.WritableWorkbookWrapper();
 //BA.debugLineNum = 345;BA.debugLine="Dim Worksheet As WritableSheet";
_worksheet = new anywheresoftware.b4a.objects.WorkbookWrapper.AbsSheetWrapper.WritableSheetWrapper();
 //BA.debugLineNum = 346;BA.debugLine="Dim Cell As WritableCell";
_cell = new anywheresoftware.b4a.objects.WorkbookWrapper.AbsSheetWrapper.WritableCellWrapper();
 //BA.debugLineNum = 348;BA.debugLine="mINDICADOR = CB_Indicador.cmbBox.value";
_mindicador = BA.ObjectToString(_cb_indicador._cmbbox /*anywheresoftware.b4j.objects.ComboBoxWrapper*/ .getValue());
 //BA.debugLineNum = 349;BA.debugLine="ExcelTemplate.Initialize(File.DirAssets, \"Grafica";
_exceltemplate.Initialize(__c.File.getDirAssets(),"Grafica.xls");
 //BA.debugLineNum = 350;BA.debugLine="NewWorkbook.Initialize2(File.DirApp, \"Grafica.xls";
_newworkbook.Initialize2(__c.File.getDirApp(),"Grafica.xls",(jxl.Workbook)(_exceltemplate.getObject()));
 //BA.debugLineNum = 351;BA.debugLine="Worksheet = NewWorkbook.AddSheet(\"Datos\", 1)";
_worksheet = _newworkbook.AddSheet("Datos",(int) (1));
 //BA.debugLineNum = 352;BA.debugLine="Cell.InitializeText(0, 0, mINDICADOR)";
_cell.InitializeText((int) (0),(int) (0),_mindicador);
 //BA.debugLineNum = 353;BA.debugLine="Worksheet.AddCell(Cell)";
_worksheet.AddCell((jxl.write.WritableCell)(_cell.getObject()));
 //BA.debugLineNum = 354;BA.debugLine="For x = 0 To 11";
{
final int step12 = 1;
final int limit12 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
 //BA.debugLineNum = 355;BA.debugLine="Cell.InitializeNumber(x, 1, mMAXIMOS(0).As(Doubl";
_cell.InitializeNumber(_x,(int) (1),((double)(Double.parseDouble(_mmaximos[(int) (0)]))));
 //BA.debugLineNum = 356;BA.debugLine="Worksheet.AddCell(Cell)";
_worksheet.AddCell((jxl.write.WritableCell)(_cell.getObject()));
 //BA.debugLineNum = 357;BA.debugLine="Cell.InitializeNumber(x, 2, mMETAS(0).As(Double)";
_cell.InitializeNumber(_x,(int) (2),((double)(Double.parseDouble(_mmetas[(int) (0)]))));
 //BA.debugLineNum = 358;BA.debugLine="Worksheet.AddCell(Cell)";
_worksheet.AddCell((jxl.write.WritableCell)(_cell.getObject()));
 //BA.debugLineNum = 359;BA.debugLine="Cell.InitializeNumber(x, 3, mVALORES(x).As(Doubl";
_cell.InitializeNumber(_x,(int) (3),((double)(Double.parseDouble(_mvalores[_x]))));
 //BA.debugLineNum = 360;BA.debugLine="Worksheet.AddCell(Cell)";
_worksheet.AddCell((jxl.write.WritableCell)(_cell.getObject()));
 //BA.debugLineNum = 361;BA.debugLine="Cell.InitializeNumber(x, 4, mMINIMOS(0).As(Doubl";
_cell.InitializeNumber(_x,(int) (4),((double)(Double.parseDouble(_mminimos[(int) (0)]))));
 //BA.debugLineNum = 362;BA.debugLine="Worksheet.AddCell(Cell)";
_worksheet.AddCell((jxl.write.WritableCell)(_cell.getObject()));
 }
};
 //BA.debugLineNum = 364;BA.debugLine="NewWorkbook.Write";
_newworkbook.Write();
 //BA.debugLineNum = 365;BA.debugLine="NewWorkbook.Close";
_newworkbook.Close();
 //BA.debugLineNum = 366;BA.debugLine="ExcelTemplate.Close";
_exceltemplate.Close();
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _llenar_series() throws Exception{
int _x = 0;
flm.b4j.charts.b4jNumberAxis _xaxisl = null;
flm.b4j.charts.b4jNumberAxis _yaxisl = null;
anywheresoftware.b4a.objects.collections.Map _color_1 = null;
anywheresoftware.b4a.objects.collections.Map _color_2 = null;
anywheresoftware.b4a.objects.collections.Map _color_3 = null;
anywheresoftware.b4a.objects.collections.Map _color_4 = null;
 //BA.debugLineNum = 173;BA.debugLine="Sub LLenar_Series()";
 //BA.debugLineNum = 174;BA.debugLine="Dim x As Int";
_x = 0;
 //BA.debugLineNum = 175;BA.debugLine="Dim XAxisL As NumberAxis = LineChart.XAxis";
_xaxisl = new flm.b4j.charts.b4jNumberAxis();
_xaxisl = (flm.b4j.charts.b4jNumberAxis) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new flm.b4j.charts.b4jNumberAxis(), (javafx.scene.chart.Axis)(_linechart.getXAxis()));
 //BA.debugLineNum = 176;BA.debugLine="Dim YAxisL As NumberAxis = LineChart.YAxis";
_yaxisl = new flm.b4j.charts.b4jNumberAxis();
_yaxisl = (flm.b4j.charts.b4jNumberAxis) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new flm.b4j.charts.b4jNumberAxis(), (javafx.scene.chart.Axis)(_linechart.getYAxis()));
 //BA.debugLineNum = 178;BA.debugLine="XAxisL.Label = \"Mes\"";
_xaxisl.setLabel("Mes");
 //BA.debugLineNum = 179;BA.debugLine="XAxisL.LowerBound = 1";
_xaxisl.setLowerBound(1);
 //BA.debugLineNum = 180;BA.debugLine="XAxisL.UpperBound = 12";
_xaxisl.setUpperBound(12);
 //BA.debugLineNum = 181;BA.debugLine="YAxisL.Label = \"Valor\"";
_yaxisl.setLabel("Valor");
 //BA.debugLineNum = 182;BA.debugLine="YAxisL.LowerBound = mMINIMOS(0).As(Int) - 5";
_yaxisl.setLowerBound(((int)(Double.parseDouble(_mminimos[(int) (0)])))-5);
 //BA.debugLineNum = 183;BA.debugLine="YAxisL.UpperBound = mMAXIMOS(0).As(Int) + 5";
_yaxisl.setUpperBound(((int)(Double.parseDouble(_mmaximos[(int) (0)])))+5);
 //BA.debugLineNum = 184;BA.debugLine="LineChart.RemoveAllSeries";
_linechart.RemoveAllSeries();
 //BA.debugLineNum = 185;BA.debugLine="Serie_1.Initialize(\"Valor\")";
_serie_1.Initialize("Valor");
 //BA.debugLineNum = 186;BA.debugLine="Serie_1.Clear";
_serie_1.Clear();
 //BA.debugLineNum = 187;BA.debugLine="For x = 0 To 11";
{
final int step13 = 1;
final int limit13 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit13 ;_x = _x + step13 ) {
 //BA.debugLineNum = 188;BA.debugLine="If mVALORES(x) = \"\" Then";
if ((_mvalores[_x]).equals("")) { 
 //BA.debugLineNum = 189;BA.debugLine="Serie_1.Add(mMESES(x).As(Int), 0)";
_serie_1.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(0));
 }else {
 //BA.debugLineNum = 191;BA.debugLine="Serie_1.Add(mMESES(x).As(Int), mVALORES(x).As(I";
_serie_1.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(((int)(Double.parseDouble(_mvalores[_x])))));
 };
 }
};
 //BA.debugLineNum = 194;BA.debugLine="Serie_2.Initialize(\"Minimo\")";
_serie_2.Initialize("Minimo");
 //BA.debugLineNum = 195;BA.debugLine="Serie_2.Clear";
_serie_2.Clear();
 //BA.debugLineNum = 196;BA.debugLine="For x = 0 To 11";
{
final int step22 = 1;
final int limit22 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit22 ;_x = _x + step22 ) {
 //BA.debugLineNum = 197;BA.debugLine="If mVALORES(x) = \"\" Then";
if ((_mvalores[_x]).equals("")) { 
 //BA.debugLineNum = 198;BA.debugLine="Serie_2.Add(mMESES(x).As(Int), 0)";
_serie_2.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(0));
 }else {
 //BA.debugLineNum = 200;BA.debugLine="Serie_2.Add(mMESES(x).As(Int) , mMINIMOS(x).As(";
_serie_2.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(((int)(Double.parseDouble(_mminimos[_x])))));
 };
 }
};
 //BA.debugLineNum = 203;BA.debugLine="Serie_3.Initialize(\"Máximo\")";
_serie_3.Initialize("Máximo");
 //BA.debugLineNum = 204;BA.debugLine="For x = 0 To 11";
{
final int step30 = 1;
final int limit30 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit30 ;_x = _x + step30 ) {
 //BA.debugLineNum = 205;BA.debugLine="If mMAXIMOS(x) = \"\" Then";
if ((_mmaximos[_x]).equals("")) { 
 //BA.debugLineNum = 206;BA.debugLine="Serie_3.Add(mMESES(x).As(Int), 0)";
_serie_3.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(0));
 }else {
 //BA.debugLineNum = 208;BA.debugLine="Serie_3.Add(mMESES(x).As(Int), mMAXIMOS(x).As(I";
_serie_3.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(((int)(Double.parseDouble(_mmaximos[_x])))));
 };
 }
};
 //BA.debugLineNum = 211;BA.debugLine="Serie_4.Initialize(\"Meta\")";
_serie_4.Initialize("Meta");
 //BA.debugLineNum = 212;BA.debugLine="For x = 0 To 11";
{
final int step38 = 1;
final int limit38 = (int) (11);
_x = (int) (0) ;
for (;_x <= limit38 ;_x = _x + step38 ) {
 //BA.debugLineNum = 213;BA.debugLine="If mMETAS(x) = \"\" Then";
if ((_mmetas[_x]).equals("")) { 
 //BA.debugLineNum = 214;BA.debugLine="Serie_4.Add(mMESES(x).As(Int), 0)";
_serie_4.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(0));
 }else {
 //BA.debugLineNum = 216;BA.debugLine="Serie_4.Add(mMESES(x).As(Int), mMETAS(x).As(Int";
_serie_4.Add((Object)(((int)(Double.parseDouble(_mmeses[_x])))),(Object)(((int)(Double.parseDouble(_mmetas[_x])))));
 };
 }
};
 //BA.debugLineNum = 219;BA.debugLine="LineChart.AddAllSeries(Array As XYSeries(Serie_1,";
_linechart.AddAllSeries(new flm.b4j.charts.b4jXYSeries[]{_serie_1,_serie_2,_serie_3,_serie_4});
 //BA.debugLineNum = 221;BA.debugLine="Dim Color_1 As Map = LineChart.GetChildStyleMap(\"";
_color_1 = new anywheresoftware.b4a.objects.collections.Map();
_color_1 = _linechart.GetChildStyleMap(".default-color0.chart-series-line");
 //BA.debugLineNum = 222;BA.debugLine="Color_1.Put(\"-fx-stroke\", \"blue\")";
_color_1.Put((Object)("-fx-stroke"),(Object)("blue"));
 //BA.debugLineNum = 223;BA.debugLine="LineChart.SetChildStyleMap(\".default-color0.chart";
_linechart.SetChildStyleMap(".default-color0.chart-series-line",_color_1);
 //BA.debugLineNum = 224;BA.debugLine="Dim Color_2 As Map = LineChart.GetChildStyleMap(\"";
_color_2 = new anywheresoftware.b4a.objects.collections.Map();
_color_2 = _linechart.GetChildStyleMap(".default-color1.chart-series-line");
 //BA.debugLineNum = 225;BA.debugLine="Color_2.Put(\"-fx-stroke\", \"red\")";
_color_2.Put((Object)("-fx-stroke"),(Object)("red"));
 //BA.debugLineNum = 226;BA.debugLine="LineChart.SetChildStyleMap(\".default-color1.chart";
_linechart.SetChildStyleMap(".default-color1.chart-series-line",_color_2);
 //BA.debugLineNum = 227;BA.debugLine="Dim Color_3 As Map = LineChart.GetChildStyleMap(\"";
_color_3 = new anywheresoftware.b4a.objects.collections.Map();
_color_3 = _linechart.GetChildStyleMap(".default-color2.chart-series-line");
 //BA.debugLineNum = 228;BA.debugLine="Color_3.Put(\"-fx-stroke\", \"green\")";
_color_3.Put((Object)("-fx-stroke"),(Object)("green"));
 //BA.debugLineNum = 229;BA.debugLine="LineChart.SetChildStyleMap(\".default-color2.chart";
_linechart.SetChildStyleMap(".default-color2.chart-series-line",_color_3);
 //BA.debugLineNum = 230;BA.debugLine="Dim Color_4 As Map = LineChart.GetChildStyleMap(\"";
_color_4 = new anywheresoftware.b4a.objects.collections.Map();
_color_4 = _linechart.GetChildStyleMap(".default-color3.chart-series-line");
 //BA.debugLineNum = 231;BA.debugLine="Color_4.Put(\"-fx-stroke\", \"orange\")";
_color_4.Put((Object)("-fx-stroke"),(Object)("orange"));
 //BA.debugLineNum = 232;BA.debugLine="LineChart.SetChildStyleMap(\".default-color3.chart";
_linechart.SetChildStyleMap(".default-color3.chart-series-line",_color_4);
 //BA.debugLineNum = 237;BA.debugLine="End Sub";
return "";
}
public String  _yaxisl_tostring(Object _nbr) throws Exception{
int _intnbr = 0;
 //BA.debugLineNum = 412;BA.debugLine="Sub YAxisL_ToString(Nbr As Object) As String";
 //BA.debugLineNum = 413;BA.debugLine="Dim IntNbr As Int = Nbr";
_intnbr = (int)(BA.ObjectToNumber(_nbr));
 //BA.debugLineNum = 415;BA.debugLine="Return IntNbr & \" m\"";
if (true) return BA.NumberToString(_intnbr)+" m";
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
