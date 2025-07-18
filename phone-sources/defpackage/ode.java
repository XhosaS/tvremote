package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ode extends Thread {
    public ode(ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}
