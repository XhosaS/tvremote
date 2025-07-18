package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aial implements Runnable {
    final /* synthetic */ Runnable a;

    public aial(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Thread.currentThread().setName("JavaCronetEngine");
        Process.setThreadPriority(0);
        this.a.run();
    }
}
