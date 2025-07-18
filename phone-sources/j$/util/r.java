package j$.util;

import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class r extends C0106n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0106n(this.b);
    }

    @Override // j$.util.C0106n, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new r(this.b.subList(i, i2));
    }
}
