package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class xtb extends xqb {
    protected abstract xqb b();

    @Override // defpackage.xqb
    public void c(String str, Throwable th) {
        b().c(str, th);
    }

    @Override // defpackage.xqb
    public void d() {
        b().d();
    }

    @Override // defpackage.xqb
    public void e(int i) {
        b().e(i);
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", b());
        return tssVarH.toString();
    }
}
