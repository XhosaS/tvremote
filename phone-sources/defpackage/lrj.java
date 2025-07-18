package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrj {
    public final ieh a;
    public final ksy b;
    public final int c;

    public lrj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrj) {
            lrj lrjVar = (lrj) obj;
            if (this.a.equals(lrjVar.a)) {
                int i = this.c;
                int i2 = lrjVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(lrjVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.c;
        a.bl(i);
        return (((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        int i = this.c;
        return "RelatedCollectionRequest{accountSupplier=" + String.valueOf(this.a) + ", type=" + (i != 1 ? i != 2 ? i != 3 ? "null" : "LIKE_THIS" : "FROM_SAME_BROADCASTER" : "RELATIONSHIP_TYPE_UNSPECIFIED") + ", assetId=" + String.valueOf(this.b) + "}";
    }

    public lrj(ieh iehVar, ksy ksyVar) {
        this.a = iehVar;
        this.c = 3;
        this.b = ksyVar;
    }
}
