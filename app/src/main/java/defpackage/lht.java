package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class lht extends lhp {
    private boolean a;

    public lht(lih lihVar) {
        super(lihVar);
        this.m.q++;
    }

    protected final void ag() {
        if (!ai()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void ah() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        b();
        this.m.r++;
        this.a = true;
    }

    final boolean ai() {
        return this.a;
    }

    protected abstract void b();
}
