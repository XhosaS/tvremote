package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class img {
    public final String a;
    public final wni b;
    public final wni c;

    public img(String str, wni wniVar, wni wniVar2) {
        this.a = str;
        this.b = wniVar;
        this.c = wniVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof img)) {
            return false;
        }
        img imgVar = (img) obj;
        return yks.e(this.a, imgVar.a) && yks.e(this.b, imgVar.b) && yks.e(this.c, imgVar.c);
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
        wni wniVar2 = this.c;
        if (wniVar2.A()) {
            iJ2 = wniVar2.j();
        } else {
            int iJ4 = wniVar2.M;
            if (iJ4 == 0) {
                iJ4 = wniVar2.j();
                wniVar2.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return i + iJ2;
    }

    public final String toString() {
        return "MediaLibraryLastWatchedEpisode(accountName=" + this.a + ", showId=" + this.b + ", lastWatchedEpisodeId=" + this.c + ")";
    }
}
