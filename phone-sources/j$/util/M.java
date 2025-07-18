package j$.util;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final class M implements PrimitiveIterator$OfLong, LongConsumer, InterfaceC0164v {
    public boolean a = false;
    public long b;
    public final /* synthetic */ Spliterator.OfLong c;

    public M(Spliterator.OfLong ofLong) {
        this.c = ofLong;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0164v
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            LongConsumer longConsumer = (LongConsumer) consumer;
            longConsumer.getClass();
            while (hasNext()) {
                longConsumer.accept(nextLong());
            }
            return;
        }
        consumer.getClass();
        if (Z.a) {
            Z.a(M.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        C0167y c0167y = new C0167y(consumer, 0);
        while (hasNext()) {
            c0167y.accept(nextLong());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!Z.a) {
            return Long.valueOf(nextLong());
        }
        Z.a(M.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator$OfLong
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
