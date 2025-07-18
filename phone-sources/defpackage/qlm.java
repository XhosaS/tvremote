package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlm {
    private static final tvn a = tvn.n("GnpSdk");
    private final tst b;
    private final tst c;

    public qlm(tst tstVar, tst tstVar2) {
        this.b = tstVar;
        this.c = tstVar2;
    }

    public final Object a(qjx qjxVar, yih yihVar) {
        int iOrdinal = qjxVar.ordinal();
        return iOrdinal != 2 ? iOrdinal != 3 ? new qdn(null) : b(yihVar) : c(yihVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qlk
            if (r0 == 0) goto L13
            r0 = r5
            qlk r0 = (defpackage.qlk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qlk r0 = new qlk
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.ybn.f(r5)     // Catch: java.lang.Exception -> L27
            goto L4a
        L27:
            r5 = move-exception
            goto L51
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ybn.f(r5)
            tst r5 = r4.c
            boolean r2 = r5.g()
            if (r2 == 0) goto L64
            java.lang.Object r5 = r5.c()     // Catch: java.lang.Exception -> L27
            qqm r5 = (defpackage.qqm) r5     // Catch: java.lang.Exception -> L27
            r0.c = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Exception -> L27
            if (r5 == r1) goto L50
        L4a:
            qdn r0 = new qdn     // Catch: java.lang.Exception -> L27
            r0.<init>(r5)     // Catch: java.lang.Exception -> L27
            return r0
        L50:
            return r1
        L51:
            tvn r0 = defpackage.qlm.a
            tuv r0 = r0.f()
            java.lang.String r1 = "Failed getting YouTube visitor data cookie"
            defpackage.a.co(r0, r1, r5)
            qdj r0 = new qdj
            r1 = 12
            r0.<init>(r5, r1)
            return r0
        L64:
            tvn r5 = defpackage.qlm.a
            tuv r5 = r5.f()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r0 = "YouTubeVisitorDataProvider not found, can't get YouTube Visitor cookie"
            r5.s(r0)
            qdj r5 = new qdj
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 11
            r5.<init>(r1, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qlm.b(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yih r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.qll
            if (r0 == 0) goto L13
            r0 = r5
            qll r0 = (defpackage.qll) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qll r0 = new qll
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r5)
            goto L46
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ybn.f(r5)
            tst r5 = r4.b
            ttd r5 = (defpackage.ttd) r5
            java.lang.Object r5 = r5.a
            cb r5 = (defpackage.cb) r5
            uhp r5 = r5.G()
            r0.c = r3
            java.lang.Object r5 = defpackage.wae.U(r5, r0)
            if (r5 == r1) goto L6c
        L46:
            omv r5 = (defpackage.omv) r5
            java.lang.String r5 = r5.a
            if (r5 != 0) goto L66
            tvn r5 = defpackage.qlm.a
            tuv r5 = r5.f()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r0 = "Failed to get Zwieback ID"
            r5.s(r0)
            qdk r5 = new qdk
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            r0 = 9
            r5.<init>(r1, r0)
            return r5
        L66:
            qdn r0 = new qdn
            r0.<init>(r5)
            return r0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qlm.c(yih):java.lang.Object");
    }
}
