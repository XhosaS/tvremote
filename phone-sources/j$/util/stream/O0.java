package j$.util.stream;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class O0 extends L0 {
    public Object[] d;
    public int e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final void d(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final void end() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        K0 k0 = (K0) this.a;
        k0.d(this.e);
        if (this.c) {
            while (i < this.e && !k0.g()) {
                k0.accept((K0) this.d[i]);
                i++;
            }
        } else {
            while (i < this.e) {
                k0.accept((K0) this.d[i]);
                i++;
            }
        }
        k0.end();
        this.d = null;
    }
}
