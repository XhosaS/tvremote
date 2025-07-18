package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imc {
    public final wni a;
    public final String b;
    public final long c;
    public final wkx d;
    public final wkx e;
    public final wmu f;

    public imc(wni wniVar, String str, long j, wkx wkxVar, wkx wkxVar2, wmu wmuVar) {
        this.a = wniVar;
        this.b = str;
        this.c = j;
        this.d = wkxVar;
        this.e = wkxVar2;
        this.f = wmuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imc)) {
            return false;
        }
        imc imcVar = (imc) obj;
        return yks.e(this.a, imcVar.a) && yks.e(this.b, imcVar.b) && this.c == imcVar.c && yks.e(this.d, imcVar.d) && yks.e(this.e, imcVar.e) && yks.e(this.f, imcVar.f);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        wni wniVar = this.a;
        if (wniVar.A()) {
            iJ = wniVar.j();
        } else {
            int iJ4 = wniVar.M;
            if (iJ4 == 0) {
                iJ4 = wniVar.j();
                wniVar.M = iJ4;
            }
            iJ = iJ4;
        }
        int iHashCode = (iJ * 31) + this.b.hashCode();
        long j = this.c;
        wkx wkxVar = this.d;
        int iJ5 = 0;
        if (wkxVar == null) {
            iJ2 = 0;
        } else if (wkxVar.A()) {
            iJ2 = wkxVar.j();
        } else {
            int iJ6 = wkxVar.M;
            if (iJ6 == 0) {
                iJ6 = wkxVar.j();
                wkxVar.M = iJ6;
            }
            iJ2 = iJ6;
        }
        int iK = ((((iHashCode * 31) + a.k(j)) * 31) + iJ2) * 31;
        wkx wkxVar2 = this.e;
        if (wkxVar2 != null) {
            if (wkxVar2.A()) {
                iJ5 = wkxVar2.j();
            } else {
                iJ5 = wkxVar2.M;
                if (iJ5 == 0) {
                    iJ5 = wkxVar2.j();
                    wkxVar2.M = iJ5;
                }
            }
        }
        int i = (iK + iJ5) * 31;
        wmu wmuVar = this.f;
        if (wmuVar.A()) {
            iJ3 = wmuVar.j();
        } else {
            int iJ7 = wmuVar.M;
            if (iJ7 == 0) {
                iJ7 = wmuVar.j();
                wmuVar.M = iJ7;
            }
            iJ3 = iJ7;
        }
        return i + iJ3;
    }

    public final String toString() {
        return "MediaLibraryItemMetadata(playId=" + this.a + ", accountName=" + this.b + ", expirationTimeMillis=" + this.c + ", component=" + this.d + ", searchSuggestionComponent=" + this.e + ", mediaLibraryItemMetadata=" + this.f + ")";
    }
}
