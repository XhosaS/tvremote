package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import defpackage.sij;
import defpackage.udo;
import j$.util.Collection;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements SortedMultiset<E>, Collection<E> {
    private static final long serialVersionUID = 912559;
    transient ImmutableSortedMultiset<E> descendingMultiset;

    /* compiled from: PG */
    public class Builder<E> extends ImmutableMultiset.Builder<E> {
        private final Comparator<? super E> comparator;
        private int[] counts;
        E[] elements;
        private boolean forceCopyElements;
        private int length;

        public Builder(Comparator<? super E> comparator) {
            super(true);
            comparator.getClass();
            this.comparator = comparator;
            this.elements = (E[]) new Object[4];
            this.counts = new int[4];
        }

        private void dedupAndCoalesce(boolean z) {
            int i = this.length;
            if (i == 0) {
                return;
            }
            Object[] objArr = (E[]) Arrays.copyOf(this.elements, i);
            Arrays.sort(objArr, this.comparator);
            int i2 = 1;
            for (int i3 = 1; i3 < objArr.length; i3++) {
                if (this.comparator.compare((Object) objArr[i2 - 1], (Object) objArr[i3]) < 0) {
                    objArr[i2] = objArr[i3];
                    i2++;
                }
            }
            Arrays.fill(objArr, i2, this.length, (Object) null);
            if (z) {
                int i4 = i2 * 4;
                int i5 = this.length;
                if (i4 > i5 * 3) {
                    objArr = (E[]) Arrays.copyOf(objArr, udo.f(i5, (i5 / 2) + 1));
                }
            }
            int[] iArr = new int[objArr.length];
            for (int i6 = 0; i6 < this.length; i6++) {
                int iBinarySearch = Arrays.binarySearch(objArr, 0, i2, this.elements[i6], this.comparator);
                int i7 = this.counts[i6];
                if (i7 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i7;
                } else {
                    iArr[iBinarySearch] = ~i7;
                }
            }
            this.elements = (E[]) objArr;
            this.counts = iArr;
            this.length = i2;
        }

        private void dedupAndCoalesceAndDeleteEmpty() {
            dedupAndCoalesce(false);
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = this.length;
                if (i >= i3) {
                    Arrays.fill(this.elements, i2, i3, (Object) null);
                    Arrays.fill(this.counts, i2, this.length, 0);
                    this.length = i2;
                    return;
                }
                int[] iArr = this.counts;
                int i4 = iArr[i];
                if (i4 > 0) {
                    E[] eArr = this.elements;
                    eArr[i2] = eArr[i];
                    iArr[i2] = i4;
                    i2++;
                }
                i++;
            }
        }

        private void maintenance() {
            int i = this.length;
            E[] eArr = this.elements;
            int length = eArr.length;
            if (i == length) {
                dedupAndCoalesce(true);
            } else if (this.forceCopyElements) {
                this.elements = (E[]) Arrays.copyOf(eArr, length);
            }
            this.forceCopyElements = false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableCollection.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder addCopies(Object obj, int i) {
            return addCopies((Builder<E>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder setCount(Object obj, int i) {
            return setCount((Builder<E>) obj, i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public /* bridge */ /* synthetic */ ImmutableMultiset.Builder add(Object obj) {
            return add((Builder<E>) obj);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public Builder<E> addCopies(E e, int i) {
            e.getClass();
            CollectPreconditions.checkNonnegative(i, "occurrences");
            if (i == 0) {
                return this;
            }
            maintenance();
            E[] eArr = this.elements;
            int i2 = this.length;
            eArr[i2] = e;
            this.counts[i2] = i;
            this.length = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        public Builder<E> setCount(E e, int i) {
            e.getClass();
            CollectPreconditions.checkNonnegative(i, "count");
            maintenance();
            E[] eArr = this.elements;
            int i2 = this.length;
            eArr[i2] = e;
            this.counts[i2] = ~i;
            this.length = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E e) {
            return addCopies((Builder<E>) e, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry<E> entry : ((Multiset) iterable).entrySet()) {
                    addCopies((Builder<E>) entry.getElement(), entry.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((Builder<E>) it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSortedMultiset<E> build() {
            dedupAndCoalesceAndDeleteEmpty();
            int i = this.length;
            if (i == 0) {
                return ImmutableSortedMultiset.emptyMultiset(this.comparator);
            }
            ImmutableSortedSet immutableSortedSetConstruct = ImmutableSortedSet.construct(this.comparator, i, this.elements);
            long[] jArr = new long[this.length + 1];
            int i2 = 0;
            while (i2 < this.length) {
                int i3 = i2 + 1;
                jArr[i3] = jArr[i2] + this.counts[i2];
                i2 = i3;
            }
            this.forceCopyElements = true;
            return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) immutableSortedSetConstruct, jArr, 0, this.length);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> add(E... eArr) {
            for (E e : eArr) {
                add((Builder<E>) e);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((Builder<E>) it.next());
            }
            return this;
        }
    }

    /* compiled from: PG */
    final class SerializedForm<E> implements Serializable {
        final Comparator<? super E> comparator;
        final int[] counts;
        final E[] elements;

        public SerializedForm(SortedMultiset<E> sortedMultiset) {
            this.comparator = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.elements = (E[]) new Object[size];
            this.counts = new int[size];
            int i = 0;
            for (Multiset.Entry<E> entry : sortedMultiset.entrySet()) {
                this.elements[i] = entry.getElement();
                this.counts[i] = entry.getCount();
                i++;
            }
        }

        Object readResolve() {
            int length = this.elements.length;
            Builder builder = new Builder(this.comparator);
            for (int i = 0; i < length; i++) {
                builder.addCopies((Builder) this.elements[i], this.counts[i]);
            }
            return builder.build();
        }
    }

    @Deprecated
    public static <E> Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(SortedMultiset<E> sortedMultiset) {
        return copyOfSortedEntries(sortedMultiset.comparator(), new ArrayList(sortedMultiset.entrySet()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> ImmutableSortedMultiset<E> copyOfSortedEntries(Comparator<? super E> comparator, java.util.Collection<Multiset.Entry<E>> collection) {
        if (collection.isEmpty()) {
            return emptyMultiset(comparator);
        }
        ImmutableList.Builder builder = new ImmutableList.Builder(collection.size());
        long[] jArr = new long[collection.size() + 1];
        Iterator<Multiset.Entry<E>> it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            builder.add((ImmutableList.Builder) it.next().getElement());
            int i2 = i + 1;
            jArr[i2] = jArr[i] + r5.getCount();
            i = i2;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(builder.build(), comparator), jArr, 0, collection.size());
    }

    static <E> ImmutableSortedMultiset<E> emptyMultiset(Comparator<? super E> comparator) {
        return Ordering.natural().equals(comparator) ? (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET : new RegularImmutableSortedMultiset(comparator);
    }

    static /* synthetic */ int lambda$toImmutableSortedMultiset$0(Object obj) {
        return 1;
    }

    static /* synthetic */ Multiset lambda$toImmutableSortedMultiset$3(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T, E> void mapAndAdd(T t, Multiset<E> multiset, Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        Object objApply = function.apply(t);
        objApply.getClass();
        multiset.add(objApply, toIntFunction.applyAsInt(t));
    }

    public static <E extends Comparable<?>> Builder<E> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <E> ImmutableSortedMultiset<E> of() {
        return (ImmutableSortedMultiset<E>) RegularImmutableSortedMultiset.NATURAL_EMPTY_MULTISET;
    }

    public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
        return new Builder<>(comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> Builder<E> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    @Deprecated
    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        throw new UnsupportedOperationException();
    }

    public static <E> Collector<E, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(Comparator<? super E> comparator) {
        return toImmutableSortedMultiset(comparator, Function$CC.identity(), new ToIntFunction() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda4
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return 1;
            }
        });
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultisetEmptyMultiset = this.descendingMultiset;
        if (immutableSortedMultisetEmptyMultiset == null) {
            immutableSortedMultisetEmptyMultiset = isEmpty() ? emptyMultiset(Ordering.from(comparator()).reverse()) : new DescendingImmutableSortedMultiset<>(this);
            this.descendingMultiset = immutableSortedMultisetEmptyMultiset;
        }
        return immutableSortedMultisetEmptyMultiset;
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public abstract ImmutableSortedSet<E> elementSet();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ SortedMultiset headMultiset(Object obj, BoundType boundType) {
        return headMultiset((ImmutableSortedMultiset<E>) obj, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        sij.v(comparator().compare(e, e2) <= 0, "Expected lowerBound <= upperBound but %s > %s", e, e2);
        return tailMultiset((ImmutableSortedMultiset<E>) e, boundType).headMultiset((ImmutableSortedMultiset<E>) e2, boundType2);
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e, BoundType boundType);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ SortedMultiset tailMultiset(Object obj, BoundType boundType) {
        return tailMultiset((ImmutableSortedMultiset<E>) obj, boundType);
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? copyOfSortedEntries(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        Builder builder = new Builder(comparator);
        builder.addAll((Iterable) iterable);
        return builder.build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.of(comparable), new long[]{0, 1}, 0, 1);
    }

    @Deprecated
    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        throw new UnsupportedOperationException();
    }

    public static <T, E> Collector<T, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(final Comparator<? super E> comparator, final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        comparator.getClass();
        function.getClass();
        toIntFunction.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return TreeMultiset.create(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ImmutableSortedMultiset.mapAndAdd(obj2, (Multiset) obj, function, toIntFunction);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda2
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Multiset multiset = (Multiset) obj;
                ImmutableSortedMultiset.lambda$toImmutableSortedMultiset$3(multiset, (Multiset) obj2);
                return multiset;
            }
        }, new Function() { // from class: com.google.common.collect.ImmutableSortedMultiset$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMultiset.copyOfSortedEntries(comparator, ((Multiset) obj).entrySet());
            }

            public /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Collector.Characteristics[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public /* bridge */ /* synthetic */ SortedMultiset subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return subMultiset((BoundType) obj, boundType, (BoundType) obj2, boundType2);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        comparator.getClass();
        Builder builder = new Builder(comparator);
        builder.addAll((Iterator) it);
        return builder.build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(Ordering.natural(), Arrays.asList(comparableArr));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(comparableArr.length + 6);
        Collections.addAll(arrayListNewArrayListWithCapacity, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListNewArrayListWithCapacity, comparableArr);
        return copyOf(Ordering.natural(), arrayListNewArrayListWithCapacity);
    }

    @Deprecated
    public static <Z> ImmutableSortedMultiset<Z> copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4, E e5) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
