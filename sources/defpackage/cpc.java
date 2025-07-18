package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpc implements cox {
    private final Map a;

    public cpc(Map map, Map map2) {
        if (!map.isEmpty()) {
            LinkedHashMap linkedHashMapBk = dnx.bk(((cbc) map).c + ((cbc) map2).c);
            linkedHashMapBk.putAll(map2);
            cbj cbjVarListIterator = ((caz) ((bzw) map).entrySet()).listIterator();
            while (cbjVarListIterator.hasNext()) {
                Map.Entry entry = (Map.Entry) cbjVarListIterator.next();
                linkedHashMapBk.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = DesugarCollections.unmodifiableMap(linkedHashMapBk);
        }
        this.a = map2;
    }

    @Override // defpackage.cox
    public final void b(Object obj) {
        Class<?> cls = obj.getClass();
        Map map = this.a;
        crv crvVar = (crv) map.get(cls.getName());
        if (crvVar == null) {
            ArrayList arrayList = new ArrayList();
            for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                if (map.containsKey(superclass.getCanonicalName())) {
                    arrayList.add(superclass.getCanonicalName());
                }
            }
            throw new IllegalArgumentException(arrayList.isEmpty() ? String.format("No injector factory bound for Class<%s>", obj.getClass().getCanonicalName()) : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", obj.getClass().getCanonicalName(), arrayList));
        }
        cow cowVar = (cow) crvVar.a();
        try {
            cox coxVarA = cowVar.a(obj);
            cowVar.getClass();
            coxVarA.b(obj);
        } catch (ClassCastException e) {
            throw new cpb(String.format("%s does not implement AndroidInjector.Factory<%s>", cowVar.getClass().getCanonicalName(), obj.getClass().getCanonicalName()), e);
        }
    }
}
