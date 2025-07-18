package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ejw implements ekc, eke {
    private int a;
    private ewx b;
    private boolean c;

    @Override // defpackage.ekc
    public final void F(dze[] dzeVarArr, ewx ewxVar, long j, long j2, evz evzVar) {
        a.ab(!this.c);
        this.b = ewxVar;
        h(j2);
    }

    @Override // defpackage.ekc
    public final void G() {
        a.ab(this.a == 0);
    }

    @Override // defpackage.ekc
    public final void H(long j) {
        this.c = false;
        m(j);
    }

    @Override // defpackage.ekc
    public final void I() {
        this.c = true;
    }

    @Override // defpackage.ekc
    public final void M() {
        a.ab(this.a == 1);
        this.a = 2;
    }

    @Override // defpackage.ekc
    public final void N() {
        a.ab(this.a == 2);
        this.a = 1;
    }

    @Override // defpackage.ekc
    public final boolean O() {
        return true;
    }

    @Override // defpackage.ekc
    public final boolean P() {
        return this.c;
    }

    @Override // defpackage.ekc
    public final boolean cH() {
        return true;
    }

    @Override // defpackage.ekc
    public final boolean cI() {
        return true;
    }

    @Override // defpackage.eke
    public final int cJ(dze dzeVar) {
        return clw.F(0);
    }

    @Override // defpackage.ekc
    public final int dj() {
        return this.a;
    }

    @Override // defpackage.ekc, defpackage.eke
    public final int dk() {
        return -2;
    }

    @Override // defpackage.eke
    public final int dl() {
        return 0;
    }

    @Override // defpackage.ekc
    public final /* synthetic */ long e(long j, long j2) {
        return 10000L;
    }

    @Override // defpackage.ekc
    public final long f() {
        return Long.MIN_VALUE;
    }

    protected void g() {
        throw null;
    }

    protected void h(long j) {
        throw null;
    }

    @Override // defpackage.ekc
    public final ejj j() {
        return null;
    }

    protected void m(long j) {
        throw null;
    }

    @Override // defpackage.ekc
    public final ewx n() {
        return this.b;
    }

    @Override // defpackage.ekc
    public final void p() {
        a.ab(this.a == 1);
        this.a = 0;
        this.b = null;
        this.c = false;
        g();
    }

    @Override // defpackage.ekc
    public final void q(ekf ekfVar, dze[] dzeVarArr, ewx ewxVar, long j, boolean z, boolean z2, long j2, long j3, evz evzVar) {
        a.ab(this.a == 0);
        this.a = 1;
        F(dzeVarArr, ewxVar, j2, j3, evzVar);
        m(j);
    }

    @Override // defpackage.ekc
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.ekc
    public final eke k() {
        return this;
    }

    @Override // defpackage.eke
    public final /* synthetic */ void o() {
    }

    @Override // defpackage.ekc
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.ekc
    public final void u() {
    }

    @Override // defpackage.eke
    public final /* synthetic */ void J(ekd ekdVar) {
    }

    @Override // defpackage.ekc
    public final void L(eay eayVar) {
    }

    @Override // defpackage.ekc
    public final /* synthetic */ void K(float f, float f2) {
    }

    @Override // defpackage.ejz
    public void s(int i, Object obj) {
    }

    @Override // defpackage.ekc
    public final void t(int i, elk elkVar, ecn ecnVar) {
    }
}
