package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.DoubleConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes4.dex */
public class R0 extends X0 implements DoubleConsumer {
    @Override // j$.util.stream.X0
    public final Object[] A() {
        return new double[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfDouble spliterator() {
        return new Q0(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.DoubleConsumer
    public void accept(double d) {
        B();
        double[] dArr = (double[]) this.d;
        int i = this.a;
        this.a = i + 1;
        dArr[i] = d;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return DoubleConsumer$CC.$default$andThen(this, doubleConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            i((DoubleConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.e((Q0) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.iterator(spliterator());
    }

    @Override // j$.util.stream.X0
    public final Object newArray(int i) {
        return new double[i];
    }

    public final String toString() {
        double[] dArr = (double[]) b();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.X0
    public final void v(Object obj, int i, int i2, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i < i2) {
            doubleConsumer.accept(dArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.X0
    public final int w(Object obj) {
        return ((double[]) obj).length;
    }
}
