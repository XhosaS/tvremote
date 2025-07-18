package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agmp extends agfw implements Runnable {
    final Executor a;
    volatile boolean c;
    final AtomicInteger d = new AtomicInteger();
    final aggh e = new aggh();
    final agmc b = new agmc();

    public agmp(Executor executor) {
        this.a = executor;
    }

    @Override // defpackage.agfw
    public final aggi b(Runnable runnable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return d(runnable);
        }
        if (this.c) {
            return aghe.INSTANCE;
        }
        aghg aghgVar = new aghg();
        aghg aghgVar2 = new aghg(aghgVar);
        agmo agmoVar = new agmo(this, aghgVar2, agoh.d(runnable));
        aggh agghVar = this.e;
        agnd agndVar = new agnd(agmoVar, agghVar);
        agghVar.a(agndVar);
        Executor executor = this.a;
        if (executor instanceof ScheduledExecutorService) {
            try {
                agndVar.a(((ScheduledExecutorService) executor).schedule((Callable) agndVar, j, timeUnit));
            } catch (RejectedExecutionException e) {
                this.c = true;
                agoh.e(e);
                return aghe.INSTANCE;
            }
        } else {
            agndVar.a(new agmk(agmq.b.c(agndVar, j, timeUnit)));
        }
        aghd.g(aghgVar, agndVar);
        return aghgVar2;
    }

    public final aggi d(Runnable runnable) {
        if (this.c) {
            return aghe.INSTANCE;
        }
        agmn agmnVar = new agmn(agoh.d(runnable));
        this.b.h(agmnVar);
        if (this.d.getAndIncrement() != 0) {
            return agmnVar;
        }
        try {
            this.a.execute(this);
            return agmnVar;
        } catch (RejectedExecutionException e) {
            this.c = true;
            this.b.b();
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
        this.e.dispose();
        if (this.d.getAndIncrement() == 0) {
            this.b.b();
        }
    }

    @Override // defpackage.aggi
    public final boolean f() {
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iAddAndGet = 1;
        do {
            agmc agmcVar = this.b;
            if (this.c) {
                agmcVar.b();
                return;
            }
            do {
                Runnable runnable = (Runnable) agmcVar.ff();
                if (runnable != null) {
                    runnable.run();
                } else {
                    if (this.c) {
                        agmcVar.b();
                        return;
                    }
                    iAddAndGet = this.d.addAndGet(-iAddAndGet);
                }
            } while (!this.c);
            agmcVar.b();
            return;
        } while (iAddAndGet != 0);
    }
}
