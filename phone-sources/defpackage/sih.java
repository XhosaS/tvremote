package defpackage;

import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sih extends ThreadPoolExecutor implements AutoCloseable {
    public sih(int i, int i2, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(i, i2, 60L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone()) {
                try {
                    sfy.J(future);
                } catch (CancellationException unused) {
                    th = null;
                } catch (ExecutionException e) {
                    th = e.getCause();
                }
            }
        }
        if (th != null) {
            Log.e("PopulousExecutor", "Uncaught exception during Runnable execution.", th);
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }
}
