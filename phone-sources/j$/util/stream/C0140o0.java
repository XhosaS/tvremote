package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0140o0 extends Y0 implements H, C {
    @Override // j$.util.stream.H
    public final H a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(double d) {
        AbstractC0153v0.d();
        throw null;
    }

    @Override // j$.util.stream.C
    public final H build() {
        return this;
    }

    @Override // j$.util.stream.K0
    public final void d(long j) {
        clear();
        v(j);
    }

    @Override // j$.util.stream.K0
    public final void end() {
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ boolean g() {
        return false;
    }

    @Override // j$.util.stream.H
    public final void m(Object[] objArr, int i) {
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

    @Override // j$.util.stream.H
    public final Object[] p(IntFunction intFunction) {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        m(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.H
    public final /* synthetic */ int t() {
        return 0;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(int i) {
        AbstractC0153v0.k();
        throw null;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void accept(long j) {
        AbstractC0153v0.l();
        throw null;
    }
}
