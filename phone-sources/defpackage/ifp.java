package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ifp extends yiz implements yjz {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ wkg e;
    final /* synthetic */ ifq f;
    final /* synthetic */ String g;
    final /* synthetic */ Context h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifp(wkg wkgVar, ifq ifqVar, String str, Context context, yih yihVar) {
        super(2, yihVar);
        this.e = wkgVar;
        this.f = ifqVar;
        this.g = str;
        this.h = context;
    }

    @Override // defpackage.yjz
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ifp) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
    }

    @Override // defpackage.yit
    public final yih<ygi> create(Object obj, yih<?> yihVar) {
        return new ifp(this.e, this.f, this.g, this.h, yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            yio r0 = defpackage.yio.a
            int r1 = r9.d
            java.lang.String r2 = ""
            r3 = 1
            if (r1 == 0) goto L14
            java.lang.Object r0 = r9.c
            java.lang.Object r1 = r9.b
            defpackage.ybn.f(r10)     // Catch: java.lang.Exception -> L11
            goto L66
        L11:
            r10 = move-exception
            goto L80
        L14:
            defpackage.ybn.f(r10)
            wkg r10 = r9.e
            vvd r1 = defpackage.wps.d
            r10.i(r1)
            vtr r10 = r10.l
            java.lang.Object r4 = r1.c
            vub r4 = (defpackage.vub) r4
            java.lang.Object r10 = r10.k(r4)
            if (r10 != 0) goto L2d
            java.lang.Object r10 = r1.b
            goto L30
        L2d:
            r1.c(r10)
        L30:
            ifq r1 = r9.f
            java.lang.String r4 = r9.g
            android.content.Context r5 = r9.h
            wps r10 = (defpackage.wps) r10
            int r6 = r10.b
            r6 = r6 & r3
            if (r6 == 0) goto Lbd
            isw r6 = r1.a     // Catch: java.lang.Exception -> L7b
            iog r7 = new iog     // Catch: java.lang.Exception -> L7b
            wll r8 = r10.c     // Catch: java.lang.Exception -> L7b
            if (r8 != 0) goto L47
            wll r8 = defpackage.wll.a     // Catch: java.lang.Exception -> L7b
        L47:
            r8.getClass()     // Catch: java.lang.Exception -> L7b
            if (r4 != 0) goto L4d
            r4 = r2
        L4d:
            r7.<init>(r8, r4)     // Catch: java.lang.Exception -> L7b
            ypc r4 = r6.s(r7, r3)     // Catch: java.lang.Exception -> L7b
            r9.a = r1     // Catch: java.lang.Exception -> L7b
            r9.b = r5     // Catch: java.lang.Exception -> L7b
            r9.c = r10     // Catch: java.lang.Exception -> L7b
            r9.d = r3     // Catch: java.lang.Exception -> L7b
            yql r4 = (defpackage.yql) r4     // Catch: java.lang.Exception -> L7b
            java.lang.Object r1 = r4.z(r9)     // Catch: java.lang.Exception -> L7b
            if (r1 == r0) goto L7a
            r0 = r10
            r1 = r5
        L66:
            android.os.Handler r10 = new android.os.Handler     // Catch: java.lang.Exception -> L11
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L11
            r10.<init>(r4)     // Catch: java.lang.Exception -> L11
            gfe r4 = new gfe     // Catch: java.lang.Exception -> L11
            r5 = 16
            r4.<init>(r1, r5)     // Catch: java.lang.Exception -> L11
            r10.post(r4)     // Catch: java.lang.Exception -> L11
            goto Lbd
        L7a:
            return r0
        L7b:
            r0 = move-exception
            r1 = r0
            r0 = r10
            r10 = r1
            r1 = r5
        L80:
            wps r0 = (defpackage.wps) r0
            wll r0 = r0.c
            if (r0 != 0) goto L88
            wll r0 = defpackage.wll.a
        L88:
            int r4 = r0.b
            if (r4 != r3) goto L91
            java.lang.Object r0 = r0.c
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Add to watchlist action failed for entity id: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r2 = " with error: "
            r0.append(r2)
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            defpackage.krd.c(r10)
            android.os.Handler r10 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r10.<init>(r0)
            gfe r0 = new gfe
            r2 = 17
            r0.<init>(r1, r2)
            r10.post(r0)
        Lbd:
            ygi r10 = defpackage.ygi.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifp.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
