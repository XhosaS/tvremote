package j$.util.stream;

import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public class B implements InterfaceC0099q {
    public final int[] a;
    public int b;

    public B(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.a = new int[(int) j];
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* bridge */ /* synthetic */ InterfaceC0100s a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.r
    public final Object b() {
        int[] iArr = this.a;
        int length = iArr.length;
        int i = this.b;
        return length == i ? iArr : Arrays.copyOf(iArr, i);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final long count() {
        return this.b;
    }

    @Override // j$.util.stream.r
    public final void h(int i, Object obj) {
        int i2 = this.b;
        System.arraycopy(this.a, 0, (int[]) obj, i, i2);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ void l(Object[] objArr, int i) {
        L.h(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return L.g(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ int o() {
        return 0;
    }

    public String toString() {
        int[] iArr = this.a;
        return String.format("IntArrayNode[%d][%s]", Integer.valueOf(iArr.length - this.b), Arrays.toString(iArr));
    }

    @Override // j$.util.stream.r, j$.util.stream.InterfaceC0100s
    public final r a(int i) {
        throw new IndexOutOfBoundsException();
    }

    public B(int[] iArr) {
        this.a = iArr;
        this.b = iArr.length;
    }
}
