package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class arb {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    public arb(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final long a(boolean z) {
        return z ? this.a : this.c;
    }

    public final long b(boolean z) {
        return z ? this.b : this.d;
    }

    public final arb c(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new arb(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof arb)) {
            return false;
        }
        long j = this.a;
        arb arbVar = (arb) obj;
        long j2 = arbVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, arbVar.b) && a.s(this.c, arbVar.c) && a.s(this.d, arbVar.d);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.d;
        return ((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j2);
    }
}
