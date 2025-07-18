package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsi extends tsk implements Serializable {
    public static final tsi a = new tsi();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.tsk
    protected final int a(Object obj) {
        return System.identityHashCode(obj);
    }

    @Override // defpackage.tsk
    protected final boolean b(Object obj, Object obj2) {
        return false;
    }
}
