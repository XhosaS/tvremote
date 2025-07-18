package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawl implements aauv {
    private static final zfh a = zfh.h("xRPC");
    private afik b;
    private long c;
    private aawj d;

    @Override // defpackage.aauv
    public final aawa a(aaut aautVar) {
        this.b = aautVar.c.a;
        afem afemVar = aautVar.b;
        aawj aawjVar = (aawj) afemVar.h(aawj.b);
        aawjVar.getClass();
        this.d = aawjVar;
        ((aasi) afemVar.h(aasj.a)).o();
        this.c = SystemClock.elapsedRealtime();
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa b() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa c() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final void d(aaus aausVar) {
        try {
            if (aausVar.a.e()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - this.c;
                if (this.b.equals(afik.UNARY)) {
                    if (jElapsedRealtime > 2147483647L) {
                        ((zfd) ((zfd) a.d()).q("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 52, "NetworkLatencyInterceptor.java")).u("Recorded latency overflows Integer.MAX_VALUE, cannot be recorded");
                        return;
                    }
                    aawj aawjVar = this.d;
                    int i = (int) jElapsedRealtime;
                    boolean z = true;
                    yqw.B(i >= 0, "Cannot record negative latency.");
                    if (aawjVar.c.getAndSet(i) != -1) {
                        z = false;
                    }
                    yqw.M(z, "Already recorded latency.");
                }
            }
        } catch (Throwable th) {
            ((zfd) ((zfd) ((zfd) a.c()).p(th)).q("com/google/frameworks/client/data/android/metrics/NetworkLatencyInterceptor", "startOnCompleteProcessing", 59, "NetworkLatencyInterceptor.java")).u("Failed to record network latency");
        }
    }

    @Override // defpackage.aauv
    public final /* synthetic */ aawa e() {
        return aawa.a;
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aauv
    public final /* synthetic */ void g() {
    }
}
