package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadb extends aaeb {
    private final aacw b;

    public aadb(aacw aacwVar, aabu aabuVar) {
        super(aabo.l, aabuVar);
        this.b = aacwVar;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.b.W(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return 53;
    }

    @Override // defpackage.aaeb, defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aaeb, defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.aaeb, defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.b.e;
    }

    @Override // defpackage.aadr
    public final int y(long j) {
        aacw aacwVar = this.b;
        return aacwVar.Y(aacwVar.Z(j));
    }

    @Override // defpackage.aaeb
    protected final int z(long j, int i) {
        if (i > 52) {
            return y(j);
        }
        return 52;
    }
}
