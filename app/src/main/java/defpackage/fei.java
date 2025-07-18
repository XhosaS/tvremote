package defpackage;

import android.os.Handler;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
class fei implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ Handler b;
    final /* synthetic */ Duration c;
    final /* synthetic */ fej d;

    public fei(fej fejVar, Runnable runnable, Handler handler, Duration duration) {
        this.a = runnable;
        this.b = handler;
        this.c = duration;
        this.d = fejVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((htm) this.a).a.aE();
        feq.e(this.b, this.c, this);
        this.d.c++;
    }
}
