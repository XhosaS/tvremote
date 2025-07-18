package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irn extends iqs implements iej, ids {
    private final iea j;
    private final ikx k;
    private final kdj l;

    public irn(iea ieaVar, ikx ikxVar, kdj kdjVar, iqw iqwVar, yow yowVar) {
        super(iqwVar, yowVar);
        this.j = ieaVar;
        this.k = ikxVar;
        this.l = kdjVar;
        ieaVar.ea(this);
        dM();
    }

    private final wog u(wll wllVar) {
        wog wogVar = (wog) e(wllVar);
        return wogVar == null ? wog.THUMBS_NONE : wogVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r1.c(r2, r3, r4, r5, r7) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, yfo] */
    @Override // defpackage.iqs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.wll r12, defpackage.wog r13, defpackage.yih r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.irl
            if (r0 == 0) goto L13
            r0 = r14
            irl r0 = (defpackage.irl) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            irl r0 = new irl
            r0.<init>(r11, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.a
            yio r0 = defpackage.yio.a
            int r1 = r7.c
            r8 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L41
            if (r1 == r9) goto L37
            if (r1 != r8) goto L2f
            defpackage.ybn.f(r14)     // Catch: java.lang.Exception -> L2c
            goto L8b
        L2c:
            r0 = move-exception
            r12 = r0
            goto L93
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            wog r13 = r7.e
            wll r12 = r7.d
            defpackage.ybn.f(r14)     // Catch: java.lang.Exception -> L2c
            r3 = r12
            r4 = r13
            goto L69
        L41:
            defpackage.ybn.f(r14)
            kdj r2 = r11.l     // Catch: java.lang.Exception -> L2c
            r7.d = r12     // Catch: java.lang.Exception -> L2c
            r7.e = r13     // Catch: java.lang.Exception -> L2c
            r7.c = r9     // Catch: java.lang.Exception -> L2c
            java.lang.Object r14 = r2.b     // Catch: java.lang.Exception -> L2c
            java.lang.Object r14 = r14.b()     // Catch: java.lang.Exception -> L2c
            om r1 = new om     // Catch: java.lang.Exception -> L2c
            r5 = 0
            r6 = 11
            r3 = r12
            r4 = r13
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L2c
            hfx r14 = (defpackage.hfx) r14     // Catch: java.lang.Exception -> L2c
            java.lang.Object r12 = r14.c(r1, r7)     // Catch: java.lang.Exception -> L2c
            if (r12 == r0) goto L66
            ygi r12 = defpackage.ygi.a     // Catch: java.lang.Exception -> L2c
        L66:
            if (r12 != r0) goto L69
            goto L92
        L69:
            ikx r1 = r11.k     // Catch: java.lang.Exception -> L2c
            iea r12 = r11.j     // Catch: java.lang.Exception -> L2c
            ldy r12 = (defpackage.ldy) r12     // Catch: java.lang.Exception -> L2c
            ieg r12 = r12.a()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r12 = r12.g()     // Catch: java.lang.Exception -> L2c
            ksn r12 = (defpackage.ksn) r12     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = r12.a     // Catch: java.lang.Exception -> L2c
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2c
            r7.d = r10     // Catch: java.lang.Exception -> L2c
            r7.e = r10     // Catch: java.lang.Exception -> L2c
            r7.c = r8     // Catch: java.lang.Exception -> L2c
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r7)     // Catch: java.lang.Exception -> L2c
            if (r12 == r0) goto L92
        L8b:
            inp r12 = new inp     // Catch: java.lang.Exception -> L2c
            r13 = 6
            r12.<init>(r9, r10, r10, r13)     // Catch: java.lang.Exception -> L2c
            return r12
        L92:
            return r0
        L93:
            r12.toString()
            java.lang.String r13 = r12.toString()
            java.lang.String r14 = "Error updating sentiment state: "
            java.lang.String r13 = r14.concat(r13)
            defpackage.krd.c(r13)
            inp r13 = new inp
            r14 = 0
            r13.<init>(r14, r10, r12, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irn.f(wll, wog, yih):java.lang.Object");
    }

    @Override // defpackage.iej
    public final void dM() {
        ldy ldyVar = (ldy) this.j;
        if (ldyVar.a().l()) {
            return;
        }
        p(new gxd(ytb.a(this.k.e(((ksn) ldyVar.a().g()).a)), 12));
    }

    public final boolean q(wll wllVar) {
        wllVar.getClass();
        return u(wllVar) == wog.THUMBS_DOWN;
    }

    public final boolean r(wll wllVar) {
        return u(wllVar) == wog.THUMBS_UP;
    }

    public final void s(wll wllVar, boolean z) {
        g(wllVar, z ? wog.THUMBS_DOWN : wog.THUMBS_NONE);
    }

    public final void t(wll wllVar, boolean z) {
        g(wllVar, z ? wog.THUMBS_UP : wog.THUMBS_NONE);
    }
}
