package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lyj {
    public final lyc a;
    public final kzw b;
    public final long c;
    public final long d;

    public lyj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyj) {
            lyj lyjVar = (lyj) obj;
            if (this.a.equals(lyjVar.a) && this.b.equals(lyjVar.b) && this.c == lyjVar.c && this.d == lyjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() ^ 1000003;
        kzw kzwVar = this.b;
        if (kzwVar.A()) {
            iJ = kzwVar.j();
        } else {
            int iJ2 = kzwVar.M;
            if (iJ2 == 0) {
                iJ2 = kzwVar.j();
                kzwVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int i = ((iHashCode * 1000003) ^ iJ) * 1000003;
        long j = this.c;
        long j2 = this.d;
        return ((i ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        kzw kzwVar = this.b;
        return "CachedItem{key=" + String.valueOf(this.a) + ", value=" + kzwVar.toString() + ", lastUpdateSec=" + this.c + ", expirationSec=" + this.d + "}";
    }

    public lyj(lyc lycVar, kzw kzwVar, long j, long j2) {
        this.a = lycVar;
        if (kzwVar == null) {
            throw new NullPointerException("Null value");
        }
        this.b = kzwVar;
        this.c = j;
        this.d = j2;
    }
}
