package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class awr {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;

    public awr(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.m = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.n = j8;
        this.g = j9;
        this.h = j10;
        this.i = j11;
        this.o = j12;
        this.j = j13;
        this.k = j14;
        this.l = j15;
        this.p = j16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof awr)) {
            return false;
        }
        long j = this.a;
        awr awrVar = (awr) obj;
        long j2 = awrVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, awrVar.b) && a.s(this.c, awrVar.c) && a.s(this.m, awrVar.m) && a.s(this.d, awrVar.d) && a.s(this.e, awrVar.e) && a.s(this.f, awrVar.f) && a.s(this.n, awrVar.n) && a.s(this.g, awrVar.g) && a.s(this.h, awrVar.h) && a.s(this.i, awrVar.i) && a.s(this.o, awrVar.o) && a.s(this.j, awrVar.j) && a.s(this.k, awrVar.k) && a.s(this.l, awrVar.l) && a.s(this.p, awrVar.p);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.p;
        long j3 = this.l;
        long j4 = this.k;
        long j5 = this.j;
        long j6 = this.o;
        long j7 = this.i;
        long j8 = this.h;
        long j9 = this.g;
        long j10 = this.n;
        long j11 = this.f;
        long j12 = this.e;
        long j13 = this.d;
        long j14 = this.m;
        return ((((((((((((((((((((((((((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j14)) * 31) + a.k(j13)) * 31) + a.k(j12)) * 31) + a.k(j11)) * 31) + a.k(j10)) * 31) + a.k(j9)) * 31) + a.k(j8)) * 31) + a.k(j7)) * 31) + a.k(j6)) * 31) + a.k(j5)) * 31) + a.k(j4)) * 31) + a.k(j3)) * 31) + a.k(j2);
    }
}
