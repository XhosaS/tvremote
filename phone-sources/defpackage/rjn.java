package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rjn {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final int i;
    public final int j;
    private final String k;
    private final int l;

    public rjn() {
        throw null;
    }

    public static rjm a() {
        rjm rjmVar = new rjm();
        rjmVar.c(false);
        rjmVar.e(1);
        rjmVar.d(true);
        rjmVar.h = 1;
        rjmVar.g = 1;
        return rjmVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rjn) {
            rjn rjnVar = (rjn) obj;
            if (this.a.equals(rjnVar.a) && this.b == rjnVar.b && ((str = this.c) != null ? str.equals(rjnVar.c) : rjnVar.c == null) && ((str2 = this.d) != null ? str2.equals(rjnVar.d) : rjnVar.d == null) && ((str3 = this.e) != null ? str3.equals(rjnVar.e) : rjnVar.e == null) && ((str4 = this.f) != null ? str4.equals(rjnVar.f) : rjnVar.f == null) && this.g == rjnVar.g) {
                int i = this.i;
                int i2 = rjnVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    int i3 = this.j;
                    int i4 = rjnVar.j;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4 && ((str5 = this.h) != null ? str5.equals(rjnVar.h) : rjnVar.h == null) && ((str6 = this.k) != null ? str6.equals(rjnVar.k) : rjnVar.k == null)) {
                        int i5 = this.l;
                        int i6 = rjnVar.l;
                        if (i5 == 0) {
                            throw null;
                        }
                        if (i5 == i6) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.c;
        int iHashCode2 = ((((iHashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        int i = true == this.g ? 1231 : 1237;
        int i2 = this.i;
        a.bw(i2);
        int i3 = (((iHashCode5 ^ i) * 1000003) ^ i2) * 1000003;
        int i4 = this.j;
        a.bw(i4);
        int i5 = (i3 ^ i4) * 1000003;
        String str5 = this.h;
        int iHashCode6 = (i5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.k;
        int iHashCode7 = str6 != null ? str6.hashCode() : 0;
        int i6 = this.l;
        a.bl(i6);
        return ((iHashCode6 ^ iHashCode7) * 1000003) ^ i6;
    }

    public final String toString() {
        int i = this.l;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        int i2 = this.j;
        int i3 = this.i;
        String str2 = this.k;
        String str3 = this.h;
        boolean z = this.g;
        String str4 = this.f;
        String str5 = this.e;
        String str6 = this.d;
        String str7 = this.c;
        boolean z2 = this.b;
        return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + z2 + ", displayName=" + str7 + ", givenName=" + str6 + ", familyName=" + str5 + ", obfuscatedGaiaId=" + str4 + ", isG1User=" + z + ", isDasherUser=" + rrx.U(i3) + ", isUnicornUser=" + rrx.U(i2) + ", avatarUrl=" + str3 + ", defaultAvatarUrl=" + str2 + ", ageRange=" + str + "}";
    }

    public rjn(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, int i, int i2, String str6, String str7, int i3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.i = i;
        this.j = i2;
        this.h = str6;
        this.k = str7;
        this.l = i3;
    }
}
