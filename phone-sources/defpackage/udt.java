package defpackage;

import com.google.common.collect.ForwardingCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udt<K, V> extends ForwardingCollection<Collection<V>> {
    final Collection a;
    final Set b;

    public udt(Collection collection, Set set) {
        this.a = collection;
        this.b = set;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return standardContains(obj);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        return standardContainsAll(collection);
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Collection<V>> iterator() {
        return new uds(this.b.iterator());
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return standardRemove(obj);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        return standardRemoveAll(collection);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        return standardRetainAll(collection);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return standardToArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Collection<Collection<V>> delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }
}
