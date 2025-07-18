package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rqf extends rqh {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public rqf(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    @Override // defpackage.rqh
    public final boolean a() {
        return this.c;
    }

    @Override // defpackage.rqh
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.rqh
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.rqh
    public final boolean d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqh) {
            rqh rqhVar = (rqh) obj;
            if (this.a == rqhVar.d() && this.b == rqhVar.b()) {
                rqhVar.e();
                if (this.c == rqhVar.a() && this.d == rqhVar.c()) {
                    rqhVar.f();
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "ExperimentConfiguration{tiktokIntegrationEnabled=" + this.a + ", throwExceptionForEventsLoggedInFuture=" + this.b + ", throwExceptionForEventsLoggedInFutureInCollector=false, enableIndividualFlowEventsSending=" + this.c + ", loggerIdMatchingEnabled=" + this.d + ", throwExceptionForLoggerIdMismatch=false}";
    }

    @Override // defpackage.rqh
    public final void e() {
    }

    @Override // defpackage.rqh
    public final void f() {
    }
}
