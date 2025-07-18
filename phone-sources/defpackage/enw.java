package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enw {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public enw(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final Uri a(String str) {
        return eci.p(str, this.c);
    }

    public final enw b(enw enwVar, String str) {
        String str2;
        String strC = c(str);
        if (enwVar == null || !strC.equals(enwVar.c(str))) {
            return null;
        }
        long j = this.b;
        if (j != -1) {
            str2 = strC;
            long j2 = this.a;
            if (j2 + j == enwVar.a) {
                long j3 = enwVar.b;
                return new enw(str2, j2, j3 != -1 ? j + j3 : -1L);
            }
        } else {
            str2 = strC;
        }
        long j4 = enwVar.b;
        if (j4 == -1) {
            return null;
        }
        long j5 = enwVar.a;
        if (j5 + j4 == this.a) {
            return new enw(str2, j5, j != -1 ? j4 + j : -1L);
        }
        return null;
    }

    public final String c(String str) {
        return eci.q(str, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            enw enwVar = (enw) obj;
            if (this.a == enwVar.a && this.b == enwVar.b && this.c.equals(enwVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        this.d = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return "RangedUri(referenceUri=" + this.c + ", start=" + this.a + ", length=" + this.b + ")";
    }
}
