package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qyt extends qyx {
    private final yqt a;

    public qyt(yqt yqtVar) {
        this.a = yqtVar;
    }

    @Override // defpackage.qyx, defpackage.qtl
    public final int a() {
        return 3;
    }

    @Override // defpackage.qyx
    public final yqt d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyx) {
            qyx qyxVar = (qyx) obj;
            qyxVar.k();
            qyxVar.a();
            qyxVar.i();
            if (this.a.equals(qyxVar.d())) {
                qyxVar.h();
                qyxVar.g();
                qyxVar.j();
                qyxVar.f();
                qyxVar.e();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 678791519;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + qtm.a(3) + ", rateLimitPerSecond=3, recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=true, recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    @Override // defpackage.qyx
    public final void e() {
    }

    @Override // defpackage.qyx
    public final void f() {
    }

    @Override // defpackage.qyx
    public final void g() {
    }

    @Override // defpackage.qyx
    public final void h() {
    }

    @Override // defpackage.qyx
    public final void i() {
    }

    @Override // defpackage.qyx
    public final void j() {
    }

    @Override // defpackage.qyx
    public final void k() {
    }
}
