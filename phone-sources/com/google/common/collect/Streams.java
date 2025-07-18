package com.google.common.collect;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Streams;
import defpackage.sfy;
import defpackage.tst;
import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.OptionalLong;
import j$.util.PrimitiveIterator$OfDouble;
import j$.util.PrimitiveIterator$OfInt;
import j$.util.PrimitiveIterator$OfLong;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.DoubleConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import j$.util.stream.BaseStream;
import j$.util.stream.DoubleStream;
import j$.util.stream.IntStream;
import j$.util.stream.LongStream;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class Streams {

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.Streams$1OptionalState, reason: invalid class name */
    class C1OptionalState {
        boolean set = false;
        Object value = null;

        public Object get() {
            Object obj = this.value;
            obj.getClass();
            return obj;
        }

        public void set(Object obj) {
            this.set = true;
            this.value = obj;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.Streams$1Splitr, reason: invalid class name */
    class C1Splitr extends MapWithIndexSpliterator implements Consumer {
        Object holder;
        final /* synthetic */ FunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1Splitr(Spliterator spliterator, long j, FunctionWithIndex functionWithIndex) {
            super(spliterator, j);
            this.val$function = functionWithIndex;
        }

        @Override // java.util.function.Consumer
        public void accept(Object obj) {
            this.holder = obj;
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public C1Splitr createSplit(Spliterator spliterator, long j) {
            return new C1Splitr(spliterator, j, this.val$function);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (!this.fromSpliterator.tryAdvance(this)) {
                return false;
            }
            try {
                FunctionWithIndex functionWithIndex = this.val$function;
                Object obj = this.holder;
                long j = this.index;
                this.index = 1 + j;
                consumer.accept(functionWithIndex.apply(obj, j));
                this.holder = null;
                return true;
            } catch (Throwable th) {
                this.holder = null;
                throw th;
            }
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.Streams$2Splitr, reason: invalid class name */
    class C2Splitr extends MapWithIndexSpliterator implements IntConsumer {
        int holder;
        final /* synthetic */ IntFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$IntFunctionWithIndex), (r0 I:com.google.common.collect.Streams$2Splitr) (LINE:1) com.google.common.collect.Streams.2Splitr.val$function com.google.common.collect.Streams$IntFunctionWithIndex, block:B:2:0x0000 */
        public C2Splitr(Spliterator.OfInt ofInt, Spliterator.OfInt ofInt2, long j) {
            IntFunctionWithIndex intFunctionWithIndex;
            super(ofInt, ofInt2);
            this.val$function = intFunctionWithIndex;
        }

        @Override // java.util.function.IntConsumer
        public void accept(int i) {
            this.holder = i;
        }

        public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
            return IntConsumer$CC.$default$andThen(this, intConsumer);
        }

        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public C2Splitr createSplit(Spliterator.OfInt ofInt, long j) {
            return new C2Splitr(ofInt, j, this.val$function);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (!((Spliterator.OfInt) this.fromSpliterator).tryAdvance((IntConsumer) this)) {
                return false;
            }
            IntFunctionWithIndex intFunctionWithIndex = this.val$function;
            int i = this.holder;
            long j = this.index;
            this.index = 1 + j;
            consumer.accept(intFunctionWithIndex.apply(i, j));
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.Streams$3Splitr, reason: invalid class name */
    class C3Splitr extends MapWithIndexSpliterator implements LongConsumer {
        long holder;
        final /* synthetic */ LongFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$LongFunctionWithIndex), (r0 I:com.google.common.collect.Streams$3Splitr) (LINE:1) com.google.common.collect.Streams.3Splitr.val$function com.google.common.collect.Streams$LongFunctionWithIndex, block:B:2:0x0000 */
        public C3Splitr(Spliterator.OfLong ofLong, Spliterator.OfLong ofLong2, long j) {
            LongFunctionWithIndex longFunctionWithIndex;
            super(ofLong, ofLong2);
            this.val$function = longFunctionWithIndex;
        }

        @Override // java.util.function.LongConsumer
        public void accept(long j) {
            this.holder = j;
        }

        public /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
            return LongConsumer$CC.$default$andThen(this, longConsumer);
        }

        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public C3Splitr createSplit(Spliterator.OfLong ofLong, long j) {
            return new C3Splitr(ofLong, j, this.val$function);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (!((Spliterator.OfLong) this.fromSpliterator).tryAdvance((LongConsumer) this)) {
                return false;
            }
            LongFunctionWithIndex longFunctionWithIndex = this.val$function;
            long j = this.holder;
            long j2 = this.index;
            this.index = 1 + j2;
            consumer.accept(longFunctionWithIndex.apply(j, j2));
            return true;
        }
    }

    /* compiled from: PG */
    /* renamed from: com.google.common.collect.Streams$4Splitr, reason: invalid class name */
    class C4Splitr extends MapWithIndexSpliterator implements DoubleConsumer {
        double holder;
        final /* synthetic */ DoubleFunctionWithIndex val$function;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0000: IPUT (r4 I:com.google.common.collect.Streams$DoubleFunctionWithIndex), (r0 I:com.google.common.collect.Streams$4Splitr) (LINE:1) com.google.common.collect.Streams.4Splitr.val$function com.google.common.collect.Streams$DoubleFunctionWithIndex, block:B:2:0x0000 */
        public C4Splitr(Spliterator.OfDouble ofDouble, Spliterator.OfDouble ofDouble2, long j) {
            DoubleFunctionWithIndex doubleFunctionWithIndex;
            super(ofDouble, ofDouble2);
            this.val$function = doubleFunctionWithIndex;
        }

        @Override // java.util.function.DoubleConsumer
        public void accept(double d) {
            this.holder = d;
        }

        public /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
            return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
        }

        @Override // com.google.common.collect.Streams.MapWithIndexSpliterator
        public C4Splitr createSplit(Spliterator.OfDouble ofDouble, long j) {
            return new C4Splitr(ofDouble, j, this.val$function);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            if (!((Spliterator.OfDouble) this.fromSpliterator).tryAdvance((DoubleConsumer) this)) {
                return false;
            }
            DoubleFunctionWithIndex doubleFunctionWithIndex = this.val$function;
            double d = this.holder;
            long j = this.index;
            this.index = 1 + j;
            consumer.accept(doubleFunctionWithIndex.apply(d, j));
            return true;
        }
    }

    /* compiled from: PG */
    public interface DoubleFunctionWithIndex<R> {
        R apply(double d, long j);
    }

    /* compiled from: PG */
    public interface FunctionWithIndex<T, R> {
        R apply(T t, long j);
    }

    /* compiled from: PG */
    public interface IntFunctionWithIndex<R> {
        R apply(int i, long j);
    }

    /* compiled from: PG */
    public interface LongFunctionWithIndex<R> {
        R apply(long j, long j2);
    }

    /* compiled from: PG */
    abstract class MapWithIndexSpliterator<F extends Spliterator, R, S extends MapWithIndexSpliterator<F, R, S>> implements Spliterator<R> {
        final F fromSpliterator;
        long index;

        public MapWithIndexSpliterator(F f, long j) {
            this.fromSpliterator = f;
            this.index = j;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.fromSpliterator.characteristics() & 16464;
        }

        public abstract S createSplit(F f, long j);

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.fromSpliterator.estimateSize();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Spliterator.CC.$default$forEachRemaining(this, consumer);
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
        public S trySplit() {
            Spliterator spliteratorTrySplit = this.fromSpliterator.trySplit();
            if (spliteratorTrySplit == null) {
                return null;
            }
            S s = (S) createSplit(spliteratorTrySplit, this.index);
            this.index += spliteratorTrySplit.getExactSizeIfKnown();
            return s;
        }
    }

    /* compiled from: PG */
    class TemporaryPair<A, B> {
        final A a;
        final B b;

        public TemporaryPair(A a, B b) {
            this.a = a;
            this.b = b;
        }
    }

    private Streams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void closeAll(BaseStream<?, ?>[] baseStreamArr) {
        Exception exc = null;
        for (BaseStream<?, ?> baseStream : baseStreamArr) {
            try {
                baseStream.close();
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                } else {
                    exc.addSuppressed(e);
                }
            }
        }
        if (exc != null) {
            SneakyThrows.sneakyThrow(exc);
        }
    }

    public static DoubleStream concat(final DoubleStream... doubleStreamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(doubleStreamArr.length);
        int iCharacteristics = 336;
        long jAs = 0;
        boolean zIsParallel = false;
        for (DoubleStream doubleStream : doubleStreamArr) {
            zIsParallel |= doubleStream.isParallel();
            Spliterator<Double> spliteratorSpliterator2 = doubleStream.spliterator2();
            builder.add((ImmutableList.Builder) spliteratorSpliterator2);
            iCharacteristics &= spliteratorSpliterator2.characteristics();
            jAs = sfy.as(jAs, spliteratorSpliterator2.estimateSize());
        }
        return StreamSupport.doubleStream(CollectSpliterators.flatMapToDouble(builder.build().spliterator(), new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Spliterator.OfDouble) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, iCharacteristics, jAs), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                Streams.closeAll(doubleStreamArr);
            }
        });
    }

    public static OptionalDouble findLast(DoubleStream doubleStream) {
        return (OptionalDouble) findLast(doubleStream.boxed()).map(new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda15
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OptionalDouble.of(((Double) obj).doubleValue());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(OptionalDouble.empty());
    }

    public static <A, B> void forEachPair(Stream<A> stream, Stream<B> stream2, final BiConsumer<? super A, ? super B> biConsumer) {
        biConsumer.getClass();
        if (stream.isParallel() || stream2.isParallel()) {
            zip(stream, stream2, new BiFunction() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda11
                public /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return new Streams.TemporaryPair(obj, obj2);
                }
            }).forEach(new Consumer() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda12
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    Streams.TemporaryPair temporaryPair = (Streams.TemporaryPair) obj;
                    biConsumer.accept(temporaryPair.a, temporaryPair.b);
                }

                public /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        Iterator<A> it = stream.iterator();
        Iterator<B> it2 = stream2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            biConsumer.accept(it.next(), it2.next());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.util.Spliterator$OfDouble] */
    public static <R> Stream<R> mapWithIndex(final DoubleStream doubleStream, final DoubleFunctionWithIndex<R> doubleFunctionWithIndex) {
        doubleStream.getClass();
        doubleFunctionWithIndex.getClass();
        boolean zIsParallel = doubleStream.isParallel();
        ?? Spliterator2 = doubleStream.spliterator2();
        if (Spliterator2.hasCharacteristics(16384)) {
            return (Stream) StreamSupport.stream(new C4Splitr(Spliterator2, 0L, doubleFunctionWithIndex), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda16
                @Override // java.lang.Runnable
                public final void run() {
                    doubleStream.close();
                }
            });
        }
        final PrimitiveIterator$OfDouble it = Spliterators.iterator((Spliterator.OfDouble) Spliterator2);
        return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator(Spliterator2.estimateSize(), Spliterator2.characteristics() & 80) { // from class: com.google.common.collect.Streams.5
            long index = 0;

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ Comparator getComparator() {
                return Spliterator.CC.$default$getComparator(this);
            }

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ long getExactSizeIfKnown() {
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            }

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ boolean hasCharacteristics(int i) {
                return Spliterator.CC.$default$hasCharacteristics(this, i);
            }

            @Override // j$.util.Spliterator
            public boolean tryAdvance(Consumer consumer) {
                if (!it.hasNext()) {
                    return false;
                }
                DoubleFunctionWithIndex doubleFunctionWithIndex2 = doubleFunctionWithIndex;
                double dNextDouble = it.nextDouble();
                long j = this.index;
                this.index = 1 + j;
                consumer.accept(doubleFunctionWithIndex2.apply(dNextDouble, j));
                return true;
            }
        }, zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                doubleStream.close();
            }
        });
    }

    public static <T> Stream<T> stream(tst<T> tstVar) {
        return tstVar.g() ? Stream.CC.of(tstVar.c()) : Stream.CC.empty();
    }

    public static <A, B, R> Stream<R> zip(Stream<A> stream, Stream<B> stream2, final BiFunction<? super A, ? super B, R> biFunction) {
        stream.getClass();
        stream2.getClass();
        biFunction.getClass();
        boolean z = true;
        if (!stream.isParallel() && !stream2.isParallel()) {
            z = false;
        }
        Spliterator<A> spliterator = stream.spliterator2();
        Spliterator<B> spliterator2 = stream2.spliterator2();
        int iCharacteristics = spliterator.characteristics() & spliterator2.characteristics() & 80;
        final Iterator it = Spliterators.iterator(spliterator);
        final Iterator it2 = Spliterators.iterator(spliterator2);
        return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator(Math.min(spliterator.estimateSize(), spliterator2.estimateSize()), iCharacteristics) { // from class: com.google.common.collect.Streams.1
            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                Spliterator.CC.$default$forEachRemaining(this, consumer);
            }

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ Comparator getComparator() {
                return Spliterator.CC.$default$getComparator(this);
            }

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ long getExactSizeIfKnown() {
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            }

            @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
            public /* synthetic */ boolean hasCharacteristics(int i) {
                return Spliterator.CC.$default$hasCharacteristics(this, i);
            }

            @Override // j$.util.Spliterator
            public boolean tryAdvance(Consumer consumer) {
                if (!it.hasNext() || !it2.hasNext()) {
                    return false;
                }
                consumer.accept(biFunction.apply(it.next(), it2.next()));
                return true;
            }
        }, z).onClose(new Streams$$ExternalSyntheticLambda5(stream)).onClose(new Streams$$ExternalSyntheticLambda5(stream2));
    }

    public static <T> Stream<T> stream(Optional<T> optional) {
        return optional.isPresent() ? Stream.CC.of(optional.get()) : Stream.CC.empty();
    }

    public static OptionalInt findLast(IntStream intStream) {
        return (OptionalInt) findLast(intStream.boxed()).map(new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OptionalInt.of(((Integer) obj).intValue());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(OptionalInt.empty());
    }

    public static DoubleStream stream(OptionalDouble optionalDouble) {
        return optionalDouble.isPresent() ? DoubleStream.CC.of(optionalDouble.getAsDouble()) : DoubleStream.CC.empty();
    }

    public static IntStream stream(OptionalInt optionalInt) {
        return optionalInt.isPresent() ? IntStream.CC.of(optionalInt.getAsInt()) : IntStream.CC.empty();
    }

    public static OptionalLong findLast(LongStream longStream) {
        return (OptionalLong) findLast(longStream.boxed()).map(new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda8
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return OptionalLong.of(((Long) obj).longValue());
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(OptionalLong.empty());
    }

    public static LongStream stream(OptionalLong optionalLong) {
        return optionalLong.isPresent() ? LongStream.CC.of(optionalLong.getAsLong()) : LongStream.CC.empty();
    }

    public static <T> Stream<T> stream(Iterable<T> iterable) {
        if (iterable instanceof Collection) {
            return Collection.EL.stream((java.util.Collection) iterable);
        }
        return StreamSupport.stream(Iterable$EL.spliterator(iterable), false);
    }

    public static <T> Optional<T> findLast(Stream<T> stream) {
        final C1OptionalState c1OptionalState = new C1OptionalState();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(stream.spliterator2());
        while (!arrayDeque.isEmpty()) {
            Spliterator<T> spliterator = (Spliterator) arrayDeque.removeLast();
            if (spliterator.getExactSizeIfKnown() != 0) {
                if (spliterator.hasCharacteristics(16384)) {
                    while (true) {
                        Spliterator<T> spliteratorTrySplit = spliterator.trySplit();
                        if (spliteratorTrySplit == null || spliteratorTrySplit.getExactSizeIfKnown() == 0) {
                            break;
                        }
                        if (spliterator.getExactSizeIfKnown() == 0) {
                            spliterator = spliteratorTrySplit;
                            break;
                        }
                    }
                    spliterator.forEachRemaining(new Consumer() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda13
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            c1OptionalState.set(obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return Optional.of(c1OptionalState.get());
                }
                Spliterator<T> spliteratorTrySplit2 = spliterator.trySplit();
                if (spliteratorTrySplit2 != null && spliteratorTrySplit2.getExactSizeIfKnown() != 0) {
                    arrayDeque.addLast(spliteratorTrySplit2);
                    arrayDeque.addLast(spliterator);
                } else {
                    spliterator.forEachRemaining(new Consumer() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda13
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj) {
                            c1OptionalState.set(obj);
                        }

                        public /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (c1OptionalState.set) {
                        return Optional.of(c1OptionalState.get());
                    }
                }
            }
        }
        return Optional.empty();
    }

    @Deprecated
    public static <T> Stream<T> stream(java.util.Collection<T> collection) {
        return Collection.EL.stream(collection);
    }

    public static <T> Stream<T> stream(Iterator<T> it) {
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(it, 0), false);
    }

    public static IntStream concat(final IntStream... intStreamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(intStreamArr.length);
        int iCharacteristics = 336;
        long jAs = 0;
        boolean zIsParallel = false;
        for (IntStream intStream : intStreamArr) {
            zIsParallel |= intStream.isParallel();
            Spliterator<Integer> spliteratorSpliterator2 = intStream.spliterator2();
            builder.add((ImmutableList.Builder) spliteratorSpliterator2);
            iCharacteristics &= spliteratorSpliterator2.characteristics();
            jAs = sfy.as(jAs, spliteratorSpliterator2.estimateSize());
        }
        return StreamSupport.intStream(CollectSpliterators.flatMapToInt(builder.build().spliterator(), new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda9
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Spliterator.OfInt) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, iCharacteristics, jAs), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                Streams.closeAll(intStreamArr);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.util.Spliterator$OfInt] */
    public static <R> Stream<R> mapWithIndex(final IntStream intStream, final IntFunctionWithIndex<R> intFunctionWithIndex) {
        intStream.getClass();
        intFunctionWithIndex.getClass();
        boolean zIsParallel = intStream.isParallel();
        ?? Spliterator2 = intStream.spliterator2();
        if (!Spliterator2.hasCharacteristics(16384)) {
            final PrimitiveIterator$OfInt it = Spliterators.iterator((Spliterator.OfInt) Spliterator2);
            return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator(Spliterator2.estimateSize(), Spliterator2.characteristics() & 80) { // from class: com.google.common.collect.Streams.3
                long index = 0;

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Spliterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ Comparator getComparator() {
                    return Spliterator.CC.$default$getComparator(this);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ long getExactSizeIfKnown() {
                    return Spliterator.CC.$default$getExactSizeIfKnown(this);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ boolean hasCharacteristics(int i) {
                    return Spliterator.CC.$default$hasCharacteristics(this, i);
                }

                @Override // j$.util.Spliterator
                public boolean tryAdvance(Consumer consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    IntFunctionWithIndex intFunctionWithIndex2 = intFunctionWithIndex;
                    int iNextInt = it.nextInt();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept(intFunctionWithIndex2.apply(iNextInt, j));
                    return true;
                }
            }, zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda14
                @Override // java.lang.Runnable
                public final void run() {
                    intStream.close();
                }
            });
        }
        return (Stream) StreamSupport.stream(new C2Splitr(Spliterator2, 0L, intFunctionWithIndex), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                intStream.close();
            }
        });
    }

    public static LongStream concat(final LongStream... longStreamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(longStreamArr.length);
        int iCharacteristics = 336;
        long jAs = 0;
        boolean zIsParallel = false;
        for (LongStream longStream : longStreamArr) {
            zIsParallel |= longStream.isParallel();
            Spliterator<Long> spliteratorSpliterator2 = longStream.spliterator2();
            builder.add((ImmutableList.Builder) spliteratorSpliterator2);
            iCharacteristics &= spliteratorSpliterator2.characteristics();
            jAs = sfy.as(jAs, spliteratorSpliterator2.estimateSize());
        }
        return StreamSupport.longStream(CollectSpliterators.flatMapToLong(builder.build().spliterator(), new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Spliterator.OfLong) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, iCharacteristics, jAs), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                Streams.closeAll(longStreamArr);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j$.util.Spliterator$OfLong] */
    public static <R> Stream<R> mapWithIndex(final LongStream longStream, final LongFunctionWithIndex<R> longFunctionWithIndex) {
        longStream.getClass();
        longFunctionWithIndex.getClass();
        boolean zIsParallel = longStream.isParallel();
        ?? Spliterator2 = longStream.spliterator2();
        if (!Spliterator2.hasCharacteristics(16384)) {
            final PrimitiveIterator$OfLong it = Spliterators.iterator((Spliterator.OfLong) Spliterator2);
            return (Stream) StreamSupport.stream(new Spliterators.AbstractSpliterator(Spliterator2.estimateSize(), Spliterator2.characteristics() & 80) { // from class: com.google.common.collect.Streams.4
                long index = 0;

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Spliterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ Comparator getComparator() {
                    return Spliterator.CC.$default$getComparator(this);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ long getExactSizeIfKnown() {
                    return Spliterator.CC.$default$getExactSizeIfKnown(this);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ boolean hasCharacteristics(int i) {
                    return Spliterator.CC.$default$hasCharacteristics(this, i);
                }

                @Override // j$.util.Spliterator
                public boolean tryAdvance(Consumer consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    LongFunctionWithIndex longFunctionWithIndex2 = longFunctionWithIndex;
                    long jNextLong = it.nextLong();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept(longFunctionWithIndex2.apply(jNextLong, j));
                    return true;
                }
            }, zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    longStream.close();
                }
            });
        }
        return (Stream) StreamSupport.stream(new C3Splitr(Spliterator2, 0L, longFunctionWithIndex), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                longStream.close();
            }
        });
    }

    static /* synthetic */ Spliterator lambda$concat$0(Spliterator spliterator) {
        return spliterator;
    }

    static /* synthetic */ Spliterator.OfInt lambda$concat$2(Spliterator.OfInt ofInt) {
        return ofInt;
    }

    static /* synthetic */ Spliterator.OfLong lambda$concat$4(Spliterator.OfLong ofLong) {
        return ofLong;
    }

    static /* synthetic */ Spliterator.OfDouble lambda$concat$6(Spliterator.OfDouble ofDouble) {
        return ofDouble;
    }

    @SafeVarargs
    public static <T> Stream<T> concat(final Stream<? extends T>... streamArr) {
        ImmutableList.Builder builder = new ImmutableList.Builder(streamArr.length);
        int iCharacteristics = 336;
        long jAs = 0;
        boolean zIsParallel = false;
        for (Stream<? extends T> stream : streamArr) {
            zIsParallel |= stream.isParallel();
            Spliterator<? extends T> spliterator = stream.spliterator2();
            builder.add((ImmutableList.Builder) spliterator);
            iCharacteristics &= spliterator.characteristics();
            jAs = sfy.as(jAs, spliterator.estimateSize());
        }
        return StreamSupport.stream(CollectSpliterators.flatMap(builder.build().spliterator(), new Function() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public /* synthetic */ Function mo439andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (Spliterator) obj;
            }

            public /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, iCharacteristics, jAs), zIsParallel).onClose(new Runnable() { // from class: com.google.common.collect.Streams$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                Streams.closeAll(streamArr);
            }
        });
    }

    public static <T, R> Stream<R> mapWithIndex(Stream<T> stream, final FunctionWithIndex<? super T, ? extends R> functionWithIndex) {
        stream.getClass();
        functionWithIndex.getClass();
        boolean zIsParallel = stream.isParallel();
        Spliterator<T> spliterator = stream.spliterator2();
        if (!spliterator.hasCharacteristics(16384)) {
            final Iterator it = Spliterators.iterator(spliterator);
            return StreamSupport.stream(new Spliterators.AbstractSpliterator(spliterator.estimateSize(), spliterator.characteristics() & 80) { // from class: com.google.common.collect.Streams.2
                long index = 0;

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ void forEachRemaining(Consumer consumer) {
                    Spliterator.CC.$default$forEachRemaining(this, consumer);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ Comparator getComparator() {
                    return Spliterator.CC.$default$getComparator(this);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ long getExactSizeIfKnown() {
                    return Spliterator.CC.$default$getExactSizeIfKnown(this);
                }

                @Override // j$.util.Spliterators.AbstractSpliterator, j$.util.Spliterator
                public /* synthetic */ boolean hasCharacteristics(int i) {
                    return Spliterator.CC.$default$hasCharacteristics(this, i);
                }

                @Override // j$.util.Spliterator
                public boolean tryAdvance(Consumer consumer) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    FunctionWithIndex functionWithIndex2 = functionWithIndex;
                    Object next = it.next();
                    long j = this.index;
                    this.index = 1 + j;
                    consumer.accept(functionWithIndex2.apply(next, j));
                    return true;
                }
            }, zIsParallel).onClose(new Streams$$ExternalSyntheticLambda5(stream));
        }
        return StreamSupport.stream(new C1Splitr(spliterator, 0L, functionWithIndex), zIsParallel).onClose(new Streams$$ExternalSyntheticLambda5(stream));
    }
}
