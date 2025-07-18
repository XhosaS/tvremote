package defpackage;

import com.google.android.libraries.elements.interfaces.IntersectionCriteria;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogr {
    private final oco a;

    public ogr(oco ocoVar) {
        this.a = ocoVar;
    }

    public static int a(aart aartVar, ndo ndoVar) {
        if (ndoVar.h() == 0) {
            return 0;
        }
        int[] iArr = new int[ndoVar.h()];
        int i = 0;
        while (i < ndoVar.h()) {
            ndn ndnVarM = ndoVar.m(i);
            aart aartVar2 = aartVar;
            iArr[i] = aeem.g(aartVar2, ndnVarM.h(), ndnVarM.g(), ndnVarM.k() ? e(aartVar, ((nbd) ndnVarM.i()).a) : 0, ndnVarM.l() - 1, ndnVarM.j());
            i++;
            aartVar = aartVar2;
        }
        return aeen.g(aartVar, iArr);
    }

    public static int b(aart aartVar, ndo ndoVar) {
        if (!ndoVar.w()) {
            return 0;
        }
        int iC = aartVar.c(ndoVar.s());
        float fG = ndoVar.g();
        int iE = ndoVar.E() - 1;
        int iC2 = ndoVar.C() - 1;
        int iC3 = c(aartVar, ndoVar);
        int iK = k(aartVar, ndoVar);
        int iJ = j(aartVar, ndoVar);
        int iA = a(aartVar, ndoVar);
        boolean zT = ndoVar.t();
        int iF = ndoVar.F() - 1;
        int i = 0;
        int iD = d(aartVar, ndoVar);
        if (ndoVar.y()) {
            i = i(aartVar, ndoVar.p());
        }
        return l(aartVar, iC, fG, iE, iC2, iC3, iK, iJ, iA, zT, iF, iD, i);
    }

    public static int c(aart aartVar, ndo ndoVar) {
        if (ndoVar.i() == 0) {
            return 0;
        }
        int[] iArr = new int[ndoVar.i()];
        int i = 0;
        while (i < ndoVar.i()) {
            ndr ndrVarN = ndoVar.n(i);
            aart aartVar2 = aartVar;
            iArr[i] = aefa.g(aartVar2, ndrVarN.h(), ndrVarN.g(), ndrVarN.n() ? g(aartVar, ndrVarN.j()) : 0, ndrVarN.m() ? g(aartVar, ndrVarN.i()) : 0, (ndrVarN.o() && ndrVarN.k().h() && ndrVarN.k().g().h()) ? aefy.g(aartVar, aefx.g(aartVar, aartVar.c(ndrVarN.k().g().g()))) : 0);
            i++;
            aartVar = aartVar2;
        }
        return aeen.h(aartVar, iArr);
    }

    public static int d(aart aartVar, ndo ndoVar) {
        if (ndoVar.j() == 0) {
            return 0;
        }
        int[] iArr = new int[ndoVar.j()];
        for (int i = 0; i < ndoVar.j(); i++) {
            iArr[i] = g(aartVar, ndoVar.o(i).g());
        }
        int[] iArr2 = new int[ndoVar.j()];
        for (int i2 = 0; i2 < ndoVar.j(); i2++) {
            iArr2[i2] = aefc.g(aartVar, iArr[i2]);
        }
        return aeen.i(aartVar, iArr2);
    }

    static int e(aart aartVar, aefm aefmVar) {
        int iG;
        int iE;
        if (aefmVar == null) {
            return 0;
        }
        int iF = f(aartVar, aefmVar.k());
        aeft aeftVarL = aefmVar.l();
        if (aeftVarL == null) {
            iG = 0;
        } else {
            int[] iArr = new int[aeftVarL.i()];
            for (int i = 0; i < aeftVarL.i(); i++) {
                iArr[i] = f(aartVar, aeftVarL.j(new aefs(), i));
            }
            iG = aeft.g(aartVar, aeft.h(aartVar, iArr));
        }
        if (aefmVar.g() > 0) {
            int iG2 = aefmVar.g();
            int[] iArr2 = new int[iG2];
            for (int i2 = 0; i2 < aefmVar.g(); i2++) {
                iArr2[i2] = e(aartVar, aefmVar.i(i2));
            }
            aartVar.p(4, iG2, 4);
            while (true) {
                iG2--;
                if (iG2 < 0) {
                    break;
                }
                aartVar.i(iArr2[iG2]);
            }
            iE = aartVar.e();
        } else {
            iE = 0;
        }
        return aefm.h(aartVar, iF, iG, iE, aefmVar.m() != null ? aartVar.c(aefmVar.m()) : 0);
    }

    static int f(aart aartVar, aefs aefsVar) {
        int iB = 0;
        if (aefsVar == null) {
            return 0;
        }
        if (aefsVar.g() > 0) {
            byte[] bArr = new byte[aefsVar.g()];
            aefsVar.f(6).get(bArr);
            iB = aartVar.b(bArr);
        }
        return aefs.j(aartVar, aefsVar.h(), iB, aefsVar.i());
    }

    static int g(aart aartVar, mil milVar) {
        int[] iArrF = milVar.f();
        if (iArrF.length != 0) {
            int i = iArrF[0];
            yyk yykVarD = milVar.d(i);
            if (!yykVarD.isEmpty()) {
                return aefs.j(aartVar, i, aartVar.a((ByteBuffer) yykVarD.get(0)), true != mij.a(i) ? 2 : 1);
            }
        }
        return 0;
    }

    static int h(aart aartVar, mil milVar) {
        if (milVar != null) {
            ArrayList arrayList = new ArrayList();
            int[] iArrF = milVar.f();
            if (iArrF.length != 0) {
                for (int i : iArrF) {
                    yyk yykVarD = milVar.d(i);
                    for (int i2 = 0; i2 < yykVarD.size(); i2++) {
                        int iA = aartVar.a((ByteBuffer) yykVarD.get(i2));
                        int i3 = 1;
                        if (true != mij.a(i)) {
                            i3 = 2;
                        }
                        arrayList.add(Integer.valueOf(aefs.j(aartVar, i, iA, i3)));
                    }
                }
                return aeft.g(aartVar, aeft.h(aartVar, Collection.EL.stream(arrayList).mapToInt(new ToIntFunction() { // from class: ogo
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(Object obj) {
                        return ((Integer) obj).intValue();
                    }
                }).toArray()));
            }
        }
        return 0;
    }

    public static int i(aart aartVar, ndx ndxVar) {
        float fG = ndxVar.g();
        int iH = ndxVar.h() - 1;
        aartVar.o(2);
        aartVar.s(1, iH);
        aartVar.r(0, fG);
        return aartVar.d();
    }

    public static int j(aart aartVar, ndo ndoVar) {
        if (ndoVar.k() == 0) {
            return 0;
        }
        int[] iArr = new int[ndoVar.k()];
        int i = 0;
        while (i < ndoVar.k()) {
            aart aartVar2 = aartVar;
            iArr[i] = aego.g(aartVar2, r3.h(), r3.g(), ndoVar.q(i).k() ? aegk.g(aartVar, r3.i().g() - 1) : 0);
            i++;
            aartVar = aartVar2;
        }
        return aeen.j(aartVar, iArr);
    }

    public static int k(aart aartVar, ndo ndoVar) {
        long j;
        int iC;
        int i;
        int i2;
        int i3;
        int iG;
        if (ndoVar.l() == 0) {
            return 0;
        }
        int[] iArr = new int[ndoVar.l()];
        int i4 = 0;
        while (i4 < ndoVar.l()) {
            nep nepVarR = ndoVar.r(i4);
            long jM = nepVarR.m();
            long jL = nepVarR.l();
            int iC2 = nepVarR.w() ? aartVar.c(nepVarR.r()) : 0;
            float fH = nepVarR.h();
            int iC3 = nepVarR.C() - 1;
            long jK = nepVarR.k();
            int iG2 = nepVarR.G() - 1;
            int iH = h(aartVar, nepVarR.p());
            int i5 = i4;
            int i6 = iC2;
            float fI = nepVarR.i();
            long jN = nepVarR.n();
            int iE = nepVarR.E() - 1;
            boolean zS = nepVarR.s();
            int iF = nepVarR.F() - 1;
            int iD = nepVarR.D() - 1;
            if (nepVarR.v()) {
                j = jM;
                iC = aartVar.c(nepVarR.q());
            } else {
                j = jM;
                iC = 0;
            }
            int i7 = iC;
            long j2 = nepVarR.j();
            long j3 = j;
            float fG = nepVarR.g();
            if (nepVarR.t()) {
                i = iF;
                i2 = iE;
                i3 = i7;
                iG = aefh.g(aartVar, t(aartVar, nepVarR), u(aartVar, nepVarR), s(aartVar, nepVarR));
                j3 = j3;
            } else {
                i = iF;
                i2 = iE;
                i3 = i7;
                iG = 0;
            }
            iArr[i5] = aegy.g(aartVar, j3, jL, i6, fH, iC3, jK, iG2, iH, fI, jN, i2, zS, i, iD, i3, j2, fG, iG);
            i4 = i5 + 1;
        }
        return aeen.k(aartVar, iArr);
    }

    public static int l(aart aartVar, int i, float f, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, int i8, int i9, int i10) {
        aartVar.o(16);
        aartVar.t(0, i);
        aartVar.r(1, f);
        aartVar.s(2, i2);
        aartVar.s(3, i3);
        aartVar.t(4, i4);
        aartVar.t(5, i5);
        aartVar.t(13, i6);
        aartVar.t(8, i7);
        aartVar.g(9, z, true);
        aartVar.s(10, i8);
        aartVar.t(11, i9);
        aartVar.t(12, i10);
        return aartVar.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0b34  */
    /* JADX WARN: Type inference failed for: r8v26, types: [java.lang.Object, ndn] */
    /* JADX WARN: Type inference failed for: r8v80, types: [java.lang.Object, ndn] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.ndo m(defpackage.ndo r48, defpackage.oal r49, defpackage.oco r50, java.util.Set r51) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 3234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogr.m(ndo, oal, oco, java.util.Set):ndo");
    }

    public static IntersectionCriteria n(nkp nkpVar) {
        return new IntersectionCriteria(nkpVar.g(), nkpVar.h() != 3);
    }

    static void p(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (list.get(size) == null) {
                list.remove(size);
            }
        }
    }

    public static boolean q(nlp nlpVar) {
        return nlpVar.i() || nlpVar.j();
    }

    public static boolean r(nmi nmiVar) {
        return nmiVar.j() || nmiVar.i();
    }

    private static int s(aart aartVar, nep nepVar) {
        if (nepVar.o().j()) {
            int iH = nepVar.o().g().h();
            int iJ = nepVar.o().g().j();
            long[] jArr = new long[iH];
            long[] jArr2 = new long[iJ];
            if (iH == iJ) {
                for (int i = 0; i < iH; i++) {
                    jArr[i] = nepVar.o().g().g(i);
                    jArr2[i] = nepVar.o().g().i(i);
                }
                aartVar.p(4, iH, 4);
                while (true) {
                    iH--;
                    if (iH < 0) {
                        break;
                    }
                    aartVar.h((int) jArr[iH]);
                }
                int iE = aartVar.e();
                aartVar.p(4, iJ, 4);
                while (true) {
                    iJ--;
                    if (iJ < 0) {
                        int iE2 = aartVar.e();
                        aartVar.o(2);
                        aartVar.t(1, iE);
                        aartVar.t(0, iE2);
                        return aartVar.d();
                    }
                    aartVar.h((int) jArr2[iJ]);
                }
            }
        }
        return 0;
    }

    private static int t(aart aartVar, nep nepVar) {
        if (!nepVar.o().k()) {
            return 0;
        }
        int iH = nepVar.o().h().h();
        long[] jArr = new long[iH];
        for (int i = 0; i < iH; i++) {
            jArr[i] = nepVar.o().h().g(i);
        }
        aartVar.p(4, iH, 4);
        while (true) {
            iH--;
            if (iH < 0) {
                int iE = aartVar.e();
                aartVar.o(1);
                aartVar.t(0, iE);
                return aartVar.d();
            }
            aartVar.h((int) jArr[iH]);
        }
    }

    private static int u(aart aartVar, nep nepVar) {
        if (!nepVar.o().l()) {
            return 0;
        }
        long jG = nepVar.o().i().g();
        long jH = nepVar.o().i().h();
        aartVar.o(2);
        aartVar.s(1, (int) jH);
        aartVar.s(0, (int) jG);
        return aartVar.d();
    }

    public final ogq o(ngp ngpVar, oal oalVar) {
        return new ogq(ngpVar, this.a, oalVar);
    }
}
