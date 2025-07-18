package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0101i extends C0099g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0099g(this.c);
    }

    @Override // j$.util.C0099g, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0101i c0101i;
        synchronized (this.b) {
            c0101i = new C0101i(this.c.subList(i, i2), this.b);
        }
        return c0101i;
    }
}
