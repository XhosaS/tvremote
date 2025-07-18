package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rsp {
    public int a;
    public tst b;
    public boolean c;
    public byte d;
    public int e;

    public rsp() {
        throw null;
    }

    public final rsq a() {
        int i;
        if (this.d == Byte.MAX_VALUE && (i = this.e) != 0) {
            return new rsq(i, this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" recordMetricPerProcess");
        }
        if ((this.d & 4) == 0) {
            sb.append(" forceGcBeforeRecordMemory");
        }
        if ((this.d & 8) == 0) {
            sb.append(" captureDebugMetrics");
        }
        if ((this.d & 16) == 0) {
            sb.append(" captureMemoryInfo");
        }
        if ((this.d & 32) == 0) {
            sb.append(" recordMemoryPeriodically");
        }
        if ((this.d & 64) == 0) {
            sb.append(" randomizePeriodicMemoryMetricStartTime");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public rsp(byte[] bArr) {
        this.b = trk.a;
    }
}
