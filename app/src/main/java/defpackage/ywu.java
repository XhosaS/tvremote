package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class ywu extends AbstractSet {
    final /* synthetic */ ywx a;

    public ywu(ywx ywxVar) {
        this.a = ywxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        return mapG != null ? mapG.keySet().iterator() : new ywp(ywxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        return mapG != null ? mapG.keySet().remove(obj) : ywxVar.e(obj) != ywx.a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
