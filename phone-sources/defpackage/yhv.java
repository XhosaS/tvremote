package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yhv<K, V> extends yhm<Map.Entry<K, V>, K, V> {
    private final yhu a;

    public yhv(yhu yhuVar) {
        this.a = yhuVar;
    }

    @Override // defpackage.ygu
    public final int a() {
        return this.a.g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        ((Map.Entry) obj).getClass();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
        collection.getClass();
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yhm
    public final boolean b(Map.Entry entry) {
        return this.a.i(entry);
    }

    @Override // defpackage.yhm
    public final boolean c(Map.Entry entry) {
        entry.getClass();
        yhu yhuVar = this.a;
        yhuVar.f();
        int iB = yhuVar.b(entry.getKey());
        if (iB < 0) {
            return false;
        }
        Object[] objArr = yhuVar.c;
        objArr.getClass();
        if (!yks.e(objArr[iB], entry.getValue())) {
            return false;
        }
        yhuVar.g(iB);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        collection.getClass();
        return this.a.h(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new yhq(this.a);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        collection.getClass();
        this.a.f();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        collection.getClass();
        this.a.f();
        return super.retainAll(collection);
    }
}
