package defpackage;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aajn implements ThreadFactory {
    private static final ThreadFactory c = Executors.defaultThreadFactory();
    public final int a;
    public final StrictMode.ThreadPolicy b;
    private final AtomicLong d = new AtomicLong();
    private final String e;

    public aajn(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.e = str;
        this.a = i;
        this.b = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        Thread threadNewThread = c.newThread(new Runnable() { // from class: aajm
            @Override // java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                aajn aajnVar = this.a;
                Process.setThreadPriority(aajnVar.a);
                StrictMode.ThreadPolicy threadPolicy = aajnVar.b;
                if (threadPolicy != null) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                runnable.run();
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.e, Long.valueOf(this.d.getAndIncrement())));
        return threadNewThread;
    }
}
