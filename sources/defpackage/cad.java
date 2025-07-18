package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cad implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator a;
    final Object[] b;

    public cad(Comparator comparator, Object[] objArr) {
        this.a = comparator;
        this.b = objArr;
    }

    Object readResolve() {
        cac cacVar = new cac(this.a);
        Object[] objArr = this.b;
        cacVar.b(objArr, objArr.length);
        return cacVar.f();
    }
}
