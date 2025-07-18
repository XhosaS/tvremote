package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxw extends nyo {
    public final cyx a;
    private final njw b;

    public nxw(cyx cyxVar, njw njwVar) {
        if (cyxVar == null) {
            throw new NullPointerException("Null requestBuilder");
        }
        this.a = cyxVar;
        this.b = njwVar;
    }

    @Override // defpackage.nyo
    public final cyx a() {
        return this.a;
    }

    @Override // defpackage.nyo
    public final njw b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        njw njwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof nyo) {
            nyo nyoVar = (nyo) obj;
            if (this.a.equals(nyoVar.a()) && ((njwVar = this.b) != null ? njwVar.equals(nyoVar.b()) : nyoVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        njw njwVar = this.b;
        return (iHashCode * 1000003) ^ (njwVar == null ? 0 : njwVar.hashCode());
    }

    public final String toString() {
        njw njwVar = this.b;
        return "GlideRequest{requestBuilder=" + this.a.toString() + ", imageSource=" + String.valueOf(njwVar) + "}";
    }
}
