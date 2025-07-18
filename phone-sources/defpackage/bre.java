package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bre extends brh {
    public final float a;
    public final float b;

    public bre(float f, float f2) {
        super(false, true, 1);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bre)) {
            return false;
        }
        bre breVar = (bre) obj;
        return Float.compare(this.a, breVar.a) == 0 && Float.compare(this.b, breVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.a + ", dy=" + this.b + ')';
    }
}
