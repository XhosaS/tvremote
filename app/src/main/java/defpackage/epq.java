package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class epq {
    public static double a(double d) {
        if (Double.isNaN(d)) {
            return 0.0d;
        }
        if (Double.isInfinite(d) || d == 0.0d || d == 0.0d) {
            return d;
        }
        return (d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d));
    }

    public static int b(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d == 0.0d) {
            return 0;
        }
        return (int) (((d > 0.0d ? 1 : -1) * Math.floor(Math.abs(d))) % 4.294967296E9d);
    }

    public static long c(double d) {
        return b(d) & 4294967295L;
    }

    public static ers d(String str) {
        ers ersVar = null;
        if (str != null && !str.isEmpty()) {
            ersVar = (ers) ers.ao.get(Integer.valueOf(Integer.parseInt(str)));
        }
        if (ersVar != null) {
            return ersVar;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object e(eqw eqwVar) {
        if (eqw.g.equals(eqwVar)) {
            return null;
        }
        if (eqw.f.equals(eqwVar)) {
            return "";
        }
        if (eqwVar instanceof eqt) {
            return f((eqt) eqwVar);
        }
        if (!(eqwVar instanceof eql)) {
            return !eqwVar.h().isNaN() ? eqwVar.h() : eqwVar.i();
        }
        ArrayList arrayList = new ArrayList();
        eqk eqkVar = new eqk((eql) eqwVar);
        while (eqkVar.hasNext()) {
            Object objE = e(eqkVar.next());
            if (objE != null) {
                arrayList.add(objE);
            }
        }
        return arrayList;
    }

    public static Map f(eqt eqtVar) {
        HashMap map = new HashMap();
        for (String str : new ArrayList(eqtVar.a.keySet())) {
            Object objE = e(eqtVar.f(str));
            if (objE != null) {
                map.put(str, objE);
            }
        }
        return map;
    }

    public static void g(String str, int i, List list) {
        if (list.size() != i) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void h(String str, int i, List list) {
        if (list.size() < i) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i, List list) {
        if (list.size() > i) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i), Integer.valueOf(list.size())));
        }
    }

    public static boolean j(eqw eqwVar) {
        if (eqwVar == null) {
            return false;
        }
        Double dH = eqwVar.h();
        return !dH.isNaN() && dH.doubleValue() >= 0.0d && dH.equals(Double.valueOf(Math.floor(dH.doubleValue())));
    }

    public static boolean k(eqw eqwVar, eqw eqwVar2) {
        if (!eqwVar.getClass().equals(eqwVar2.getClass())) {
            return false;
        }
        if ((eqwVar instanceof erb) || (eqwVar instanceof equ)) {
            return true;
        }
        if (!(eqwVar instanceof eqo)) {
            return eqwVar instanceof era ? eqwVar.i().equals(eqwVar2.i()) : eqwVar instanceof eqm ? eqwVar.g().equals(eqwVar2.g()) : eqwVar == eqwVar2;
        }
        if (Double.isNaN(eqwVar.h().doubleValue()) || Double.isNaN(eqwVar2.h().doubleValue())) {
            return false;
        }
        return eqwVar.h().equals(eqwVar2.h());
    }

    public static void l(epp eppVar) {
        int iB = b(eppVar.c("runtime.counter").h().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        eppVar.f("runtime.counter", new eqo(Double.valueOf(iB)));
    }
}
