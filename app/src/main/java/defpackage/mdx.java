package defpackage;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mdx implements Runnable {
    public static final /* synthetic */ int a = 0;
    private static final yrp b = yru.a(new yrp() { // from class: mdw
        @Override // defpackage.yrp
        public final Object eV() {
            int i = mdx.a;
            return zdy.h("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable");
        }
    });
    private static final Logger c = Logger.getLogger("ErrorLoggingExecutor");
    private final Runnable d;
    private final agow e;

    public mdx(Runnable runnable, agow agowVar) {
        this.d = runnable;
        this.e = agowVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.d.run();
        } catch (Throwable th) {
            if (((Boolean) ((yqt) this.e.a()).e(false)).booleanValue()) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                return;
            }
            try {
                ((zdv) ((zdv) ((zdv) ((zdy) b.eV()).c()).p(th)).q("com/google/android/libraries/concurrent/ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", 95, "ExceptionHandlingExecutorFactory.java")).u("Uncaught exception from runnable");
            } catch (Throwable th2) {
                Logger logger = c;
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "GoogleLogger failed to log", th2);
                Log.e("ErrorLoggingExecutor", "GoogleLogger failed to log", th2);
                logger.logp(Level.SEVERE, "com.google.android.libraries.concurrent.ExceptionHandlingExecutorFactory$ExceptionHandlingOrLoggingRunnable", "run", "Uncaught exception from runnable", th);
                Log.e("ErrorLoggingExecutor", "Uncaught exception from runnable", th);
            }
        }
    }

    public final String toString() {
        return this.d.toString();
    }
}
