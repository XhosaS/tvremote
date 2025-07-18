package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public class X implements E {
    public final int[] a;
    public int b;

    public X(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.G
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.H
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0153v0.r(this, consumer);
    }

    @Override // j$.util.stream.G
    public final void h(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.G
    public final void i(Object obj) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            intConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void m(Object[] objArr, int i) {
        AbstractC0153v0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0153v0.m(this, intFunction);
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final Spliterator.OfPrimitive spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int t() {
        return 0;
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public X(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
