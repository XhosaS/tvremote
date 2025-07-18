package j$.util;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final class L implements PrimitiveIterator$OfInt, IntConsumer, InterfaceC0164v {
    public boolean a = false;
    public int b;
    public final /* synthetic */ Spliterator.OfInt c;

    public L(Spliterator.OfInt ofInt) {
        this.c = ofInt;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.Iterator, j$.util.InterfaceC0164v
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            IntConsumer intConsumer = (IntConsumer) consumer;
            intConsumer.getClass();
            while (hasNext()) {
                intConsumer.accept(nextInt());
            }
            return;
        }
        consumer.getClass();
        if (Z.a) {
            Z.a(L.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        C0166x c0166x = new C0166x(consumer, 0);
        while (hasNext()) {
            c0166x.accept(nextInt());
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!Z.a) {
            return Integer.valueOf(nextInt());
        }
        Z.a(L.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    @Override // j$.util.PrimitiveIterator$OfInt
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
