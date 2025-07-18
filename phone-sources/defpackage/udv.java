package defpackage;

import com.google.common.collect.ForwardingCollection;
import com.google.common.collect.Iterators;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udv<K, V> extends ForwardingCollection<Map.Entry<K, V>> {
    final Collection a;

    public udv(Collection collection) {
        this.a = collection;
    }

    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<Map.Entry<K, V>> iterator() {
        return Iterators.transform(this.a.iterator(), new rke(20));
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return standardToArray();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
    public final Collection<Map.Entry<K, V>> delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) standardToArray(tArr);
    }
}
