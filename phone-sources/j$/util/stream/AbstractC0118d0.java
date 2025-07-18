package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0118d0 extends AbstractC0122f0 implements Spliterator.OfPrimitive {
    @Override // j$.util.Spliterator.OfPrimitive
    public final void forEachRemaining(Object obj) {
        if (this.a == null) {
            return;
        }
        if (this.d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.c;
        if (spliterator != null) {
            ((Spliterator.OfPrimitive) spliterator).forEachRemaining((Spliterator.OfPrimitive) obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            G g = (G) AbstractC0122f0.a(arrayDequeB);
            if (g == null) {
                this.a = null;
                return;
            }
            g.i(obj);
        }
    }

    @Override // j$.util.Spliterator.OfPrimitive
    public final boolean tryAdvance(Object obj) {
        G g;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((Spliterator.OfPrimitive) this.d).tryAdvance((Spliterator.OfPrimitive) obj);
        if (!zTryAdvance) {
            if (this.c == null && (g = (G) AbstractC0122f0.a(this.e)) != null) {
                Spliterator.OfPrimitive ofPrimitiveSpliterator = g.spliterator();
                this.d = ofPrimitiveSpliterator;
                return ofPrimitiveSpliterator.tryAdvance((Spliterator.OfPrimitive) obj);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }
}
