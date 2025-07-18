package j$.util.stream;

import j$.util.C0167y;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0154w extends AbstractC0111a implements LongStream {
    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new C0125h(this, new j$.desugar.sun.nio.fs.n(24), 2);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final H d(AbstractC0111a abstractC0111a, Spliterator spliterator, IntFunction intFunction) {
        long jE = abstractC0111a.e(spliterator);
        if (jE >= 0 && spliterator.hasCharacteristics(16384)) {
            if (jE >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            long[] jArr = new long[(int) jE];
            new C0134l0(spliterator, abstractC0111a, jArr).invoke();
            return new C0124g0(jArr);
        }
        F f = (F) new K(abstractC0111a, spliterator, new j$.desugar.sun.nio.fs.n(29), new L(0)).invoke();
        if (f.t() <= 0) {
            return f;
        }
        long jCount = f.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr2 = new long[(int) jCount];
        new C0145r0(f, jArr2).invoke();
        return new C0124g0(jArr2);
    }

    @Override // j$.util.stream.AbstractC0111a
    public final boolean f(Spliterator spliterator, K0 k0) {
        LongConsumer c0167y;
        boolean zG;
        if (!(spliterator instanceof Spliterator.OfLong)) {
            if (!t1.a) {
                throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
            }
            t1.a(AbstractC0111a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) spliterator;
        if (k0 instanceof LongConsumer) {
            c0167y = (LongConsumer) k0;
        } else {
            if (t1.a) {
                t1.a(AbstractC0111a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            k0.getClass();
            c0167y = new C0167y(k0, 1);
        }
        do {
            zG = k0.g();
            if (zG) {
                break;
            }
        } while (ofLong.tryAdvance(c0167y));
        return zG;
    }

    @Override // j$.util.stream.AbstractC0111a
    public final C g(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0128i0() : new C0126h0(j);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfLong] */
    @Override // j$.util.stream.BaseStream
    public final Iterator<Long> iterator() {
        return Spliterators.iterator((Spliterator.OfLong) spliterator2());
    }

    @Override // j$.util.stream.AbstractC0111a
    public final Spliterator m(AbstractC0111a abstractC0111a, j$.desugar.sun.nio.fs.h hVar, boolean z) {
        return new i1(abstractC0111a, hVar, z);
    }

    @Override // j$.util.stream.AbstractC0111a, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final Spliterator<Long> spliterator2() {
        Spliterator spliteratorSpliterator2 = super.spliterator2();
        if (spliteratorSpliterator2 instanceof Spliterator.OfLong) {
            return (Spliterator.OfLong) spliteratorSpliterator2;
        }
        if (!t1.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        t1.a(AbstractC0111a.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }
}
