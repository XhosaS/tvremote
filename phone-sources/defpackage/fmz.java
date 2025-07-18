package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmz implements fef {
    public final long a;
    private final fmx b;
    private final int c;
    private final long d;
    private final long e;

    public fmz(fmx fmxVar, int i, long j, long j2) {
        this.b = fmxVar;
        this.c = i;
        this.d = j;
        long j3 = (j2 - j) / fmxVar.d;
        this.e = j3;
        this.a = d(j3);
    }

    private final long d(long j) {
        return edt.B(j * this.c, 1000000L, this.b.c);
    }

    @Override // defpackage.fef
    public final long a() {
        return this.a;
    }

    @Override // defpackage.fef
    public final fed b(long j) {
        long j2 = this.c;
        long j3 = this.e;
        fmx fmxVar = this.b;
        long j4 = j3 - 1;
        long jT = edt.t((fmxVar.c * j) / (j2 * 1000000), 0L, j4);
        long j5 = fmxVar.d;
        long jD = d(jT);
        long j6 = this.d;
        feg fegVar = new feg(jD, (jT * j5) + j6);
        if (jD >= j || jT == j4) {
            return new fed(fegVar, fegVar);
        }
        long j7 = jT + 1;
        return new fed(fegVar, new feg(d(j7), j6 + (j5 * j7)));
    }

    @Override // defpackage.fef
    public final boolean z() {
        return true;
    }
}
