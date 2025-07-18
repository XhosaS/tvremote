package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pbk implements pbi {
    private static final tvn a = tvn.n("GnpSdk");
    private final qjm b;
    private final qjl c;
    private final qhm d;
    private final yfo e;
    private final yyh f;

    public pbk(qjm qjmVar, qjl qjlVar, qhm qhmVar, yyh yyhVar, yfo yfoVar) {
        qjmVar.getClass();
        yfoVar.getClass();
        this.b = qjmVar;
        this.c = qjlVar;
        this.d = qhmVar;
        this.f = yyhVar;
        this.e = yfoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.pbi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.qen r8, defpackage.vmk r9, defpackage.vhi r10, defpackage.yih r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof defpackage.pbj
            if (r0 == 0) goto L13
            r0 = r11
            pbj r0 = (defpackage.pbj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            pbj r0 = new pbj
            r0.<init>(r7, r11)
        L18:
            r5 = r0
            java.lang.Object r11 = r5.a
            yio r0 = defpackage.yio.a
            int r1 = r5.c
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            defpackage.ybn.f(r11)
            goto Lbc
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            defpackage.ybn.f(r11)
            tvn r11 = defpackage.pbk.a
            tuv r1 = r11.l()
            java.lang.String r3 = "Handling a sync instruction in the InAppPushHandlerImpl."
            r1.s(r3)
            yfo r1 = r7.e
            java.lang.Object r1 = r1.b()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Lc1
            int r9 = r9.b
            vmh r1 = defpackage.vmh.b(r9)
            if (r1 != 0) goto L57
            vmh r1 = defpackage.vmh.UNKNOWN_INSTRUCTION
        L57:
            vmh r3 = defpackage.vmh.SYNC
            if (r1 == r3) goto L71
            tuv r8 = r11.f()
            tvk r8 = (defpackage.tvk) r8
            vmh r9 = defpackage.vmh.b(r9)
            if (r9 != 0) goto L69
            vmh r9 = defpackage.vmh.UNKNOWN_INSTRUCTION
        L69:
            java.lang.String r10 = "Received unsupported in-app sync instruction type - %s."
            r8.v(r10, r9)
            ygi r8 = defpackage.ygi.a
            return r8
        L71:
            tuv r9 = r11.l()
            java.lang.String r1 = "Payload has SYNC instruction."
            r9.s(r1)
            qhm r9 = r7.d
            yyh r1 = r7.f
            vie r3 = defpackage.vie.DELIVERED_SYNC_INSTRUCTION
            qhs r1 = r1.n(r3)
            r1.b(r8)
            r1.a(r10)
            r10 = 4
            r1.v = r10
            r9.a(r1)
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            qpv r9 = r8.b()
            java.lang.String r9 = defpackage.osk.O(r9)
            java.lang.String r10 = "GNP_ACCOUNT_TO_SYNC"
            r4.putString(r10, r9)
            tuv r9 = r11.l()
            java.lang.String r10 = "Scheduling an inAppSyncJob in the InAppPushHandlerImpl."
            r9.s(r10)
            qjm r1 = r7.b
            r9 = r2
            qjl r2 = r7.c
            r5.c = r9
            r6 = 8
            r3 = r8
            java.lang.Object r11 = defpackage.osk.S(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto Lbc
            return r0
        Lbc:
            qdl r11 = (defpackage.qdl) r11
            ygi r8 = defpackage.ygi.a
            return r8
        Lc1:
            tuv r8 = r11.l()
            java.lang.String r9 = "Can't handle sync instruction as GrowthKit is disabled."
            r8.s(r9)
            ygi r8 = defpackage.ygi.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbk.a(qen, vmk, vhi, yih):java.lang.Object");
    }
}
