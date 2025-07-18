package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnp implements hnv {
    public final boolean a;
    private final hnv b;
    private final hlg c;
    private int d;
    private boolean e;
    private final moz f;

    public hnp(hnv hnvVar, boolean z, hlg hlgVar, moz mozVar) {
        hju.p(hnvVar);
        this.b = hnvVar;
        this.a = z;
        this.c = hlgVar;
        hju.p(mozVar);
        this.f = mozVar;
    }

    @Override // defpackage.hnv
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.hnv
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.hnv
    public final Object c() {
        return this.b.c();
    }

    public final synchronized void d() {
        if (this.e) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.d++;
    }

    @Override // defpackage.hnv
    public final synchronized void e() {
        if (this.d > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.e) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.e = true;
        this.b.e();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [how, java.lang.Object] */
    public final void f() {
        int i;
        synchronized (this) {
            int i2 = this.d;
            if (i2 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            i = i2 - 1;
            this.d = i;
        }
        if (i == 0) {
            moz mozVar = this.f;
            hlg hlgVar = this.c;
            ((hmr) mozVar.b).d(hlgVar);
            if (this.a) {
                mozVar.h.d(hlgVar, this);
            } else {
                ((rin) mozVar.g).h(this, false);
            }
        }
    }

    public final synchronized String toString() {
        hnv hnvVar;
        hlg hlgVar;
        hnvVar = this.b;
        hlgVar = this.c;
        return "EngineResource{isMemoryCacheable=" + this.a + ", listener=" + this.f.toString() + ", key=" + String.valueOf(hlgVar) + ", acquired=" + this.d + ", isRecycled=" + this.e + ", resource=" + hnvVar.toString() + "}";
    }
}
