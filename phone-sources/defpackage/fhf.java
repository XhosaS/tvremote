package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhf implements fhh {
    private final long[] a;
    private final long[] b;
    private final long c;

    public fhf(long[] jArr, long[] jArr2, long j) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? edt.y(jArr2[jArr2.length - 1]) : j;
    }

    private static Pair g(long j, long[] jArr, long[] jArr2) {
        int iAz = edt.az(jArr, j, true);
        long j2 = jArr[iAz];
        long j3 = jArr2[iAz];
        int i = iAz + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // defpackage.fef
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        Pair pairG = g(edt.F(edt.t(j, 0L, this.c)), this.b, this.a);
        feg fegVar = new feg(edt.y(((Long) pairG.first).longValue()), ((Long) pairG.second).longValue());
        return new fed(fegVar, fegVar);
    }

    @Override // defpackage.fhh
    public final int d() {
        return -2147483647;
    }

    @Override // defpackage.fhh
    public final long e() {
        return -1L;
    }

    @Override // defpackage.fhh
    public final long f(long j) {
        return edt.y(((Long) g(j, this.a, this.b).second).longValue());
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
