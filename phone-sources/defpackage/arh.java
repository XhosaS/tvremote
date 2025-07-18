package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public arh(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof arh)) {
            return false;
        }
        long j = this.a;
        arh arhVar = (arh) obj;
        long j2 = arhVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, arhVar.b) && a.s(this.c, arhVar.c) && a.s(this.d, arhVar.d);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.d;
        return ((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j2);
    }
}
