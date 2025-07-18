package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class lwn {
    public final int a;
    public final int b;
    public final boolean c;
    public boolean d;
    public lwn e;

    public lwn(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public abstract lwo a(int i, float f, float f2, float f3);

    protected final float b(int i, float f, int i2, float f2) {
        boolean z = false;
        if (this.b <= i && i < i2) {
            z = true;
        }
        a.aD(z, "times must satisfy millis <= atMillis < endMillis");
        return f + (((f2 - f) * (i - r0)) / (i2 - r0));
    }

    public final lwn c(int i) {
        lwn lwnVar;
        int i2 = this.b;
        if (i < i2) {
            return null;
        }
        if (i2 == i || (this.c && ((lwnVar = this.e) == null || i < lwnVar.b))) {
            return this;
        }
        lwn lwnVar2 = this.e;
        if (lwnVar2 != null) {
            return lwnVar2.c(i);
        }
        return null;
    }

    protected final boolean d(int i) {
        return this.c && this.b < i && this.e != null;
    }
}
