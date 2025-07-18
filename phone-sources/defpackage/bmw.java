package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmw {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final void b(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean c() {
        return (this.a >= this.c) | (this.b >= this.d);
    }

    public final String toString() {
        return "MutableRect(" + d.y(this.a) + ", " + d.y(this.b) + ", " + d.y(this.c) + ", " + d.y(this.d) + ')';
    }
}
