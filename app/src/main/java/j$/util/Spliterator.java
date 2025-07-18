package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes3.dex */
public interface Spliterator<T> {

    public interface OfInt extends F {
        void forEachRemaining(IntConsumer intConsumer);

        boolean tryAdvance(IntConsumer intConsumer);

        @Override // j$.util.F, j$.util.Spliterator
        OfInt trySplit();
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer consumer);

    Spliterator trySplit();
}
