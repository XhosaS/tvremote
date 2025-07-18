package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public abstract class L implements s0 {
    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(b0 b0Var, Integer num) {
        if (t0.a) {
            t0.a(b0Var.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        b0Var.accept(num.intValue());
    }

    public static Object[] g(r rVar, IntFunction intFunction) {
        if (t0.a) {
            t0.a(rVar.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (rVar.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) rVar.count());
        rVar.l(objArr, 0);
        return objArr;
    }

    public static void h(InterfaceC0099q interfaceC0099q, Integer[] numArr, int i) {
        if (t0.a) {
            t0.a(interfaceC0099q.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) interfaceC0099q.b();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static InterfaceC0100s i(InterfaceC0100s interfaceC0100s, IntFunction intFunction) {
        if (interfaceC0100s.o() <= 0) {
            return interfaceC0100s;
        }
        long jCount = interfaceC0100s.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new J(interfaceC0100s, objArr).invoke();
        return new C0102u(objArr);
    }

    public static InterfaceC0099q j(InterfaceC0099q interfaceC0099q) {
        if (interfaceC0099q.o() <= 0) {
            return interfaceC0099q;
        }
        long jCount = interfaceC0099q.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new I(interfaceC0099q, iArr).invoke();
        return new B(iArr);
    }

    @Override // j$.util.stream.s0
    public Object a(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        Q qK = k();
        abstractC0083a.l(spliterator, qK);
        return qK.get();
    }

    @Override // j$.util.stream.s0
    public Object b(AbstractC0083a abstractC0083a, Spliterator spliterator) {
        return ((Q) new S(this, abstractC0083a, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.s0
    public /* synthetic */ int c() {
        return 0;
    }

    public abstract Q k();
}
