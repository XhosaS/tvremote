package defpackage;

import android.os.Handler;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class boz extends btc {
    public final bug a;
    boolean b;
    int c;
    int d;
    int e;
    int f;
    long g;
    long h = 2147483647L;
    long i = 0;
    long j = 0;
    final /* synthetic */ bpa k;
    private final Handler l;

    public boz(bpa bpaVar, bug bugVar) {
        this.k = bpaVar;
        this.l = new boy(this, bpaVar.b);
        this.a = bugVar;
    }

    private final void j() {
        this.l.removeCallbacksAndMessages(null);
    }

    @Override // defpackage.btc
    public final int a() {
        return 1;
    }

    @Override // defpackage.btc
    protected final void b(int i) {
        j();
    }

    @Override // defpackage.btc
    public final void c(int i, int i2) {
        this.b = i2 != 0;
        g();
    }

    @Override // defpackage.btc
    public final boolean d(bux buxVar) {
        g();
        if (buxVar.b != 9) {
            return false;
        }
        bvr bvrVar = (bvr) buxVar.c;
        if (bvrVar.b != this.c) {
            this.e++;
            ((cbs) bpa.a.g().j("com/google/android/tv/remote/service/PingFeature$ClientMessageHandler", "handleMessage", 160, "PingFeature.java")).w("Received stale, duplicate or out of order ping. Expected %d, received %d", this.c, bvrVar.b);
        } else {
            this.d++;
            long jUptimeMillis = SystemClock.uptimeMillis() - this.g;
            this.h = Math.min(this.h, jUptimeMillis);
            this.i = Math.max(this.i, jUptimeMillis);
            this.j += jUptimeMillis;
            this.f = 0;
        }
        return true;
    }

    @Override // defpackage.btc
    public final boolean e(int i, bsw bswVar) {
        g();
        return true;
    }

    @Override // defpackage.btc
    public final void f(bxj bxjVar) {
        bxjVar.c("Ping: %d", Integer.valueOf(this.d));
        int i = this.e;
        if (i > 0) {
            bxjVar.c("+%d", Integer.valueOf(i));
        }
        bxjVar.c("/%d", Integer.valueOf(this.c));
        if (this.d > 0) {
            bxjVar.c(", Min %dms, Avg %.2fms, Max %dms%n", Long.valueOf(this.h), Double.valueOf(this.j / this.d), Long.valueOf(this.i));
        } else {
            bxjVar.d("");
        }
    }

    public final void g() {
        j();
        Handler handler = this.l;
        handler.sendMessageDelayed(handler.obtainMessage(1), true != this.b ? 120000 : 5000);
    }
}
