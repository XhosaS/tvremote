package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mh {
    public final np a;
    private final float b = 0.0f;

    public mh(np npVar) {
        this.a = npVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh)) {
            return false;
        }
        mh mhVar = (mh) obj;
        float f = mhVar.b;
        return Float.compare(0.0f, 0.0f) == 0 && yks.e(this.a, mhVar.a);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(0.0f) * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Fade(alpha=0.0, animationSpec=" + this.a + ')';
    }
}
