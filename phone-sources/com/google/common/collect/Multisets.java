package com.google.common.collect;

import android.support.v7.widget.ActivityChooserView;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import defpackage.a;
import defpackage.sfy;
import defpackage.sij;
import defpackage.tsv;
import defpackage.udo;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Multisets {

    /* compiled from: PG */
    abstract class AbstractEntry<E> implements Multiset.Entry<E> {
        @Override // com.google.common.collect.Multiset.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (getCount() == entry.getCount() && a.Q(getElement(), entry.getElement())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public int hashCode() {
            E element = getElement();
            return (element == null ? 0 : element.hashCode()) ^ getCount();
        }

        @Override // com.google.common.collect.Multiset.Entry
        public String toString() {
            String strValueOf = String.valueOf(getElement());
            int count = getCount();
            if (count == 1) {
                return strValueOf;
            }
            return strValueOf + " x " + count;
        }
    }

    /* compiled from: PG */
    final class DecreasingCount implements Comparator<Multiset.Entry<?>> {
        static final Comparator<Multiset.Entry<?>> INSTANCE = new DecreasingCount();

        private DecreasingCount() {
        }

        @Override // java.util.Comparator
        public int compare(Multiset.Entry<?> entry, Multiset.Entry<?> entry2) {
            return entry2.getCount() - entry.getCount();
        }
    }

    /* compiled from: PG */
    abstract class ElementSet<E> extends Sets.ImprovedAbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return multiset().contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return multiset().containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return multiset().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract Iterator<E> iterator();

        public abstract Multiset<E> multiset();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return multiset().remove(obj, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) > 0;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return multiset().entrySet().size();
        }
    }

    /* compiled from: PG */
    abstract class EntrySet<E> extends Sets.ImprovedAbstractSet<Multiset.Entry<E>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            multiset().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && multiset().count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        public abstract Multiset<E> multiset();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                Object element = entry.getElement();
                int count = entry.getCount();
                if (count != 0) {
                    return multiset().setCount(element, count, 0);
                }
            }
            return false;
        }
    }

    /* compiled from: PG */
    final class FilteredMultiset<E> extends ViewMultiset<E> {
        final tsv<? super E> predicate;
        final Multiset<E> unfiltered;

        public FilteredMultiset(Multiset<E> multiset, tsv<? super E> tsvVar) {
            super();
            multiset.getClass();
            this.unfiltered = multiset;
            tsvVar.getClass();
            this.predicate = tsvVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$createEntrySet$0(Multiset.Entry entry) {
            return this.predicate.apply((Object) entry.getElement());
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int add(E e, int i) {
            tsv<? super E> tsvVar = this.predicate;
            sij.v(tsvVar.apply(e), "Element %s does not match predicate %s", e, tsvVar);
            return this.unfiltered.add(e, i);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int iCount = this.unfiltered.count(obj);
            if (iCount <= 0 || !this.predicate.apply(obj)) {
                return 0;
            }
            return iCount;
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<E> createElementSet() {
            return Sets.filter(this.unfiltered.elementSet(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Set<Multiset.Entry<E>> createEntrySet() {
            return Sets.filter(this.unfiltered.entrySet(), new tsv() { // from class: com.google.common.collect.Multisets$FilteredMultiset$$ExternalSyntheticLambda0
                @Override // defpackage.tsv
                public final boolean apply(Object obj) {
                    return this.f$0.lambda$createEntrySet$0((Multiset.Entry) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<E> elementIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        public Iterator<Multiset.Entry<E>> entryIterator() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public UnmodifiableIterator<E> iterator() {
            return Iterators.filter(this.unfiltered.iterator(), this.predicate);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return count(obj);
            }
            if (contains(obj)) {
                return this.unfiltered.remove(obj, i);
            }
            return 0;
        }
    }

    /* compiled from: PG */
    class ImmutableEntry<E> extends AbstractEntry<E> implements Serializable {
        private static final long serialVersionUID = 0;
        private final int count;
        private final E element;

        public ImmutableEntry(E e, int i) {
            this.element = e;
            this.count = i;
            CollectPreconditions.checkNonnegative(i, "count");
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final int getCount() {
            return this.count;
        }

        @Override // com.google.common.collect.Multiset.Entry
        public final E getElement() {
            return this.element;
        }

        public ImmutableEntry<E> nextInBucket() {
            return null;
        }
    }

    /* compiled from: PG */
    final class MultisetIteratorImpl<E> implements Iterator<E> {
        private boolean canRemove;
        private Multiset.Entry<E> currentEntry;
        private final Iterator<Multiset.Entry<E>> entryIterator;
        private int laterCount;
        private final Multiset<E> multiset;
        private int totalCount;

        public MultisetIteratorImpl(Multiset<E> multiset, Iterator<Multiset.Entry<E>> it) {
            this.multiset = multiset;
            this.entryIterator = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.laterCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int count = this.laterCount;
            if (count == 0) {
                Multiset.Entry<E> next = this.entryIterator.next();
                this.currentEntry = next;
                count = next.getCount();
                this.totalCount = count;
            }
            this.laterCount = count - 1;
            this.canRemove = true;
            Multiset.Entry<E> entry = this.currentEntry;
            entry.getClass();
            return entry.getElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            CollectPreconditions.checkRemove(this.canRemove);
            if (this.totalCount == 1) {
                this.entryIterator.remove();
            } else {
                Multiset<E> multiset = this.multiset;
                Multiset.Entry<E> entry = this.currentEntry;
                entry.getClass();
                multiset.remove(entry.getElement());
            }
            this.totalCount--;
            this.canRemove = false;
        }
    }

    /* compiled from: PG */
    class UnmodifiableMultiset<E> extends ForwardingMultiset<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Multiset<? extends E> delegate;
        transient Set<E> elementSet;
        transient Set<Multiset.Entry<E>> entrySet;

        public UnmodifiableMultiset(Multiset<? extends E> multiset) {
            this.delegate = multiset;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
        public boolean add(E e) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public void clear() {
            throw new UnsupportedOperationException();
        }

        public Set<E> createElementSet() {
            return DesugarCollections.unmodifiableSet(this.delegate.elementSet());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        public Multiset<E> delegate() {
            return this.delegate;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set = this.elementSet;
            if (set != null) {
                return set;
            }
            Set<E> setCreateElementSet = createElementSet();
            this.elementSet = setCreateElementSet;
            return setCreateElementSet;
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set = this.entrySet;
            if (set != null) {
                return set;
            }
            Set<Multiset.Entry<E>> setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.delegate.entrySet());
            this.entrySet = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Iterators.unmodifiableIterator(this.delegate.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int setCount(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int add(E e, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
        public boolean setCount(E e, int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: PG */
    abstract class ViewMultiset<E> extends AbstractMultiset<E> {
        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            elementSet().clear();
        }

        @Override // com.google.common.collect.AbstractMultiset
        public int distinctElements() {
            return elementSet().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<E> iterator() {
            return Multisets.iteratorImpl(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return Multisets.linearTimeSizeImpl(this);
        }

        private ViewMultiset() {
        }
    }

    private Multisets() {
    }

    private static <E> boolean addAllImpl(Multiset<E> multiset, AbstractMapBasedMultiset<? extends E> abstractMapBasedMultiset) {
        if (abstractMapBasedMultiset.isEmpty()) {
            return false;
        }
        abstractMapBasedMultiset.addTo(multiset);
        return true;
    }

    public static boolean containsOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        multiset.getClass();
        multiset2.getClass();
        for (Multiset.Entry<?> entry : multiset2.entrySet()) {
            if (multiset.count(entry.getElement()) < entry.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> ImmutableMultiset<E> copyHighestCountFirst(Multiset<E> multiset) {
        Multiset.Entry[] entryArr = (Multiset.Entry[]) multiset.entrySet().toArray(new Multiset.Entry[0]);
        Arrays.sort(entryArr, DecreasingCount.INSTANCE);
        return ImmutableMultiset.copyFromEntries(Arrays.asList(entryArr));
    }

    public static <E> Multiset<E> difference(final Multiset<E> multiset, final Multiset multiset2) {
        multiset.getClass();
        multiset2.getClass();
        return new ViewMultiset() { // from class: com.google.common.collect.Multisets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public void clear() {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                int iCount = multiset.count(obj);
                if (iCount == 0) {
                    return 0;
                }
                return Math.max(0, iCount - multiset2.count(obj));
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, com.google.common.collect.AbstractMultiset
            public int distinctElements() {
                return Iterators.size(entryIterator());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator elementIterator() {
                final Iterator it = multiset.entrySet().iterator();
                final Multiset multiset3 = multiset2;
                return new AbstractIterator(this) { // from class: com.google.common.collect.Multisets.4.1
                    {
                        this.getClass();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            if (entry.getCount() > multiset3.count(element)) {
                                return element;
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry> entryIterator() {
                final Iterator it = multiset.entrySet().iterator();
                final Multiset multiset3 = multiset2;
                return new AbstractIterator<Multiset.Entry>(this) { // from class: com.google.common.collect.Multisets.4.2
                    {
                        this.getClass();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.common.collect.AbstractIterator
                    public Multiset.Entry computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            int count = entry.getCount() - multiset3.count(element);
                            if (count > 0) {
                                return Multisets.immutableEntry(element, count);
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }
        };
    }

    static <E> Iterator<E> elementIterator(Iterator<Multiset.Entry<E>> it) {
        return new TransformedIterator(it) { // from class: com.google.common.collect.Multisets.5
            @Override // com.google.common.collect.TransformedIterator
            public Object transform(Multiset.Entry entry) {
                return entry.getElement();
            }
        };
    }

    static boolean equalsImpl(Multiset<?> multiset, Object obj) {
        if (obj == multiset) {
            return true;
        }
        if (obj instanceof Multiset) {
            Multiset multiset2 = (Multiset) obj;
            if (multiset.size() == multiset2.size() && multiset.entrySet().size() == multiset2.entrySet().size()) {
                for (Multiset.Entry entry : multiset2.entrySet()) {
                    if (multiset.count(entry.getElement()) != entry.getCount()) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static <E> Multiset<E> filter(Multiset<E> multiset, tsv<? super E> tsvVar) {
        if (!(multiset instanceof FilteredMultiset)) {
            return new FilteredMultiset(multiset, tsvVar);
        }
        FilteredMultiset filteredMultiset = (FilteredMultiset) multiset;
        return new FilteredMultiset(filteredMultiset.unfiltered, sij.n(filteredMultiset.predicate, tsvVar));
    }

    public static <E> Multiset.Entry<E> immutableEntry(E e, int i) {
        return new ImmutableEntry(e, i);
    }

    static int inferDistinctElements(Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return ((Multiset) iterable).elementSet().size();
        }
        return 11;
    }

    public static <E> Multiset<E> intersection(final Multiset<E> multiset, final Multiset multiset2) {
        multiset.getClass();
        multiset2.getClass();
        return new ViewMultiset() { // from class: com.google.common.collect.Multisets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                int iCount = multiset.count(obj);
                if (iCount == 0) {
                    return 0;
                }
                return Math.min(iCount, multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Set createElementSet() {
                return Sets.intersection(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator elementIterator() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry> entryIterator() {
                final Iterator it = multiset.entrySet().iterator();
                final Multiset multiset3 = multiset2;
                return new AbstractIterator<Multiset.Entry>(this) { // from class: com.google.common.collect.Multisets.2.1
                    {
                        this.getClass();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.common.collect.AbstractIterator
                    public Multiset.Entry computeNext() {
                        while (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            int iMin = Math.min(entry.getCount(), multiset3.count(element));
                            if (iMin > 0) {
                                return Multisets.immutableEntry(element, iMin);
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }
        };
    }

    static <E> Iterator<E> iteratorImpl(Multiset<E> multiset) {
        return new MultisetIteratorImpl(multiset, multiset.entrySet().iterator());
    }

    static int linearTimeSizeImpl(Multiset<?> multiset) {
        long count = 0;
        while (multiset.entrySet().iterator().hasNext()) {
            count += r4.next().getCount();
        }
        return sfy.ab(count);
    }

    static boolean removeAllImpl(Multiset<?> multiset, Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().removeAll(collection);
    }

    public static boolean removeOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        multiset.getClass();
        multiset2.getClass();
        Iterator<Multiset.Entry<?>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<?> next = it.next();
            int iCount = multiset2.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                multiset.remove(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    static boolean retainAllImpl(Multiset<?> multiset, Collection<?> collection) {
        collection.getClass();
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return multiset.elementSet().retainAll(collection);
    }

    public static boolean retainOccurrences(Multiset<?> multiset, Multiset<?> multiset2) {
        return retainOccurrencesImpl(multiset, multiset2);
    }

    private static <E> boolean retainOccurrencesImpl(Multiset<E> multiset, Multiset multiset2) {
        multiset.getClass();
        multiset2.getClass();
        Iterator<Multiset.Entry<E>> it = multiset.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            int iCount = multiset2.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                multiset.setCount(next.getElement(), iCount);
            }
            z = true;
        }
        return z;
    }

    static <E> int setCountImpl(Multiset<E> multiset, E e, int i) {
        CollectPreconditions.checkNonnegative(i, "count");
        int iCount = multiset.count(e);
        int i2 = i - iCount;
        if (i2 > 0) {
            multiset.add(e, i2);
            return iCount;
        }
        if (i2 < 0) {
            multiset.remove(e, -i2);
        }
        return iCount;
    }

    public static <E> Multiset<E> sum(final Multiset<? extends E> multiset, final Multiset<? extends E> multiset2) {
        multiset.getClass();
        multiset2.getClass();
        return new ViewMultiset() { // from class: com.google.common.collect.Multisets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(Object obj) {
                return multiset.contains(obj) || multiset2.contains(obj);
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                return multiset.count(obj) + multiset2.count(obj);
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Set createElementSet() {
                return Sets.union(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator elementIterator() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry> entryIterator() {
                final Iterator it = multiset.entrySet().iterator();
                final Iterator it2 = multiset2.entrySet().iterator();
                final Multiset multiset3 = multiset;
                final Multiset multiset4 = multiset2;
                return new AbstractIterator<Multiset.Entry>(this) { // from class: com.google.common.collect.Multisets.3.1
                    {
                        this.getClass();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.common.collect.AbstractIterator
                    public Multiset.Entry computeNext() {
                        if (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, entry.getCount() + multiset4.count(element));
                        }
                        while (it2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                            Object element2 = entry2.getElement();
                            if (!multiset3.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return multiset.isEmpty() && multiset2.isEmpty();
            }

            @Override // com.google.common.collect.Multisets.ViewMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public int size() {
                return udo.f(multiset.size(), multiset2.size());
            }
        };
    }

    public static <T, E, M extends Multiset<E>> Collector<T, ?, M> toMultiset(Function<? super T, E> function, ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        return CollectCollectors.toMultiset(function, toIntFunction, supplier);
    }

    public static <E> Multiset<E> union(final Multiset<? extends E> multiset, final Multiset<? extends E> multiset2) {
        multiset.getClass();
        multiset2.getClass();
        return new ViewMultiset() { // from class: com.google.common.collect.Multisets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
            public boolean contains(Object obj) {
                return multiset.contains(obj) || multiset2.contains(obj);
            }

            @Override // com.google.common.collect.Multiset
            public int count(Object obj) {
                return Math.max(multiset.count(obj), multiset2.count(obj));
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Set createElementSet() {
                return Sets.union(multiset.elementSet(), multiset2.elementSet());
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator elementIterator() {
                throw new AssertionError("should never be called");
            }

            @Override // com.google.common.collect.AbstractMultiset
            public Iterator<Multiset.Entry> entryIterator() {
                final Iterator it = multiset.entrySet().iterator();
                final Iterator it2 = multiset2.entrySet().iterator();
                final Multiset multiset3 = multiset;
                final Multiset multiset4 = multiset2;
                return new AbstractIterator<Multiset.Entry>(this) { // from class: com.google.common.collect.Multisets.1.1
                    {
                        this.getClass();
                    }

                    /* JADX INFO: Access modifiers changed from: protected */
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.google.common.collect.AbstractIterator
                    public Multiset.Entry computeNext() {
                        if (it.hasNext()) {
                            Multiset.Entry entry = (Multiset.Entry) it.next();
                            Object element = entry.getElement();
                            return Multisets.immutableEntry(element, Math.max(entry.getCount(), multiset4.count(element)));
                        }
                        while (it2.hasNext()) {
                            Multiset.Entry entry2 = (Multiset.Entry) it2.next();
                            Object element2 = entry2.getElement();
                            if (!multiset3.contains(element2)) {
                                return Multisets.immutableEntry(element2, entry2.getCount());
                            }
                        }
                        endOfData();
                        return null;
                    }
                };
            }

            @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
            public boolean isEmpty() {
                return multiset.isEmpty() && multiset2.isEmpty();
            }
        };
    }

    @Deprecated
    public static <E> Multiset<E> unmodifiableMultiset(ImmutableMultiset<E> immutableMultiset) {
        immutableMultiset.getClass();
        return immutableMultiset;
    }

    public static <E> SortedMultiset<E> unmodifiableSortedMultiset(SortedMultiset<E> sortedMultiset) {
        sortedMultiset.getClass();
        return new UnmodifiableSortedMultiset(sortedMultiset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> Multiset<E> unmodifiableMultiset(Multiset<? extends E> multiset) {
        if ((multiset instanceof UnmodifiableMultiset) || (multiset instanceof ImmutableMultiset)) {
            return multiset;
        }
        multiset.getClass();
        return new UnmodifiableMultiset(multiset);
    }

    private static <E> boolean addAllImpl(Multiset<E> multiset, Multiset<? extends E> multiset2) {
        if (multiset2 instanceof AbstractMapBasedMultiset) {
            return addAllImpl((Multiset) multiset, (AbstractMapBasedMultiset) multiset2);
        }
        if (multiset2.isEmpty()) {
            return false;
        }
        for (Multiset.Entry<? extends E> entry : multiset2.entrySet()) {
            multiset.add(entry.getElement(), entry.getCount());
        }
        return true;
    }

    static <E> boolean setCountImpl(Multiset<E> multiset, E e, int i, int i2) {
        CollectPreconditions.checkNonnegative(i, "oldCount");
        CollectPreconditions.checkNonnegative(i2, "newCount");
        if (multiset.count(e) != i) {
            return false;
        }
        multiset.setCount(e, i2);
        return true;
    }

    static <E> boolean addAllImpl(Multiset<E> multiset, Collection<? extends E> collection) {
        multiset.getClass();
        collection.getClass();
        if (collection instanceof Multiset) {
            return addAllImpl((Multiset) multiset, (Multiset) collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        return Iterators.addAll(multiset, collection.iterator());
    }

    public static boolean removeOccurrences(Multiset<?> multiset, Iterable<?> iterable) {
        if (iterable instanceof Multiset) {
            return removeOccurrences(multiset, (Multiset<?>) iterable);
        }
        multiset.getClass();
        iterable.getClass();
        Iterator<?> it = iterable.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= multiset.remove(it.next());
        }
        return zRemove;
    }
}
