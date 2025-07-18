package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pwo implements pwi {
    private static final tvn a = tvn.n("GnpSdk");
    private final qsy b;
    private final xbw c;
    private final qsx d;
    private final qjl e;

    public pwo(qsy qsyVar, xbw xbwVar, qsx qsxVar, qjl qjlVar) {
        qsyVar.getClass();
        xbwVar.getClass();
        qsxVar.getClass();
        qjlVar.getClass();
        this.b = qsyVar;
        this.c = xbwVar;
        this.d = qsxVar;
        this.e = qjlVar;
    }

    @Override // defpackage.pwi
    public final Object a(yih yihVar) {
        if (xfo.c()) {
            Object objC = c(yihVar);
            if (objC == yio.a) {
                return objC;
            }
        } else {
            Object objB = b(yihVar);
            if (objB == yio.a) {
                return objB;
            }
        }
        return ygi.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.yih r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pwm
            if (r0 == 0) goto L13
            r0 = r6
            pwm r0 = (defpackage.pwm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pwm r0 = new pwm
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            defpackage.ybn.f(r6)     // Catch: java.lang.Exception -> L28
            goto L58
        L28:
            r6 = move-exception
            goto L4d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            defpackage.ybn.f(r6)
            xbw r6 = r5.c     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = r6.b()     // Catch: java.lang.Exception -> L28
            qjm r6 = (defpackage.qjm) r6     // Catch: java.lang.Exception -> L28
            qjl r2 = r5.e     // Catch: java.lang.Exception -> L28
            int r2 = r2.a()     // Catch: java.lang.Exception -> L28
            r0.c = r4     // Catch: java.lang.Exception -> L28
            java.lang.Object r6 = r6.a(r2, r3, r0)     // Catch: java.lang.Exception -> L28
            if (r6 == r1) goto L4c
            goto L58
        L4c:
            return r1
        L4d:
            tvn r0 = defpackage.pwo.a
            tuv r0 = r0.g()
            java.lang.String r1 = "Failed to cancel periodic job scheduled with GNP"
            defpackage.a.co(r0, r1, r6)
        L58:
            qsy r6 = r5.b
            boolean r0 = r6.d()
            if (r0 != 0) goto L81
            qsx r0 = r5.d     // Catch: defpackage.qsw -> L6c
            android.os.Bundle r1 = new android.os.Bundle     // Catch: defpackage.qsw -> L6c
            r1.<init>()     // Catch: defpackage.qsw -> L6c
            r2 = 7
            r6.b(r3, r2, r0, r1)     // Catch: defpackage.qsw -> L6c
            goto L7e
        L6c:
            r6 = move-exception
            tvn r0 = defpackage.pwo.a
            tuv r0 = r0.l()
            tuv r6 = r0.i(r6)
            tvk r6 = (defpackage.tvk) r6
            java.lang.String r0 = "Unable to schedule periodic task."
            r6.s(r0)
        L7e:
            ygi r6 = defpackage.ygi.a
            return r6
        L81:
            tvn r6 = defpackage.pwo.a
            tuv r6 = r6.l()
            java.lang.String r0 = "Periodic Task already scheduled."
            r6.s(r0)
            ygi r6 = defpackage.ygi.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwo.b(yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.yih r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.pwn
            if (r0 == 0) goto L13
            r0 = r8
            pwn r0 = (defpackage.pwn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pwn r0 = new pwn
            r0.<init>(r7, r8)
        L18:
            r5 = r0
            java.lang.Object r8 = r5.a
            yio r0 = defpackage.yio.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ybn.f(r8)
            goto L4b
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            defpackage.ybn.f(r8)
            xbw r8 = r7.c
            java.lang.Object r8 = r8.b()
            r1 = r8
            qjm r1 = (defpackage.qjm) r1
            r8 = r2
            qjl r2 = r7.e
            r5.c = r8
            r4 = 0
            r6 = 12
            r3 = 0
            java.lang.Object r8 = defpackage.osk.S(r1, r2, r3, r4, r5, r6)
            if (r8 == r0) goto L7a
        L4b:
            qdl r8 = (defpackage.qdl) r8
            boolean r0 = r8.i()
            if (r0 != 0) goto L62
            tvn r0 = defpackage.pwo.a
            tuv r0 = r0.g()
            java.lang.Throwable r8 = r8.f()
            java.lang.String r1 = "Failed to schedule periodic task."
            defpackage.a.co(r0, r1, r8)
        L62:
            qsy r8 = r7.b     // Catch: java.lang.Exception -> L6a
            r0 = 0
            r1 = 7
            r8.a(r0, r1)     // Catch: java.lang.Exception -> L6a
            goto L77
        L6a:
            r0 = move-exception
            r8 = r0
            tvn r0 = defpackage.pwo.a
            tuv r0 = r0.f()
            java.lang.String r1 = "Failed to cancel existing Chime periodic job."
            defpackage.a.co(r0, r1, r8)
        L77:
            ygi r8 = defpackage.ygi.a
            return r8
        L7a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwo.c(yih):java.lang.Object");
    }
}
