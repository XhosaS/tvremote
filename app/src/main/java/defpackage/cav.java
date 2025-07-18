package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cav {
    public static final caz a(Map map) {
        caz cazVar = new caz(map);
        caz.a.b(cazVar);
        return cazVar;
    }

    public static final void b(caz cazVar, Map map) {
        cazVar.getClass();
        c(cazVar.c, map);
    }

    public static final void c(Map map, Map map2) {
        Object[] objArr;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            if (value == null) {
                value = null;
            } else {
                agwj agwjVar = agwi.a;
                agvq agvqVar = new agvq(value.getClass());
                if (!agvy.c(agvqVar, new agvq(Boolean.TYPE)) && !agvy.c(agvqVar, new agvq(Byte.TYPE)) && !agvy.c(agvqVar, new agvq(Integer.TYPE)) && !agvy.c(agvqVar, new agvq(Long.TYPE)) && !agvy.c(agvqVar, new agvq(Float.TYPE)) && !agvy.c(agvqVar, new agvq(Double.TYPE)) && !agvy.c(agvqVar, new agvq(String.class)) && !agvy.c(agvqVar, new agvq(Boolean[].class)) && !agvy.c(agvqVar, new agvq(Byte[].class)) && !agvy.c(agvqVar, new agvq(Integer[].class)) && !agvy.c(agvqVar, new agvq(Long[].class)) && !agvy.c(agvqVar, new agvq(Float[].class)) && !agvy.c(agvqVar, new agvq(Double[].class)) && !agvy.c(agvqVar, new agvq(String[].class))) {
                    int i = 0;
                    if (agvy.c(agvqVar, new agvq(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        int length = zArr.length;
                        String str2 = cba.a;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (agvy.c(agvqVar, new agvq(byte[].class))) {
                        value = cba.a((byte[]) value);
                    } else if (agvy.c(agvqVar, new agvq(int[].class))) {
                        value = cba.b((int[]) value);
                    } else if (agvy.c(agvqVar, new agvq(long[].class))) {
                        long[] jArr = (long[]) value;
                        int length2 = jArr.length;
                        String str3 = cba.a;
                        objArr = new Long[length2];
                        while (i < length2) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (agvy.c(agvqVar, new agvq(float[].class))) {
                        float[] fArr = (float[]) value;
                        int length3 = fArr.length;
                        String str4 = cba.a;
                        objArr = new Float[length3];
                        while (i < length3) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!agvy.c(agvqVar, new agvq(double[].class))) {
                            throw new IllegalArgumentException(a.h(agvqVar, str, "Key ", " has invalid type "));
                        }
                        double[] dArr = (double[]) value;
                        int length4 = dArr.length;
                        String str5 = cba.a;
                        objArr = new Double[length4];
                        while (i < length4) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            map2.put(str, value);
        }
    }
}
