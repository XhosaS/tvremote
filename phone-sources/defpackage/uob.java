package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uob {
    public final String a;
    public final String b;
    public final uoe c;
    public final int d;
    private final String e;

    public uob() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uob) {
            uob uobVar = (uob) obj;
            String str = this.e;
            if (str != null ? str.equals(uobVar.e) : uobVar.e == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(uobVar.a) : uobVar.a == null) {
                    String str3 = this.b;
                    if (str3 != null ? str3.equals(uobVar.b) : uobVar.b == null) {
                        uoe uoeVar = this.c;
                        if (uoeVar != null ? uoeVar.equals(uobVar.c) : uobVar.c == null) {
                            int i = this.d;
                            int i2 = uobVar.d;
                            if (i != 0 ? i == i2 : i2 == 0) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.e;
        int i = 0;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i2 = iHashCode ^ 1000003;
        String str3 = this.b;
        int iHashCode3 = ((((i2 * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        uoe uoeVar = this.c;
        int iHashCode4 = (iHashCode3 ^ (uoeVar == null ? 0 : uoeVar.hashCode())) * 1000003;
        int i3 = this.d;
        if (i3 != 0) {
            a.bl(i3);
            i = i3;
        }
        return iHashCode4 ^ i;
    }

    public final String toString() {
        int i = this.d;
        String strValueOf = String.valueOf(this.c);
        String str = i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK";
        String str2 = this.b;
        String str3 = this.a;
        return "InstallationResponse{uri=" + this.e + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + strValueOf + ", responseCode=" + str + "}";
    }

    public uob(String str, String str2, String str3, uoe uoeVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = uoeVar;
        this.d = i;
    }
}
