package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imf {
    public final wni a;
    public final String b;
    public final String c;

    public imf(wni wniVar, String str, String str2) {
        wniVar.getClass();
        this.a = wniVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imf)) {
            return false;
        }
        imf imfVar = (imf) obj;
        return yks.e(this.a, imfVar.a) && yks.e(this.b, imfVar.b) && yks.e(this.c, imfVar.c);
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
        return (((iJ * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MediaLibraryItemTag(playId=" + this.a + ", accountName=" + this.b + ", tagId=" + this.c + ")";
    }
}
