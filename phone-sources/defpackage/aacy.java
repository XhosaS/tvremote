package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aacy extends aaeb {
    private final aacw b;

    public aacy(aacw aacwVar, aabu aabuVar) {
        super(aabo.g, aabuVar);
        this.b = aacwVar;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        aacw aacwVar = this.b;
        return aacwVar.R(j, aacwVar.aa(j));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return 366;
    }

    @Override // defpackage.aaeb, defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.b.g;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        return this.b.ak(j);
    }

    @Override // defpackage.aadr
    public final int y(long j) {
        aacw aacwVar = this.b;
        return aacwVar.al(aacwVar.aa(j)) ? 366 : 365;
    }

    @Override // defpackage.aaeb
    protected final int z(long j, int i) {
        if (i > 365 || i <= 0) {
            return y(j);
        }
        return 365;
    }
}
