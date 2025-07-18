package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jys extends kaa {
    public final double a;
    public final int b;

    public jys(int i, double d) {
        this.b = i;
        this.a = d;
    }

    @Override // defpackage.kaa
    public final double a() {
        return this.a;
    }

    @Override // defpackage.kaa
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kaa) {
            kaa kaaVar = (kaa) obj;
            if (this.b == kaaVar.b() && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(kaaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.a;
        return ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        int i = this.b;
        return "LogSamplerResult{samplingDecision=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", overallEffectiveSamplingRate=" + this.a + "}";
    }
}
