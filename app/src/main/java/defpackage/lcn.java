package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class lcn extends lcm {
    private boolean a;

    public lcn(lbk lbkVar) {
        super(lbkVar);
        this.y.q();
    }

    protected abstract boolean a();

    protected final void o() {
        if (!r()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void p() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (a()) {
            return;
        }
        this.y.z.incrementAndGet();
        this.a = true;
    }

    public final void q() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        i();
        this.y.z.incrementAndGet();
        this.a = true;
    }

    final boolean r() {
        return this.a;
    }

    protected void i() {
    }
}
