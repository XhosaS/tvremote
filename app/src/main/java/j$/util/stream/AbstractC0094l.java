package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0094l extends AbstractC0083a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0092j(this, 0, new j$.desugar.sun.nio.fs.n(20), 0);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final InterfaceC0100s d(AbstractC0083a abstractC0083a, Spliterator spliterator, IntFunction intFunction) {
        long jE = abstractC0083a.e(spliterator);
        if (jE < 0 || !spliterator.hasCharacteristics(16384)) {
            return L.j((InterfaceC0099q) new C0103v(abstractC0083a, spliterator, new j$.desugar.sun.nio.fs.n(22), new j$.desugar.sun.nio.fs.n(23)).invoke());
        }
        if (jE >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jE];
        new E(spliterator, abstractC0083a, iArr).invoke();
        return new B(iArr);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final boolean f(Spliterator spliterator, c0 c0Var) {
        IntConsumer tVar;
        boolean zG;
        if (!(spliterator instanceof Spliterator.OfInt)) {
            if (!t0.a) {
                throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
            }
            t0.a(AbstractC0083a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        Spliterator.OfInt ofInt = (Spliterator.OfInt) spliterator;
        if (c0Var instanceof IntConsumer) {
            tVar = (IntConsumer) c0Var;
        } else {
            if (t0.a) {
                t0.a(AbstractC0083a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            c0Var.getClass();
            tVar = new j$.util.t(c0Var, 1);
        }
        do {
            zG = c0Var.g();
            if (zG) {
                break;
            }
        } while (ofInt.tryAdvance(tVar));
        return zG;
    }

    @Override // j$.util.stream.AbstractC0083a
    public final InterfaceC0098p g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new D() : new C(j);
    }

    @Override // j$.util.stream.AbstractC0083a
    public final Spliterator k(AbstractC0083a abstractC0083a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        return new o0(abstractC0083a, hVar, z);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new C0092j(this, k0.n | k0.m, intFunction, 0);
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return ((Integer) b(new P(l0.INT_VALUE, new j$.desugar.sun.nio.fs.n(21)))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) L.j((InterfaceC0099q) c(new j$.desugar.sun.nio.fs.n(19))).b();
    }
}
