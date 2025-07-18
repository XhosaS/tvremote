package defpackage;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yxp extends yxq implements Collection {
    protected yxp() {
    }

    protected abstract Collection a();

    public boolean add(Object obj) {
        return a().add(obj);
    }

    public boolean addAll(Collection collection) {
        return a().addAll(collection);
    }

    @Override // java.util.Collection
    public final void clear() {
        a().clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return a().contains(obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        return a().containsAll(collection);
    }

    @Override // defpackage.yxq
    protected /* bridge */ /* synthetic */ Object f() {
        throw null;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        return a().remove(obj);
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        return a().removeAll(collection);
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        return a().retainAll(collection);
    }

    @Override // java.util.Collection
    public final int size() {
        return a().size();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return a().toArray();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return a().toArray(objArr);
    }
}
