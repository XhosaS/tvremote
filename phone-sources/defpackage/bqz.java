package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqz extends brh {
    public final float a;

    public bqz(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqz) && Float.compare(this.a, ((bqz) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "RelativeHorizontalTo(dx=" + this.a + ')';
    }
}
