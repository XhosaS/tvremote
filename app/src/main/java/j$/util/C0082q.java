package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0082q extends C0078m implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    private Object writeReplace() {
        return new C0078m(this.b);
    }

    @Override // j$.util.C0078m, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C0082q(this.b.subList(i, i2));
    }
}
