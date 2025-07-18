package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iju {
    public final iia a;
    public final Long b;
    private final wni c;

    public iju(iia iiaVar, wni wniVar, Long l) {
        this.a = iiaVar;
        this.c = wniVar;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iju)) {
            return false;
        }
        iju ijuVar = (iju) obj;
        return yks.e(this.a, ijuVar.a) && yks.e(this.c, ijuVar.c) && yks.e(this.b, ijuVar.b);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        iia iiaVar = this.a;
        if (iiaVar.A()) {
            iJ = iiaVar.j();
        } else {
            int iJ3 = iiaVar.M;
            if (iJ3 == 0) {
                iJ3 = iiaVar.j();
                iiaVar.M = iJ3;
            }
            iJ = iJ3;
        }
        wni wniVar = this.c;
        if (wniVar.A()) {
            iJ2 = wniVar.j();
        } else {
            int iJ4 = wniVar.M;
            if (iJ4 == 0) {
                iJ4 = wniVar.j();
                wniVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        int i = iJ * 31;
        Long l = this.b;
        return ((i + iJ2) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "MediaLibraryItemWithRentalInfo(mediaLibraryItemInfo=" + this.a + ", playId=" + this.c + ", shortRentalExpirationMillis=" + this.b + ")";
    }
}
