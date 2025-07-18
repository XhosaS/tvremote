package j$.util.stream;

import j$.util.C0166x;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0148t extends AbstractC0111a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        A a = A.ANY;
        intPredicate.getClass();
        a.getClass();
        return ((Boolean) b(new j$.nio.file.z(b1.INT_VALUE, a, new j$.nio.file.z(5, a, intPredicate)))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0125h(this, new j$.desugar.sun.nio.fs.n(23), 1);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final H d(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction) {
        long jE = abstractC0111a.e(spliterator);
        if (jE < 0 || !spliterator.hasCharacteristics(16384)) {
            return AbstractC0153v0.u((E) new K(abstractC0111a, spliterator, new j$.desugar.sun.nio.fs.n(27), new j$.desugar.sun.nio.fs.n(28)).invoke());
        }
        if (jE >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jE];
        new C0132k0(spliterator, abstractC0111a, iArr).invoke();
        return new X(iArr);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean f(Spliterator spliterator, K0 k0) {
        IntConsumer c0166x;
        boolean zG;
        if (!(spliterator instanceof Spliterator.OfInt)) {
            if (!t1.a) {
                throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
            }
            t1.a(AbstractC0111a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) spliterator;
        if (k0 instanceof IntConsumer) {
            c0166x = (IntConsumer) k0;
        } else {
            if (t1.a) {
                t1.a(AbstractC0111a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            k0.getClass();
            c0166x = new C0166x(k0, 1);
        }
        do {
            zG = k0.g();
            if (zG) {
                break;
            }
        } while (ofInt.tryAdvance(c0166x));
        return zG;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final C g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new Z() : new Y(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfInt] */
    @Override // j$.util.stream.BaseStream
    public final Iterator<Integer> iterator() {
        return Spliterators.iterator((Spliterator.OfInt) spliterator2());
    }

    @Override // j$.util.stream.AbstractC0111a
    public final Spliterator m(AbstractC0111a abstractC0111a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        return new g1(abstractC0111a, hVar, z);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0153v0.u((E) c(new j$.desugar.sun.nio.fs.n(22))).b();
    }

    @Override // j$.util.stream.AbstractC0111a, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final Spliterator<Integer> spliterator2() {
        Spliterator spliteratorSpliterator2 = super.spliterator2();
        if (spliteratorSpliterator2 instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliteratorSpliterator2;
        }
        if (!t1.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        t1.a(AbstractC0111a.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }
}
