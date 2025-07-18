package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uhz implements Runnable {
    final /* synthetic */ Runnable a;

    public uhz(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        return this.a.toString();
    }
}
