package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import com.google.android.apps.play.movies.mobile.usecase.gtvsetup.ManageServicesActivity;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnu {
    public static void A(mwv mwvVar, pkg pkgVar, View view) {
        int i = mwvVar.i;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            wji wjiVarM = liq.m(kuf.a);
            pjr pjrVarB = ((pke) pkgVar.b).b(110034);
            pjrVarB.d(qtl.af(wjiVarM, vsz.b));
            pjrVarB.a(view);
            return;
        }
        if (i != 2) {
            if (i == 4) {
                wji wjiVarM2 = liq.m(kuf.a);
                pjr pjrVarB2 = ((pke) pkgVar.b).b(113887);
                pjrVarB2.d(qtl.af(wjiVarM2, vsz.b));
                pjrVarB2.a(view);
                return;
            }
            if (i == 5) {
                wji wjiVarM3 = liq.m(kuf.a);
                pjr pjrVarB3 = ((pke) pkgVar.b).b(113889);
                pjrVarB3.d(qtl.af(wjiVarM3, vsz.b));
                pjrVarB3.a(view);
                return;
            }
            return;
        }
        if (mwvVar.d) {
            wji wjiVarM4 = liq.m(((kxg) mwvVar.e.c()).c);
            pjr pjrVarB4 = ((pke) pkgVar.b).b(110034);
            pjrVarB4.d(qtl.af(wjiVarM4, vsz.b));
            pjrVarB4.a(view);
            return;
        }
        ksr ksrVar = ((kxg) mwvVar.e.c()).d;
        vtw vtwVarM = wik.a.m();
        wij wijVar = wij.ANDROID_APP;
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        vuc vucVar = vtwVarM.b;
        wik wikVar = (wik) vucVar;
        wikVar.c = wijVar.q;
        wikVar.b |= 1;
        wii wiiVar = wii.YOUTUBE_ID;
        if (!vucVar.A()) {
            vtwVarM.u();
        }
        vuc vucVar2 = vtwVarM.b;
        wik wikVar2 = (wik) vucVar2;
        wikVar2.d = wiiVar.h;
        wikVar2.b |= 2;
        if (!vucVar2.A()) {
            vtwVarM.u();
        }
        String str = ksrVar.b;
        wik wikVar3 = (wik) vtwVarM.b;
        wikVar3.b = 4 | wikVar3.b;
        wikVar3.e = str;
        wik wikVar4 = (wik) vtwVarM.r();
        vtw vtwVarM2 = wji.a.m();
        if (!vtwVarM2.b.A()) {
            vtwVarM2.u();
        }
        wji wjiVar = (wji) vtwVarM2.b;
        wikVar4.getClass();
        wjiVar.c = wikVar4;
        wjiVar.b |= 1;
        wji wjiVar2 = (wji) vtwVarM2.r();
        pjr pjrVarB5 = ((pke) pkgVar.b).b(113888);
        pjrVarB5.d(qtl.af(wjiVar2, vsz.b));
        pjrVarB5.a(view);
    }

    public static ifc B(ieh iehVar, pkg pkgVar) {
        iff iffVar = new iff();
        iffVar.f(R.layout.gtv_details_action_panel);
        iffVar.c = new mxj(iehVar, pkgVar, 1);
        iffVar.g(ksd.a());
        iffVar.d();
        return iffVar.c();
    }

    public static int C(kvf kvfVar, int i, boolean z) {
        if (!kvfVar.V()) {
            return 3;
        }
        if (kvfVar.R() == 0) {
            return 2;
        }
        if (i == 0) {
            if (z) {
                return 1;
            }
            i = 0;
        }
        return kvfVar.R() > i ? 3 : 2;
    }

    private static final List D(List list) {
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sev sevVar = (sev) it.next();
            String str = sevVar.a;
            seu seuVarA = kky.a();
            seuVarA.u(str);
            seuVarA.w(sevVar.b);
            seuVarA.p(sevVar.c);
            seuVarA.x(sevVar.g);
            seuVarA.q(sevVar.f);
            ImmutableList immutableList = sevVar.h;
            immutableList.getClass();
            seuVarA.o(D(immutableList));
            arrayList.add(seuVarA.n());
        }
        return arrayList;
    }

    private static ieg E(kxg kxgVar, tst tstVar, lio lioVar, String str, boolean z, pjx pjxVar) {
        boolean zC = kxg.c(kxgVar);
        qsl qslVarA = mwu.a();
        nhx nhxVarA = mwv.a();
        nhxVarA.g(str);
        nhxVarA.a = zC ? 3 : 2;
        nhxVarA.e = zC ? trk.a : tst.i(kxgVar);
        nhxVarA.e(new lif(liq.g(600, kxgVar.c), lioVar));
        nhxVarA.g = tstVar;
        nhxVarA.d = zC ? trk.a : tst.i(kxgVar.d);
        nhxVarA.h = z ? tst.i(Integer.valueOf(R.drawable.ic_play_arrow_24px)) : trk.a;
        qslVarA.b = nhxVarA.d();
        qslVarA.a = tst.i(pjxVar);
        return ieg.f(qslVarA.d());
    }

    private static tst F(kvo kvoVar, ktz ktzVar, Context context) {
        Resources resources = context.getResources();
        kvm kvmVar = kvoVar.h;
        if (!ktzVar.e(kvmVar)) {
            return trk.a;
        }
        if ((!kvoVar.e() || !ktzVar.f()) && (kvmVar != kvm.TYPE_RENTAL || !ktzVar.g())) {
            return tst.i(mww.a(resources.getString(R.string.discount_available)).c());
        }
        nwo nwoVarA = mww.a(resources.getString(R.string.list_price_strikethrough));
        nwoVarA.b = tst.i(kvoVar.k);
        return tst.i(nwoVarA.c());
    }

    public static final Intent a(Context context, boolean z, lid lidVar) {
        context.getClass();
        lidVar.getClass();
        Intent intent = new Intent(context, (Class<?>) ManageServicesActivity.class);
        intent.putExtra("re_setup_flag", z);
        intent.putExtra("parent_event_id", lidVar);
        return intent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mvl b(java.lang.String r5, int r6, com.google.common.collect.ImmutableList r7, java.lang.String r8, android.content.res.Resources r9) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.common.collect.UnmodifiableIterator r7 = r7.iterator()
        L9:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 2132018797(0x7f14066d, float:1.967591E38)
            r4 = 2132018799(0x7f14066f, float:1.9675915E38)
            switch(r2) {
                case -2104276919: goto L84;
                case -2025240516: goto L72;
                case -2013750809: goto L5d;
                case -1767346570: goto L4b;
                case -582617553: goto L39;
                case -452724124: goto L24;
                default: goto L22;
            }
        L22:
            goto L96
        L24:
            java.lang.String r2 = "MOVIE_RELEASE_YEAR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = 2132018798(0x7f14066e, float:1.9675913E38)
            java.lang.String r1 = r9.getString(r1)
            mvg r3 = new mvg
            r3.<init>(r2, r1)
            goto L97
        L39:
            java.lang.String r2 = "SHOW_ADDED_DATE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            java.lang.String r1 = r9.getString(r3)
            mvg r3 = new mvg
            r3.<init>(r2, r1)
            goto L97
        L4b:
            java.lang.String r2 = "SHOW_TITLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            java.lang.String r1 = r9.getString(r4)
            mvg r3 = new mvg
            r3.<init>(r2, r1)
            goto L97
        L5d:
            java.lang.String r2 = "MOVIES_DATE_UPGRADE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            r1 = 2132018800(0x7f140670, float:1.9675917E38)
            java.lang.String r1 = r9.getString(r1)
            mvg r3 = new mvg
            r3.<init>(r2, r1)
            goto L97
        L72:
            java.lang.String r2 = "MOVIE_ADDED_DATE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            java.lang.String r1 = r9.getString(r3)
            mvg r3 = new mvg
            r3.<init>(r2, r1)
            goto L97
        L84:
            java.lang.String r2 = "MOVIE_TITLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
            java.lang.String r1 = r9.getString(r4)
            mvg r3 = new mvg
            r3.<init>(r2, r1)
            goto L97
        L96:
            r3 = 0
        L97:
            if (r3 == 0) goto L9
            r0.add(r3)
            goto L9
        L9e:
            nag r7 = defpackage.mvl.b()
            r7.d = r5
            java.lang.String r5 = r9.getString(r6)
            r7.j(r5)
            r7.i(r0)
            r7.h(r8)
            mvl r5 = r7.g()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mnu.b(java.lang.String, int, com.google.common.collect.ImmutableList, java.lang.String, android.content.res.Resources):mvl");
    }

    public static void c(ieh iehVar, ieh iehVar2, lhm lhmVar, mdy mdyVar, idy idyVar, cr crVar, View view) {
        kff.p(view, myh.class, new mna(iehVar, iehVar2, crVar, lhmVar, 2));
        kff.p(view, mwg.class, new mmn(mdyVar, idyVar, 4));
        kff.p(view, myf.class, new kad(lhmVar, 15));
    }

    public static liq d(mxe mxeVar) {
        return liq.g(609, mxeVar.a);
    }

    public static void e(ieh iehVar, idr idrVar, idt idtVar, ieh iehVar2, cr crVar, SharedPreferences sharedPreferences, View view, pjx pjxVar) {
        mmo mmoVar = new mmo(iehVar2, 4);
        mmo mmoVar2 = new mmo(iehVar2, 5);
        kff.p(view, mxi.class, new mmn(idrVar, mmoVar, 3, null));
        kff.p(view, mxg.class, new mmz(pjxVar, view, iehVar, sharedPreferences, idtVar, crVar, mmoVar2, 1));
        kff.p(view, mxh.class, new kad(mmoVar, 12));
    }

    public static final kkv f(ser serVar) {
        List<ses> list = serVar.b;
        ArrayList arrayList = new ArrayList(yfm.z(list, 10));
        for (ses sesVar : list) {
            String str = sesVar.a;
            kvw kvwVarA = kkw.a();
            kvwVarA.f(str);
            kvwVarA.e(sesVar.b);
            ImmutableList immutableList = sesVar.c;
            immutableList.getClass();
            kvwVarA.d(D(immutableList));
            arrayList.add(kvwVarA.c());
        }
        List listAl = yfm.al(arrayList);
        Set set = serVar.c;
        ArrayList arrayList2 = new ArrayList(yfm.z(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList2.add(new kkx(new HashSet(((set) it.next()).a)));
        }
        return new kkv(serVar.a, listAl, yfm.aq(arrayList2));
    }

    public static final void g(ieh iehVar, mcy mcyVar, oxe oxeVar, ksy ksyVar, boolean z, boolean z2, lio lioVar, View view, Resources resources, String str, int i) throws Resources.NotFoundException {
        if (z && z2) {
            oxeVar.e(resources.getString(R.string.user_feedback_option_not_available_toast), lioVar);
            return;
        }
        mcyVar.a((ksn) ((ldy) iehVar).a().g(), ksyVar, z, i, str);
        String string = resources.getString(z ? R.string.user_feedback_add_wishlist_toast : R.string.user_feedback_remove_wishlist_toast);
        tst tstVarI = tst.i(lioVar);
        trk trkVar = trk.a;
        h(oxeVar, string, new miv(mcyVar, iehVar, ksyVar, z, str, tstVarI, 37, view, trkVar, trkVar), view, lioVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, mwb] */
    /* JADX WARN: Type inference failed for: r5v3, types: [idf, java.lang.Object] */
    public static void h(oxe oxeVar, String str, View.OnClickListener onClickListener, View view, lio lioVar) {
        mqy mqyVar = new mqy(view, 1);
        lioVar.d(liq.e(519));
        ?? B = oxeVar.b.b(str);
        B.c(R.string.undo_dismissal, onClickListener, mqyVar);
        oxeVar.d(B, lioVar);
    }

    public static void i(final iea ieaVar, lie lieVar, mcd mcdVar, final mcy mcyVar, final oxe oxeVar, final Resources resources, final String str, final int i, View view) {
        kff.p(view, nam.class, new mni(oxeVar, resources, ieaVar, lieVar, str, mcdVar, 2));
        kff.p(view, nal.class, new mni(oxeVar, resources, ieaVar, lieVar, str, mcdVar, 0));
        kff.p(view, nan.class, new lhg() { // from class: mnj
            @Override // defpackage.lhg
            public final void a(lhf lhfVar) throws Resources.NotFoundException {
                nan nanVar = (nan) lhfVar;
                lio lioVar = nanVar.e;
                nqq.d(lioVar);
                mnu.g(ieaVar, mcyVar, oxeVar, nanVar.a, !nanVar.b, nanVar.c, ((lif) lioVar).a, nanVar.d, resources, str, i);
            }
        });
    }

    public static final mxr j(kuo kuoVar, int i, boolean z, boolean z2, boolean z3, Context context, boolean z4) {
        mxr mxrVarA = mxs.a();
        mxrVarA.c(kuoVar);
        mxrVarA.d(i);
        mxrVarA.j(z3);
        mxrVarA.h(z2);
        mxrVarA.l(z);
        mxrVarA.i(z4);
        mxrVarA.e = tst.i(Integer.valueOf(R.drawable.ic_unavailable));
        mxrVarA.f = tst.i(context.getString(R.string.details_unavailable));
        return mxrVarA;
    }

    public static mxd k(Resources resources, boolean z, boolean z2, boolean z3) throws Resources.NotFoundException {
        Uri uri;
        mxd mxdVarA = mxe.a();
        mxdVarA.g(resources.getString(z3 ? R.string.gtv_application_name : R.string.application_name_with_tv));
        int i = true != z3 ? R.drawable.ic_play_movies_round : 2131231636;
        Executor executor = ksk.a;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(i) + "/" + resources.getResourceTypeName(i) + "/" + resources.getResourceEntryName(i));
        } catch (Exception unused) {
            uri = Uri.EMPTY;
        }
        mxdVarA.d(uri);
        mxdVarA.e(z);
        mxdVarA.f(z2);
        return mxdVarA;
    }

    public static ieg l(String str) {
        return p(str) ? ieg.f(Integer.valueOf(mwy.a(str).h)) : ieg.a;
    }

    public static ieg m(String str) {
        return p(str) ? ieg.f(Integer.valueOf(mwy.a(str).g)) : ieg.a;
    }

    public static ieg n(String str) {
        return q(str) ? ieg.f(Integer.valueOf(mwz.a(str).k)) : ieg.a;
    }

    public static ieg o(String str) {
        return q(str) ? ieg.f(Integer.valueOf(mwz.a(str).j)) : ieg.a;
    }

    public static boolean p(String str) {
        for (mwy mwyVar : mwy.values()) {
            if (mwyVar.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(String str) {
        for (mwz mwzVar : mwz.values()) {
            if (mwzVar.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? "DISPLAY_NON_AVOD_WATCH_ACTION" : "DISPLAY_AVOD_WATCH_ACTION" : "DISPLAY_BIRTHDATE_ENTRY";
    }

    public static ieg s(kuf kufVar, List list) {
        if (list.isEmpty()) {
            return ieg.b;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kxg kxgVar = (kxg) it.next();
            if (kufVar.equals(kxgVar.c)) {
                return ieg.f(kxgVar);
            }
        }
        return ieg.b;
    }

    public static ieg t(kxg kxgVar, tst tstVar, String str, lio lioVar, Context context, boolean z, boolean z2, pjx pjxVar) {
        kxg kxgVar2;
        tst tstVar2;
        lio lioVar2;
        pjx pjxVar2;
        boolean z3;
        boolean z4 = z2 && !kxgVar.h;
        String string = context.getString(R.string.details_watch_on, str);
        if (!z || z4) {
            kxgVar2 = kxgVar;
            tstVar2 = tstVar;
            lioVar2 = lioVar;
            pjxVar2 = pjxVar;
            z3 = false;
        } else {
            kxgVar2 = kxgVar;
            tstVar2 = tstVar;
            lioVar2 = lioVar;
            pjxVar2 = pjxVar;
            z3 = true;
        }
        return E(kxgVar2, tstVar2, lioVar2, string, z3, pjxVar2);
    }

    public static ieg u(kwi kwiVar, ieh iehVar, lio lioVar, Context context, pjx pjxVar) {
        if (ksx.a((List) kwiVar.j().h(Collections.EMPTY_LIST)).c) {
            return ieg.a;
        }
        boolean zA = ((kxi) iehVar.a()).a(((kst) kwiVar).o());
        qsl qslVarA = mwu.a();
        qslVarA.a = tst.i(pjxVar);
        nhx nhxVarA = mwv.a();
        nhxVarA.g(context.getString(zA ? R.string.remove_from_wishlist : R.string.add_to_wishlist));
        nhxVarA.a = true != zA ? 9 : 10;
        nhxVarA.e(new lif(zA ? lip.f : lip.e, lioVar));
        nhxVarA.f(true);
        qslVarA.b = nhxVarA.d();
        return ieg.f(qslVarA.d());
    }

    static mwv v(kvo kvoVar, ktz ktzVar, lio lioVar, Context context, boolean z) {
        tst tstVarF = F(kvoVar, ktzVar, context);
        nhx nhxVarA = mwv.a();
        nhxVarA.g(kdw.C(context, kvoVar, ktzVar.g(), z ? R.string.rent_at_sd_season : R.string.rent_at_sd, true != z ? R.string.rent_at_hd : R.string.rent_at_hd_season, true != z ? R.string.rent_at_uhd : R.string.rent_at_uhd_season, true != z ? R.string.rent_from : R.string.rent_full_season_from));
        nhxVarA.a = 5;
        nhxVarA.e(new lif(tstVarF.g() ? liq.k(605) : lip.i, lioVar));
        nhxVarA.i = tstVarF;
        nhxVarA.f(true);
        return nhxVarA.d();
    }

    public static boolean w(kxg kxgVar, kuf kufVar, kva kvaVar, kuo kuoVar) {
        return kxgVar.c.equals(kufVar) && kvaVar.b(kuoVar.c).b;
    }

    public static boolean x(kuo kuoVar, kva kvaVar) {
        int i = kuoVar.l;
        kvc kvcVarB = kvaVar.b(kuoVar.c);
        if (i == kuoVar.m) {
            i -= 5;
        }
        return kvcVarB.d > i;
    }

    public static ieg y(kst kstVar, tst tstVar, ieh iehVar, int i, Context context, lio lioVar, boolean z, boolean z2, boolean z3, pjx pjxVar) {
        kvc kvcVarA = ((kva) iehVar.a()).a(kstVar);
        if (kvcVarA.b) {
            return E(kxg.a, tstVar, lioVar, context.getString(i), z3, pjxVar);
        }
        ktz ktzVarDW = ((kvz) kstVar).dW();
        ieg iegVar = ktzVarDW.d;
        ieg iegVar2 = ktzVarDW.c;
        if (z && kvcVarA.f) {
            qsl qslVarA = mwu.a();
            nhx nhxVarA = mwv.a();
            nhxVarA.g(context.getString(R.string.preorder_cancel));
            nhxVarA.a = 7;
            nhxVarA.e(new lif(lip.k, lioVar));
            nhxVarA.f(true);
            qslVarA.b = nhxVarA.d();
            qslVarA.f(z3);
            qslVarA.a = tst.i(pjxVar);
            return ieg.f(qslVarA.d());
        }
        if (iegVar.m()) {
            qsl qslVarA2 = mwu.a();
            kvo kvoVar = (kvo) iegVar.g();
            tst tstVarF = F(kvoVar, ktzVarDW, context);
            nhx nhxVarA2 = mwv.a();
            nhxVarA2.g(kdw.C(context, kvoVar, ktzVarDW.f(), z2 ? R.string.buy_at_sd_season : R.string.buy_at_sd, true != z2 ? R.string.buy_at_hd : R.string.buy_at_hd_season, true != z2 ? R.string.buy_at_uhd : R.string.buy_at_uhd_season, true != z2 ? R.string.buy_from : R.string.buy_full_season_from));
            nhxVarA2.a = 4;
            nhxVarA2.e(new lif(tstVarF.g() ? liq.k(604) : lip.h, lioVar));
            nhxVarA2.i = tstVarF;
            nhxVarA2.f(true);
            qslVarA2.b = nhxVarA2.d();
            qslVarA2.c = iegVar2.m() ? tst.i(v((kvo) iegVar2.g(), ktzVarDW, lioVar, context, z2)) : trk.a;
            qslVarA2.e(ktzVarDW.e(kvm.TYPE_PURCHASE) && ktzVarDW.e(kvm.TYPE_RENTAL) && !ktzVarDW.g() && !ktzVarDW.f());
            qslVarA2.f(z3);
            qslVarA2.a = tst.i(pjxVar);
            return ieg.f(qslVarA2.d());
        }
        if (iegVar2.m()) {
            qsl qslVarA3 = mwu.a();
            qslVarA3.b = v((kvo) iegVar2.g(), ktzVarDW, lioVar, context, z2);
            qslVarA3.f(z3);
            qslVarA3.a = tst.i(pjxVar);
            return ieg.f(qslVarA3.d());
        }
        if (z) {
            ieg iegVar3 = ktzVarDW.e;
            if (iegVar3.m()) {
                kvo kvoVar2 = (kvo) iegVar3.g();
                boolean z4 = ktzVarDW.j == 1;
                qsl qslVarA4 = mwu.a();
                nhx nhxVarA3 = mwv.a();
                nhxVarA3.g(kdw.C(context, kvoVar2, z4, R.string.preorder_sd, R.string.preorder_hd, R.string.preorder_uhd, R.string.preorder_from));
                nhxVarA3.a = 6;
                nhxVarA3.e(new lif(lip.j, lioVar));
                nhxVarA3.f(true);
                qslVarA4.b = nhxVarA3.d();
                qslVarA4.f(z3);
                qslVarA4.a = tst.i(pjxVar);
                return ieg.f(qslVarA4.d());
            }
        }
        return ieg.a;
    }

    public static final void z(Map map, Resources resources) {
        map.put(Integer.valueOf(R.layout.gtv_details_action_panel), new tid(resources.getInteger(R.integer.details_grid_column_span_half_screen_on_large_device), resources.getInteger(R.integer.details_section_row_span_default)));
        map.put(Integer.valueOf(R.layout.details_action_panel), new tid(resources.getInteger(R.integer.details_grid_column_span_half_screen_on_large_device), resources.getInteger(R.integer.details_section_row_span_default)));
    }
}
