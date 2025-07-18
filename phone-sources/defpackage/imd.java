package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imd {
    public final wni a;
    public final String b;
    public final wom c;
    public final long d;

    public imd(wni wniVar, String str, wom womVar, long j) {
        this.a = wniVar;
        this.b = str;
        this.c = womVar;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imd)) {
            return false;
        }
        imd imdVar = (imd) obj;
        return yks.e(this.a, imdVar.a) && yks.e(this.b, imdVar.b) && yks.e(this.c, imdVar.c) && this.d == imdVar.d;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        wni wniVar = this.a;
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
        int iHashCode = (iJ * 31) + this.b.hashCode();
        wom womVar = this.c;
        if (womVar.A()) {
            iJ2 = womVar.j();
        } else {
            int iJ4 = womVar.M;
            if (iJ4 == 0) {
                iJ4 = womVar.j();
                womVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return (((iHashCode * 31) + iJ2) * 31) + a.k(this.d);
    }

    public final String toString() {
        return "MediaLibraryItemPageData(playId=" + this.a + ", accountName=" + this.b + ", entityStream=" + this.c + ", expirationTimeMillis=" + this.d + ")";
    }
}
