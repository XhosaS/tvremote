package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mek extends zuw implements AutoCloseable, zyh {
    public final Handler a;

    public mek(Handler handler) {
        this.a = handler;
    }

    public static int e(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final zyf i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        mei meiVar = new mei(this, runnable, millis + SystemClock.elapsedRealtime(), timeUnit.toMillis(j2), z);
        this.a.postDelayed(meiVar, millis);
        j(meiVar, meiVar);
        return meiVar;
    }

    private final void j(zyd zydVar, final Runnable runnable) {
        zydVar.d(new Runnable() { // from class: meh
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.removeCallbacks(runnable);
            }
        }, zwk.a);
    }

    @Override // defpackage.zyh
    /* renamed from: a */
    public final zyf schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final zyf schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        mej mejVar = new mej(callable, SystemClock.elapsedRealtime() + millis);
        this.a.postDelayed(mejVar, millis);
        j(mejVar, mejVar);
        return mejVar;
    }

    @Override // defpackage.zyh
    /* renamed from: c */
    public final zyf scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // defpackage.zuw, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        if (this != ForkJoinPool.commonPool()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.zyh
    /* renamed from: d */
    public final zyf scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
