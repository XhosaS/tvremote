package defpackage;

import android.content.Context;
import android.net.Network;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.googletv.app.presentation.pages.myepisodes.MyEpisodesActivity;
import com.google.android.videos.R;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ill implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ill(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v84, types: [android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        ghi ghiVarA;
        ith ithVarE;
        nmq nmqVar;
        nqj nqjVarD;
        Long lV;
        Long lV2;
        MyEpisodesActivity myEpisodesActivityH;
        idr idrVarA;
        idr idrVarB;
        boolean z = false;
        switch (this.b) {
            case 0:
                ghiVarA = ((gic) obj).a("SELECT entity_id, last_server_write_millis FROM watch_actions  WHERE account_name = ?");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ArrayList arrayList = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList.add(new ilj(ihz.d(ghiVarA.d(0)), ghiVarA.b(1)));
                    }
                    return arrayList;
                } finally {
                }
            case 1:
                ghiVarA = ((gic) obj).a("SELECT entity_id as entityId, sentiment as state FROM user_entity_state  WHERE account_name = ? AND sentiment In (1, 2)");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ArrayList arrayList2 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList2.add(new ikv(ihz.d(ghiVarA.d(0)), ihz.e((int) ghiVarA.b(1))));
                    }
                    return arrayList2;
                } finally {
                }
            case 2:
                ghiVarA = ((gic) obj).a("SELECT entity_id FROM user_entity_state  WHERE account_name = ? AND watched = 1");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ArrayList arrayList3 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList3.add(ihz.d(ghiVarA.d(0)));
                    }
                    return arrayList3;
                } finally {
                }
            case 3:
                ghiVarA = ((gic) obj).a("SELECT entity_id FROM user_entity_state  WHERE account_name = ? AND in_watchlist = 1");
                try {
                    ghiVarA.i(1, (String) this.a);
                    ArrayList arrayList4 = new ArrayList();
                    while (ghiVarA.l()) {
                        arrayList4.add(ihz.d(ghiVarA.d(0)));
                    }
                    return arrayList4;
                } finally {
                }
            case 4:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object key = entry.getKey();
                iua iuaVar = ((itv) this.a).n;
                return Boolean.valueOf(yks.e(key, iuaVar != null ? iuaVar.b : null));
            case 5:
                Map map = (Map) obj;
                map.getClass();
                String str = (String) map.get("audio_options");
                String str2 = (String) map.get("subtitle_option");
                ArrayList arrayList5 = new ArrayList();
                if (str != null && (lV2 = ylh.v(str)) != null) {
                    arrayList5.add(Long.valueOf(lV2.longValue()));
                }
                if (!yks.e(str2, "DUMMY_OPTION_ID_FOR_NO_SUBTITLE") && str2 != null && (lV = ylh.v(str2)) != null) {
                    arrayList5.add(Long.valueOf(lV.longValue()));
                }
                if (!arrayList5.isEmpty() && (ithVarE = ((ivd) this.a).c.e()) != null && (nmqVar = ((iua) ithVarE).e) != null && (nqjVarD = nmqVar.d()) != null) {
                    nqjVarD.E(yfm.au(arrayList5));
                }
                return ygi.a;
            case 6:
                ixh ixhVar = (ixh) obj;
                ixhVar.getClass();
                ?? r0 = this.a;
                if (r0.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        if (!((ixg) it.next()).b(ixhVar)) {
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                ith ithVar = (ith) obj;
                ithVar.getClass();
                return Boolean.valueOf(ithVar.l((wpm) this.a));
            case 8:
                ouk oukVar = (ouk) obj;
                oukVar.getClass();
                vtw vtwVar = (vtw) this.a;
                if (!vtwVar.b.A()) {
                    vtwVar.u();
                }
                String str3 = oukVar.b;
                iod iodVar = (iod) vtwVar.b;
                iod iodVar2 = iod.a;
                iodVar.k = str3;
                return ygi.a;
            case 9:
                ouj oujVar = (ouj) obj;
                oujVar.getClass();
                vtw vtwVar2 = (vtw) this.a;
                if (!vtwVar2.b.A()) {
                    vtwVar2.u();
                }
                String str4 = oujVar.a;
                iod iodVar3 = (iod) vtwVar2.b;
                iod iodVar4 = iod.a;
                iodVar3.l = str4;
                return ygi.a;
            case 10:
                Network network = (Network) obj;
                network.getClass();
                return ((jbo) this.a).c.getNetworkCapabilities(network);
            case 11:
                kfr kfrVar = (kfr) obj;
                kfrVar.getClass();
                View view = (View) this.a;
                jei jeiVarF = jbr.f(view);
                if (jeiVarF != null && (idrVarB = jeiVarF.b()) != null) {
                    vtw vtwVarM = wll.a.m();
                    vtwVarM.getClass();
                    wbb.t(kfrVar.b, vtwVarM);
                    idrVarB.c(wbb.s(vtwVarM));
                }
                String str5 = kfrVar.c;
                if (str5 != null && (myEpisodesActivityH = jbr.h(view)) != null && (idrVarA = myEpisodesActivityH.a()) != null) {
                    vtw vtwVarM2 = wni.a.m();
                    vtwVarM2.getClass();
                    wcq.M(str5, vtwVarM2);
                    wcq.N(5, vtwVarM2);
                    idrVarA.c(wcq.L(vtwVarM2));
                }
                return ygi.a;
            case 12:
                wlx wlxVar = (wlx) obj;
                if (wlxVar != null) {
                    jlb jlbVar = (jlb) this.a;
                    jlbVar.c = wlxVar;
                    iyz iyzVar = jlbVar.e;
                    iyzVar.f(iyzVar.d(wlxVar));
                }
                return ygi.a;
            case 13:
                vtw vtwVar3 = (vtw) obj;
                vtwVar3.getClass();
                List listUnmodifiableList = DesugarCollections.unmodifiableList(((iod) vtwVar3.b).h);
                wsy wsyVar = (wsy) ((ixi) this.a).b;
                if (!listUnmodifiableList.contains(wsyVar.j)) {
                    vtwVar3.z(wsyVar.j);
                }
                return ygi.a;
            case 14:
                vtw vtwVar4 = (vtw) obj;
                vtwVar4.getClass();
                List listUnmodifiableList2 = DesugarCollections.unmodifiableList(((iod) vtwVar4.b).f);
                wtj wtjVar = (wtj) ((ixi) this.a).b;
                if (!listUnmodifiableList2.contains(wtjVar.i)) {
                    String str6 = wtjVar.i;
                    if (!vtwVar4.b.A()) {
                        vtwVar4.u();
                    }
                    iod iodVar5 = (iod) vtwVar4.b;
                    str6.getClass();
                    vun vunVar = iodVar5.f;
                    if (!vunVar.c()) {
                        iodVar5.f = vuc.s(vunVar);
                    }
                    iodVar5.f.add(str6);
                }
                return ygi.a;
            case 15:
                vtw vtwVar5 = (vtw) obj;
                vtwVar5.getClass();
                List listUnmodifiableList3 = DesugarCollections.unmodifiableList(((iod) vtwVar5.b).h);
                wty wtyVar = (wty) ((ixi) this.a).b;
                if (!listUnmodifiableList3.contains(wtyVar.g)) {
                    vtwVar5.z(wtyVar.g);
                }
                return ygi.a;
            case 16:
                vtw vtwVar6 = (vtw) obj;
                vtwVar6.getClass();
                List listUnmodifiableList4 = DesugarCollections.unmodifiableList(((iod) vtwVar6.b).h);
                wtz wtzVar = (wtz) ((ixi) this.a).b;
                if (!listUnmodifiableList4.contains(wtzVar.i)) {
                    vtwVar6.z(wtzVar.i);
                }
                return ygi.a;
            case 17:
                vtw vtwVar7 = (vtw) obj;
                vtwVar7.getClass();
                String str7 = ((wok) this.a).d;
                if (!vtwVar7.b.A()) {
                    vtwVar7.u();
                }
                iod iodVar6 = (iod) vtwVar7.b;
                iod iodVar7 = iod.a;
                str7.getClass();
                iodVar6.m = str7;
                return ygi.a;
            case 18:
                dvc dvcVar = (dvc) obj;
                dvcVar.getClass();
                ?? r02 = this.a;
                if (dvcVar == dvc.ON_RESUME) {
                    jxc jxcVar = (jxc) r02;
                    AccessibilityManager accessibilityManager = jxcVar.a;
                    jxcVar.b(accessibilityManager.isEnabled());
                    jxcVar.c(accessibilityManager.isTouchExplorationEnabled());
                    accessibilityManager.addTouchExplorationStateChangeListener(r02);
                    accessibilityManager.addAccessibilityStateChangeListener(r02);
                } else if (dvcVar == dvc.ON_PAUSE) {
                    ((jxc) r02).d();
                }
                return ygi.a;
            case 19:
                cfc cfcVar = (cfc) obj;
                cfcVar.getClass();
                String string = ((Context) this.a).getString(R.string.content_description_rating_icon);
                string.getClass();
                cfk.g(cfcVar, string);
                return ygi.a;
            default:
                this.a.b((String) obj);
                return ygi.a;
        }
    }
}
