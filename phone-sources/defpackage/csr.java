package defpackage;

import android.graphics.Insets;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class csr {
    public static final csr a = new csr(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private csr(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static csr b(csr csrVar, csr csrVar2) {
        return e(Math.max(csrVar.b, csrVar2.b), Math.max(csrVar.c, csrVar2.c), Math.max(csrVar.d, csrVar2.d), Math.max(csrVar.e, csrVar2.e));
    }

    public static csr c(csr csrVar, csr csrVar2) {
        int i = csrVar.e;
        int i2 = csrVar2.e;
        int i3 = csrVar.d;
        int i4 = csrVar2.d;
        return e(Math.min(csrVar.b, csrVar2.b), Math.min(csrVar.c, csrVar2.c), Math.min(i3, i4), Math.min(i, i2));
    }

    public static csr d(Rect rect) {
        return e(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static csr e(int i, int i2, int i3, int i4) {
        if (i == 0) {
            i = 0;
            if (i2 == 0) {
                if (i3 != 0) {
                    i2 = 0;
                } else {
                    if (i4 == 0) {
                        return a;
                    }
                    i2 = 0;
                    i3 = 0;
                }
            }
        }
        return new csr(i, i2, i3, i4);
    }

    public static csr f(Insets insets) {
        return e(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets a() {
        return Insets.of(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        csr csrVar = (csr) obj;
        return this.e == csrVar.e && this.b == csrVar.b && this.d == csrVar.d && this.c == csrVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
