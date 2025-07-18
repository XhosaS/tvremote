package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxv implements lhf {
    public final kuo a;
    public final lio b;
    public final int c;

    public mxv() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxv) {
            mxv mxvVar = (mxv) obj;
            if (this.a.equals(mxvVar.a)) {
                int i = mxvVar.c;
                if (this.b.equals(mxvVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        a.bl(1);
        return (((iHashCode * 1000003) ^ 1) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PurchaseEpisodeClickEvent{episode=" + this.a.toString() + ", purchaseOption=EPISODE_ONLY, uiElementNode=" + this.b.toString() + "}";
    }

    public mxv(kuo kuoVar, int i, lio lioVar) {
        if (kuoVar == null) {
            throw new NullPointerException("Null episode");
        }
        this.a = kuoVar;
        if (i == 0) {
            throw new NullPointerException("Null purchaseOption");
        }
        this.c = 1;
        if (lioVar == null) {
            throw new NullPointerException("Null uiElementNode");
        }
        this.b = lioVar;
    }
}
