package com.google.android.libraries.internal.growth.growthkit.internal.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import defpackage.nbe;
import defpackage.owz;
import defpackage.pdv;
import defpackage.pdw;
import defpackage.pdy;
import defpackage.pfo;
import defpackage.pkg;
import defpackage.qel;
import defpackage.qka;
import defpackage.qpv;
import defpackage.rbi;
import defpackage.rub;
import defpackage.sfy;
import defpackage.trk;
import defpackage.tst;
import defpackage.ttd;
import defpackage.tvn;
import defpackage.ufn;
import defpackage.uhp;
import defpackage.uhs;
import defpackage.uwi;
import defpackage.uyc;
import defpackage.uyo;
import defpackage.uyq;
import defpackage.uyr;
import defpackage.wae;
import defpackage.xbw;
import defpackage.yfo;
import defpackage.yih;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class TestingToolsBroadcastReceiver extends BroadcastReceiver {
    public static final tvn a = tvn.n("GnpSdk");
    public pdw b;
    public pdv c;
    public pdy d;
    public owz e;
    public uhs f;
    public xbw g;
    public uhs h;
    public Context i;
    public uhp j;
    public Map k;
    public Map l;
    public tst m;
    public yfo n;
    public rbi o;
    public rbi p;
    public rbi q;

    public static void b(BroadcastReceiver.PendingResult pendingResult, int i) {
        pendingResult.setResultCode(i);
        pendingResult.finish();
    }

    private final uhp c(uwi uwiVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ufn.i(this.j, new nbe(this, 15), this.f));
        Map map = this.k;
        uyr uyrVar = uwiVar.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        uyq uyqVarB = uyq.b(uyrVar.e);
        if (uyqVarB == null) {
            uyqVarB = uyq.UITYPE_NONE;
        }
        yfo yfoVar = (yfo) map.get(uyqVarB);
        if (yfoVar != null) {
            pkg pkgVar = (pkg) yfoVar.b();
            uyr uyrVar2 = uwiVar.f;
            if (uyrVar2 == null) {
                uyrVar2 = uyr.a;
            }
            arrayList.addAll(pkgVar.g(uyrVar2.c == 2 ? (uyc) uyrVar2.d : uyc.a));
            pkg pkgVar2 = (pkg) yfoVar.b();
            uyr uyrVar3 = uwiVar.f;
            if (uyrVar3 == null) {
                uyrVar3 = uyr.a;
            }
            uyc uycVar = (uyrVar3.c == 6 ? (uyo) uyrVar3.d : uyo.a).d;
            if (uycVar == null) {
                uycVar = uyc.a;
            }
            arrayList.addAll(pkgVar2.g(uycVar));
        }
        return sfy.z(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, yow] */
    public final qka a(qpv qpvVar, qel qelVar) {
        tst tstVar;
        try {
            Object obj = ((ttd) this.m).a;
            qelVar.getClass();
            tstVar = (tst) wae.W(((rbi) obj).a, new pfo((rbi) obj, qpvVar, qelVar, (yih) null, 15)).get();
        } catch (InterruptedException | RuntimeException | ExecutionException unused) {
            tstVar = trk.a;
        }
        rub rubVar = new rub((char[]) null);
        rubVar.e(0);
        rubVar.c = "";
        return (qka) tstVar.e(rubVar.d());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0624  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onReceive(android.content.Context r28, android.content.Intent r29) {
        /*
            Method dump skipped, instructions count: 1698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.internal.growth.growthkit.internal.debug.TestingToolsBroadcastReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}
