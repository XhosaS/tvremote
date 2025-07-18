package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanx extends aaoc {
    public final String a;
    public final String b;
    public final aaof c;
    public final int d;
    private final String e;

    public aanx(String str, String str2, String str3, aaof aaofVar, int i) {
        this.e = str;
        this.a = str2;
        this.b = str3;
        this.c = aaofVar;
        this.d = i;
    }

    @Override // defpackage.aaoc
    public final aaof a() {
        return this.c;
    }

    @Override // defpackage.aaoc
    public final String b() {
        return this.a;
    }

    @Override // defpackage.aaoc
    public final String c() {
        return this.b;
    }

    @Override // defpackage.aaoc
    public final String d() {
        return this.e;
    }

    @Override // defpackage.aaoc
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaoc) {
            aaoc aaocVar = (aaoc) obj;
            String str = this.e;
            if (str != null ? str.equals(aaocVar.d()) : aaocVar.d() == null) {
                String str2 = this.a;
                if (str2 != null ? str2.equals(aaocVar.b()) : aaocVar.b() == null) {
                    String str3 = this.b;
                    if (str3 != null ? str3.equals(aaocVar.c()) : aaocVar.c() == null) {
                        aaof aaofVar = this.c;
                        if (aaofVar != null ? aaofVar.equals(aaocVar.a()) : aaocVar.a() == null) {
                            int i = this.d;
                            if (i != 0 ? i == aaocVar.e() : aaocVar.e() == 0) {
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
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.a;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = iHashCode ^ 1000003;
        String str3 = this.b;
        int iHashCode3 = ((((i * 1000003) ^ iHashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        aaof aaofVar = this.c;
        int iHashCode4 = (iHashCode3 ^ (aaofVar == null ? 0 : aaofVar.hashCode())) * 1000003;
        int i2 = this.d;
        return iHashCode4 ^ (i2 != 0 ? i2 : 0);
    }

    public final String toString() {
        int i = this.d;
        String strValueOf = String.valueOf(this.c);
        String str = i != 1 ? i != 2 ? "null" : "BAD_CONFIG" : "OK";
        String str2 = this.b;
        String str3 = this.a;
        return "InstallationResponse{uri=" + this.e + ", fid=" + str3 + ", refreshToken=" + str2 + ", authToken=" + strValueOf + ", responseCode=" + str + "}";
    }
}
