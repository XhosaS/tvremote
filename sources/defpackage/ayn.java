package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayn implements atd {
    private final int a;
    private final boolean b;
    private final int c;
    private final awc d;

    public ayn() {
        throw null;
    }

    @Override // defpackage.atd
    public final int a() {
        return this.a;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayn)) {
            return false;
        }
        ayn aynVar = (ayn) obj;
        int i = this.c;
        int i2 = aynVar.c;
        if (i != 0) {
            return i == i2 && this.a == aynVar.a && this.d.equals(aynVar.d) && this.b == aynVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        ii.ac(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=" + ate.a(this.c) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + String.valueOf(this.d) + ", recordTimerDuration=" + this.b + ", sendEmptyTraces=false}";
    }

    public ayn(awc awcVar) {
        this.c = 2;
        this.a = 10;
        this.d = awcVar;
        this.b = true;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
