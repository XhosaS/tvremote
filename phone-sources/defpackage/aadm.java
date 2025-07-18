package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadm extends aadt {
    static final aabm a = new aadm();

    private aadm() {
        super(aadj.H.n, aabo.c);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        int iA = this.b.a(j);
        return iA < 0 ? -iA : iA;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final int d() {
        return 0;
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
        vxr.ay(this, i, 0, c());
        if (this.b.a(j) < 0) {
            i = -i;
        }
        return super.h(j, i);
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final aabu u() {
        return aadj.H.h;
    }
}
