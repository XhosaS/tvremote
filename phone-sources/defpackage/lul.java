package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lul {
    public final String a;
    public final ImmutableList b;

    public lul() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lul) {
            lul lulVar = (lul) obj;
            if (this.a.equals(lulVar.a) && this.b.equals(lulVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GetWatchlistResponse{snapshotToken=" + this.a + ", assetIds=" + this.b.toString() + "}";
    }

    public lul(String str, ImmutableList immutableList) {
        if (str == null) {
            throw new NullPointerException("Null snapshotToken");
        }
        this.a = str;
        if (immutableList == null) {
            throw new NullPointerException("Null assetIds");
        }
        this.b = immutableList;
    }
}
