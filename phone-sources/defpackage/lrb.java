package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrb {
    public final ImmutableList a;

    public lrb() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrb) {
            return this.a.equals(((lrb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetRatingSchemesResponse{contentRatingSchemes=" + this.a.toString() + "}";
    }

    public lrb(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null contentRatingSchemes");
        }
        this.a = immutableList;
    }
}
