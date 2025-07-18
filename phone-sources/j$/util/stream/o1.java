package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public final class o1 extends l1 implements LongConsumer, Spliterator.OfLong {
    public long b;
    public V0 c;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.a;
        if (i == 0) {
            this.b = j;
            this.a = i + 1;
        } else {
            if (i <= 0) {
                throw new IllegalStateException();
            }
            if (this.c == null) {
                V0 v0 = new V0();
                this.c = v0;
                v0.accept(this.b);
                this.a++;
            }
            this.c.accept(j);
        }
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.desugar.sun.nio.fs.g.g(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.desugar.sun.nio.fs.g.u(this, consumer);
    }

    @Override // j$.util.stream.l1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfLong trySplit() {
        return null;
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(LongConsumer longConsumer) {
        longConsumer.getClass();
        if (this.a == -2) {
            longConsumer.accept(this.b);
            this.a = -1;
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        if (this.a != -2) {
            return false;
        }
        longConsumer.accept(this.b);
        this.a = -1;
        return true;
    }

    @Override // j$.util.stream.l1, j$.util.Spliterator
    public final /* bridge */ /* synthetic */ Spliterator.OfPrimitive trySplit() {
        return null;
    }
}
