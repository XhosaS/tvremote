package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bwi implements clx {
    private boolean a;

    public static /* synthetic */ void B(bwi bwiVar, bwj bwjVar, int i, int i2, yjv yjvVar, int i3) {
        if ((i3 & 8) != 0) {
            yjvVar = bwk.a;
        }
        bwiVar.A(bwjVar, i, i2, yjvVar);
    }

    public static /* synthetic */ void y(bwi bwiVar, bwj bwjVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        if (bwiVar.o() == cmi.a || bwiVar.m() == 0) {
            bwiVar.q(bwjVar);
            bwjVar.cm(cmf.d(j, bwjVar.e), 0.0f, null);
            return;
        }
        int iM = bwiVar.m() - bwjVar.a;
        int iA = cmf.a(j);
        bwiVar.q(bwjVar);
        bwjVar.cm(cmf.d((cmf.b(j) & 4294967295L) | ((iM - iA) << 32), bwjVar.e), 0.0f, null);
    }

    public static /* synthetic */ void z(bwi bwiVar, bwj bwjVar, int i, int i2) {
        long j = (i2 & 4294967295L) | (i << 32);
        yjv yjvVar = bwk.a;
        if (bwiVar.o() == cmi.a || bwiVar.m() == 0) {
            bwiVar.q(bwjVar);
            bwjVar.cm(cmf.d(j, bwjVar.e), 0.0f, yjvVar);
            return;
        }
        int iM = bwiVar.m() - bwjVar.a;
        int iA = cmf.a(j);
        bwiVar.q(bwjVar);
        bwjVar.cm(cmf.d((cmf.b(j) & 4294967295L) | ((iM - iA) << 32), bwjVar.e), 0.0f, yjvVar);
    }

    public final void A(bwj bwjVar, int i, int i2, yjv yjvVar) {
        q(bwjVar);
        bwjVar.cm(cmf.d((i2 & 4294967295L) | (i << 32), bwjVar.e), 0.0f, yjvVar);
    }

    @Override // defpackage.clx
    public float a() {
        throw null;
    }

    @Override // defpackage.cmd
    public float b() {
        throw null;
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

    public abstract int m();

    public bvc n() {
        throw null;
    }

    public abstract cmi o();

    public float p(bwp bwpVar) {
        return Float.NaN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q(bwj bwjVar) {
        if (bwjVar instanceof bzj) {
            ((bzj) bwjVar).Q(this.a);
        }
    }

    public final void r(bwj bwjVar, int i, int i2, float f) {
        q(bwjVar);
        bwjVar.cm(cmf.d((i2 & 4294967295L) | (i << 32), bwjVar.e), f, null);
    }

    public final void s(bwj bwjVar, long j, float f) {
        q(bwjVar);
        bwjVar.cm(cmf.d(j, bwjVar.e), f, null);
    }

    public final void t(bwj bwjVar, long j, float f, yjv yjvVar) {
        q(bwjVar);
        bwjVar.cm(cmf.d(j, bwjVar.e), f, yjvVar);
    }

    public final void u(bwj bwjVar, long j, bpu bpuVar, float f) {
        q(bwjVar);
        bwjVar.x(cmf.d(j, bwjVar.e), f, bpuVar);
    }

    public final void v(yjv yjvVar) {
        this.a = true;
        yjvVar.a(this);
        this.a = false;
    }
}
