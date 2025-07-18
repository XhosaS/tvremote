package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lum {
    public final ksn a;
    public final ImmutableList b;
    public final ImmutableList c;

    public lum() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lum) {
            lum lumVar = (lum) obj;
            if (this.a.equals(lumVar.a) && this.b.equals(lumVar.b) && this.c.equals(lumVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.c;
        ImmutableList immutableList2 = this.b;
        return "UpdateWatchlistRequest{account=" + this.a.toString() + ", assetsToAdd=" + immutableList2.toString() + ", assetsToRemove=" + immutableList.toString() + "}";
    }

    public lum(ksn ksnVar, ImmutableList immutableList, ImmutableList immutableList2) {
        if (ksnVar == null) {
            throw new NullPointerException("Null account");
        }
        this.a = ksnVar;
        if (immutableList == null) {
            throw new NullPointerException("Null assetsToAdd");
        }
        this.b = immutableList;
        if (immutableList2 == null) {
            throw new NullPointerException("Null assetsToRemove");
        }
        this.c = immutableList2;
    }
}
