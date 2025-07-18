package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lun {
    public final ImmutableList a;
    public final ImmutableList b;

    public lun() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lun) {
            lun lunVar = (lun) obj;
            if (this.a.equals(lunVar.a) && this.b.equals(lunVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ImmutableList immutableList = this.b;
        return "UpdateWatchlistResponse{addedItems=" + this.a.toString() + ", removedItems=" + immutableList.toString() + "}";
    }

    public lun(ImmutableList immutableList, ImmutableList immutableList2) {
        if (immutableList == null) {
            throw new NullPointerException("Null addedItems");
        }
        this.a = immutableList;
        if (immutableList2 == null) {
            throw new NullPointerException("Null removedItems");
        }
        this.b = immutableList2;
    }
}
