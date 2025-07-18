package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class byr {
    public final bxh a;
    private final float b;

    public byr(bxh bxhVar, float f) {
        this.a = bxhVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!agvy.c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        byr byrVar = (byr) obj;
        return agvy.c(this.a, byrVar.a) && this.b == byrVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public byr(Rect rect, float f) {
        this(new bxh(rect), f);
    }
}
