package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.DoubleConsumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public final class m1 extends l1 implements DoubleConsumer, Spliterator.OfDouble {
    public double b;
    public R0 c;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        int i = this.a;
        if (i == 0) {
            this.b = d;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                R0 r0 = new R0();
                this.c = r0;
                r0.accept(this.b);
                this.a++;
            }
            this.c.accept(d);
        }
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.e(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.s(this, consumer);
    }

    @Override // j$.util.stream.l1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfDouble trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        if (this.a == -2) {
            doubleConsumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        if (this.a != -2) {
            return false;
        }
        doubleConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // j$.util.stream.l1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return null;
    }
}
