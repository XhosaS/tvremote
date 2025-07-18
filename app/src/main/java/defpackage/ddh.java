package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ddh implements ddp {
    public final boolean a;
    private final ddp b;
    private final ddg c;
    private final daj d;
    private int e;
    private boolean f;

    public ddh(ddp ddpVar, boolean z, daj dajVar, ddg ddgVar) {
        dqk.d(ddpVar, "Argument must not be null");
        this.b = ddpVar;
        this.a = z;
        this.d = dajVar;
        dqk.d(ddgVar, "Argument must not be null");
        this.c = ddgVar;
    }

    @Override // defpackage.ddp
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ddp
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.ddp
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.e++;
    }

    @Override // defpackage.ddp
    public final synchronized void e() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f = true;
        this.b.e();
    }

    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.e;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.e = i;
        }
        if (i == 0) {
            this.c.d(this.d, this);
        }
    }

    public final synchronized String toString() {
        ddp ddpVar;
        daj dajVar;
        ddpVar = this.b;
        dajVar = this.d;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.c.toString() + ", key=" + String.valueOf(dajVar) + ", acquired=" + this.e + ", isRecycled=" + this.f + ", resource=" + ddpVar.toString() + "}";
    }
}
