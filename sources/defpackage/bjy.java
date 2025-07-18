package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjy extends xo {
    public bjy() {
        super(null);
    }

    @Override // defpackage.xo
    public final void e(bkr bkrVar, float f, float f2) {
        float f3 = f2 * f;
        bkrVar.f(f3, 180.0f, 90.0f);
        double d = f3;
        bkrVar.d((float) (Math.sin(Math.toRadians(90.0d)) * d), (float) (Math.sin(Math.toRadians(0.0d)) * d));
    }
}
