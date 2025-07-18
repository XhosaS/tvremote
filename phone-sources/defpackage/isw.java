package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class isw extends iqs implements iej, ixl {
    public final yum j;
    private final iea k;
    private final ilu l;
    private final yuj m;
    private final kdj n;

    public isw(iea ieaVar, ilu iluVar, kdj kdjVar, iqw iqwVar, yow yowVar) {
        super(iqwVar, yowVar);
        this.k = ieaVar;
        this.l = iluVar;
        this.n = kdjVar;
        yuj yujVarE = yuq.e(0, 0, 0, 7);
        this.m = yujVarE;
        this.j = new yuk(yujVarE);
        ieaVar.ea(this);
        dM();
    }

    @Override // defpackage.iej
    public final void dM() {
        if (((ldy) this.k).a().l()) {
            return;
        }
        ysx ysxVarA = ytb.a(this.l.e(r()));
        ale aleVar = new ale(this, (yih) null, 7);
        int i = ytx.a;
        p(new isv(new isv(new ipi(ysxVarA, aleVar, 18), 8), 0));
    }

    @Override // defpackage.ixl
    public final void dP() {
        eb();
    }

    @Override // defpackage.iqs
    public final /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, yih yihVar) {
        return q((iog) obj, ((Boolean) obj2).booleanValue(), yihVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if (r5.c(r18, r7, r8, r9, r11) == r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fb, code lost:
    
        if (r3.emit(r5, r11) == r4) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, yfo] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final java.lang.Object q(defpackage.iog r23, boolean r24, defpackage.yih r25) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isw.q(iog, boolean, yih):java.lang.Object");
    }

    public final String r() {
        return ((ksn) ((ldy) this.k).a().g()).a;
    }

    public final ypc s(iog iogVar, boolean z) {
        return g(iogVar, Boolean.valueOf(z));
    }

    public final boolean t(iog iogVar) {
        iogVar.getClass();
        Boolean bool = (Boolean) e(iogVar);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
