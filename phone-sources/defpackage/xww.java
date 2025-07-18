package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class xww extends xsa {
    private final xsa a;

    public xww(xsa xsaVar) {
        this.a = xsaVar;
    }

    @Override // defpackage.xpz
    public final xqb a(xsq xsqVar, xpy xpyVar) {
        return this.a.a(xsqVar, xpyVar);
    }

    @Override // defpackage.xpz
    public final String b() {
        return this.a.b();
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("delegate", this.a);
        return tssVarH.toString();
    }
}
