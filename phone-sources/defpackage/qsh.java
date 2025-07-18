package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qsh implements pzr {
    private static final tvn a = tvn.n("GnpSdk");
    private final qnr b;
    private final tst c;

    public qsh(qnr qnrVar, tst tstVar) {
        this.b = qnrVar;
        this.c = tstVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qen r4, defpackage.vvj r5, java.lang.Throwable r6, defpackage.yih r7) {
        /*
            r3 = this;
            boolean r5 = r7 instanceof defpackage.qsf
            if (r5 == 0) goto L13
            r5 = r7
            qsf r5 = (defpackage.qsf) r5
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.c = r0
            goto L18
        L13:
            qsf r5 = new qsf
            r5.<init>(r3, r7)
        L18:
            java.lang.Object r7 = r5.a
            yio r0 = defpackage.yio.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            defpackage.ybn.f(r7)
            goto L6c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ybn.f(r7)
            tvn r7 = defpackage.qsh.a
            tuv r7 = r7.l()
            tuv r6 = r7.i(r6)
            tvk r6 = (defpackage.tvk) r6
            if (r4 == 0) goto L47
            java.lang.String r7 = r4.b
            java.lang.String r7 = defpackage.qtl.M(r7)
            goto L49
        L47:
            java.lang.String r7 = ""
        L49:
            java.lang.String r1 = "Unregistration finished for account: %s (FAILURE)."
            r6.v(r1, r7)
            if (r4 != 0) goto L51
            goto L94
        L51:
            qem r6 = new qem
            r6.<init>(r4)
            r4 = 6
            r6.i(r4)
            qen r4 = r6.a()
            qnr r6 = r3.b
            java.util.List r4 = defpackage.yfm.p(r4)
            r5.c = r2
            java.lang.Object r7 = r6.e(r4, r5)
            if (r7 == r0) goto L97
        L6c:
            qdl r7 = (defpackage.qdl) r7
            boolean r4 = r7 instanceof defpackage.qdi
            if (r4 == 0) goto L83
            qdi r7 = (defpackage.qdi) r7
            java.lang.Throwable r4 = r7.a()
            tvn r5 = defpackage.qsh.a
            tuv r5 = r5.g()
            java.lang.String r6 = "Failed updating accounts in storage"
            defpackage.a.co(r5, r6, r4)
        L83:
            tst r4 = r3.c
            boolean r5 = r4.g()
            if (r5 == 0) goto L94
            java.lang.Object r4 = r4.c()
            qrv r4 = (defpackage.qrv) r4
            r4.c()
        L94:
            ygi r4 = defpackage.ygi.a
            return r4
        L97:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsh.a(qen, vvj, java.lang.Throwable, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pzr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qen r5, defpackage.vvj r6, defpackage.vvj r7, defpackage.yih r8) {
        /*
            r4 = this;
            boolean r6 = r8 instanceof defpackage.qsg
            if (r6 == 0) goto L13
            r6 = r8
            qsg r6 = (defpackage.qsg) r6
            int r7 = r6.c
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r7 & r0
            if (r1 == 0) goto L13
            int r7 = r7 - r0
            r6.c = r7
            goto L18
        L13:
            qsg r6 = new qsg
            r6.<init>(r4, r8)
        L18:
            java.lang.Object r7 = r6.a
            yio r8 = defpackage.yio.a
            int r0 = r6.c
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 != r1) goto L27
            defpackage.ybn.f(r7)
            goto L72
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r7)
            tvn r7 = defpackage.qsh.a
            tuv r7 = r7.l()
            if (r5 == 0) goto L41
            java.lang.String r0 = r5.b
            java.lang.String r0 = defpackage.qtl.M(r0)
            goto L43
        L41:
            java.lang.String r0 = ""
        L43:
            java.lang.String r2 = "Unregistration finished for account: %s (SUCCESS)."
            r7.v(r2, r0)
            if (r5 != 0) goto L4b
            goto L9a
        L4b:
            qem r7 = new qem
            r7.<init>(r5)
            r5 = 4
            r7.i(r5)
            r2 = 0
            r7.d(r2)
            r7.h(r2)
            r5 = 0
            r7.g(r5)
            qen r5 = r7.a()
            qnr r7 = r4.b
            java.util.List r5 = defpackage.yfm.p(r5)
            r6.c = r1
            java.lang.Object r7 = r7.e(r5, r6)
            if (r7 == r8) goto L9d
        L72:
            qdl r7 = (defpackage.qdl) r7
            boolean r5 = r7 instanceof defpackage.qdi
            if (r5 == 0) goto L89
            qdi r7 = (defpackage.qdi) r7
            java.lang.Throwable r5 = r7.a()
            tvn r6 = defpackage.qsh.a
            tuv r6 = r6.g()
            java.lang.String r7 = "Failed updating accounts in storage"
            defpackage.a.co(r6, r7, r5)
        L89:
            tst r5 = r4.c
            boolean r6 = r5.g()
            if (r6 == 0) goto L9a
            java.lang.Object r5 = r5.c()
            qrv r5 = (defpackage.qrv) r5
            r5.d()
        L9a:
            ygi r5 = defpackage.ygi.a
            return r5
        L9d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsh.b(qen, vvj, vvj, yih):java.lang.Object");
    }
}
