package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clp {
    public static final clp a = new clp(null);
    public final float b;
    public final float c;

    public clp(byte[] bArr) {
        this.b = 1.0f;
        this.c = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clp)) {
            return false;
        }
        clp clpVar = (clp) obj;
        float f = clpVar.b;
        float f2 = clpVar.c;
        return true;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "TextGeometricTransform(scaleX=1.0, skewX=0.0)";
    }

    public clp() {
        this(null);
    }
}
