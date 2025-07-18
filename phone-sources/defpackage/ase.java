package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ase {
    public final long a;
    public final long b;
    public final long c;
    private final long d;

    public ase(long j, long j2, long j3, long j4) {
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

    public final ase c(long j, long j2, long j3, long j4) {
        if (j == 16) {
            j = this.a;
        }
        return new ase(j, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ase)) {
            return false;
        }
        long j = this.a;
        ase aseVar = (ase) obj;
        long j2 = aseVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, aseVar.b) && a.s(this.c, aseVar.c) && a.s(this.d, aseVar.d);
    }

    public final int hashCode() {
        long j = bnq.a;
        int iK = a.k(this.a) * 31;
        long j2 = this.d;
        return ((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + a.k(j2);
    }
}
