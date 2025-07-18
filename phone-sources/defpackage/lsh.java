package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsh {
    public final ImmutableList a;

    public lsh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsh) {
            return this.a.equals(((lsh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "FetchAssetsEidrResponse{eidrAssets=" + this.a.toString() + "}";
    }

    public lsh(ImmutableList immutableList) {
        if (immutableList == null) {
            throw new NullPointerException("Null eidrAssets");
        }
        this.a = immutableList;
    }
}
