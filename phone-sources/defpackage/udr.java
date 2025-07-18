package defpackage;

import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udr<K, V> extends ForwardingSet<Map.Entry<K, Collection<V>>> {
    private final Set a;

    public udr(Set set) {
        this.a = set;
    }

    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, Collection<V>>> iterator() {
        return Iterators.transform(this.a.iterator(), new rke(19));
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return standardToArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final /* synthetic */ Collection delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Set<Map.Entry<K, Collection<V>>> delegate() {
        return this.a;
    }
}
