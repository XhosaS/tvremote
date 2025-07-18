package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xcd<T> implements xby<T> {
    private final Map a;

    public xcd(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMapV = wae.v(map.size() + map2.size());
            linkedHashMapV.putAll(map2);
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMapV.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = DesugarCollections.unmodifiableMap(linkedHashMapV);
        }
        this.a = map2;
    }

    @Override // defpackage.xby
    public final void a(Object obj) {
        String name = obj.getClass().getName();
        Map map = this.a;
        yfo yfoVar = (yfo) map.get(name);
        if (yfoVar == null) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (map.containsKey(superclass.getCanonicalName())) {
                    arrayList.add(superclass.getCanonicalName());
                }
            }
            throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
        }
        xbx xbxVar = (xbx) yfoVar.b();
        try {
            xby xbyVarA = xbxVar.a(obj);
            xbxVar.getClass();
            xbyVarA.a(obj);
        } catch (ClassCastException e) {
            throw new xcc(String.format("%s does not implement AndroidInjector.Factory<%s>", xbxVar.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
        }
    }
}
