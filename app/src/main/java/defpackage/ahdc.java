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
/* loaded from: classes2.dex */
public final class ahdc extends ahdb implements ahcd {
    private final Executor a;

    public ahdc(Executor executor) {
        Method method;
        this.a = executor;
        Method method2 = ahkv.a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = ahkv.a) == null) {
                return;
            }
            method.invoke(scheduledThreadPoolExecutor, true);
        } catch (Throwable unused) {
        }
    }

    private final ScheduledFuture h(ScheduledExecutorService scheduledExecutorService, Runnable runnable, agte agteVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            i(agteVar, e);
            return null;
        }
    }

    private final void i(agte agteVar, RejectedExecutionException rejectedExecutionException) {
        ahdp.c(agteVar, ahcz.a("The task was rejected", rejectedExecutionException));
    }

    @Override // defpackage.ahbm
    public final void a(agte agteVar, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            i(agteVar, e);
            ahbm ahbmVar = ahcl.a;
            ahbm ahbmVar2 = ahmy.a;
            ahmy.a.a(agteVar, runnable);
        }
    }

    @Override // defpackage.ahcd
    public final void c(long j, ahap ahapVar) {
        long j2;
        Executor executor = this.a;
        ScheduledFuture scheduledFutureH = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j2 = j;
            scheduledFutureH = h(scheduledExecutorService, new aheh(this, ahapVar), ((ahar) ahapVar).b, j2);
        } else {
            j2 = j;
        }
        if (scheduledFutureH != null) {
            ((ahar) ahapVar).B(new aham(scheduledFutureH));
        } else {
            ahbz.a.c(j2, ahapVar);
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

    @Override // defpackage.ahdb
    public final Executor e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ahdc) && ((ahdc) obj).a == this.a;
    }

    @Override // defpackage.ahcd
    public final ahcn g(long j, Runnable runnable, agte agteVar) {
        long j2;
        Runnable runnable2;
        Executor executor = this.a;
        ScheduledFuture scheduledFutureH = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j2 = j;
            runnable2 = runnable;
            scheduledFutureH = h(scheduledExecutorService, runnable2, agteVar, j2);
        } else {
            j2 = j;
            runnable2 = runnable;
        }
        return scheduledFutureH != null ? new ahcm(scheduledFutureH) : ahbz.a.r(j2, runnable2);
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // defpackage.ahbm
    public final String toString() {
        return this.a.toString();
    }
}
