package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xtp implements Runnable {
    final Runnable a;
    public boolean b;
    public boolean c;

    public xtp(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b) {
            return;
        }
        this.c = true;
        this.a.run();
    }
}
