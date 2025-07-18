package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class B {
    public static final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 2);
    public static final z b = new z();
    public static final B c = new B();

    public static Object a(j$.time.temporal.n nVar, Locale locale) {
        Object a2;
        long j;
        String strSubstring;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(nVar, locale);
        ConcurrentHashMap concurrentHashMap = a;
        V v = concurrentHashMap.get(simpleImmutableEntry);
        if (v != 0) {
            return v;
        }
        HashMap map = new HashMap();
        if (nVar == j$.time.temporal.a.ERA) {
            DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            String[] eras = dateFormatSymbols.getEras();
            for (int i = 0; i < eras.length; i++) {
                if (!eras[i].isEmpty()) {
                    long j2 = i;
                    map2.put(Long.valueOf(j2), eras[i]);
                    Long lValueOf = Long.valueOf(j2);
                    String str = eras[i];
                    map3.put(lValueOf, str.substring(0, Character.charCount(str.codePointAt(0))));
                }
            }
            if (!map2.isEmpty()) {
                map.put(G.FULL, map2);
                map.put(G.SHORT, map2);
                map.put(G.NARROW, map3);
            }
            a2 = new A(map);
        } else {
            long j3 = 1;
            if (nVar == j$.time.temporal.a.MONTH_OF_YEAR) {
                int length = DateFormatSymbols.getInstance(locale).getMonths().length;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (long j4 = 1; j4 <= length; j4++) {
                    String strU = j$.desugar.sun.nio.fs.g.u(j4, "LLLL", locale);
                    linkedHashMap.put(Long.valueOf(j4), strU);
                    linkedHashMap2.put(Long.valueOf(j4), strU.substring(0, Character.charCount(strU.codePointAt(0))));
                    linkedHashMap3.put(Long.valueOf(j4), j$.desugar.sun.nio.fs.g.u(j4, "LLL", locale));
                }
                if (length > 0) {
                    map.put(G.FULL_STANDALONE, linkedHashMap);
                    map.put(G.NARROW_STANDALONE, linkedHashMap2);
                    map.put(G.SHORT_STANDALONE, linkedHashMap3);
                    map.put(G.FULL, linkedHashMap);
                    map.put(G.NARROW, linkedHashMap2);
                    map.put(G.SHORT, linkedHashMap3);
                }
                a2 = new A(map);
            } else if (nVar == j$.time.temporal.a.DAY_OF_WEEK) {
                int length2 = DateFormatSymbols.getInstance(locale).getWeekdays().length;
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                boolean z = locale == Locale.SIMPLIFIED_CHINESE || locale == Locale.TRADITIONAL_CHINESE;
                long j5 = 1;
                while (j5 <= length2) {
                    String strT = j$.desugar.sun.nio.fs.g.t(j5, "cccc", locale);
                    linkedHashMap4.put(Long.valueOf(j5), strT);
                    Long lValueOf2 = Long.valueOf(j5);
                    if (z) {
                        j = j3;
                        strSubstring = new StringBuilder().appendCodePoint(strT.codePointBefore(strT.length())).toString();
                    } else {
                        j = j3;
                        strSubstring = strT.substring(0, Character.charCount(strT.codePointAt(0)));
                    }
                    linkedHashMap5.put(lValueOf2, strSubstring);
                    linkedHashMap6.put(Long.valueOf(j5), j$.desugar.sun.nio.fs.g.t(j5, "ccc", locale));
                    j5 += j;
                    j3 = j;
                }
                if (length2 > 0) {
                    map.put(G.FULL_STANDALONE, linkedHashMap4);
                    map.put(G.NARROW_STANDALONE, linkedHashMap5);
                    map.put(G.SHORT_STANDALONE, linkedHashMap6);
                    map.put(G.FULL, linkedHashMap4);
                    map.put(G.NARROW, linkedHashMap5);
                    map.put(G.SHORT, linkedHashMap6);
                }
                a2 = new A(map);
            } else if (nVar == j$.time.temporal.a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] amPmStrings = dateFormatSymbols2.getAmPmStrings();
                for (int i2 = 0; i2 < amPmStrings.length; i2++) {
                    if (!amPmStrings[i2].isEmpty()) {
                        long j6 = i2;
                        map4.put(Long.valueOf(j6), amPmStrings[i2]);
                        Long lValueOf3 = Long.valueOf(j6);
                        String str2 = amPmStrings[i2];
                        map5.put(lValueOf3, str2.substring(0, Character.charCount(str2.codePointAt(0))));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(G.FULL, map4);
                    map.put(G.SHORT, map4);
                    map.put(G.NARROW, map5);
                }
                a2 = new A(map);
            } else {
                a2 = "";
            }
        }
        concurrentHashMap.putIfAbsent(simpleImmutableEntry, a2);
        return concurrentHashMap.get(simpleImmutableEntry);
    }

    public String b(j$.time.chrono.m mVar, j$.time.temporal.n nVar, long j, G g, Locale locale) {
        if (mVar == j$.time.chrono.t.c || !(nVar instanceof j$.time.temporal.a)) {
            return c(nVar, j, g, locale);
        }
        return null;
    }

    public String c(j$.time.temporal.n nVar, long j, G g, Locale locale) {
        Object objA = a(nVar, locale);
        if (objA instanceof A) {
            return ((A) objA).a(j, g);
        }
        return null;
    }

    public Iterator d(j$.time.chrono.m mVar, j$.time.temporal.n nVar, G g, Locale locale) {
        if (mVar == j$.time.chrono.t.c || !(nVar instanceof j$.time.temporal.a)) {
            return e(nVar, g, locale);
        }
        return null;
    }

    public Iterator e(j$.time.temporal.n nVar, G g, Locale locale) {
        List list;
        Object objA = a(nVar, locale);
        if (!(objA instanceof A) || (list = (List) ((A) objA).b.get(g)) == null) {
            return null;
        }
        return list.iterator();
    }
}
