package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qs {
    public final float a = 1.0f;
    public final bnn b;

    public qs(bnn bnnVar) {
        this.b = bnnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs)) {
            return false;
        }
        qs qsVar = (qs) obj;
        float f = qsVar.a;
        return cma.b(1.0f, 1.0f) && yks.e(this.b, qsVar.b);
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) cma.a(1.0f)) + ", brush=" + this.b + ')';
    }
}
