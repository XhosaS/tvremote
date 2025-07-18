package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
class lgj implements Runnable {
    final /* synthetic */ kzj a;
    final /* synthetic */ lgo b;

    public lgj(lgo lgoVar, kzj kzjVar) {
        this.a = kzjVar;
        this.b = lgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lgo lgoVar = this.b;
        synchronized (lgoVar) {
            lgoVar.a = false;
            lgp lgpVar = lgoVar.c;
            if (!lgpVar.w()) {
                lbk lbkVar = lgpVar.y;
                lab labVar = lbkVar.f;
                lbkVar.o(labVar);
                labVar.j.a("Connected to remote service");
                lgpVar.v(this.a);
            }
        }
        lgp lgpVar2 = this.b.c;
        ScheduledExecutorService scheduledExecutorService = lgpVar2.d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            lgpVar2.d = null;
        }
    }
}
