package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes3.dex */
public interface x extends F {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.F, j$.util.Spliterator
    x trySplit();
}
