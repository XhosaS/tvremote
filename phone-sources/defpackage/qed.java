package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qed implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ uic c;
    final /* synthetic */ qee d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ qeg g;

    public qed(qeg qegVar, Runnable runnable, uic uicVar, qee qeeVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = uicVar;
        this.d = qeeVar;
        this.e = j;
        this.f = timeUnit;
        this.g = qegVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final uic uicVar = this.c;
        final qee qeeVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: qec
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                qed qedVar = this.a;
                Runnable runnable2 = runnable;
                uic uicVar2 = uicVar;
                qee qeeVar2 = qeeVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (uicVar2.isDone()) {
                        return;
                    }
                    uhr uhrVarSchedule = qedVar.g.a.schedule(qedVar.a, j2, timeUnit2);
                    qeeVar2.a = uhrVarSchedule;
                    if (qeeVar2.isDone()) {
                        uhrVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    uicVar2.e(th);
                }
            }
        });
    }
}
