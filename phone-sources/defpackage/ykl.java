package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ykl implements ymh, ykk {
    public static final Map a;
    public static final HashMap b;
    public static final Map c;
    private static final HashMap d;
    private static final HashMap e;
    private final Class f;

    static {
        int i = 0;
        List listS = yfm.s(yjk.class, yjv.class, yjz.class, yka.class, ykb.class, ykc.class, ykd.class, yke.class, ykf.class, ykg.class, yjl.class, yjm.class, yjn.class, yjo.class, yjp.class, yjq.class, yjr.class, yjs.class, yjt.class, yju.class, yjw.class, yjx.class, yjy.class);
        ArrayList arrayList = new ArrayList(yfm.z(listS, 10));
        for (Object obj : listS) {
            int i2 = i + 1;
            if (i < 0) {
                yfm.w();
            }
            arrayList.add(new yfw((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = yfm.k(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        d = map;
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        e = map2;
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        collectionValues.getClass();
        for (String str : collectionValues) {
            str.getClass();
            yfw yfwVar = new yfw("kotlin.jvm.internal." + ylh.H(str, '.', str) + "CompanionObject", str.concat(".Companion"));
            map3.put(yfwVar.a, yfwVar.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(yfm.e(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, ylh.H(str2, '.', str2));
        }
        c = linkedHashMap;
    }

    public ykl(Class cls) {
        cls.getClass();
        this.f = cls;
    }

    @Override // defpackage.ykk
    public final Class a() {
        return this.f;
    }

    @Override // defpackage.ymh
    public final String b() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String str2 = (String) b.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) b.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    @Override // defpackage.ymh
    public final String c() {
        String str;
        Class cls = this.f;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String str2 = (String) c.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) c.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            return ylh.G(simpleName, String.valueOf(enclosingMethod.getName()).concat("$"), simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            simpleName.getClass();
            return ylh.G(simpleName, String.valueOf(enclosingConstructor.getName()).concat("$"), simpleName);
        }
        simpleName.getClass();
        int iT = ylh.T(simpleName, '$', 0, 6);
        if (iT == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iT + 1, simpleName.length());
        strSubstring.getClass();
        return strSubstring;
    }

    @Override // defpackage.ymh
    public final boolean d(Object obj) {
        Map map = a;
        map.getClass();
        Class clsP = this.f;
        Integer num = (Integer) map.get(clsP);
        if (num != null) {
            return ylh.b(obj, num.intValue());
        }
        if (clsP.isPrimitive()) {
            clsP = wef.p(wef.q(clsP));
        }
        return clsP.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ykl) && yks.e(wef.p(this), wef.p((ymh) obj));
    }

    @Override // defpackage.ymh
    public final int hashCode() {
        return wef.p(this).hashCode();
    }

    public final String toString() {
        Class cls = this.f;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
