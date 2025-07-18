package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qgn implements qeq {
    private static final tvn a = tvn.n("GnpSdk");
    private final tst b;
    private final unc c;

    public qgn(unc uncVar, tst tstVar) {
        this.c = uncVar;
        this.b = tstVar;
    }

    @Override // defpackage.qeq
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
    
        if (r3.g(r5, r2) == r4) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Intent r2, defpackage.qdo r3, long r4, defpackage.yih r6) {
        /*
            r1 = this;
            boolean r2 = r6 instanceof defpackage.qgm
            if (r2 == 0) goto L13
            r2 = r6
            qgm r2 = (defpackage.qgm) r2
            int r3 = r2.c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L13
            int r3 = r3 - r4
            r2.c = r3
            goto L18
        L13:
            qgm r2 = new qgm
            r2.<init>(r1, r6)
        L18:
            java.lang.Object r3 = r2.a
            yio r4 = defpackage.yio.a
            int r5 = r2.c
            r6 = 2
            r0 = 1
            if (r5 == 0) goto L38
            if (r5 == r0) goto L34
            if (r5 != r6) goto L2c
            defpackage.ybn.f(r3)     // Catch: java.lang.Exception -> L2a
            goto L6e
        L2a:
            r2 = move-exception
            goto L63
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L34:
            defpackage.ybn.f(r3)
            goto L4b
        L38:
            defpackage.ybn.f(r3)
            tst r3 = r1.b
            ttd r3 = (defpackage.ttd) r3
            java.lang.Object r3 = r3.a
            pud r3 = (defpackage.pud) r3
            r2.c = r0
            java.lang.Object r3 = r3.a(r2)
            if (r3 == r4) goto L71
        L4b:
            tvn r3 = defpackage.qgn.a
            tuv r3 = r3.l()
            java.lang.String r5 = "Syncing registration status due to application update."
            r3.s(r5)
            unc r3 = r1.c     // Catch: java.lang.Exception -> L2a
            vmd r5 = defpackage.vmd.APP_UPDATED     // Catch: java.lang.Exception -> L2a
            r2.c = r6     // Catch: java.lang.Exception -> L2a
            java.lang.Object r2 = r3.g(r5, r2)     // Catch: java.lang.Exception -> L2a
            if (r2 != r4) goto L6e
            goto L71
        L63:
            tvn r3 = defpackage.qgn.a
            tuv r3 = r3.f()
            java.lang.String r4 = "Failed scheduling registration"
            defpackage.a.co(r3, r4, r2)
        L6e:
            ygi r2 = defpackage.ygi.a
            return r2
        L71:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qgn.b(android.content.Intent, qdo, long, yih):java.lang.Object");
    }

    @Override // defpackage.qeq
    public final void c(Intent intent, qdo qdoVar, long j) throws Throwable {
        intent.getClass();
        qdoVar.getClass();
        ykr.n(yim.a, new dsk(this, intent, qdoVar, j, (yih) null, 8));
    }

    @Override // defpackage.qeq
    public final boolean d(Intent intent) {
        return yks.e("android.intent.action.MY_PACKAGE_REPLACED", intent.getAction());
    }
}
