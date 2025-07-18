package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aggk extends aggj {
    private static final long serialVersionUID = -8219729196779211169L;

    public aggk(Runnable runnable) {
        super(runnable);
    }

    @Override // defpackage.aggj
    protected final /* synthetic */ void a(Object obj) {
        ((Runnable) obj).run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return "RunnableDisposable(disposed=" + f() + ", " + String.valueOf(get()) + ")";
    }
}
