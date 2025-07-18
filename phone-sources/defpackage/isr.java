package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isr extends iqs implements iej, ids {
    private final iea j;
    private final ilo k;
    private final kdj l;

    public isr(iea ieaVar, ilo iloVar, kdj kdjVar, iqw iqwVar, yow yowVar) {
        super(iqwVar, yowVar);
        this.j = ieaVar;
        this.k = iloVar;
        this.l = kdjVar;
        ieaVar.ea(this);
        dM();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0082, code lost:
    
        if (r1.c(r2, r3, r4, r5, r7) != r0) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object a(defpackage.wll r12, boolean r13, defpackage.yih r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.isp
            if (r0 == 0) goto L13
            r0 = r14
            isp r0 = (defpackage.isp) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            isp r0 = new isp
            r0.<init>(r11, r14)
        L18:
            r7 = r0
            java.lang.Object r14 = r7.b
            yio r0 = defpackage.yio.a
            int r1 = r7.d
            r8 = 2
            r9 = 1
            r10 = 0
            if (r1 == 0) goto L41
            if (r1 == r9) goto L37
            if (r1 != r8) goto L2f
            defpackage.ybn.f(r14)     // Catch: java.lang.Exception -> L2c
            goto L84
        L2c:
            r0 = move-exception
            r12 = r0
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            boolean r13 = r7.a
            wll r12 = r7.e
            defpackage.ybn.f(r14)     // Catch: java.lang.Exception -> L2c
        L3e:
            r3 = r12
            r4 = r13
            goto L64
        L41:
            defpackage.ybn.f(r14)
            kdj r14 = r11.l     // Catch: java.lang.Exception -> L2c
            r7.e = r12     // Catch: java.lang.Exception -> L2c
            r7.a = r13     // Catch: java.lang.Exception -> L2c
            r7.d = r9     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = r14.b     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = r1.b()     // Catch: java.lang.Exception -> L2c
            imn r2 = new imn     // Catch: java.lang.Exception -> L2c
            r2.<init>(r14, r12, r13, r10)     // Catch: java.lang.Exception -> L2c
            hfx r1 = (defpackage.hfx) r1     // Catch: java.lang.Exception -> L2c
            java.lang.Object r14 = r1.c(r2, r7)     // Catch: java.lang.Exception -> L2c
            if (r14 == r0) goto L61
            ygi r14 = defpackage.ygi.a     // Catch: java.lang.Exception -> L2c
        L61:
            if (r14 != r0) goto L3e
            goto L8b
        L64:
            ilo r1 = r11.k     // Catch: java.lang.Exception -> L2c
            iea r12 = r11.j     // Catch: java.lang.Exception -> L2c
            ldy r12 = (defpackage.ldy) r12     // Catch: java.lang.Exception -> L2c
            ieg r12 = r12.a()     // Catch: java.lang.Exception -> L2c
            java.lang.Object r12 = r12.g()     // Catch: java.lang.Exception -> L2c
            ksn r12 = (defpackage.ksn) r12     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = r12.a     // Catch: java.lang.Exception -> L2c
            long r5 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L2c
            r7.e = r10     // Catch: java.lang.Exception -> L2c
            r7.d = r8     // Catch: java.lang.Exception -> L2c
            java.lang.Object r12 = r1.c(r2, r3, r4, r5, r7)     // Catch: java.lang.Exception -> L2c
            if (r12 == r0) goto L8b
        L84:
            inp r12 = new inp     // Catch: java.lang.Exception -> L2c
            r13 = 6
            r12.<init>(r9, r10, r10, r13)     // Catch: java.lang.Exception -> L2c
            return r12
        L8b:
            return r0
        L8c:
            r12.toString()
            java.lang.String r13 = r12.toString()
            java.lang.String r14 = "Error updating watched state: "
            java.lang.String r13 = r14.concat(r13)
            defpackage.krd.c(r13)
            inp r13 = new inp
            r14 = 0
            r13.<init>(r14, r10, r12, r8)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isr.a(wll, boolean, yih):java.lang.Object");
    }

    @Override // defpackage.iej
    public final void dM() {
        ldy ldyVar = (ldy) this.j;
        if (ldyVar.a().l()) {
            return;
        }
        p(new isv(ytb.a(this.k.e(((ksn) ldyVar.a().g()).a)), 1));
    }

    @Override // defpackage.iqs
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, yih yihVar) {
        return a((wll) obj, ((Boolean) obj2).booleanValue(), yihVar);
    }

    public final boolean q(wll wllVar) {
        Boolean bool = (Boolean) e(wllVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void r(wll wllVar, boolean z) {
        g(wllVar, Boolean.valueOf(z));
    }
}
