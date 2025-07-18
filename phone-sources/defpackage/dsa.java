package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsa {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public dsa(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsa)) {
            return false;
        }
        dsa dsaVar = (dsa) obj;
        return cma.b(this.a, dsaVar.a) && cma.b(this.b, dsaVar.b) && cma.b(this.c, dsaVar.c) && cma.b(this.d, dsaVar.d) && cma.b(this.e, dsaVar.e) && cma.b(this.f, dsaVar.f);
    }

    public final int hashCode() {
        return (((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "PaddingInDp(left=" + ((Object) cma.a(this.a)) + ", start=" + ((Object) cma.a(this.b)) + ", top=" + ((Object) cma.a(this.c)) + ", right=" + ((Object) cma.a(this.d)) + ", end=" + ((Object) cma.a(this.e)) + ", bottom=" + ((Object) cma.a(this.f)) + ')';
    }
}
