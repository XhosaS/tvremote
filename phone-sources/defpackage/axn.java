package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axn {
    private final bmy a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;

    public axn(bmy bmyVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = bmyVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axn)) {
            return false;
        }
        axn axnVar = (axn) obj;
        return yks.e(this.a, axnVar.a) && this.b == axnVar.b && this.c == axnVar.c && this.d == axnVar.d && this.e == axnVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.e;
        boolean z2 = this.d;
        return ((((((iHashCode + a.q(this.b)) * 31) + a.q(this.c)) * 31) + a.q(z2)) * 31) + a.q(z);
    }

    public final String toString() {
        return "HingeInfo(bounds=" + this.a + ", isFlat=" + this.b + ", isVertical=" + this.c + ", isSeparating=" + this.d + ", isOccluding=" + this.e + ')';
    }
}
