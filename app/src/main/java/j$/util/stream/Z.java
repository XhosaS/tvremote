package j$.util.stream;

import j$.nio.file.C0044s;
import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* loaded from: classes3.dex */
public abstract class Z extends AbstractC0083a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        EnumC0096n enumC0096n = EnumC0096n.ALL;
        predicate.getClass();
        enumC0096n.getClass();
        return ((Boolean) b(new j$.nio.file.A(l0.REFERENCE, enumC0096n, new j$.nio.file.A(5, enumC0096n, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        EnumC0096n enumC0096n = EnumC0096n.ANY;
        predicate.getClass();
        enumC0096n.getClass();
        return ((Boolean) b(new j$.nio.file.A(l0.REFERENCE, enumC0096n, new j$.nio.file.A(5, enumC0096n, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objB;
        if (this.a.j && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!k0.ORDERED.t(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objB = collector.supplier().get();
            forEach(new j$.nio.file.A(7, collector.accumulator(), objB));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objB = b(new M(l0.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objB : collector2.finisher().apply(objB);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final InterfaceC0100s d(AbstractC0083a abstractC0083a, Spliterator spliterator, IntFunction intFunction) {
        long jE = abstractC0083a.e(spliterator);
        if (jE < 0 || !spliterator.hasCharacteristics(16384)) {
            return L.i((InterfaceC0100s) new C0103v(abstractC0083a, spliterator, new j$.desugar.sun.nio.fs.h(6, intFunction), new j$.desugar.sun.nio.fs.n(24)).invoke(), intFunction);
        }
        if (jE >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jE);
        new F(spliterator, abstractC0083a, objArr).invoke();
        return new C0102u(objArr);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final boolean f(Spliterator spliterator, c0 c0Var) {
        boolean zG;
        do {
            zG = c0Var.g();
            if (zG) {
                break;
            }
        } while (spliterator.tryAdvance(c0Var));
        return zG;
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0092j(this, k0.p, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new U(this, k0.n | k0.m | k0.p, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        b(new C0044s(consumer, 3));
    }

    @Override // j$.util.stream.AbstractC0083a
    public final InterfaceC0098p g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new H() : new A(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final Spliterator k(AbstractC0083a abstractC0083a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        return new p0(abstractC0083a, hVar, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new U(this, k0.n | k0.m, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new V(this, k0.n | k0.m, toIntFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return L.i(c(intFunction), intFunction).m(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new j$.desugar.sun.nio.fs.n(25));
    }
}
