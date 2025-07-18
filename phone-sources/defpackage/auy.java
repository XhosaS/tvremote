package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auy {
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

    public auy(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
    }

    public final long a(boolean z) {
        return z ? this.c : this.e;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof auy)) {
            return false;
        }
        long j = this.a;
        auy auyVar = (auy) obj;
        long j2 = auyVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, auyVar.b) && a.s(this.c, auyVar.c) && a.s(this.d, auyVar.d) && a.s(this.e, auyVar.e) && a.s(this.f, auyVar.f) && a.s(this.g, auyVar.g) && a.s(this.h, auyVar.h) && a.s(this.i, auyVar.i) && a.s(this.j, auyVar.j);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.j;
        long j3 = this.i;
        long j4 = this.h;
        long j5 = this.g;
        long j6 = this.f;
        long j7 = this.e;
        long j8 = this.d;
        return ((((((((((((((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j8)) * 31) + a.k(j7)) * 31) + a.k(j6)) * 31) + a.k(j5)) * 31) + a.k(j4)) * 31) + a.k(j3)) * 31) + a.k(j2);
    }
}
