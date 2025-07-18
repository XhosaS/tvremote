package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mmq {
    public final kwl a;
    public final ieg b;

    public mmq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mmq) {
            mmq mmqVar = (mmq) obj;
            if (this.a.equals(mmqVar.a) && this.b.equals(mmqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.b;
        return "SeasonAndDistributorId{season=" + this.a.toString() + ", distributorId=" + iegVar.toString() + "}";
    }

    public mmq(kwl kwlVar, ieg iegVar) {
        if (kwlVar == null) {
            throw new NullPointerException("Null season");
        }
        this.a = kwlVar;
        if (iegVar == null) {
            throw new NullPointerException("Null distributorId");
        }
        this.b = iegVar;
    }
}
