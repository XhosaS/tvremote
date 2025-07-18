package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qbv implements qbl {
    public static final tvn a = tvn.n("GnpSdk");
    public final xbw b;
    public final qbr c;
    public final ntp d;
    private final xbw e;
    private final yil f;
    private final yil g;

    public qbv(xbw xbwVar, xbw xbwVar2, qbr qbrVar, ntp ntpVar, yil yilVar, yil yilVar2) {
        xbwVar.getClass();
        xbwVar2.getClass();
        qbrVar.getClass();
        this.b = xbwVar;
        this.e = xbwVar2;
        this.c = qbrVar;
        this.d = ntpVar;
        this.f = yilVar;
        this.g = yilVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.qbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.pxg r12, defpackage.qis r13, defpackage.crm r14, defpackage.yih r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.qbs
            if (r0 == 0) goto L13
            r0 = r15
            qbs r0 = (defpackage.qbs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qbs r0 = new qbs
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            yio r1 = defpackage.yio.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            crm r14 = r0.d
            defpackage.ybn.f(r15)
            goto L60
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.ybn.f(r15)
            ptn r7 = defpackage.ocv.bm(r13)
            xbw r15 = r11.e
            java.lang.Object r15 = r15.b()
            pwy r15 = (defpackage.pwy) r15
            tst r5 = r15.a(r7)
            boolean r15 = r5.g()
            if (r15 != 0) goto L4b
            goto L70
        L4b:
            yil r15 = r11.f
            qft r4 = new qft
            r9 = 0
            r10 = 1
            r6 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.d = r14
            r0.c = r3
            java.lang.Object r15 = defpackage.ykr.l(r15, r4, r0)
            if (r15 == r1) goto L73
        L60:
            android.os.Bundle r15 = (android.os.Bundle) r15
            if (r15 == 0) goto L70
            android.os.Bundle r12 = r14.b()
            r12.getClass()
            java.lang.String r13 = "EXTRA_REFRESH_APP_PROVIDED_DATA"
            r12.putBundle(r13, r15)
        L70:
            ygi r12 = defpackage.ygi.a
            return r12
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbv.a(pxg, qis, crm, yih):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (defpackage.ykr.l(r10, r0, r7) == r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (defpackage.ykr.l(r10, r0, r7) != r8) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:
    
        return r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // defpackage.qbl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.pxg r13, java.util.List r14, defpackage.qdo r15, defpackage.yih r16) {
        /*
            r12 = this;
            r0 = r16
            boolean r2 = r0 instanceof defpackage.qbt
            if (r2 == 0) goto L15
            r2 = r0
            qbt r2 = (defpackage.qbt) r2
            int r3 = r2.e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.e = r3
            goto L1a
        L15:
            qbt r2 = new qbt
            r2.<init>(r12, r0)
        L1a:
            r7 = r2
            java.lang.Object r0 = r7.c
            yio r8 = defpackage.yio.a
            int r2 = r7.e
            r9 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L36
            if (r2 != r9) goto L2e
            defpackage.ybn.f(r0)
            goto L9b
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L36:
            qdo r2 = r7.f
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            defpackage.ybn.f(r0)
            r11 = r4
            r4 = r2
            r2 = r3
            r3 = r11
            goto L7e
        L44:
            defpackage.ybn.f(r0)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L9b
            boolean r0 = defpackage.xgs.b()
            if (r0 != 0) goto L5f
            xgv r0 = defpackage.xgv.a
            xgw r0 = r0.get()
            boolean r0 = r0.a()
            if (r0 == 0) goto L7b
        L5f:
            yil r10 = r12.f
            pfo r0 = new pfo
            r4 = 0
            r5 = 12
            r1 = r12
            r3 = r13
            r2 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r7.a = r13
            r7.b = r14
            r7.f = r15
            r7.e = r6
            java.lang.Object r0 = defpackage.ykr.l(r10, r0, r7)
            if (r0 != r8) goto L7b
            goto L9a
        L7b:
            r3 = r13
            r2 = r14
            r4 = r15
        L7e:
            yil r10 = r12.g
            qbu r0 = new qbu
            pxg r3 = (defpackage.pxg) r3
            r5 = 0
            r6 = 0
            r1 = r2
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = 0
            r7.a = r1
            r7.b = r1
            r7.f = r1
            r7.e = r9
            java.lang.Object r0 = defpackage.ykr.l(r10, r0, r7)
            if (r0 != r8) goto L9b
        L9a:
            return r8
        L9b:
            ygi r0 = defpackage.ygi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qbv.b(pxg, java.util.List, qdo, yih):java.lang.Object");
    }
}
