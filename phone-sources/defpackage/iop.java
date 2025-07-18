package defpackage;

import android.content.Context;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iop implements yow {
    public final iea a;
    public volatile ieg b;
    public final kdj c;
    private final Context d;
    private final ihi e;
    private final xjt f;
    private final yow g;
    private final hfx h;

    public iop(Context context, kdj kdjVar, iea ieaVar, ihi ihiVar, xjt xjtVar, kw kwVar, yow yowVar) {
        this.d = context;
        this.c = kdjVar;
        this.a = ieaVar;
        this.e = ihiVar;
        this.f = xjtVar;
        this.g = yowVar;
        this.h = kwVar.B(new gew(this, 6, (float[]) null), itc.g).i();
        ieg iegVar = ieg.a;
        iegVar.getClass();
        this.b = iegVar;
    }

    public final iht a() {
        wlf wlfVarE;
        if (!this.e.d()) {
            vtw vtwVarM = wlg.a.m();
            vtwVarM.getClass();
            DesugarCollections.unmodifiableList(((wlg) vtwVarM.b).b).getClass();
            wlf wlfVar = wlf.a;
            vtw vtwVarM2 = wlfVar.m();
            vtwVarM2.getClass();
            wae.i(3, vtwVarM2);
            Context context = this.d;
            String string = context.getResources().getString(R.string.tab_home);
            string.getClass();
            wae.g(string, vtwVarM2);
            wkx wkxVar = wkx.a;
            vty vtyVar = (vty) wkxVar.m();
            vtyVar.getClass();
            wae.k("home", vtyVar);
            wkw wkwVar = wkw.OFFLINE_DESTINATION;
            wae.l(wkwVar, vtyVar);
            wae.f(wae.j(vtyVar), vtwVarM2);
            vtwVarM.aK(wae.e(vtwVarM2));
            DesugarCollections.unmodifiableList(((wlg) vtwVarM.b).b).getClass();
            vtw vtwVarM3 = wlfVar.m();
            vtwVarM3.getClass();
            wae.i(6, vtwVarM3);
            String string2 = context.getResources().getString(R.string.tab_my_library);
            string2.getClass();
            wae.g(string2, vtwVarM3);
            vtw vtwVarM4 = woq.a.m();
            vtwVarM4.getClass();
            DesugarCollections.unmodifiableList(((woq) vtwVarM4.b).b).getClass();
            wop wopVar = wop.a;
            vtw vtwVarM5 = wopVar.m();
            vtwVarM5.getClass();
            vxr.L("legacy-library-movies", vtwVarM5);
            String string3 = context.getResources().getString(R.string.movies_sub_nav_tab);
            string3.getClass();
            vxr.K(string3, vtwVarM5);
            vty vtyVar2 = (vty) wkxVar.m();
            vtyVar2.getClass();
            wae.k("legacy-library-movies", vtyVar2);
            wae.l(wkw.LEGACY_LIBRARY_MOVIES, vtyVar2);
            vxr.J(wae.j(vtyVar2), vtwVarM5);
            vtwVarM4.aP(vxr.I(vtwVarM5));
            DesugarCollections.unmodifiableList(((woq) vtwVarM4.b).b).getClass();
            vtw vtwVarM6 = wopVar.m();
            vtwVarM6.getClass();
            vxr.L("legacy-library-shows", vtwVarM6);
            String string4 = context.getResources().getString(R.string.shows_sub_nav_tab);
            string4.getClass();
            vxr.K(string4, vtwVarM6);
            vty vtyVar3 = (vty) wkxVar.m();
            vtyVar3.getClass();
            wae.k("legacy-library-shows", vtyVar3);
            wae.l(wkw.LEGACY_LIBRARY_SHOWS, vtyVar3);
            vxr.J(wae.j(vtyVar3), vtwVarM6);
            vtwVarM4.aP(vxr.I(vtwVarM6));
            wae.h(vxr.G(vtwVarM4), vtwVarM3);
            vtwVarM.aK(wae.e(vtwVarM3));
            DesugarCollections.unmodifiableList(((wlg) vtwVarM.b).b).getClass();
            vtw vtwVarM7 = wlfVar.m();
            vtwVarM7.getClass();
            wae.i(5, vtwVarM7);
            String string5 = context.getResources().getString(R.string.tab_watchlist);
            string5.getClass();
            wae.g(string5, vtwVarM7);
            vty vtyVar4 = (vty) wkxVar.m();
            vtyVar4.getClass();
            wae.k("watchlist", vtyVar4);
            wae.l(wkwVar, vtyVar4);
            wae.f(wae.j(vtyVar4), vtwVarM7);
            vtwVarM.aK(wae.e(vtwVarM7));
            return new iht(wbb.u(vtwVarM), 2);
        }
        vtw vtwVarM8 = wlg.a.m();
        vtwVarM8.getClass();
        DesugarCollections.unmodifiableList(((wlg) vtwVarM8.b).b).getClass();
        wlf[] wlfVarArr = new wlf[2];
        xjt xjtVar = this.f;
        if (xjtVar.a() && ((Boolean) xju.b.et(((xju) xjtVar).d)).booleanValue()) {
            vtw vtwVarM9 = wlf.a.m();
            vtwVarM9.getClass();
            wae.i(10, vtwVarM9);
            String string6 = this.d.getResources().getString(R.string.tab_hot_and_new);
            string6.getClass();
            wae.g(string6, vtwVarM9);
            vty vtyVar5 = (vty) wkx.a.m();
            vtyVar5.getClass();
            wae.k("hot-and-new", vtyVar5);
            wae.l(wkw.OFFLINE_DESTINATION, vtyVar5);
            wae.f(wae.j(vtyVar5), vtwVarM9);
            wlfVarE = wae.e(vtwVarM9);
        } else {
            vtw vtwVarM10 = wlf.a.m();
            vtwVarM10.getClass();
            wae.i(9, vtwVarM10);
            String string7 = this.d.getResources().getString(R.string.tab_for_you);
            string7.getClass();
            wae.g(string7, vtwVarM10);
            vty vtyVar6 = (vty) wkx.a.m();
            vtyVar6.getClass();
            wae.k("for-you", vtyVar6);
            wae.l(wkw.OFFLINE_DESTINATION, vtyVar6);
            wae.f(wae.j(vtyVar6), vtwVarM10);
            wlfVarE = wae.e(vtwVarM10);
        }
        wlfVarArr[0] = wlfVarE;
        vtw vtwVarM11 = wlf.a.m();
        vtwVarM11.getClass();
        wae.i(8, vtwVarM11);
        Context context2 = this.d;
        String string8 = context2.getResources().getString(R.string.tab_your_stuff);
        string8.getClass();
        wae.g(string8, vtwVarM11);
        vtw vtwVarM12 = woq.a.m();
        vtwVarM12.getClass();
        DesugarCollections.unmodifiableList(((woq) vtwVarM12.b).b).getClass();
        wop wopVar2 = wop.a;
        vtw vtwVarM13 = wopVar2.m();
        vtwVarM13.getClass();
        vxr.L("your-stuff-watchlist", vtwVarM13);
        String string9 = context2.getResources().getString(R.string.tab_watchlist);
        string9.getClass();
        vxr.K(string9, vtwVarM13);
        wkx wkxVar2 = wkx.a;
        vty vtyVar7 = (vty) wkxVar2.m();
        vtyVar7.getClass();
        wae.k("your-stuff-watchlist", vtyVar7);
        wae.l(wkw.OFFLINE_DESTINATION, vtyVar7);
        vxr.J(wae.j(vtyVar7), vtwVarM13);
        vtw vtwVarM14 = wopVar2.m();
        vtwVarM14.getClass();
        vxr.L("your-stuff-library", vtwVarM14);
        String string10 = context2.getResources().getString(R.string.tab_my_library);
        string10.getClass();
        vxr.K(string10, vtwVarM14);
        vty vtyVar8 = (vty) wkxVar2.m();
        vtyVar8.getClass();
        wae.k("your-stuff-library", vtyVar8);
        wae.l(wkw.LIBRARY_PAGE, vtyVar8);
        vxr.J(wae.j(vtyVar8), vtwVarM14);
        List listS = yfm.s(vxr.I(vtwVarM13), vxr.I(vtwVarM14));
        if (!vtwVarM12.b.A()) {
            vtwVarM12.u();
        }
        woq woqVar = (woq) vtwVarM12.b;
        woqVar.c();
        vsf.h(listS, woqVar.b);
        wae.h(vxr.G(vtwVarM12), vtwVarM11);
        wlfVarArr[1] = wae.e(vtwVarM11);
        vtwVarM8.aJ(yfm.s(wlfVarArr));
        return new iht(wbb.u(vtwVarM8), 2);
    }

    public final Object b() {
        if (((ldy) this.a).a().l()) {
            return new isv(a(), 6);
        }
        hfx hfxVar = this.h;
        vtw vtwVarM = ink.a.m();
        vtwVarM.getClass();
        wvy wvyVar = wvy.a;
        wvyVar.getClass();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        ink inkVar = (ink) vtwVarM.b;
        inkVar.d = wvyVar;
        inkVar.c = 8;
        return new ipi(hfxVar.h(ihz.Y(ipc.p(vtwVarM))), this, 1);
    }

    @Override // defpackage.yow
    public final yil c() {
        return ((ywq) this.g).a;
    }
}
