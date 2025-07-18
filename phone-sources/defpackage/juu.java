package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Observable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class juu implements sch {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ juu(Observable observable, ulp ulpVar, int i) {
        this.c = i;
        this.a = observable;
        this.b = ulpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v42, types: [ixb] */
    /* JADX WARN: Type inference failed for: r9v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v5, types: [by] */
    @Override // defpackage.sch
    public final void a(Object obj, View view) {
        Activity activity;
        mvl mvlVarB;
        by byVar = null;
        switch (this.c) {
            case 0:
                Context context = view.getContext();
                context.getClass();
                Object obj2 = this.a;
                jus jusVar = (jus) obj2;
                wok wokVar = jusVar.e;
                List<wok> listI = jusVar.i();
                iky ikyVar = new iky(obj2, this.b, 18);
                by byVarF = hju.F(context);
                if (byVarF != null) {
                    mvl[] mvlVarArr = new mvl[1];
                    nag nagVarB = mvl.b();
                    nagVarB.j(context.getResources().getString(R.string.sort_by));
                    nagVarB.h(wokVar.b);
                    nagVarB.d = "library_sort_options";
                    ArrayList arrayList = new ArrayList(yfm.z(listI, 10));
                    for (wok wokVar2 : listI) {
                        arrayList.add(new mvg(wokVar2.b, wokVar2.d));
                    }
                    nagVarB.i(arrayList);
                    mvlVarArr[0] = nagVarB.g();
                    mvk mvkVarA = mvk.a(yfm.r(mvlVarArr), "library_preference_dialog_key");
                    mvkVarA.e = new juv(ikyVar, 0);
                    mvkVarA.show(byVarF.getSupportFragmentManager(), "LibrarySortOptionDialog");
                    break;
                }
                break;
            case 1:
                Context context2 = view.getContext();
                context2.getClass();
                woi woiVar = ((wua) ((ixi) this.a).b).c;
                if (woiVar == null) {
                    woiVar = woi.a;
                }
                Object obj3 = this.b;
                woiVar.getClass();
                ((juq) obj3).b.a(context2, woiVar);
                bl blVarL = ihz.L(view);
                if (blVarL != null) {
                    blVarL.dismiss();
                    break;
                }
                break;
            case 2:
                wkg wkgVar = ((wun) ((ixi) this.a).b).j;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                Object obj4 = this.b;
                wkgVar.getClass();
                ((jwa) obj4).d.f(wkgVar, view, pjw.b());
                break;
            case 3:
                bl blVarL2 = ihz.L(view);
                if (blVarL2 != null) {
                    blVarL2.dismiss();
                }
                Object obj5 = this.a;
                Object obj6 = this.b;
                wvh wvhVar = (wvh) ((ixi) obj5).b;
                wll wllVar = wvhVar.d;
                if (wllVar == null) {
                    wllVar = wll.a;
                }
                wll wllVar2 = wllVar;
                wllVar2.getClass();
                String str = wvhVar.e;
                str.getClass();
                vwe vweVar = wvhVar.c;
                if (vweVar == null) {
                    vweVar = vwe.a;
                }
                vwe vweVar2 = vweVar;
                isn isnVar = ((jwh) obj6).a;
                vweVar2.getClass();
                ykr.q(isnVar, null, 0, new ajo(isnVar, str, vweVar2, wllVar2, (yih) null, 13), 3);
                break;
            case 4:
                lid lidVarA = lid.a();
                Context context3 = view.getContext();
                context3.getClass();
                kdo kdoVar = (kdo) this.a;
                wpm wpmVar = kdoVar.d;
                wnp wnpVar = kdoVar.b;
                wll wllVar3 = kdoVar.a;
                kdp kdpVar = (kdp) this.b;
                int iS = kdpVar.b.s(context3, wllVar3, wnpVar, wpmVar, false);
                if (Build.VERSION.SDK_INT < 30 || !(iS == 2 || iS == 1)) {
                    kdpVar.a.d(view, hju.x(lidVarA));
                } else {
                    kdpVar.a.d(view, hju.y(lidVarA, iS == 1 ? 2 : 3));
                }
                bl blVarL3 = ihz.L(view);
                if (blVarL3 != null) {
                    blVarL3.dismiss();
                    break;
                }
                break;
            case 5:
                moi moiVar = (moi) this.b;
                moiVar.c.a(pjw.b(), view);
                mem memVar = moiVar.d;
                Object obj7 = this.a;
                if (memVar.d()) {
                    vty vtyVar = (vty) wkg.a.m();
                    vtyVar.getClass();
                    wae.n(wkf.TVM_ENTITY_PAGE_ACTION, vtyVar);
                    vvd vvdVar = wqg.i;
                    vvdVar.getClass();
                    vtw vtwVarM = wqg.a.m();
                    vtwVarM.getClass();
                    wxe.k(hju.t(((kvf) obj7).o()), vtwVarM);
                    wxe.l(vtwVarM);
                    vtw vtwVarM2 = wpd.a.m();
                    vtwVarM2.getClass();
                    vxr.B(vtwVarM2);
                    wxe.j(vxr.A(vtwVarM2), vtwVarM);
                    vtyVar.bL(vvdVar, wxe.i(vtwVarM));
                    moiVar.f.f(wae.m(vtyVar), view, pjw.b());
                    break;
                } else {
                    ksy ksyVarO = ((kvf) obj7).o();
                    vtw vtwVarM3 = lao.a.m();
                    lam lamVar = lam.GOOGLE_PLAY;
                    if (!vtwVarM3.b.A()) {
                        vtwVarM3.u();
                    }
                    ((lao) vtwVarM3.b).d = lamVar.a();
                    kxo kxoVar = new kxo(new kxw(new kyg(ksyVarO, tst.i(vtwVarM3.r()))));
                    nag nagVarA = kqz.a();
                    nagVarA.c = "my_movies";
                    moiVar.e.g(kxoVar, nagVarA.v());
                    break;
                }
            case 6:
                moi moiVar2 = (moi) this.b;
                moiVar2.c.a(pjw.b(), view);
                kxu kxuVar = new kxu(new kyb(new kyn(((kvf) this.a).o())));
                nag nagVarA2 = kqz.a();
                nagVarA2.c = "my_movies";
                by byVarN = ihz.N(view);
                if (byVarN != null) {
                    nagVarA2.b = tst.i(byVarN);
                }
                moiVar2.e.g(kxuVar, nagVarA2.v());
                break;
            case 7:
                moi moiVar3 = (moi) this.b;
                moiVar3.c.a(pjw.b(), view);
                Context context4 = view.getContext();
                context4.getClass();
                while (true) {
                    if (!(context4 instanceof ContextWrapper)) {
                        activity = null;
                    } else if (context4 instanceof Activity) {
                        activity = (Activity) context4;
                    } else {
                        context4 = ((ContextWrapper) context4).getBaseContext();
                        context4.getClass();
                    }
                }
                 = activity instanceof by ? (by) activity : 0;
                if ( != 0) {
                    kvf kvfVar = (kvf) this.a;
                    moiVar3.a.a(, kvfVar.o(), kvfVar.E());
                    break;
                }
                break;
            case 8:
                moy moyVar = (moy) this.b;
                moyVar.b.a(pjw.b(), view);
                mem memVar2 = moyVar.c;
                Object obj8 = this.a;
                if (memVar2.d()) {
                    vty vtyVar2 = (vty) wkg.a.m();
                    vtyVar2.getClass();
                    wae.n(wkf.TVM_ENTITY_PAGE_ACTION, vtyVar2);
                    vvd vvdVar2 = wqg.i;
                    vvdVar2.getClass();
                    vtw vtwVarM4 = wqg.a.m();
                    vtwVarM4.getClass();
                    wxe.k(hju.t(((kwn) obj8).d), vtwVarM4);
                    wxe.l(vtwVarM4);
                    vtw vtwVarM5 = wpd.a.m();
                    vtwVarM5.getClass();
                    vxr.B(vtwVarM5);
                    wxe.j(vxr.A(vtwVarM5), vtwVarM4);
                    vtyVar2.bL(vvdVar2, wxe.i(vtwVarM4));
                    moyVar.e.f(wae.m(vtyVar2), view, pjw.b());
                    break;
                } else {
                    vbb vbbVar = vbb.a;
                    vtw vtwVarM6 = vbbVar.m();
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    ((vbb) vtwVarM6.b).c = a.aF(4);
                    vtw vtwVarM7 = vba.a.m();
                    vtw vtwVarM8 = val.a.m();
                    vak vakVar = vak.DISTRIBUTOR;
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    ((val) vtwVarM8.b).b = vakVar.a();
                    if (!vtwVarM8.b.A()) {
                        vtwVarM8.u();
                    }
                    ((val) vtwVarM8.b).c = "PlayMovies";
                    if (!vtwVarM7.b.A()) {
                        vtwVarM7.u();
                    }
                    vba vbaVar = (vba) vtwVarM7.b;
                    val valVar = (val) vtwVarM8.r();
                    valVar.getClass();
                    vbaVar.c = valVar;
                    vbaVar.b |= 1;
                    if (!vtwVarM6.b.A()) {
                        vtwVarM6.u();
                    }
                    vbb vbbVar2 = (vbb) vtwVarM6.b;
                    vba vbaVar2 = (vba) vtwVarM7.r();
                    vbaVar2.getClass();
                    vbbVar2.e = vbaVar2;
                    vbbVar2.b |= 1;
                    vuc vucVarR = vtwVarM6.r();
                    vucVarR.getClass();
                    vbb vbbVar3 = (vbb) vucVarR;
                    lao laoVarA = yks.e(vbbVar3, vbbVar) ? null : new lap(new mcm(i)).b(vbbVar3);
                    ksy ksyVar = ((kwn) obj8).d;
                    trk trkVar = trk.a;
                    kxo kxoVar2 = new kxo(new kxy(new kyh(ksyVar, trkVar, trkVar, tst.h(laoVarA))));
                    nag nagVarA3 = kqz.a();
                    nagVarA3.c = "my_shows";
                    moyVar.d.g(kxoVar2, nagVarA3.v());
                    break;
                }
            default:
                Context context5 = view.getContext();
                context5.getClass();
                Object obj9 = this.a;
                mpj mpjVar = (mpj) obj9;
                String str2 = mpjVar.b;
                final jzu jzuVar = new jzu(obj9, this.b, 13, );
                while (true) {
                    if (context5 instanceof ContextWrapper) {
                        if (context5 instanceof by) {
                            byVar = (by) context5;
                        } else {
                            context5 = ((ContextWrapper) context5).getBaseContext();
                            context5.getClass();
                        }
                    }
                }
                if (byVar != null) {
                    final String str3 = mpjVar.a;
                    if (yks.e(str3, "MOVIES_SORT_OPTIONS")) {
                        yhb yhbVar = yhb.a;
                        Resources resources = byVar.getResources();
                        ImmutableList.Builder builder = ImmutableList.builder();
                        builder.addAll((Iterable) mpy.a);
                        builder.addAll((Iterable) yhbVar);
                        mvlVarB = mnu.b("MOVIES_SORT_OPTIONS", R.string.sort_movies_by, builder.build(), str2, resources);
                    } else {
                        yhb yhbVar2 = yhb.a;
                        Resources resources2 = byVar.getResources();
                        ImmutableList.Builder builder2 = ImmutableList.builder();
                        builder2.addAll((Iterable) mpy.b);
                        builder2.addAll((Iterable) yhbVar2);
                        mvlVarB = mnu.b("SHOWS_SORT_OPTIONS", R.string.sort_shows_by, builder2.build(), str2, resources2);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(mvlVarB);
                    mvk mvkVarA2 = mvk.a(arrayList2, "library_preference_dialog_key");
                    mvkVarA2.e = new mvj() { // from class: mpq
                        @Override // defpackage.mvj
                        public final void a(Map map) {
                            jzuVar.a(map.get(str3));
                        }
                    };
                    mvkVarA2.show(byVar.getSupportFragmentManager(), "LibrarySortOptionDialog");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ juu(sbx sbxVar, Object obj, int i) {
        this.c = i;
        this.b = sbxVar;
        this.a = obj;
    }
}
