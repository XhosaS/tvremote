package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpt extends brx {
    public final float a;
    public final float b;
    public final int c;
    public final int d;
    private final bnj e;

    public /* synthetic */ bpt(float f, float f2, int i, int i2, int i3) {
        this.a = 1 == (i3 & 1) ? 0.0f : f;
        this.b = (i3 & 2) != 0 ? 4.0f : f2;
        this.c = (i3 & 4) != 0 ? 0 : i;
        this.d = (i3 & 8) != 0 ? 0 : i2;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpt)) {
            return false;
        }
        bpt bptVar = (bpt) obj;
        if (this.a != bptVar.a || this.b != bptVar.b || !a.r(this.c, bptVar.c) || !a.r(this.d, bptVar.d)) {
            return false;
        }
        bnj bnjVar = bptVar.e;
        return yks.e(null, null);
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Stroke(width=");
        sb.append(this.a);
        sb.append(", miter=");
        sb.append(this.b);
        sb.append(", cap=");
        int i = this.c;
        String str = "Unknown";
        sb.append((Object) (a.r(i, 0) ? "Butt" : a.r(i, 1) ? "Round" : a.r(i, 2) ? "Square" : "Unknown"));
        sb.append(", join=");
        int i2 = this.d;
        if (a.r(i2, 0)) {
            str = "Miter";
        } else if (a.r(i2, 1)) {
            str = "Round";
        } else if (a.r(i2, 2)) {
            str = "Bevel";
        }
        sb.append((Object) str);
        sb.append(", pathEffect=null)");
        return sb.toString();
    }
}
