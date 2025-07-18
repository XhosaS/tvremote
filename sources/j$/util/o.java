package j$.util;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class o extends i implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new i(this.b);
    }

    @Override // j$.util.i, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new o(this.b.subList(i, i2));
    }
}
