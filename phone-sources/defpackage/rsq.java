package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsq implements rpf {
    public final tst a;
    public final boolean b;
    private final int c;
    private final int d;

    public rsq() {
        throw null;
    }

    public static rsp d() {
        rsp rspVar = new rsp(null);
        rspVar.a = 3;
        rspVar.b = trk.a;
        rspVar.c = true;
        rspVar.e = 1;
        rspVar.d = Byte.MAX_VALUE;
        return rspVar;
    }

    @Override // defpackage.rpf
    public final int a() {
        return this.c;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return this.d != 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rsq)) {
            return false;
        }
        rsq rsqVar = (rsq) obj;
        int i = this.d;
        int i2 = rsqVar.d;
        if (i != 0) {
            return i == i2 && this.c == rsqVar.c && this.a.equals(rsqVar.a) && this.b == rsqVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.d;
        a.bl(i);
        return ((((((((((((((((i ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ 1237) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "MemoryConfigurations{enablement=" + rpg.a(this.d) + ", rateLimitPerSecond=" + this.c + ", recordMetricPerProcess=false, metricExtensionProvider=" + String.valueOf(this.a) + ", forceGcBeforeRecordMemory=false, captureDebugMetrics=false, captureMemoryInfo=" + this.b + ", recordMemoryPeriodically=false, randomizePeriodicMemoryMetricStartTime=false}";
    }

    public rsq(int i, int i2, tst tstVar, boolean z) {
        this.d = i;
        this.c = i2;
        this.a = tstVar;
        this.b = z;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
