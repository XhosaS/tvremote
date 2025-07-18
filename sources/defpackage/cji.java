package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cji implements Runnable {
    final /* synthetic */ Runnable a;

    public cji(Runnable runnable) {
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
