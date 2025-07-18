package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpe {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    private final String f = null;

    public kpe(String str, String str2, String str3, String str4, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpe)) {
            return false;
        }
        kpe kpeVar = (kpe) obj;
        if (!yks.e(this.a, kpeVar.a) || !yks.e(this.b, kpeVar.b) || !yks.e(this.c, kpeVar.c) || !yks.e(this.d, kpeVar.d)) {
            return false;
        }
        long j = this.e;
        long j2 = kpeVar.e;
        long j3 = bnq.a;
        if (!a.s(j, j2)) {
            return false;
        }
        String str = kpeVar.f;
        return yks.e(null, null);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        long j = this.e;
        long j2 = bnq.a;
        return (((iHashCode2 + iHashCode3) * 31) + a.k(j)) * 31;
    }

    public final String toString() {
        return "StoryThumbnailCardData(titleText=" + this.a + ", subtitleText=" + this.b + ", additionalSubtitleText=" + this.c + ", thumbnailUrl=" + this.d + ", textColor=" + bnq.g(this.e) + ", actionUrl=null)";
    }
}
