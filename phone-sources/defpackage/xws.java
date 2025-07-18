package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xws implements xvn {
    final xtk a;
    private final xvl b;

    public xws(xtk xtkVar, xvl xvlVar) {
        sij.o(!xtkVar.g(), "error must not be OK");
        this.a = xtkVar;
        this.b = xvlVar;
    }

    @Override // defpackage.xvn
    public final xvk a(xsq xsqVar, xsm xsmVar, xpy xpyVar, xqe[] xqeVarArr) {
        return new xwr(this.a, this.b, xqeVarArr);
    }

    @Override // defpackage.xri
    public final xre c() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
