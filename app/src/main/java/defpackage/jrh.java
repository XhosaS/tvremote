package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jrh {
    protected float a;
    public boolean b = true;
    public boolean c;
    protected float d;
    public float e;
    public float f;
    public float g;
    private final float h;
    private final float i;

    public jrh(float f, float f2) {
        h(f);
        this.c = true;
        this.h = f;
        this.i = f2;
    }

    protected float a() {
        return this.e - this.f;
    }

    public void b(float f) {
        throw null;
    }

    public void c(float f) {
        if (f != this.e) {
            this.e = f;
            this.c = false;
        }
    }

    protected void d(float f, float f2) {
        float f3 = this.g + (f * f2);
        this.g = f3;
        this.f += f3 * f2;
    }

    public final void e(float f) {
        this.f = f;
        this.e = f;
        this.g = 0.0f;
        this.c = true;
    }

    public final void f(boolean z) {
        if (z) {
            h(this.h);
        } else {
            h(this.i);
        }
    }

    public final void g(long j) {
        if (this.c) {
            return;
        }
        d((this.d * a()) - (this.a * this.g), Math.min(j, 50L) / 1000.0f);
        float fAbs = Math.abs(a());
        float fAbs2 = Math.abs(this.g);
        boolean z = false;
        if (fAbs < 0.001f && fAbs2 < 0.001f) {
            z = true;
        }
        this.c = z;
        if (z) {
            this.f = this.e;
            this.g = 0.0f;
        }
    }

    protected final void h(float f) {
        this.d = f;
        this.a = (float) (Math.sqrt(f) * 1.7999999523162842d);
    }
}
