package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class vbu extends vbj {
    @Override // defpackage.vbj
    public final void a(vcg vcgVar, float f, float f2) {
        float f3 = f2 * f;
        vcgVar.f(f3, 180.0f, 90.0f);
        float f4 = f3 + f3;
        vcc vccVar = new vcc(0.0f, 0.0f, f4, f4);
        vccVar.e = 180.0f;
        vccVar.f = 90.0f;
        vcgVar.f.add(vccVar);
        vcgVar.b(new vca(vccVar), 180.0f, 270.0f);
        float f5 = f4 + 0.0f;
        float f6 = f5 / 2.0f;
        float f7 = f5 * 0.5f;
        vcgVar.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f7;
        vcgVar.c = f7 + (f6 * ((float) Math.sin(Math.toRadians(270.0d))));
    }
}
