package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aaec extends aads {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public aaec(aabw aabwVar, long j) {
        super(aabwVar);
        this.a = j;
    }

    @Override // defpackage.aabu
    public final long b(long j, int i) {
        return vxr.av(j, i * this.a);
    }

    @Override // defpackage.aabu
    public final long c(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException(a.cv(j3, j2, "Multiplication overflows a long: ", " * "));
                }
            }
            j3 = j4;
        }
        return vxr.av(j, j3);
    }

    @Override // defpackage.aabu
    public final long d(long j, long j2) {
        return vxr.ax(j, j2) / this.a;
    }

    @Override // defpackage.aabu
    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aaec) {
            aaec aaecVar = (aaec) obj;
            if (this.d == aaecVar.d && this.a == aaecVar.a) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aabu
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
