package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szf extends sin {
    final float a;

    public szf() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.sin
    public final void c(taa taaVar, float f, float f2) {
        float f3 = f2 * f;
        taaVar.f(0.0f, f3, 180.0f, 90.0f);
        double d = f3;
        taaVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
