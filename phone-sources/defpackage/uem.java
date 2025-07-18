package defpackage;

import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uem {
    private static final Map a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(16);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(16);
        b(linkedHashMap, linkedHashMap2, Boolean.TYPE, Boolean.class);
        b(linkedHashMap, linkedHashMap2, Byte.TYPE, Byte.class);
        b(linkedHashMap, linkedHashMap2, Character.TYPE, Character.class);
        b(linkedHashMap, linkedHashMap2, Double.TYPE, Double.class);
        b(linkedHashMap, linkedHashMap2, Float.TYPE, Float.class);
        b(linkedHashMap, linkedHashMap2, Integer.TYPE, Integer.class);
        b(linkedHashMap, linkedHashMap2, Long.TYPE, Long.class);
        b(linkedHashMap, linkedHashMap2, Short.TYPE, Short.class);
        b(linkedHashMap, linkedHashMap2, Void.TYPE, Void.class);
        a = DesugarCollections.unmodifiableMap(linkedHashMap);
        DesugarCollections.unmodifiableMap(linkedHashMap2);
    }

    public static Class a(Class cls) {
        cls.getClass();
        Class cls2 = (Class) a.get(cls);
        return cls2 == null ? cls : cls2;
    }

    private static void b(Map map, Map map2, Class cls, Class cls2) {
        map.put(cls, cls2);
        map2.put(cls2, cls);
    }
}
