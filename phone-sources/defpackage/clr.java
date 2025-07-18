package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clr {
    public static final clr a = new clr(2, false);
    private static final clr d = new clr(1, true);
    public final int b;
    public final boolean c;

    public clr(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clr)) {
            return false;
        }
        clr clrVar = (clr) obj;
        return a.r(this.b, clrVar.b) && this.c == clrVar.c;
    }

    public final int hashCode() {
        return (this.b * 31) + a.q(this.c);
    }

    public final String toString() {
        return yks.e(this, a) ? "TextMotion.Static" : yks.e(this, d) ? "TextMotion.Animated" : "Invalid";
    }
}
