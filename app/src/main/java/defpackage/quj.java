package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quj extends qvf {
    public final long a;
    public final long b;

    public quj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.qvf
    public final long a() {
        return this.a;
    }

    @Override // defpackage.qvf
    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qvf) {
            qvf qvfVar = (qvf) obj;
            if (this.a == qvfVar.a() && this.b == qvfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }
}
