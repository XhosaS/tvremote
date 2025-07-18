package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fhi implements fhh {
    private final long[] a;
    private final long[] b;
    private final long c;
    private final long d;
    private final int e;

    public fhi(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.fef
    public final long a() {
        return this.c;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        long[] jArr = this.a;
        int iAz = edt.az(jArr, j, true);
        long j2 = jArr[iAz];
        long[] jArr2 = this.b;
        feg fegVar = new feg(j2, jArr2[iAz]);
        if (fegVar.b >= j || iAz == jArr.length - 1) {
            return new fed(fegVar, fegVar);
        }
        int i = iAz + 1;
        return new fed(fegVar, new feg(jArr[i], jArr2[i]));
    }

    @Override // defpackage.fhh
    public final int d() {
        return this.e;
    }

    @Override // defpackage.fhh
    public final long e() {
        return this.d;
    }

    @Override // defpackage.fhh
    public final long f(long j) {
        return this.a[edt.az(this.b, j, true)];
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
