package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mgf extends mgj {
    public final long a;
    public final long b;
    public final long c;

    public mgf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.mgj
    public final long a() {
        return this.a;
    }

    @Override // defpackage.mgj
    public final long b() {
        return this.c;
    }

    @Override // defpackage.mgj
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mgj) {
            mgj mgjVar = (mgj) obj;
            if (this.a == mgjVar.a() && this.b == mgjVar.c() && this.c == mgjVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.c;
        long j2 = this.a;
        int i = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.b;
        return ((int) (j ^ (j >>> 32))) ^ ((((i ^ 1000003) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003);
    }

    public final String toString() {
        return "SchedStat{cpuTimeNs=" + this.a + ", runDelayNs=" + this.b + ", runCount=" + this.c + "}";
    }
}
