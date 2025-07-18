package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bra extends brh {
    public final float a;
    public final float b;

    public bra(float f, float f2) {
        super(false, false, 3);
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bra)) {
            return false;
        }
        bra braVar = (bra) obj;
        return Float.compare(this.a, braVar.a) == 0 && Float.compare(this.b, braVar.b) == 0;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.a + ", dy=" + this.b + ')';
    }
}
