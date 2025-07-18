package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vou {
    public final vrn a;
    public final String b;
    public final String c;
    public final boolean d;
    private final boolean e = true;
    private final String f;
    private final String g;

    public vou(vrn vrnVar, String str, String str2, String str3, String str4, boolean z) {
        this.a = vrnVar;
        this.b = str;
        this.c = str2;
        this.f = str3;
        this.g = str4;
        this.d = z;
    }

    private final vqi d() {
        boolean z = this.d;
        return new vqi(z ? 2 : 1, z ? new vqe(vpy.m) : null);
    }

    public final vpi a() {
        return new vpi(1.0f, d(), 4);
    }

    public final String b() {
        String str = this.f;
        return str == null ? this.b : str;
    }

    public final vpg c(int i, vrm vrmVar) {
        vrmVar.getClass();
        String str = this.b;
        String strAq = (str == null || yks.e(str, this.c) || !vxr.ae(vrmVar, this.a)) ? null : vxr.aq(this);
        vrn vrnVar = this.a;
        vpi vpiVar = new vpi(i == 1 ? 1.0f : 0.38f, d(), 4);
        String strAp = str != null ? vxr.ap(str) : null;
        if (strAp == null) {
            strAp = vxr.aq(this);
        }
        return new vpg(vrnVar, vpiVar, strAp, strAq, i, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vou)) {
            return false;
        }
        vou vouVar = (vou) obj;
        if (!yks.e(this.a, vouVar.a)) {
            return false;
        }
        boolean z = vouVar.e;
        return yks.e(this.b, vouVar.b) && yks.e(this.c, vouVar.c) && yks.e(this.f, vouVar.f) && yks.e(this.g, vouVar.g) && this.d == vouVar.d;
    }

    public final int hashCode() {
        int iJ;
        vrn vrnVar = this.a;
        if (vrnVar.A()) {
            iJ = vrnVar.j();
        } else {
            int iJ2 = vrnVar.M;
            if (iJ2 == 0) {
                iJ2 = vrnVar.j();
                vrnVar.M = iJ2;
            }
            iJ = iJ2;
        }
        String str = this.b;
        int iQ = (((((iJ * 31) + a.q(true)) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
        String str2 = this.f;
        int iHashCode = ((iQ * 31) + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        return ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31) + a.q(this.d);
    }

    public final String toString() {
        return "AccountInfo(accountIdentifier=" + this.a + ", isGaiaAccount=true, displayName=" + this.b + ", accountName=" + this.c + ", givenName=" + this.f + ", familyName=" + this.g + ", isG1Account=" + this.d + ")";
    }
}
