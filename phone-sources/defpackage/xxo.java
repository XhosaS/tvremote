package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xxo extends xwv {
    public final xva a;
    private final xvv b;

    public xxo(xvv xvvVar, xva xvaVar) {
        this.b = xvvVar;
        this.a = xvaVar;
    }

    @Override // defpackage.xwv, defpackage.xvn
    public final xvk a(xsq xsqVar, xsm xsmVar, xpy xpyVar, xqe[] xqeVarArr) {
        return new xxn(this, this.b.a(xsqVar, xsmVar, xpyVar, xqeVarArr));
    }

    @Override // defpackage.xwv
    protected final xvv d() {
        return this.b;
    }
}
