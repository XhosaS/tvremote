package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ruu implements rpf {
    private final int a;
    private final boolean b;
    private final int c;
    private final rrx d;

    public ruu() {
        throw null;
    }

    @Override // defpackage.rpf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ruu)) {
            return false;
        }
        ruu ruuVar = (ruu) obj;
        int i = this.c;
        int i2 = ruuVar.c;
        if (i != 0) {
            return i == i2 && this.a == ruuVar.a && this.d.equals(ruuVar.d) && this.b == ruuVar.b;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.c;
        a.bl(i);
        return ((((((((i ^ 1000003) * 1000003) ^ this.a) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "TikTokTraceConfigurations{enablement=" + rpg.a(this.c) + ", rateLimitPerSecond=" + this.a + ", dynamicSampler=" + String.valueOf(this.d) + ", recordTimerDuration=" + this.b + ", sendEmptyTraces=false}";
    }

    public ruu(rrx rrxVar) {
        this.c = 2;
        this.a = 10;
        this.d = rrxVar;
        this.b = true;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
