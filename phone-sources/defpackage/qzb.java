package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qzb {
    public final ofa a;
    public final vrp b;

    public qzb(ofa ofaVar, vrp vrpVar) {
        this.a = ofaVar;
        this.b = vrpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qzb)) {
            return false;
        }
        qzb qzbVar = (qzb) obj;
        return yks.e(this.a, qzbVar.a) && yks.e(this.b, qzbVar.b);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        ofa ofaVar = this.a;
        if (ofaVar.A()) {
            iJ = ofaVar.j();
        } else {
            int iJ3 = ofaVar.M;
            if (iJ3 == 0) {
                iJ3 = ofaVar.j();
                ofaVar.M = iJ3;
            }
            iJ = iJ3;
        }
        vrp vrpVar = this.b;
        if (vrpVar.A()) {
            iJ2 = vrpVar.j();
        } else {
            int iJ4 = vrpVar.M;
            if (iJ4 == 0) {
                iJ4 = vrpVar.j();
                vrpVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return (iJ * 31) + iJ2;
    }

    public final String toString() {
        return "HealthAlertWithTap(accountHealthAlerts=" + this.a + ", tap=" + this.b + ")";
    }
}
