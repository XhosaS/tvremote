package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqs {
    public final Integer a;
    public final vro b;
    public final vrp c;
    public final yjk d;
    public final int e;
    public final ucf f;
    public final vrd g;

    public vqs(vrd vrdVar, Integer num, vro vroVar, vrp vrpVar, yjk yjkVar, int i, ucf ucfVar) {
        vroVar.getClass();
        vrpVar.getClass();
        this.g = vrdVar;
        this.a = num;
        this.b = vroVar;
        this.c = vrpVar;
        this.d = yjkVar;
        this.e = i;
        this.f = ucfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqs)) {
            return false;
        }
        vqs vqsVar = (vqs) obj;
        return yks.e(this.g, vqsVar.g) && yks.e(this.a, vqsVar.a) && this.b == vqsVar.b && yks.e(this.c, vqsVar.c) && yks.e(this.d, vqsVar.d) && this.e == vqsVar.e && yks.e(this.f, vqsVar.f);
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.g.hashCode() * 31;
        Integer num = this.a;
        int iJ2 = 0;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.b.hashCode()) * 31;
        vrp vrpVar = this.c;
        if (vrpVar.A()) {
            iJ = vrpVar.j();
        } else {
            int iJ3 = vrpVar.M;
            if (iJ3 == 0) {
                iJ3 = vrpVar.j();
                vrpVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int i = (iHashCode2 + iJ) * 31;
        yjk yjkVar = this.d;
        int iHashCode3 = (((i + (yjkVar == null ? 0 : yjkVar.hashCode())) * 31) + this.e) * 31;
        ucf ucfVar = this.f;
        if (ucfVar != null) {
            if (ucfVar.A()) {
                iJ2 = ucfVar.j();
            } else {
                iJ2 = ucfVar.M;
                if (iJ2 == 0) {
                    iJ2 = ucfVar.j();
                    ucfVar.M = iJ2;
                }
            }
        }
        return iHashCode3 + iJ2;
    }

    public final String toString() {
        return "Card(cardState=" + this.g + ", stableId=" + this.a + ", backgroundColor=" + this.b + ", tap=" + this.c + ", onImpression=" + this.d + ", veId=" + this.e + ", veImpressionMetadata=" + this.f + ")";
    }

    public /* synthetic */ vqs(vrd vrdVar, Integer num, vro vroVar, vrp vrpVar, yjk yjkVar, int i, int i2) {
        this(vrdVar, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? vro.SURFACE_CONTAINER_LOWEST : vroVar, vrpVar, (i2 & 16) != 0 ? null : yjkVar, i, (ucf) null);
    }
}
