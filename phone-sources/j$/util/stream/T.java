package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public class T implements D {
    public final double[] a;
    public int b;

    public T(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new double[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.G
    public final Object b() {
        double[] dArr = this.a;
        int length = dArr.length;
        int i = this.b;
        return length == i ? dArr : Arrays.copyOf(dArr, i);
    }

    @Override // j$.util.stream.H
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0153v0.q(this, consumer);
    }

    @Override // j$.util.stream.G
    public final void h(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (double[]) obj, i, i2);
    }

    @Override // j$.util.stream.G
    public final void i(Object obj) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            doubleConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void m(Object[] objArr, int i) {
        AbstractC0153v0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0153v0.m(this, intFunction);
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final Spliterator.OfPrimitive spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.Q(dArr, 0, i, 1040);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int t() {
        return 0;
    }

    public String toString() {
        double[] dArr = this.a;
        return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(dArr.length - this.b), Arrays.toString(dArr));
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        int i = this.b;
        double[] dArr = this.a;
        Spliterators.a(dArr.length, 0, i);
        return new j$.util.Q(dArr, 0, i, 1040);
    }

    public T(double[] dArr) {
        this.a = dArr;
        this.b = dArr.length;
    }
}
