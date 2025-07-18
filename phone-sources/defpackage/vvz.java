package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vvz {
    public static final vwg a;

    static {
        vvs vvsVar = vvs.a;
        a = new vwg();
    }

    public static void A(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vud)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).C(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iAc = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAc += vtj.ac(((Integer) list.get(i3)).intValue());
            }
            vtjVar.D(iAc);
            while (i2 < list.size()) {
                vtjVar.D(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vud vudVar = (vud) list;
        if (!z) {
            while (i2 < vudVar.c) {
                ((vtj) ulpVar.a).C(i, vudVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iAc2 = 0;
        for (int i4 = 0; i4 < vudVar.c; i4++) {
            iAc2 += vtj.ac(vudVar.e(i4));
        }
        vtjVar2.D(iAc2);
        while (i2 < vudVar.c) {
            vtjVar2.D(vudVar.e(i2));
            i2++;
        }
    }

    public static void B(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vuz)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).E(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iAe = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAe += vtj.ae(((Long) list.get(i3)).longValue());
            }
            vtjVar.D(iAe);
            while (i2 < list.size()) {
                vtjVar.F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vuz vuzVar = (vuz) list;
        if (!z) {
            while (i2 < vuzVar.c) {
                ((vtj) ulpVar.a).E(i, vuzVar.a(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iAe2 = 0;
        for (int i4 = 0; i4 < vuzVar.c; i4++) {
            iAe2 += vtj.ae(vuzVar.a(i4));
        }
        vtjVar2.D(iAe2);
        while (i2 < vuzVar.c) {
            vtjVar2.F(vuzVar.a(i2));
            i2++;
        }
    }

    static int a(List list) {
        return list.size() * 4;
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int i, Object obj, vvy vvyVar) {
        return obj instanceof vuw ? vtj.O(i, (vuw) obj) : vtj.aa(i) + vtj.S((vvj) obj, vvyVar);
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vud)) {
            int iV = 0;
            while (i < size) {
                iV += vtj.V(((Integer) list.get(i)).intValue());
                i++;
            }
            return iV;
        }
        vud vudVar = (vud) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += vtj.V(vudVar.e(i));
            i++;
        }
        return iV2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vuz)) {
            int iX = 0;
            while (i < size) {
                iX += vtj.X(((Long) list.get(i)).longValue());
                i++;
            }
            return iX;
        }
        vuz vuzVar = (vuz) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += vtj.X(vuzVar.a(i));
            i++;
        }
        return iX2;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vud)) {
            int iAc = 0;
            while (i < size) {
                iAc += vtj.ac(((Integer) list.get(i)).intValue());
                i++;
            }
            return iAc;
        }
        vud vudVar = (vud) list;
        int iAc2 = 0;
        while (i < size) {
            iAc2 += vtj.ac(vudVar.e(i));
            i++;
        }
        return iAc2;
    }

    static Object g(Object obj, int i, List list, vuh vuhVar, Object obj2, vwg vwgVar) {
        if (vuhVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!vuhVar.a(iIntValue)) {
                    obj2 = h(obj, i, iIntValue, obj2, vwgVar);
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
            if (vuhVar.a(iIntValue2)) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = h(obj, i, iIntValue2, obj2, vwgVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, vwg vwgVar) {
        if (obj2 == null) {
            obj2 = vwgVar.b(obj);
        }
        vwgVar.d(obj2, i, i2);
        return obj2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * vtj.av(i);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * vtj.aw(i);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vud)) {
            int iM = 0;
            while (i < size) {
                iM += vtj.M(((Integer) list.get(i)).intValue());
                i++;
            }
            return iM;
        }
        vud vudVar = (vud) list;
        int iM2 = 0;
        while (i < size) {
            iM2 += vtj.M(vudVar.e(i));
            i++;
        }
        return iM2;
    }

    public static /* synthetic */ int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof vuz)) {
            int iAe = 0;
            while (i < size) {
                iAe += vtj.ae(((Long) list.get(i)).longValue());
                i++;
            }
            return iAe;
        }
        vuz vuzVar = (vuz) list;
        int iAe2 = 0;
        while (i < size) {
            iAe2 += vtj.ae(vuzVar.a(i));
            i++;
        }
        return iAe2;
    }

    static void m(Object obj, Object obj2) {
        vtr vtrVarW = vxr.W(obj2);
        if (vtrVarW.h()) {
            return;
        }
        vtr vtrVarX = vxr.X(obj);
        vwc vwcVar = vtrVarW.b;
        int i = vwcVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            vtrVarX.f(vwcVar.d(i2));
        }
        Iterator it = vwcVar.a().iterator();
        while (it.hasNext()) {
            vtrVarX.f((Map.Entry) it.next());
        }
    }

    static void n(Object obj, Object obj2) {
        vwh vwhVarF = vwg.f(obj);
        vwh vwhVarF2 = vwg.f(obj2);
        vwh vwhVar = vwh.a;
        if (!vwhVar.equals(vwhVarF2)) {
            if (vwhVar.equals(vwhVarF)) {
                int i = vwhVarF.b + vwhVarF2.b;
                int[] iArrCopyOf = Arrays.copyOf(vwhVarF.c, i);
                System.arraycopy(vwhVarF2.c, 0, iArrCopyOf, vwhVarF.b, vwhVarF2.b);
                Object[] objArrCopyOf = Arrays.copyOf(vwhVarF.d, i);
                System.arraycopy(vwhVarF2.d, 0, objArrCopyOf, vwhVarF.b, vwhVarF2.b);
                vwhVarF = new vwh(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!vwhVarF2.equals(vwhVar)) {
                vwhVarF.b();
                int i2 = vwhVarF.b + vwhVarF2.b;
                vwhVarF.c(i2);
                System.arraycopy(vwhVarF2.c, 0, vwhVarF.c, vwhVarF.b, vwhVarF2.b);
                System.arraycopy(vwhVarF2.d, 0, vwhVarF.d, vwhVarF.b, vwhVarF2.b);
                vwhVarF.b = i2;
            }
        }
        vwg.g(obj, vwhVarF);
    }

    public static void o(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vsp)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).m(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.k(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        vsp vspVar = (vsp) list;
        if (!z) {
            while (i2 < vspVar.b) {
                ((vtj) ulpVar.a).m(i, vspVar.f(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vspVar.b; i6++) {
            vspVar.f(i6);
            i5++;
        }
        vtjVar2.D(i5);
        while (i2 < vspVar.b) {
            vtjVar2.k(vspVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vtk)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).ak(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.al(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        vtk vtkVar = (vtk) list;
        if (!z) {
            while (i2 < vtkVar.c) {
                ((vtj) ulpVar.a).ak(i, vtkVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vtkVar.c; i6++) {
            vtkVar.e(i6);
            i5 += 8;
        }
        vtjVar2.D(i5);
        while (i2 < vtkVar.c) {
            vtjVar2.al(vtkVar.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vud)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM += vtj.M(((Integer) list.get(i3)).intValue());
            }
            vtjVar.D(iM);
            while (i2 < list.size()) {
                vtjVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vud vudVar = (vud) list;
        if (!z) {
            while (i2 < vudVar.c) {
                ((vtj) ulpVar.a).t(i, vudVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < vudVar.c; i4++) {
            iM2 += vtj.M(vudVar.e(i4));
        }
        vtjVar2.D(iM2);
        while (i2 < vudVar.c) {
            vtjVar2.u(vudVar.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vud)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vud vudVar = (vud) list;
        if (!z) {
            while (i2 < vudVar.c) {
                ((vtj) ulpVar.a).p(i, vudVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vudVar.c; i6++) {
            vudVar.e(i6);
            i5 += 4;
        }
        vtjVar2.D(i5);
        while (i2 < vudVar.c) {
            vtjVar2.q(vudVar.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vuz)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).r(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.s(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vuz vuzVar = (vuz) list;
        if (!z) {
            while (i2 < vuzVar.c) {
                ((vtj) ulpVar.a).r(i, vuzVar.a(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vuzVar.c; i6++) {
            vuzVar.a(i6);
            i5 += 8;
        }
        vtjVar2.D(i5);
        while (i2 < vuzVar.c) {
            vtjVar2.s(vuzVar.a(i2));
            i2++;
        }
    }

    public static void t(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vtt)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).am(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.an(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        vtt vttVar = (vtt) list;
        if (!z) {
            while (i2 < vttVar.c) {
                ((vtj) ulpVar.a).am(i, vttVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vttVar.c; i6++) {
            vttVar.e(i6);
            i5 += 4;
        }
        vtjVar2.D(i5);
        while (i2 < vttVar.c) {
            vtjVar2.an(vttVar.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vud)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).t(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iM = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iM += vtj.M(((Integer) list.get(i3)).intValue());
            }
            vtjVar.D(iM);
            while (i2 < list.size()) {
                vtjVar.u(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vud vudVar = (vud) list;
        if (!z) {
            while (i2 < vudVar.c) {
                ((vtj) ulpVar.a).t(i, vudVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iM2 = 0;
        for (int i4 = 0; i4 < vudVar.c; i4++) {
            iM2 += vtj.M(vudVar.e(i4));
        }
        vtjVar2.D(iM2);
        while (i2 < vudVar.c) {
            vtjVar2.u(vudVar.e(i2));
            i2++;
        }
    }

    public static void v(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vuz)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).E(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iAe = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAe += vtj.ae(((Long) list.get(i3)).longValue());
            }
            vtjVar.D(iAe);
            while (i2 < list.size()) {
                vtjVar.F(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vuz vuzVar = (vuz) list;
        if (!z) {
            while (i2 < vuzVar.c) {
                ((vtj) ulpVar.a).E(i, vuzVar.a(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iAe2 = 0;
        for (int i4 = 0; i4 < vuzVar.c; i4++) {
            iAe2 += vtj.ae(vuzVar.a(i4));
        }
        vtjVar2.D(iAe2);
        while (i2 < vuzVar.c) {
            vtjVar2.F(vuzVar.a(i2));
            i2++;
        }
    }

    public static void w(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vud)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).p(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.q(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vud vudVar = (vud) list;
        if (!z) {
            while (i2 < vudVar.c) {
                ((vtj) ulpVar.a).p(i, vudVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vudVar.c; i6++) {
            vudVar.e(i6);
            i5 += 4;
        }
        vtjVar2.D(i5);
        while (i2 < vudVar.c) {
            vtjVar2.q(vudVar.e(i2));
            i2++;
        }
    }

    public static void x(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vuz)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).r(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            vtjVar.D(i3);
            while (i2 < list.size()) {
                vtjVar.s(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vuz vuzVar = (vuz) list;
        if (!z) {
            while (i2 < vuzVar.c) {
                ((vtj) ulpVar.a).r(i, vuzVar.a(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < vuzVar.c; i6++) {
            vuzVar.a(i6);
            i5 += 8;
        }
        vtjVar2.D(i5);
        while (i2 < vuzVar.c) {
            vtjVar2.s(vuzVar.a(i2));
            i2++;
        }
    }

    public static void y(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vud)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).ap(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += vtj.V(((Integer) list.get(i3)).intValue());
            }
            vtjVar.D(iV);
            while (i2 < list.size()) {
                vtjVar.aq(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        vud vudVar = (vud) list;
        if (!z) {
            while (i2 < vudVar.c) {
                ((vtj) ulpVar.a).ap(i, vudVar.e(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < vudVar.c; i4++) {
            iV2 += vtj.V(vudVar.e(i4));
        }
        vtjVar2.D(iV2);
        while (i2 < vudVar.c) {
            vtjVar2.aq(vudVar.e(i2));
            i2++;
        }
    }

    public static void z(int i, List list, ulp ulpVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof vuz)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((vtj) ulpVar.a).ar(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            vtj vtjVar = (vtj) ulpVar.a;
            vtjVar.B(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += vtj.X(((Long) list.get(i3)).longValue());
            }
            vtjVar.D(iX);
            while (i2 < list.size()) {
                vtjVar.as(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        vuz vuzVar = (vuz) list;
        if (!z) {
            while (i2 < vuzVar.c) {
                ((vtj) ulpVar.a).ar(i, vuzVar.a(i2));
                i2++;
            }
            return;
        }
        vtj vtjVar2 = (vtj) ulpVar.a;
        vtjVar2.B(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < vuzVar.c; i4++) {
            iX2 += vtj.X(vuzVar.a(i4));
        }
        vtjVar2.D(iX2);
        while (i2 < vuzVar.c) {
            vtjVar2.as(vuzVar.a(i2));
            i2++;
        }
    }
}
