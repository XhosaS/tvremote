package j$.util;

import j$.util.Spliterator;
import j$.util.function.DoubleConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final class N implements PrimitiveIterator$OfDouble, DoubleConsumer, InterfaceC0164v {
    public boolean a = false;
    public double b;
    public final /* synthetic */ Spliterator.OfDouble c;

    public N(Spliterator.OfDouble ofDouble) {
        this.c = ofDouble;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0164v
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            DoubleConsumer doubleConsumer = (DoubleConsumer) consumer;
            doubleConsumer.getClass();
            while (hasNext()) {
                doubleConsumer.accept(nextDouble());
            }
            return;
        }
        consumer.getClass();
        if (Z.a) {
            Z.a(N.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        C0165w c0165w = new C0165w(consumer, 0);
        while (hasNext()) {
            c0165w.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!Z.a) {
            return Double.valueOf(nextDouble());
        }
        Z.a(N.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator$OfDouble
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
