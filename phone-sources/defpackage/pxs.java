package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pxs {
    private static final tvn a = tvn.n("GnpSdk");
    private final qai b;
    private final qsy c;
    private final xbw d;
    private final pxu e;
    private final qjl f;

    public pxs(qai qaiVar, qsy qsyVar, xbw xbwVar, pxu pxuVar, qjl qjlVar) {
        qaiVar.getClass();
        qsyVar.getClass();
        xbwVar.getClass();
        this.b = qaiVar;
        this.c = qsyVar;
        this.d = xbwVar;
        this.e = pxuVar;
        this.f = qjlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object a(defpackage.pxs r4, defpackage.qen r5, java.util.List r6, defpackage.yih r7) {
        /*
            boolean r0 = r7 instanceof defpackage.pxp
            if (r0 == 0) goto L13
            r0 = r7
            pxp r0 = (defpackage.pxp) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pxp r0 = new pxp
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ybn.f(r7)     // Catch: java.lang.Exception -> L60
            goto L87
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.ybn.f(r7)
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L39
            goto L87
        L39:
            qai r7 = r4.b
            r7.d(r5, r6)
            r6 = 5
            java.util.List r7 = r7.b(r5, r6)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L87
            boolean r7 = defpackage.xfo.c()
            if (r7 == 0) goto L6d
            xbw r4 = r4.d     // Catch: java.lang.Exception -> L60
            java.lang.Object r4 = r4.b()     // Catch: java.lang.Exception -> L60
            qjm r4 = (defpackage.qjm) r4     // Catch: java.lang.Exception -> L60
            r0.c = r3     // Catch: java.lang.Exception -> L60
            java.lang.Object r4 = r4.a(r6, r5, r0)     // Catch: java.lang.Exception -> L60
            if (r4 != r1) goto L87
            return r1
        L60:
            r4 = move-exception
            tvn r5 = defpackage.pxs.a
            tuv r5 = r5.g()
            java.lang.String r6 = "Failed to cancel scheduled GNP job for received notification"
            defpackage.a.co(r5, r6, r4)
            goto L87
        L6d:
            qsy r4 = r4.c     // Catch: defpackage.qsw -> L73
            r4.a(r5, r6)     // Catch: defpackage.qsw -> L73
            goto L87
        L73:
            r4 = move-exception
            tvn r5 = defpackage.pxs.a
            tuv r5 = r5.g()
            tvk r5 = (defpackage.tvk) r5
            tuv r4 = r5.i(r4)
            tvk r4 = (defpackage.tvk) r4
            java.lang.String r5 = "Unable to cancel tasks with jobId: [%d]"
            r4.t(r5, r6)
        L87:
            ygi r4 = defpackage.ygi.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxs.a(pxs, qen, java.util.List, yih):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ java.lang.Object c(defpackage.pxs r6, defpackage.qen r7, java.util.List r8, long r9, defpackage.pvi r11, boolean r12, defpackage.yih r13) {
        /*
            boolean r0 = r13 instanceof defpackage.pxq
            if (r0 == 0) goto L13
            r0 = r13
            pxq r0 = (defpackage.pxq) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pxq r0 = new pxq
            r0.<init>(r6, r13)
        L18:
            java.lang.Object r13 = r0.b
            yio r1 = defpackage.yio.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.a
            qen r7 = r0.f
            pxs r8 = r0.e
            defpackage.ybn.f(r13)
            r12 = r6
            r6 = r8
            goto L94
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            defpackage.ybn.f(r13)
            boolean r13 = r8.isEmpty()
            if (r13 != 0) goto La6
            r13 = r8
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            defpackage.ocv.bp(r8, r7)
            java.lang.Long r11 = r11.a
            long r4 = r11.longValue()
            java.lang.String r11 = "com.google.android.libraries.notifications.DELIVERED_TIMESTAMP"
            r8.putLong(r11, r4)
            java.lang.String r11 = "com.google.android.libraries.notifications.MUTE_NOTIFICATION"
            r8.putInt(r11, r12)
            java.lang.String r11 = "com.google.android.libraries.notifications.IS_LOCAL_NOTIFICATION"
            r12 = 0
            r8.putInt(r11, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r13.iterator()
        L68:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L85
            java.lang.Object r13 = r11.next()
            vlq r13 = (defpackage.vlq) r13
            qai r2 = r6.b
            r4 = 5
            byte[] r13 = r13.h()
            qah r13 = r2.a(r7, r4, r13)
            if (r13 == 0) goto L68
            r12.add(r13)
            goto L68
        L85:
            r0.e = r6
            r0.f = r7
            r0.a = r12
            r0.d = r3
            r11 = r0
            java.lang.Object r13 = r6.b(r7, r8, r9, r11)
            if (r13 == r1) goto La5
        L94:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r8 = r13.booleanValue()
            if (r8 == 0) goto L9d
            return r12
        L9d:
            qai r6 = r6.b
            r6.d(r7, r12)
            yhb r6 = defpackage.yhb.a
            return r6
        La5:
            return r1
        La6:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Failed requirement."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxs.c(pxs, qen, java.util.List, long, pvi, boolean, yih):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.qen r11, android.os.Bundle r12, long r13, defpackage.yih r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.pxr
            if (r0 == 0) goto L13
            r0 = r15
            pxr r0 = (defpackage.pxr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pxr r0 = new pxr
            r0.<init>(r10, r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.a
            yio r0 = defpackage.yio.a
            int r1 = r6.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            defpackage.ybn.f(r15)
            goto L58
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.ybn.f(r15)
            boolean r15 = defpackage.xfo.c()
            r3 = 1000(0x3e8, double:4.94E-321)
            if (r15 == 0) goto L7b
            long r13 = r13 + r3
            xbw r15 = r10.d
            java.lang.Object r15 = r15.b()
            r1 = r15
            qjm r1 = (defpackage.qjm) r1
            r15 = r2
            qjl r2 = r10.f
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r13)
            r6.c = r15
            r3 = r11
            r4 = r12
            java.lang.Object r15 = r1.b(r2, r3, r4, r5, r6)
            if (r15 != r0) goto L58
            return r0
        L58:
            qdl r15 = (defpackage.qdl) r15
            boolean r11 = r15 instanceof defpackage.qdi
            if (r11 == 0) goto L76
            r11 = r15
            qdi r11 = (defpackage.qdi) r11
            java.lang.Throwable r11 = r11.a()
            tvn r12 = defpackage.pxs.a
            tuv r12 = r12.l()
            tuv r11 = r12.i(r11)
            tvk r11 = (defpackage.tvk) r11
            java.lang.String r12 = "Unable to schedule GNP job for notification received event."
            r11.s(r12)
        L76:
            boolean r2 = r15.i()
            goto L9f
        L7b:
            r7 = r12
            r15 = r2
            r0 = r3
            qsy r3 = r10.c     // Catch: defpackage.qsw -> L8b
            pxu r6 = r10.e     // Catch: defpackage.qsw -> L8b
            long r8 = r13 + r0
            r5 = 5
            r4 = r11
            r3.c(r4, r5, r6, r7, r8)     // Catch: defpackage.qsw -> L8b
            r2 = r15
            goto L9f
        L8b:
            r0 = move-exception
            r11 = r0
            tvn r12 = defpackage.pxs.a
            tuv r12 = r12.l()
            tuv r11 = r12.i(r11)
            tvk r11 = (defpackage.tvk) r11
            java.lang.String r12 = "Unable to schedule Chime task for notification received event."
            r11.s(r12)
            r2 = 0
        L9f:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r2)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxs.b(qen, android.os.Bundle, long, yih):java.lang.Object");
    }
}
