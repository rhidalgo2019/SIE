package japam.sie;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class b4xpagesmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("japam.sie", "japam.sie.b4xpagesmanager", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", japam.sie.b4xpagesmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public japam.sie.b4xorderedmap _idtob4xpage = null;
public japam.sie.b4xorderedmap _rootb4xtopage = null;
public japam.sie.b4xset _mstackofpageids = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4j.objects.Form _mmainform = null;
public boolean _isforeground = false;
public int _transitionanimationduration = 0;
public japam.sie.b4xmainpage _mainpage = null;
public String _stackstring = "";
public boolean _logevents = false;
public b4j.example.dateutils _dateutils = null;
public b4j.example.cssutils _cssutils = null;
public japam.sie.main _main = null;
public japam.sie.b4xpages _b4xpages = null;
public japam.sie.b4xcollections _b4xcollections = null;
public japam.sie.xuiviewsutils _xuiviewsutils = null;
public static class _b4xpageparent{
public boolean IsInitialized;
public anywheresoftware.b4j.objects.Form NativeType;
public void Initialize() {
IsInitialized = true;
NativeType = new anywheresoftware.b4j.objects.Form();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _b4xpageinfo{
public boolean IsInitialized;
public Object B4XPage;
public String Id;
public boolean Created;
public Object Title;
public anywheresoftware.b4a.objects.B4XViewWrapper Root;
public boolean IsFirst;
public japam.sie.b4xpagesmanager._b4xpageparent Parent;
public void Initialize() {
IsInitialized = true;
B4XPage = new Object();
Id = "";
Created = false;
Title = new Object();
Root = new anywheresoftware.b4a.objects.B4XViewWrapper();
IsFirst = false;
Parent = new japam.sie.b4xpagesmanager._b4xpageparent();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _activity_pause() throws Exception{
 //BA.debugLineNum = 635;BA.debugLine="Public Sub Activity_Pause";
 //BA.debugLineNum = 636;BA.debugLine="RaiseEventWithResult(GetTopPage, \"B4XPage_Disappe";
_raiseeventwithresult(_gettoppage(),"B4XPage_Disappear",(Object[])(__c.Null));
 //BA.debugLineNum = 637;BA.debugLine="BackgroundStateChanged(False)";
_backgroundstatechanged(__c.False);
 //BA.debugLineNum = 638;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume() throws Exception{
boolean _shouldraise = false;
 //BA.debugLineNum = 610;BA.debugLine="Public Sub Activity_Resume";
 //BA.debugLineNum = 611;BA.debugLine="Dim ShouldRaise As Boolean = IsForeground = False";
_shouldraise = _isforeground==__c.False;
 //BA.debugLineNum = 612;BA.debugLine="BackgroundStateChanged(True)";
_backgroundstatechanged(__c.True);
 //BA.debugLineNum = 613;BA.debugLine="If ShouldRaise Then";
if (_shouldraise) { 
 //BA.debugLineNum = 614;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
_raiseevent(_gettoppage(),"B4XPage_Appear",(Object[])(__c.Null));
 };
 //BA.debugLineNum = 616;BA.debugLine="End Sub";
return "";
}
public String  _addpage(String _id,Object _b4xpage) throws Exception{
String _idtolower = "";
 //BA.debugLineNum = 141;BA.debugLine="Public Sub AddPage (Id As String, B4XPage As Objec";
 //BA.debugLineNum = 142;BA.debugLine="Dim IdToLower As String = Id.ToLowerCase";
_idtolower = _id.toLowerCase();
 //BA.debugLineNum = 143;BA.debugLine="If IdToB4XPage.ContainsKey(IdToLower) Then";
if (_idtob4xpage._containskey /*boolean*/ ((Object)(_idtolower))) { 
 //BA.debugLineNum = 144;BA.debugLine="Log($\"Page with this id already exists: ${IdToLo";
__c.LogImpl("912517379",("Page with this id already exists: "+__c.SmartStringFormatter("",(Object)(_idtolower))+"!"),0);
 //BA.debugLineNum = 145;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 147;BA.debugLine="IdToB4XPage.Put(IdToLower, CreateB4XPageInfo(B4XP";
_idtob4xpage._put /*String*/ ((Object)(_idtolower),(Object)(_createb4xpageinfo(_b4xpage,_idtolower,__c.False,(Object)(_id))));
 //BA.debugLineNum = 148;BA.debugLine="If IdToB4XPage.Size = 1 Then ShowPage(IdToLower)";
if (_idtob4xpage._getsize /*int*/ ()==1) { 
_showpage(_idtolower);};
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return "";
}
public String  _addpageandcreate(String _id,Object _b4xpage) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub AddPageAndCreate (Id As String, B4XPage";
 //BA.debugLineNum = 152;BA.debugLine="AddPage (Id, B4XPage)";
_addpage(_id,_b4xpage);
 //BA.debugLineNum = 153;BA.debugLine="CreatePageIfNeeded(GetPageFromId(Id))";
_createpageifneeded(_getpagefromid(_id));
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public String  _backgroundstatechanged(boolean _newstate) throws Exception{
String _ev = "";
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 618;BA.debugLine="Private Sub BackgroundStateChanged (NewState As Bo";
 //BA.debugLineNum = 619;BA.debugLine="If IsForeground = NewState Then Return";
if (_isforeground==_newstate) { 
if (true) return "";};
 //BA.debugLineNum = 620;BA.debugLine="IsForeground = NewState";
_isforeground = _newstate;
 //BA.debugLineNum = 621;BA.debugLine="Dim ev As String";
_ev = "";
 //BA.debugLineNum = 622;BA.debugLine="If IsForeground Then ev = \"B4XPage_Foreground\" El";
if (_isforeground) { 
_ev = "B4XPage_Foreground";}
else {
_ev = "B4XPage_Background";};
 //BA.debugLineNum = 623;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group5 = _idtob4xpage._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_pi = (japam.sie.b4xpagesmanager._b4xpageinfo)(group5.Get(index5));
 //BA.debugLineNum = 624;BA.debugLine="If xui.SubExists(pi.B4XPage, ev, 0) Then";
if (_xui.SubExists(ba,_pi.B4XPage /*Object*/ ,_ev,(int) (0))) { 
 //BA.debugLineNum = 625;BA.debugLine="LogEvent(pi, ev)";
_logevent(_pi,_ev);
 //BA.debugLineNum = 626;BA.debugLine="If IsForeground Then";
if (_isforeground) { 
 //BA.debugLineNum = 627;BA.debugLine="CallSubDelayed(pi.B4XPage, ev)";
__c.CallSubDelayed(ba,_pi.B4XPage /*Object*/ ,_ev);
 }else {
 //BA.debugLineNum = 629;BA.debugLine="CallSub(pi.B4XPage, ev)";
__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,_ev);
 };
 };
 }
};
 //BA.debugLineNum = 633;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 23;BA.debugLine="Private IdToB4XPage As B4XOrderedMap";
_idtob4xpage = new japam.sie.b4xorderedmap();
 //BA.debugLineNum = 24;BA.debugLine="Private RootB4XToPage As B4XOrderedMap";
_rootb4xtopage = new japam.sie.b4xorderedmap();
 //BA.debugLineNum = 30;BA.debugLine="Type B4XPageParent (NativeType As Form)";
;
 //BA.debugLineNum = 34;BA.debugLine="Type B4XPageInfo (B4XPage As Object, Id As String";
;
 //BA.debugLineNum = 38;BA.debugLine="Public mStackOfPageIds As B4XSet";
_mstackofpageids = new japam.sie.b4xset();
 //BA.debugLineNum = 39;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 41;BA.debugLine="Private mMainForm As Form";
_mmainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 49;BA.debugLine="Public IsForeground As Boolean";
_isforeground = false;
 //BA.debugLineNum = 50;BA.debugLine="Public TransitionAnimationDuration As Int = 100";
_transitionanimationduration = (int) (100);
 //BA.debugLineNum = 51;BA.debugLine="Public MainPage As B4XMainPage";
_mainpage = new japam.sie.b4xmainpage();
 //BA.debugLineNum = 52;BA.debugLine="Private StackString As String";
_stackstring = "";
 //BA.debugLineNum = 53;BA.debugLine="Public LogEvents As Boolean = False";
_logevents = __c.False;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _closepage(Object _b4xpage) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
boolean _isclosingtoppage = false;
 //BA.debugLineNum = 209;BA.debugLine="Public Sub ClosePage (B4XPage As Object)";
 //BA.debugLineNum = 210;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = _findpifromb4xpage(_b4xpage);
 //BA.debugLineNum = 211;BA.debugLine="If mStackOfPageIds.Contains(pi.Id) = False Then R";
if (_mstackofpageids._contains /*boolean*/ ((Object)(_pi.Id /*String*/ ))==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 212;BA.debugLine="If xui.IsB4i And GetTopPage <> pi Then";
if (_xui.getIsB4i() && (_gettoppage()).equals(_pi) == false) { 
 //BA.debugLineNum = 213;BA.debugLine="Log(\"Only top page can be closed\")";
__c.LogImpl("912779524","Only top page can be closed",0);
 //BA.debugLineNum = 214;BA.debugLine="Return";
if (true) return "";
 }else if(_xui.getIsB4i() && _mstackofpageids._getsize /*int*/ ()==1) { 
 //BA.debugLineNum = 216;BA.debugLine="Log(\"First page cannot be closed\")";
__c.LogImpl("912779527","First page cannot be closed",0);
 //BA.debugLineNum = 217;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 219;BA.debugLine="Dim IsClosingTopPage As Boolean = GetTopPage = pi";
_isclosingtoppage = (_gettoppage()).equals(_pi);
 //BA.debugLineNum = 220;BA.debugLine="ClosePageImpl(pi)";
_closepageimpl(_pi);
 //BA.debugLineNum = 221;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
 //BA.debugLineNum = 222;BA.debugLine="TopPageDisappear";
_toppagedisappear();
 };
 //BA.debugLineNum = 224;BA.debugLine="If xui.IsB4A And mStackOfPageIds.Size = 1 Then Re";
if (_xui.getIsB4A() && _mstackofpageids._getsize /*int*/ ()==1) { 
if (true) return "";};
 //BA.debugLineNum = 225;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
_mstackofpageids._remove /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 226;BA.debugLine="If IsClosingTopPage Then";
if (_isclosingtoppage) { 
 //BA.debugLineNum = 227;BA.debugLine="If xui.IsB4A Then ShowPageImpl(GetTopPage)";
if (_xui.getIsB4A()) { 
_showpageimpl(_gettoppage());};
 //BA.debugLineNum = 228;BA.debugLine="TopPageAppear";
_toppageappear();
 };
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public String  _closepageimpl(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 315;BA.debugLine="Private Sub ClosePageImpl (pi As B4XPageInfo) 'ign";
 //BA.debugLineNum = 327;BA.debugLine="pi.Parent.NativeType.Close";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return "";
}
public boolean  _closerequestexists(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Private Sub CloseRequestExists (pi As B4XPageInfo)";
 //BA.debugLineNum = 535;BA.debugLine="Return xui.SubExists(pi.B4XPage, \"B4XPage_CloseRe";
if (true) return _xui.SubExists(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest",(int) (0));
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return false;
}
public japam.sie.b4xpagesmanager._b4xpageinfo  _createb4xpageinfo(Object _b4xpage,String _id,boolean _created,Object _title) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _t1 = null;
 //BA.debugLineNum = 420;BA.debugLine="Private Sub CreateB4XPageInfo (B4XPage As Object,";
 //BA.debugLineNum = 421;BA.debugLine="Dim t1 As B4XPageInfo";
_t1 = new japam.sie.b4xpagesmanager._b4xpageinfo();
 //BA.debugLineNum = 422;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 423;BA.debugLine="t1.B4XPage = B4XPage";
_t1.B4XPage /*Object*/  = _b4xpage;
 //BA.debugLineNum = 424;BA.debugLine="t1.Id = Id";
_t1.Id /*String*/  = _id;
 //BA.debugLineNum = 425;BA.debugLine="t1.Created = Created";
_t1.Created /*boolean*/  = _created;
 //BA.debugLineNum = 426;BA.debugLine="t1.Title = Title";
_t1.Title /*Object*/  = _title;
 //BA.debugLineNum = 427;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public japam.sie.b4xpagesmanager._b4xpageparent  _createb4xpageparent(anywheresoftware.b4j.objects.Form _nativetype) throws Exception{
japam.sie.b4xpagesmanager._b4xpageparent _t1 = null;
 //BA.debugLineNum = 600;BA.debugLine="Private Sub CreateB4XPageParent (NativeType As For";
 //BA.debugLineNum = 604;BA.debugLine="Dim t1 As B4XPageParent";
_t1 = new japam.sie.b4xpagesmanager._b4xpageparent();
 //BA.debugLineNum = 605;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 606;BA.debugLine="t1.NativeType = NativeType";
_t1.NativeType /*anywheresoftware.b4j.objects.Form*/  = _nativetype;
 //BA.debugLineNum = 607;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 608;BA.debugLine="End Sub";
return null;
}
public String  _createpageifneeded(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Private Sub CreatePageIfNeeded(pi As B4XPageInfo)";
 //BA.debugLineNum = 353;BA.debugLine="If pi.Created Then Return";
if (_pi.Created /*boolean*/ ) { 
if (true) return "";};
 //BA.debugLineNum = 354;BA.debugLine="pi.IsFirst = IdToB4XPage.Size = 1";
_pi.IsFirst /*boolean*/  = _idtob4xpage._getsize /*int*/ ()==1;
 //BA.debugLineNum = 355;BA.debugLine="CreatePageImpl (pi)";
_createpageimpl(_pi);
 //BA.debugLineNum = 356;BA.debugLine="pi.Created = True";
_pi.Created /*boolean*/  = __c.True;
 //BA.debugLineNum = 357;BA.debugLine="RootB4XToPage.Put(pi.Root, pi)";
_rootb4xtopage._put /*String*/ ((Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getObject()),(Object)(_pi));
 //BA.debugLineNum = 358;BA.debugLine="LogEvent(pi, \"B4XPage_Created\")";
_logevent(_pi,"B4XPage_Created");
 //BA.debugLineNum = 359;BA.debugLine="CallSub2(pi.B4XPage, \"B4XPage_Created\", pi.root)";
__c.CallSubNew2(ba,_pi.B4XPage /*Object*/ ,"B4XPage_Created",(Object)(_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ));
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return "";
}
public String  _createpageimpl(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
anywheresoftware.b4j.objects.Form _f = null;
 //BA.debugLineNum = 369;BA.debugLine="Private Sub CreatePageImpl (pi As B4XPageInfo)";
 //BA.debugLineNum = 371;BA.debugLine="If pi.IsFirst Then";
if (_pi.IsFirst /*boolean*/ ) { 
 //BA.debugLineNum = 372;BA.debugLine="pi.Parent = CreateB4XPageParent(mMainForm)";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/  = _createb4xpageparent(_mmainform);
 }else {
 //BA.debugLineNum = 374;BA.debugLine="Dim f As Form";
_f = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 375;BA.debugLine="f.Initialize(\"MainForm\", mMainForm.RootPane.Widt";
_f.Initialize(ba,"MainForm",_mmainform.getRootPane().getWidth(),_mmainform.getRootPane().getHeight());
 //BA.debugLineNum = 376;BA.debugLine="pi.Parent = CreateB4XPageParent(f)";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/  = _createb4xpageparent(_f);
 };
 //BA.debugLineNum = 378;BA.debugLine="pi.Root = pi.Parent.NativeType.RootPane";
_pi.Root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .getRootPane().getObject()));
 //BA.debugLineNum = 379;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return "";
}
public japam.sie.b4xpagesmanager._b4xpageinfo  _findpifromb4xpage(Object _page) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 306;BA.debugLine="Public Sub FindPIFromB4XPage (Page As Object) As B";
 //BA.debugLineNum = 307;BA.debugLine="For Each pi As B4XPageInfo In IdToB4XPage.Values";
{
final anywheresoftware.b4a.BA.IterableList group1 = _idtob4xpage._getvalues /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_pi = (japam.sie.b4xpagesmanager._b4xpageinfo)(group1.Get(index1));
 //BA.debugLineNum = 308;BA.debugLine="If pi.B4XPage = Page Then";
if ((_pi.B4XPage /*Object*/ ).equals(_page)) { 
 //BA.debugLineNum = 309;BA.debugLine="Return pi";
if (true) return _pi;
 };
 }
};
 //BA.debugLineNum = 312;BA.debugLine="Return Null";
if (true) return (japam.sie.b4xpagesmanager._b4xpageinfo)(__c.Null);
 //BA.debugLineNum = 313;BA.debugLine="End Sub";
return null;
}
public Object  _getpage(String _id) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Public Sub GetPage (Id As String) As Object";
 //BA.debugLineNum = 395;BA.debugLine="Return GetPageFromId(Id).B4XPage";
if (true) return _getpagefromid(_id).B4XPage /*Object*/ ;
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
return null;
}
public japam.sie.b4xpagesmanager._b4xpageinfo  _getpagefromid(String _id) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 398;BA.debugLine="Private Sub GetPageFromId (id As String) As B4XPag";
 //BA.debugLineNum = 399;BA.debugLine="Dim pi As B4XPageInfo = IdToB4XPage.Get(id.ToLowe";
_pi = (japam.sie.b4xpagesmanager._b4xpageinfo)(_idtob4xpage._get /*Object*/ ((Object)(_id.toLowerCase())));
 //BA.debugLineNum = 400;BA.debugLine="If pi = Null Then";
if (_pi== null) { 
 //BA.debugLineNum = 401;BA.debugLine="Log(\"Error: page id not found: \" & id)";
__c.LogImpl("913434883","Error: page id not found: "+_id,0);
 //BA.debugLineNum = 402;BA.debugLine="Log(\"Ids: \" & IdToB4XPage.Keys) 'ignore";
__c.LogImpl("913434884","Ids: "+BA.ObjectToString(_idtob4xpage._getkeys /*anywheresoftware.b4a.objects.collections.List*/ ()),0);
 };
 //BA.debugLineNum = 404;BA.debugLine="Return pi";
if (true) return _pi;
 //BA.debugLineNum = 405;BA.debugLine="End Sub";
return null;
}
public japam.sie.b4xpagesmanager._b4xpageinfo  _getpageinfofromroot(anywheresoftware.b4a.objects.B4XViewWrapper _root) throws Exception{
 //BA.debugLineNum = 407;BA.debugLine="Public Sub GetPageInfoFromRoot (Root As B4XView) A";
 //BA.debugLineNum = 408;BA.debugLine="Return RootB4XToPage.Get(Root)";
if (true) return (japam.sie.b4xpagesmanager._b4xpageinfo)(_rootb4xtopage._get /*Object*/ ((Object)(_root.getObject())));
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return null;
}
public japam.sie.b4xpagesmanager._b4xpageinfo  _gettoppage() throws Exception{
 //BA.debugLineNum = 592;BA.debugLine="Public Sub GetTopPage As B4XPageInfo";
 //BA.debugLineNum = 593;BA.debugLine="If mStackOfPageIds.Size = 0 Then Return Null";
if (_mstackofpageids._getsize /*int*/ ()==0) { 
if (true) return (japam.sie.b4xpagesmanager._b4xpageinfo)(__c.Null);};
 //BA.debugLineNum = 594;BA.debugLine="Return IdToB4XPage.Get(mStackOfPageIds.AsList.Get";
if (true) return (japam.sie.b4xpagesmanager._b4xpageinfo)(_idtob4xpage._get /*Object*/ (_mstackofpageids._aslist /*anywheresoftware.b4a.objects.collections.List*/ ().Get((int) (_mstackofpageids._getsize /*int*/ ()-1))));
 //BA.debugLineNum = 595;BA.debugLine="End Sub";
return null;
}
public void  _handlecloserequest(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
ResumableSub_HandleCloseRequest rsub = new ResumableSub_HandleCloseRequest(this,_pi);
rsub.resume(ba, null);
}
public static class ResumableSub_HandleCloseRequest extends BA.ResumableSub {
public ResumableSub_HandleCloseRequest(japam.sie.b4xpagesmanager parent,japam.sie.b4xpagesmanager._b4xpageinfo _pi) {
this.parent = parent;
this._pi = _pi;
}
japam.sie.b4xpagesmanager parent;
japam.sie.b4xpagesmanager._b4xpageinfo _pi;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
boolean _shouldclose = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 539;BA.debugLine="LogEvent(pi, \"B4XPage_CloseRequest\")";
parent._logevent(_pi,"B4XPage_CloseRequest");
 //BA.debugLineNum = 540;BA.debugLine="Dim rs As ResumableSub = CallSub(pi.B4XPage, \"B4X";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), (anywheresoftware.b4a.BA.ResumableSub)(parent.__c.CallSubNew(ba,_pi.B4XPage /*Object*/ ,"B4XPage_CloseRequest")));
 //BA.debugLineNum = 541;BA.debugLine="Wait For (rs) Complete (ShouldClose As Boolean)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_shouldclose = (boolean) result[0];
;
 //BA.debugLineNum = 542;BA.debugLine="If ShouldClose Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_shouldclose) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 543;BA.debugLine="ClosePage(pi.B4XPage)";
parent._closepage(_pi.B4XPage /*Object*/ );
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 545;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(boolean _shouldclose) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _mainform) throws Exception{
innerInitialize(_ba);
boolean _nonmainpagewasadded = false;
 //BA.debugLineNum = 57;BA.debugLine="Public Sub Initialize (MainForm As Form)";
 //BA.debugLineNum = 63;BA.debugLine="IdToB4XPage.Initialize";
_idtob4xpage._initialize /*String*/ (ba);
 //BA.debugLineNum = 64;BA.debugLine="RootB4XToPage.Initialize";
_rootb4xtopage._initialize /*String*/ (ba);
 //BA.debugLineNum = 65;BA.debugLine="mStackOfPageIds.Initialize";
_mstackofpageids._initialize /*String*/ (ba);
 //BA.debugLineNum = 67;BA.debugLine="mMainForm = MainForm";
_mmainform = _mainform;
 //BA.debugLineNum = 78;BA.debugLine="B4XPages.InternalSetPagesManager(Me)";
_b4xpages._internalsetpagesmanager /*String*/ (this);
 //BA.debugLineNum = 79;BA.debugLine="MainPage.Initialize";
_mainpage._initialize /*String*/ (ba);
 //BA.debugLineNum = 80;BA.debugLine="Dim NonMainPageWasAdded As Boolean = IdToB4XPage.";
_nonmainpagewasadded = _idtob4xpage._getsize /*int*/ ()>0;
 //BA.debugLineNum = 81;BA.debugLine="IdToB4XPage.Put(\"~~~~~temp~~~~\", CreateB4XPageInf";
_idtob4xpage._put /*String*/ ((Object)("~~~~~temp~~~~"),(Object)(_createb4xpageinfo((Object)(_mainpage),"",__c.False,(Object)(""))));
 //BA.debugLineNum = 82;BA.debugLine="BackgroundStateChanged(True)";
_backgroundstatechanged(__c.True);
 //BA.debugLineNum = 83;BA.debugLine="IdToB4XPage.Remove(\"~~~~~temp~~~~\")";
_idtob4xpage._remove /*String*/ ((Object)("~~~~~temp~~~~"));
 //BA.debugLineNum = 84;BA.debugLine="AddPageAndCreate(\"MainPage\", MainPage)";
_addpageandcreate("MainPage",(Object)(_mainpage));
 //BA.debugLineNum = 85;BA.debugLine="If LogEvents = False Then";
if (_logevents==__c.False) { 
 //BA.debugLineNum = 86;BA.debugLine="Log(\"Call B4XPages.GetManager.LogEvents = True t";
__c.LogImpl("912451869","Call B4XPages.GetManager.LogEvents = True to enable logging B4XPages events.",0);
 };
 //BA.debugLineNum = 88;BA.debugLine="If NonMainPageWasAdded Then";
if (_nonmainpagewasadded) { 
 //BA.debugLineNum = 89;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(_xui.getIsB4i())) { 
 //BA.debugLineNum = 90;BA.debugLine="RaiseEvent(GetTopPage, \"B4XPage_Appear\", Null)";
_raiseevent(_gettoppage(),"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _logevent(japam.sie.b4xpagesmanager._b4xpageinfo _pi,String _ev) throws Exception{
String _msg = "";
 //BA.debugLineNum = 640;BA.debugLine="Private Sub LogEvent (pi As B4XPageInfo, ev As Str";
 //BA.debugLineNum = 641;BA.debugLine="If LogEvents Then";
if (_logevents) { 
 //BA.debugLineNum = 642;BA.debugLine="Dim msg As String = $\"*** ${pi.Id}: ${ev} ${Stac";
_msg = ("*** "+__c.SmartStringFormatter("",(Object)(_pi.Id /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_ev))+" "+__c.SmartStringFormatter("",(Object)(_stackstring))+"");
 //BA.debugLineNum = 643;BA.debugLine="Log(msg)";
__c.LogImpl("914614531",_msg,0);
 };
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closed() throws Exception{
anywheresoftware.b4j.objects.Form _frm = null;
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 440;BA.debugLine="Public Sub MainForm_Closed";
 //BA.debugLineNum = 441;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
 //BA.debugLineNum = 442;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = _getpageinfofromroot((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
 //BA.debugLineNum = 443;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", Nul";
_raiseeventwithresult(_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 //BA.debugLineNum = 444;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
_mstackofpageids._remove /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 445;BA.debugLine="If mStackOfPageIds.Size = 0 Then";
if (_mstackofpageids._getsize /*int*/ ()==0) { 
 //BA.debugLineNum = 446;BA.debugLine="BackgroundStateChanged(False)";
_backgroundstatechanged(__c.False);
 };
 //BA.debugLineNum = 448;BA.debugLine="UpdateStackString";
_updatestackstring();
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return "";
}
public String  _mainform_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
anywheresoftware.b4j.objects.Form _frm = null;
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 457;BA.debugLine="Public Sub MainForm_CloseRequest (EventData As Eve";
 //BA.debugLineNum = 458;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
 //BA.debugLineNum = 459;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = _getpageinfofromroot((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
 //BA.debugLineNum = 460;BA.debugLine="If pi <> Null And CloseRequestExists (pi) Then";
if (_pi!= null && _closerequestexists(_pi)) { 
 //BA.debugLineNum = 461;BA.debugLine="EventData.Consume";
_eventdata.Consume();
 //BA.debugLineNum = 462;BA.debugLine="HandleCloseRequest (pi)";
_handlecloserequest(_pi);
 };
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return "";
}
public String  _mainform_focuschanged(boolean _hasfocus) throws Exception{
anywheresoftware.b4j.objects.Form _frm = null;
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 431;BA.debugLine="Public Sub MainForm_FocusChanged (HasFocus As Bool";
 //BA.debugLineNum = 432;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
 //BA.debugLineNum = 433;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = _getpageinfofromroot((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
 //BA.debugLineNum = 434;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
 //BA.debugLineNum = 435;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
 //BA.debugLineNum = 436;BA.debugLine="MovePageToTop(pi)";
_movepagetotop(_pi);
 };
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return "";
}
public String  _mainform_iconifiedchanged(boolean _iconified) throws Exception{
anywheresoftware.b4j.objects.Form _frm = null;
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 451;BA.debugLine="Public Sub MainForm_IconifiedChanged (Iconified As";
 //BA.debugLineNum = 452;BA.debugLine="Dim frm As Form = Sender";
_frm = (anywheresoftware.b4j.objects.Form)(__c.Sender(ba));
 //BA.debugLineNum = 453;BA.debugLine="Dim pi As B4XPageInfo = GetPageInfoFromRoot(frm.R";
_pi = _getpageinfofromroot((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_frm.getRootPane().getObject())));
 //BA.debugLineNum = 454;BA.debugLine="RaiseEvent(pi, \"B4XPage_IconifiedChanged\", Array(";
_raiseevent(_pi,"B4XPage_IconifiedChanged",new Object[]{(Object)(_iconified)});
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(double _width,double _height) throws Exception{
int _w = 0;
int _h = 0;
 //BA.debugLineNum = 585;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
 //BA.debugLineNum = 586;BA.debugLine="Dim w As Int = Width";
_w = (int) (_width);
 //BA.debugLineNum = 587;BA.debugLine="Dim h As Int = Height";
_h = (int) (_height);
 //BA.debugLineNum = 588;BA.debugLine="RaiseEvent(GetPageInfoFromRoot(Sender), \"B4XPage_";
_raiseevent(_getpageinfofromroot((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)))),"B4XPage_Resize",new Object[]{(Object)(_w),(Object)(_h)});
 //BA.debugLineNum = 589;BA.debugLine="End Sub";
return "";
}
public String  _movepagetotop(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Private Sub MovePageToTop (pi As B4XPageInfo)";
 //BA.debugLineNum = 414;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
_mstackofpageids._remove /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 415;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
_mstackofpageids._add /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 416;BA.debugLine="UpdateStackString";
_updatestackstring();
 //BA.debugLineNum = 417;BA.debugLine="End Sub";
return "";
}
public String  _raiseevent(japam.sie.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
int _length = 0;
 //BA.debugLineNum = 548;BA.debugLine="Public Sub RaiseEvent (TargetPage As B4XPageInfo,";
 //BA.debugLineNum = 549;BA.debugLine="If TargetPage = Null Then Return";
if (_targetpage== null) { 
if (true) return "";};
 //BA.debugLineNum = 550;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 551;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
 //BA.debugLineNum = 552;BA.debugLine="LogEvent(TargetPage, SubName)";
_logevent(_targetpage,_subname);
 //BA.debugLineNum = 553;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (_xui.SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return "";};
 //BA.debugLineNum = 554;BA.debugLine="Select length";
switch (_length) {
case 0: {
 //BA.debugLineNum = 556;BA.debugLine="CallSubDelayed(TargetPage.B4XPage, SubName)";
__c.CallSubDelayed(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
 //BA.debugLineNum = 558;BA.debugLine="CallSubDelayed2(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
 //BA.debugLineNum = 560;BA.debugLine="CallSubDelayed3(TargetPage.B4XPage, SubName, Pa";
__c.CallSubDelayed3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
 //BA.debugLineNum = 562;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("914090254","Too many parameters",0);
 break; }
}
;
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
public Object  _raiseeventwithresult(japam.sie.b4xpagesmanager._b4xpageinfo _targetpage,String _subname,Object[] _params) throws Exception{
int _length = 0;
 //BA.debugLineNum = 566;BA.debugLine="Public Sub RaiseEventWithResult (TargetPage As B4X";
 //BA.debugLineNum = 567;BA.debugLine="If TargetPage = Null Then Return Null";
if (_targetpage== null) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 568;BA.debugLine="Dim length As Int";
_length = 0;
 //BA.debugLineNum = 569;BA.debugLine="If Params = Null Then length = 0 Else length = Pa";
if (_params== null) { 
_length = (int) (0);}
else {
_length = _params.length;};
 //BA.debugLineNum = 570;BA.debugLine="LogEvent(TargetPage, SubName)";
_logevent(_targetpage,_subname);
 //BA.debugLineNum = 571;BA.debugLine="If xui.SubExists(TargetPage.B4XPage, SubName, len";
if (_xui.SubExists(ba,_targetpage.B4XPage /*Object*/ ,_subname,_length)==__c.False) { 
if (true) return __c.Null;};
 //BA.debugLineNum = 572;BA.debugLine="Select length";
switch (_length) {
case 0: {
 //BA.debugLineNum = 574;BA.debugLine="Return CallSub(TargetPage.B4XPage, SubName)";
if (true) return __c.CallSubNew(ba,_targetpage.B4XPage /*Object*/ ,_subname);
 break; }
case 1: {
 //BA.debugLineNum = 576;BA.debugLine="Return CallSub2(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew2(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)]);
 break; }
case 2: {
 //BA.debugLineNum = 578;BA.debugLine="Return CallSub3(TargetPage.B4XPage, SubName, Pa";
if (true) return __c.CallSubNew3(ba,_targetpage.B4XPage /*Object*/ ,_subname,_params[(int) (0)],_params[(int) (1)]);
 break; }
default: {
 //BA.debugLineNum = 580;BA.debugLine="Log(\"Too many parameters\")";
__c.LogImpl("914155790","Too many parameters",0);
 break; }
}
;
 //BA.debugLineNum = 582;BA.debugLine="Return Null";
if (true) return __c.Null;
 //BA.debugLineNum = 583;BA.debugLine="End Sub";
return null;
}
public String  _settitle(Object _b4xpage,Object _title) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 363;BA.debugLine="Public Sub SetTitle (B4XPage As Object, Title As O";
 //BA.debugLineNum = 364;BA.debugLine="Dim pi As B4XPageInfo = FindPIFromB4XPage(B4XPage";
_pi = _findpifromb4xpage(_b4xpage);
 //BA.debugLineNum = 365;BA.debugLine="pi.Title = Title";
_pi.Title /*Object*/  = _title;
 //BA.debugLineNum = 366;BA.debugLine="pi.Parent.NativeType.Title = Title";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_title));
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _showpage(String _id) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 156;BA.debugLine="Public Sub ShowPage (Id As String)";
 //BA.debugLineNum = 157;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = _getpagefromid(_id);
 //BA.debugLineNum = 158;BA.debugLine="If pi = GetTopPage Then Return";
if ((_pi).equals(_gettoppage())) { 
if (true) return "";};
 //BA.debugLineNum = 159;BA.debugLine="CreatePageIfNeeded(pi)";
_createpageifneeded(_pi);
 //BA.debugLineNum = 160;BA.debugLine="TopPageDisappear";
_toppagedisappear();
 //BA.debugLineNum = 174;BA.debugLine="mStackOfPageIds.Remove(pi.Id)";
_mstackofpageids._remove /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 175;BA.debugLine="ShowPageImpl(pi)";
_showpageimpl(_pi);
 //BA.debugLineNum = 176;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
_mstackofpageids._add /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 177;BA.debugLine="TopPageAppear";
_toppageappear();
 //BA.debugLineNum = 178;BA.debugLine="End Sub";
return "";
}
public String  _showpageandremovepreviouspages(String _id) throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
japam.sie.b4xpagesmanager._b4xpageinfo _pagetoremove = null;
 //BA.debugLineNum = 180;BA.debugLine="Public Sub ShowPageAndRemovePreviousPages (Id As S";
 //BA.debugLineNum = 181;BA.debugLine="If GetTopPage = Null Then";
if (_gettoppage()== null) { 
 //BA.debugLineNum = 182;BA.debugLine="ShowPage(Id)";
_showpage(_id);
 //BA.debugLineNum = 183;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 185;BA.debugLine="Dim pi As B4XPageInfo = GetPageFromId(Id)";
_pi = _getpagefromid(_id);
 //BA.debugLineNum = 186;BA.debugLine="CreatePageIfNeeded(pi)";
_createpageifneeded(_pi);
 //BA.debugLineNum = 187;BA.debugLine="TopPageDisappear";
_toppagedisappear();
 //BA.debugLineNum = 191;BA.debugLine="For Each Id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group8 = _mstackofpageids._aslist /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_id = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 192;BA.debugLine="Dim PageToRemove As B4XPageInfo = GetPageFromId(";
_pagetoremove = _getpagefromid(_id);
 //BA.debugLineNum = 196;BA.debugLine="If PageToRemove.Id = pi.Id Then Continue";
if ((_pagetoremove.Id /*String*/ ).equals(_pi.Id /*String*/ )) { 
if (true) continue;};
 //BA.debugLineNum = 197;BA.debugLine="PageToRemove.Parent.NativeType.Close";
_pagetoremove.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Close();
 }
};
 //BA.debugLineNum = 201;BA.debugLine="mStackOfPageIds.Clear";
