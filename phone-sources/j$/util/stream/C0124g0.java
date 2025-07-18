package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C0124g0 implements F {
    public final long[] a;
    public int b;

    public C0124g0(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new long[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.G
    public final Object b() {
        long[] jArr = this.a;
        int length = jArr.length;
        int i = this.b;
        return length == i ? jArr : Arrays.copyOf(jArr, i);
    }

    @Override // j$.util.stream.H
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0153v0.s(this, consumer);
    }

    @Override // j$.util.stream.G
    public final void h(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (long[]) obj, i, i2);
    }

    @Override // j$.util.stream.G
    public final void i(Object obj) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < this.b; i++) {
            longConsumer.accept(this.a[i]);
        }
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void m(Object[] objArr, int i) {
        AbstractC0153v0.p(this, (Long[]) objArr, i);
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
        long[] jArr = this.a;
        return String.format("LongArrayNode[%d][%s]", Integer.valueOf(jArr.length - this.b), Arrays.toString(jArr));
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.H
    public final Spliterator spliterator() {
        return Spliterators.spliterator(this.a, 0, this.b, 1040);
    }

    public C0124g0(long[] jArr) {
        this.a = jArr;
        this.b = jArr.length;
    }
}
