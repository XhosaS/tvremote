package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ijt {
    public final wkx a;
    public final wni b;
    public final Long c;
    public final iia d;
    public final wmu e;

    public ijt(wkx wkxVar, wni wniVar, Long l, iia iiaVar, wmu wmuVar) {
        wniVar.getClass();
        iiaVar.getClass();
        wmuVar.getClass();
        this.a = wkxVar;
        this.b = wniVar;
        this.c = l;
        this.d = iiaVar;
        this.e = wmuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijt)) {
            return false;
        }
        ijt ijtVar = (ijt) obj;
        return yks.e(this.a, ijtVar.a) && yks.e(this.b, ijtVar.b) && yks.e(this.c, ijtVar.c) && yks.e(this.d, ijtVar.d) && yks.e(this.e, ijtVar.e);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        wkx wkxVar = this.a;
        if (wkxVar == null) {
            iJ = 0;
        } else if (wkxVar.A()) {
            iJ = wkxVar.j();
        } else {
            int iJ5 = wkxVar.M;
            if (iJ5 == 0) {
                iJ5 = wkxVar.j();
                wkxVar.M = iJ5;
            }
            iJ = iJ5;
        }
        wni wniVar = this.b;
        if (wniVar.A()) {
            iJ2 = wniVar.j();
        } else {
            int iJ6 = wniVar.M;
            if (iJ6 == 0) {
                iJ6 = wniVar.j();
                wniVar.M = iJ6;
            }
            iJ2 = iJ6;
        }
        int i = iJ * 31;
        Long l = this.c;
        int iHashCode = (((i + iJ2) * 31) + (l != null ? l.hashCode() : 0)) * 31;
        iia iiaVar = this.d;
        if (iiaVar.A()) {
            iJ3 = iiaVar.j();
        } else {
            int iJ7 = iiaVar.M;
            if (iJ7 == 0) {
                iJ7 = iiaVar.j();
                iiaVar.M = iJ7;
            }
            iJ3 = iJ7;
        }
        int i2 = (iHashCode + iJ3) * 31;
        wmu wmuVar = this.e;
        if (wmuVar.A()) {
            iJ4 = wmuVar.j();
        } else {
            int iJ8 = wmuVar.M;
            if (iJ8 == 0) {
                iJ8 = wmuVar.j();
                wmuVar.M = iJ8;
            }
            iJ4 = iJ8;
        }
        return i2 + iJ4;
    }

    public final String toString() {
        return "ComponentInfo(component=" + this.a + ", playId=" + this.b + ", rentalExpiration=" + this.c + ", mediaLibraryItemInfo=" + this.d + ", mediaLibraryItemMetadata=" + this.e + ")";
    }
}
