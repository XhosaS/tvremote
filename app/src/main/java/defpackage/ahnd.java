package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahnd extends ahnc {
    public final Runnable a;

    public ahnd(Runnable runnable, long j, boolean z) {
        super(j, z);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Runnable runnable = this.a;
        String simpleName = runnable.getClass().getSimpleName();
        String hexString = Integer.toHexString(System.identityHashCode(runnable));
        long j = this.g;
        boolean z = this.h;
        String str = ahne.a;
        return "Task[" + simpleName + "@" + hexString + ", " + j + ", " + (true != z ? "Non-blocking" : "Blocking") + "]";
    }
}
