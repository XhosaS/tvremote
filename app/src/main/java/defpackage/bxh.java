package defpackage;

import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxh {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new bxh(0, 0, 0, 0);
    }

    public bxh(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            throw new IllegalArgumentException("Left must be less than or equal to right, left: " + i + ", right: " + i3);
        }
        if (i2 <= i4) {
            return;
        }
        throw new IllegalArgumentException("top must be less than or equal to bottom, top: " + i2 + ", bottom: " + i4);
    }

    public final Rect a() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!agvy.c(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        bxh bxhVar = (bxh) obj;
        return this.a == bxhVar.a && this.b == bxhVar.b && this.c == bxhVar.c && this.d == bxhVar.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "bxh { [" + this.a + ',' + this.b + ',' + this.c + ',' + this.d + "] }";
    }

    public bxh(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
}
