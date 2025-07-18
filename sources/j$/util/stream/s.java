package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final class s extends I implements InterfaceC0025k, InterfaceC0024j {
    @Override // j$.util.stream.InterfaceC0025k
    public final void a(Object[] objArr, int i) {
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

    @Override // j$.util.stream.G
    public final void b(long j) {
        clear();
        h(j);
    }

    @Override // j$.util.stream.InterfaceC0024j
    public final InterfaceC0025k build() {
        return this;
    }

    @Override // j$.util.stream.G
    public final /* synthetic */ boolean c() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final Object[] d(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        a(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.G
    public final void end() {
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final InterfaceC0025k f(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0025k
    public final /* synthetic */ int g() {
        return 0;
    }
}
