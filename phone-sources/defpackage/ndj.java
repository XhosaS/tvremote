package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ndj {
    public float b;
    public float c;
    public float d;
    public boolean e;
    protected float f;
    protected float g;

    public ndj(float f) {
        g(f);
        this.e = true;
    }

    protected float a() {
        return this.b - this.c;
    }

    public void c(float f) {
        if (f != this.b) {
            this.b = f;
            this.e = false;
        }
    }

    protected void d(float f, float f2) {
        float f3 = this.d + (f * f2);
        this.d = f3;
        this.c += f3 * f2;
    }

    public final void e(float f) {
        this.c = f;
        this.b = f;
        this.d = 0.0f;
        this.e = true;
    }

    public final void f(long j) {
        if (this.e) {
            return;
        }
        d((this.f * a()) - (this.g * this.d), Math.min(j, 50L) / 1000.0f);
        float fAbs = Math.abs(a());
        float fAbs2 = Math.abs(this.d);
        boolean z = false;
        if (fAbs < 0.001f && fAbs2 < 0.001f) {
            z = true;
        }
        this.e = z;
        if (z) {
            this.c = this.b;
            this.d = 0.0f;
        }
    }

    protected final void g(float f) {
        this.f = f;
        this.g = (float) (Math.sqrt(f) * 1.7999999523162842d);
    }
}
