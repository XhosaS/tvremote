package com.google.common.collect;

import com.google.common.collect.Multiset;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LabsAccessToPackagePrivateApisDoNotUse {

    /* compiled from: PG */
    public abstract class BadAbstractMultiset<E> extends AbstractMultiset<E> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ int add(Object obj, int i) {
            return super.add(obj, i);
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ boolean contains(Object obj) {
            return super.contains(obj);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public abstract int distinctElements();

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            return Multisets.elementIterator(entryIterator());
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ Set elementSet() {
            return super.elementSet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public abstract Iterator<Multiset.Entry<E>> entryIterator();

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public /* bridge */ /* synthetic */ boolean isEmpty() {
            return super.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.iteratorImpl(this);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ int remove(Object obj, int i) {
            return super.remove(obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ int setCount(Object obj, int i) {
            return super.setCount(obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public /* bridge */ /* synthetic */ boolean setCount(Object obj, int i, int i2) {
            return super.setCount(obj, i, i2);
        }
    }

    private LabsAccessToPackagePrivateApisDoNotUse() {
    }

    public static <K, V> Multimap<K, V> synchronizedMultimap(Multimap<K, V> multimap, Object obj) {
        return Synchronized.multimap(multimap, obj);
    }

    public static <K, V> SetMultimap<K, V> synchronizedSetMultimap(SetMultimap<K, V> setMultimap, Object obj) {
        return Synchronized.setMultimap(setMultimap, obj);
    }
}
