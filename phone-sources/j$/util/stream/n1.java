package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes4.dex */
public final class n1 extends l1 implements IntConsumer, Spliterator.OfInt {
    public int b;
    public T0 c;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.a;
        if (i2 == 0) {
            this.b = i;
            this.a = i2 + 1;
        } else {
            if (i2 <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                T0 t0 = new T0();
                this.c = t0;
                t0.accept(this.b);
                this.a++;
            }
            this.c.accept(i);
        }
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.f(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.t(this, consumer);
    }

    @Override // j$.util.stream.l1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfInt trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a == -2) {
            intConsumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        if (this.a != -2) {
            return false;
        }
        intConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // j$.util.stream.l1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return null;
    }
}
