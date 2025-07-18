package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes3.dex */
public final class N extends j$.desugar.sun.nio.fs.g implements C {
    @Override // j$.util.C
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.desugar.sun.nio.fs.g.h(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.desugar.sun.nio.fs.g.j(this, i);
    }

    @Override // j$.util.C
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        return false;
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.F, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ C trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
        } else {
            if (Q.a) {
                Q.a(N.class, "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            consumer.getClass();
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            tryAdvance((LongConsumer) consumer);
            return false;
        }
        if (Q.a) {
            Q.a(N.class, "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        consumer.getClass();
        return false;
    }

    @Override // j$.desugar.sun.nio.fs.g, j$.util.F, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ F trySplit() {
        return null;
    }
}
