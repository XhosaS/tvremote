package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lto {
    public final ImmutableList a;

    public lto() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lto) {
            return this.a.equals(((lto) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "PaginationResponse{collectionList=" + this.a.toString() + "}";
    }

    public lto(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null collectionList");
        }
        this.a = immutableList;
    }
}
