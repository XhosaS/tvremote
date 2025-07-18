package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class les {
    private final String a;
    private final int b = 3;

    public les(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof les)) {
            return false;
        }
        les lesVar = (les) obj;
        if (!yks.e(this.a, lesVar.a)) {
            return false;
        }
        int i = lesVar.b;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        a.bw(3);
        return iHashCode + 3;
    }

    public final String toString() {
        return "CacheKey(entryId=" + this.a + ", cacheType=WISHLISTED_SNAPSHOT_TOKEN)";
    }
}
