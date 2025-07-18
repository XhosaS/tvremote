package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bcz implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ cjd b;
    final /* synthetic */ long c;
    final /* synthetic */ TimeUnit d;

    public bcz(Runnable runnable, cjd cjdVar, long j, TimeUnit timeUnit) {
        this.a = runnable;
        this.b = cjdVar;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.run();
        tj.h(this.b.b(this, this.c, this.d));
    }
}
