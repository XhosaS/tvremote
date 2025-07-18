package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rlz implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ zyh b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    public rlz(Runnable runnable, zyh zyhVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = zyhVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((rly) this.a).a.a();
        rlr.a(this.b.schedule(this, this.c, this.d));
    }
}
