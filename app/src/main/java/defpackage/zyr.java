package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class zyr implements Runnable {
    final /* synthetic */ Runnable a;

    public zyr(Runnable runnable) {
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
