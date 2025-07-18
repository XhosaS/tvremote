package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqe extends yqg implements Serializable {
    public static final yqe a = new yqe();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.yqg
    public final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.yqg
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
