package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ivu {
    public final long a;
    public final long b;
    public final boolean c;

    public ivu(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivu)) {
            return false;
        }
        ivu ivuVar = (ivu) obj;
        return this.a == ivuVar.a && this.b == ivuVar.b && this.c == ivuVar.c;
    }

    public final int hashCode() {
        return (((a.k(this.a) * 31) + a.k(this.b)) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "Progress(elapsed=" + this.a + ", totalDuration=" + this.b + ", userIsScrubbing=" + this.c + ")";
    }

    public /* synthetic */ ivu() {
        this(0L, 0L, false);
    }
}
