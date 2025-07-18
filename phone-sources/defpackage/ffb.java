package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffb implements fde {
    private final fdu a;
    private final int b;
    private final rsj c = new rsj();

    public ffb(fdu fduVar, int i) {
        this.a = fduVar;
        this.b = i;
    }

    private final long c(fdq fdqVar) {
        long j;
        long j2;
        while (true) {
            long jE = fdqVar.e();
            fdi fdiVar = (fdi) fdqVar;
            long j3 = fdiVar.a;
            j = (-6) + j3;
            if (jE >= j) {
                j2 = j3;
                break;
            }
            fdu fduVar = this.a;
            int i = this.b;
            rsj rsjVar = this.c;
            long jE2 = fdqVar.e();
            byte[] bArr = new byte[2];
            fdqVar.i(bArr, 0, 2);
            if (((bArr[1] & 255) | ((bArr[0] & 255) << 8)) != i) {
                fdqVar.k();
                fdqVar.g((int) (jE2 - fdiVar.b));
            } else {
                edi ediVar = new edi(16);
                j2 = j3;
                System.arraycopy(bArr, 0, ediVar.a, 0, 2);
                ediVar.J(fki.V(fdqVar, ediVar.a, 2, 14));
                fdqVar.k();
                fdqVar.g((int) (jE2 - fdiVar.b));
                if (fki.ad(ediVar, fduVar, i, rsjVar)) {
                    break;
                }
            }
            fdqVar.g(1);
        }
        if (fdqVar.e() < j) {
            return this.c.a;
        }
        fdqVar.g((int) (j2 - fdqVar.e()));
        return this.a.j;
    }

    @Override // defpackage.fde
    public final fdd a(fdq fdqVar, long j) {
        long j2 = ((fdi) fdqVar).b;
        int i = this.a.c;
        long jC = c(fdqVar);
        long jE = fdqVar.e();
        fdqVar.g(Math.max(6, i));
        long jC2 = c(fdqVar);
        return (jC > j || jC2 <= j) ? jC2 <= j ? new fdd(-2, jC2, fdqVar.e()) : new fdd(-1, jC, j2) : new fdd(0, -9223372036854775807L, jE);
    }

    @Override // defpackage.fde
    public final /* synthetic */ void b() {
    }
}
