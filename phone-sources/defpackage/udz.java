package defpackage;

import com.google.common.collect.ForwardingListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimap;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class udz<K, V> extends ForwardingListMultimap<K, V> implements Serializable {
    final ListMultimap a;
    transient Collection b;
    transient Map c;

    public udz(ListMultimap listMultimap) {
        listMultimap.getClass();
        this.a = listMultimap;
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.c;
        if (map != null) {
            return map;
        }
        udy udyVar = new udy(this, this.a.asMap());
        this.c = udyVar;
        return udyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final ListMultimap<K, V> delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.b;
        if (collection != null) {
            return collection;
        }
        udv udvVar = new udv(this.a.entries());
        this.b = udvVar;
        return udvVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ Collection get(Object obj) {
        return get((udz<K, V>) obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final boolean put(K k, V v) {
        k.getClass();
        v.getClass();
        return this.a.put(k, v);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final /* bridge */ /* synthetic */ Collection replaceValues(Object obj, Iterable iterable) {
        return replaceValues((udz<K, V>) obj, iterable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    public final /* synthetic */ Multimap delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final List<V> get(K k) {
        return new udw(this.a.get((ListMultimap) k));
    }

    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final List<V> replaceValues(K k, Iterable<? extends V> iterable) {
        return this.a.replaceValues((ListMultimap) k, (Iterable) sfy.ah(k, iterable));
    }

    @Override // com.google.common.collect.ForwardingListMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    protected final /* synthetic */ Object delegate() {
        return this.a;
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
    public final boolean putAll(K k, Iterable<? extends V> iterable) {
        return this.a.putAll(k, sfy.ah(k, iterable));
    }
}
