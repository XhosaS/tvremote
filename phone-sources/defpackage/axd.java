package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axd {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public axd(long j, long j2, long j3, long j4, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof axd)) {
            return false;
        }
        long j = this.a;
        axd axdVar = (axd) obj;
        long j2 = axdVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, axdVar.b) && a.s(this.c, axdVar.c) && a.s(this.d, axdVar.d) && a.s(this.e, axdVar.e) && a.s(this.f, axdVar.f);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.f;
        long j3 = this.e;
        long j4 = this.d;
        return ((((((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j4)) * 31) + a.k(j3)) * 31) + a.k(j2);
    }
}
