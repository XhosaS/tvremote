package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class agng extends agfw {
    final ScheduledExecutorService a;
    final aggh b = new aggh();
    volatile boolean c;

    public agng(ScheduledExecutorService scheduledExecutorService) {
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (this.c) {
            return aghe.INSTANCE;
        }
        Runnable runnableD = agoh.d(runnable);
        aggh agghVar = this.b;
        agnd agndVar = new agnd(runnableD, agghVar);
        agghVar.a(agndVar);
        try {
            agndVar.a(j <= 0 ? this.a.submit((Callable) agndVar) : this.a.schedule((Callable) agndVar, j, timeUnit));
            return agndVar;
        } catch (RejectedExecutionException e) {
            dispose();
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
        this.b.dispose();
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }
}
