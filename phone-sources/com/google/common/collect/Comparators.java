package com.google.common.collect;

import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Comparators {
    private Comparators() {
    }

    public static <T> Comparator<Optional<T>> emptiesFirst(Comparator<? super T> comparator) {
        comparator.getClass();
        return Comparator.CC.comparing(new Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Comparators.orElseNull((Optional) obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.nullsFirst(comparator));
    }

    public static <T> java.util.Comparator<Optional<T>> emptiesLast(java.util.Comparator<? super T> comparator) {
        comparator.getClass();
        return Comparator.CC.comparing(new Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda5
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Comparators.orElseNull((Optional) obj);
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Comparator.CC.nullsLast(comparator));
    }

    public static <T> Collector<T, ?, List<T>> greatest(int i, java.util.Comparator<? super T> comparator) {
        return least(i, Comparator.EL.reversed(comparator));
    }

    public static <T> boolean isInOrder(Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        comparator.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean isInStrictOrder(Iterable<? extends T> iterable, java.util.Comparator<T> comparator) {
        comparator.getClass();
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> Collector<T, ?, List<T>> least(final int i, final java.util.Comparator<? super T> comparator) {
        CollectPreconditions.checkNonnegative(i, "k");
        comparator.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return TopKSelector.least(i, comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((TopKSelector) obj).offer(obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda2
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                TopKSelector topKSelector = (TopKSelector) obj;
                topKSelector.combine((TopKSelector) obj2);
                return topKSelector;
            }
        }, new Function() { // from class: com.google.common.collect.Comparators$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((TopKSelector) obj).topK();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> java.util.Comparator<Iterable<S>> lexicographical(java.util.Comparator<T> comparator) {
        comparator.getClass();
        return new LexicographicalOrdering(comparator);
    }

    public static <T extends Comparable<? super T>> T max(T t, T t2) {
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static <T extends Comparable<? super T>> T min(T t, T t2) {
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> T orElseNull(Optional<T> optional) {
        return optional.orElse(null);
    }

    public static <T> T max(T t, T t2, java.util.Comparator<? super T> comparator) {
        return comparator.compare(t, t2) >= 0 ? t : t2;
    }

    public static <T> T min(T t, T t2, java.util.Comparator<? super T> comparator) {
        return comparator.compare(t, t2) <= 0 ? t : t2;
    }
}
