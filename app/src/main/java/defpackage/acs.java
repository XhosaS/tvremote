package defpackage;

import android.graphics.Insets;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acs {
    public static final acs a = new acs(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private acs(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public static acs b(acs acsVar, acs acsVar2) {
        return d(Math.max(acsVar.b, acsVar2.b), Math.max(acsVar.c, acsVar2.c), Math.max(acsVar.d, acsVar2.d), Math.max(acsVar.e, acsVar2.e));
    }

    public static acs c(acs acsVar, acs acsVar2) {
        int i = acsVar.e;
        int i2 = acsVar2.e;
        int i3 = acsVar.d;
        int i4 = acsVar2.d;
        return d(Math.min(acsVar.b, acsVar2.b), Math.min(acsVar.c, acsVar2.c), Math.min(i3, i4), Math.min(i, i2));
    }

    public static acs d(int i, int i2, int i3, int i4) {
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
        return new acs(i, i2, i3, i4);
    }

    public static acs e(Insets insets) {
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
        acs acsVar = (acs) obj;
        return this.e == acsVar.e && this.b == acsVar.b && this.d == acsVar.d && this.c == acsVar.c;
    }

    public final int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "Insets{left=" + this.b + ", top=" + this.c + ", right=" + this.d + ", bottom=" + this.e + '}';
    }
}
