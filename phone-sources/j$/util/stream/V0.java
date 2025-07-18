package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.LongConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes4.dex */
public class V0 extends X0 implements LongConsumer {
    @Override // j$.util.stream.X0
    public final Object[] A() {
        return new long[8][];
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public Spliterator.OfLong spliterator() {
        return new U0(this, 0, this.b, 0, this.a);
    }

    @Override // java.util.function.LongConsumer
    public void accept(long j) {
        B();
        long[] jArr = (long[]) this.d;
        int i = this.a;
        this.a = i + 1;
        jArr[i] = j;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i((LongConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(getClass(), "{0} calling SpinedBuffer.OfLong.forEach(Consumer)");
                throw null;
            }
            j$.desugar.sun.nio.fs.g.g((U0) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.iterator(spliterator());
    }

    @Override // j$.util.stream.X0
    public final Object newArray(int i) {
        return new long[i];
    }

    public final String toString() {
        long[] jArr = (long[]) b();
        if (jArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(jArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(jArr.length), Integer.valueOf(this.b), Arrays.toString(Arrays.copyOf(jArr, 200)));
    }

    @Override // j$.util.stream.X0
    public final void v(Object obj, int i, int i2, Object obj2) {
        long[] jArr = (long[]) obj;
        LongConsumer longConsumer = (LongConsumer) obj2;
        while (i < i2) {
            longConsumer.accept(jArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.X0
    public final int w(Object obj) {
        return ((long[]) obj).length;
    }
}
