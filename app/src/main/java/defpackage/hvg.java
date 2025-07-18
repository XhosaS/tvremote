package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvg {
    public final String a;
    public final String b;
    public final String c;
    public final Integer d;
    public final String e;
    public final Instant f;
    private final Integer g;

    public hvg(String str, String str2, String str3, Integer num, String str4, Instant instant, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = num;
        this.e = str4;
        this.f = instant;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hvg)) {
            return false;
        }
        hvg hvgVar = (hvg) obj;
        return agvy.c(this.a, hvgVar.a) && agvy.c(this.b, hvgVar.b) && agvy.c(this.c, hvgVar.c) && agvy.c(this.d, hvgVar.d) && agvy.c(this.e, hvgVar.e) && agvy.c(this.f, hvgVar.f) && agvy.c(this.g, hvgVar.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        int iHashCode2 = (((iHashCode * 31) + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c.hashCode();
        Integer num = this.d;
        int iHashCode3 = ((iHashCode2 * 31) + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f.hashCode()) * 31;
        Integer num2 = this.g;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "RecentSearchEvent(rawQuery=" + this.a + ", accountName=" + this.b + ", eventId=" + this.c + ", assistantVisualElementId=" + this.d + ", imagePrimaryEntityMid=" + this.e + ", instant=" + this.f + ", searchId=" + this.g + ")";
    }
}
