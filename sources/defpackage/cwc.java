package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwc implements Runnable {
    public long a;
    public boolean b;
    public final Runnable c;

    public cwc(long j) {
        this.a = j;
        this.b = false;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    public final String toString() {
        Runnable runnable = this.c;
        String strAw = dnx.aw(runnable);
        String strAx = dnx.ax(runnable);
        long j = this.a;
        String str = cwd.a;
        return "Task[" + strAw + "@" + strAx + ", " + j + ", Non-blocking]";
    }

    public cwc() {
        this(0L);
    }

    public cwc(Runnable runnable, long j) {
        this(j);
        this.c = runnable;
    }
}
