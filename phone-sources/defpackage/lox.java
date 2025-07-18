package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lox {
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;

    public lox(String str, String str2, int i, int i2, long j, boolean z) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = i2;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lox)) {
            return false;
        }
        lox loxVar = (lox) obj;
        return yks.e(this.a, loxVar.a) && yks.e(this.b, loxVar.b) && this.c == loxVar.c && this.f == loxVar.f && this.d == loxVar.d && this.e == loxVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        int i = this.f;
        a.bw(i);
        return (((((((iHashCode * 31) + this.c) * 31) + i) * 31) + a.k(this.d)) * 31) + a.q(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Watchlist(accountName=");
        sb.append(this.a);
        sb.append(", assetId=");
        sb.append(this.b);
        sb.append(", assetType=");
        sb.append(this.c);
        sb.append(", assetState=");
        sb.append((Object) (this.f != 1 ? "WISHLISTED_NOT_SYNCED" : "WISHLISTED_SYNCED"));
        sb.append(", assetOrder=");
        sb.append(this.d);
        sb.append(", inCloud=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
