package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Checkable;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchQueryPageActivity;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jla implements sch {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ jla(Object obj, ixi ixiVar, int i) {
        this.c = i;
        this.a = obj;
        this.b = ixiVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        wkg wkgVar;
        wkg wkgVarF;
        wlx wlxVar = null;
        switch (this.c) {
            case 0:
                ((jlb) this.a).a.c(view);
                Context context = view.getContext();
                context.getClass();
                jan.k(context, ((jky) this.b).j());
                break;
            case 1:
                lid.a();
                jks jksVar = (jks) this.a;
                jksVar.a.c(view);
                Object obj2 = this.b;
                jry jryVar = (jry) obj2;
                wpm wpmVarQ = jryVar.q();
                if (wpmVarQ != null && jryVar.p() != null) {
                    jan janVar = jksVar.b;
                    Context context2 = view.getContext();
                    context2.getClass();
                    wll wllVar = ((wui) ((ixi) obj2).b).b;
                    if (wllVar == null) {
                        wllVar = wll.a;
                    }
                    wllVar.getClass();
                    wnp wnpVarP = jryVar.p();
                    wnpVarP.getClass();
                    janVar.s(context2, wllVar, wnpVarP, wpmVarQ, false);
                    break;
                }
                break;
            case 2:
                pjw pjwVarX = hju.x(lid.a());
                jlb jlbVar = (jlb) this.b;
                jlbVar.a.d(view, pjwVarX);
                wql wqlVar = ((wul) this.a).c;
                if (wqlVar == null) {
                    wqlVar = wql.a;
                }
                wqlVar.getClass();
                wlx wlxVar2 = jlbVar.c;
                if (wlxVar2 == null) {
                    yks.c("posterImage");
                    wlxVar2 = null;
                }
                long jIntValue = 4279899936L;
                if (wlxVar2.v()) {
                    wlx wlxVar3 = jlbVar.c;
                    if (wlxVar3 == null) {
                        yks.c("posterImage");
                    } else {
                        wlxVar = wlxVar3;
                    }
                    File fileA = jlbVar.e.a(wlxVar);
                    if (fileA != null) {
                        jIntValue = ((Number) yfm.S(kpt.a.a(BitmapFactory.decodeFile(fileA.getPath()), true))).intValue();
                    }
                }
                jan.e(a.aj(view), wqlVar, jIntValue);
                break;
            case 3:
                tui tuiVar = jlw.a;
                ((ulp) this.a).ay(new jlt(!((jlu) this.b).e));
                break;
            case 4:
                wkg wkgVar2 = ((wsd) ((ixi) this.b).b).n;
                if (wkgVar2 == null) {
                    wkgVar2 = wkg.a;
                }
                Object obj3 = this.a;
                wkgVar2.getClass();
                ((joa) obj3).e.f(wkgVar2, view, pjw.b());
                break;
            case 5:
                if (((jod) obj).o != null) {
                    Object obj4 = this.b;
                    Object obj5 = this.a;
                    wll wllVar2 = ((wsd) ((ixi) obj4).b).l;
                    if (wllVar2 == null) {
                        wllVar2 = wll.a;
                    }
                    joa joaVar = (joa) obj5;
                    isw iswVar = joaVar.c;
                    wllVar2.getClass();
                    iswVar.s(new iog(wllVar2, ((ksn) ((ldy) joaVar.b).a().g()).a), !r8.booleanValue());
                    break;
                }
                break;
            case 6:
                joa joaVar2 = (joa) this.a;
                joaVar2.a.c(view);
                wkg wkgVar3 = ((wsd) ((ixi) this.b).b).k;
                if (wkgVar3 == null) {
                    wkgVar3 = wkg.a;
                }
                irc ircVar = joaVar2.e;
                wkgVar3.getClass();
                ircVar.f(wkgVar3, view, pjw.b());
                break;
            case 7:
                joa joaVar3 = (joa) this.a;
                joaVar3.a.c(view);
                wsd wsdVar = (wsd) ((ixi) this.b).b;
                if (((wsdVar.d == 15 ? (wsc) wsdVar.e : wsc.a).b & 2) != 0) {
                    wkgVar = (wsdVar.d == 15 ? (wsc) wsdVar.e : wsc.a).d;
                    if (wkgVar == null) {
                        wkgVar = wkg.a;
                    }
                } else {
                    wkgVar = wsdVar.k;
                    if (wkgVar == null) {
                        wkgVar = wkg.a;
                    }
                }
                wkgVar.getClass();
                joaVar3.e.f(wkgVar, view, pjw.b());
                break;
            case 8:
                wkg wkgVar4 = ((wqx) ((ixi) this.b).b).i;
                if (wkgVar4 == null) {
                    wkgVar4 = wkg.a;
                }
                Object obj6 = this.a;
                wkgVar4.getClass();
                Context context3 = view.getContext();
                context3.getClass();
                jpb jpbVar = (jpb) obj6;
                jpbVar.b.e(wkgVar4, context3, "");
                jpbVar.a.c(view);
                break;
            case 9:
                wkg wkgVar5 = ((wqx) ((ixi) this.b).b).f;
                if (wkgVar5 == null) {
                    wkgVar5 = wkg.a;
                }
                wkgVar5.getClass();
                Context contextN = ihz.N(view);
                if (contextN == null) {
                    contextN = view.getContext();
                }
                Object obj7 = this.a;
                contextN.getClass();
                jpb jpbVar2 = (jpb) obj7;
                jpbVar2.b.e(wkgVar5, contextN, "");
                jpbVar2.a.c(view);
                break;
            case 10:
                wkg wkgVar6 = ((wqx) ((ixi) this.b).b).j;
                if (wkgVar6 == null) {
                    wkgVar6 = wkg.a;
                }
                Object obj8 = this.a;
                wkgVar6.getClass();
                Context context4 = view.getContext();
                context4.getClass();
                jpb jpbVar3 = (jpb) obj8;
                jpbVar3.b.e(wkgVar6, context4, "");
                jpbVar3.a.c(view);
                break;
            case 11:
                boolean zIsChecked = ((Checkable) view).isChecked();
                Object obj9 = this.b;
                joz jozVar = (joz) obj9;
                jozVar.d = zIsChecked;
                ((sbt) obj9).z();
                ((jpb) this.a).a.f(view, jozVar.d);
                break;
            case 12:
                jpo jpoVar = (jpo) this.a;
                jpoVar.b.a(pjw.b(), view);
                wkg wkgVar7 = ((wsy) ((ixi) this.b).b).h;
                if (wkgVar7 == null) {
                    wkgVar7 = wkg.a;
                }
                irc ircVar2 = jpoVar.c;
                wkgVar7.getClass();
                ircVar2.f(wkgVar7, view, pjw.b());
                break;
            case 13:
                wkg wkgVar8 = ((wsz) ((ixi) this.b).b).c;
                if (wkgVar8 == null) {
                    wkgVar8 = wkg.a;
                }
                Object obj10 = this.a;
                wkgVar8.getClass();
                Context context5 = view.getContext();
                context5.getClass();
                ((jpu) obj10).b.e(wkgVar8, context5, "");
                break;
            case 14:
                wtd wtdVar = (wtd) ((ixi) this.b).b;
                wls wlsVar = wtdVar.c;
                if (wlsVar == null) {
                    wlsVar = wls.a;
                }
                String str = wlsVar.b;
                str.getClass();
                wlx wlxVar4 = wtdVar.b;
                if (wlxVar4 == null) {
                    wlxVar4 = wlx.a;
                }
                Object obj11 = this.a;
                wlxVar4.getClass();
                jrl jrlVar = (jrl) obj11;
                jrlVar.a.l(str, wlxVar4);
                wkg wkgVar9 = wtdVar.f;
                if (wkgVar9 == null) {
                    wkgVar9 = wkg.a;
                }
                irc ircVar3 = jrlVar.c;
                wkgVar9.getClass();
                ircVar3.f(wkgVar9, view, pjw.b());
                break;
            case 15:
                jsa jsaVar = (jsa) this.a;
                jsaVar.a.c(view);
                wkg wkgVar10 = ((wtj) ((ixi) this.b).b).g;
                if (wkgVar10 == null) {
                    wkgVar10 = wkg.a;
                }
                irc ircVar4 = jsaVar.b;
                wkgVar10.getClass();
                ircVar4.f(wkgVar10, view, pjw.b());
                break;
            case 16:
                wkg wkgVar11 = ((wtl) ((ixi) this.b).b).e;
                if (wkgVar11 == null) {
                    wkgVar11 = wkg.a;
                }
                Object obj12 = this.a;
                wkgVar11.getClass();
                jsl jslVar = (jsl) obj12;
                jslVar.b.f(wkgVar11, view, pjw.b());
                jslVar.a.c(view);
                break;
            case 17:
                jsq jsqVar = (jsq) this.a;
                jsqVar.a.c(view);
                wkg wkgVar12 = ((wts) ((ixi) this.b).b).e;
                if (wkgVar12 == null) {
                    wkgVar12 = wkg.a;
                }
                irc ircVar5 = jsqVar.b;
                wkgVar12.getClass();
                ircVar5.f(wkgVar12, view, pjw.b());
                break;
            case 18:
                wkg wkgVar13 = ((wva) ((ixi) this.b).b).e;
                if (wkgVar13 == null) {
                    wkgVar13 = wkg.a;
                }
                Object obj13 = this.a;
                wkgVar13.getClass();
                jsv jsvVar = (jsv) obj13;
                jsvVar.b.f(wkgVar13, view, pjw.b());
                jsvVar.a.c(view);
                break;
            case 19:
                ixi ixiVar = (ixi) this.b;
                wkf wkfVarB = wkf.b(ixiVar.f().c);
                if (wkfVarB == null) {
                    wkfVarB = wkf.TYPE_UNSPECIFIED;
                }
                Object obj14 = this.a;
                if (wkfVarB == wkf.TVM_ENTITY_PAGE_ACTION && ((jtb) obj14).b.d()) {
                    wkg wkgVarF2 = ixiVar.f();
                    vtw vtwVar = (vtw) wkgVarF2.a(5, null);
                    vtwVar.x(wkgVarF2);
                    vty vtyVar = (vty) vtwVar;
                    vtyVar.getClass();
                    vvd vvdVar = wqg.i;
                    vvdVar.getClass();
                    vvdVar.getClass();
                    Object objR = wae.r(vvdVar, vtyVar);
                    objR.getClass();
                    wqg wqgVar = (wqg) objR;
                    vtw vtwVar2 = (vtw) wqgVar.a(5, null);
                    vtwVar2.x(wqgVar);
                    vtwVar2.getClass();
                    wxe.l(vtwVar2);
                    vtyVar.bL(vvdVar, wxe.i(vtwVar2));
                    wkgVarF = wae.m(vtyVar);
                } else {
                    wkgVarF = ixiVar.f();
                }
                ((jtb) obj14).c.f(wkgVarF, view, pjw.b());
                ihz.M(view);
                by byVarN = ihz.N(view);
                SearchQueryPageActivity searchQueryPageActivity = byVarN instanceof SearchQueryPageActivity ? (SearchQueryPageActivity) byVarN : null;
                if (searchQueryPageActivity != null) {
                    View currentFocus = searchQueryPageActivity.getCurrentFocus();
                    if (currentFocus != null) {
                        Object systemService = searchQueryPageActivity.getSystemService("input_method");
                        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
                        if (inputMethodManager != null) {
                            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                        }
                    }
                    searchQueryPageActivity.finish();
                    break;
                }
                break;
            default:
                juk jukVar = (juk) this.a;
                jukVar.a.c(view);
                wkg wkgVar14 = ((wtz) ((ixi) this.b).b).g;
                if (wkgVar14 == null) {
                    wkgVar14 = wkg.a;
                }
                irc ircVar6 = jukVar.b;
                wkgVar14.getClass();
                ircVar6.f(wkgVar14, view, pjw.b());
                break;
        }
    }

    public /* synthetic */ jla(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
