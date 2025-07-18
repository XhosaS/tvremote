package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yuq extends zbj {
    final transient Map a;
    final /* synthetic */ yve b;

    public yuq(yve yveVar, Map map) {
        this.b = yveVar;
        this.a = map;
    }

    final Map.Entry a(Map.Entry entry) {
        Object key = entry.getKey();
        return new yxz(key, this.b.d(key, (Collection) entry.getValue()));
    }

    @Override // defpackage.zbj
    public final Set b() {
        return new yuo(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Map map = this.a;
        yve yveVar = this.b;
        if (map == yveVar.a) {
            yveVar.j();
        } else {
            zar.i(new yup(this));
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.a;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.a.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) zbk.b(this.a, obj);
        if (collection == null) {
            return null;
        }
        return this.b.d(obj, collection);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.zbj, java.util.AbstractMap, java.util.Map
    public Set keySet() {
        return this.b.n();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        yve yveVar = this.b;
        Collection collectionA = yveVar.a();
        collectionA.addAll(collection);
        yveVar.b -= collection.size();
        collection.clear();
        return collectionA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.a.toString();
    }
}
