package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ytw extends AbstractCollection {
    final /* synthetic */ yug a;

    public ytw(yug yugVar) {
        this.a = yugVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ytu(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return ztm.d(this.a.b());
    }
}
