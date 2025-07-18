package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkh {
    private final float a;

    public bkh(float f) {
        this.a = f;
    }

    public final int a(int i, int i2) {
        return Math.round(((i2 - i) / 2.0f) * (this.a + 1.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkh) && Float.compare(this.a, ((bkh) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "Vertical(bias=" + this.a + ')';
    }
}
