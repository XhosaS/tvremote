package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class inn {
    public final wni a;
    public final String b;
    public final Integer c;
    public final wlx d;

    public inn(wni wniVar, String str, Integer num, wlx wlxVar) {
        this.a = wniVar;
        this.b = str;
        this.c = num;
        this.d = wlxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inn)) {
            return false;
        }
        inn innVar = (inn) obj;
        return yks.e(this.a, innVar.a) && yks.e(this.b, innVar.b) && yks.e(this.c, innVar.c) && yks.e(this.d, innVar.d);
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
        int iHashCode = (iJ * 31) + this.b.hashCode();
        Integer num = this.c;
        int iJ3 = 0;
        int iHashCode2 = ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31;
        wlx wlxVar = this.d;
        if (wlxVar != null) {
            if (wlxVar.A()) {
                iJ3 = wlxVar.j();
            } else {
                iJ3 = wlxVar.M;
                if (iJ3 == 0) {
                    iJ3 = wlxVar.j();
                    wlxVar.M = iJ3;
                }
            }
        }
        return iHashCode2 + iJ3;
    }

    public final String toString() {
        return "EpisodeInfo(playId=" + this.a + ", title=" + this.b + ", episodeNumber=" + this.c + ", episodeImage=" + this.d + ")";
    }
}