_mstackofpageids._clear /*String*/ ();
 //BA.debugLineNum = 202;BA.debugLine="mStackOfPageIds.Add(pi.Id)";
_mstackofpageids._add /*String*/ ((Object)(_pi.Id /*String*/ ));
 //BA.debugLineNum = 203;BA.debugLine="If xui.IsB4A Or xui.IsB4J Then";
if (_xui.getIsB4A() || _xui.getIsB4J()) { 
 //BA.debugLineNum = 204;BA.debugLine="ShowPageImpl(pi)";
_showpageimpl(_pi);
 };
 //BA.debugLineNum = 206;BA.debugLine="TopPageAppear";
_toppageappear();
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return "";
}
public String  _showpageimpl(japam.sie.b4xpagesmanager._b4xpageinfo _pi) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 333;BA.debugLine="Private Sub ShowPageImpl (pi As B4XPageInfo)";
 //BA.debugLineNum = 335;BA.debugLine="pi.Parent.NativeType.Show";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .Show();
 //BA.debugLineNum = 336;BA.debugLine="Dim jo As JavaObject = pi.Parent.NativeType";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ ));
 //BA.debugLineNum = 337;BA.debugLine="jo.GetFieldJO(\"stage\").RunMethod(\"requestFocus\",";
_jo.GetFieldJO("stage").RunMethod("requestFocus",(Object[])(__c.Null));
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return "";
}
public String  _toppageappear() throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 288;BA.debugLine="Private Sub TopPageAppear";
 //BA.debugLineNum = 289;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _gettoppage();
 //BA.debugLineNum = 290;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
 //BA.debugLineNum = 291;BA.debugLine="pi.Parent.NativeType.Title = pi.Title";
