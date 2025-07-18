package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agmy extends agfw implements aggi {
    public final ScheduledExecutorService b;
    public volatile boolean c;

    public agmy(ThreadFactory threadFactory) {
        this.b = agnf.a(threadFactory);
    }

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.c ? aghe.INSTANCE : g(runnable, j, timeUnit, null);
    }

    public final aggi d(Runnable runnable, long j, TimeUnit timeUnit) {
        agnc agncVar = new agnc(agoh.d(runnable));
        try {
            agncVar.a(j <= 0 ? this.b.submit(agncVar) : this.b.schedule(agncVar, j, timeUnit));
            return agncVar;
        } catch (RejectedExecutionException e) {
            agoh.e(e);
            return aghe.INSTANCE;
        }
    }

    @Override // defpackage.aggi
    public final void dispose() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.shutdownNow();
    }

    public final aggi e(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        Runnable runnableD = agoh.d(runnable);
        if (j2 > 0) {
            agnb agnbVar = new agnb(runnableD);
            try {
                agnbVar.a(this.b.scheduleAtFixedRate(agnbVar, j, j2, timeUnit));
                return agnbVar;
            } catch (RejectedExecutionException e) {
                agoh.e(e);
                return aghe.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.b;
        agms agmsVar = new agms(runnableD, scheduledExecutorService);
        try {
            agmsVar.a(j <= 0 ? scheduledExecutorService.submit(agmsVar) : scheduledExecutorService.schedule(agmsVar, j, timeUnit));
            return agmsVar;
        } catch (RejectedExecutionException e2) {
            agoh.e(e2);
            return aghe.INSTANCE;
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    public final agnd g(Runnable runnable, long j, TimeUnit timeUnit, aghb aghbVar) {
        agnd agndVar = new agnd(agoh.d(runnable), aghbVar);
        if (aghbVar != null && !aghbVar.a(agndVar)) {
            return agndVar;
        }
        try {
            agndVar.a(j <= 0 ? this.b.submit((Callable) agndVar) : this.b.schedule((Callable) agndVar, j, timeUnit));
            return agndVar;
        } catch (RejectedExecutionException e) {
            if (aghbVar != null) {
                aghbVar.c(agndVar);
            }
            agoh.e(e);
            return agndVar;
        }
    }
}
