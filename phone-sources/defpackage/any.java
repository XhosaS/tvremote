package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class any {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public any(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        any anyVar = (any) obj;
        long j = this.a;
        long j2 = anyVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, anyVar.b) && a.s(this.c, anyVar.c) && a.s(this.d, anyVar.d);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.d;
        return ((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j2);
    }
}
