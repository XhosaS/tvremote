package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdo {
    public final wll a;
    public final wnp b;
    public final String c;
    public final wpm d;
    public final wls e;
    public final wls f;
    public final wlx g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final int k;

    public kdo(wll wllVar, wnp wnpVar, String str, wpm wpmVar, wls wlsVar, wls wlsVar2, wlx wlxVar, boolean z, boolean z2, String str2, int i, byte[] bArr) {
        wllVar.getClass();
        this.a = wllVar;
        this.b = wnpVar;
        this.c = str;
        this.d = wpmVar;
        this.e = wlsVar;
        this.f = wlsVar2;
        this.g = wlxVar;
        this.h = z;
        this.i = z2;
        this.j = str2;
        this.k = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdo)) {
            return false;
        }
        kdo kdoVar = (kdo) obj;
        return yks.e(this.a, kdoVar.a) && yks.e(this.b, kdoVar.b) && yks.e(this.c, kdoVar.c) && yks.e(this.d, kdoVar.d) && yks.e(this.e, kdoVar.e) && yks.e(this.f, kdoVar.f) && yks.e(this.g, kdoVar.g) && this.h == kdoVar.h && this.i == kdoVar.i && yks.e(this.j, kdoVar.j) && this.k == kdoVar.k;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int iJ5;
        wll wllVar = this.a;
        if (wllVar.A()) {
            iJ = wllVar.j();
        } else {
            int iJ6 = wllVar.M;
            if (iJ6 == 0) {
                iJ6 = wllVar.j();
                wllVar.M = iJ6;
            }
            iJ = iJ6;
        }
        wnp wnpVar = this.b;
        if (wnpVar.A()) {
            iJ2 = wnpVar.j();
        } else {
            int iJ7 = wnpVar.M;
            if (iJ7 == 0) {
                iJ7 = wnpVar.j();
                wnpVar.M = iJ7;
            }
            iJ2 = iJ7;
        }
        int iHashCode = (((iJ * 31) + iJ2) * 31) + this.c.hashCode();
        wpm wpmVar = this.d;
        if (wpmVar.A()) {
            iJ3 = wpmVar.j();
        } else {
            int iJ8 = wpmVar.M;
            if (iJ8 == 0) {
                iJ8 = wpmVar.j();
                wpmVar.M = iJ8;
            }
            iJ3 = iJ8;
        }
        int i = ((iHashCode * 31) + iJ3) * 31;
        wls wlsVar = this.e;
        int iJ9 = 0;
        if (wlsVar == null) {
            iJ4 = 0;
        } else if (wlsVar.A()) {
            iJ4 = wlsVar.j();
        } else {
            int iJ10 = wlsVar.M;
            if (iJ10 == 0) {
                iJ10 = wlsVar.j();
                wlsVar.M = iJ10;
            }
            iJ4 = iJ10;
        }
        int i2 = (i + iJ4) * 31;
        wls wlsVar2 = this.f;
        if (wlsVar2 != null) {
            if (wlsVar2.A()) {
                iJ9 = wlsVar2.j();
            } else {
                iJ9 = wlsVar2.M;
                if (iJ9 == 0) {
                    iJ9 = wlsVar2.j();
                    wlsVar2.M = iJ9;
                }
            }
        }
        int i3 = (i2 + iJ9) * 31;
        wlx wlxVar = this.g;
        if (wlxVar.A()) {
            iJ5 = wlxVar.j();
        } else {
            int iJ11 = wlxVar.M;
            if (iJ11 == 0) {
                iJ11 = wlxVar.j();
                wlxVar.M = iJ11;
            }
            iJ5 = iJ11;
        }
        int iQ = (((((((i3 + iJ5) * 31) + a.q(this.h)) * 31) + a.q(this.i)) * 31) + this.j.hashCode()) * 31;
        int i4 = this.k;
        a.bw(i4);
        return iQ + i4;
    }

    public final String toString() {
        return "ProviderSelectionItemModel(entityId=" + this.a + ", providerWatchAction=" + this.b + ", mediaProviderId=" + this.c + ", watchAction=" + this.d + ", titleText=" + this.e + ", ctaText=" + this.f + ", icon=" + this.g + ", showWatchNowIcon=" + this.h + ", showChevronRightIcon=" + this.i + ", tag=" + this.j + ", position=" + ((Object) kdw.a(this.k)) + ")";
    }

    public /* synthetic */ kdo(wll wllVar, wnp wnpVar, String str, wpm wpmVar, wls wlsVar, wls wlsVar2, wlx wlxVar, boolean z, boolean z2, String str2, int i) {
        this(wllVar, wnpVar, str, wpmVar, wlsVar, wlsVar2, wlxVar, ((i & 128) == 0) & z, ((i & 256) == 0) & z2, str2, 2, null);
    }
}
