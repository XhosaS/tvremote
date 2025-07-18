package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class xwv implements xvv {
    @Override // defpackage.xvn
    public xvk a(xsq xsqVar, xsm xsmVar, xpy xpyVar, xqe[] xqeVarArr) {
        throw null;
    }

    @Override // defpackage.xze
    public final Runnable b(xzd xzdVar) {
        return d().b(xzdVar);
    }

    @Override // defpackage.xri
    public final xre c() {
        return d().c();
    }

    protected abstract xvv d();

    @Override // defpackage.xze
    public void e(xtk xtkVar) {
        d().e(xtkVar);
    }

    @Override // defpackage.xze
    public final void f(xtk xtkVar) {
        throw null;
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", d());
        return tssVarH.toString();
    }
}
