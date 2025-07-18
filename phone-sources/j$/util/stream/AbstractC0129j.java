package j$.util.stream;

import j$.util.C0165w;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0129j extends AbstractC0111a implements DoubleStream {
    @Override // j$.util.stream.DoubleStream
    public final Stream boxed() {
        return new C0125h(this, new j$.desugar.sun.nio.fs.n(18), 0);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final H d(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction) {
        long jE = abstractC0111a.e(spliterator);
        if (jE >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jE >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            double[] dArr = new double[(int) jE];
            new C0130j0(spliterator, abstractC0111a, dArr).invoke();
            return new T(dArr);
        }
        D d = (D) new K(abstractC0111a, spliterator, new j$.desugar.sun.nio.fs.n(25), new j$.desugar.sun.nio.fs.n(26)).invoke();
        if (d.t() <= 0) {
            return d;
        }
        long jCount = d.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr2 = new double[(int) jCount];
        new C0142p0(d, dArr2).invoke();
        return new T(dArr2);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean f(Spliterator spliterator, K0 k0) {
        DoubleConsumer c0165w;
        boolean zG;
        if (!(spliterator instanceof Spliterator.OfDouble)) {
            if (!t1.a) {
                throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
            }
            t1.a(AbstractC0111a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        Spliterator.OfDouble ofDouble = (Spliterator.OfDouble) spliterator;
        if (k0 instanceof DoubleConsumer) {
            c0165w = (DoubleConsumer) k0;
        } else {
            if (t1.a) {
                t1.a(AbstractC0111a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            k0.getClass();
            c0165w = new C0165w(k0, 1);
        }
        do {
            zG = k0.g();
            if (zG) {
                break;
            }
        } while (ofDouble.tryAdvance(c0165w));
        return zG;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final C g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new V() : new U(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.BaseStream
    public final Iterator<Double> iterator() {
        return Spliterators.iterator((Spliterator.OfDouble) spliterator2());
    }

    @Override // j$.util.stream.AbstractC0111a
    public final Spliterator m(AbstractC0111a abstractC0111a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        return new e1(abstractC0111a, hVar, z);
    }

    @Override // j$.util.stream.AbstractC0111a, j$.util.stream.BaseStream
    /* renamed from: spliterator, reason: merged with bridge method [inline-methods] */
    public final Spliterator<Double> spliterator2() {
        Spliterator spliteratorSpliterator2 = super.spliterator2();
        if (spliteratorSpliterator2 instanceof Spliterator.OfDouble) {
            return (Spliterator.OfDouble) spliteratorSpliterator2;
        }
        if (!t1.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        t1.a(AbstractC0111a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }
}
