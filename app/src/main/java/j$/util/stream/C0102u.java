package j$.util.stream;

import java.util.Arrays;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0102u implements InterfaceC0100s {
    public final Object[] a;
    public int b;

    public C0102u(long j, IntFunction intFunction) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = (Object[]) intFunction.apply((int) j);
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final InterfaceC0100s a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final void l(Object[] objArr, int i) {
        System.arraycopy(this.a, 0, objArr, i, this.b);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final Object[] m(IntFunction intFunction) {
        Object[] objArr = this.a;
        if (objArr.length == this.b) {
            return objArr;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ int o() {
        return 0;
    }

    public String toString() {
        Object[] objArr = this.a;
        return String.format("ArrayNode[%d][%s]", Integer.valueOf(objArr.length - this.b), Arrays.toString(objArr));
    }

    public C0102u(Object[] objArr) {
        this.a = objArr;
        this.b = objArr.length;
    }
}
