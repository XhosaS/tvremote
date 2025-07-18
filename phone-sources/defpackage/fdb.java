package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdb {
    public final long a;
    public final long b;
    public long c = 0;
    public long d;
    public long e;
    public long f;
    public long g;
    private final long h;

    protected fdb(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
        this.h = j6;
        this.g = a(j2, 0L, j3, j4, j5, j6);
    }

    protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return edt.t(((j4 + j7) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public final void b() {
        this.g = a(this.b, this.c, this.d, this.e, this.f, this.h);
    }
}
