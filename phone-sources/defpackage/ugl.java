package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugl extends ufk {
    private final kww c = new kww();
    private int a = 0;
    private boolean b = false;

    private final void a() {
        kww kwwVar = this.c;
        synchronized (kwwVar) {
            int i = this.a - 1;
            this.a = i;
            if (i == 0) {
                kwwVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        kww kwwVar = this.c;
        long nanos = timeUnit.toNanos(j);
        synchronized (kwwVar) {
            while (true) {
                if (this.b && this.a == 0) {
                    return true;
                }
                if (nanos <= 0) {
                    return false;
                }
                long jNanoTime = System.nanoTime();
                TimeUnit.NANOSECONDS.timedWait(kwwVar, nanos);
                nanos -= System.nanoTime() - jNanoTime;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.c) {
            if (this.b) {
                throw new RejectedExecutionException("Executor already shutdown");
            }
            this.a++;
        }
        try {
            runnable.run();
        } finally {
            a();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        boolean z;
        synchronized (this.c) {
            z = this.b;
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        boolean z;
        synchronized (this.c) {
            z = false;
            if (this.b && this.a == 0) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        kww kwwVar = this.c;
        synchronized (kwwVar) {
            this.b = true;
            if (this.a == 0) {
                kwwVar.notifyAll();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        shutdown();
        return ImmutableList.of();
    }
}
