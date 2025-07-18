package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes4.dex */
public final class Z extends T0 implements E, C, I0 {
    @Override // j$.util.stream.H
    public final /* bridge */ /* synthetic */ H a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.X0, j$.util.stream.G
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.C
    public final H build() {
        return this;
    }

    @Override // j$.util.stream.K0
    public final void d(long j) {
        clear();
        z(j);
    }

    @Override // j$.util.stream.I0
    public final /* synthetic */ void e(Integer num) {
        AbstractC0153v0.g(this, num);
    }

    @Override // j$.util.stream.K0
    public final void end() {
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.X0, j$.util.stream.G
    public final void h(int i, Object obj) {
        super.h(i, (int[]) obj);
    }

    @Override // j$.util.stream.X0, j$.util.stream.G
    public final void i(Object obj) {
        super.i((IntConsumer) obj);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ void m(Object[] objArr, int i) {
        AbstractC0153v0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC0153v0.m(this, intFunction);
    }

    @Override // j$.util.stream.T0, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator.OfPrimitive spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int t() {
        return 0;
    }

    @Override // j$.util.stream.G, j$.util.stream.H
    public final G a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }

    @Override // j$.util.stream.T0, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        e((Integer) obj);
    }
}
