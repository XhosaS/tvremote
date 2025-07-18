package j$.util;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes2.dex */
public final class u extends j$.nio.file.attribute.a implements Spliterator {
    public final /* synthetic */ int a;

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean b() {
        switch (this.a) {
        }
        return j$.nio.file.attribute.a.n(this, 16384);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                if (consumer instanceof DoubleConsumer) {
                    ((DoubleConsumer) consumer).getClass();
                    return;
                } else {
                    if (z.a) {
                        z.a(u.class, "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                        throw null;
                    }
                    consumer.getClass();
                    return;
                }
            default:
                consumer.getClass();
                return;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.a) {
        }
        return j$.nio.file.attribute.a.l(this);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.a) {
            case 0:
                if (consumer instanceof DoubleConsumer) {
                    ((DoubleConsumer) consumer).getClass();
                    return false;
                }
                if (z.a) {
                    z.a(u.class, "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
                    throw null;
                }
                consumer.getClass();
                return false;
            default:
                consumer.getClass();
                return false;
        }
    }
}
