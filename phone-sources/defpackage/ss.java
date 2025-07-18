package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ss {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ss(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ss)) {
            return false;
        }
        long j = this.a;
        ss ssVar = (ss) obj;
        long j2 = ssVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, ssVar.b) && a.s(this.c, ssVar.c) && a.s(this.d, ssVar.d) && a.s(this.e, ssVar.e);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.e;
        long j3 = this.d;
        return ((((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j3)) * 31) + a.k(j2);
    }

    public final String toString() {
        return "ContextMenuColors(backgroundColor=" + ((Object) bnq.g(this.a)) + ", textColor=" + ((Object) bnq.g(this.b)) + ", iconColor=" + ((Object) bnq.g(this.c)) + ", disabledTextColor=" + ((Object) bnq.g(this.d)) + ", disabledIconColor=" + ((Object) bnq.g(this.e)) + ')';
    }
}
