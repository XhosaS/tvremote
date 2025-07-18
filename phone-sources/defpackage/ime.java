package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ime {
    public final wni a;
    public final String b;
    public final Long c;

    public ime(wni wniVar, String str, Long l) {
        str.getClass();
        this.a = wniVar;
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ime)) {
            return false;
        }
        ime imeVar = (ime) obj;
        return yks.e(this.a, imeVar.a) && yks.e(this.b, imeVar.b) && yks.e(this.c, imeVar.c);
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
        Long l = this.c;
        return (iHashCode * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "MediaLibraryItemRental(playId=" + this.a + ", accountName=" + this.b + ", shortRentalExpirationMillis=" + this.c + ")";
    }
}
