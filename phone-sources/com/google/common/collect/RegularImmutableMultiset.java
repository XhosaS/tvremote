package com.google.common.collect;

import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import defpackage.sfy;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
class RegularImmutableMultiset<E> extends ImmutableMultiset<E> {
    static final RegularImmutableMultiset<Object> EMPTY = new RegularImmutableMultiset<>(ObjectCountHashMap.create());
    final transient ObjectCountHashMap<E> contents;
    private transient ImmutableSet<E> elementSet;
    private final transient int size;

    /* compiled from: PG */
    final class ElementSet extends IndexedImmutableSet<E> {
        final /* synthetic */ RegularImmutableMultiset this$0;

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.this$0.contains(obj);
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        public E get(int i) {
            return this.this$0.contents.getKey(i);
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.this$0.contents.size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        private ElementSet(RegularImmutableMultiset regularImmutableMultiset) {
            regularImmutableMultiset.getClass();
            this.this$0 = regularImmutableMultiset;
        }
    }

    /* compiled from: PG */
    class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final Object[] elements;

        public SerializedForm(Multiset<? extends Object> multiset) {
            int size = multiset.entrySet().size();
            this.elements = new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry<? extends Object> entry : multiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            ImmutableMultiset.Builder builder = new ImmutableMultiset.Builder(this.elements.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.elements;
                if (i >= objArr.length) {
                    return builder.build();
                }
                builder.addCopies(objArr[i], this.counts[i]);
                i++;
            }
        }
    }

    public RegularImmutableMultiset(ObjectCountHashMap<E> objectCountHashMap) {
        this.contents = objectCountHashMap;
        long value = 0;
        for (int i = 0; i < objectCountHashMap.size(); i++) {
            value += objectCountHashMap.getValue(i);
        }
        this.size = sfy.ab(value);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return this.contents.get(obj);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSet<E> elementSet() {
        ImmutableSet<E> immutableSet = this.elementSet;
        if (immutableSet != null) {
            return immutableSet;
        }
        ElementSet elementSet = new ElementSet();
        this.elementSet = elementSet;
        return elementSet;
    }

    @Override // com.google.common.collect.ImmutableMultiset
    public Multiset.Entry<E> getEntry(int i) {
        return this.contents.getEntry(i);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }
}
