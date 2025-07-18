package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
class mdq implements Runnable {
    final Runnable a = this;
    final /* synthetic */ Runnable b;
    final /* synthetic */ zyu c;
    final /* synthetic */ mds d;
    final /* synthetic */ long e;
    final /* synthetic */ TimeUnit f;
    final /* synthetic */ mdu g;

    public mdq(mdu mduVar, Runnable runnable, zyu zyuVar, mds mdsVar, long j, TimeUnit timeUnit) {
        this.b = runnable;
        this.c = zyuVar;
        this.d = mdsVar;
        this.e = j;
        this.f = timeUnit;
        this.g = mduVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final Runnable runnable = this.b;
        final zyu zyuVar = this.c;
        final mds mdsVar = this.d;
        final long j = this.e;
        final TimeUnit timeUnit = this.f;
        this.g.execute(new Runnable() { // from class: mdp
            @Override // java.lang.Runnable
            public final void run() {
                long j2 = j;
                mdq mdqVar = this.a;
                Runnable runnable2 = runnable;
                zyu zyuVar2 = zyuVar;
                mds mdsVar2 = mdsVar;
                TimeUnit timeUnit2 = timeUnit;
                try {
                    runnable2.run();
                    if (zyuVar2.isDone()) {
                        return;
                    }
                    zyf zyfVarSchedule = mdqVar.g.a.schedule(mdqVar.a, j2, timeUnit2);
                    mdsVar2.a = zyfVarSchedule;
                    if (mdsVar2.isDone()) {
                        zyfVarSchedule.cancel(false);
                    }
                } catch (Throwable th) {
                    zyuVar2.q(th);
                }
            }
        });
    }
}
