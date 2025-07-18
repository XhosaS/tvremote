package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szh extends szg {
    private final float a;

    public szh(float f) {
        this.a = f - 0.001f;
    }

    @Override // defpackage.szg
    public final void a(float f, float f2, float f3, taa taaVar) {
        double d = this.a;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        taaVar.e(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
        taaVar.d(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        taaVar.d(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }

    @Override // defpackage.szg
    public final boolean c() {
        return true;
    }
}
