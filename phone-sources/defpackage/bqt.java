package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqt extends brh {
    public final float a;
    public final float b;

    public bqt(float f, float f2) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqt)) {
            return false;
        }
        bqt bqtVar = (bqt) obj;
        return Float.compare(this.a, bqtVar.a) == 0 && Float.compare(this.b, bqtVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "MoveTo(x=" + this.a + ", y=" + this.b + ')';
    }
}
