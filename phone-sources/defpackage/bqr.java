package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqr extends brh {
    public final float a;

    public bqr(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bqr) && Float.compare(this.a, ((bqr) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "HorizontalTo(x=" + this.a + ')';
    }
}
