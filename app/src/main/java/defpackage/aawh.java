package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawh implements aauv {
    private static final zfh a = zfh.h("xRPC");
    private aawj b;
    private aawi c;

    @Override // defpackage.aauv
    public final aawa a(aaut aautVar) {
        afem afemVar = aautVar.b;
        this.c = new aawi(((aasi) afemVar.h(aasj.a)).g());
        afel afelVar = aawj.b;
        yqw.F(afemVar.h(afelVar) == null, "Unexpected option %s already set.", afelVar);
        afel afelVar2 = aawg.a;
        yqw.F(afemVar.h(afelVar2) == null, "Unexpected option %s already set.", afelVar2);
        aawj aawjVar = new aawj();
        this.b = aawjVar;
        return new aawa(1, null, null, afemVar.f(afelVar, aawjVar).f(afelVar2, this.b));
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
            yrp yrpVar = this.c.a;
            Boolean bool = false;
            bool.getClass();
        } catch (Throwable th) {
            ((zfd) ((zfd) ((zfd) a.c()).p(th)).q("com/google/frameworks/client/data/android/metrics/MetricsRecordingInterceptor", "startOnCompleteProcessing", 54, "MetricsRecordingInterceptor.java")).u("Failed to record RPC metrics");
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
