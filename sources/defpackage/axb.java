package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class axb implements atd {
    public final byg a;
    public final boolean b;
    private final int c;
    private final int d;

    public axb() {
        throw null;
    }

    public static axa d() {
        axa axaVar = new axa(null);
        axaVar.a = 3;
        axaVar.b = bxw.a;
        axaVar.c = true;
        axaVar.e = 1;
        axaVar.d = Byte.MAX_VALUE;
        return axaVar;
    }

    @Override // defpackage.atd
    public final int a() {
        return this.c;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return this.d != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof axb)) {
            return false;
        }
        axb axbVar = (axb) obj;
        int i = this.d;
        int i2 = axbVar.d;
        if (i != 0) {
            return i == i2 && this.c == axbVar.c && this.a.equals(axbVar.a) && this.b == axbVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        ii.ac(i);
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + ate.a(this.d) + ", rateLimitPerSecond=" + this.c + ", recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public axb(int i, int i2, byg bygVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = bygVar;
        this.b = z;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
