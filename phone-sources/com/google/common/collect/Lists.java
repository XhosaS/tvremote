package com.google.common.collect;

import defpackage.a;
import defpackage.sfy;
import defpackage.sij;
import defpackage.tsl;
import defpackage.udo;
import java.io.Serializable;
import java.math.RoundingMode;
import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Lists {

    /* compiled from: PG */
    class AbstractListWrapper<E> extends AbstractList<E> {
        final List<E> backingList;

        public AbstractListWrapper(List<E> list) {
            list.getClass();
            this.backingList = list;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, E e) {
            this.backingList.add(i, e);
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int i, Collection<? extends E> collection) {
            return this.backingList.addAll(i, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            return this.backingList.contains(obj);
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            return this.backingList.get(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int i) {
            return this.backingList.remove(i);
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int i, E e) {
            return this.backingList.set(i, e);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.backingList.size();
        }
    }

    /* compiled from: PG */
    final class CharSequenceAsList extends AbstractList<Character> {
        private final CharSequence sequence;

        public CharSequenceAsList(CharSequence charSequence) {
            this.sequence = charSequence;
        }

        @Override // java.util.AbstractList, java.util.List
        public Character get(int i) {
            sij.B(i, size());
            return Character.valueOf(this.sequence.charAt(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.sequence.length();
        }
    }

    /* compiled from: PG */
    class OnePlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;

        public OnePlusArrayList(E e, E[] eArr) {
            this.first = e;
            eArr.getClass();
            this.rest = eArr;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            sij.B(i, size());
            return i == 0 ? this.first : this.rest[i - 1];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return udo.f(this.rest.length, 1);
        }
    }

    /* compiled from: PG */
    class Partition<T> extends AbstractList<List<T>> {
        final List<T> list;
        final int size;

        public Partition(List<T> list, int i) {
            this.list = list;
            this.size = i;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.list.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return udo.d(this.list.size(), this.size, RoundingMode.CEILING);
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> get(int i) {
            sij.B(i, size());
            List<T> list = this.list;
            int i2 = this.size;
            int i3 = i * i2;
            return this.list.subList(i3, Math.min(i2 + i3, list.size()));
        }
    }

    /* compiled from: PG */
    class RandomAccessListWrapper<E> extends AbstractListWrapper<E> implements RandomAccess {
        public RandomAccessListWrapper(List<E> list) {
            super(list);
        }
    }

    /* compiled from: PG */
    class RandomAccessPartition<T> extends Partition<T> implements RandomAccess {
        public RandomAccessPartition(List<T> list, int i) {
            super(list, i);
        }
    }

    /* compiled from: PG */
    class RandomAccessReverseList<T> extends ReverseList<T> implements RandomAccess {
        public RandomAccessReverseList(List<T> list) {
            super(list);
        }
    }

    /* compiled from: PG */
    class ReverseList<T> extends AbstractList<T> {
        private final List<T> forwardList;

        public ReverseList(List<T> list) {
            list.getClass();
            this.forwardList = list;
        }

        private int reverseIndex(int i) {
            int size = size();
            sij.B(i, size);
            return (size - 1) - i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int reversePosition(int i) {
            int size = size();
            sij.C(i, size);
            return size - i;
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int i, T t) {
            this.forwardList.add(reversePosition(i), t);
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            this.forwardList.clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.forwardList.get(reverseIndex(i));
        }

        public List<T> getForwardList() {
            return this.forwardList;
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            final ListIterator<T> listIterator = this.forwardList.listIterator(reversePosition(i));
            return new ListIterator<T>(this) { // from class: com.google.common.collect.Lists.ReverseList.1
                boolean canRemoveOrSet;
                final /* synthetic */ ReverseList this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // java.util.ListIterator
                public void add(T t) {
                    listIterator.add(t);
                    listIterator.previous();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public boolean hasNext() {
                    return listIterator.hasPrevious();
                }

                @Override // java.util.ListIterator
                public boolean hasPrevious() {
                    return listIterator.hasNext();
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public T next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.previous();
                }

                @Override // java.util.ListIterator
                public int nextIndex() {
                    return this.this$0.reversePosition(listIterator.nextIndex());
                }

                @Override // java.util.ListIterator
                public T previous() {
                    if (!hasPrevious()) {
                        throw new NoSuchElementException();
                    }
                    this.canRemoveOrSet = true;
                    return (T) listIterator.next();
                }

                @Override // java.util.ListIterator
                public int previousIndex() {
                    return nextIndex() - 1;
                }

                @Override // java.util.ListIterator, java.util.Iterator
                public void remove() {
                    CollectPreconditions.checkRemove(this.canRemoveOrSet);
                    listIterator.remove();
                    this.canRemoveOrSet = false;
                }

                @Override // java.util.ListIterator
                public void set(T t) {
                    a.ab(this.canRemoveOrSet);
                    listIterator.set(t);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.forwardList.remove(reverseIndex(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            subList(i, i2).clear();
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int i, T t) {
            return this.forwardList.set(reverseIndex(i), t);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.forwardList.size();
        }

        @Override // java.util.AbstractList, java.util.List
        public List<T> subList(int i, int i2) {
            sij.w(i, i2, size());
            return Lists.reverse(this.forwardList.subList(reversePosition(i2), reversePosition(i)));
        }
    }

    /* compiled from: PG */
    class TransformingRandomAccessList<F, T> extends AbstractList<T> implements RandomAccess, Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final tsl<? super F, ? extends T> function;

        public TransformingRandomAccessList(List<F> list, tsl<? super F, ? extends T> tslVar) {
            list.getClass();
            this.fromList = list;
            tslVar.getClass();
            this.function = tslVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.function.apply(this.fromList.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<T> iterator() {
            return listIterator();
        }

        @Override // java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this, this.fromList.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingRandomAccessList.1
                final /* synthetic */ TransformingRandomAccessList this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.TransformedIterator
                public T transform(F f) {
                    return this.this$0.function.apply(f);
                }
            };
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int i) {
            return this.function.apply(this.fromList.remove(i));
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* compiled from: PG */
    class TransformingSequentialList<F, T> extends AbstractSequentialList<T> implements Serializable {
        private static final long serialVersionUID = 0;
        final List<F> fromList;
        final tsl<? super F, ? extends T> function;

        public TransformingSequentialList(List<F> list, tsl<? super F, ? extends T> tslVar) {
            list.getClass();
            this.fromList = list;
            tslVar.getClass();
            this.function = tslVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
            return this.fromList.isEmpty();
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public ListIterator<T> listIterator(int i) {
            return new TransformedListIterator<F, T>(this, this.fromList.listIterator(i)) { // from class: com.google.common.collect.Lists.TransformingSequentialList.1
                final /* synthetic */ TransformingSequentialList this$0;

                {
                    this.getClass();
                    this.this$0 = this;
                }

                @Override // com.google.common.collect.TransformedIterator
                public T transform(F f) {
                    return this.this$0.function.apply(f);
                }
            };
        }

        @Override // java.util.AbstractList
        protected void removeRange(int i, int i2) {
            this.fromList.subList(i, i2).clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.fromList.size();
        }
    }

    /* compiled from: PG */
    class TwoPlusArrayList<E> extends AbstractList<E> implements Serializable, RandomAccess {
        private static final long serialVersionUID = 0;
        final E first;
        final E[] rest;
        final E second;

        public TwoPlusArrayList(E e, E e2, E[] eArr) {
            this.first = e;
            this.second = e2;
            eArr.getClass();
            this.rest = eArr;
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int i) {
            if (i == 0) {
                return this.first;
            }
            if (i == 1) {
                return this.second;
            }
            sij.B(i, size());
            return this.rest[i - 2];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return udo.f(this.rest.length, 2);
        }
    }

    private Lists() {
    }

    static <E> boolean addAllImpl(List<E> list, int i, Iterable<? extends E> iterable) {
        ListIterator<E> listIterator = list.listIterator(i);
        Iterator<? extends E> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            listIterator.add(it.next());
            z = true;
        }
        return z;
    }

    public static <E> List<E> asList(E e, E e2, E[] eArr) {
        return new TwoPlusArrayList(e, e2, eArr);
    }

    public static <B> List<List<B>> cartesianProduct(List<? extends List<? extends B>> list) {
        return CartesianList.create(list);
    }

    public static List<Character> charactersOf(CharSequence charSequence) {
        charSequence.getClass();
        return new CharSequenceAsList(charSequence);
    }

    static int computeArrayListCapacity(int i) {
        CollectPreconditions.checkNonnegative(i, "arraySize");
        return sfy.ab(i + 5 + (i / 10));
    }

    static boolean equalsImpl(List<?> list, Object obj) {
        list.getClass();
        if (obj == list) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return Iterators.elementsEqual(list.iterator(), list2.iterator());
        }
        for (int i = 0; i < size; i++) {
            if (!a.Q(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    static int hashCodeImpl(List<?> list) {
        Iterator<?> it = list.iterator();
        int iHashCode = 1;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = (iHashCode * 31) + (next == null ? 0 : next.hashCode());
        }
        return iHashCode;
    }

    static int indexOfImpl(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return indexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (a.Q(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    private static int indexOfRandomAccess(List<?> list, Object obj) {
        int size = list.size();
        int i = 0;
        if (obj == null) {
            while (i < size) {
                if (list.get(i) == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        while (i < size) {
            if (obj.equals(list.get(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    static int lastIndexOfImpl(List<?> list, Object obj) {
        if (list instanceof RandomAccess) {
            return lastIndexOfRandomAccess(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (a.Q(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    private static int lastIndexOfRandomAccess(List<?> list, Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
        } else {
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (obj.equals(list.get(size2))) {
                    return size2;
                }
            }
        }
        return -1;
    }

    static <E> ListIterator<E> listIteratorImpl(List<E> list, int i) {
        return new AbstractListWrapper(list).listIterator(i);
    }

    public static <E> ArrayList<E> newArrayList() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> newArrayListWithCapacity(int i) {
        CollectPreconditions.checkNonnegative(i, "initialArraySize");
        return new ArrayList<>(i);
    }

    public static <E> ArrayList<E> newArrayListWithExpectedSize(int i) {
        return new ArrayList<>(computeArrayListCapacity(i));
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
        return new CopyOnWriteArrayList<>();
    }

    public static <E> LinkedList<E> newLinkedList() {
        return new LinkedList<>();
    }

    public static <T> List<List<T>> partition(List<T> list, int i) {
        list.getClass();
        a.H(i > 0);
        return list instanceof RandomAccess ? new RandomAccessPartition(list, i) : new Partition(list, i);
    }

    public static <T> List<T> reverse(List<T> list) {
        return list instanceof ImmutableList ? ((ImmutableList) list).reverse() : list instanceof ReverseList ? ((ReverseList) list).getForwardList() : list instanceof RandomAccess ? new RandomAccessReverseList(list) : new ReverseList(list);
    }

    static <E> List<E> subListImpl(List<E> list, int i, int i2) {
        return (list instanceof RandomAccess ? new RandomAccessListWrapper(list) { // from class: com.google.common.collect.Lists.1
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator listIterator(int i3) {
                return this.backingList.listIterator(i3);
            }
        } : new AbstractListWrapper(list) { // from class: com.google.common.collect.Lists.2
            private static final long serialVersionUID = 0;

            @Override // java.util.AbstractList, java.util.List
            public ListIterator listIterator(int i3) {
                return this.backingList.listIterator(i3);
            }
        }).subList(i, i2);
    }

    public static <F, T> List<T> transform(List<F> list, tsl<? super F, ? extends T> tslVar) {
        return list instanceof RandomAccess ? new TransformingRandomAccessList(list, tslVar) : new TransformingSequentialList(list, tslVar);
    }

    /* compiled from: PG */
    final class StringAsImmutableList extends ImmutableList<Character> {
        private final String string;

        public StringAsImmutableList(String str) {
            this.string = str;
        }

        @Override // java.util.List
        public Character get(int i) {
            sij.B(i, size());
            return Character.valueOf(this.string.charAt(i));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.indexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public boolean isPartialView() {
            return false;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            if (obj instanceof Character) {
                return this.string.lastIndexOf(((Character) obj).charValue());
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.string.length();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<Character> subList(int i, int i2) {
            sij.w(i, i2, size());
            return Lists.charactersOf(this.string.substring(i, i2));
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ List subList(int i, int i2) {
            return subList(i, i2);
        }
    }

    public static <E> List<E> asList(E e, E[] eArr) {
        return new OnePlusArrayList(e, eArr);
    }

    @SafeVarargs
    public static <B> List<List<B>> cartesianProduct(List<? extends B>... listArr) {
        return cartesianProduct(Arrays.asList(listArr));
    }

    public static <E> ArrayList<E> newArrayList(Iterable<? extends E> iterable) {
        iterable.getClass();
        return iterable instanceof Collection ? new ArrayList<>((Collection) iterable) : newArrayList(iterable.iterator());
    }

    public static <E> CopyOnWriteArrayList<E> newCopyOnWriteArrayList(Iterable<? extends E> iterable) {
        return new CopyOnWriteArrayList<>(iterable instanceof Collection ? (Collection) iterable : newArrayList(iterable));
    }

    public static <E> LinkedList<E> newLinkedList(Iterable<? extends E> iterable) {
        LinkedList<E> linkedList = new LinkedList<>();
        Iterables.addAll(linkedList, iterable);
        return linkedList;
    }

    public static ImmutableList<Character> charactersOf(String str) {
        str.getClass();
        return new StringAsImmutableList(str);
    }

    public static <E> ArrayList<E> newArrayList(Iterator<? extends E> it) {
        ArrayList<E> arrayList = new ArrayList<>();
        Iterators.addAll(arrayList, it);
        return arrayList;
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        eArr.getClass();
        ArrayList<E> arrayList = new ArrayList<>(computeArrayListCapacity(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
