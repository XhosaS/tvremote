package com.google.common.collect;

import com.google.common.collect.CollectSpliterators;
import defpackage.a;
import defpackage.sij;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.stream.IntStream;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes.dex */
final class CollectSpliterators {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.CollectSpliterators$1, reason: invalid class name */
    class AnonymousClass1 implements Spliterator {
        final /* synthetic */ Spliterator val$fromSpliterator;
        final /* synthetic */ Function val$function;

        public AnonymousClass1(Spliterator spliterator, Function function) {
            this.val$fromSpliterator = spliterator;
            this.val$function = function;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.val$fromSpliterator.characteristics() & (-262);
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.val$fromSpliterator.estimateSize();
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(final Consumer consumer) {
            final Function function = this.val$function;
            this.val$fromSpliterator.forEachRemaining(new Consumer() { // from class: com.google.common.collect.CollectSpliterators$1$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    consumer.accept(function.apply(obj));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(final Consumer consumer) {
            final Function function = this.val$function;
            return this.val$fromSpliterator.tryAdvance(new Consumer() { // from class: com.google.common.collect.CollectSpliterators$1$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    consumer.accept(function.apply(obj));
                }

                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            Spliterator spliteratorTrySplit = this.val$fromSpliterator.trySplit();
            if (spliteratorTrySplit != null) {
                return CollectSpliterators.map(spliteratorTrySplit, this.val$function);
            }
            return null;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.CollectSpliterators$1Splitr, reason: invalid class name */
    class C1Splitr implements Spliterator, Consumer {
        Object holder = null;
        final /* synthetic */ Spliterator val$fromSpliterator;
        final /* synthetic */ Predicate val$predicate;

        public C1Splitr(Spliterator spliterator, Predicate predicate) {
            this.val$fromSpliterator = spliterator;
            this.val$predicate = predicate;
        }

        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            this.holder = obj;
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.val$fromSpliterator.characteristics() & 277;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.val$fromSpliterator.estimateSize() / 2;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            return this.val$fromSpliterator.getComparator();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            while (this.val$fromSpliterator.tryAdvance(this)) {
                try {
                    Object obj = this.holder;
                    if (this.val$predicate.test(obj)) {
                        consumer.accept(obj);
                        this.holder = null;
                        return true;
                    }
                } finally {
                    this.holder = null;
                }
            }
            return false;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            Spliterator spliteratorTrySplit = this.val$fromSpliterator.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            return CollectSpliterators.filter(spliteratorTrySplit, this.val$predicate);
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.CollectSpliterators$1WithCharacteristics, reason: invalid class name */
    class C1WithCharacteristics implements Spliterator {
        private final Spliterator.OfInt delegate;
        final /* synthetic */ Comparator val$comparator;
        final /* synthetic */ int val$extraCharacteristics;
        final /* synthetic */ IntFunction val$function;

        public C1WithCharacteristics(Spliterator.OfInt ofInt, IntFunction intFunction, int i, Comparator comparator) {
            this.val$function = intFunction;
            this.val$extraCharacteristics = i;
            this.val$comparator = comparator;
            this.delegate = ofInt;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.val$extraCharacteristics | 16464;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.delegate.estimateSize();
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(final Consumer consumer) {
            final IntFunction intFunction = this.val$function;
            this.delegate.forEachRemaining(new IntConsumer() { // from class: com.google.common.collect.CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda0
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    consumer.accept(intFunction.apply(i));
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
        }

        @Override // j$.util.Spliterator
        public Comparator getComparator() {
            if (hasCharacteristics(4)) {
                return this.val$comparator;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(final Consumer consumer) {
            final IntFunction intFunction = this.val$function;
            return this.delegate.tryAdvance(new IntConsumer() { // from class: com.google.common.collect.CollectSpliterators$1WithCharacteristics$$ExternalSyntheticLambda1
                @Override // java.util.function.IntConsumer
                public final void accept(int i) {
                    consumer.accept(intFunction.apply(i));
                }

                public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                    return IntConsumer$CC.$default$andThen(this, intConsumer);
                }
            });
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            Spliterator.OfInt ofIntTrySplit = this.delegate.trySplit();
            if (ofIntTrySplit == null) {
                return null;
            }
            return new C1WithCharacteristics(ofIntTrySplit, this.val$function, this.val$extraCharacteristics, this.val$comparator);
        }
    }

    /* compiled from: PG */
    abstract class FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {
        int characteristics;
        long estimatedSize;
        final Factory<InElementT, OutSpliteratorT> factory;
        final Spliterator<InElementT> from;
        final Function<? super InElementT, OutSpliteratorT> function;
        OutSpliteratorT prefix;

        /* compiled from: PG */
        interface Factory<InElementT, OutSpliteratorT extends Spliterator<?>> {
            OutSpliteratorT newFlatMapSpliterator(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, int i, long j);
        }

        public FlatMapSpliterator(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, Factory<InElementT, OutSpliteratorT> factory, int i, long j) {
            this.prefix = outspliteratort;
            this.from = spliterator;
            this.function = function;
            this.factory = factory;
            this.characteristics = i;
            this.estimatedSize = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$forEachRemaining$0(Consumer consumer, Object obj) {
            Spliterator spliterator = (Spliterator) this.function.apply(obj);
            if (spliterator != null) {
                spliterator.forEachRemaining(consumer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryAdvance$0(Object obj) {
            this.prefix = (OutSpliteratorT) this.function.apply(obj);
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return this.characteristics;
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                this.estimatedSize = Math.max(this.estimatedSize, outspliteratort.estimateSize());
            }
            return Math.max(this.estimatedSize, 0L);
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(final Consumer<? super OutElementT> consumer) {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != null) {
                outspliteratort.forEachRemaining(consumer);
                this.prefix = null;
            }
            this.from.forEachRemaining(new Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$forEachRemaining$0(consumer, obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            });
            this.estimatedSize = 0L;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i) {
            return Spliterator.CC.$default$hasCharacteristics(this, i);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer<? super OutElementT> consumer) {
            do {
                OutSpliteratorT outspliteratort = this.prefix;
                if (outspliteratort != null && outspliteratort.tryAdvance(consumer)) {
                    long j = this.estimatedSize;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.estimatedSize = j - 1;
                    return true;
                }
                this.prefix = null;
            } while (this.from.tryAdvance(new Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliterator$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$tryAdvance$0(obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer2) {
                    return Consumer$CC.$default$andThen(this, consumer2);
                }
            }));
            return false;
        }

        @Override // j$.util.Spliterator
        public final OutSpliteratorT trySplit() {
            Spliterator<InElementT> spliteratorTrySplit = this.from.trySplit();
            if (spliteratorTrySplit == null) {
                OutSpliteratorT outspliteratort = this.prefix;
                if (outspliteratort == null) {
                    return null;
                }
                this.prefix = null;
                return outspliteratort;
            }
            int i = this.characteristics & (-65);
            long jEstimateSize = estimateSize();
            if (jEstimateSize < Long.MAX_VALUE) {
                jEstimateSize /= 2;
                this.estimatedSize -= jEstimateSize;
                this.characteristics = i;
            }
            OutSpliteratorT outspliteratort2 = (OutSpliteratorT) this.factory.newFlatMapSpliterator(this.prefix, spliteratorTrySplit, this.function, i, jEstimateSize);
            this.prefix = null;
            return outspliteratort2;
        }
    }

    /* compiled from: PG */
    final class FlatMapSpliteratorOfDouble<InElementT> extends FlatMapSpliteratorOfPrimitive<InElementT, Double, DoubleConsumer, Spliterator.OfDouble> implements Spliterator.OfDouble {
        public FlatMapSpliteratorOfDouble(Spliterator.OfDouble ofDouble, Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfDouble> function, int i, long j) {
            super(ofDouble, spliterator, function, new FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfDouble$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final Spliterator newFlatMapSpliterator(Spliterator spliterator2, Spliterator spliterator3, Function function2, int i2, long j2) {
                    return new CollectSpliterators.FlatMapSpliteratorOfDouble((Spliterator.OfDouble) spliterator2, spliterator3, function2, i2, j2);
                }
            }, i, j);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
            super.forEachRemaining((FlatMapSpliteratorOfDouble<InElementT>) doubleConsumer);
        }

        @Override // j$.util.Spliterator.OfDouble
        public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
            return super.tryAdvance((FlatMapSpliteratorOfDouble<InElementT>) doubleConsumer);
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive, com.google.common.collect.CollectSpliterators.FlatMapSpliterator, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
            return (Spliterator.OfDouble) super.trySplit();
        }
    }

    /* compiled from: PG */
    final class FlatMapSpliteratorOfInt<InElementT> extends FlatMapSpliteratorOfPrimitive<InElementT, Integer, IntConsumer, Spliterator.OfInt> implements Spliterator.OfInt {
        public FlatMapSpliteratorOfInt(Spliterator.OfInt ofInt, Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfInt> function, int i, long j) {
            super(ofInt, spliterator, function, new FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfInt$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final Spliterator newFlatMapSpliterator(Spliterator spliterator2, Spliterator spliterator3, Function function2, int i2, long j2) {
                    return new CollectSpliterators.FlatMapSpliteratorOfInt((Spliterator.OfInt) spliterator2, spliterator3, function2, i2, j2);
                }
            }, i, j);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
            super.forEachRemaining((FlatMapSpliteratorOfInt<InElementT>) intConsumer);
        }

        @Override // j$.util.Spliterator.OfInt
        public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
            return super.tryAdvance((FlatMapSpliteratorOfInt<InElementT>) intConsumer);
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive, com.google.common.collect.CollectSpliterators.FlatMapSpliterator, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
            return (Spliterator.OfInt) super.trySplit();
        }
    }

    /* compiled from: PG */
    final class FlatMapSpliteratorOfLong<InElementT> extends FlatMapSpliteratorOfPrimitive<InElementT, Long, LongConsumer, Spliterator.OfLong> implements Spliterator.OfLong {
        public FlatMapSpliteratorOfLong(Spliterator.OfLong ofLong, Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfLong> function, int i, long j) {
            super(ofLong, spliterator, function, new FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfLong$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final Spliterator newFlatMapSpliterator(Spliterator spliterator2, Spliterator spliterator3, Function function2, int i2, long j2) {
                    return new CollectSpliterators.FlatMapSpliteratorOfLong((Spliterator.OfLong) spliterator2, spliterator3, function2, i2, j2);
                }
            }, i, j);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
            super.forEachRemaining((FlatMapSpliteratorOfLong<InElementT>) longConsumer);
        }

        @Override // j$.util.Spliterator.OfLong
        public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
            return super.tryAdvance((FlatMapSpliteratorOfLong<InElementT>) longConsumer);
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliteratorOfPrimitive, com.google.common.collect.CollectSpliterators.FlatMapSpliterator, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
            return (Spliterator.OfLong) super.trySplit();
        }
    }

    /* compiled from: PG */
    final class FlatMapSpliteratorOfObject<InElementT, OutElementT> extends FlatMapSpliterator<InElementT, OutElementT, Spliterator<OutElementT>> {
        public FlatMapSpliteratorOfObject(Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
            super(spliterator, spliterator2, function, new FlatMapSpliterator.Factory() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfObject$$ExternalSyntheticLambda0
                @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator.Factory
                public final Spliterator newFlatMapSpliterator(Spliterator spliterator3, Spliterator spliterator4, Function function2, int i2, long j2) {
                    return new CollectSpliterators.FlatMapSpliteratorOfObject(spliterator3, spliterator4, function2, i2, j2);
                }
            }, i, j);
        }
    }

    /* compiled from: PG */
    abstract class FlatMapSpliteratorOfPrimitive<InElementT, OutElementT, OutConsumerT, OutSpliteratorT extends Spliterator.OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT>> extends FlatMapSpliterator<InElementT, OutElementT, OutSpliteratorT> implements Spliterator.OfPrimitive<OutElementT, OutConsumerT, OutSpliteratorT> {
        public FlatMapSpliteratorOfPrimitive(OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, FlatMapSpliterator.Factory<InElementT, OutSpliteratorT> factory, int i, long j) {
            super(outspliteratort, spliterator, function, factory, i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$forEachRemaining$0(Object obj, Object obj2) {
            Spliterator.OfPrimitive ofPrimitive = (Spliterator.OfPrimitive) this.function.apply(obj2);
            if (ofPrimitive != null) {
                ofPrimitive.forEachRemaining((Spliterator.OfPrimitive) obj);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$tryAdvance$0(Object obj) {
            this.prefix = (OutSpliteratorT) this.function.apply(obj);
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public final void forEachRemaining(final OutConsumerT outconsumert) {
            OutSpliteratorT outspliteratort = this.prefix;
            if (outspliteratort != 0) {
                ((Spliterator.OfPrimitive) outspliteratort).forEachRemaining((Spliterator.OfPrimitive) outconsumert);
                this.prefix = null;
            }
            this.from.forEachRemaining(new Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfPrimitive$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$forEachRemaining$0(outconsumert, obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.estimatedSize = 0L;
        }

        @Override // j$.util.Spliterator.OfPrimitive
        public final boolean tryAdvance(OutConsumerT outconsumert) {
            do {
                OutSpliteratorT outspliteratort = this.prefix;
                if (outspliteratort != 0 && ((Spliterator.OfPrimitive) outspliteratort).tryAdvance((Spliterator.OfPrimitive) outconsumert)) {
                    long j = this.estimatedSize;
                    if (j == Long.MAX_VALUE) {
                        return true;
                    }
                    this.estimatedSize = j - 1;
                    return true;
                }
                this.prefix = null;
            } while (this.from.tryAdvance(new Consumer() { // from class: com.google.common.collect.CollectSpliterators$FlatMapSpliteratorOfPrimitive$$ExternalSyntheticLambda1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.lambda$tryAdvance$0(obj);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }));
            return false;
        }

        @Override // com.google.common.collect.CollectSpliterators.FlatMapSpliterator, j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
            return (Spliterator.OfPrimitive) super.trySplit();
        }
    }

    private CollectSpliterators() {
    }

    static <T> Spliterator<T> filter(Spliterator<T> spliterator, Predicate<? super T> predicate) {
        spliterator.getClass();
        predicate.getClass();
        return new C1Splitr(spliterator, predicate);
    }

    static <InElementT, OutElementT> Spliterator<OutElementT> flatMap(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator<OutElementT>> function, int i, long j) {
        sij.o((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        sij.o((i & 4) == 0, "flatMap does not support SORTED characteristic");
        spliterator.getClass();
        function.getClass();
        return new FlatMapSpliteratorOfObject(null, spliterator, function, i, j);
    }

    static <InElementT> Spliterator.OfDouble flatMapToDouble(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfDouble> function, int i, long j) {
        sij.o((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        sij.o((i & 4) == 0, "flatMap does not support SORTED characteristic");
        spliterator.getClass();
        function.getClass();
        return new FlatMapSpliteratorOfDouble(null, spliterator, function, i, j);
    }

    static <InElementT> Spliterator.OfInt flatMapToInt(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfInt> function, int i, long j) {
        sij.o((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        sij.o((i & 4) == 0, "flatMap does not support SORTED characteristic");
        spliterator.getClass();
        function.getClass();
        return new FlatMapSpliteratorOfInt(null, spliterator, function, i, j);
    }

    static <InElementT> Spliterator.OfLong flatMapToLong(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator.OfLong> function, int i, long j) {
        sij.o((i & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        sij.o((i & 4) == 0, "flatMap does not support SORTED characteristic");
        spliterator.getClass();
        function.getClass();
        return new FlatMapSpliteratorOfLong(null, spliterator, function, i, j);
    }

    static <T> Spliterator<T> indexed(int i, int i2, IntFunction<T> intFunction) {
        return indexed(i, i2, intFunction, null);
    }

    static <InElementT, OutElementT> Spliterator<OutElementT> map(Spliterator<InElementT> spliterator, Function<? super InElementT, ? extends OutElementT> function) {
        spliterator.getClass();
        function.getClass();
        return new AnonymousClass1(spliterator, function);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [j$.util.Spliterator$OfInt] */
    static <T> Spliterator<T> indexed(int i, int i2, IntFunction<T> intFunction, Comparator<? super T> comparator) {
        if (comparator != null) {
            a.H((i2 & 4) != 0);
        }
        return new C1WithCharacteristics(IntStream.CC.range(0, i).spliterator2(), intFunction, i2, comparator);
    }
}
