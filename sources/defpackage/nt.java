package defpackage;

import android.graphics.Insets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nt {
    public static final nt a = new nt(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private nt(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static nt b(nt ntVar, nt ntVar2) {
        return d(Math.max(ntVar.b, ntVar2.b), Math.max(ntVar.c, ntVar2.c), Math.max(ntVar.d, ntVar2.d), Math.max(ntVar.e, ntVar2.e));
    }

    public static nt c(nt ntVar, nt ntVar2) {
        int i = ntVar.e;
        int i2 = ntVar2.e;
        int i3 = ntVar.d;
        int i4 = ntVar2.d;
        return d(Math.min(ntVar.b, ntVar2.b), Math.min(ntVar.c, ntVar2.c), Math.min(i3, i4), Math.min(i, i2));
    }

    public static nt d(int i, int i2, int i3, int i4) {
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
        return new nt(i, i2, i3, i4);
    }

    public static nt e(Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
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
        nt ntVar = (nt) obj;
        return this.e == ntVar.e && this.b == ntVar.b && this.d == ntVar.d && this.c == ntVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
