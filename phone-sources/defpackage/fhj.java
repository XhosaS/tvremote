package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhj implements fhh {
    private final long a;
    private final int b;
    private final long c;
    private final int d;
    private final long e;
    private final long f;
    private final long[] g;

    public fhj(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    private final long g(int i) {
        return (this.c * i) / 100;
    }

    @Override // defpackage.fef
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        if (!z()) {
            feg fegVar = new feg(0L, this.a + this.b);
            return new fed(fegVar, fegVar);
        }
        long j2 = this.c;
        long jT = edt.t(j, 0L, j2);
        double d = (jT * 100.0d) / j2;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.g;
                eci.e(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - i) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j3 = this.e;
        feg fegVar2 = new feg(jT, this.a + edt.t(Math.round((d2 / 256.0d) * j3), this.b, j3 - 1));
        return new fed(fegVar2, fegVar2);
    }

    @Override // defpackage.fhh
    public final int d() {
        return this.d;
    }

    @Override // defpackage.fhh
    public final long e() {
        return this.f;
    }

    @Override // defpackage.fhh
    public final long f(long j) {
        if (!z()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        eci.e(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iAz = edt.az(jArr, (long) d, true);
        long jG = g(iAz);
        long j3 = jArr[iAz];
        int i = iAz + 1;
        long jG2 = g(i);
        return jG + Math.round((j3 == (iAz == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (jG2 - jG));
    }

    @Override // defpackage.fef
    public final boolean z() {
        return this.g != null;
    }
}
