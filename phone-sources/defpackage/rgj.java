package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rgj {
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;
    private final String i;
    private final int j;

    public rgj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (obj == this) {
            return true;
        }
        if (obj instanceof rgj) {
            rgj rgjVar = (rgj) obj;
            if (this.a == rgjVar.a && ((str = this.b) != null ? str.equals(rgjVar.b) : rgjVar.b == null) && this.c.equals(rgjVar.c) && ((str2 = this.d) != null ? str2.equals(rgjVar.d) : rgjVar.d == null) && ((str3 = this.e) != null ? str3.equals(rgjVar.e) : rgjVar.e == null) && this.f == rgjVar.f) {
                int i = this.j;
                int i2 = rgjVar.j;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str4 = this.i) != null ? str4.equals(rgjVar.i) : rgjVar.i == null) && ((str5 = this.g) != null ? str5.equals(rgjVar.g) : rgjVar.g == null)) {
                    int i3 = this.h;
                    int i4 = rgjVar.h;
                    if (i3 == 0) {
                        throw null;
                    }
                    if (i3 == i4) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode();
        String str2 = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        int i = true == this.f ? 1231 : 1237;
        int i2 = this.j;
        a.bw(i2);
        int i3 = (((iHashCode3 ^ i) * 1000003) ^ i2) * 1000003;
        String str4 = this.i;
        int iHashCode4 = (i3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str5 != null ? str5.hashCode() : 0)) * 1000003;
        int i4 = this.h;
        a.bw(i4);
        return iHashCode5 ^ i4;
    }

    public final String toString() {
        return "DeviceOwner{isMetadataAvailable=" + this.a + ", displayName=" + this.b + ", accountName=" + this.c + ", givenName=" + this.d + ", familyName=" + this.e + ", isG1User=" + this.f + ", isDasherUser=" + qtl.b(this.j) + ", obfuscatedGaiaId=" + this.i + ", avatarUrl=" + this.g + ", isUnicornUser=" + qtl.b(this.h) + "}";
    }

    public rgj(boolean z, String str, String str2, String str3, String str4, boolean z2, int i, String str5, String str6, int i2) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z2;
        this.j = i;
        this.i = str5;
        this.g = str6;
        this.h = i2;
    }
}
