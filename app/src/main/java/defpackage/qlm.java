package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qlm extends qlv {
    private final String a;
    private final boolean b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final boolean g;
    private final String h;
    private final String i;
    private final int j;
    private final int k;
    private final int l;

    public qlm(String str, boolean z, String str2, String str3, String str4, String str5, boolean z2, int i, int i2, String str6, String str7, int i3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z2;
        this.j = i;
        this.k = i2;
        this.h = str6;
        this.i = str7;
        this.l = i3;
    }

    @Override // defpackage.qlv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.qlv
    public final String b() {
        return this.h;
    }

    @Override // defpackage.qlv
    public final String c() {
        return this.i;
    }

    @Override // defpackage.qlv
    public final String d() {
        return this.c;
    }

    @Override // defpackage.qlv
    public final String e() {
        return this.e;
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
        if (obj instanceof qlv) {
            qlv qlvVar = (qlv) obj;
            if (this.a.equals(qlvVar.a()) && this.b == qlvVar.i() && ((str = this.c) != null ? str.equals(qlvVar.d()) : qlvVar.d() == null) && ((str2 = this.d) != null ? str2.equals(qlvVar.f()) : qlvVar.f() == null) && ((str3 = this.e) != null ? str3.equals(qlvVar.e()) : qlvVar.e() == null) && ((str4 = this.f) != null ? str4.equals(qlvVar.g()) : qlvVar.g() == null) && this.g == qlvVar.h() && this.j == qlvVar.k() && this.k == qlvVar.l() && ((str5 = this.h) != null ? str5.equals(qlvVar.b()) : qlvVar.b() == null) && ((str6 = this.i) != null ? str6.equals(qlvVar.c()) : qlvVar.c() == null) && this.l == qlvVar.j()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qlv
    public final String f() {
        return this.d;
    }

    @Override // defpackage.qlv
    public final String g() {
        return this.f;
    }

    @Override // defpackage.qlv
    public final boolean h() {
        return this.g;
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
        int iHashCode5 = (((((((iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ (true == this.g ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003;
        String str5 = this.h;
        int iHashCode6 = (iHashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.i;
        return ((iHashCode6 ^ (str6 != null ? str6.hashCode() : 0)) * 1000003) ^ this.l;
    }

    @Override // defpackage.qlv
    public final boolean i() {
        return this.b;
    }

    @Override // defpackage.qlv
    public final int j() {
        return this.l;
    }

    @Override // defpackage.qlv
    public final int k() {
        return this.j;
    }

    @Override // defpackage.qlv
    public final int l() {
        return this.k;
    }

    public final String toString() {
        int i = this.l;
        String str = i != 1 ? i != 2 ? i != 3 ? "TWENTY_ONE_OR_OLDER" : "EIGHTEEN_TO_TWENTY" : "LESS_THAN_EIGHTEEN" : "UNKNOWN";
        int i2 = this.j;
        int i3 = this.k;
        String str2 = this.i;
        String str3 = this.h;
        boolean z = this.g;
        String str4 = this.f;
        String str5 = this.e;
        String str6 = this.d;
        String str7 = this.c;
        boolean z2 = this.b;
        return "GoogleOwner{accountName=" + this.a + ", isMetadataAvailable=" + z2 + ", displayName=" + str7 + ", givenName=" + str6 + ", familyName=" + str5 + ", obfuscatedGaiaId=" + str4 + ", isG1User=" + z + ", isDasherUser=" + qlu.a(i2) + ", isUnicornUser=" + qlu.a(i3) + ", avatarUrl=" + str3 + ", defaultAvatarUrl=" + str2 + ", ageRange=" + str + "}";
    }
}
