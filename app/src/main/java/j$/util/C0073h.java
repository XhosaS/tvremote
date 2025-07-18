package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0073h extends C0071f implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0071f(this.c);
    }

    @Override // j$.util.C0071f, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0073h c0073h;
        synchronized (this.b) {
            c0073h = new C0073h(this.c.subList(i, i2), this.b);
        }
        return c0073h;
    }
}