_pi.Parent /*japam.sie.b4xpagesmanager._b4xpageparent*/ .NativeType /*anywheresoftware.b4j.objects.Form*/ .setTitle(BA.ObjectToString(_pi.Title /*Object*/ ));
 //BA.debugLineNum = 292;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(_xui.getIsB4i())) { 
 //BA.debugLineNum = 293;BA.debugLine="If IsForeground Then";
if (_isforeground) { 
 //BA.debugLineNum = 294;BA.debugLine="RaiseEvent(pi, \"B4XPage_Appear\", Null)";
_raiseevent(_pi,"B4XPage_Appear",(Object[])(__c.Null));
 };
 };
 //BA.debugLineNum = 303;BA.debugLine="UpdateStackString";
_updatestackstring();
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public String  _toppagedisappear() throws Exception{
japam.sie.b4xpagesmanager._b4xpageinfo _pi = null;
 //BA.debugLineNum = 277;BA.debugLine="Private Sub TopPageDisappear";
 //BA.debugLineNum = 278;BA.debugLine="If xui.IsB4J Then Return";
if (_xui.getIsB4J()) { 
if (true) return "";};
 //BA.debugLineNum = 279;BA.debugLine="Dim pi As B4XPageInfo = GetTopPage";
_pi = _gettoppage();
 //BA.debugLineNum = 280;BA.debugLine="If pi = Null Then Return";
if (_pi== null) { 
if (true) return "";};
 //BA.debugLineNum = 281;BA.debugLine="If Not(xui.IsB4i) Then";
if (__c.Not(_xui.getIsB4i())) { 
 //BA.debugLineNum = 282;BA.debugLine="If IsForeground Then";
if (_isforeground) { 
 //BA.debugLineNum = 283;BA.debugLine="RaiseEventWithResult(pi, \"B4XPage_Disappear\", N";
_raiseeventwithresult(_pi,"B4XPage_Disappear",(Object[])(__c.Null));
 };
 };
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return "";
}
public String  _updatestackstring() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _id = "";
 //BA.debugLineNum = 647;BA.debugLine="Public Sub UpdateStackString";
 //BA.debugLineNum = 648;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 649;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 650;BA.debugLine="sb.Append(\"[\")";
_sb.Append("[");
 //BA.debugLineNum = 651;BA.debugLine="If mStackOfPageIds.Size > 0 Then";
if (_mstackofpageids._getsize /*int*/ ()>0) { 
 //BA.debugLineNum = 652;BA.debugLine="For Each id As String In mStackOfPageIds.AsList";
{
final anywheresoftware.b4a.BA.IterableList group5 = _mstackofpageids._aslist /*anywheresoftware.b4a.objects.collections.List*/ ();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_id = BA.ObjectToString(group5.Get(index5));
 //BA.debugLineNum = 653;BA.debugLine="sb.Append(id).Append(\", \")";
_sb.Append(_id).Append(", ");
 }
};
 //BA.debugLineNum = 655;BA.debugLine="sb.Remove(sb.Length - 2, sb.Length)";
_sb.Remove((int) (_sb.getLength()-2),_sb.getLength());
 };
 //BA.debugLineNum = 657;BA.debugLine="sb.Append(\"]\")";
_sb.Append("]");
 //BA.debugLineNum = 658;BA.debugLine="StackString = sb.ToString";
_stackstring = _sb.ToString();
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
