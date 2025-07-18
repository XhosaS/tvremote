package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqz {
    public final ImmutableList a;

    public lqz() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqz) {
            return this.a.equals(((lqz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetCategoriesResponse{categories=" + this.a.toString() + "}";
    }

    public lqz(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null categories");
        }
        this.a = immutableList;
    }
}
