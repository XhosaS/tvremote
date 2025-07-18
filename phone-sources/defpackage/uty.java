package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uty implements utj {
    private static final tvn a = tvn.n("xRPC");
    private utz b;
    private upo c;

    @Override // defpackage.utj
    public final /* synthetic */ utv b() {
        return utv.a;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, ttm] */
    @Override // defpackage.utj
    public final void d(upo upoVar) {
        try {
            upo upoVar2 = this.c;
            utz utzVar = this.b;
            if (((Boolean) upoVar2.a.get()).booleanValue() && utzVar.e.get()) {
                rmr rmrVarA = rmr.a();
                rtg rtgVarA = rtg.a(null, utzVar.c.a());
                boolean z = utzVar.d.get();
                a.H(true);
                a.H(true);
                rtgVarA.q = 1;
                rtgVarA.r = z ? 1 : 0;
                rmrVarA.e(rtgVarA);
            }
        } catch (Throwable th) {
            ((tvk) ((tvk) ((tvk) a.f()).i(th)).j("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", '6', "MetricsRecordingInterceptor.java")).s("Failed to record RPC metrics");
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
        xpy xpyVar = (xpy) vvdVar.d;
        this.c = new upo(((uqh) xpyVar.g(uqi.a)).i, (byte[]) null);
        xpx xpxVar = utz.b;
        sij.s(xpyVar.g(xpxVar) == null, "Unexpected option %s already set.", xpxVar);
        xpx xpxVar2 = utx.a;
        sij.s(xpyVar.g(xpxVar2) == null, "Unexpected option %s already set.", xpxVar2);
        utz utzVar = new utz((uqr) xpyVar.g(uqr.a));
        this.b = utzVar;
        return new utv(1, null, null, null, xpyVar.f(xpxVar, utzVar).f(xpxVar2, this.b));
    }

    @Override // defpackage.utj
    public final /* synthetic */ void e(upq upqVar) {
    }

    @Override // defpackage.utj
    public final /* synthetic */ void i(upo upoVar) {
    }
}
