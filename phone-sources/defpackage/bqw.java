package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqw extends brh {
    public final float a;
    public final float b;

    public bqw(float f, float f2) {
        super(false, true, 1);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqw)) {
            return false;
        }
        bqw bqwVar = (bqw) obj;
        return Float.compare(this.a, bqwVar.a) == 0 && Float.compare(this.b, bqwVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "ReflectiveQuadTo(x=" + this.a + ", y=" + this.b + ')';
    }
}
