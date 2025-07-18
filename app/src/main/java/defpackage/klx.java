package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
class klx implements Runnable {
    private final Runnable a;

    public klx(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(0);
        this.a.run();
    }
}
