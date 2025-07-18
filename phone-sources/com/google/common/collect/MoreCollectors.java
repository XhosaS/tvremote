package com.google.common.collect;

import com.google.common.collect.MoreCollectors;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class MoreCollectors {
    private static final Collector<Object, ?, Optional<Object>> TO_OPTIONAL = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda4
        @Override // java.util.function.Supplier
        public final Object get() {
            return new MoreCollectors.ToOptionalState();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda5
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            ((MoreCollectors.ToOptionalState) obj).add(obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda6
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((MoreCollectors.ToOptionalState) obj).combine((MoreCollectors.ToOptionalState) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda7
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public /* synthetic */ Function mo439andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((MoreCollectors.ToOptionalState) obj).getOptional();
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, Collector.Characteristics.UNORDERED);
    private static final Object NULL_PLACEHOLDER = new Object();
    private static final Collector<Object, ?, Object> ONLY_ELEMENT = Collector.CC.of(new Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda4
        @Override // java.util.function.Supplier
        public final Object get() {
            return new MoreCollectors.ToOptionalState();
        }
    }, new BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda8
        @Override // java.util.function.BiConsumer
        public final void accept(Object obj, Object obj2) {
            MoreCollectors.lambda$static$0((MoreCollectors.ToOptionalState) obj, obj2);
        }

        public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
            return BiConsumer$CC.$default$andThen(this, biConsumer);
        }
    }, new BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda6
        public /* synthetic */ BiFunction andThen(Function function) {
            return BiFunction$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.BiFunction
        public final Object apply(Object obj, Object obj2) {
            return ((MoreCollectors.ToOptionalState) obj).combine((MoreCollectors.ToOptionalState) obj2);
        }
    }, new Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda9
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public /* synthetic */ Function mo439andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MoreCollectors.lambda$static$1((MoreCollectors.ToOptionalState) obj);
        }

        public /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    }, Collector.Characteristics.UNORDERED);

    /* compiled from: PG */
    final class OnlyElementOrThrowState<T> {
        T element;
        final Supplier<? extends RuntimeException> exceptionSupplier;
        boolean hasElement = false;

        public OnlyElementOrThrowState(Supplier<? extends RuntimeException> supplier) {
            this.exceptionSupplier = supplier;
        }

        public void add(T t) {
            if (this.hasElement) {
                throw ((RuntimeException) this.exceptionSupplier.get());
            }
            this.element = t;
            this.hasElement = true;
        }

        public OnlyElementOrThrowState<T> combine(OnlyElementOrThrowState<T> onlyElementOrThrowState) {
            if (!this.hasElement) {
                return onlyElementOrThrowState;
            }
            if (onlyElementOrThrowState.hasElement) {
                throw ((RuntimeException) this.exceptionSupplier.get());
            }
            return this;
        }

        public T getElement() {
            if (this.hasElement) {
                return this.element;
            }
            throw ((RuntimeException) this.exceptionSupplier.get());
        }
    }

    /* compiled from: PG */
    final class ToOptionalState {
        static final int MAX_EXTRAS = 4;
        Object element = null;
        List<Object> extras = Collections.EMPTY_LIST;

        public void add(Object obj) {
            obj.getClass();
            if (this.element == null) {
                this.element = obj;
                return;
            }
            if (this.extras.isEmpty()) {
                ArrayList arrayList = new ArrayList(4);
                this.extras = arrayList;
                arrayList.add(obj);
            } else {
                if (this.extras.size() >= 4) {
                    throw multiples(true);
                }
                this.extras.add(obj);
            }
        }

        public ToOptionalState combine(ToOptionalState toOptionalState) {
            if (this.element == null) {
                return toOptionalState;
            }
            if (toOptionalState.element != null) {
                if (this.extras.isEmpty()) {
                    this.extras = new ArrayList();
                }
                this.extras.add(toOptionalState.element);
                this.extras.addAll(toOptionalState.extras);
                if (this.extras.size() > 4) {
                    List<Object> list = this.extras;
                    list.subList(4, list.size()).clear();
                    throw multiples(true);
                }
            }
            return this;
        }

        public Object getElement() {
            if (this.element == null) {
                throw new NoSuchElementException();
            }
            if (this.extras.isEmpty()) {
                return this.element;
            }
            throw multiples(false);
        }

        public Optional<Object> getOptional() {
            if (this.extras.isEmpty()) {
                return Optional.ofNullable(this.element);
            }
            throw multiples(false);
        }

        public IllegalArgumentException multiples(boolean z) {
            StringBuilder sb = new StringBuilder("expected one element but was: <");
            sb.append(this.element);
            for (Object obj : this.extras) {
                sb.append(", ");
                sb.append(obj);
            }
            if (z) {
                sb.append(", ...");
            }
            sb.append('>');
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private MoreCollectors() {
    }

    static /* synthetic */ OnlyElementOrThrowState lambda$onlyElement$0(Supplier supplier) {
        return new OnlyElementOrThrowState(supplier);
    }

    static /* synthetic */ void lambda$static$0(ToOptionalState toOptionalState, Object obj) {
        if (obj == null) {
            obj = NULL_PLACEHOLDER;
        }
        toOptionalState.add(obj);
    }

    static /* synthetic */ Object lambda$static$1(ToOptionalState toOptionalState) {
        Object element = toOptionalState.getElement();
        if (element == NULL_PLACEHOLDER) {
            return null;
        }
        return element;
    }

    public static <T> Collector<T, ?, T> onlyElement() {
        return (Collector<T, ?, T>) ONLY_ELEMENT;
    }

    public static <T> Collector<T, ?, Optional<T>> toOptional() {
        return (Collector<T, ?, Optional<T>>) TO_OPTIONAL;
    }

    public static <T> Collector<T, ?, T> onlyElement(final Supplier<? extends RuntimeException> supplier) {
        supplier.getClass();
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return MoreCollectors.lambda$onlyElement$0(supplier);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((MoreCollectors.OnlyElementOrThrowState) obj).add(obj2);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda2
            public /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((MoreCollectors.OnlyElementOrThrowState) obj).combine((MoreCollectors.OnlyElementOrThrowState) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.MoreCollectors$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MoreCollectors.OnlyElementOrThrowState) obj).getElement();
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, Collector.Characteristics.UNORDERED);
    }
}
