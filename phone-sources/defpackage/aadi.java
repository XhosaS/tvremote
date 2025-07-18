package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadi extends aadt {
    private final aacw a;

    public aadi(aabm aabmVar, aacw aacwVar) {
        super(aabmVar, aabo.c);
        this.a = aacwVar;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA <= 0 ? 1 - iA : iA;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        return this.b.e(j, i);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, 1, c());
        if (this.a.aa(j) <= 0) {
            i = 1 - i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final aabu u() {
        return this.a.h;
    }
}
