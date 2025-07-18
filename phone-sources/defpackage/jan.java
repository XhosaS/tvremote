package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.apps.googletv.app.presentation.pages.aioverview.AiOverviewActivity;
import com.google.android.apps.googletv.app.presentation.pages.entitypurchase.EntityPurchasePageActivity;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.apps.googletv.app.presentation.pages.providerselectionmenu.ProviderSelectionMenuFragment;
import com.google.android.apps.googletv.app.presentation.pages.purchase.PrePurchaseBottomSheetFragment;
import com.google.android.apps.googletv.app.presentation.pages.search.SearchResultsPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.search.v2.SearchQueryPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.virtualremote.activities.VirtualRemoteActivity;
import com.google.android.videos.R;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jan {
    public final iea a;
    public final ldv b;
    public final lie c;
    public final itk d;
    public final lfn e;
    public final yow f;
    public final isn g;
    public final kdj h;
    private final Class i;
    private final iyz j;
    private final mbk k;
    private final irc l;
    private final gag m;

    public jan(iea ieaVar, ldv ldvVar, isn isnVar, lie lieVar, mbk mbkVar, itk itkVar, gag gagVar, lfn lfnVar, irc ircVar, iyz iyzVar, kdj kdjVar, yow yowVar) {
        ldvVar.getClass();
        isnVar.getClass();
        lieVar.getClass();
        itkVar.getClass();
        gagVar.getClass();
        lfnVar.getClass();
        ircVar.getClass();
        iyzVar.getClass();
        kdjVar.getClass();
        yowVar.getClass();
        this.a = ieaVar;
        this.b = ldvVar;
        this.g = isnVar;
        this.c = lieVar;
        this.k = mbkVar;
        this.d = itkVar;
        this.m = gagVar;
        this.e = lfnVar;
        this.l = ircVar;
        this.j = iyzVar;
        this.h = kdjVar;
        this.f = yowVar;
        this.i = SearchQueryPageActivity.class;
    }

    public static final void e(Context context, wql wqlVar, long j) {
        Intent intent = new Intent().setClass(context, AiOverviewActivity.class);
        intent.getClass();
        hju.B(intent, context);
        intent.addFlags(536870912);
        hju.A(intent, "ai_overview_component", wqlVar);
        intent.putExtra("dynamic_seed_color", j);
        context.startActivity(intent);
    }

    public static final void f(Context context, wni wniVar) {
        Intent intent = new Intent().setClass(context, MyEpisodesActivity.class);
        intent.getClass();
        hju.B(intent, context);
        hju.A(intent, "show_play_id", wniVar);
        context.startActivity(intent);
    }

    public static final void g(Context context, wll wllVar, String str, Bundle bundle) {
        by byVarF = hju.F(context);
        if (byVarF != null) {
            hju.I(bundle, "entity_id", wllVar);
            bundle.putString("provider_selection_menu_title", str);
            ProviderSelectionMenuFragment providerSelectionMenuFragment = new ProviderSelectionMenuFragment();
            providerSelectionMenuFragment.setArguments(bundle);
            providerSelectionMenuFragment.show(byVarF.getSupportFragmentManager(), "provider_selection_menu");
        }
    }

    public static final void j(Context context, String str, String str2) {
        str.getClass();
        Intent intent = new Intent().setClass(context, SearchResultsPageActivity.class);
        intent.putExtra("search_query", str);
        intent.putExtra("referrer", str2);
        intent.getClass();
        hju.B(intent, context);
        intent.addFlags(65536);
        context.startActivity(intent);
    }

    public static final void k(Context context, ArrayList arrayList) {
        by byVarF = hju.F(context);
        if (byVarF != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("season_selection_menu_items", arrayList);
            kfk kfkVar = new kfk();
            kfkVar.setArguments(bundle);
            kfkVar.show(byVarF.getSupportFragmentManager(), "season_selection_menu");
        }
    }

    public static final void l(Context context, wll wllVar) {
        Intent intent = new Intent().setClass(context, EntityPurchasePageActivity.class);
        intent.getClass();
        hju.B(intent, context);
        hju.A(intent, "entity_id", wllVar);
        context.startActivity(intent);
    }

    public static final void m(Context context) {
        Intent intent = new Intent().setClass(context, VirtualRemoteActivity.class);
        intent.getClass();
        hju.B(intent, context);
        context.startActivity(intent);
    }

    public static final void r(Context context, wll wllVar, String str) {
        g(context, wllVar, str, new Bundle());
    }

    private final void t(Context context, wpm wpmVar, yjk yjkVar) {
        itk itkVar = this.d;
        if (itkVar.f().size() == 1) {
            ith ithVar = (ith) yfm.S(itkVar.f());
            if (ithVar.o()) {
                itkVar.k(ithVar);
                yjkVar.a();
                return;
            }
        }
        ith ithVarE = itkVar.e();
        if (ithVarE == null || ithVarE.l(wpmVar)) {
            b(context, wpmVar, yjkVar);
            return;
        }
        ssn ssnVar = new ssn(context);
        ssnVar.o(R.string.device_cannot_play_prompt_title);
        Resources resources = context.getResources();
        ith ithVarE2 = itkVar.e();
        ssnVar.e(resources.getString(R.string.device_cannot_play_prompt_body, ithVarE2 != null ? ((iua) ithVarE2).c : null));
        ssnVar.g(R.string.device_cannot_play_prompt_cancel, new ixr(4));
        ssnVar.l(R.string.device_cannot_play_prompt_positive, new ixq(this, context, wpmVar, yjkVar, 3));
        ssnVar.show();
    }

    private final boolean u(wpm wpmVar) {
        ith ithVarE = this.d.e();
        return ithVarE != null && ithVarE.l(wpmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final defpackage.wkg v(defpackage.wnp r4, defpackage.kmc r5, defpackage.wpc r6, defpackage.wll r7) {
        /*
            wkg r0 = defpackage.wkg.a
            vtw r0 = r0.m()
            vty r0 = (defpackage.vty) r0
            r0.getClass()
            wkf r1 = defpackage.wkf.PURCHASE_FLOW_ACTION
            defpackage.wae.n(r1, r0)
            vvd r1 = defpackage.wqc.h
            r1.getClass()
            wqc r2 = defpackage.wqc.a
            vtw r2 = r2.m()
            r2.getClass()
            wni r3 = defpackage.ihz.o(r4)
            if (r3 != 0) goto L29
            wni r3 = defpackage.wni.a
            r3.getClass()
        L29:
            defpackage.wxe.q(r3, r2)
            vun r4 = r4.c
            r4.getClass()
            java.lang.Object r4 = defpackage.yfm.S(r4)
            wpm r4 = (defpackage.wpm) r4
            java.lang.String r3 = ""
            if (r4 == 0) goto L47
            wpl r4 = r4.g
            if (r4 != 0) goto L41
            wpl r4 = defpackage.wpl.a
        L41:
            if (r4 == 0) goto L47
            java.lang.String r4 = r4.f
            if (r4 != 0) goto L48
        L47:
            r4 = r3
        L48:
            defpackage.wxe.r(r4, r2)
            int r4 = r5.d
            long r4 = (long) r4
            defpackage.wxe.p(r4, r2)
            wng r4 = r6.g
            if (r4 != 0) goto L57
            wng r4 = defpackage.wng.a
        L57:
            int r4 = r4.d
            wpk r4 = defpackage.wpk.b(r4)
            if (r4 != 0) goto L61
            wpk r4 = defpackage.wpk.UNRECOGNIZED
        L61:
            java.lang.String r4 = r4.name()
            defpackage.wxe.o(r4, r2)
            int r4 = r7.b
            r5 = 1
            if (r4 != r5) goto L72
            java.lang.Object r4 = r7.c
            r3 = r4
            java.lang.String r3 = (java.lang.String) r3
        L72:
            r3.getClass()
            defpackage.wxe.n(r3, r2)
            wqc r4 = defpackage.wxe.m(r2)
            r0.bL(r1, r4)
            wkg r4 = defpackage.wae.m(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jan.v(wnp, kmc, wpc, wll):wkg");
    }

    private static final wpc w(wpm wpmVar) {
        Object next;
        vun vunVar = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).b;
        vunVar.getClass();
        Iterator<E> it = vunVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            wpc wpcVar = (wpc) next;
            if ((wpcVar.c == 2 ? (wpa) wpcVar.d : wpa.a).d) {
                break;
            }
            if ((wpcVar.c == 3 ? (wpb) wpcVar.d : wpb.a).b) {
                break;
            }
        }
        wpc wpcVar2 = (wpc) next;
        if (wpcVar2 != null) {
            return wpcVar2;
        }
        Object objS = yfm.S(vunVar);
        objS.getClass();
        return (wpc) objS;
    }

    private static final boolean x(wpm wpmVar) {
        vun<wnt> vunVar = (wpmVar.c == 4 ? (woz) wpmVar.d : woz.a).c;
        vunVar.getClass();
        if (vunVar.isEmpty()) {
            return false;
        }
        for (wnt wntVar : vunVar) {
            if (wntVar.c == 2 && (((wnr) wntVar.d).b & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean y(wpm wpmVar) {
        wpl wplVar = wpmVar.g;
        if (wplVar == null) {
            wplVar = wpl.a;
        }
        wni wniVar = wplVar.c;
        if (wniVar == null) {
            wniVar = wni.a;
        }
        int iAU = a.aU(wniVar.c);
        return iAU != 0 && iAU == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r8, defpackage.woi r9, defpackage.yih r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.jam
            if (r0 == 0) goto L13
            r0 = r10
            jam r0 = (defpackage.jam) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            jam r0 = new jam
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kfz r8 = r0.f
            android.os.Bundle r9 = r0.e
            java.lang.Object r0 = r0.a
            defpackage.ybn.f(r10)
            goto La7
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            defpackage.ybn.f(r10)
            by r8 = defpackage.hju.F(r8)
            if (r8 != 0) goto L42
            ygi r8 = defpackage.ygi.a
            return r8
        L42:
            android.os.Bundle r10 = new android.os.Bundle
            r10.<init>()
            java.lang.String r2 = "sharing_info"
            defpackage.hju.I(r10, r2, r9)
            kfz r2 = new kfz
            r2.<init>()
            wkx r4 = r9.e
            if (r4 != 0) goto L57
            wkx r4 = defpackage.wkx.a
        L57:
            vvd r5 = defpackage.wse.g
            r4.i(r5)
            vtr r4 = r4.l
            java.lang.Object r6 = r5.c
            vub r6 = (defpackage.vub) r6
            boolean r4 = r4.m(r6)
            wkx r9 = r9.e
            if (r9 != 0) goto L6c
            wkx r9 = defpackage.wkx.a
        L6c:
            r9.i(r5)
            vtr r9 = r9.l
            java.lang.Object r9 = r9.k(r6)
            if (r9 != 0) goto L7a
            java.lang.Object r9 = r5.b
            goto L7d
        L7a:
            r5.c(r9)
        L7d:
            r9.getClass()
            wse r9 = (defpackage.wse) r9
            if (r4 == 0) goto Lbb
            int r4 = r9.b
            r4 = r4 & r3
            if (r4 == 0) goto Lbb
            wlx r9 = r9.c
            if (r9 != 0) goto L8f
            wlx r9 = defpackage.wlx.a
        L8f:
            r9.getClass()
            iyz r4 = r7.j
            r0.a = r8
            r0.e = r10
            r0.f = r2
            r0.d = r3
            java.lang.Object r9 = defpackage.jbr.ac(r4, r9, r0)
            if (r9 == r1) goto Lba
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r8 = r2
        La7:
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 == 0) goto Lb0
            java.lang.String r10 = r10.toString()
            goto Lb1
        Lb0:
            r10 = 0
        Lb1:
            java.lang.String r1 = "sharing_poster_file_uri"
            r9.putString(r1, r10)
            r2 = r8
            r10 = r9
            r8 = r0
            goto Lbb
        Lba:
            return r1
        Lbb:
            r2.setArguments(r10)
            by r8 = (defpackage.by) r8
            cr r8 = r8.getSupportFragmentManager()
            java.lang.String r9 = "sharing_dialog"
            r2.show(r8, r9)
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jan.a(android.content.Context, woi, yih):java.lang.Object");
    }

    public final void b(Context context, wpm wpmVar, yjk yjkVar) {
        jal jalVar = new jal(this, yjkVar);
        itk itkVar = this.d;
        itkVar.g(jalVar);
        new iui(context, itkVar, new ill(wpmVar, 7), new isg(this, jalVar, 6, null), 36).i();
    }

    public final void c(Context context, wll wllVar, String str, String str2, String str3, String str4) {
        str2.getClass();
        str3.getClass();
        if (!hju.u(wllVar)) {
            this.g.b(wllVar, "play-movies");
        }
        hju.G(context).d(hju.F(context), str, str2, str3, str4);
    }

    public final boolean d() {
        ith ithVarE = this.d.e();
        return (ithVarE == null || ((iua) ithVarE).d) ? false : true;
    }

    public final void h(Context context) {
        context.getClass();
        Intent intent = new Intent().setClass(context, this.i);
        intent.getClass();
        hju.B(intent, context);
        intent.addFlags(65536);
        intent.putExtra("referrer", "");
        context.startActivity(intent);
    }

    public final void i(Context context, String str) {
        context.getClass();
        Intent intent = new Intent().setClass(context, this.i);
        intent.putExtra("search_query", str);
        intent.putExtra("referrer", "");
        intent.getClass();
        hju.B(intent, context);
        intent.addFlags(65536);
        context.startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r10v5, types: [idr, java.lang.Object] */
    public final int n(wll wllVar, String str, wpm wpmVar) {
        if (!hju.u(wllVar)) {
            this.g.b(wllVar, str);
        }
        itk itkVar = this.d;
        if (!itkVar.m(wpmVar)) {
            return 2;
        }
        lie lieVar = this.c;
        wik wikVarS = hju.s(wllVar, null);
        wld wldVar = wpmVar.h;
        if (wldVar == null) {
            wldVar = wld.a;
        }
        lieVar.am(wikVarS, wldVar.b, str, null, null, itkVar.e());
        this.m.e.c(true);
        return 1;
    }

    /* JADX WARN: Type inference failed for: r13v32, types: [idr, java.lang.Object] */
    public final int o(Context context, wll wllVar, String str, wpm wpmVar, String str2, boolean z) {
        if (!hju.u(wllVar)) {
            this.g.b(wllVar, str);
        }
        if (z || !d()) {
            kpz kpzVarG = hju.G(context);
            by byVarF = hju.F(context);
            wpl wplVar = wpmVar.g;
            if (wplVar == null) {
                wplVar = wpl.a;
            }
            wni wniVar = wplVar.c;
            if (wniVar == null) {
                wniVar = wni.a;
            }
            String str3 = wniVar.b;
            wpl wplVar2 = wpmVar.g;
            wni wniVar2 = (wplVar2 == null ? wpl.a : wplVar2).e;
            if (wniVar2 == null) {
                wniVar2 = wni.a;
            }
            String str4 = wniVar2.b;
            if (wplVar2 == null) {
                wplVar2 = wpl.a;
            }
            wni wniVar3 = wplVar2.d;
            if (wniVar3 == null) {
                wniVar3 = wni.a;
            }
            kpzVarG.d(byVarF, str3, str4, wniVar3.b, str2);
        } else {
            if (!this.d.m(wpmVar)) {
                return 5;
            }
            this.m.e.c(true);
        }
        lie lieVar = this.c;
        wpl wplVar3 = wpmVar.g;
        if (wplVar3 == null) {
            wplVar3 = wpl.a;
        }
        wni wniVar4 = wplVar3.c;
        if (wniVar4 == null) {
            wniVar4 = wni.a;
        }
        wik wikVarS = hju.s(wllVar, wniVar4);
        wld wldVar = wpmVar.e;
        if (wldVar == null) {
            wldVar = wld.a;
        }
        lieVar.am(wikVarS, wldVar.b, str, null, null, z ? this.d.d() : this.d.e());
        return 4;
    }

    /* JADX WARN: Type inference failed for: r10v21, types: [idr, java.lang.Object] */
    public final int p(Context context, wll wllVar, String str, wpm wpmVar, String str2, boolean z) {
        if (!hju.u(wllVar)) {
            this.g.b(wllVar, str);
        }
        if (z || !d()) {
            kpz kpzVarG = hju.G(context);
            by byVarF = hju.F(context);
            wpl wplVar = wpmVar.g;
            if (wplVar == null) {
                wplVar = wpl.a;
            }
            wni wniVar = wplVar.c;
            if (wniVar == null) {
                wniVar = wni.a;
            }
            kpzVarG.g(byVarF, wniVar.b, str2);
        } else {
            if (!this.d.m(wpmVar)) {
                return 5;
            }
            this.m.e.c(true);
        }
        lie lieVar = this.c;
        wpl wplVar2 = wpmVar.g;
        if (wplVar2 == null) {
            wplVar2 = wpl.a;
        }
        wni wniVar2 = wplVar2.c;
        if (wniVar2 == null) {
            wniVar2 = wni.a;
        }
        wik wikVarS = hju.s(wllVar, wniVar2);
        wld wldVar = wpmVar.e;
        if (wldVar == null) {
            wldVar = wld.a;
        }
        lieVar.am(wikVarS, wldVar.b, str, null, null, z ? this.d.d() : this.d.e());
        return 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int q(android.content.Context r10, defpackage.wll r11, java.lang.String r12, defpackage.wpm r13, java.lang.String r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jan.q(android.content.Context, wll, java.lang.String, wpm, java.lang.String, boolean):int");
    }

    public final int s(Context context, wll wllVar, wnp wnpVar, wpm wpmVar, boolean z) {
        if ((wpmVar.b & 4) == 0 || !ihz.B(wpmVar) || x(wpmVar) || a.ba(wpmVar)) {
            wno wnoVar = wnpVar.b;
            if (wnoVar == null) {
                wnoVar = wno.a;
            }
            String str = wnoVar.b;
            str.getClass();
            return q(context, wllVar, str, wpmVar, "details", z);
        }
        by byVarF = hju.F(context);
        byVarF.getClass();
        kmc kmcVar = w(wpmVar).c == 3 ? kmc.b : w(wpmVar).c == 2 ? kmc.a : kmc.c;
        if (kmcVar == kmc.a && ihz.z(wnpVar).size() == 1) {
            this.l.e(v(wnpVar, kmcVar, (wpc) yfm.S(ihz.z(wnpVar)), wllVar), byVarF, "");
            return 6;
        }
        if (kmcVar == kmc.b && ihz.A(wnpVar).size() == 1) {
            this.l.e(v(wnpVar, kmcVar, (wpc) yfm.S(ihz.A(wnpVar)), wllVar), byVarF, "");
            return 6;
        }
        kmcVar.getClass();
        by byVarF2 = hju.F(byVarF);
        if (byVarF2 == null) {
            return 6;
        }
        Bundle bundle = new Bundle();
        hju.I(bundle, "watch_actions", wnpVar);
        bundle.putSerializable("offer_type", kmcVar);
        hju.I(bundle, "entity_id", wllVar);
        PrePurchaseBottomSheetFragment prePurchaseBottomSheetFragment = new PrePurchaseBottomSheetFragment();
        prePurchaseBottomSheetFragment.setArguments(bundle);
        at atVar = new at(byVarF2.getSupportFragmentManager());
        atVar.r(prePurchaseBottomSheetFragment, "pre-purchase-dialog");
        atVar.l();
        return 6;
    }
}
