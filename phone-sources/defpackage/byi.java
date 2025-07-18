package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byi extends bzq {
    private static final tac h;
    public final cah f;
    public bza g;

    static {
        tac tacVar = new tac(null, null);
        tacVar.o(bnq.d);
        tacVar.v(1.0f);
        tacVar.w(1);
        h = tacVar;
    }

    public byi(bys bysVar) {
        super(bysVar);
        cah cahVar = new cah();
        this.f = cahVar;
        cahVar.w = this;
        this.g = bysVar.h != null ? new byh(this) : null;
    }

    private final void F() {
        if (this.j) {
            return;
        }
        this.s.m().C();
    }

    @Override // defpackage.bzq
    public final /* synthetic */ bko A() {
        return this.f;
    }

    @Override // defpackage.bzq
    public final bza B() {
        return this.g;
    }

    @Override // defpackage.bzq
    public final void C() {
        if (this.g == null) {
            this.g = new byh(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [bko] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v10, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [bfz] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.bzq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(defpackage.bzo r18, long r19, defpackage.byg r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byi.D(bzo, long, byg, int, boolean):void");
    }

    @Override // defpackage.bzq
    public final void E(bnp bnpVar, bpu bpuVar) throws Throwable {
        bys bysVar = this.s;
        bzz bzzVarA = byv.a(bysVar);
        bfz bfzVarH = bysVar.h();
        Object[] objArr = bfzVarH.a;
        int i = bfzVarH.b;
        for (int i2 = 0; i2 < i; i2++) {
            bys bysVar2 = (bys) objArr[i2];
            if (bysVar2.ag()) {
                bysVar2.A(bnpVar, bpuVar);
            }
        }
        if (bzzVarA.A()) {
            ay(bnpVar, h);
        }
    }

    @Override // defpackage.buy
    public final int c(int i) {
        dhk dhkVarAz = this.s.az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.a(bysVar.o(), bysVar.s(), i);
    }

    @Override // defpackage.bzq, defpackage.bwj
    public final void cm(long j, float f, yjv yjvVar) {
        super.cm(j, f, yjvVar);
        F();
    }

    @Override // defpackage.buy
    public final int d(int i) {
        dhk dhkVarAz = this.s.az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.b(bysVar.o(), bysVar.s(), i);
    }

    @Override // defpackage.buy
    public final int e(int i) {
        dhk dhkVarAz = this.s.az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.c(bysVar.o(), bysVar.s(), i);
    }

    @Override // defpackage.buy
    public final int f(int i) {
        dhk dhkVarAz = this.s.az();
        bvt bvtVarG = dhkVarAz.g();
        bys bysVar = (bys) dhkVarAz.a;
        return bvtVarG.d(bysVar.o(), bysVar.s(), i);
    }

    @Override // defpackage.byz
    public final int q(bub bubVar) {
        bza bzaVar = this.g;
        if (bzaVar != null) {
            return bzaVar.q(bubVar);
        }
        bzh bzhVar = (bzh) Z();
        if (!bzhVar.l) {
            if (bzhVar.F() == 1) {
                bxl bxlVar = bzhVar.w;
                bxlVar.f = true;
                if (bxlVar.b) {
                    bzhVar.s();
                }
            } else {
                bzhVar.w.g = true;
            }
        }
        bzhVar.j().k = true;
        bzhVar.l();
        bzhVar.j().k = false;
        Integer num = (Integer) bzhVar.w.h.get(bubVar);
        if (num == null) {
            return Integer.MIN_VALUE;
        }
        return num.intValue();
    }

    @Override // defpackage.bvs
    public final bwj u(long j) {
        if (this.u) {
            bza bzaVar = this.g;
            bzaVar.getClass();
            j = bzaVar.d;
        }
        z(j);
        bys bysVar = this.s;
        bfz bfzVarI = bysVar.i();
        Object[] objArr = bfzVarI.a;
        int i = bfzVarI.b;
        for (int i2 = 0; i2 < i; i2++) {
            ((bys) objArr[i2]).m().G = 3;
        }
        ap(bysVar.o.e(this, bysVar.s(), j));
        ai();
        return this;
    }

    @Override // defpackage.bzq, defpackage.bwj
    public final void x(long j, float f, bpu bpuVar) {
        super.x(j, f, bpuVar);
        F();
    }
}
