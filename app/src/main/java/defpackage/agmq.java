package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmq extends agfx {
    static final agfx b;
    final Executor c;

    static {
        agfx agfxVar = agoq.a;
        aggz aggzVar = agoh.h;
        b = agfxVar;
    }

    public agmq(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.agfx
    public final agfw a() {
        return new agmp(this.c);
    }

    @Override // defpackage.agfx
    public final aggi b(Runnable runnable) {
        Runnable runnableD = agoh.d(runnable);
        try {
            Executor executor = this.c;
            if (executor instanceof ExecutorService) {
                agnc agncVar = new agnc(runnableD);
                agncVar.a(((ExecutorService) executor).submit(agncVar));
                return agncVar;
            }
            agmn agmnVar = new agmn(runnableD);
            executor.execute(agmnVar);
            return agmnVar;
        } catch (RejectedExecutionException e) {
            agoh.e(e);
            return aghe.INSTANCE;
        }
    }

    @Override // defpackage.agfx
    public final aggi c(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableD = agoh.d(runnable);
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            agmm agmmVar = new agmm(runnableD);
            aghd.g(agmmVar.a, b.c(new agml(this, agmmVar), j, timeUnit));
            return agmmVar;
        }
        try {
            agnc agncVar = new agnc(runnableD);
            agncVar.a(((ScheduledExecutorService) executor).schedule(agncVar, j, timeUnit));
            return agncVar;
        } catch (RejectedExecutionException e) {
            agoh.e(e);
            return aghe.INSTANCE;
        }
    }

    @Override // defpackage.agfx
    public final aggi d(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Executor executor = this.c;
        if (!(executor instanceof ScheduledExecutorService)) {
            return super.d(runnable, j, j2, timeUnit);
        }
        try {
            agnb agnbVar = new agnb(agoh.d(runnable));
            agnbVar.a(((ScheduledExecutorService) executor).scheduleAtFixedRate(agnbVar, j, j2, timeUnit));
            return agnbVar;
        } catch (RejectedExecutionException e) {
            agoh.e(e);
            return aghe.INSTANCE;
        }
    }
}
