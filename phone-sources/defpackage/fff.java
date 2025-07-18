package defpackage;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fff extends ffh {
    public long a;
    public long[] b;
    public long[] c;

    public fff() {
        super(new fdm());
        this.a = -9223372036854775807L;
        this.b = new long[0];
        this.c = new long[0];
    }

    private static Double d(edi ediVar) {
        return Double.valueOf(Double.longBitsToDouble(ediVar.q()));
    }

    private static Object e(edi ediVar, int i) {
        if (i == 0) {
            return d(ediVar);
        }
        if (i == 1) {
            return Boolean.valueOf(ediVar.j() == 1);
        }
        if (i == 2) {
            return f(ediVar);
        }
        if (i != 3) {
            if (i == 8) {
                return g(ediVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) d(ediVar).doubleValue());
                ediVar.L(2);
                return date;
            }
            int iM = ediVar.m();
            ArrayList arrayList = new ArrayList(iM);
            for (int i2 = 0; i2 < iM; i2++) {
                Object objE = e(ediVar, ediVar.j());
                if (objE != null) {
                    arrayList.add(objE);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strF = f(ediVar);
            int iJ = ediVar.j();
            if (iJ == 9) {
                return map;
            }
            Object objE2 = e(ediVar, iJ);
            if (objE2 != null) {
                map.put(strF, objE2);
            }
        }
    }

    private static String f(edi ediVar) {
        int iN = ediVar.n();
        int i = ediVar.b;
        ediVar.L(iN);
        return new String(ediVar.a, i, iN);
    }

    private static HashMap g(edi ediVar) {
        int iM = ediVar.m();
        HashMap map = new HashMap(iM);
        for (int i = 0; i < iM; i++) {
            String strF = f(ediVar);
            Object objE = e(ediVar, ediVar.j());
            if (objE != null) {
                map.put(strF, objE);
            }
        }
        return map;
    }

    @Override // defpackage.ffh
    protected final boolean a(edi ediVar) {
        return true;
    }

    @Override // defpackage.ffh
    protected final boolean b(edi ediVar, long j) {
        if (ediVar.j() == 2 && "onMetaData".equals(f(ediVar)) && ediVar.a() != 0 && ediVar.j() == 8) {
            HashMap mapG = g(ediVar);
            Object obj = mapG.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.a = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapG.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.b = new long[size];
                    this.c = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.b = new long[0];
                            this.c = new long[0];
                            break;
                        }
                        this.b[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.c[i] = ((Double) obj5).longValue();
                    }
                }
            }
        }
        return false;
    }
}
