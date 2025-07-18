package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dql {
    public static final Class a;
    public static final dqt b;
    public static final dqt c;

    static {
        Class<?> cls;
        Class<?> cls2;
        dqh dqhVar = dqh.a;
        dqt dqtVar = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                dqtVar = (dqt) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = dqtVar;
        c = new dqt();
    }

    public static void A(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).y(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int iV = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iV += dot.V(((Integer) list.get(i3)).intValue());
            }
            dotVar.z(iV);
            while (i2 < list.size()) {
                dotVar.z(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dpg dpgVar = (dpg) list;
        if (!z) {
            while (i2 < dpgVar.a) {
                ((dot) dhqVar.a).y(i, dpgVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int iV2 = 0;
        for (int i4 = 0; i4 < dpgVar.a; i4++) {
            iV2 += dot.V(dpgVar.e(i4));
        }
        dotVar2.z(iV2);
        while (i2 < dpgVar.a) {
            dotVar2.z(dpgVar.e(i2));
            i2++;
        }
    }

    public static void B(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpr)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).A(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += dot.X(((Long) list.get(i3)).longValue());
            }
            dotVar.z(iX);
            while (i2 < list.size()) {
                dotVar.B(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dpr dprVar = (dpr) list;
        if (!z) {
            while (i2 < dprVar.a) {
                ((dot) dhqVar.a).A(i, dprVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < dprVar.a; i4++) {
            iX2 += dot.X(dprVar.e(i4));
        }
        dotVar2.z(iX2);
        while (i2 < dprVar.a) {
            dotVar2.B(dprVar.e(i2));
            i2++;
        }
    }

    static int a(List list) {
        return list.size() * 4;
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int i, Object obj, dqk dqkVar) {
        int iT;
        int iM;
        if (obj instanceof dpo) {
            iT = dot.T(i);
            iM = dot.K((dpo) obj);
        } else {
            iT = dot.T(i);
            iM = dot.M((dqa) obj, dqkVar);
        }
        return iT + iM;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dpg)) {
            int iO = 0;
            while (i < size) {
                iO += dot.O(((Integer) list.get(i)).intValue());
                i++;
            }
            return iO;
        }
        dpg dpgVar = (dpg) list;
        int iO2 = 0;
        while (i < size) {
            iO2 += dot.O(dpgVar.e(i));
            i++;
        }
        return iO2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dpr)) {
            int iQ = 0;
            while (i < size) {
                iQ += dot.Q(((Long) list.get(i)).longValue());
                i++;
            }
            return iQ;
        }
        dpr dprVar = (dpr) list;
        int iQ2 = 0;
        while (i < size) {
            iQ2 += dot.Q(dprVar.e(i));
            i++;
        }
        return iQ2;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dpg)) {
            int iV = 0;
            while (i < size) {
                iV += dot.V(((Integer) list.get(i)).intValue());
                i++;
            }
            return iV;
        }
        dpg dpgVar = (dpg) list;
        int iV2 = 0;
        while (i < size) {
            iV2 += dot.V(dpgVar.e(i));
            i++;
        }
        return iV2;
    }

    static Object g(Object obj, int i, List list, dpi dpiVar, Object obj2, dqt dqtVar) {
        if (dpiVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!dpiVar.a()) {
                    obj2 = h(obj, i, iIntValue, obj2, dqtVar);
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
            if (dpiVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = h(obj, i, iIntValue2, obj2, dqtVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, dqt dqtVar) {
        if (obj2 == null) {
            obj2 = dqtVar.b(obj);
        }
        dqtVar.d(obj2, i, i2);
        return obj2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dot.al(i);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * dot.am(i);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dpg)) {
            int I = 0;
            while (i < size) {
                I += dot.I(((Integer) list.get(i)).intValue());
                i++;
            }
            return I;
        }
        dpg dpgVar = (dpg) list;
        int I2 = 0;
        while (i < size) {
            I2 += dot.I(dpgVar.e(i));
            i++;
        }
        return I2;
    }

    public static /* synthetic */ int l(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dpr)) {
            int iX = 0;
            while (i < size) {
                iX += dot.X(((Long) list.get(i)).longValue());
                i++;
            }
            return iX;
        }
        dpr dprVar = (dpr) list;
        int iX2 = 0;
        while (i < size) {
            iX2 += dot.X(dprVar.e(i));
            i++;
        }
        return iX2;
    }

    static void m(Object obj, Object obj2) {
        doz dozVarI = cws.i(obj2);
        if (dozVarI.e()) {
            return;
        }
        doz dozVarJ = cws.j(obj);
        dqq dqqVar = dozVarI.b;
        int iA = dqqVar.a();
        for (int i = 0; i < iA; i++) {
            dozVarJ.d(dqqVar.e(i));
        }
        Iterator it = dqqVar.b().iterator();
        while (it.hasNext()) {
            dozVarJ.d((Map.Entry) it.next());
        }
    }

    static void n(Object obj, Object obj2) {
        dqu dquVarF = dqt.f(obj);
        dqu dquVarF2 = dqt.f(obj2);
        dqu dquVar = dqu.a;
        if (!dquVar.equals(dquVarF2)) {
            if (dquVar.equals(dquVarF)) {
                int i = dquVarF.b + dquVarF2.b;
                int[] iArrCopyOf = Arrays.copyOf(dquVarF.c, i);
                System.arraycopy(dquVarF2.c, 0, iArrCopyOf, dquVarF.b, dquVarF2.b);
                Object[] objArrCopyOf = Arrays.copyOf(dquVarF.d, i);
                System.arraycopy(dquVarF2.d, 0, objArrCopyOf, dquVarF.b, dquVarF2.b);
                dquVarF = new dqu(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!dquVarF2.equals(dquVar)) {
                dquVarF.b();
                int i2 = dquVarF.b + dquVarF2.b;
                dquVarF.c(i2);
                System.arraycopy(dquVarF2.c, 0, dquVarF.c, dquVarF.b, dquVarF2.b);
                System.arraycopy(dquVarF2.d, 0, dquVarF.d, dquVarF.b, dquVarF2.b);
                dquVarF.b = i2;
            }
        }
        dqt.g(obj, dquVarF);
    }

    public static void o(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dod)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).k(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        dod dodVar = (dod) list;
        if (!z) {
            while (i2 < dodVar.a) {
                ((dot) dhqVar.a).k(i, dodVar.f(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dodVar.a; i6++) {
            dodVar.f(i6);
            i5++;
        }
        dotVar2.z(i5);
        while (i2 < dodVar.a) {
            dotVar2.j(dodVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dou)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).ab(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.ac(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        dou douVar = (dou) list;
        if (!z) {
            while (i2 < douVar.a) {
                ((dot) dhqVar.a).ab(i, douVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < douVar.a; i6++) {
            douVar.e(i6);
            i5 += 8;
        }
        dotVar2.z(i5);
        while (i2 < douVar.a) {
            dotVar2.ac(douVar.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += dot.I(((Integer) list.get(i3)).intValue());
            }
            dotVar.z(I);
            while (i2 < list.size()) {
                dotVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dpg dpgVar = (dpg) list;
        if (!z) {
            while (i2 < dpgVar.a) {
                ((dot) dhqVar.a).q(i, dpgVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < dpgVar.a; i4++) {
            I2 += dot.I(dpgVar.e(i4));
        }
        dotVar2.z(I2);
        while (i2 < dpgVar.a) {
            dotVar2.r(dpgVar.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dpg dpgVar = (dpg) list;
        if (!z) {
            while (i2 < dpgVar.a) {
                ((dot) dhqVar.a).m(i, dpgVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dpgVar.a; i6++) {
            dpgVar.e(i6);
            i5 += 4;
        }
        dotVar2.z(i5);
        while (i2 < dpgVar.a) {
            dotVar2.n(dpgVar.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpr)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dpr dprVar = (dpr) list;
        if (!z) {
            while (i2 < dprVar.a) {
                ((dot) dhqVar.a).o(i, dprVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dprVar.a; i6++) {
            dprVar.e(i6);
            i5 += 8;
        }
        dotVar2.z(i5);
        while (i2 < dprVar.a) {
            dotVar2.p(dprVar.e(i2));
            i2++;
        }
    }

    public static void t(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpb)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).ad(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.ae(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        dpb dpbVar = (dpb) list;
        if (!z) {
            while (i2 < dpbVar.a) {
                ((dot) dhqVar.a).ad(i, dpbVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dpbVar.a; i6++) {
            dpbVar.e(i6);
            i5 += 4;
        }
        dotVar2.z(i5);
        while (i2 < dpbVar.a) {
            dotVar2.ae(dpbVar.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).q(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int I = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                I += dot.I(((Integer) list.get(i3)).intValue());
            }
            dotVar.z(I);
            while (i2 < list.size()) {
                dotVar.r(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dpg dpgVar = (dpg) list;
        if (!z) {
            while (i2 < dpgVar.a) {
                ((dot) dhqVar.a).q(i, dpgVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int I2 = 0;
        for (int i4 = 0; i4 < dpgVar.a; i4++) {
            I2 += dot.I(dpgVar.e(i4));
        }
        dotVar2.z(I2);
        while (i2 < dpgVar.a) {
            dotVar2.r(dpgVar.e(i2));
            i2++;
        }
    }

    public static void v(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpr)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).A(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int iX = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iX += dot.X(((Long) list.get(i3)).longValue());
            }
            dotVar.z(iX);
            while (i2 < list.size()) {
                dotVar.B(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dpr dprVar = (dpr) list;
        if (!z) {
            while (i2 < dprVar.a) {
                ((dot) dhqVar.a).A(i, dprVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int iX2 = 0;
        for (int i4 = 0; i4 < dprVar.a; i4++) {
            iX2 += dot.X(dprVar.e(i4));
        }
        dotVar2.z(iX2);
        while (i2 < dprVar.a) {
            dotVar2.B(dprVar.e(i2));
            i2++;
        }
    }

    public static void w(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).m(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.n(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dpg dpgVar = (dpg) list;
        if (!z) {
            while (i2 < dpgVar.a) {
                ((dot) dhqVar.a).m(i, dpgVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dpgVar.a; i6++) {
            dpgVar.e(i6);
            i5 += 4;
        }
        dotVar2.z(i5);
        while (i2 < dpgVar.a) {
            dotVar2.n(dpgVar.e(i2));
            i2++;
        }
    }

    public static void x(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpr)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).o(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            dotVar.z(i3);
            while (i2 < list.size()) {
                dotVar.p(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dpr dprVar = (dpr) list;
        if (!z) {
            while (i2 < dprVar.a) {
                ((dot) dhqVar.a).o(i, dprVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dprVar.a; i6++) {
            dprVar.e(i6);
            i5 += 8;
        }
        dotVar2.z(i5);
        while (i2 < dprVar.a) {
            dotVar2.p(dprVar.e(i2));
            i2++;
        }
    }

    public static void y(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpg)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).af(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int iO = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iO += dot.O(((Integer) list.get(i3)).intValue());
            }
            dotVar.z(iO);
            while (i2 < list.size()) {
                dotVar.ag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        dpg dpgVar = (dpg) list;
        if (!z) {
            while (i2 < dpgVar.a) {
                ((dot) dhqVar.a).af(i, dpgVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int iO2 = 0;
        for (int i4 = 0; i4 < dpgVar.a; i4++) {
            iO2 += dot.O(dpgVar.e(i4));
        }
        dotVar2.z(iO2);
        while (i2 < dpgVar.a) {
            dotVar2.ag(dpgVar.e(i2));
            i2++;
        }
    }

    public static void z(int i, List list, dhq dhqVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dpr)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((dot) dhqVar.a).ah(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            dot dotVar = (dot) dhqVar.a;
            dotVar.x(i, 2);
            int iQ = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iQ += dot.Q(((Long) list.get(i3)).longValue());
            }
            dotVar.z(iQ);
            while (i2 < list.size()) {
                dotVar.ai(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dpr dprVar = (dpr) list;
        if (!z) {
            while (i2 < dprVar.a) {
                ((dot) dhqVar.a).ah(i, dprVar.e(i2));
                i2++;
            }
            return;
        }
        dot dotVar2 = (dot) dhqVar.a;
        dotVar2.x(i, 2);
        int iQ2 = 0;
        for (int i4 = 0; i4 < dprVar.a; i4++) {
            iQ2 += dot.Q(dprVar.e(i4));
        }
        dotVar2.z(iQ2);
        while (i2 < dprVar.a) {
            dotVar2.ai(dprVar.e(i2));
            i2++;
        }
    }
}
