package j$.util.stream;

import j$.util.Collection;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class N0 extends L0 {
    public ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final void d(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }

    @Override // j$.util.stream.A0, j$.util.stream.K0
    public final void end() {
        j$.desugar.sun.nio.fs.g.N(this.d, this.b);
        K0 k0 = (K0) this.a;
        k0.d(this.d.size());
        if (this.c) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (k0.g()) {
                    break;
                } else {
                    k0.accept((K0) obj);
                }
            }
        } else {
            Collection.EL.a(this.d, new j$.desugar.sun.nio.fs.h(11, k0));
        }
        k0.end();
        this.d = null;
    }
}
