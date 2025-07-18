package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class za implements yy {
    public final float a;
    public final float b;
    private final float c;
    private final float d;

    public za(float f, float f2, float f3, float f4) {
        this.c = f;
        this.a = f2;
        this.d = f3;
        this.b = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            zy.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.yy
    public final float a() {
        return this.b;
    }

    @Override // defpackage.yy
    public final float b(cmi cmiVar) {
        return cmiVar == cmi.a ? this.c : this.d;
    }

    @Override // defpackage.yy
    public final float c(cmi cmiVar) {
        return cmiVar == cmi.a ? this.d : this.c;
    }

    @Override // defpackage.yy
    public final float d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return cma.b(this.c, zaVar.c) && cma.b(this.a, zaVar.a) && cma.b(this.d, zaVar.d) && cma.b(this.b, zaVar.b);
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.c) * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.b);
    }

    public final String toString() {
        return "PaddingValues(start=" + ((Object) cma.a(this.c)) + ", top=" + ((Object) cma.a(this.a)) + ", end=" + ((Object) cma.a(this.d)) + ", bottom=" + ((Object) cma.a(this.b)) + ')';
    }
}
