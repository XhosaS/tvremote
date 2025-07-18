package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byu implements bpq {
    public final bpo a;
    private byc b;

    public byu() {
        this(null);
    }

    @Override // defpackage.bpq
    public final void A(bng bngVar, long j, long j2, float f, brx brxVar, bnr bnrVar, int i, int i2) {
        this.a.A(bngVar, j, j2, f, brxVar, bnrVar, i, i2);
    }

    public final void B(bnp bnpVar, long j, bzq bzqVar, byc bycVar, bpu bpuVar) {
        byc bycVar2 = this.b;
        this.b = bycVar;
        bpo bpoVar = this.a;
        bpn bpnVar = bpoVar.b;
        cmi cmiVarN = bzqVar.n();
        clx clxVarC = bpnVar.c();
        cmi cmiVarD = bpnVar.d();
        bnp bnpVarB = bpnVar.b();
        long jA = bpnVar.a();
        bpu bpuVar2 = bpnVar.a;
        bpnVar.f(bzqVar);
        bpnVar.g(cmiVarN);
        bpnVar.e(bnpVar);
        bpnVar.h(j);
        bpnVar.a = bpuVar;
        bnpVar.g();
        try {
            bycVar.bU(this);
            bnpVar.e();
            bpn bpnVar2 = bpoVar.b;
            bpnVar2.f(clxVarC);
            bpnVar2.g(cmiVarD);
            bpnVar2.e(bnpVarB);
            bpnVar2.h(jA);
            bpnVar2.a = bpuVar2;
            this.b = bycVar2;
        } catch (Throwable th) {
            bnpVar.e();
            bpn bpnVar3 = bpoVar.b;
            bpnVar3.f(clxVarC);
            bpnVar3.g(cmiVarD);
            bpnVar3.e(bnpVarB);
            bpnVar3.h(jA);
            bpnVar3.a = bpuVar2;
            throw th;
        }
    }

    @Override // defpackage.clx
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.cmd
    public final float cn(long j) {
        return cme.e(this.a, j);
    }

    @Override // defpackage.clx
    public final float co(float f) {
        return cme.g(this.a, f);
    }

    @Override // defpackage.clx
    public final float cp(int i) {
        return cme.h(this.a, i);
    }

    @Override // defpackage.clx
    public final float cq(long j) {
        return cme.i(this.a, j);
    }

    @Override // defpackage.clx
    public final float cr(float f) {
        return cme.j(this.a, f);
    }

    @Override // defpackage.clx
    public final int cu(float f) {
        return cme.k(this.a, f);
    }

    @Override // defpackage.clx
    public final long cv(long j) {
        return cme.l(this.a, j);
    }

    @Override // defpackage.clx
    public final long cw(long j) {
        return cme.m(this.a, j);
    }

    @Override // defpackage.cmd
    public final long cx(float f) {
        return cme.f(this.a, f);
    }

    @Override // defpackage.clx
    public final long cy(float f) {
        return cme.n(this.a, f);
    }

    @Override // defpackage.bpq
    public final long m() {
        return brx.l(this.a);
    }

    @Override // defpackage.bpq
    public final long n() {
        return brx.m(this.a);
    }

    @Override // defpackage.bpq
    public final cmi o() {
        return this.a.o();
    }

    @Override // defpackage.bpq
    public final bpn p() {
        return this.a.b;
    }

    @Override // defpackage.bpq
    public final void q(long j, long j2, long j3, float f, int i) {
        this.a.q(j, j2, j3, f, i);
    }

    public final void r() {
        bnp bnpVarB = p().b();
        byc bycVar = this.b;
        if (bycVar == null) {
            bty.a("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
            throw new yfs();
        }
        bko bkoVarF = bycVar.E().u;
        if (bkoVarF == null || (bkoVarF.s & 4) == 0) {
            bkoVarF = null;
        } else {
            while (bkoVarF != null) {
                int i = bkoVarF.r;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    bkoVarF = bkoVarF.u;
                }
            }
            bkoVarF = null;
        }
        if (bkoVarF == null) {
            bzq bzqVarJ = fh.J(bycVar, 4);
            if (bzqVarJ.A() == bycVar.E()) {
                bzqVarJ = bzqVarJ.v;
                bzqVarJ.getClass();
            }
            bzqVarJ.E(bnpVarB, p().a);
            return;
        }
        bfz bfzVar = null;
        while (bkoVarF != null) {
            if (bkoVarF instanceof byc) {
                byc bycVar2 = (byc) bkoVarF;
                bpu bpuVar = p().a;
                bzq bzqVarJ2 = fh.J(bycVar2, 4);
                bzqVarJ2.s.k().B(bnpVarB, clw.y(bzqVarJ2.c), bzqVarJ2, bycVar2, bpuVar);
            } else if ((bkoVarF.r & 4) != 0 && (bkoVarF instanceof bxw)) {
                int i2 = 0;
                for (bko bkoVar = ((bxw) bkoVarF).C; bkoVar != null; bkoVar = bkoVar.u) {
                    if ((bkoVar.r & 4) != 0) {
                        i2++;
                        if (i2 == 1) {
                            bkoVarF = bkoVar;
                        } else {
                            if (bfzVar == null) {
                                bfzVar = new bfz(new bko[16], 0);
                            }
                            if (bkoVarF != null) {
                                bfzVar.o(bkoVarF);
                            }
                            bfzVar.o(bkoVar);
                            bkoVarF = null;
                        }
                    }
                }
                if (i2 != 1) {
                }
            }
            bkoVarF = fh.F(bfzVar);
        }
    }

    @Override // defpackage.bpq
    public final void s(long j, long j2, long j3, float f, brx brxVar, bnr bnrVar, int i) {
        this.a.s(j, j2, j3, f, brxVar, bnrVar, i);
    }

    @Override // defpackage.bpq
    public final void t(bnn bnnVar, long j, long j2, float f, brx brxVar, int i) {
        int i2 = (int) (j & 4294967295L);
        bpo bpoVar = this.a;
        int i3 = (int) (j >> 32);
        bpoVar.a.c.o(Float.intBitsToFloat(i3), Float.intBitsToFloat(i2), Float.intBitsToFloat(i3) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 & 4294967295L)), bpo.C(bpoVar, bnnVar, brxVar, f, null, i));
    }

    @Override // defpackage.bpq
    public final void u(bni bniVar, bnn bnnVar, float f, brx brxVar, int i) {
        this.a.u(bniVar, bnnVar, f, brxVar, i);
    }

    @Override // defpackage.bpq
    public final void v(long j, float f, float f2, long j2, long j3, brx brxVar) {
        this.a.v(j, f, f2, j2, j3, brxVar);
    }

    @Override // defpackage.bpq
    public final void w(long j, float f, long j2, float f2, brx brxVar) {
        this.a.w(j, f, j2, f2, brxVar);
    }

    @Override // defpackage.bpq
    public final void x(bni bniVar, long j, float f, brx brxVar) {
        this.a.x(bniVar, j, f, brxVar);
    }

    @Override // defpackage.bpq
    public final void y(bnn bnnVar, long j, long j2, long j3, float f, brx brxVar) {
        int i = (int) (j & 4294967295L);
        bpo bpoVar = this.a;
        int i2 = (int) (j >> 32);
        bpoVar.a.c.p(Float.intBitsToFloat(i2), Float.intBitsToFloat(i), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), bpo.C(bpoVar, bnnVar, brxVar, f, null, 3));
    }

    @Override // defpackage.bpq
    public final void z(long j, long j2, long j3, long j4, brx brxVar, float f) {
        this.a.z(j, j2, j3, j4, brxVar, f);
    }

    public /* synthetic */ byu(byte[] bArr) {
        this.a = new bpo();
    }
}
