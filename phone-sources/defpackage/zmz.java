package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class zmz implements Enumeration {
    private final Enumeration a;

    public zmz(Enumeration enumeration) {
        this.a = enumeration;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return zmx.c(this.a.nextElement());
    }
}
