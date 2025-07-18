package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ntl {
    public static final ntl a;
    public final double b;
    public final int c;

    static {
        b(1, Double.valueOf(0.0d));
        a(3);
        a(4);
        a = a(5);
        b(2, Double.valueOf(1.0d));
    }

    public ntl() {
        throw null;
    }

    static ntl a(int i) {
        a.H(true);
        a.H(true);
        return b(i, null);
    }

    static ntl b(int i, Double d) {
        if (d == null) {
            d = Double.valueOf(0.0d);
        }
        return new ntl(i, d.doubleValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ntl) {
            ntl ntlVar = (ntl) obj;
            if (this.c == ntlVar.c) {
                if (Double.doubleToLongBits(this.b) == Double.doubleToLongBits(ntlVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.c;
        a.bl(i);
        double d = this.b;
        return ((i ^ 1000003) * 1000003) ^ ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32)));
    }

    public final String toString() {
        int i = this.c;
        return "LogSamplerResult{samplingDecision=" + (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "ALWAYS_UPLOAD_NO_SAMPLER" : "SAMPLING_NOT_SUPPORTED_FOR_LOG_EVENT" : "ALWAYS_UPLOAD_DUE_TO_ERROR" : "UPLOAD" : "NO_UPLOAD") + ", overallEffectiveSamplingRate=" + this.b + "}";
    }

    public ntl(int i, double d) {
        this.c = i;
        this.b = d;
    }
}
