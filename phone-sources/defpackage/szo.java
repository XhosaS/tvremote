package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class szo extends sin {
    final float a;

    public szo() {
        super(null);
        this.a = -1.0f;
    }

    @Override // defpackage.sin
    public final void c(taa taaVar, float f, float f2) {
        float f3 = f2 * f;
        taaVar.f(0.0f, f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        taaVar.b(0.0f, 0.0f, f4, f4, 180.0f, 90.0f);
    }
}
