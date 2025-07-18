package j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public interface Spliterator<T> {

    /* renamed from: j$.util.Spliterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$forEachRemaining(Spliterator spliterator, Consumer consumer) {
            while (spliterator.tryAdvance(consumer)) {
            }
        }

        public static java.util.Comparator $default$getComparator(Spliterator spliterator) {
            throw new IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1L;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    public interface OfDouble extends OfPrimitive<Double, DoubleConsumer, OfDouble> {
        void forEachRemaining(DoubleConsumer doubleConsumer);

        boolean tryAdvance(DoubleConsumer doubleConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfDouble trySplit();
    }

    public interface OfInt extends OfPrimitive<Integer, IntConsumer, OfInt> {
        void forEachRemaining(IntConsumer intConsumer);

        boolean tryAdvance(IntConsumer intConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfInt trySplit();
    }

    public interface OfLong extends OfPrimitive<Long, LongConsumer, OfLong> {
        void forEachRemaining(LongConsumer longConsumer);

        boolean tryAdvance(LongConsumer longConsumer);

        @Override // j$.util.Spliterator.OfPrimitive, j$.util.Spliterator
        OfLong trySplit();
    }

    public interface OfPrimitive<T, T_CONS, T_SPLITR extends OfPrimitive<T, T_CONS, T_SPLITR>> extends Spliterator<T> {
        void forEachRemaining(T_CONS t_cons);

        boolean tryAdvance(T_CONS t_cons);

        @Override // j$.util.Spliterator
        T_SPLITR trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer<? super T> consumer);

    java.util.Comparator<? super T> getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer<? super T> consumer);

    Spliterator<T> trySplit();
}
