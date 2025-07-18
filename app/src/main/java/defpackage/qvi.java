package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvi extends qvj {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvj) {
            qvj qvjVar = (qvj) obj;
            qvjVar.d();
            qvjVar.e();
            qvjVar.f();
            qvjVar.g();
            qvjVar.h();
            long jDoubleToLongBits = Double.doubleToLongBits(5.0d);
            qvjVar.i();
            if (jDoubleToLongBits == Double.doubleToLongBits(5.0d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) (Double.doubleToLongBits(5.0d) ^ (Double.doubleToLongBits(5.0d) >>> 32))) ^ 388790310;
    }

    public final String toString() {
        return "CpuProfilingConfigurations{enablement=DEFAULT, maxBufferSizeBytes=2097152, sampleDurationMs=30000, sampleDurationSkewMs=5000, sampleFrequencyMicro=1000, samplesPerEpoch=5.0}";
    }

    @Override // defpackage.qvj
    public final void d() {
    }

    @Override // defpackage.qvj
    public final void e() {
    }

    @Override // defpackage.qvj
    public final void f() {
    }

    @Override // defpackage.qvj
    public final void g() {
    }

    @Override // defpackage.qvj
    public final void h() {
    }

    @Override // defpackage.qvj
    public final void i() {
    }
}
