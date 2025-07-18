package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsk {
    public final ImmutableList a;
    public final long b;

    public lsk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsk) {
            lsk lskVar = (lsk) obj;
            if (this.a.equals(lskVar.a) && this.b == lskVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "FetchAssetsResponse{assets=" + this.a.toString() + ", expirationSeconds=" + this.b + "}";
    }

    public lsk(ImmutableList immutableList, long j) {
        if (immutableList == null) {
            throw new NullPointerException("Null assets");
        }
        this.a = immutableList;
        this.b = j;
    }
}
