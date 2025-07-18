package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayg {
    public int a;
    public float b;
    public byg c;
    public byte d;
    public int e;

    public ayg() {
        throw null;
    }

    public final ayh a() {
        int i;
        if (this.d == 3 && (i = this.e) != 0) {
            ayh ayhVar = new ayh(i, this.a, this.b, this.c);
            bdq.k(true, "Rate limit per second must be >= 0");
            float f = ayhVar.a;
            bdq.k(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
            return ayhVar;
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

    public final aut c() {
        int i;
        if (this.d == 3 && (i = this.a) != 0) {
            aut autVar = new aut(i, this.b, this.e, this.c);
            float f = autVar.a;
            bdq.f(f > 0.0f && f <= 100.0f, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
            return autVar;
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

    public ayg(byte[] bArr) {
        this.c = bxw.a;
    }
}
