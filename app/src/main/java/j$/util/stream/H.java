package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes3.dex */
public final class H extends i0 implements InterfaceC0100s, InterfaceC0098p {
    @Override // j$.util.stream.InterfaceC0100s
    public final InterfaceC0100s a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ void accept(int i) {
        L.d();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0098p
    public final InterfaceC0100s build() {
        return this;
    }

    @Override // j$.util.stream.c0
    public final void d(long j) {
        clear();
        q(j);
    }

    @Override // j$.util.stream.c0
    public final void end() {
    }

    @Override // j$.util.stream.c0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final void l(Object[] objArr, int i) {
        long j = i;
        long jCount = count() + j;
        if (jCount > objArr.length || jCount < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.b == 0) {
            System.arraycopy(this.d, 0, objArr, i, this.a);
            return;
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            Object[] objArr2 = this.e[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.e[i2].length;
        }
        int i3 = this.a;
        if (i3 > 0) {
            System.arraycopy(this.d, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final Object[] m(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        l(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.InterfaceC0100s
    public final /* synthetic */ int o() {
        return 0;
    }
}
