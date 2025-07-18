package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzr implements lhf {
    public final String a;

    public mzr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzr) {
            return this.a.equals(((mzr) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SimilarAssetPaginationEvent{token=" + this.a + "}";
    }

    public mzr(String str) {
        this.a = str;
    }
}
