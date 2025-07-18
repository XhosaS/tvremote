package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pen implements qjl {
    private static final tvn a = tvn.n("GnpSdk");
    private final pdx b;
    private final String c = "GK_STORAGE_CLEANUP";
    private final long d = xfo.a.get().c();

    public pen(pdx pdxVar) {
        this.b = pdxVar;
    }

    @Override // defpackage.qjl
    public final int a() {
        return 13;
    }

    @Override // defpackage.qjl
    public final long b() {
        return this.d;
    }

    @Override // defpackage.qjl
    public final Long c() {
        return 30000L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qjl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(android.os.Bundle r4, defpackage.yih r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof defpackage.pem
            if (r4 == 0) goto L13
            r4 = r5
            pem r4 = (defpackage.pem) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            pem r4 = new pem
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.a
            yio r0 = defpackage.yio.a
            int r1 = r4.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.ybn.f(r5)
            goto L48
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ybn.f(r5)
            tvn r5 = defpackage.pen.a
            tuv r5 = r5.l()
            java.lang.String r1 = "Executing StorageCleanupJob"
            r5.s(r1)
            pdx r5 = r3.b
            r4.c = r2
            java.lang.Object r4 = r5.a(r4)
            if (r4 != r0) goto L48
            return r0
        L48:
            qdn r4 = new qdn
            ygi r5 = defpackage.ygi.a
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pen.d(android.os.Bundle, yih):java.lang.Object");
    }

    @Override // defpackage.qjl
    public final String e() {
        return this.c;
    }

    @Override // defpackage.qjl
    public final boolean f() {
        return true;
    }

    @Override // defpackage.qjl
    public final boolean g() {
        return false;
    }

    @Override // defpackage.qjl
    public final int h() {
        return 2;
    }

    @Override // defpackage.qjl
    public final int i() {
        return 2;
    }
}
