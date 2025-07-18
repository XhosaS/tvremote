package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inm {
    public final wni a;
    public final String b;

    public inm(wni wniVar, String str) {
        this.a = wniVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inm)) {
            return false;
        }
        inm inmVar = (inm) obj;
        return yks.e(this.a, inmVar.a) && yks.e(this.b, inmVar.b);
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
        return (iJ * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BundleInfo(bundleId=" + this.a + ", bundleTitle=" + this.b + ")";
    }
}
