package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dft {
    public static final Class a;
    public static final dfz b;
    public static final dfz c;

    static {
        Class<?> cls;
        Class<?> cls2;
        dfp dfpVar = dfp.a;
        dfz dfzVar = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        a = cls;
        try {
            cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                dfzVar = (dfz) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        b = dfzVar;
        c = new dfz();
    }

    public static void A(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof del)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).A(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iY = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iY += ddz.Y(((Integer) list.get(i3)).intValue());
            }
            ddzVar.B(iY);
            while (i2 < list.size()) {
                ddzVar.B(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        del delVar = (del) list;
        if (!z) {
            while (i2 < delVar.a) {
                ((ddz) cxeVar.a).A(i, delVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iY2 = 0;
        for (int i4 = 0; i4 < delVar.a; i4++) {
            iY2 += ddz.Y(delVar.e(i4));
        }
        ddzVar2.B(iY2);
        while (i2 < delVar.a) {
            ddzVar2.B(delVar.e(i2));
            i2++;
        }
    }

    public static void B(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dex)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).C(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iAa = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAa += ddz.aa(((Long) list.get(i3)).longValue());
            }
            ddzVar.B(iAa);
            while (i2 < list.size()) {
                ddzVar.D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dex dexVar = (dex) list;
        if (!z) {
            while (i2 < dexVar.a) {
                ((ddz) cxeVar.a).C(i, dexVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iAa2 = 0;
        for (int i4 = 0; i4 < dexVar.a; i4++) {
            iAa2 += ddz.aa(dexVar.e(i4));
        }
        ddzVar2.B(iAa2);
        while (i2 < dexVar.a) {
            ddzVar2.D(dexVar.e(i2));
            i2++;
        }
    }

    static int a(List list) {
        return list.size() * 4;
    }

    static int b(List list) {
        return list.size() * 8;
    }

    static int c(int i, Object obj, dfs dfsVar) {
        int iW;
        int iP;
        if (obj instanceof deu) {
            iW = ddz.W(i);
            iP = ddz.N((deu) obj);
        } else {
            iW = ddz.W(i);
            iP = ddz.P((dfh) obj, dfsVar);
        }
        return iW + iP;
    }

    static int d(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof del)) {
            int iR = 0;
            while (i < size) {
                iR += ddz.R(((Integer) list.get(i)).intValue());
                i++;
            }
            return iR;
        }
        del delVar = (del) list;
        int iR2 = 0;
        while (i < size) {
            iR2 += ddz.R(delVar.e(i));
            i++;
        }
        return iR2;
    }

    static int e(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof dex)) {
            int iT = 0;
            while (i < size) {
                iT += ddz.T(((Long) list.get(i)).longValue());
                i++;
            }
            return iT;
        }
        dex dexVar = (dex) list;
        int iT2 = 0;
        while (i < size) {
            iT2 += ddz.T(dexVar.e(i));
            i++;
        }
        return iT2;
    }

    static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof del)) {
            int iY = 0;
            while (i < size) {
                iY += ddz.Y(((Integer) list.get(i)).intValue());
                i++;
            }
            return iY;
        }
        del delVar = (del) list;
        int iY2 = 0;
        while (i < size) {
            iY2 += ddz.Y(delVar.e(i));
            i++;
        }
        return iY2;
    }

    static Object g(Object obj, int i, List list, den denVar, Object obj2, dfz dfzVar) {
        if (denVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!denVar.a()) {
                    obj2 = h(obj, i, iIntValue, obj2, dfzVar);
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
            if (denVar.a()) {
                if (i3 != i2) {
                    list.set(i2, num);
                }
                i2++;
            } else {
                obj2 = h(obj, i, iIntValue2, obj2, dfzVar);
            }
        }
        if (i2 != size) {
            list.subList(i2, size).clear();
        }
        return obj2;
    }

    static Object h(Object obj, int i, int i2, Object obj2, dfz dfzVar) {
        if (obj2 == null) {
            obj2 = dfzVar.a(obj);
        }
        dfzVar.c(obj2, i, i2);
        return obj2;
    }

    static int i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ddz.ap(i);
    }

    static int j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * ddz.aq(i);
    }

    public static /* synthetic */ int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof del)) {
            int iL = 0;
            while (i < size) {
                iL += ddz.L(((Integer) list.get(i)).intValue());
                i++;
            }
            return iL;
        }
        del delVar = (del) list;
        int iL2 = 0;
        while (i < size) {
            iL2 += ddz.L(delVar.e(i));
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
        if (!(list instanceof dex)) {
            int iAa = 0;
            while (i < size) {
                iAa += ddz.aa(((Long) list.get(i)).longValue());
                i++;
            }
            return iAa;
        }
        dex dexVar = (dex) list;
        int iAa2 = 0;
        while (i < size) {
            iAa2 += ddz.aa(dexVar.e(i));
            i++;
        }
        return iAa2;
    }

    static void m(Object obj, Object obj2) {
        def defVarG = cwt.g(obj2);
        if (defVarG.g()) {
            return;
        }
        def defVarH = cwt.h(obj);
        dfw dfwVar = defVarG.b;
        int iA = dfwVar.a();
        for (int i = 0; i < iA; i++) {
            defVarH.e(dfwVar.e(i));
        }
        Iterator it = dfwVar.b().iterator();
        while (it.hasNext()) {
            defVarH.e((Map.Entry) it.next());
        }
    }

    static void n(Object obj, Object obj2) {
        dga dgaVarE = dfz.e(obj);
        dga dgaVarE2 = dfz.e(obj2);
        dga dgaVar = dga.a;
        if (!dgaVar.equals(dgaVarE2)) {
            if (dgaVar.equals(dgaVarE)) {
                int i = dgaVarE.b + dgaVarE2.b;
                int[] iArrCopyOf = Arrays.copyOf(dgaVarE.c, i);
                System.arraycopy(dgaVarE2.c, 0, iArrCopyOf, dgaVarE.b, dgaVarE2.b);
                Object[] objArrCopyOf = Arrays.copyOf(dgaVarE.d, i);
                System.arraycopy(dgaVarE2.d, 0, objArrCopyOf, dgaVarE.b, dgaVarE2.b);
                dgaVarE = new dga(i, iArrCopyOf, objArrCopyOf, true);
            } else if (!dgaVarE2.equals(dgaVar)) {
                dgaVarE.b();
                int i2 = dgaVarE.b + dgaVarE2.b;
                dgaVarE.c(i2);
                System.arraycopy(dgaVarE2.c, 0, dgaVarE.c, dgaVarE.b, dgaVarE2.b);
                System.arraycopy(dgaVarE2.d, 0, dgaVarE.d, dgaVarE.b, dgaVarE2.b);
                dgaVarE.b = i2;
            }
        }
        dfz.f(obj, dgaVarE);
    }

    public static void o(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof ddl)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).k(i, ((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.j(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        ddl ddlVar = (ddl) list;
        if (!z) {
            while (i2 < ddlVar.a) {
                ((ddz) cxeVar.a).k(i, ddlVar.f(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < ddlVar.a; i6++) {
            ddlVar.f(i6);
            i5++;
        }
        ddzVar2.B(i5);
        while (i2 < ddlVar.a) {
            ddzVar2.j(ddlVar.f(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void p(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dea)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).ae(i, ((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.af(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        dea deaVar = (dea) list;
        if (!z) {
            while (i2 < deaVar.a) {
                ((ddz) cxeVar.a).ae(i, deaVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < deaVar.a; i6++) {
            deaVar.e(i6);
            i5 += 8;
        }
        ddzVar2.B(i5);
        while (i2 < deaVar.a) {
            ddzVar2.af(deaVar.e(i2));
            i2++;
        }
    }

    public static void q(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof del)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += ddz.L(((Integer) list.get(i3)).intValue());
            }
            ddzVar.B(iL);
            while (i2 < list.size()) {
                ddzVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        del delVar = (del) list;
        if (!z) {
            while (i2 < delVar.a) {
                ((ddz) cxeVar.a).r(i, delVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < delVar.a; i4++) {
            iL2 += ddz.L(delVar.e(i4));
        }
        ddzVar2.B(iL2);
        while (i2 < delVar.a) {
            ddzVar2.s(delVar.e(i2));
            i2++;
        }
    }

    public static void r(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof del)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        del delVar = (del) list;
        if (!z) {
            while (i2 < delVar.a) {
                ((ddz) cxeVar.a).n(i, delVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < delVar.a; i6++) {
            delVar.e(i6);
            i5 += 4;
        }
        ddzVar2.B(i5);
        while (i2 < delVar.a) {
            ddzVar2.o(delVar.e(i2));
            i2++;
        }
    }

    public static void s(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dex)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dex dexVar = (dex) list;
        if (!z) {
            while (i2 < dexVar.a) {
                ((ddz) cxeVar.a).p(i, dexVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dexVar.a; i6++) {
            dexVar.e(i6);
            i5 += 8;
        }
        ddzVar2.B(i5);
        while (i2 < dexVar.a) {
            ddzVar2.q(dexVar.e(i2));
            i2++;
        }
    }

    public static void t(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof deh)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).ag(i, ((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.ah(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        deh dehVar = (deh) list;
        if (!z) {
            while (i2 < dehVar.a) {
                ((ddz) cxeVar.a).ag(i, dehVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dehVar.a; i6++) {
            dehVar.e(i6);
            i5 += 4;
        }
        ddzVar2.B(i5);
        while (i2 < dehVar.a) {
            ddzVar2.ah(dehVar.e(i2));
            i2++;
        }
    }

    public static void u(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof del)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).r(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iL = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iL += ddz.L(((Integer) list.get(i3)).intValue());
            }
            ddzVar.B(iL);
            while (i2 < list.size()) {
                ddzVar.s(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        del delVar = (del) list;
        if (!z) {
            while (i2 < delVar.a) {
                ((ddz) cxeVar.a).r(i, delVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iL2 = 0;
        for (int i4 = 0; i4 < delVar.a; i4++) {
            iL2 += ddz.L(delVar.e(i4));
        }
        ddzVar2.B(iL2);
        while (i2 < delVar.a) {
            ddzVar2.s(delVar.e(i2));
            i2++;
        }
    }

    public static void v(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dex)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).C(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iAa = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iAa += ddz.aa(((Long) list.get(i3)).longValue());
            }
            ddzVar.B(iAa);
            while (i2 < list.size()) {
                ddzVar.D(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dex dexVar = (dex) list;
        if (!z) {
            while (i2 < dexVar.a) {
                ((ddz) cxeVar.a).C(i, dexVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iAa2 = 0;
        for (int i4 = 0; i4 < dexVar.a; i4++) {
            iAa2 += ddz.aa(dexVar.e(i4));
        }
        ddzVar2.B(iAa2);
        while (i2 < dexVar.a) {
            ddzVar2.D(dexVar.e(i2));
            i2++;
        }
    }

    public static void w(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof del)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).n(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.o(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        del delVar = (del) list;
        if (!z) {
            while (i2 < delVar.a) {
                ((ddz) cxeVar.a).n(i, delVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < delVar.a; i6++) {
            delVar.e(i6);
            i5 += 4;
        }
        ddzVar2.B(i5);
        while (i2 < delVar.a) {
            ddzVar2.o(delVar.e(i2));
            i2++;
        }
    }

    public static void x(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dex)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).p(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            ddzVar.B(i3);
            while (i2 < list.size()) {
                ddzVar.q(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dex dexVar = (dex) list;
        if (!z) {
            while (i2 < dexVar.a) {
                ((ddz) cxeVar.a).p(i, dexVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < dexVar.a; i6++) {
            dexVar.e(i6);
            i5 += 8;
        }
        ddzVar2.B(i5);
        while (i2 < dexVar.a) {
            ddzVar2.q(dexVar.e(i2));
            i2++;
        }
    }

    public static void y(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof del)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).aj(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iR = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iR += ddz.R(((Integer) list.get(i3)).intValue());
            }
            ddzVar.B(iR);
            while (i2 < list.size()) {
                ddzVar.ak(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        del delVar = (del) list;
        if (!z) {
            while (i2 < delVar.a) {
                ((ddz) cxeVar.a).aj(i, delVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iR2 = 0;
        for (int i4 = 0; i4 < delVar.a; i4++) {
            iR2 += ddz.R(delVar.e(i4));
        }
        ddzVar2.B(iR2);
        while (i2 < delVar.a) {
            ddzVar2.ak(delVar.e(i2));
            i2++;
        }
    }

    public static void z(int i, List list, cxe cxeVar, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        int i2 = 0;
        if (!(list instanceof dex)) {
            if (!z) {
                while (i2 < list.size()) {
                    ((ddz) cxeVar.a).al(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            ddz ddzVar = (ddz) cxeVar.a;
            ddzVar.z(i, 2);
            int iT = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                iT += ddz.T(((Long) list.get(i3)).longValue());
            }
            ddzVar.B(iT);
            while (i2 < list.size()) {
                ddzVar.am(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        dex dexVar = (dex) list;
        if (!z) {
            while (i2 < dexVar.a) {
                ((ddz) cxeVar.a).al(i, dexVar.e(i2));
                i2++;
            }
            return;
        }
        ddz ddzVar2 = (ddz) cxeVar.a;
        ddzVar2.z(i, 2);
        int iT2 = 0;
        for (int i4 = 0; i4 < dexVar.a; i4++) {
            iT2 += ddz.T(dexVar.e(i4));
        }
        ddzVar2.B(iT2);
        while (i2 < dexVar.a) {
            ddzVar2.am(dexVar.e(i2));
            i2++;
        }
    }
}
