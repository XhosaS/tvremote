package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class boz extends bpa {
    private final bpi a;
    private final bpi b;
    private final float[] c;

    public boz(bpi bpiVar, bpi bpiVar2) {
        float[] fArrZ;
        super(bpiVar2, bpiVar, bpiVar2, null);
        this.a = bpiVar;
        this.b = bpiVar2;
        if (brx.w(bpiVar.d, bpiVar2.d)) {
            fArrZ = brx.z(bpiVar2.j, bpiVar.i);
        } else {
            float[] fArrZ2 = bpiVar.i;
            float[] fArr = bpiVar2.j;
            float[] fArrA = bpiVar.d.a();
            float[] fArrA2 = bpiVar2.d.a();
            bpk bpkVar = bpiVar.d;
            bpk bpkVar2 = bpd.a;
            bpk bpkVar3 = bpd.b;
            fArrZ2 = brx.w(bpkVar, bpkVar3) ? fArrZ2 : brx.z(brx.x(bot.b.c, fArrA, bpd.a()), bpiVar.i);
            fArrZ = brx.z(brx.w(bpiVar2.d, bpkVar3) ? fArr : brx.y(brx.z(brx.x(bot.b.c, fArrA2, bpd.a()), bpiVar2.i)), a.r(0, 3) ? brx.A(new float[]{fArrA[0] / fArrA2[0], fArrA[1] / fArrA2[1], fArrA[2] / fArrA2[2]}, fArrZ2) : fArrZ2);
        }
        this.c = fArrZ;
    }

    @Override // defpackage.bpa
    public final long a(long j) {
        double d = bnq.d(j);
        float fC = bnq.c(j);
        float fB = bnq.b(j);
        bpc bpcVar = this.a.p;
        float fA = (float) bpcVar.a(d);
        float fA2 = (float) bpcVar.a(fC);
        float fA3 = (float) bpcVar.a(fB);
        float[] fArr = this.c;
        float f = fArr[0] * fA;
        float f2 = fArr[3] * fA2;
        float f3 = fArr[6] * fA3;
        float f4 = fArr[1] * fA;
        float f5 = fArr[4] * fA2;
        float f6 = fArr[7] * fA3;
        float f7 = fArr[2] * fA;
        float f8 = fArr[5] * fA2;
        float f9 = fArr[8] * fA3;
        bpi bpiVar = this.b;
        bpc bpcVar2 = bpiVar.m;
        return bny.k((float) bpcVar2.a(f + f2 + f3), (float) bpcVar2.a(f4 + f5 + f6), (float) bpcVar2.a(f7 + f8 + f9), bnq.a(j), bpiVar);
    }
}
