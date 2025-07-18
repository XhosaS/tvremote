package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ahhq {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.ahgr r4, defpackage.ahgs r5, defpackage.agsw r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof defpackage.ahhk
            if (r0 == 0) goto L13
            r0 = r6
            ahhk r0 = (defpackage.ahhk) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            ahhk r0 = new ahhk
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.a
            agtg r1 = defpackage.agtg.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            agwh r4 = r0.c
            defpackage.agpl.b(r6)     // Catch: java.lang.Throwable -> L29
            goto L4b
        L29:
            r5 = move-exception
            goto L50
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.agpl.b(r6)
            agwh r6 = new agwh
            r6.<init>()
            ahhm r2 = new ahhm     // Catch: java.lang.Throwable -> L4d
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4d
            r0.c = r6     // Catch: java.lang.Throwable -> L4d
            r0.b = r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r4 = r4.fD(r2, r0)     // Catch: java.lang.Throwable -> L4d
            if (r4 != r1) goto L4b
            return r1
        L4b:
            r4 = 0
            return r4
        L4d:
            r4 = move-exception
            r5 = r4
            r4 = r6
        L50:
            java.lang.Object r4 = r4.a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = b(r5, r4)
            if (r6 != 0) goto L89
            agte r6 = r0.E
            r6.getClass()
            ahdk r0 = defpackage.ahdl.c
            agtc r6 = r6.get(r0)
            ahdl r6 = (defpackage.ahdl) r6
            if (r6 == 0) goto L7a
            boolean r0 = r6.fB()
            if (r0 != 0) goto L70
            goto L7a
        L70:
            java.util.concurrent.CancellationException r6 = r6.o()
            boolean r6 = b(r5, r6)
            if (r6 != 0) goto L89
        L7a:
            if (r4 != 0) goto L7d
            return r5
        L7d:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L85
            defpackage.agox.a(r4, r5)
            throw r4
        L85:
            defpackage.agox.a(r5, r4)
            throw r5
        L89:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahhq.a(ahgr, ahgs, agsw):java.lang.Object");
    }

    private static final boolean b(Throwable th, Throwable th2) {
        if (th2 == null) {
            return false;
        }
        boolean z = ahbx.b;
        if (z) {
            th2 = ahmf.c(th2);
        }
        if (z) {
            th = ahmf.c(th);
        }
        return agvy.c(th2, th);
    }
}
