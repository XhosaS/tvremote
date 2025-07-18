package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrl {
    public final ImmutableList a;

    public lrl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrl) {
            return this.a.equals(((lrl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RelatedCollectionResponse{collectionList=" + String.valueOf(this.a) + "}";
    }

    public lrl(ImmutableList immutableList) {
        this.a = immutableList;
    }
}
