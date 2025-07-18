package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrd {
    public final vql a;
    public final vql b;
    public final vqz c;
    public final vqe d;
    public final vre e;
    public final vpn f;
    public final vpn g;
    public final vro h;
    public final int i;
    public final int j;
    public final vra k;

    public /* synthetic */ vrd(vra vraVar, vql vqlVar, vql vqlVar2, vqz vqzVar, vre vreVar, vpn vpnVar, vpn vpnVar2, int i, int i2, int i3) {
        i = (i3 & 256) != 0 ? 1 : i;
        if (i == 0) {
            throw null;
        }
        i2 = (i3 & 1024) != 0 ? 2 : i2;
        if (i2 == 0) {
            throw null;
        }
        int i4 = i3 & 4;
        int i5 = i3 & 8;
        int i6 = i3 & 32;
        int i7 = i3 & 64;
        int i8 = i3 & 128;
        vqlVar2 = i4 != 0 ? null : vqlVar2;
        vqzVar = i5 != 0 ? null : vqzVar;
        vreVar = i6 != 0 ? null : vreVar;
        vpnVar = i7 != 0 ? null : vpnVar;
        vpnVar2 = i8 != 0 ? null : vpnVar2;
        this.k = vraVar;
        this.a = vqlVar;
        this.b = vqlVar2;
        this.c = vqzVar;
        this.d = null;
        this.e = vreVar;
        this.f = vpnVar;
        this.g = vpnVar2;
        this.i = i;
        this.h = null;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrd)) {
            return false;
        }
        vrd vrdVar = (vrd) obj;
        if (!yks.e(this.k, vrdVar.k) || !yks.e(this.a, vrdVar.a) || !yks.e(this.b, vrdVar.b) || !yks.e(this.c, vrdVar.c)) {
            return false;
        }
        vqe vqeVar = vrdVar.d;
        if (!yks.e(null, null) || !yks.e(this.e, vrdVar.e) || !yks.e(this.f, vrdVar.f) || !yks.e(this.g, vrdVar.g) || this.i != vrdVar.i) {
            return false;
        }
        vro vroVar = vrdVar.h;
        return this.j == vrdVar.j;
    }

    public final int hashCode() {
        int iHashCode = (this.k.hashCode() * 31) + this.a.hashCode();
        vql vqlVar = this.b;
        int iHashCode2 = ((iHashCode * 31) + (vqlVar == null ? 0 : vqlVar.hashCode())) * 31;
        vqz vqzVar = this.c;
        int iHashCode3 = iHashCode2 + (vqzVar == null ? 0 : vqzVar.hashCode());
        vre vreVar = this.e;
        int iHashCode4 = ((iHashCode3 * 961) + (vreVar == null ? 0 : vreVar.hashCode())) * 31;
        vpn vpnVar = this.f;
        int iHashCode5 = (iHashCode4 + (vpnVar == null ? 0 : vpnVar.hashCode())) * 31;
        vpn vpnVar2 = this.g;
        int iHashCode6 = vpnVar2 != null ? vpnVar2.hashCode() : 0;
        int i = this.i;
        a.bw(i);
        int i2 = (((iHashCode5 + iHashCode6) * 31) + i) * 961;
        int i3 = this.j;
        a.bw(i3);
        return i2 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadyState(cardImage=");
        sb.append(this.k);
        sb.append(", title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", content=");
        sb.append(this.c);
        sb.append(", accessibilityTitle=null, trailingContent=");
        sb.append(this.e);
        sb.append(", mainButton=");
        sb.append(this.f);
        sb.append(", secondaryButton=");
        sb.append(this.g);
        sb.append(", containerType=");
        sb.append((Object) (this.i != 1 ? "ACCOUNT_MANAGEMENT_CONTAINER" : "DEFAULT_CONTAINER"));
        sb.append(", overlayColor=null, iconAlignment=");
        sb.append((Object) (this.j != 1 ? "CENTERED_TO_TITLE" : "FIRST_TITLE_LINE"));
        sb.append(")");
        return sb.toString();
    }
}
