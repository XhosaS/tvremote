package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class caa implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public caa(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return cab.n(this.a);
    }
}
