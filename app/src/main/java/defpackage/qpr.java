package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qpr implements ThreadFactory {
    public final int a;
    private final AtomicInteger b = new AtomicInteger(1);
    private final String c = "Primes";

    public qpr(int i) {
        this.a = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable() { // from class: qpq
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                int i = this.a.a;
                if (i != 0) {
                    Process.setThreadPriority(i);
                }
                runnable.run();
            }
        }, this.c + "-" + this.b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
