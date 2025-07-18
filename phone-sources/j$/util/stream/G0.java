package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Collector;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* loaded from: classes4.dex */
public abstract class G0 extends AbstractC0111a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        A a = A.ANY;
        predicate.getClass();
        a.getClass();
        return ((Boolean) b(new j$.nio.file.z(b1.REFERENCE, a, new j$.nio.file.z(6, a, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objB;
        if (this.a.k && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!a1.ORDERED.t(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objB = collector.supplier().get();
            forEach(new j$.nio.file.z(8, collector.accumulator(), objB));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objB = b(new C0155w0(b1.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objB : collector2.finisher().apply(objB);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) b(new C0159y0())).longValue();
    }

    @Override // j$.util.stream.AbstractC0111a
    public final H d(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction) {
        long jE = abstractC0111a.e(spliterator);
        if (jE < 0 || !spliterator.hasCharacteristics(16384)) {
            return AbstractC0153v0.t((H) new K(abstractC0111a, spliterator, new j$.desugar.sun.nio.fs.h(10, intFunction), new L(1)).invoke(), intFunction);
        }
        if (jE >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jE);
        new C0136m0(spliterator, abstractC0111a, objArr).invoke();
        return new J(objArr);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean f(Spliterator spliterator, K0 k0) {
        boolean zG;
        do {
            zG = k0.g();
            if (zG) {
                break;
            }
        } while (spliterator.tryAdvance(k0));
        return zG;
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0125h(this, a1.r, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) b(C0133l.c);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        b(new C0139o(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        b(new C0139o(consumer, true));
    }

    @Override // j$.util.stream.AbstractC0111a
    public final C g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0140o0() : new W(j, intFunction);
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        return Spliterators.iterator(spliterator2());
    }

    @Override // j$.util.stream.AbstractC0111a
    public final Spliterator m(AbstractC0111a abstractC0111a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        return new j1(abstractC0111a, hVar, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0125h(this, a1.n | a1.m, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new E0(this, a1.n | a1.m, toIntFunction);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        consumer.getClass();
        return new C0125h(this, consumer, 3);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new M0(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0153v0.t(c(intFunction), intFunction).p(intFunction);
    }
}
