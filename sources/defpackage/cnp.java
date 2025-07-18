package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cnp {
    public static final cnx a;

    static {
        cni cniVar = cni.a;
        a = new cnx();
    }

    public static void A(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).B(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iAb = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAb += cld.ab(((Integer) list.get(i3)).intValue());
            }
            cldVar.C(iAb);
            while (i2 < list.size()) {
                cldVar.C(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        clu cluVar = (clu) list;
        if (!z) {
            while (i2 < cluVar.c) {
                ((cld) asvVar.a).B(i, cluVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iAb2 = 0;
        for (int i4 = 0; i4 < cluVar.c; i4++) {
            iAb2 += cld.ab(cluVar.e(i4));
        }
        cldVar2.C(iAb2);
        while (i2 < cluVar.c) {
            cldVar2.C(cluVar.e(i2));
            i2++;
        }
    }

    public static void B(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof cmp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAd += cld.ad(((Long) list.get(i3)).longValue());
            }
            cldVar.C(iAd);
            while (i2 < list.size()) {
                cldVar.E(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cmp cmpVar = (cmp) list;
        if (!z) {
            while (i2 < cmpVar.c) {
                ((cld) asvVar.a).D(i, cmpVar.a(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iAd2 = 0;
        for (int i4 = 0; i4 < cmpVar.c; i4++) {
            iAd2 += cld.ad(cmpVar.a(i4));
        }
        cldVar2.C(iAd2);
        while (i2 < cmpVar.c) {
            cldVar2.E(cmpVar.a(i2));
            i2++;
        }
    }

    static int a(List list) {
        return list.size() * 4;
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int i, Object obj, cno cnoVar) {
        return obj instanceof cmm ? cld.N(i, (cmm) obj) : cld.Z(i) + cld.R((cmz) obj, cnoVar);
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof clu)) {
            int iU = 0;
            while (i < size) {
                iU += cld.U(((Integer) list.get(i)).intValue());
                i++;
            }
            return iU;
        }
        clu cluVar = (clu) list;
        int iU2 = 0;
        while (i < size) {
            iU2 += cld.U(cluVar.e(i));
            i++;
        }
        return iU2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cmp)) {
            int iW = 0;
            while (i < size) {
                iW += cld.W(((Long) list.get(i)).longValue());
                i++;
            }
            return iW;
        }
        cmp cmpVar = (cmp) list;
        int iW2 = 0;
        while (i < size) {
            iW2 += cld.W(cmpVar.a(i));
            i++;
        }
        return iW2;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof clu)) {
            int iAb = 0;
            while (i < size) {
                iAb += cld.ab(((Integer) list.get(i)).intValue());
                i++;
            }
            return iAb;
        }
        clu cluVar = (clu) list;
        int iAb2 = 0;
        while (i < size) {
            iAb2 += cld.ab(cluVar.e(i));
            i++;
        }
        return iAb2;
    }

    static Object g(Object obj, int i, List list, cly clyVar, Object obj2, cnx cnxVar) {
        if (clyVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!clyVar.a(iIntValue)) {
                    obj2 = h(obj, i, iIntValue, obj2, cnxVar);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Integer num = (Integer) list.get(i3);
            int iIntValue2 = num.intValue();
            if (clyVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = h(obj, i, iIntValue2, obj2, cnxVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, cnx cnxVar) {
        if (obj2 == null) {
            obj2 = cnxVar.b(obj);
        }
        cnxVar.d(obj2, i, i2);
        return obj2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * cld.au(i);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * cld.av(i);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof clu)) {
            int iL = 0;
            while (i < size) {
                iL += cld.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        clu cluVar = (clu) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += cld.L(cluVar.e(i));
            i++;
        }
        return iL2;
    }

    public static /* synthetic */ int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cmp)) {
            int iAd = 0;
            while (i < size) {
                iAd += cld.ad(((Long) list.get(i)).longValue());
                i++;
            }
            return iAd;
        }
        cmp cmpVar = (cmp) list;
        int iAd2 = 0;
        while (i < size) {
            iAd2 += cld.ad(cmpVar.a(i));
            i++;
        }
        return iAd2;
    }

    static void m(Object obj, Object obj2) {
        clk clkVarBD = dnx.bD(obj2);
        if (clkVarBD.h()) {
            return;
        }
        clk clkVarBE = dnx.bE(obj);
        cnt cntVar = clkVarBD.b;
        int i = cntVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            clkVarBE.f(cntVar.d(i2));
        }
        Iterator it = cntVar.a().iterator();
        while (it.hasNext()) {
            clkVarBE.f((Map.Entry) it.next());
        }
    }

    static void n(Object obj, Object obj2) {
        cny cnyVarF = cnx.f(obj);
        cny cnyVarF2 = cnx.f(obj2);
        cny cnyVar = cny.a;
        if (!cnyVar.equals(cnyVarF2)) {
            if (cnyVar.equals(cnyVarF)) {
                int i = cnyVarF.b + cnyVarF2.b;
                int[] iArrCopyOf = Arrays.copyOf(cnyVarF.c, i);
                System.arraycopy(cnyVarF2.c, 0, iArrCopyOf, cnyVarF.b, cnyVarF2.b);
                Object[] objArrCopyOf = Arrays.copyOf(cnyVarF.d, i);
                System.arraycopy(cnyVarF2.d, 0, objArrCopyOf, cnyVarF.b, cnyVarF2.b);
                cnyVarF = new cny(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!cnyVarF2.equals(cnyVar)) {
                cnyVarF.b();
                int i2 = cnyVarF.b + cnyVarF2.b;
                cnyVarF.c(i2);
                System.arraycopy(cnyVarF2.c, 0, cnyVarF.c, cnyVarF.b, cnyVarF2.b);
                System.arraycopy(cnyVarF2.d, 0, cnyVarF.d, cnyVarF.b, cnyVarF2.b);
                cnyVarF.b = i2;
            }
        }
        cnx.g(obj, cnyVarF);
    }

    public static void o(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ckm)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).l(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        ckm ckmVar = (ckm) list;
        if (!z) {
            while (i2 < ckmVar.b) {
                ((cld) asvVar.a).l(i, ckmVar.f(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ckmVar.b; i6++) {
            ckmVar.f(i6);
            i5++;
        }
        cldVar2.C(i5);
        while (i2 < ckmVar.b) {
            cldVar2.j(ckmVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof cle)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).aj(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.ak(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        cle cleVar = (cle) list;
        if (!z) {
            while (i2 < cleVar.c) {
                ((cld) asvVar.a).aj(i, cleVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cleVar.c; i6++) {
            cleVar.e(i6);
            i5 += 8;
        }
        cldVar2.C(i5);
        while (i2 < cleVar.c) {
            cldVar2.ak(cleVar.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += cld.L(((Integer) list.get(i3)).intValue());
            }
            cldVar.C(iL);
            while (i2 < list.size()) {
                cldVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        clu cluVar = (clu) list;
        if (!z) {
            while (i2 < cluVar.c) {
                ((cld) asvVar.a).s(i, cluVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < cluVar.c; i4++) {
            iL2 += cld.L(cluVar.e(i4));
        }
        cldVar2.C(iL2);
        while (i2 < cluVar.c) {
            cldVar2.t(cluVar.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        clu cluVar = (clu) list;
        if (!z) {
            while (i2 < cluVar.c) {
                ((cld) asvVar.a).o(i, cluVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cluVar.c; i6++) {
            cluVar.e(i6);
            i5 += 4;
        }
        cldVar2.C(i5);
        while (i2 < cluVar.c) {
            cldVar2.p(cluVar.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof cmp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cmp cmpVar = (cmp) list;
        if (!z) {
            while (i2 < cmpVar.c) {
                ((cld) asvVar.a).q(i, cmpVar.a(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cmpVar.c; i6++) {
            cmpVar.a(i6);
            i5 += 8;
        }
        cldVar2.C(i5);
        while (i2 < cmpVar.c) {
            cldVar2.r(cmpVar.a(i2));
            i2++;
        }
    }

    public static void t(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clm)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).al(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.am(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        clm clmVar = (clm) list;
        if (!z) {
            while (i2 < clmVar.c) {
                ((cld) asvVar.a).al(i, clmVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < clmVar.c; i6++) {
            clmVar.e(i6);
            i5 += 4;
        }
        cldVar2.C(i5);
        while (i2 < clmVar.c) {
            cldVar2.am(clmVar.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).s(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += cld.L(((Integer) list.get(i3)).intValue());
            }
            cldVar.C(iL);
            while (i2 < list.size()) {
                cldVar.t(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        clu cluVar = (clu) list;
        if (!z) {
            while (i2 < cluVar.c) {
                ((cld) asvVar.a).s(i, cluVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < cluVar.c; i4++) {
            iL2 += cld.L(cluVar.e(i4));
        }
        cldVar2.C(iL2);
        while (i2 < cluVar.c) {
            cldVar2.t(cluVar.e(i2));
            i2++;
        }
    }

    public static void v(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof cmp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).D(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iAd = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAd += cld.ad(((Long) list.get(i3)).longValue());
            }
            cldVar.C(iAd);
            while (i2 < list.size()) {
                cldVar.E(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cmp cmpVar = (cmp) list;
        if (!z) {
            while (i2 < cmpVar.c) {
                ((cld) asvVar.a).D(i, cmpVar.a(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iAd2 = 0;
        for (int i4 = 0; i4 < cmpVar.c; i4++) {
            iAd2 += cld.ad(cmpVar.a(i4));
        }
        cldVar2.C(iAd2);
        while (i2 < cmpVar.c) {
            cldVar2.E(cmpVar.a(i2));
            i2++;
        }
    }

    public static void w(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).o(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.p(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        clu cluVar = (clu) list;
        if (!z) {
            while (i2 < cluVar.c) {
                ((cld) asvVar.a).o(i, cluVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cluVar.c; i6++) {
            cluVar.e(i6);
            i5 += 4;
        }
        cldVar2.C(i5);
        while (i2 < cluVar.c) {
            cldVar2.p(cluVar.e(i2));
            i2++;
        }
    }

    public static void x(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof cmp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).q(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            cldVar.C(i3);
            while (i2 < list.size()) {
                cldVar.r(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cmp cmpVar = (cmp) list;
        if (!z) {
            while (i2 < cmpVar.c) {
                ((cld) asvVar.a).q(i, cmpVar.a(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < cmpVar.c; i6++) {
            cmpVar.a(i6);
            i5 += 8;
        }
        cldVar2.C(i5);
        while (i2 < cmpVar.c) {
            cldVar2.r(cmpVar.a(i2));
            i2++;
        }
    }

    public static void y(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof clu)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).ao(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iU = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iU += cld.U(((Integer) list.get(i3)).intValue());
            }
            cldVar.C(iU);
            while (i2 < list.size()) {
                cldVar.ap(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        clu cluVar = (clu) list;
        if (!z) {
            while (i2 < cluVar.c) {
                ((cld) asvVar.a).ao(i, cluVar.e(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iU2 = 0;
        for (int i4 = 0; i4 < cluVar.c; i4++) {
            iU2 += cld.U(cluVar.e(i4));
        }
        cldVar2.C(iU2);
        while (i2 < cluVar.c) {
            cldVar2.ap(cluVar.e(i2));
            i2++;
        }
    }

    public static void z(int i, List list, asv asvVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof cmp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((cld) asvVar.a).aq(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            cld cldVar = (cld) asvVar.a;
            cldVar.A(i, 2);
            int iW = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iW += cld.W(((Long) list.get(i3)).longValue());
            }
            cldVar.C(iW);
            while (i2 < list.size()) {
                cldVar.ar(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        cmp cmpVar = (cmp) list;
        if (!z) {
            while (i2 < cmpVar.c) {
                ((cld) asvVar.a).aq(i, cmpVar.a(i2));
                i2++;
            }
            return;
        }
        cld cldVar2 = (cld) asvVar.a;
        cldVar2.A(i, 2);
        int iW2 = 0;
        for (int i4 = 0; i4 < cmpVar.c; i4++) {
            iW2 += cld.W(cmpVar.a(i4));
        }
        cldVar2.C(iW2);
        while (i2 < cmpVar.c) {
            cldVar2.ar(cmpVar.a(i2));
            i2++;
        }
    }
}
