package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final cft g;

    public cgj(cft cftVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.g = cftVar;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = f2;
    }

    public final float a(float f) {
        return f + this.e;
    }

    public final int b() {
        return this.b - this.a;
    }

    public final int c(int i) {
        return i + this.a;
    }

    public final int d(int i) {
        return i + this.c;
    }

    public final int e(int i) {
        int i2 = this.a;
        return ykn.l(i, i2, this.b) - i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgj)) {
            return false;
        }
        cgj cgjVar = (cgj) obj;
        return yks.e(this.g, cgjVar.g) && this.a == cgjVar.a && this.b == cgjVar.b && this.c == cgjVar.c && this.d == cgjVar.d && Float.compare(this.e, cgjVar.e) == 0 && Float.compare(this.f, cgjVar.f) == 0;
    }

    public final int f(int i) {
        return i - this.c;
    }

    public final long g(long j, boolean z) {
        if (z) {
            long j2 = chb.a;
            if (a.s(j, j2)) {
                return j2;
            }
        }
        return ccf.N(c(chb.e(j)), c(chb.a(j)));
    }

    public final bmy h(bmy bmyVar) {
        return bmyVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(this.e) & 4294967295L));
    }

    public final int hashCode() {
        return (((((((((((this.g.hashCode() * 31) + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final bmy i(bmy bmyVar) {
        return bmyVar.i((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(-this.e) & 4294967295L));
    }

    public final String toString() {
        return "ParagraphInfo(paragraph=" + this.g + ", startIndex=" + this.a + ", endIndex=" + this.b + ", startLineIndex=" + this.c + ", endLineIndex=" + this.d + ", top=" + this.e + ", bottom=" + this.f + ')';
    }
}
