package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
class aada extends aadx {
    private final aacw a;
    private final int c;
    private final int d;

    public aada(aacw aacwVar) {
        super(aabo.h, 2629746000L);
        this.a = aacwVar;
        this.c = 12;
        this.d = 2;
    }

    @Override // defpackage.aadx
    public final long A(long j, long j2) {
        if (j < j2) {
            return -B(j2, j);
        }
        aacw aacwVar = this.a;
        int iAa = aacwVar.aa(j);
        int iV = aacwVar.V(j, iAa);
        int iAa2 = aacwVar.aa(j2);
        int iV2 = aacwVar.V(j2, iAa2);
        int i = iAa - iAa2;
        int i2 = this.c;
        long j3 = iV;
        long j4 = iV2;
        int iP = aacwVar.P(j, iAa, iV);
        long j5 = ((i * i2) + j3) - j4;
        return j - aacwVar.ai(iAa, iV) < ((iP != aacwVar.T(iAa, iV) || aacwVar.P(j2, iAa2, iV2) <= iP) ? j2 : aacwVar.k.h(j2, iP)) - aacwVar.ai(iAa2, iV2) ? j5 - 1 : j5;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        aacw aacwVar = this.a;
        return aacwVar.V(j, aacwVar.aa(j));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.c;
    }

    @Override // defpackage.aabm
    public final int d() {
        return 1;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        int i2;
        int i3;
        int i4;
        if (i == 0) {
            return j;
        }
        aacw aacwVar = this.a;
        long jU = aacwVar.U(j);
        int iAa = aacwVar.aa(j);
        int iV = aacwVar.V(j, iAa);
        int i5 = iV - 1;
        int i6 = i5 + i;
        if (i6 < 0) {
            int i7 = this.c;
            int i8 = i + i7;
            if (Math.signum(i8) == Math.signum(i)) {
                i2 = iAa - 1;
            } else {
                i8 = i - i7;
                i2 = iAa + 1;
            }
            i6 = i5 + i8;
        } else {
            i2 = iAa;
        }
        if (i6 >= 0) {
            int i9 = this.c;
            i3 = i2 + (i6 / i9);
            i4 = (i6 % i9) + 1;
        } else {
            int i10 = this.c;
            i3 = i2 + (i6 / i10);
            int i11 = i3 - 1;
            int iAbs = Math.abs(i6) % i10;
            if (iAbs == 0) {
                iAbs = i10;
            }
            i4 = (i10 - iAbs) + 1;
            if (i4 != 1) {
                i3 = i11;
            }
        }
        int iP = aacwVar.P(j, iAa, iV);
        int iT = aacwVar.T(i3, i4);
        if (iP > iT) {
            iP = iT;
        }
        return aacwVar.ah(i3, i4, iP) + jU;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        aacw aacwVar = this.a;
        int iAa = aacwVar.aa(j);
        return aacwVar.ai(iAa, aacwVar.V(j, iAa));
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, 1, this.c);
        aacw aacwVar = this.a;
        int iAa = aacwVar.aa(j);
        int iP = aacwVar.P(j, iAa, aacwVar.V(j, iAa));
        int iT = aacwVar.T(iAa, i);
        if (iP > iT) {
            iP = iT;
        }
        return aacwVar.ah(iAa, i, iP) + aacwVar.U(j);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu t() {
        return this.a.c;
    }

    @Override // defpackage.aabm
    public final aabu u() {
        return this.a.g;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        aacw aacwVar = this.a;
        int iAa = aacwVar.aa(j);
        return aacwVar.al(iAa) && aacwVar.V(j, iAa) == this.d;
    }

    @Override // defpackage.aadx
    public final long z(long j, long j2) {
        long j3;
        long j4;
        long j5;
        int i = (int) j2;
        if (i == j2) {
            return e(j, i);
        }
        aacw aacwVar = this.a;
        long jU = aacwVar.U(j);
        int iAa = aacwVar.aa(j);
        long j6 = iAa;
        int iV = aacwVar.V(j, iAa);
        long j7 = (iV - 1) + j2;
        if (j7 >= 0) {
            j3 = jU;
            long j8 = this.c;
            j4 = j6 + (j7 / j8);
            j5 = (j7 % j8) + 1;
        } else {
            j3 = jU;
            int i2 = this.c;
            long j9 = i2;
            long j10 = j6 + (j7 / j9);
            int iAbs = (int) (Math.abs(j7) % j9);
            if (iAbs == 0) {
                iAbs = i2;
            }
            j4 = j10 - 1;
            j5 = (i2 - iAbs) + 1;
            if (j5 == 1) {
                j4 = j10;
            }
        }
        if (j4 < -292275054 || j4 > 292278993) {
            throw new IllegalArgumentException(a.cs(j2, "Magnitude of add amount is too large: "));
        }
        int i3 = (int) j5;
        int iP = aacwVar.P(j, iAa, iV);
        int i4 = (int) j4;
        int iT = aacwVar.T(i4, i3);
        if (iP > iT) {
            iP = iT;
        }
        return aacwVar.ah(i4, i3, iP) + j3;
    }

    @Override // defpackage.aabm
    public final void x() {
    }
}
