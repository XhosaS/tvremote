package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class piy {
    private final String a;
    private final vsl b;

    public piy(String str, vsl vslVar) {
        this.a = str;
        this.b = vslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piy)) {
            return false;
        }
        piy piyVar = (piy) obj;
        return yks.e(this.a, piyVar.a) && yks.e(this.b, piyVar.b);
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() * 31;
        vsl vslVar = this.b;
        if (vslVar.A()) {
            iJ = vslVar.j();
        } else {
            int iJ2 = vslVar.M;
            if (iJ2 == 0) {
                iJ2 = vslVar.j();
                vslVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return iHashCode + iJ;
    }

    public final String toString() {
        return "CustomUiData(customUiId=" + this.a + ", customUiPayload=" + this.b + ")";
    }
}
