package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lfj {
    public static final tyz a;
    public final String b;
    public final String c;
    public final int d;

    static {
        int i = tzc.a;
        tyz tyzVar = tzb.a;
        tyzVar.getClass();
        a = tyzVar;
    }

    public lfj(String str, int i, String str2) {
        this.b = str;
        this.d = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfj)) {
            return false;
        }
        lfj lfjVar = (lfj) obj;
        return yks.e(this.b, lfjVar.b) && this.d == lfjVar.d && yks.e(this.c, lfjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        int i = this.d;
        a.bw(i);
        return ((iHashCode + i) * 31) + this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SenderCredentials(accountHash=");
        sb.append(this.b);
        sb.append(", appBrand=");
        sb.append((Object) (this.d != 2 ? "GOOGLE_TV" : "PLAY_MOVIES"));
        sb.append(", deviceName=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
