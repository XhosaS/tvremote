package defpackage;

import java.util.Enumeration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dds implements Enumeration {
    private final Enumeration a;

    public dds(Enumeration enumeration) {
        this.a = enumeration;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        return ddq.c(this.a.nextElement());
    }
}
