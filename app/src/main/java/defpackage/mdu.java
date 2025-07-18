package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mdu extends zxd implements AutoCloseable, zyh {
    public static final /* synthetic */ int b = 0;
    public final zyh a;
    private final zyg c;

    public mdu(zyg zygVar, zyh zyhVar) {
        this.c = zygVar;
        this.a = zyhVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final zyf schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        final zye zyeVar = new zye(runnable);
        return j <= 0 ? new mdt(this.c.submit(runnable), System.nanoTime()) : new mds(zyeVar, this.a.schedule(new Runnable() { // from class: mdm
            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(zyeVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final zyf schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new mdt(this.c.submit(callable), System.nanoTime());
        }
        final zye zyeVar = new zye(callable);
        return new mds(zyeVar, this.a.schedule(new Runnable() { // from class: mdo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.execute(zyeVar);
            }
        }, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final zyf scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final zyt zytVar = new zyt(this);
        final zyu zyuVar = new zyu();
        return new mds(zyuVar, this.a.scheduleAtFixedRate(new Runnable() { // from class: mdn
            @Override // java.lang.Runnable
            public final void run() {
                int i = mdu.b;
                final Runnable runnable2 = runnable;
                final zyu zyuVar2 = zyuVar;
                zytVar.execute(new Runnable() { // from class: mdl
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = mdu.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            zyuVar2.q(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // defpackage.zxd, defpackage.zwy, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        boolean zAwaitTermination = false;
        boolean z = false;
        while (!zAwaitTermination) {
            try {
                zAwaitTermination = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    shutdownNow();
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final zyf scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zyu zyuVar = new zyu();
        mds mdsVar = new mds(zyuVar, null);
        mdsVar.a = this.a.schedule(new mdq(this, runnable, zyuVar, mdsVar, j2, timeUnit), j, timeUnit);
        return mdsVar;
    }

    @Override // defpackage.zxd
    public final zyg e() {
        return this.c;
    }

    @Override // defpackage.zwy, defpackage.yxq
    public final /* synthetic */ Object f() {
        return this.c;
    }

    @Override // defpackage.zxd, defpackage.zwy
    public final /* synthetic */ ExecutorService g() {
        return this.c;
    }
}
