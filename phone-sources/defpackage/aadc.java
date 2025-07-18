package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aadc extends aadx {
    private final aacw a;

    public aadc(aacw aacwVar) {
        super(aabo.k, 31556952000L);
        this.a = aacwVar;
    }

    @Override // defpackage.aadx
    public final long A(long j, long j2) {
        if (j < j2) {
            return -B(j2, j);
        }
        int iA = a(j);
        int iA2 = a(j2);
        long jF = f(j);
        long jF2 = f(j2);
        if (jF2 >= 31449600000L && this.a.Y(iA) <= 52) {
            jF2 -= 604800000;
        }
        int i = iA - iA2;
        if (jF < jF2) {
            i--;
        }
        return i;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.a.Z(j);
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
        return i == 0 ? j : h(j, a(j) + i);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        aacw aacwVar = this.a;
        long jG = aacwVar.l.g(j);
        return aacwVar.W(jG) > 1 ? jG - ((r0 - 1) * 604800000) : jG;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, Math.abs(i), -292275054, 292278993);
        int iA = a(j);
        if (iA == i) {
            return j;
        }
        aacw aacwVar = this.a;
        int iQ = aacwVar.Q(j);
        int iY = aacwVar.Y(iA);
        int iY2 = aacwVar.Y(i);
        if (iY2 < iY) {
            iY = iY2;
        }
        int iW = aacwVar.W(j);
        if (iW <= iY) {
            iY = iW;
        }
        long jAj = aacwVar.aj(j, i);
        int iA2 = a(jAj);
        if (iA2 < i) {
            jAj += 604800000;
        } else if (iA2 > i) {
            jAj -= 604800000;
        }
        return aacwVar.j.h(jAj + ((iY - aacwVar.W(jAj)) * 604800000), iQ);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu t() {
        return this.a.d;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return null;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        aacw aacwVar = this.a;
        return aacwVar.Y(aacwVar.Z(j)) > 52;
    }

    @Override // defpackage.aadx
    public final long z(long j, long j2) {
        return e(j, vxr.au(j2));
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
