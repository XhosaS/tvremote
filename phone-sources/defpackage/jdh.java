package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdh {
    public long a;
    public long b;
    public int c = 1;

    public jdh(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jdh)) {
            return false;
        }
        jdh jdhVar = (jdh) obj;
        long j = this.a;
        long j2 = jdhVar.a;
        long j3 = ynm.a;
        return a.s(j, j2) && a.s(this.b, jdhVar.b);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = ynm.a;
        return (a.k(j) * 31) + a.k(this.b);
    }

    public final String toString() {
        return "BingeWatchHelper(countdownMinDuration=" + ynm.r(this.a) + ", countdownMaxDuration=" + ynm.r(this.b) + ")";
    }
}
