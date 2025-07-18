package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rql implements rpf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final double e;
    private final int f;

    public rql() {
        throw null;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ int a() {
        return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @Override // defpackage.rpf
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rql)) {
            return false;
        }
        rql rqlVar = (rql) obj;
        int i = this.f;
        int i2 = rqlVar.f;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1 && this.a == rqlVar.a && this.b == rqlVar.b && this.c == rqlVar.c && this.d == rqlVar.d) {
            if (Double.doubleToLongBits(this.e) == Double.doubleToLongBits(rqlVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        a.bl(this.f);
        double d = this.e;
        return ((int) (Double.doubleToLongBits(d) ^ (Double.doubleToLongBits(d) >>> 32))) ^ ((((((((this.a ^ (-722379962)) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=" + rpg.a(this.f) + ", maxBufferSizeBytes=" + this.a + ", sampleDurationMs=" + this.b + ", sampleDurationSkewMs=" + this.c + ", sampleFrequencyMicro=" + this.d + ", samplesPerEpoch=" + this.e + "}";
    }

    public rql(byte[] bArr) {
        this.f = 1;
        this.a = 2097152;
        this.b = 30000;
        this.c = 5000;
        this.d = 1000;
        this.e = 5.0d;
    }

    @Override // defpackage.rpf
    public final /* synthetic */ void c() {
    }
}
