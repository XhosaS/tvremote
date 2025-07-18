package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ebo {
    public static final ebo a = new ebo(0, 0);
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(3);
    public final int e;
    public final int f;
    public final float g;

    public ebo(int i, int i2, float f) {
        this.e = i;
        this.f = i2;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ebo) {
            ebo eboVar = (ebo) obj;
            if (this.e == eboVar.e && this.f == eboVar.f && this.g == eboVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.e + 217) * 31) + this.f) * 31) + Float.floatToRawIntBits(this.g);
    }

    public ebo(int i, int i2) {
        this(i, i2, 1.0f);
    }
}
