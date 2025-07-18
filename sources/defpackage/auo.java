package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auo implements atd {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public auo() {
        throw null;
    }

    @Override // defpackage.atd
    public final /* synthetic */ int a() {
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.atd
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof auo)) {
            return false;
        }
        auo auoVar = (auo) obj;
        int i = this.f;
        int i2 = auoVar.f;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 && this.a == auoVar.a && this.b == auoVar.b && this.c == auoVar.c && this.d == auoVar.d) {
            if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(auoVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        ii.ac(this.f);
        double d = this.e;
        return ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + ate.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + "}";
    }

    public auo(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.atd
    public final /* synthetic */ void c() {
    }
}
