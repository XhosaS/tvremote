package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ean {
    public final eao a;
    public final float b;

    public ean(eao eaoVar, float f) {
        this.a = eaoVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ean eanVar = (ean) obj;
            if (Float.compare(eanVar.b, this.b) == 0 && this.a.equals(eanVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        float f = this.b;
        return iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        return "PropertyAnimation{ PropertyHandle=" + this.a.toString() + ", TargetValue=" + this.b + "}";
    }
}
