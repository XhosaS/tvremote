package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cui implements cuv, cuh {
    public static final Map a;
    public static final HashMap b;
    private static final HashMap d;
    private static final HashMap e;
    public final Class c;

    static {
        int i = 0;
        List listAsList = Arrays.asList(ctj.class, ctu.class, cty.class, ctz.class, cua.class, cub.class, cuc.class, cud.class, cue.class, cuf.class, ctk.class, ctl.class, ctm.class, ctn.class, cto.class, ctp.class, ctq.class, ctr.class, cts.class, ctt.class, ctv.class, ctw.class, ctx.class);
        listAsList.getClass();
        ArrayList arrayList = new ArrayList(dnx.aQ(listAsList));
        for (Object obj : listAsList) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new csa((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        a = dnx.aG(arrayList);
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
            csa csaVar = new csa("kotlin.jvm.internal." + dnx.ay(str) + "CompanionObject", str.concat(".Companion"));
            map3.put(csaVar.a, csaVar.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        b = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(dnx.aF(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), dnx.ay((String) entry2.getValue()));
        }
    }

    public cui(Class cls) {
        this.c = cls;
    }

    @Override // defpackage.cuh
    public final Class a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cui) && dnx.aB(dnx.aC(this), dnx.aC((cuv) obj));
    }

    public final int hashCode() {
        return dnx.aC(this).hashCode();
    }

    public final String toString() {
        Class cls = this.c;
        Objects.toString(cls);
        return cls.toString().concat(" (Kotlin reflection is not available)");
    }
}
