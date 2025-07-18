package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanr extends aanv {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final int g;

    public aanr(String str, int i, String str2, String str3, long j, long j2, String str4) {
        this.a = str;
        this.g = i;
        this.b = str2;
        this.c = str3;
        this.d = j;
        this.e = j2;
        this.f = str4;
    }

    @Override // defpackage.aanv
    public final long a() {
        return this.d;
    }

    @Override // defpackage.aanv
    public final long b() {
        return this.e;
    }

    @Override // defpackage.aanv
    public final aanu c() {
        return new aanq(this);
    }

    @Override // defpackage.aanv
    public final String d() {
        return this.b;
    }

    @Override // defpackage.aanv
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aanv) {
            aanv aanvVar = (aanv) obj;
            String str4 = this.a;
            if (str4 != null ? str4.equals(aanvVar.e()) : aanvVar.e() == null) {
                int i = this.g;
                int iH = aanvVar.h();
                if (i == 0) {
                    throw null;
                }
                if (i == iH && ((str = this.b) != null ? str.equals(aanvVar.d()) : aanvVar.d() == null) && ((str2 = this.c) != null ? str2.equals(aanvVar.g()) : aanvVar.g() == null) && this.d == aanvVar.a() && this.e == aanvVar.b() && ((str3 = this.f) != null ? str3.equals(aanvVar.f()) : aanvVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aanv
    public final String f() {
        return this.f;
    }

    @Override // defpackage.aanv
    public final String g() {
        return this.c;
    }

    @Override // defpackage.aanv
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        int i = this.g;
        if (i == 0) {
            throw null;
        }
        int i2 = ((iHashCode ^ 1000003) * 1000003) ^ i;
        String str2 = this.b;
        int iHashCode2 = ((i2 * 1000003) ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        long j = this.d;
        int i3 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
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
}
