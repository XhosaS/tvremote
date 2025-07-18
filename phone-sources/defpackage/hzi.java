package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hzi {
    public final float a;
    public final float b;
    public float c;
    public float d;

    public hzi(float f, float f2, float f3, float f4) {
        this.c = 0.0f;
        this.d = 0.0f;
        this.a = f;
        this.b = f2;
        double dSqrt = Math.sqrt((f3 * f3) + (f4 * f4));
        if (dSqrt != 0.0d) {
            this.c = (float) (f3 / dSqrt);
            this.d = (float) (f4 / dSqrt);
        }
    }

    public final void a(hzi hziVar) {
        this.c += hziVar.c;
        this.d += hziVar.d;
    }

    public final void b(float f, float f2) {
        float f3 = f2 - this.b;
        float f4 = f - this.a;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.c += (float) (f4 / dSqrt);
            this.d += (float) (f3 / dSqrt);
        }
    }

    public final String toString() {
        return "(" + this.a + "," + this.b + " " + this.c + "," + this.d + ")";
    }
}
