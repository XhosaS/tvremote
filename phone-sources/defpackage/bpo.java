package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpo implements bpq {
    public final bpm a = new bpm(bpp.a, cmi.a, bpr.a);
    public final bpn b = new bpn(this);
    private tac c;
    private tac d;

    static /* synthetic */ tac B(bpo bpoVar, long j, brx brxVar, float f, bnr bnrVar, int i) {
        tac tacVarF = bpoVar.F(brxVar);
        long jD = D(j, f);
        long jL = tacVarF.l();
        long j2 = bnq.a;
        if (!a.s(jL, jD)) {
            tacVarF.o(jD);
        }
        if (tacVarF.b != null) {
            tacVarF.r(null);
        }
        if (!yks.e(tacVarF.c, bnrVar)) {
            tacVarF.p(bnrVar);
        }
        if (!a.r(tacVarF.a, i)) {
            tacVarF.n(i);
        }
        if (!a.r(tacVarF.i(), 1)) {
            tacVarF.q(1);
        }
        return tacVarF;
    }

    public static /* synthetic */ tac C(bpo bpoVar, bnn bnnVar, brx brxVar, float f, bnr bnrVar, int i) {
        return bpoVar.E(bnnVar, brxVar, f, bnrVar, i, 1);
    }

    private static final long D(long j, float f) {
        return f == 1.0f ? j : bny.k(bnq.d(j), bnq.c(j), bnq.b(j), bnq.a(j) * f, bnq.f(j));
    }

    private final tac E(bnn bnnVar, brx brxVar, float f, bnr bnrVar, int i, int i2) {
        tac tacVarF = F(brxVar);
        if (bnnVar != null) {
            bnnVar.a(brx.m(this), tacVarF, f);
        } else {
            if (tacVarF.b != null) {
                tacVarF.r(null);
            }
            long jL = tacVarF.l();
            long j = bnq.a;
            if (!a.s(jL, j)) {
                tacVarF.o(j);
            }
            if (tacVarF.f() != f) {
                tacVarF.m(f);
            }
        }
        if (!yks.e(tacVarF.c, bnrVar)) {
            tacVarF.p(bnrVar);
        }
        if (!a.r(tacVarF.a, i)) {
            tacVarF.n(i);
        }
        if (!a.r(tacVarF.i(), i2)) {
            tacVarF.q(i2);
        }
        return tacVarF;
    }

    private final tac F(brx brxVar) {
        if (yks.e(brxVar, bps.a)) {
            tac tacVar = this.c;
            if (tacVar != null) {
                return tacVar;
            }
            tac tacVar2 = new tac(null, null);
            tacVar2.w(0);
            this.c = tacVar2;
            return tacVar2;
        }
        if (!(brxVar instanceof bpt)) {
            throw new yfu();
        }
        tac tacVarR = r();
        float fH = tacVarR.h();
        bpt bptVar = (bpt) brxVar;
        float f = bptVar.a;
        if (fH != f) {
            tacVarR.v(f);
        }
        int iJ = tacVarR.j();
        int i = bptVar.c;
        if (!a.r(iJ, i)) {
            tacVarR.s(i);
        }
        float fG = tacVarR.g();
        float f2 = bptVar.b;
        if (fG != f2) {
            tacVarR.u(f2);
        }
        int iK = tacVarR.k();
        int i2 = bptVar.d;
        if (!a.r(iK, i2)) {
            tacVarR.t(i2);
        }
        if (!yks.e(null, null)) {
            tacVarR.x();
        }
        return tacVarR;
    }

    @Override // defpackage.bpq
    public final void A(bng bngVar, long j, long j2, float f, brx brxVar, bnr bnrVar, int i, int i2) {
        this.a.c.t(bngVar, j, j2, E(null, brxVar, f, bnrVar, i, i2));
    }

    @Override // defpackage.clx
    public final float a() {
        return this.a.a.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.a.a.b();
    }

    @Override // defpackage.cmd
    public final /* synthetic */ float cn(long j) {
        return cme.e(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float co(float f) {
        return cme.g(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cp(int i) {
        return cme.h(this, i);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cq(long j) {
        return cme.i(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ float cr(float f) {
        return cme.j(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ int cu(float f) {
        return cme.k(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cv(long j) {
        return cme.l(this, j);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cw(long j) {
        return cme.m(this, j);
    }

    @Override // defpackage.cmd
    public final /* synthetic */ long cx(float f) {
        return cme.f(this, f);
    }

    @Override // defpackage.clx
    public final /* synthetic */ long cy(float f) {
        return cme.n(this, f);
    }

    @Override // defpackage.bpq
    public final /* synthetic */ long m() {
        return brx.l(this);
    }

    @Override // defpackage.bpq
    public final /* synthetic */ long n() {
        return brx.m(this);
    }

    @Override // defpackage.bpq
    public final cmi o() {
        return this.a.b;
    }

    @Override // defpackage.bpq
    public final bpn p() {
        return this.b;
    }

    @Override // defpackage.bpq
    public final void q(long j, long j2, long j3, float f, int i) {
        bnp bnpVar = this.a.c;
        tac tacVarR = r();
        long jD = D(j, 1.0f);
        long jL = tacVarR.l();
        long j4 = bnq.a;
        if (!a.s(jL, jD)) {
            tacVarR.o(jD);
        }
        if (tacVarR.b != null) {
            tacVarR.r(null);
        }
        if (!yks.e(tacVarR.c, null)) {
            tacVarR.p(null);
        }
        if (!a.r(tacVarR.a, 3)) {
            tacVarR.n(3);
        }
        if (tacVarR.h() != f) {
            tacVarR.v(f);
        }
        if (tacVarR.g() != 4.0f) {
            tacVarR.u(4.0f);
        }
        if (!a.r(tacVarR.j(), i)) {
            tacVarR.s(i);
        }
        if (!a.r(tacVarR.k(), 0)) {
            tacVarR.t(0);
        }
        if (!yks.e(null, null)) {
            tacVarR.x();
        }
        if (!a.r(tacVarR.i(), 1)) {
            tacVarR.q(1);
        }
        bnpVar.n(j2, j3, tacVarR);
    }

    public final tac r() {
        tac tacVar = this.d;
        if (tacVar != null) {
            return tacVar;
        }
        tac tacVar2 = new tac(null, null);
        tacVar2.w(1);
        this.d = tacVar2;
        return tacVar2;
    }

    @Override // defpackage.bpq
    public final void s(long j, long j2, long j3, float f, brx brxVar, bnr bnrVar, int i) {
        int i2 = (int) (j2 & 4294967295L);
        int i3 = (int) (j2 >> 32);
        this.a.c.o(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 & 4294967295L)), B(this, j, brxVar, f, bnrVar, i));
    }

    @Override // defpackage.bpq
    public final void t(bnn bnnVar, long j, long j2, float f, brx brxVar, int i) {
        throw null;
    }

    @Override // defpackage.bpq
    public final void u(bni bniVar, bnn bnnVar, float f, brx brxVar, int i) {
        this.a.c.r(bniVar, C(this, bnnVar, brxVar, f, null, i));
    }

    @Override // defpackage.bpq
    public final void v(long j, float f, float f2, long j2, long j3, brx brxVar) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.q(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), f, f2, B(this, j, brxVar, 1.0f, null, 3));
    }

    @Override // defpackage.bpq
    public final void w(long j, float f, long j2, float f2, brx brxVar) {
        this.a.c.m(j2, f, B(this, j, brxVar, f2, null, 3));
    }

    @Override // defpackage.bpq
    public final void x(bni bniVar, long j, float f, brx brxVar) {
        this.a.c.r(bniVar, B(this, j, brxVar, f, null, 3));
    }

    @Override // defpackage.bpq
    public final void y(bnn bnnVar, long j, long j2, long j3, float f, brx brxVar) {
        throw null;
    }

    @Override // defpackage.bpq
    public final void z(long j, long j2, long j3, long j4, brx brxVar, float f) {
        int i = (int) (j2 & 4294967295L);
        int i2 = (int) (j2 >> 32);
        this.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j3 & 4294967295L)), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), B(this, j, brxVar, f, null, 3));
    }
}
