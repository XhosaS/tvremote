package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjp extends wjt {
    private final long a;
    private final long b;

    public wjp(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // defpackage.wjt
    public final long a() {
        return this.b;
    }

    @Override // defpackage.wjt
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wjt) {
            wjt wjtVar = (wjt) obj;
            if (this.a == wjtVar.b() && this.b == wjtVar.a()) {
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
        return "LogReport{timestampMillis=" + this.a + ", size=" + this.b + "}";
    }
}
