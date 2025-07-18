package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsi {
    public final ImmutableList a;
    public final ImmutableList b;

    public lsi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsi) {
            lsi lsiVar = (lsi) obj;
            if (this.a.equals(lsiVar.a) && this.b.equals(lsiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        ImmutableList immutableList = this.b;
        return "FetchAssetsRequest{assetIds=" + this.a.toString() + ", eidrIds=" + immutableList.toString() + ", fetchEntityMid=false}";
    }

    public lsi(ImmutableList immutableList, ImmutableList immutableList2) {
        if (immutableList == null) {
            throw new NullPointerException("Null assetIds");
        }
        this.a = immutableList;
        if (immutableList2 == null) {
            throw new NullPointerException("Null eidrIds");
        }
        this.b = immutableList2;
    }
}
