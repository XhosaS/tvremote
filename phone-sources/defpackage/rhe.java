package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhe {
    public final dvs a;
    public final dvs b;

    public rhe() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rhe) {
            rhe rheVar = (rhe) obj;
            dvs dvsVar = this.a;
            if (dvsVar != null ? dvsVar.equals(rheVar.a) : rheVar.a == null) {
                dvs dvsVar2 = this.b;
                dvs dvsVar3 = rheVar.b;
                if (dvsVar2 != null ? dvsVar2.equals(dvsVar3) : dvsVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dvs dvsVar = this.a;
        int iHashCode = dvsVar == null ? 0 : dvsVar.hashCode();
        dvs dvsVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (dvsVar2 != null ? dvsVar2.hashCode() : 0);
    }

    public final String toString() {
        dvs dvsVar = this.b;
        return "CardsLiveDatas{importantCards=" + String.valueOf(this.a) + ", commonActions=" + String.valueOf(dvsVar) + "}";
    }

    public rhe(dvs dvsVar, dvs dvsVar2) {
        this.a = dvsVar;
        this.b = dvsVar2;
    }
}
