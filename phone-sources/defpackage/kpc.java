package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpc {
    public final String a;
    public final String b;
    public final long c;

    public kpc(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpc)) {
            return false;
        }
        kpc kpcVar = (kpc) obj;
        if (!yks.e(this.a, kpcVar.a) || !yks.e(this.b, kpcVar.b)) {
            return false;
        }
        long j = this.c;
        long j2 = kpcVar.c;
        long j3 = bnq.a;
        return a.s(j, j2);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        long j = this.c;
        long j2 = bnq.a;
        return (((iHashCode * 31) + iHashCode2) * 31) + a.k(j);
    }

    public final String toString() {
        return "StoryReviewsContentData(positiveReviewText=" + this.a + ", negativeReviewText=" + this.b + ", contentColor=" + bnq.g(this.c) + ")";
    }
}
