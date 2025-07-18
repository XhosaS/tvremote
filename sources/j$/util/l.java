package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* loaded from: classes2.dex */
public final class l implements Spliterator {
    public final Spliterator a;

    public l(Spliterator spliterator) {
        this.a = spliterator;
    }

    @Override // j$.util.Spliterator
    public final boolean b() {
        return this.a.b();
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return this.a.characteristics();
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        return this.a.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        consumer.getClass();
        this.a.forEachRemaining(new j(consumer, 0));
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        return this.a.getComparator();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        return this.a.getExactSizeIfKnown();
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        consumer.getClass();
        return this.a.tryAdvance(new j(consumer, 0));
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        Spliterator spliteratorTrySplit = this.a.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return new l(spliteratorTrySplit);
    }
}
