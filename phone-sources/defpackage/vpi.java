package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpi {
    public final float a;
    public final vqi b;
    public final vpj c;

    public vpi() {
        this(0.0f, (vqi) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpi)) {
            return false;
        }
        vpi vpiVar = (vpi) obj;
        return Float.compare(this.a, vpiVar.a) == 0 && yks.e(this.b, vpiVar.b) && yks.e(this.c, vpiVar.c);
    }

    public final int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.a) * 31;
        vqi vqiVar = this.b;
        int iHashCode = (iFloatToIntBits + (vqiVar == null ? 0 : vqiVar.hashCode())) * 31;
        vpj vpjVar = this.c;
        return iHashCode + (vpjVar != null ? vpjVar.hashCode() : 0);
    }

    public final String toString() {
        return "AvatarData(alpha=" + this.a + ", ringData=" + this.b + ", badgeData=" + this.c + ")";
    }

    public vpi(float f, vqi vqiVar, vpj vpjVar) {
        this.a = f;
        this.b = vqiVar;
        this.c = vpjVar;
    }

    public /* synthetic */ vpi(float f, vqi vqiVar, int i) {
        this(1 == (i & 1) ? 1.0f : f, (i & 2) != 0 ? null : vqiVar, (vpj) null);
    }
}
