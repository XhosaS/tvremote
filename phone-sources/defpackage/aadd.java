package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadd extends aadx {
    protected final aacw a;

    public aadd(aacw aacwVar) {
        super(aabo.f, 31556952000L);
        this.a = aacwVar;
    }

    @Override // defpackage.aadx
    public final long A(long j, long j2) {
        return j < j2 ? -this.a.af(j2, j) : this.a.af(j, j2);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.a.aa(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.aabm
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        if (i == 0) {
            return j;
        }
        int iA = a(j);
        int i2 = iA + i;
        if ((iA ^ i2) >= 0 || (iA ^ i) < 0) {
            return h(j, i2);
        }
        throw new ArithmeticException(a.ce(i, iA, "The calculation caused an overflow: ", " + "));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        return this.a.ag(a(j));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, -292275054, 292278993);
        return this.a.aj(j, i);
    }

    @Override // defpackage.aabm
    public final long j(long j, int i) {
        vxr.ay(this, i, -292275055, 292278994);
        return this.a.aj(j, i);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu t() {
        return this.a.c;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return null;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        return this.a.al(a(j));
    }

    @Override // defpackage.aadx
    public final long z(long j, long j2) {
        return e(j, vxr.au(j2));
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
