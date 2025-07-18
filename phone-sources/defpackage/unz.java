package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class unz {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    static {
        a().a();
    }

    public unz() {
        throw null;
    }

    public static uny a() {
        uny unyVar = new uny();
        unyVar.d(0L);
        unyVar.c(1);
        unyVar.b(0L);
        return unyVar;
    }

    public final boolean b() {
        return this.g == 5;
    }

    public final boolean c() {
        int i = this.g;
        return i == 2 || i == 1;
    }

    public final boolean d() {
        return this.g == 4;
    }

    public final boolean e() {
        return this.g == 3;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof unz) {
            unz unzVar = (unz) obj;
            String str3 = this.a;
            if (str3 != null ? str3.equals(unzVar.a) : unzVar.a == null) {
                int i = this.g;
                int i2 = unzVar.g;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.b) != null ? str.equals(unzVar.b) : unzVar.b == null) && ((str2 = this.c) != null ? str2.equals(unzVar.c) : unzVar.c == null) && this.d == unzVar.d && this.e == unzVar.e) {
                    String str4 = this.f;
                    String str5 = unzVar.f;
                    if (str4 != null ? str4.equals(str5) : str5 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final unz f() {
        uny unyVar = new uny(this);
        unyVar.d = "BAD CONFIG";
        unyVar.c(5);
        return unyVar.a();
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.g;
        a.bl(i);
        String str2 = this.b;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = ((iHashCode ^ 1000003) * 1000003) ^ i;
        String str3 = this.c;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.d;
        int i3 = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.f;
        return i4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        int i = this.g;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "REGISTER_ERROR" : "REGISTERED" : "UNREGISTERED" : "NOT_GENERATED" : "ATTEMPT_MIGRATION";
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.a + ", registrationStatus=" + str + ", authToken=" + this.b + ", refreshToken=" + this.c + ", expiresInSecs=" + this.d + ", tokenCreationEpochInSecs=" + this.e + ", fisError=" + this.f + "}";
    }

    public unz(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }
}
