package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqf extends yqg implements Serializable {
    public static final yqf a = new yqf();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.yqg
    public final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.yqg
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
