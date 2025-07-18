package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qeg extends ugz implements AutoCloseable, uht {
    public static final /* synthetic */ int b = 0;
    public final uht a;
    private final uhs c;

    public qeg(uhs uhsVar, uht uhtVar) {
        this.c = uhsVar;
        this.a = uhtVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uhr schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        uhq uhqVar = new uhq(runnable);
        return j <= 0 ? new qef(this.c.submit(runnable), System.nanoTime()) : new qee(uhqVar, this.a.schedule(new non((Object) this, (Object) uhqVar, 19, (byte[]) null), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final uhr schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new qef(this.c.submit(callable), System.nanoTime());
        }
        uhq uhqVar = new uhq(callable);
        return new qee(uhqVar, this.a.schedule(new non((Object) this, (Object) uhqVar, 20, (byte[]) null), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final uhr scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final uib uibVar = new uib(this);
        final uic uicVar = new uic();
        return new qee(uicVar, this.a.scheduleAtFixedRate(new Runnable() { // from class: qea
            @Override // java.lang.Runnable
            public final void run() {
                int i = qeg.b;
                final Runnable runnable2 = runnable;
                final uic uicVar2 = uicVar;
                uibVar.execute(new Runnable() { // from class: qeb
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = qeg.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            uicVar2.e(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // defpackage.ugz, defpackage.ugu, java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a.h(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final uhr scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        uic uicVar = new uic();
        qee qeeVar = new qee(uicVar, null);
        qeeVar.a = this.a.schedule(new qed(this, runnable, uicVar, qeeVar, j2, timeUnit), j, timeUnit);
        return qeeVar;
    }

    @Override // defpackage.ugz, defpackage.ugu, com.google.common.collect.ForwardingObject
    public final /* synthetic */ Object delegate() {
        return this.c;
    }

    @Override // defpackage.ugz
    /* renamed from: e */
    public final uhs delegate() {
        return this.c;
    }

    @Override // defpackage.ugz, defpackage.ugu
    /* renamed from: f */
    public final /* synthetic */ ExecutorService delegate() {
        return this.c;
    }
}
