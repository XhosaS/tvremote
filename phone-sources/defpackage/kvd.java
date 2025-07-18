package defpackage;

import android.graphics.drawable.GradientDrawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kvd {
    public final int a;
    public final int b;
    public final GradientDrawable.Orientation c;

    public kvd() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvd) {
            kvd kvdVar = (kvd) obj;
            if (this.a == kvdVar.a && this.b == kvdVar.b && this.c.equals(kvdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ModuleBackground{startColor=" + this.a + ", endColor=" + this.b + ", gradientOrientation=" + this.c.toString() + "}";
    }

    public kvd(int i, int i2, GradientDrawable.Orientation orientation) {
        this.a = i;
        this.b = i2;
        if (orientation == null) {
            throw new NullPointerException("Null gradientOrientation");
        }
        this.c = orientation;
    }
}
