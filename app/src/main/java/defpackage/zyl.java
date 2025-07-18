package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zyl extends zul implements Runnable {
    private final Runnable a;

    public zyl(Runnable runnable) {
        runnable.getClass();
        this.a = runnable;
    }

    @Override // defpackage.zum
    protected final String a() {
        return "task=[" + this.a.toString() + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } catch (Throwable th) {
            q(th);
            throw th;
        }
    }
}
