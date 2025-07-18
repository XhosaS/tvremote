package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akf {
    public static final akf a = new akf(false, 9205357640488583168L, 0.0f, 1, false);
    public final boolean b;
    public final long c;
    public final float d;
    public final boolean e;
    public final int f;

    public akf(boolean z, long j, float f, int i, boolean z2) {
        this.b = z;
        this.c = j;
        this.d = f;
        this.f = i;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akf)) {
            return false;
        }
        akf akfVar = (akf) obj;
        return this.b == akfVar.b && a.s(this.c, akfVar.c) && Float.compare(this.d, akfVar.d) == 0 && this.f == akfVar.f && this.e == akfVar.e;
    }

    public final int hashCode() {
        int iQ = (((a.q(this.b) * 31) + a.k(this.c)) * 31) + Float.floatToIntBits(this.d);
        int i = this.f;
        a.bw(i);
        return (((iQ * 31) + i) * 31) + a.q(this.e);
    }

    public final String toString() {
        return "TextFieldHandleState(visible=" + this.b + ", position=" + ((Object) bmx.d(this.c)) + ", lineHeight=" + this.d + ", direction=" + ((Object) cko.k(this.f)) + ", handlesCrossed=" + this.e + ')';
    }
}
