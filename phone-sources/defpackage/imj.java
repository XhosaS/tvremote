package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class imj {
    public final String a;
    public final wll b;
    public final boolean c;
    public final wnq d;
    public final long e;

    public imj(String str, wll wllVar, boolean z, wnq wnqVar, long j) {
        this.a = str;
        this.b = wllVar;
        this.c = z;
        this.d = wnqVar;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imj)) {
            return false;
        }
        imj imjVar = (imj) obj;
        return yks.e(this.a, imjVar.a) && yks.e(this.b, imjVar.b) && this.c == imjVar.c && yks.e(this.d, imjVar.d) && this.e == imjVar.e;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iHashCode = this.a.hashCode() * 31;
        wll wllVar = this.b;
        if (wllVar.A()) {
            iJ = wllVar.j();
        } else {
            int iJ3 = wllVar.M;
            if (iJ3 == 0) {
                iJ3 = wllVar.j();
                wllVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int iQ = (((iHashCode + iJ) * 31) + a.q(this.c)) * 31;
        wnq wnqVar = this.d;
        if (wnqVar.A()) {
            iJ2 = wnqVar.j();
        } else {
            int iJ4 = wnqVar.M;
            if (iJ4 == 0) {
                iJ4 = wnqVar.j();
                wnqVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return ((iQ + iJ2) * 31) + a.k(this.e);
    }

    public final String toString() {
        return "WatchActions(accountName=" + this.a + ", entityId=" + this.b + ", keepForever=" + this.c + ", watchActions=" + this.d + ", lastServerWriteMillis=" + this.e + ")";
    }
}
