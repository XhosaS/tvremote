package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uub implements utj {
    private static final tvn a = tvn.n("xRPC");
    private xsp b;
    private long c;
    private utz d;

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    @Override // defpackage.utj
    public final void d(upo upoVar) {
        try {
            if (((xtk) upoVar.a).g()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
                if (this.b.equals(xsp.UNARY)) {
                    if (jElapsedRealtime > 2147483647L) {
                        ((tvk) ((tvk) a.g()).j("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).s("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                        return;
                    }
                    utz utzVar = this.d;
                    int i = (int) jElapsedRealtime;
                    boolean z = true;
                    sij.o(i >= 0, "Cannot record negative latency.");
                    if (utzVar.f.getAndSet(i) != -1) {
                        z = false;
                    }
                    sij.x(z, "Already recorded latency.");
                }
            }
        } catch (Throwable th) {
            ((tvk) ((tvk) ((tvk) a.f()).i(th)).j("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", ';', "NetworkLatencyInterceptor.java")).s("Failed to record network latency");
        }
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv f(upq upqVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ utv g(vvd vvdVar) {
        return utv.a;
    }

    @Override // defpackage.utj
    public final utv h(vvd vvdVar) {
        this.b = ((xsq) vvdVar.a).a;
        xpx xpxVar = utz.b;
        xpy xpyVar = (xpy) vvdVar.d;
        utz utzVar = (utz) xpyVar.g(xpxVar);
        utzVar.getClass();
        this.d = utzVar;
        osk oskVar = ((uqh) xpyVar.g(uqi.a)).p;
        this.c = SystemClock.elapsedRealtime();
        return utv.a;
    }

    @Override // defpackage.utj
    public final /* synthetic */ void e(upq upqVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void i(upo upoVar) {
    }
}
