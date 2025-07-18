package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipe {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final wni f;
    public final wni g;
    public final String h;
    public final Integer i;
    public final inm j;

    public ipe() {
        this(false, false, false, false, false, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipe)) {
            return false;
        }
        ipe ipeVar = (ipe) obj;
        return this.a == ipeVar.a && this.b == ipeVar.b && this.c == ipeVar.c && this.d == ipeVar.d && this.e == ipeVar.e && yks.e(this.f, ipeVar.f) && yks.e(this.g, ipeVar.g) && yks.e(this.h, ipeVar.h) && yks.e(this.i, ipeVar.i) && yks.e(this.j, ipeVar.j);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        wni wniVar = this.f;
        if (wniVar == null) {
            iJ = 0;
        } else if (wniVar.A()) {
            iJ = wniVar.j();
        } else {
            int iJ3 = wniVar.M;
            if (iJ3 == 0) {
                iJ3 = wniVar.j();
                wniVar.M = iJ3;
            }
            iJ = iJ3;
        }
        boolean z = this.e;
        boolean z2 = this.d;
        boolean z3 = this.c;
        boolean z4 = this.b;
        boolean z5 = this.a;
        wni wniVar2 = this.g;
        if (wniVar2 == null) {
            iJ2 = 0;
        } else if (wniVar2.A()) {
            iJ2 = wniVar2.j();
        } else {
            int iJ4 = wniVar2.M;
            if (iJ4 == 0) {
                iJ4 = wniVar2.j();
                wniVar2.M = iJ4;
            }
            iJ2 = iJ4;
        }
        int iQ = a.q(z5);
        int iQ2 = (((((((((((((iQ * 31) + a.q(z4)) * 31) + a.q(z3)) * 31) + a.q(z2)) * 31) + a.q(z)) * 31) + iJ) * 31) + iJ2) * 31) + this.h.hashCode();
        Integer num = this.i;
        int iHashCode = ((iQ2 * 31) + (num == null ? 0 : num.hashCode())) * 31;
        inm inmVar = this.j;
        return iHashCode + (inmVar != null ? inmVar.hashCode() : 0);
    }

    public final String toString() {
        return "LibraryStoreItem(isPreordered=" + this.a + ", isPurchased=" + this.b + ", isRented=" + this.c + ", isFamilyShareable=" + this.d + ", isFamilyShared=" + this.e + ", parentId=" + this.f + ", rootId=" + this.g + ", title=" + this.h + ", order=" + this.i + ", bundleInfo=" + this.j + ")";
    }

    public ipe(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, wni wniVar, wni wniVar2, String str, Integer num, inm inmVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = wniVar;
        this.g = wniVar2;
        this.h = str;
        this.i = num;
        this.j = inmVar;
    }

    public /* synthetic */ ipe(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), ((i & 2) == 0) & z2, ((i & 4) == 0) & z3, ((i & 8) == 0) & z4, ((i & 16) == 0) & z5, null, null, "", null, null);
    }
}
