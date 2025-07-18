package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kx {
    public final float a;
    public final float b;

    public kx(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kx)) {
            return false;
        }
        kx kxVar = (kx) obj;
        return Float.compare(this.a, kxVar.a) == 0 && Float.compare(this.b, kxVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "FlingResult(distanceCoefficient=" + this.a + ", velocityCoefficient=" + this.b + ')';
    }
}
