package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kow {
    public final String a;
    public final String b;
    public final String c;

    public kow(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kow)) {
            return false;
        }
        kow kowVar = (kow) obj;
        return yks.e(this.a, kowVar.a) && yks.e(this.b, kowVar.b) && yks.e(this.c, kowVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "StoryAudienceReviewBottomSheetData(titleText=" + this.a + ", descriptionText=" + this.b + ", avatarUrl=" + this.c + ")";
    }
}
