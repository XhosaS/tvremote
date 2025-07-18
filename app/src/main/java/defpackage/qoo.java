package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class qoo extends qpu {
    public final int a;
    private final zyh b;
    private final int c;
    private final boolean d;

    public qoo(zyh zyhVar, int i, int i2, boolean z) {
        this.b = zyhVar;
        this.c = i;
        this.a = i2;
        this.d = z;
    }

    @Override // defpackage.qpu
    public final int a() {
        return this.a;
    }

    @Override // defpackage.qpu
    public final int b() {
        return this.c;
    }

    @Override // defpackage.qpu
    public final zyh c() {
        return this.b;
    }

    @Override // defpackage.qpu
    public final boolean d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qpu) {
            qpu qpuVar = (qpu) obj;
            zyh zyhVar = this.b;
            if (zyhVar != null ? zyhVar.equals(qpuVar.c()) : qpuVar.c() == null) {
                if (this.c == qpuVar.b() && this.a == qpuVar.a() && this.d == qpuVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        zyh zyhVar = this.b;
        int iHashCode = zyhVar == null ? 0 : zyhVar.hashCode();
        int i = this.c;
        return ((((((iHashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ this.a) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final String toString() {
        return "PrimesThreadsConfigurations{primesExecutorService=" + String.valueOf(this.b) + ", primesMetricExecutorPriority=" + this.c + ", primesMetricExecutorPoolSize=" + this.a + ", enableDeferredTasks=" + this.d + "}";
    }
}
