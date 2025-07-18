package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mff implements Runnable, mfb {
    private final Runnable a;
    private volatile boolean b;

    public mff(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.mfb
    public final synchronized void a() {
        this.b = true;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (this.b) {
            return;
        }
        this.a.run();
    }
}
