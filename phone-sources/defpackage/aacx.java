package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aacx extends aaeb {
    private final aacw b;

    public aacx(aacw aacwVar, aabu aabuVar) {
        super(aabo.i, aabuVar);
        this.b = aacwVar;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        aacw aacwVar = this.b;
        int iAa = aacwVar.aa(j);
        return aacwVar.P(j, iAa, aacwVar.V(j, iAa));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return 31;
    }

    @Override // defpackage.aaeb, defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.b.f;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        return this.b.ak(j);
    }

    @Override // defpackage.aadr
    public final int y(long j) {
        return this.b.S(j);
    }

    @Override // defpackage.aaeb
    protected final int z(long j, int i) {
        if (i > 28 || i <= 0) {
            return this.b.S(j);
        }
        return 28;
    }
}
