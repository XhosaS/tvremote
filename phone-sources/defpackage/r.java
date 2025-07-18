package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class r extends m {
    private static final long serialVersionUID = 1405488568664762222L;

    public r(n nVar, n nVar2) {
        super(nVar, nVar2);
    }

    @Override // defpackage.n
    public final boolean a(o oVar) {
        return this.a.a(oVar) || this.b.a(oVar);
    }

    public final String toString() {
        n nVar = this.b;
        return this.a.toString() + " or " + nVar.toString();
    }
}
