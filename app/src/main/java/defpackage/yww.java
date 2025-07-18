package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yww extends AbstractCollection {
    final /* synthetic */ ywx a;

    public yww(ywx ywxVar) {
        this.a = ywxVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ywx ywxVar = this.a;
        Map mapG = ywxVar.g();
        return mapG != null ? mapG.values().iterator() : new ywr(ywxVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }
}
