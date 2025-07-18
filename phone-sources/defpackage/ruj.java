package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruj {
    public int a;
    public float b;
    public tst c;
    public byte d;
    public int e;

    public ruj() {
        throw null;
    }

    public final ruk a() {
        int i;
        if (this.d == 3 && (i = this.e) != 0) {
            ruk rukVar = new ruk(i, this.a, this.b, this.c);
            sij.x(true, "Rate limit per second must be >= 0");
            float f = rukVar.a;
            sij.x(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return rukVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" rateLimitPerSecond");
        }
        if ((this.d & 2) == 0) {
            sb.append(" samplingProbability");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = true != z ? 2 : 3;
    }

    public final rqq c() {
        int i;
        if (this.d == 3 && (i = this.a) != 0) {
            rqq rqqVar = new rqq(i, this.b, this.e, this.c);
            float f = rqqVar.a;
            sij.o(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return rqqVar;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if ((this.d & 1) == 0) {
            sb.append(" startupSamplePercentage");
        }
        if ((this.d & 2) == 0) {
            sb.append(" debugLogsSize");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void d(boolean z) {
        this.a = true != z ? 2 : 3;
    }

    public ruj(byte[] bArr) {
        this.c = trk.a;
    }
}
