package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ksw extends ksv {
    private boolean a;

    public ksw(lbk lbkVar) {
        super(lbkVar);
        this.y.q();
    }

    public final void a() {
        if (!e()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (f()) {
            return;
        }
        this.y.z.incrementAndGet();
        this.a = true;
    }

    public final void c() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        d();
        this.y.z.incrementAndGet();
        this.a = true;
    }

    final boolean e() {
        return this.a;
    }

    protected abstract boolean f();

    protected void d() {
    }
}
