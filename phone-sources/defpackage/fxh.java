package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxh {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public fxh(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, int i3, int i4, int i5) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = z3;
        this.e = z4;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof fxh)) {
            fxh fxhVar = (fxh) obj;
            if (this.a == fxhVar.a && this.b == fxhVar.b && this.c == fxhVar.c && yks.e(null, null) && yks.e(null, null) && yks.e(null, null) && this.d == fxhVar.d && this.e == fxhVar.e && this.f == fxhVar.f && this.g == fxhVar.g && this.h == fxhVar.h && this.i == fxhVar.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 923521) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        if (this.a) {
            sb.append("launchSingleTop ");
        }
        if (this.b) {
            sb.append("restoreState ");
        }
        int i = this.f;
        if (i != -1 || this.g != -1 || this.h != -1 || this.i != -1) {
            sb.append("anim(enterAnim=0x");
            sb.append(Integer.toHexString(i));
            sb.append(" exitAnim=0x");
            sb.append(Integer.toHexString(this.g));
            sb.append(" popEnterAnim=0x");
            sb.append(Integer.toHexString(this.h));
            sb.append(" popExitAnim=0x");
            sb.append(Integer.toHexString(this.i));
            sb.append(")");
        }
        return sb.toString();
    }
}
