package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbu extends rcb {
    private final rca a;

    public rbu(rca rcaVar) {
        this.a = rcaVar;
    }

    @Override // defpackage.rcb, defpackage.qtl
    public final int a() {
        return 10;
    }

    @Override // defpackage.rcb
    public final rca d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rcb) {
            rcb rcbVar = (rcb) obj;
            rcbVar.f();
            rcbVar.a();
            if (this.a.equals(rcbVar.d())) {
                rcbVar.g();
                rcbVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 2032656219) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=EXPLICITLY_DISABLED, rateLimitPerSecond=10, dynamicSampler=" + this.a.toString() + ", recordTimerDuration=true, sendEmptyTraces=false}";
    }

    @Override // defpackage.rcb
    public final void e() {
    }

    @Override // defpackage.rcb
    public final void f() {
    }

    @Override // defpackage.rcb
    public final void g() {
    }
}
