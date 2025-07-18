package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yyi implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public yyi(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return yyk.n(this.a);
    }
}
