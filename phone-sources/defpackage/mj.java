package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mj {
    public final float a;
    public final float b;
    private final clx c;

    public mj(float f, clx clxVar) {
        this.a = f;
        this.c = clxVar;
        float fA = clxVar.a();
        float f2 = mk.a;
        this.b = fA * 386.0878f * 160.0f * 0.84f;
    }

    public final double a(float f) {
        int i = ky.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.b));
    }

    public final mi b(float f) {
        double dA = a(f);
        double d = mk.a;
        double d2 = (-1.0d) + d;
        return new mi(f, (float) (this.a * this.b * Math.exp((d / d2) * dA)), (long) (Math.exp(dA / d2) * 1000.0d));
    }
}
