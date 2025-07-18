package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0153v0 implements r1 {
    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(H0 h0, Double d) {
        if (t1.a) {
            t1.a(h0.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        h0.accept(d.doubleValue());
    }

    public static void g(I0 i0, Integer num) {
        if (t1.a) {
            t1.a(i0.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        i0.accept(num.intValue());
    }

    public static void i(J0 j0, Long l) {
        if (t1.a) {
            t1.a(j0.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        j0.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(G g, IntFunction intFunction) {
        if (t1.a) {
            t1.a(g.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (g.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) g.count());
        g.m(objArr, 0);
        return objArr;
    }

    public static void n(D d, Double[] dArr, int i) {
        if (t1.a) {
            t1.a(d.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) d.b();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(E e, Integer[] numArr, int i) {
        if (t1.a) {
            t1.a(e.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) e.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(F f, Long[] lArr, int i) {
        if (t1.a) {
            t1.a(f.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) f.b();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(D d, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            d.i((DoubleConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(d.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfDouble) d.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(E e, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            e.i((IntConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(e.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) e.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(F f, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            f.i((LongConsumer) consumer);
        } else {
            if (t1.a) {
                t1.a(f.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfLong) f.spliterator()).forEachRemaining(consumer);
        }
    }

    public static H t(H h, IntFunction intFunction) {
        if (h.t() <= 0) {
            return h;
        }
        long jCount = h.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C0149t0(h, objArr).invoke();
        return new J(objArr);
    }

    public static E u(E e) {
        if (e.t() <= 0) {
            return e;
        }
        long jCount = e.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C0144q0(e, iArr).invoke();
        return new X(iArr);
    }

    @Override // j$.util.stream.r1
    public Object a(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        InterfaceC0161z0 interfaceC0161z0V = v();
        abstractC0111a.n(spliterator, interfaceC0161z0V);
        return interfaceC0161z0V.get();
    }

    @Override // j$.util.stream.r1
    public Object b(AbstractC0111a abstractC0111a, Spliterator spliterator) {
        return ((InterfaceC0161z0) new C0(this, abstractC0111a, spliterator).invoke()).get();
    }

    public abstract InterfaceC0161z0 v();
}
