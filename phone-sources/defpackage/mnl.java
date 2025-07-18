package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mnl {
    public static final mnl a = new mnl(0, 0);
    public final long b;
    public final long c;

    public mnl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mnl) {
            mnl mnlVar = (mnl) obj;
            if (this.b == mnlVar.b && this.c == mnlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DownloadedSize{requiredBytes=" + this.b + ", downloadedBytes=" + this.c + "}";
    }

    public mnl(long j, long j2) {
        this.b = j;
        this.c = j2;
    }
}
