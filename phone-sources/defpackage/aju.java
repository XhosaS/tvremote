package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aju {
    public static final bds a = new ajv(1);
    public final clx b;
    public final cmi c;
    public final long d;
    public final float e;
    public final float f;
    public final esn g;

    public aju(clx clxVar, cmi cmiVar, esn esnVar, long j) {
        this.b = clxVar;
        this.c = cmiVar;
        this.g = esnVar;
        this.d = j;
        this.e = clxVar.a();
        this.f = clxVar.b();
    }

    public final String toString() {
        return "MeasureInputs(density=" + this.b + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.c + ", fontFamilyResolver=" + this.g + ", constraints=" + ((Object) clv.e(this.d)) + ')';
    }
}
