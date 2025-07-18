package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zyn {
    public static zyg a(ExecutorService executorService) {
        return executorService instanceof zyg ? (zyg) executorService : executorService instanceof ScheduledExecutorService ? new zym((ScheduledExecutorService) executorService) : new zyj(executorService);
    }

    public static zyh b(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof zyh ? (zyh) scheduledExecutorService : new zym(scheduledExecutorService);
    }

    static Executor c(final Executor executor, final zum zumVar) {
        executor.getClass();
        return executor == zwk.a ? executor : new Executor() { // from class: zyi
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                zyn.d(executor, zumVar, runnable);
            }
        };
    }

    static /* synthetic */ void d(Executor executor, zum zumVar, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            zumVar.q(e);
        }
    }
}
