package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ypx extends ypw implements ypd {
    private final Executor a;

    public ypx(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = ywn.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = ywn.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }

    private static final void i(yil yilVar, RejectedExecutionException rejectedExecutionException) {
        yoz.x(yilVar, ylh.aj("The task was rejected", rejectedExecutionException));
    }

    private static final ScheduledFuture j(ScheduledExecutorService scheduledExecutorService, Runnable runnable, yil yilVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            i(yilVar, e);
            return null;
        }
    }

    @Override // defpackage.yot
    public final void a(yil yilVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            i(yilVar, e);
            yot yotVar = ypk.a;
            yya.a.a(yilVar, runnable);
        }
    }

    @Override // defpackage.ypd
    public final void c(long j, yoe yoeVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureJ = scheduledExecutorService != null ? j(scheduledExecutorService, new gqz((yot) this, yoeVar, 8), ((yof) yoeVar).b, j) : null;
        if (scheduledFutureJ != null) {
            ((yof) yoeVar).w(new yoc(scheduledFutureJ, 1));
        } else {
            ypa.a.c(j, yoeVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.ypw
    public final Executor e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ypx) && ((ypx) obj).a == this.a;
    }

    @Override // defpackage.ypd
    public final ypm h(long j, Runnable runnable, yil yilVar) {
        Executor executor = this.a;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        ScheduledFuture scheduledFutureJ = scheduledExecutorService != null ? j(scheduledExecutorService, runnable, yilVar, j) : null;
        return scheduledFutureJ != null ? new ypl(scheduledFutureJ) : ypa.a.v(j, runnable);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.yot
    public final String toString() {
        return this.a.toString();
    }
}
