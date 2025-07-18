package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fdh implements fef {
    private final long a;
    private final long b;
    private final int c;
    private final long d;
    private final int e;
    private final long f;

    public fdh(long j, long j2, int i, int i2) {
        long jE;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            jE = -9223372036854775807L;
        } else {
            this.d = j - j2;
            jE = e(j, j2, i);
        }
        this.f = jE;
    }

    private static long e(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / i;
    }

    @Override // defpackage.fef
    public final long a() {
        return this.f;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            feg fegVar = new feg(0L, this.b);
            return new fed(fegVar, fegVar);
        }
        long j3 = this.c;
        long jMin = (((this.e * j) / 8000000) / j3) * j3;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j3);
        }
        long jMax = this.b + Math.max(jMin, 0L);
        long jW = w(jMax);
        feg fegVar2 = new feg(jW, jMax);
        if (j2 != -1 && jW < j) {
            long j4 = jMax + j3;
            if (j4 < this.a) {
                return new fed(fegVar2, new feg(w(j4), j4));
            }
        }
        return new fed(fegVar2, fegVar2);
    }

    public final long w(long j) {
        return e(j, this.b, this.e);
    }

    @Override // defpackage.fef
    public final boolean z() {
        return this.d != -1;
    }
}
