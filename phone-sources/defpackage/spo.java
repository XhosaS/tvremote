package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spo extends szg implements Cloneable {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f = -1.0f;

    public spo(float f, float f2, float f3) {
        this.b = f;
        this.a = f2;
        b(f3);
        this.e = 0.0f;
    }

    @Override // defpackage.szg
    public final void a(float f, float f2, float f3, taa taaVar) {
        float f4 = this.c;
        if (f4 == 0.0f) {
            taaVar.d(f, 0.0f);
            return;
        }
        float f5 = this.b;
        float f6 = ((f5 + f5) + f4) / 2.0f;
        float f7 = f3 * this.a;
        float f8 = f2 + this.e;
        float f9 = (this.d * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            taaVar.d(f, 0.0f);
            return;
        }
        float f10 = f8 + f6;
        float f11 = f8 - f6;
        float f12 = this.f;
        float f13 = f12 * f3;
        boolean z = f12 == -1.0f || Math.abs((f12 + f12) - f4) < 0.1f;
        float f14 = true != z ? 1.75f : 0.0f;
        float f15 = true != z ? 0.0f : f9;
        float f16 = f6 + f7;
        float f17 = f15 + f7;
        float fSqrt = (float) Math.sqrt((f16 * f16) - (f17 * f17));
        float f18 = f8 - fSqrt;
        float f19 = f8 + fSqrt;
        float degrees = (float) Math.toDegrees(Math.atan(fSqrt / f17));
        taaVar.d(f18, 0.0f);
        boolean z2 = z;
        float f20 = f7 + f7;
        taaVar.b(f18 - f7, 0.0f, f18 + f7, f20, 270.0f, degrees);
        float f21 = (90.0f - degrees) + f14;
        float f22 = 180.0f - f21;
        float f23 = (f21 + f21) - 180.0f;
        if (z2) {
            taaVar.b(f11, (-f6) - f15, f10, f6 - f15, f22, f23);
        } else {
            float f24 = this.b;
            float f25 = f13 + f13;
            float f26 = f13 + f24;
            taaVar.b(f11, -f26, f11 + f24 + f25, f26, f22, f23 / 2.0f);
            float f27 = this.b;
            taaVar.d(f10 - ((f27 / 2.0f) + f13), f27 + f13);
            float f28 = this.b;
            float f29 = f13 + f28;
            taaVar.b(f10 - (f25 + f28), -f29, f10, f29, 90.0f, f21 - 90.0f);
        }
        taaVar.b(f19 - f7, 0.0f, f19 + f7, f20, 270.0f - degrees, degrees);
        taaVar.d(f, 0.0f);
    }

    public final void b(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
        }
        this.d = f;
    }
}
