package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class afow implements Runnable {
    private final affp a;

    protected afow(affp affpVar) {
        this.a = affpVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        affp affpVarA = this.a.a();
        try {
            a();
        } finally {
            this.a.f(affpVarA);
        }
    }
}
