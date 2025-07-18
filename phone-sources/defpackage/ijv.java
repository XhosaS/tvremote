package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijv {
    public final String a;
    public final wni b;
    public final wmu c;
    public final int d;

    public ijv(String str, wni wniVar, wmu wmuVar, int i) {
        this.a = str;
        this.b = wniVar;
        this.c = wmuVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijv)) {
            return false;
        }
        ijv ijvVar = (ijv) obj;
        return yks.e(this.a, ijvVar.a) && yks.e(this.b, ijvVar.b) && yks.e(this.c, ijvVar.c) && this.d == ijvVar.d;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iHashCode = this.a.hashCode() * 31;
        wni wniVar = this.b;
        if (wniVar.A()) {
            iJ = wniVar.j();
        } else {
            int iJ3 = wniVar.M;
            if (iJ3 == 0) {
                iJ3 = wniVar.j();
                wniVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int i = (iHashCode + iJ) * 31;
        wmu wmuVar = this.c;
        if (wmuVar.A()) {
            iJ2 = wmuVar.j();
        } else {
            int iJ4 = wmuVar.M;
            if (iJ4 == 0) {
                iJ4 = wmuVar.j();
                wmuVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return ((i + iJ2) * 31) + this.d;
    }

    public final String toString() {
        return "SeasonInfo(title=" + this.a + ", seasonId=" + this.b + ", metadata=" + this.c + ", episodeCount=" + this.d + ")";
    }
}
