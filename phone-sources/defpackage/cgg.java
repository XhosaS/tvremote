package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class cgg implements yjv {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ cgg(long j, float[] fArr, yld yldVar, ylc ylcVar, int i) {
        this.e = i;
        this.a = j;
        this.b = fArr;
        this.c = yldVar;
        this.d = ylcVar;
    }

    @Override // defpackage.yjv
    public final Object a(Object obj) {
        cft cftVar;
        float fC;
        float fD;
        if (this.e != 0) {
            byu byuVar = (byu) obj;
            byuVar.r();
            pku pkuVar = byuVar.p().c;
            bmy bmyVar = (bmy) this.d;
            float f = bmyVar.b;
            float f2 = bmyVar.c;
            pkuVar.y(f, f2);
            float f3 = -f2;
            float f4 = -f;
            try {
                brx.q(byuVar, (bng) ((ylf) this.b).a, this.a, 0L, 0.0f, (bnr) this.c, 0, 890);
                byuVar.p().c.y(f4, f3);
                return ygi.a;
            } catch (Throwable th) {
                byuVar.p().c.y(f4, f3);
                throw th;
            }
        }
        cgj cgjVar = (cgj) obj;
        int iD = cgjVar.a;
        long j = this.a;
        if (iD <= chb.d(j)) {
            iD = chb.d(j);
        }
        int iC = cgjVar.b;
        if (iC >= chb.c(j)) {
            iC = chb.c(j);
        }
        Object obj2 = this.c;
        long jN = ccf.N(cgjVar.e(iD), cgjVar.e(iC));
        cft cftVar2 = cgjVar.g;
        yld yldVar = (yld) obj2;
        int i = yldVar.a;
        int iD2 = chb.d(jN);
        int iC2 = chb.c(jN);
        cho choVar = cftVar2.b;
        int length = choVar.q().length();
        if (iD2 < 0) {
            cko.a("startOffset must be > 0");
        }
        if (iD2 >= length) {
            cko.a("startOffset must be less than text length");
        }
        if (iC2 <= iD2) {
            cko.a("endOffset must be greater than startOffset");
        }
        if (iC2 > length) {
            cko.a("endOffset must be smaller or equal to text length");
        }
        float[] fArr = (float[]) this.b;
        if (fArr.length - i < (iC2 - iD2) * 4) {
            cko.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
        }
        int iK = choVar.k(iD2);
        int iK2 = choVar.k(iC2 - 1);
        chh chhVar = new chh(choVar);
        if (iK <= iK2) {
            while (true) {
                int iM = choVar.m(iK);
                int iJ = choVar.j(iK);
                int iMax = Math.max(iD2, iM);
                int iMin = Math.min(iC2, iJ);
                float fD2 = choVar.d(iK);
                float fB = choVar.b(iK);
                cftVar = cftVar2;
                int i2 = i;
                boolean z = choVar.n(iK) == 1;
                while (iMax < iMin) {
                    int i3 = iMax + 1;
                    boolean zR = choVar.r(iMax);
                    if (z && !zR) {
                        fC = chhVar.a(iMax);
                        fD = chhVar.b(i3);
                    } else if (z) {
                        fD = chhVar.c(iMax);
                        fC = chhVar.d(i3);
                    } else if (zR) {
                        fD = chhVar.a(iMax);
                        fC = chhVar.b(i3);
                    } else {
                        fC = chhVar.c(iMax);
                        fD = chhVar.d(i3);
                    }
                    fArr[i2] = fC;
                    fArr[i2 + 1] = fD2;
                    fArr[i2 + 2] = fD;
                    fArr[i2 + 3] = fB;
                    i2 += 4;
                    iMax = i3;
                }
                if (iK == iK2) {
                    break;
                }
                iK++;
                cftVar2 = cftVar;
                i = i2;
            }
        } else {
            cftVar = cftVar2;
        }
        int iB = yldVar.a + (chb.b(jN) * 4);
        int i4 = yldVar.a;
        while (true) {
            Object obj3 = this.d;
            if (i4 >= iB) {
                yldVar.a = iB;
                ((ylc) obj3).a += cftVar.b();
                return ygi.a;
            }
            int i5 = i4 + 1;
            float f5 = fArr[i5];
            float f6 = ((ylc) obj3).a;
            fArr[i5] = f5 + f6;
            int i6 = i4 + 3;
            fArr[i6] = fArr[i6] + f6;
            i4 += 4;
        }
    }

    public /* synthetic */ cgg(bmy bmyVar, ylf ylfVar, long j, bnr bnrVar, int i) {
        this.e = i;
        this.d = bmyVar;
        this.b = ylfVar;
        this.a = j;
        this.c = bnrVar;
    }
}
