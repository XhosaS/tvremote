package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qnl implements qms {
    private static final tvn a = tvn.n("GnpSdk");
    private final tst b;
    private final tst c;
    private final cb d;

    public qnl(tst tstVar, qei qeiVar, tst tstVar2, cb cbVar) {
        qeiVar.getClass();
        this.b = tstVar;
        this.c = tstVar2;
        this.d = cbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qpv r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qnk
            if (r0 == 0) goto L13
            r0 = r6
            qnk r0 = (defpackage.qnk) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            qnk r0 = new qnk
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r5 = r0.a
            defpackage.ybn.f(r6)     // Catch: java.lang.Exception -> L29
            goto L54
        L29:
            r6 = move-exception
            goto L5b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            defpackage.ybn.f(r6)
            if (r5 != 0) goto L39
            goto L7e
        L39:
            cb r6 = r4.d
            int r6 = r6.N()
            r2 = 2
            if (r6 != r2) goto L66
            tst r6 = r4.c
            ttd r6 = (defpackage.ttd) r6     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r6.a     // Catch: java.lang.Exception -> L29
            qqd r6 = (defpackage.qqd) r6     // Catch: java.lang.Exception -> L29
            r0.a = r5     // Catch: java.lang.Exception -> L29
            r0.d = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r6 = r6.d()     // Catch: java.lang.Exception -> L29
            if (r6 == r1) goto L5a
        L54:
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L29
            if (r6 != 0) goto L59
            goto L66
        L59:
            return r6
        L5a:
            return r1
        L5b:
            tvn r0 = defpackage.qnl.a
            tuv r0 = r0.g()
            java.lang.String r1 = "Failed getting selection tokens from GnpRegistrationDataProvider"
            defpackage.a.co(r0, r1, r6)
        L66:
            tst r6 = r4.b
            boolean r0 = r6.g()
            if (r0 == 0) goto L7e
            java.lang.Object r6 = r6.c()
            qrh r6 = (defpackage.qrh) r6
            r5.a()
            java.util.List r5 = r6.c()
            if (r5 == 0) goto L7e
            return r5
        L7e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qnl.a(qpv, yih):java.lang.Object");
    }
}
