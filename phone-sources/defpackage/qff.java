package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qff implements qeq {
    private static final tvn a = tvn.n("GnpSdk");
    private final unc b;

    public qff(unc uncVar) {
        this.b = uncVar;
    }

    @Override // defpackage.qeq
    public final /* synthetic */ int a(Intent intent) {
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qeq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.content.Intent r1, defpackage.qdo r2, long r3, defpackage.yih r5) {
        /*
            r0 = this;
            boolean r1 = r5 instanceof defpackage.qfe
            if (r1 == 0) goto L13
            r1 = r5
            qfe r1 = (defpackage.qfe) r1
            int r2 = r1.c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L13
            int r2 = r2 - r3
            r1.c = r2
            goto L18
        L13:
            qfe r1 = new qfe
            r1.<init>(r0, r5)
        L18:
            java.lang.Object r2 = r1.a
            yio r3 = defpackage.yio.a
            int r4 = r1.c
            r5 = 1
            if (r4 == 0) goto L31
            if (r4 != r5) goto L29
            defpackage.ybn.f(r2)     // Catch: java.lang.Exception -> L27
            goto L57
        L27:
            r1 = move-exception
            goto L4c
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L31:
            defpackage.ybn.f(r2)
            tvn r2 = defpackage.qff.a
            tuv r2 = r2.l()
            java.lang.String r4 = "Syncing registration statuses due to Locale change."
            r2.s(r4)
            unc r2 = r0.b     // Catch: java.lang.Exception -> L27
            vmd r4 = defpackage.vmd.LOCALE_CHANGED     // Catch: java.lang.Exception -> L27
            r1.c = r5     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r2.g(r4, r1)     // Catch: java.lang.Exception -> L27
            if (r1 != r3) goto L57
            return r3
        L4c:
            tvn r2 = defpackage.qff.a
            tuv r2 = r2.f()
            java.lang.String r3 = "Failed scheduling registration"
            defpackage.a.co(r2, r3, r1)
        L57:
            ygi r1 = defpackage.ygi.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qff.b(android.content.Intent, qdo, long, yih):java.lang.Object");
    }

    @Override // defpackage.qeq
    public final void c(Intent intent, qdo qdoVar, long j) throws Throwable {
        intent.getClass();
        qdoVar.getClass();
        ykr.n(yim.a, new dsk(this, intent, qdoVar, j, (yih) null, 5));
    }

    @Override // defpackage.qeq
    public final boolean d(Intent intent) {
        return yks.e("android.intent.action.LOCALE_CHANGED", intent.getAction());
    }
}
