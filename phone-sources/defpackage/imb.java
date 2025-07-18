package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imb {
    public final wni a;
    public final wmp b;
    public final String c;
    public final int d;
    public final String e;
    public final Integer f;
    public final wni g;
    public final wni h;
    public final wkx i;
    public final boolean j;
    public final String k;
    public final iia l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;

    public imb(wni wniVar, wmp wmpVar, String str, int i, String str2, Integer num, wni wniVar2, wni wniVar3, wkx wkxVar, boolean z, String str3, iia iiaVar, String str4, String str5, String str6, String str7, String str8) {
        this.a = wniVar;
        this.b = wmpVar;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = num;
        this.g = wniVar2;
        this.h = wniVar3;
        this.i = wkxVar;
        this.j = z;
        this.k = str3;
        this.l = iiaVar;
        this.m = str4;
        this.n = str5;
        this.o = str6;
        this.p = str7;
        this.q = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imb)) {
            return false;
        }
        imb imbVar = (imb) obj;
        return yks.e(this.a, imbVar.a) && yks.e(this.b, imbVar.b) && yks.e(this.c, imbVar.c) && this.d == imbVar.d && yks.e(this.e, imbVar.e) && yks.e(this.f, imbVar.f) && yks.e(this.g, imbVar.g) && yks.e(this.h, imbVar.h) && yks.e(this.i, imbVar.i) && this.j == imbVar.j && yks.e(this.k, imbVar.k) && yks.e(this.l, imbVar.l) && yks.e(this.m, imbVar.m) && yks.e(this.n, imbVar.n) && yks.e(this.o, imbVar.o) && yks.e(this.p, imbVar.p) && yks.e(this.q, imbVar.q);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int iJ5;
        int iJ6;
        wni wniVar = this.a;
        if (wniVar.A()) {
            iJ = wniVar.j();
        } else {
            int iJ7 = wniVar.M;
            if (iJ7 == 0) {
                iJ7 = wniVar.j();
                wniVar.M = iJ7;
            }
            iJ = iJ7;
        }
        wmp wmpVar = this.b;
        if (wmpVar.A()) {
            iJ2 = wmpVar.j();
        } else {
            int iJ8 = wmpVar.M;
            if (iJ8 == 0) {
                iJ8 = wmpVar.j();
                wmpVar.M = iJ8;
            }
            iJ2 = iJ8;
        }
        int iHashCode = (((iJ * 31) + iJ2) * 31) + this.c.hashCode();
        int i = this.d;
        String str = this.e;
        int iHashCode2 = ((((iHashCode * 31) + i) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        wni wniVar2 = this.g;
        if (wniVar2 == null) {
            iJ3 = 0;
        } else if (wniVar2.A()) {
            iJ3 = wniVar2.j();
        } else {
            int iJ9 = wniVar2.M;
            if (iJ9 == 0) {
                iJ9 = wniVar2.j();
                wniVar2.M = iJ9;
            }
            iJ3 = iJ9;
        }
        int i2 = (iHashCode3 + iJ3) * 31;
        wni wniVar3 = this.h;
        if (wniVar3 == null) {
            iJ4 = 0;
        } else if (wniVar3.A()) {
            iJ4 = wniVar3.j();
        } else {
            int iJ10 = wniVar3.M;
            if (iJ10 == 0) {
                iJ10 = wniVar3.j();
                wniVar3.M = iJ10;
            }
            iJ4 = iJ10;
        }
        int i3 = (i2 + iJ4) * 31;
        wkx wkxVar = this.i;
        if (wkxVar == null) {
            iJ5 = 0;
        } else if (wkxVar.A()) {
            iJ5 = wkxVar.j();
        } else {
            int iJ11 = wkxVar.M;
            if (iJ11 == 0) {
                iJ11 = wkxVar.j();
                wkxVar.M = iJ11;
            }
            iJ5 = iJ11;
        }
        int iQ = (((i3 + iJ5) * 31) + a.q(this.j)) * 31;
        String str2 = this.k;
        int iHashCode4 = (iQ + (str2 == null ? 0 : str2.hashCode())) * 31;
        iia iiaVar = this.l;
        if (iiaVar.A()) {
            iJ6 = iiaVar.j();
        } else {
            int iJ12 = iiaVar.M;
            if (iJ12 == 0) {
                iJ12 = iiaVar.j();
                iiaVar.M = iJ12;
            }
            iJ6 = iJ12;
        }
        int i4 = (iHashCode4 + iJ6) * 31;
        String str3 = this.m;
        int iHashCode5 = (i4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.n;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.o;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.p;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.q;
        return iHashCode8 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        return "MediaLibraryItem(playId=" + this.a + ", mediaLibraryItemId=" + this.b + ", accountName=" + this.c + ", type=" + this.d + ", title=" + this.e + ", order=" + this.f + ", parentId=" + this.g + ", rootId=" + this.h + ", component=" + this.i + ", shared=" + this.j + ", bundleTitle=" + this.k + ", mediaLibraryItemInfo=" + this.l + ", sortOption1=" + this.m + ", sortOption2=" + this.n + ", sortOption3=" + this.o + ", sortOption4=" + this.p + ", sortOption5=" + this.q + ")";
    }
}
