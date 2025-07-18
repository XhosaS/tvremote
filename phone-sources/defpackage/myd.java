package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myd {
    public final mwk a;
    public final int b;

    public myd() {
        throw null;
    }

    public static nfz a() {
        nfz nfzVar = new nfz();
        nfzVar.b = mwk.a().d();
        nfzVar.a = 1;
        return nfzVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myd) {
            myd mydVar = (myd) obj;
            if (this.a.equals(mydVar.a)) {
                int i = this.b;
                int i2 = mydVar.b;
                if (i == 0) {
                    throw null;
                }
                if (i == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.b;
        a.bl(i);
        return (iHashCode * 1000003) ^ i;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder("PurchaseOptionViewModel{accessibleText=");
        sb.append(strValueOf);
        sb.append(", purchaseOption=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "SEASON_ONLY" : "EPISODE_ONLY");
        sb.append("}");
        return sb.toString();
    }

    public myd(mwk mwkVar, int i) {
        this.a = mwkVar;
        this.b = i;
    }
}
