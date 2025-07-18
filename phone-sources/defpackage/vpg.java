package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpg {
    public final vrn a;
    public final vpi b;
    public final String c;
    public final String d;
    public final vqo e = null;
    public final vqs f;
    public final int g;

    public vpg(vrn vrnVar, vpi vpiVar, String str, String str2, int i, vqo vqoVar, vqs vqsVar) {
        this.a = vrnVar;
        this.b = vpiVar;
        this.c = str;
        this.d = str2;
        this.g = i;
        this.f = vqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpg)) {
            return false;
        }
        vpg vpgVar = (vpg) obj;
        if (!yks.e(this.a, vpgVar.a) || !yks.e(this.b, vpgVar.b) || !yks.e(this.c, vpgVar.c) || !yks.e(this.d, vpgVar.d) || this.g != vpgVar.g) {
            return false;
        }
        vqo vqoVar = vpgVar.e;
        return yks.e(null, null) && yks.e(this.f, vpgVar.f);
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
        int iHashCode = (((iJ * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.d;
        int iHashCode2 = ((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31;
        int i = this.g;
        a.bw(i);
        vqs vqsVar = this.f;
        return ((iHashCode2 + i) * 961) + (vqsVar != null ? vqsVar.hashCode() : 0);
    }

    public final String toString() {
        return "AvailableAccountData(accountIdentifier=" + this.a + ", avatarData=" + this.b + ", primaryText=" + this.c + ", secondaryText=" + this.d + ", accountState=" + ((Object) vxr.ao(this.g)) + ", trailingContentData=null, criticalAlertCard=" + this.f + ")";
    }
}
