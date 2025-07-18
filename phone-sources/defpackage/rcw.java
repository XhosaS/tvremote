package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rcw {
    public final vrd a;
    public final vrp b;

    public rcw(vrd vrdVar, vrp vrpVar) {
        this.a = vrdVar;
        this.b = vrpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rcw)) {
            return false;
        }
        rcw rcwVar = (rcw) obj;
        return yks.e(this.a, rcwVar.a) && yks.e(this.b, rcwVar.b);
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() * 31;
        vrp vrpVar = this.b;
        if (vrpVar.A()) {
            iJ = vrpVar.j();
        } else {
            int iJ2 = vrpVar.M;
            if (iJ2 == 0) {
                iJ2 = vrpVar.j();
                vrpVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return iHashCode + iJ;
    }

    public final String toString() {
        return "ReadyStateWithTap(readyState=" + this.a + ", tap=" + this.b + ")";
    }
}
