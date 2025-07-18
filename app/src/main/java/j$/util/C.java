package j$.util;

import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public interface C extends F {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.F, j$.util.Spliterator
    C trySplit();
}
