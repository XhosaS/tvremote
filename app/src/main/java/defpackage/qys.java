package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qys extends qyu {
    private final long a;
    private final yzq b;
    private final int c = 2;

    public qys(int i, long j, yzq yzqVar) {
        this.a = j;
        this.b = yzqVar;
    }

    @Override // defpackage.qyu
    public final long d() {
        return this.a;
    }

    @Override // defpackage.qyu
    public final yzq e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qyu) {
            qyu qyuVar = (qyu) obj;
            qyuVar.f();
            if (this.a == qyuVar.d() && this.b.equals(qyuVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.qyu
    public final int f() {
        return 2;
    }

    public final int hashCode() {
        int i = ((zcp) this.b).d;
        long j = this.a;
        return i ^ ((((int) (j ^ (j >>> 32))) ^ (-723379965)) * 1000003);
    }

    public final String toString() {
        return "DebugMemoryConfigurations{enablement=" + qtm.a(2) + ", debugMemoryServiceThrottleMs=" + this.a + ", debugMemoryEventsToSample=" + String.valueOf(this.b) + "}";
    }
}
