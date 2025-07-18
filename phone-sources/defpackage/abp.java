package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abp {
    public boolean a;
    public Object b;
    public final adh c;
    private final bdn d;
    private final bdn e;

    public abp() {
        this(0, 0);
    }

    public final int a() {
        return this.d.e();
    }

    public final int b() {
        return this.e.e();
    }

    public final void c(int i) {
        this.d.h(i);
    }

    public final void d(int i) {
        this.e.h(i);
    }

    public final void e(int i, int i2) {
        if (i < 0.0f) {
            wv.c("Index should be non-negative");
        }
        c(i);
        this.c.c(i);
        d(i2);
    }

    public abp(int i, int i2) {
        this.d = new bcf(i);
        this.e = new bcf(i2);
        this.c = new adh(i, 90, 200);
    }
}
