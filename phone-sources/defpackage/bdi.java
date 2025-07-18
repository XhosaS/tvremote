package defpackage;

import android.view.ViewStructure;
import androidx.compose.ui.ZIndexElement;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdi {
    public static bkp A(bkp bkpVar, bkp bkpVar2) {
        return bkpVar2 == bkp.g ? bkpVar : new bkj(bkpVar, bkpVar2);
    }

    public static final bkp B(bao baoVar, bkp bkpVar) {
        if (bkpVar.c(lo.h)) {
            return bkpVar;
        }
        baoVar.y(1219399079);
        bkp bkpVar2 = (bkp) bkpVar.b(bkp.g, new bkl(baoVar, 0));
        baoVar.q();
        return bkpVar2;
    }

    public static final bkp C(bao baoVar, bkp bkpVar) {
        baoVar.x(439770924);
        bkp bkpVarB = B(baoVar, bkpVar);
        baoVar.p();
        return bkpVarB;
    }

    public static final bkp E(bkp bkpVar, yka ykaVar) {
        return bkpVar.a(new bkk(ykaVar));
    }

    public static final int a(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final int b(ArrayList arrayList, int i, int i2) {
        int iD = d(arrayList, i, i2);
        return iD >= 0 ? iD : -(iD + 1);
    }

    public static final int c(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 30);
    }

    public static final int d(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((bac) arrayList.get(i4)).a;
            if (i5 < 0) {
                i5 += i2;
            }
            int iA = yks.a(i5, i);
            if (iA < 0) {
                i3 = i4 + 1;
            } else {
                if (iA <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int e(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + Integer.bitCount(iArr[i2 + 1] >> 28);
    }

    public static final bac f(ArrayList arrayList, int i, int i2) {
        int iD = d(arrayList, i, i2);
        if (iD >= 0) {
            return (bac) arrayList.get(iD);
        }
        return null;
    }

    public static final void g() {
        throw new ConcurrentModificationException();
    }

    public static final void h(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 3] = i2;
    }

    public static final void i(int[] iArr, int i, int i2) {
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List j(bdj bdjVar, int i, bdj bdjVar2, boolean z, boolean z2, boolean z3) {
        yhb yhbVar;
        boolean zR;
        int i2;
        int i3;
        int i4 = bdjVar.i(i);
        int i5 = i + i4;
        int iB = bdjVar.b(i);
        int iB2 = bdjVar.b(i5);
        int i6 = iB2 - iB;
        boolean z4 = i >= 0 && (bdjVar.b[(bdjVar.g(i) * 5) + 1] & 201326592) != 0;
        bdjVar2.B(i4);
        bdjVar2.C(i6, bdjVar2.o);
        if (bdjVar.f < i5) {
            bdjVar.D(i5);
        }
        if (bdjVar.j < iB2) {
            bdjVar.E(iB2, i5);
        }
        int[] iArr = bdjVar2.b;
        int i7 = bdjVar2.o;
        int i8 = i7 * 5;
        yfm.bh(bdjVar.b, iArr, i8, i * 5, i5 * 5);
        Object[] objArr = bdjVar2.c;
        int i9 = bdjVar2.h;
        System.arraycopy(bdjVar.c, iB, objArr, i9, i6);
        int i10 = bdjVar2.q;
        iArr[i8 + 2] = i10;
        int i11 = i7 - i;
        int i12 = i7 + i4;
        int iC = i9 - bdjVar2.c(iArr, i7);
        int i13 = bdjVar2.l;
        int i14 = bdjVar2.k;
        int length = objArr.length;
        boolean z5 = z4;
        int i15 = i13;
        int i16 = i7;
        while (i16 < i12) {
            int i17 = i16 * 5;
            if (i16 != i7) {
                int i18 = i17 + 2;
                iArr[i18] = iArr[i18] + i11;
            }
            int[] iArr2 = iArr;
            int iC2 = bdjVar2.c(iArr, i16) + iC;
            if (i15 < i16) {
                i2 = i7;
                i3 = 0;
            } else {
                i2 = i7;
                i3 = bdjVar2.j;
            }
            iArr2[i17 + 4] = bdj.T(iC2, i3, i14, length);
            if (i16 == i15) {
                i15++;
            }
            i16++;
            i7 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        bdjVar2.l = i15;
        int iB3 = b(bdjVar.d, i, bdjVar.f());
        int iB4 = b(bdjVar.d, i5, bdjVar.f());
        if (iB3 < iB4) {
            ArrayList arrayList = bdjVar.d;
            ArrayList arrayList2 = new ArrayList(iB4 - iB3);
            for (int i19 = iB3; i19 < iB4; i19++) {
                bac bacVar = (bac) arrayList.get(i19);
                bacVar.a += i11;
                arrayList2.add(bacVar);
            }
            bdjVar2.d.addAll(b(bdjVar2.d, bdjVar2.o, bdjVar2.f()), arrayList2);
            arrayList.subList(iB3, iB4).clear();
            yhbVar = arrayList2;
        } else {
            yhbVar = yhb.a;
        }
        if (!yhbVar.isEmpty()) {
            HashMap map = bdjVar.e;
            HashMap map2 = bdjVar2.e;
            if (map != null && map2 != null) {
                int size = yhbVar.size();
                for (int i20 = 0; i20 < size; i20++) {
                    bac bacVar2 = (bac) yhbVar.get(i20);
                    bcm bcmVar = (bcm) map.get(bacVar2);
                    if (bcmVar != null) {
                        map.remove(bacVar2);
                        map2.put(bacVar2, bcmVar);
                    }
                }
            }
        }
        int i21 = bdjVar2.q;
        if (bdjVar2.Y(i10) != null) {
            int iA = i21 + 1;
            int i22 = bdjVar2.o;
            while (iA < i22) {
                iA += a(bdjVar2.b, iA);
            }
            throw null;
        }
        int iK = bdjVar.k(i);
        if (z3) {
            if (z) {
                boolean z6 = iK >= 0;
                if (z6) {
                    bdjVar.J();
                    bdjVar.u(iK - bdjVar.o);
                    bdjVar.J();
                }
                bdjVar.u(i - bdjVar.o);
                zR = bdjVar.R();
                if (z6) {
                    bdjVar.H();
                    bdjVar.U();
                    bdjVar.H();
                    bdjVar.U();
                }
            } else {
                boolean zS = bdjVar.S(i, i4);
                bdjVar.G(iB, i6, i - 1);
                zR = zS;
            }
            if (zR) {
                bau.i("Unexpectedly removed anchors");
            }
        }
        int i23 = bdjVar2.n;
        int i24 = iArr3[i8 + 1];
        bdjVar2.n = i23 + ((1073741824 & i24) != 0 ? 1 : i24 & 67108863);
        if (z2) {
            bdjVar2.o = i12;
            bdjVar2.h = i9 + i6;
        }
        if (z5) {
            bdjVar2.N(i10);
        }
        return yhbVar;
    }

    public static final bdy l(Object obj, yjz yjzVar, bao baoVar) {
        Object objG = baoVar.g();
        Object obj2 = ban.a;
        if (objG == obj2) {
            bci bciVar = new bci(obj, bcz.c);
            baoVar.A(bciVar);
            objG = bciVar;
        }
        bcb bcbVar = (bcb) objG;
        ygi ygiVar = ygi.a;
        boolean zH = baoVar.H(yjzVar);
        Object objG2 = baoVar.g();
        if (zH || objG2 == obj2) {
            objG2 = new uc(yjzVar, bcbVar, (yih) null, 7);
            baoVar.A(objG2);
        }
        bbn.f(ygiVar, (yjz) objG2, baoVar);
        return bcbVar;
    }

    public static final bdy m(yva yvaVar, bao baoVar) {
        return a.bT(yvaVar, yvaVar.d(), yim.a, baoVar, 0);
    }

    public static final int n(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | i2 | (i3 >> 1) | ((i2 + i2) & i3);
    }

    public static final void o(bdj bdjVar, List list, bcs bcsVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = bdjVar.a((bac) list.get(i));
            int iM = bdjVar.m(bdjVar.b, bdjVar.g(iA));
            Object obj = iM < bdjVar.c(bdjVar.b, bdjVar.g(iA + 1)) ? bdjVar.c[bdjVar.d(iM)] : ban.a;
            bcr bcrVar = obj instanceof bcr ? (bcr) obj : null;
            if (bcrVar != null) {
                bcrVar.b = bcsVar;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(bdi bdiVar) {
        yvc yvcVar;
        bhj bhjVar;
        bhj bhjVar2;
        do {
            yvcVar = bcy.k;
            bhjVar = (bhj) yvcVar.d();
            bgu bguVarB = bhjVar.d;
            bhi bhiVar = (bhi) bguVarB.get(bdiVar);
            if (bhiVar == null) {
                bhjVar2 = bhjVar;
            } else {
                bhc bhcVar = bguVarB.b;
                bhc bhcVarI = bhcVar.i(bdiVar != null ? bdiVar.hashCode() : 0, bdiVar, 0);
                if (bhcVar != bhcVarI) {
                    bguVarB = bhcVarI == null ? bgu.a : new bgu(bhcVarI, bguVarB.a() - 1);
                }
                if (bhiVar.c()) {
                    Object obj = bhiVar.a;
                    V v = bguVarB.get(obj);
                    v.getClass();
                    bguVarB = bguVarB.b(obj, ((bhi) v).a(bhiVar.b));
                }
                if (bhiVar.b()) {
                    Object obj2 = bhiVar.b;
                    V v2 = bguVarB.get(obj2);
                    v2.getClass();
                    bguVarB = bguVarB.b(obj2, new bhi(bhiVar.a, ((bhi) v2).b));
                }
                bhjVar2 = new bhj(!bhiVar.c() ? bhiVar.b : bhjVar.b, !bhiVar.b() ? bhiVar.a : bhjVar.c, bguVarB);
            }
            if (bhjVar == bhjVar2) {
                return;
            }
        } while (!yvcVar.f(bhjVar, bhjVar2));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0341 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27
  0x014a: PHI (r6v16 bkx) = (r6v15 bkx), (r6v18 bkx) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r20v2 cfs) = (r20v1 cfs), (r20v4 cfs) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r21v4 boolean) = (r21v3 boolean), (r21v6 boolean) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r22v4 blf) = (r22v3 blf), (r22v6 blf) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r23v4 java.lang.Boolean) = (r23v3 java.lang.Boolean), (r23v6 java.lang.Boolean) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r24v3 cez) = (r24v2 cez), (r24v5 cez) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r25v4 boolean) = (r25v3 boolean), (r25v6 boolean) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r26v4 java.lang.Integer) = (r26v3 java.lang.Integer), (r26v6 java.lang.Integer) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]
  0x014a: PHI (r27v2 cfy) = (r27v1 cfy), (r27v4 cfy) binds: [B:8:0x0047, B:58:0x0147] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q(android.view.ViewStructure r36, defpackage.bys r37, android.view.autofill.AutofillId r38, java.lang.String r39, defpackage.cfq r40) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdi.q(android.view.ViewStructure, bys, android.view.autofill.AutofillId, java.lang.String, cfq):void");
    }

    public static final blf r(String str) {
        return new bky(wcq.aj(str));
    }

    public static final String[] s(blf blfVar) {
        blfVar.getClass();
        return (String[]) ((bky) blfVar).a.toArray(new String[0]);
    }

    public static final void t(ViewStructure viewStructure) {
        viewStructure.setCheckable(true);
    }

    public static final void u(ViewStructure viewStructure, int i, String str) {
        viewStructure.setId(i, str, null, null);
    }

    public static final boolean v(cfc cfcVar) {
        return ki.e(cfcVar.c, cfb.g);
    }

    public static final boolean w(cfc cfcVar) {
        return ki.e(cfcVar.c, cfi.q);
    }

    public static final bkp x(bkp bkpVar, float f) {
        return bkpVar.a(new ZIndexElement(f));
    }

    public static Object y(bkn bknVar, Object obj, yjz yjzVar) {
        return yjzVar.a(obj, bknVar);
    }

    public static boolean z(bkn bknVar, yjv yjvVar) {
        return ((Boolean) yjvVar.a(bknVar)).booleanValue();
    }
}
