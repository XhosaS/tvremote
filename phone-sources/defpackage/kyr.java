package defpackage;

import com.google.common.collect.ImmutableMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyr {
    public final ImmutableMap a;
    public final ImmutableMap b;

    public kyr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyr) {
            kyr kyrVar = (kyr) obj;
            if (this.a.equals(kyrVar.a) && this.b.equals(kyrVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ImmutableMap immutableMap = this.b;
        return "QoeProperties{qoeProperties=" + this.a.toString() + ", stmp=" + immutableMap.toString() + "}";
    }

    public kyr(ImmutableMap immutableMap, ImmutableMap immutableMap2) {
        if (immutableMap == null) {
            throw new NullPointerException("Null qoeProperties");
        }
        this.a = immutableMap;
        if (immutableMap2 == null) {
            throw new NullPointerException("Null stmp");
        }
        this.b = immutableMap2;
    }
}
