package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzq implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public bzq(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return bzs.p(this.a);
    }
}
