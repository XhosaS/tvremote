package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.Collector;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public abstract class F extends AbstractC0015a implements Stream {
    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        EnumC0022h enumC0022h = EnumC0022h.ANY;
        predicate.getClass();
        enumC0022h.getClass();
        return ((Boolean) b(new j$.util.concurrent.w(L.REFERENCE, enumC0022h, new j$.util.concurrent.w(4, enumC0022h, predicate)))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objB;
        if (this.a.j && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!K.ORDERED.k(this.f) || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            objB = collector.supplier().get();
            i(new j$.util.concurrent.w(6, collector.accumulator(), objB));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            objB = b(new v(L.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? objB : collector2.finisher().apply(objB);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) b(new x())).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new D(this, K.p, predicate, 0);
    }

    public void i(j$.util.concurrent.w wVar) {
        b(new j$.time.format.s(4, wVar));
    }

    @Override // j$.util.stream.BaseStream
    public final Iterator iterator() {
        Spliterator m;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0015a abstractC0015a = this.a;
        if (this == abstractC0015a) {
            m = abstractC0015a.g;
            if (m == null) {
                throw new IllegalStateException("source already consumed or closed");
            }
            abstractC0015a.g = null;
        } else {
            m = new M(this, new j$.time.format.s(3, this), abstractC0015a.j);
        }
        return new j$.util.s(m);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new D(this, K.n | K.m, function, 1);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        InterfaceC0025k interfaceC0025kBuild;
        F f;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0015a abstractC0015a = this.a;
        if (abstractC0015a.j && (f = this.b) != null && d()) {
            this.e = 0;
            f.f(0);
            throw new UnsupportedOperationException("Parallel evaluation is not supported");
        }
        Spliterator spliteratorF = f(0);
        if (abstractC0015a.j) {
            long jC = c(spliteratorF);
            if (jC < 0 || !spliteratorF.b()) {
                interfaceC0025kBuild = j$.nio.file.attribute.a.x((InterfaceC0025k) new C0027m(this, spliteratorF, new j$.time.format.s(5, intFunction), new j$.time.format.b(10)).invoke(), intFunction);
            } else {
                if (jC >= 2147483639) {
                    throw new IllegalArgumentException("Stream size exceeds max array size");
                }
                Object[] objArr = (Object[]) intFunction.apply((int) jC);
                new q(spliteratorF, this, objArr).invoke();
                interfaceC0025kBuild = new C0026l(objArr);
            }
        } else {
            InterfaceC0024j interfaceC0024jW = j$.nio.file.attribute.a.w(c(spliteratorF), intFunction);
            a(h(interfaceC0024jW), spliteratorF);
            interfaceC0025kBuild = interfaceC0024jW.build();
        }
        return j$.nio.file.attribute.a.x(interfaceC0025kBuild, intFunction).d(intFunction);
    }
}
