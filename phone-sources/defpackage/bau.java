package defpackage;

import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bau {
    public static final Object a = new bcd("provider");
    public static final Object b = new bcd("provider");
    public static final Object c = new bcd("compositionLocalMap");
    public static final Object d = new bcd("providers");
    public static final Object e = new bcd("reference");
    public static final Comparator f = new ade(2);

    public static final int a(boolean z) {
        return z ? 1 : 0;
    }

    public static final int b(bdf bdfVar, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = bdfVar.e(i);
            i3++;
        }
        return i3;
    }

    public static final int c(List list, int i) {
        int iD = d(list, i);
        return iD < 0 ? -(iD + 1) : iD;
    }

    public static final int d(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iA = yks.a(((bbq) list.get(i3)).a, i);
            if (iA < 0) {
                i2 = i3 + 1;
            } else {
                if (iA <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final bbq e(List list, int i, int i2) {
        int iC = c(list, i);
        if (iC >= list.size()) {
            return null;
        }
        bbq bbqVar = (bbq) list.get(iC);
        if (bbqVar.a < i2) {
            return bbqVar;
        }
        return null;
    }

    public static final bbq f(List list, int i) {
        int iD = d(list, i);
        if (iD >= 0) {
            return (bbq) list.remove(iD);
        }
        return null;
    }

    public static final Void g(String str) {
        throw new bal(a.cg(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void h(bdf bdfVar, List list, int i) {
        if (bdfVar.B(i)) {
            list.add(bdfVar.o(i));
            return;
        }
        int iC = i + 1;
        int iC2 = i + bdfVar.c(i);
        while (iC < iC2) {
            h(bdfVar, list, iC);
            iC += bdfVar.c(iC);
        }
    }

    public static final void i(String str) {
        throw new bal(a.cg(str, "Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void j(bdj bdjVar, int i, Object obj) {
        int iD = bdjVar.d(i);
        Object[] objArr = bdjVar.c;
        Object obj2 = objArr[iD];
        objArr[iD] = ban.a;
        if (obj == obj2) {
            return;
        }
        i("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void k(List list, int i, int i2) {
        int iC = c(list, i);
        while (iC < list.size() && ((bbq) list.get(iC)).a < i2) {
        }
    }

    public static final boolean l(int i) {
        return i != 0;
    }

    public static final void m(bdj bdjVar, bhx bhxVar) {
        bdjVar.A(bdjVar.o, new aaw(bhxVar, bdjVar, 6));
    }

    public static final void n(bdj bdjVar, bhx bhxVar) {
        bdjVar.A(bdjVar.o, new xa(bhxVar, 11));
        bdjVar.R();
    }

    public static final cb o(baz bazVar, bca bcaVar, bdj bdjVar, bad badVar) {
        bdg bdgVar = new bdg();
        if (bdjVar.e != null) {
            bdgVar.e();
        }
        if (bdjVar.s != null) {
            bdgVar.d();
        }
        int i = bdjVar.o;
        if (badVar != null && bdjVar.j(i) > 0) {
            int iK = bdjVar.q;
            while (iK > 0 && !bdjVar.Q(iK)) {
                iK = bdjVar.k(iK);
            }
            if (iK >= 0 && bdjVar.Q(iK)) {
                Object objS = bdjVar.s(iK);
                int i2 = iK + 1;
                int i3 = iK + bdjVar.i(iK);
                int iJ = 0;
                while (i2 < i3) {
                    int i4 = bdjVar.i(i2) + i2;
                    if (i4 > i) {
                        break;
                    }
                    iJ += bdjVar.Q(i2) ? 1 : bdjVar.j(i2);
                    i2 = i4;
                }
                int iJ2 = bdjVar.Q(i) ? 1 : bdjVar.j(i);
                badVar.d(objS);
                badVar.l(iJ, iJ2);
                badVar.h();
            }
        }
        bdj bdjVarC = bdgVar.c();
        try {
            bdjVarC.v();
            bdjVarC.K(126665345, bcaVar.a);
            bdj.V(bdjVarC);
            bdjVarC.X(bcaVar.b);
            bac bacVar = bcaVar.d;
            if (bdjVarC.m <= 0) {
                i("Check failed");
            }
            if (bdjVar.m != 0) {
                i("Check failed");
            }
            if (!bacVar.a()) {
                i("Check failed");
            }
            int iA = bdjVar.a(bacVar) + 1;
            int i5 = bdjVar.o;
            if (i5 > iA || iA >= bdjVar.p) {
                i("Check failed");
            }
            int iK2 = bdjVar.k(iA);
            int i6 = bdjVar.i(iA);
            int iJ3 = bdjVar.Q(iA) ? 1 : bdjVar.j(iA);
            List listJ = bdi.j(bdjVar, iA, bdjVarC, false, false, true);
            bdjVar.N(iK2);
            boolean z = iJ3 > 0;
            while (iK2 >= i5) {
                int iG = bdjVar.g(iK2);
                int[] iArr = bdjVar.b;
                bdi.h(iArr, iG, bdi.a(iArr, iG) - i6);
                if (z) {
                    int[] iArr2 = bdjVar.b;
                    int i7 = iArr2[(iG * 5) + 1];
                    if ((1073741824 & i7) != 0) {
                        z = false;
                    } else {
                        bdi.i(iArr2, iG, (i7 & 67108863) - iJ3);
                        z = true;
                    }
                } else {
                    z = false;
                }
                iK2 = bdjVar.k(iK2);
            }
            if (z) {
                if (bdjVar.n < iJ3) {
                    i("Check failed");
                }
                bdjVar.n -= iJ3;
            }
            bdjVarC.l();
            bdjVarC.U();
            bdjVarC.x();
            bdjVarC.w(true);
            cb cbVar = new cb(bdgVar, (byte[]) null);
            if (!listJ.isEmpty()) {
                int size = listJ.size();
                for (int i8 = 0; i8 < size; i8++) {
                    bac bacVar2 = (bac) listJ.get(i8);
                    if (bdgVar.f(bacVar2)) {
                        int iA2 = bdgVar.a(bacVar2);
                        int iE = bdi.e(bdgVar.a, iA2);
                        int i9 = iA2 + 1;
                        if (((i9 < bdgVar.b ? bdgVar.a[(i9 * 5) + 4] : bdgVar.c.length) - iE > 0 ? bdgVar.c[iE] : ban.a) instanceof bcr) {
                            bat batVar = new bat(bazVar, bcaVar);
                            bdjVarC = bdgVar.c();
                            try {
                                bdi.o(bdjVarC, listJ, batVar);
                                bdjVarC.w(true);
                                return cbVar;
                            } finally {
                            }
                        }
                    }
                }
            }
            return cbVar;
        } finally {
        }
    }
}
