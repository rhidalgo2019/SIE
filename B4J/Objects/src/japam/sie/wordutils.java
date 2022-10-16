package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class wordutils extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.wordutils", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.wordutils.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public japam.sie.xlutils _xl = null;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Public xl As XLUtils";
_xl = new japam.sie.xlutils();
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public japam.sie.worddocument  _createdocument() throws Exception{
anywheresoftware.b4j.object.JavaObject _doc = null;
japam.sie.worddocument _wd = null;
 //BA.debugLineNum = 10;BA.debugLine="Public Sub CreateDocument As WordDocument";
 //BA.debugLineNum = 11;BA.debugLine="Dim doc As JavaObject";
_doc = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 12;BA.debugLine="doc.InitializeNewInstance(\"org.apache.poi.xwpf.us";
_doc.InitializeNewInstance("org.apache.poi.xwpf.usermodel.XWPFDocument",(Object[])(__c.Null));
 //BA.debugLineNum = 13;BA.debugLine="Dim wd As WordDocument";
_wd = new japam.sie.worddocument();
 //BA.debugLineNum = 14;BA.debugLine="wd.Initialize(Me, doc)";
_wd._initialize /*String*/ (ba,(japam.sie.wordutils)(this),_doc);
 //BA.debugLineNum = 15;BA.debugLine="Return wd";
if (true) return _wd;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 6;BA.debugLine="xl.Initialize";
_xl._initialize /*String*/ (ba);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _openword(String _filepath) throws Exception{
ResumableSub_OpenWord rsub = new ResumableSub_OpenWord(this,_filepath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_OpenWord extends BA.ResumableSub {
public ResumableSub_OpenWord(japam.sie.wordutils parent,String _filepath) {
this.parent = parent;
this._filepath = _filepath;
}
japam.sie.wordutils parent;
String _filepath;
boolean _success = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 22;BA.debugLine="Wait For (xl.OpenExcel(FilePath)) Complete (Succe";
parent.__c.WaitFor("complete", ba, this, parent._xl._openexcel /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_filepath));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_success = (boolean) result[0];
;
 //BA.debugLineNum = 23;BA.debugLine="Return Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_success));return;};
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _success) throws Exception{
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _powershellconverttopdf(String _inputfile,String _outputfile,boolean _openpdf) throws Exception{
ResumableSub_PowerShellConvertToPdf rsub = new ResumableSub_PowerShellConvertToPdf(this,_inputfile,_outputfile,_openpdf);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_PowerShellConvertToPdf extends BA.ResumableSub {
public ResumableSub_PowerShellConvertToPdf(japam.sie.wordutils parent,String _inputfile,String _outputfile,boolean _openpdf) {
this.parent = parent;
this._inputfile = _inputfile;
this._outputfile = _outputfile;
this._openpdf = _openpdf;
}
japam.sie.wordutils parent;
String _inputfile;
String _outputfile;
boolean _openpdf;
String _s = "";
anywheresoftware.b4j.objects.Shell.ShellSyncResult _result = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 29;BA.debugLine="File.Delete(OutputFile, \"\")";
parent.__c.File.Delete(_outputfile,"");
 //BA.debugLineNum = 30;BA.debugLine="If File.Exists(OutputFile, \"\") Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.__c.File.Exists(_outputfile,"")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 31;BA.debugLine="Log(\"Cannot delete output file\")";
parent.__c.LogImpl("944957699","Cannot delete output file",0);
 //BA.debugLineNum = 32;BA.debugLine="Return False";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 35;BA.debugLine="Dim s As String = $\" 	& {$objWord = New-Object -C";
_s = ("\n"+"	& {$objWord = New-Object -ComObject word.application\n"+"$document  = $objWord.Documents.open('"+parent.__c.SmartStringFormatter("",(Object)(_inputfile))+"')\n"+"  $document.SaveAs([ref] '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"', [ref] 17)\n"+"    $document.Close()\n"+"$objWord.Quit()}");
 //BA.debugLineNum = 41;BA.debugLine="Wait For (xl.PowerShellScript(s)) Complete (Resul";
parent.__c.WaitFor("complete", ba, this, parent._xl._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_s));
this.state = 15;
return;
case 15:
//C
this.state = 5;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[0];
;
 //BA.debugLineNum = 42;BA.debugLine="If Result.ExitCode <> 0 Then Return False";
if (true) break;

case 5:
//if
this.state = 10;
if (_result.ExitCode!=0) { 
this.state = 7;
;}if (true) break;

case 7:
//C
this.state = 10;
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.False));return;};
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 43;BA.debugLine="If OpenPdf Then";
if (true) break;

case 11:
//if
this.state = 14;
if (_openpdf) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 44;BA.debugLine="Wait For (xl.PowerShellScript($\"& {Invoke-Item '";
parent.__c.WaitFor("complete", ba, this, parent._xl._powershellscript /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (("& {Invoke-Item '"+parent.__c.SmartStringFormatter("",(Object)(_outputfile))+"'}")));
this.state = 16;
return;
case 16:
//C
this.state = 14;
_result = (anywheresoftware.b4j.objects.Shell.ShellSyncResult) result[0];
;
 //BA.debugLineNum = 45;BA.debugLine="Return Result.ExitCode = 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_result.ExitCode==0));return;};
 if (true) break;

case 14:
//C
this.state = -1;
;
 //BA.debugLineNum = 47;BA.debugLine="Return True";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(parent.__c.True));return;};
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
