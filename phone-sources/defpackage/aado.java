package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aado extends aads {
    private static final long serialVersionUID = -485345310999208286L;
    final aabu a;
    final boolean b;
    final aabs c;

    public aado(aabu aabuVar, aabs aabsVar) {
        super(aabuVar.f());
        if (!aabuVar.h()) {
            throw new IllegalArgumentException();
        }
        this.a = aabuVar;
        this.b = aadp.Q(aabuVar);
        this.c = aabsVar;
    }

    private final int i(long j) {
        int i = this.c.i(j);
        long j2 = i;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return i;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    private final int j(long j) {
        int iA = this.c.a(j);
        long j2 = iA;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iA;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.aads, defpackage.aabu
    public final int a(long j, long j2) {
        return this.a.a(j + (this.b ? r1 : j(j)), j2 + j(j2));
    }

    @Override // defpackage.aabu
    public final long b(long j, int i) {
        int iJ = j(j);
        boolean z = this.b;
        long jB = this.a.b(j + iJ, i);
        if (!z) {
            iJ = i(jB);
        }
        return jB - iJ;
    }

    @Override // defpackage.aabu
    public final long c(long j, long j2) {
        int iJ = j(j);
        boolean z = this.b;
        long jC = this.a.c(j + iJ, j2);
        if (!z) {
            iJ = i(jC);
        }
        return jC - iJ;
    }

    @Override // defpackage.aabu
    public final long d(long j, long j2) {
        return this.a.d(j + (this.b ? r1 : j(j)), j2 + j(j2));
    }

    @Override // defpackage.aabu
    public final long e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aado) {
            aado aadoVar = (aado) obj;
            if (this.a.equals(aadoVar.a) && this.c.equals(aadoVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aabu
    public final boolean g() {
        return this.b ? this.a.g() : this.a.g() && this.c.h();
    }

    public final int hashCode() {
        aabs aabsVar = this.c;
        return aabsVar.hashCode() ^ this.a.hashCode();
    }
}
