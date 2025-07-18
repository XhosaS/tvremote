package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0107z extends AbstractC0101t {
    @Override // j$.util.stream.InterfaceC0100s
    public final void l(Object[] objArr, int i) {
        objArr.getClass();
        InterfaceC0100s interfaceC0100s = this.a;
        interfaceC0100s.l(objArr, i);
        this.b.l(objArr, i + ((int) interfaceC0100s.count()));
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final Object[] m(IntFunction intFunction) {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j);
        l(objArr, 0);
        return objArr;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(j));
    }
}
