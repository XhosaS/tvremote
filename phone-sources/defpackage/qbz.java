package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbz {
    private static final tvn a = tvn.n("GnpSdk");
    private final xbw b;

    public qbz(xbw xbwVar) {
        xbwVar.getClass();
        this.b = xbwVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, qpv] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Intent r5, defpackage.yih r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.qby
            if (r0 == 0) goto L13
            r0 = r6
            qby r0 = (defpackage.qby) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qby r0 = new qby
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r6)
            goto L80
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ybn.f(r6)
            tvn r6 = defpackage.qcb.a
            r5.getClass()
            java.lang.String r6 = "com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION"
            java.lang.String r5 = r5.getStringExtra(r6)
            if (r5 == 0) goto L64
            int r6 = r5.length()
            if (r6 != 0) goto L46
            goto L64
        L46:
            qpv r5 = defpackage.osk.M(r5)     // Catch: java.lang.RuntimeException -> L4f
            tst r5 = defpackage.tst.i(r5)     // Catch: java.lang.RuntimeException -> L4f
            goto L66
        L4f:
            r5 = move-exception
            tvn r6 = defpackage.qcb.a
            tuv r6 = r6.g()
            tvk r6 = (defpackage.tvk) r6
            tuv r5 = r6.i(r5)
            tvk r5 = (defpackage.tvk) r5
            r5.r()
            trk r5 = defpackage.trk.a
            goto L66
        L64:
            trk r5 = defpackage.trk.a
        L66:
            boolean r6 = r5.g()
            if (r6 == 0) goto Lc2
            xbw r6 = r4.b
            java.lang.Object r6 = r6.b()
            qnr r6 = (defpackage.qnr) r6
            java.lang.Object r5 = r5.c()
            r0.c = r3
            java.lang.Object r6 = r6.b(r5, r0)
            if (r6 == r1) goto Lc1
        L80:
            qdl r6 = (defpackage.qdl) r6
            boolean r5 = r6 instanceof defpackage.qdi
            if (r5 == 0) goto L99
            tvn r5 = defpackage.qbz.a
            tuv r5 = r5.g()
            r0 = r6
            qdi r0 = (defpackage.qdi) r0
            java.lang.Throwable r0 = r0.a()
            java.lang.String r1 = "Failed to fetch account from storage."
            defpackage.a.co(r5, r1, r0)
            return r6
        L99:
            java.lang.Object r5 = r6.c()
            qen r5 = (defpackage.qen) r5
            if (r5 != 0) goto Lbb
            tvn r5 = defpackage.qbz.a
            tuv r5 = r5.g()
            tvk r5 = (defpackage.tvk) r5
            java.lang.String r6 = "Account not in storage."
            r5.s(r6)
            qdj r5 = new qdj
            qek r0 = new qek
            r0.<init>(r6)
            r6 = 33
            r5.<init>(r0, r6)
            return r5
        Lbb:
            qdn r6 = new qdn
            r6.<init>(r5)
            return r6
        Lc1:
            return r1
        Lc2:
            qdn r5 = new qdn
            r6 = 0
            r5.<init>(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbz.a(android.content.Intent, yih):java.lang.Object");
    }
}
