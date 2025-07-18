package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brg extends brh {
    public final float a;

    public brg(float f) {
        super(false, false, 3);
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof brg) && Float.compare(this.a, ((brg) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.a);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.a + ')';
    }
}
