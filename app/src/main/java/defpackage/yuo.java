package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yuo extends zbg {
    final /* synthetic */ yuq a;

    public yuo(yuq yuqVar) {
        this.a = yuqVar;
    }

    @Override // defpackage.zbg
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.zbg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return ywo.a(this.a.a.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new yup(this.a);
    }

    @Override // defpackage.zbg, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object objRemove;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        yuq yuqVar = this.a;
        Object key = entry.getKey();
        yve yveVar = yuqVar.b;
        Map map = yveVar.a;
        map.getClass();
        try {
            objRemove = map.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        yveVar.b -= size;
        return true;
    }
}
