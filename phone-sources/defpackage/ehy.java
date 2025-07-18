package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehy {
    public final long e;
    public final long f;
    public final float a = 0.97f;
    public final float b = 1.03f;
    public final long c = 1000;
    public final float d = 1.0E-7f;
    public final float g = 0.999f;
    public long h = -9223372036854775807L;
    private long s = -9223372036854775807L;
    public long j = -9223372036854775807L;
    public long k = -9223372036854775807L;
    public float n = 0.97f;
    public float m = 1.03f;
    public float o = 1.0f;
    public long p = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public long q = -9223372036854775807L;
    public long r = -9223372036854775807L;

    public ehy(long j, long j2) {
        this.e = j;
        this.f = j2;
    }

    public static long c(long j, long j2) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    public final void a() {
        long j;
        long j2 = this.h;
        if (j2 != -9223372036854775807L) {
            j = this.s;
            if (j == -9223372036854775807L) {
                long j3 = this.j;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.k;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.i == j) {
            return;
        }
        this.i = j;
        this.l = j;
        this.q = -9223372036854775807L;
        this.r = -9223372036854775807L;
        this.p = -9223372036854775807L;
    }

    public final void b(long j) {
        this.s = j;
        a();
    }
}
