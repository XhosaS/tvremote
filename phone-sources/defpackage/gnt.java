package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnt {
    public final gmx a;
    private final float b;

    public gnt(gmx gmxVar, float f) {
        this.a = gmxVar;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gnt gntVar = (gnt) obj;
        return yks.e(this.a, gntVar.a) && this.b == gntVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public gnt(Rect rect, float f) {
        this(new gmx(rect), f);
    }
}
