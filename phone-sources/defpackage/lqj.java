package defpackage;

import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqj {
    private final tst a;
    private final ImmutableList b;

    public lqj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lqj) {
            lqj lqjVar = (lqj) obj;
            if (this.a.equals(lqjVar.a) && this.b.equals(lqjVar.b)) {
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
        return "CollectionTagInfo{tagDb=" + this.a.toString() + ", collectionIdsBeforeTag=" + immutableList.toString() + "}";
    }

    public lqj(tst tstVar, ImmutableList immutableList) {
        this.a = tstVar;
        if (immutableList == null) {
            throw new NullPointerException("Null collectionIdsBeforeTag");
        }
        this.b = immutableList;
    }
}
