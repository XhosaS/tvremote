package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmm implements fde {
    private final edo a;
    private final edi b = new edi();
    private final int c;

    public fmm(int i, edo edoVar) {
        this.c = i;
        this.a = edoVar;
    }

    @Override // defpackage.fde
    public final fdd a(fdq fdqVar, long j) {
        int iA;
        int iA2;
        fdi fdiVar = (fdi) fdqVar;
        long j2 = fdiVar.a;
        long j3 = fdiVar.b;
        int iMin = (int) Math.min(112800L, j2 - j3);
        edi ediVar = this.b;
        ediVar.G(iMin);
        fdqVar.i(ediVar.a, 0, iMin);
        int i = ediVar.c;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        long j6 = -1;
        while (ediVar.a() >= 188 && (iA2 = (iA = fki.A(ediVar.a, ediVar.b, i)) + 188) <= i) {
            long jB = fki.B(ediVar, iA, this.c);
            if (jB != -9223372036854775807L) {
                long jB2 = this.a.b(jB);
                if (jB2 > j) {
                    return j5 == -9223372036854775807L ? new fdd(-1, jB2, j3) : new fdd(0, -9223372036854775807L, j3 + j6);
                }
                j5 = jB2;
                long j7 = iA;
                if (100000 + j5 > j) {
                    return new fdd(0, -9223372036854775807L, j3 + j7);
                }
                j6 = j7;
            }
            ediVar.K(iA2);
            j4 = iA2;
        }
        return j5 != -9223372036854775807L ? new fdd(-2, j5, j3 + j4) : fdd.a;
    }

    @Override // defpackage.fde
    public final void b() {
        this.b.H(edt.b);
    }
}
