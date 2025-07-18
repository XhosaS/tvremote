package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public final class D extends f0 implements InterfaceC0099q, InterfaceC0098p, b0 {
    @Override // j$.util.stream.InterfaceC0100s
    public final /* bridge */ /* synthetic */ InterfaceC0100s a(int i) {
        a(i);
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        e((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.h0, j$.util.stream.r
    public final Object b() {
        return (int[]) super.b();
    }

    @Override // j$.util.stream.InterfaceC0098p
    public final InterfaceC0100s build() {
        return this;
    }

    @Override // j$.util.stream.c0
    public final void d(long j) {
        clear();
        r(j);
    }

    @Override // j$.util.stream.b0
    public final /* synthetic */ void e(Integer num) {
        L.e(this, num);
    }

    @Override // j$.util.stream.c0
    public final void end() {
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.h0, j$.util.stream.r
    public final void h(int i, Object obj) {
        super.h(i, (int[]) obj);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ void l(Object[] objArr, int i) {
        L.h(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return L.g(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // j$.util.stream.f0, java.lang.Iterable, j$.lang.a, j$.util.List, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.h0
    public final void t(Object obj) {
        super.t((IntConsumer) obj);
    }

    @Override // j$.util.stream.r, j$.util.stream.InterfaceC0100s
    public final r a(int i) {
        throw new IndexOutOfBoundsException();
    }
}
