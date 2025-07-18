package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atw {
    public final long a;
    public final long b;
    private final awu c;

    public atw(long j, long j2, awu awuVar) {
        this.a = j;
        this.b = j2;
        this.c = awuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atw)) {
            return false;
        }
        long j = this.a;
        atw atwVar = (atw) obj;
        long j2 = atwVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, atwVar.b) && yks.e(this.c, atwVar.c);
    }

    public final int hashCode() {
        long j = bnq.a;
        return (((a.k(this.a) * 31) + a.k(this.b)) * 31) + this.c.hashCode();
    }
}
