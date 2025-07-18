package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class xwu implements xvm {
    @Override // defpackage.xvm
    public void a(xtk xtkVar, xvl xvlVar, xsm xsmVar) {
        throw null;
    }

    protected abstract xvm b();

    @Override // defpackage.xvm
    public final void c(xsm xsmVar) {
        b().c(xsmVar);
    }

    @Override // defpackage.ybu
    public final void d() {
        b().d();
    }

    @Override // defpackage.ybu
    public final void e(xzg xzgVar) {
        b().e(xzgVar);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", b());
        return tssVarH.toString();
    }
}
