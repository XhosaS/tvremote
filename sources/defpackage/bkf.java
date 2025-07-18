package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkf extends xo {
    public bkf() {
        super(null);
    }

    @Override // defpackage.xo
    public final void e(bkr bkrVar, float f, float f2) {
        float f3 = f2 * f;
        bkrVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        bkn bknVar = new bkn(0.0f, 0.0f, f4, f4);
        bknVar.e = 180.0f;
        bknVar.f = 90.0f;
        bkrVar.f.add(bknVar);
        bkrVar.b(new bkl(bknVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        bkrVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        bkrVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
