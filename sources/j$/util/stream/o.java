package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class o implements InterfaceC0025k {
    public final InterfaceC0025k a;
    public final InterfaceC0025k b;
    public final long c;

    public o(InterfaceC0025k interfaceC0025k, InterfaceC0025k interfaceC0025k2) {
        this.a = interfaceC0025k;
        this.b = interfaceC0025k2;
        this.c = interfaceC0025k2.count() + interfaceC0025k.count();
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final void a(Object[] objArr, int i) {
        objArr.getClass();
        InterfaceC0025k interfaceC0025k = this.a;
        interfaceC0025k.a(objArr, i);
        this.b.a(objArr, i + ((int) interfaceC0025k.count()));
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final long count() {
        return this.c;
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final Object[] d(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        a(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final InterfaceC0025k f(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final int g() {
        return 2;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
