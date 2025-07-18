package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kmd {
    public final wni a;
    public final String b;
    public final kmc c;
    public final ksn d;
    public final String e;
    public final int f;
    public final int g;

    public kmd(wni wniVar, String str, kmc kmcVar, int i, ksn ksnVar, int i2, String str2) {
        kmcVar.getClass();
        this.a = wniVar;
        this.b = str;
        this.c = kmcVar;
        this.f = i;
        this.d = ksnVar;
        this.g = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmd)) {
            return false;
        }
        kmd kmdVar = (kmd) obj;
        return yks.e(this.a, kmdVar.a) && yks.e(this.b, kmdVar.b) && this.c == kmdVar.c && this.f == kmdVar.f && yks.e(this.d, kmdVar.d) && this.g == kmdVar.g && yks.e(this.e, kmdVar.e);
    }

    public final int hashCode() {
        int iJ;
        wni wniVar = this.a;
        if (wniVar.A()) {
            iJ = wniVar.j();
        } else {
            int iJ2 = wniVar.M;
            if (iJ2 == 0) {
                iJ2 = wniVar.j();
                wniVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int iHashCode = ((((iJ * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        int i = this.f;
        a.bw(i);
        int iHashCode2 = (((iHashCode + i) * 31) + this.d.hashCode()) * 31;
        int i2 = this.g;
        a.bw(i2);
        return ((iHashCode2 + i2) * 31) + this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Product(playId=");
        sb.append(this.a);
        sb.append(", serializedDocId=");
        sb.append(this.b);
        sb.append(", offerType=");
        sb.append(this.c);
        sb.append(", resolution=");
        int i = this.f;
        String str = "UNSPECIFIED";
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "UNSPECIFIED" : "UHD" : "HD" : "SD"));
        sb.append(", account=");
        sb.append(this.d);
        sb.append(", entityType=");
        int i2 = this.g;
        if (i2 == 1) {
            str = "MOVIE";
        } else if (i2 == 2) {
            str = "SHOW";
        } else if (i2 == 3) {
            str = "SEASON";
        } else if (i2 == 4) {
            str = "EPISODE";
        } else if (i2 == 5) {
            str = "TRAILER";
        }
        sb.append((Object) str);
        sb.append(", entityId=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
