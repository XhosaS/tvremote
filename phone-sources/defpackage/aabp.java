package defpackage;

import j$.util.DesugarCollections;
import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aabp {
    public static volatile Map a;
    private static final vxr b;
    private static volatile vxr c;

    static {
        vxr vxrVar = new vxr();
        b = vxrVar;
        c = vxrVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("UT", aabs.b);
        linkedHashMap.put("UTC", aabs.b);
        linkedHashMap.put("GMT", aabs.b);
        d(linkedHashMap, "EST", "America/New_York");
        d(linkedHashMap, "EDT", "America/New_York");
        d(linkedHashMap, "CST", "America/Chicago");
        d(linkedHashMap, "CDT", "America/Chicago");
        d(linkedHashMap, "MST", "America/Denver");
        d(linkedHashMap, "MDT", "America/Denver");
        d(linkedHashMap, "PST", "America/Los_Angeles");
        d(linkedHashMap, "PDT", "America/Los_Angeles");
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    public static final long a() {
        return System.currentTimeMillis();
    }

    public static final DateFormatSymbols b(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    public static final aabk c(aabk aabkVar) {
        return aabkVar == null ? aadl.P() : aabkVar;
    }

    private static void d(Map map, String str, String str2) {
        try {
            map.put(str, aabs.l(str2));
        } catch (RuntimeException unused) {
        }
    }
}
