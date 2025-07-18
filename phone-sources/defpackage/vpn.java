package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpn {
    public final List a;
    public final vrp b;
    public final int c;
    public final vro d;
    public final vpm e;
    public final vps f;
    public final int g;

    public vpn(List list, vrp vrpVar, int i, vro vroVar, vpm vpmVar, vps vpsVar, int i2) {
        vrpVar.getClass();
        vroVar.getClass();
        this.a = list;
        this.b = vrpVar;
        this.c = i;
        this.d = vroVar;
        this.e = vpmVar;
        this.f = vpsVar;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpn)) {
            return false;
        }
        vpn vpnVar = (vpn) obj;
        return yks.e(this.a, vpnVar.a) && yks.e(this.b, vpnVar.b) && this.c == vpnVar.c && this.d == vpnVar.d && yks.e(this.e, vpnVar.e) && yks.e(this.f, vpnVar.f) && this.g == vpnVar.g;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() * 31;
        vrp vrpVar = this.b;
        if (vrpVar.A()) {
            iJ = vrpVar.j();
        } else {
            int iJ2 = vrpVar.M;
            if (iJ2 == 0) {
                iJ2 = vrpVar.j();
                vrpVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int iHashCode2 = (((((((iHashCode + iJ) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        vps vpsVar = this.f;
        return ((iHashCode2 + (vpsVar == null ? 0 : vpsVar.hashCode())) * 31) + this.g;
    }

    public final String toString() {
        return "Button(texts=" + this.a + ", tap=" + this.b + ", veId=" + this.c + ", textColor=" + this.d + ", style=" + this.e + ", icon=" + this.f + ", maxLines=" + this.g + ")";
    }

    public /* synthetic */ vpn(List list, vrp vrpVar, int i, vro vroVar, vpm vpmVar) {
        this(list, vrpVar, i, vroVar, vpmVar, null, 1);
    }
}
