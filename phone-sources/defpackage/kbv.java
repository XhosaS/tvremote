package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbv {
    public final wls a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;
    public final wls f;
    public final long g;
    public final wls h;
    public final long i;

    public kbv(wls wlsVar, long j, long j2, String str, long j3, wls wlsVar2, long j4, wls wlsVar3, long j5) {
        this.a = wlsVar;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = j3;
        this.f = wlsVar2;
        this.g = j4;
        this.h = wlsVar3;
        this.i = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbv)) {
            return false;
        }
        kbv kbvVar = (kbv) obj;
        if (!yks.e(this.a, kbvVar.a)) {
            return false;
        }
        long j = this.b;
        long j2 = kbvVar.b;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.c, kbvVar.c) && yks.e(this.d, kbvVar.d) && a.s(this.e, kbvVar.e) && yks.e(this.f, kbvVar.f) && a.s(this.g, kbvVar.g) && yks.e(this.h, kbvVar.h) && a.s(this.i, kbvVar.i);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        wls wlsVar = this.a;
        if (wlsVar.A()) {
            iJ = wlsVar.j();
        } else {
            int iJ4 = wlsVar.M;
            if (iJ4 == 0) {
                iJ4 = wlsVar.j();
                wlsVar.M = iJ4;
            }
            iJ = iJ4;
        }
        long j = this.b;
        long j2 = bnq.a;
        int iK = (((((iJ * 31) + a.k(j)) * 31) + a.k(this.c)) * 31) + this.d.hashCode();
        long j3 = this.e;
        wls wlsVar2 = this.f;
        if (wlsVar2.A()) {
            iJ2 = wlsVar2.j();
        } else {
            int iJ5 = wlsVar2.M;
            if (iJ5 == 0) {
                iJ5 = wlsVar2.j();
                wlsVar2.M = iJ5;
            }
            iJ2 = iJ5;
        }
        int iK2 = ((((((iK * 31) + a.k(j3)) * 31) + iJ2) * 31) + a.k(this.g)) * 31;
        wls wlsVar3 = this.h;
        if (wlsVar3.A()) {
            iJ3 = wlsVar3.j();
        } else {
            int iJ6 = wlsVar3.M;
            if (iJ6 == 0) {
                iJ6 = wlsVar3.j();
                wlsVar3.M = iJ6;
            }
            iJ3 = iJ6;
        }
        return ((iK2 + iJ3) * 31) + a.k(this.i);
    }

    public final String toString() {
        long j = this.i;
        long j2 = this.g;
        long j3 = this.e;
        long j4 = this.c;
        return "HotAndNewCardMetadataContentData(badgeText=" + this.a + ", badgeTextColor=" + bnq.g(this.b) + ", badgeBackgroundColor=" + bnq.g(j4) + ", titleText=" + this.d + ", titleTextColor=" + bnq.g(j3) + ", subtitleText=" + this.f + ", subtitleTextColor=" + bnq.g(j2) + ", synopsisText=" + this.h + ", synopsisTextColor=" + bnq.g(j) + ")";
    }
}
