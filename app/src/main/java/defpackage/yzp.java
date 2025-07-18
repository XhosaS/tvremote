package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
class yzp implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;

    public yzp(Object[] objArr) {
        this.a = objArr;
    }

    Object readResolve() {
        return yzq.p(this.a);
    }
}
