package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aagz extends aahq {
    private final long a;
    private final long b;
    private final long c;

    public aagz(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    @Override // defpackage.aahq
    public final long a() {
        return this.b;
    }

    @Override // defpackage.aahq
    public final long b() {
        return this.a;
    }

    @Override // defpackage.aahq
    public final long c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aahq) {
            aahq aahqVar = (aahq) obj;
            if (this.a == aahqVar.b() && this.b == aahqVar.a() && this.c == aahqVar.c()) {
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
        return "StartupTime{epochMillis=" + this.a + ", elapsedRealtime=" + this.b + ", uptimeMillis=" + this.c + "}";
    }
}
