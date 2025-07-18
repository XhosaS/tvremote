package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpb implements vpc {
    public final vpf a;
    public final vpd b;
    public final vox c;
    public final vqg d;
    public final vpe e;
    public final vqe f;
    public final boolean g;
    public final int h;

    public vpb(vpf vpfVar, vpd vpdVar, vox voxVar, vqg vqgVar, vpe vpeVar, int i, vqe vqeVar, boolean z) {
        this.a = vpfVar;
        this.b = vpdVar;
        this.c = voxVar;
        this.d = vqgVar;
        this.e = vpeVar;
        this.h = i;
        this.f = vqeVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpb)) {
            return false;
        }
        vpb vpbVar = (vpb) obj;
        return yks.e(this.a, vpbVar.a) && yks.e(this.b, vpbVar.b) && yks.e(this.c, vpbVar.c) && yks.e(this.d, vpbVar.d) && yks.e(this.e, vpbVar.e) && this.h == vpbVar.h && yks.e(this.f, vpbVar.f) && this.g == vpbVar.g;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        vqg vqgVar = this.d;
        int iHashCode2 = ((((iHashCode * 31) + (vqgVar == null ? 0 : vqgVar.hashCode())) * 31) + this.e.hashCode()) * 31;
        int i = this.h;
        a.bw(i);
        return ((((iHashCode2 + i) * 31) + this.f.hashCode()) * 31) + a.q(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(accountsState=");
        sb.append(this.a);
        sb.append(", accountMenuTitleData=");
        sb.append(this.b);
        sb.append(", accountMenuFooterData=");
        sb.append(this.c);
        sb.append(", productSpaceData=");
        sb.append(this.d);
        sb.append(", accountMenuToolbarData=");
        sb.append(this.e);
        sb.append(", accountMenuAlignment=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? "ACCOUNT_MENU_ALIGNMENT_CENTER" : "ACCOUNT_MENU_ALIGNMENT_END" : "ACCOUNT_MENU_ALIGNMENT_UNSPECIFIED"));
        sb.append(", accountMenuA11yLabel=");
        sb.append(this.f);
        sb.append(", allowInteractions=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
