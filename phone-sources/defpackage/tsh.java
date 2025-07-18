package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsh extends tsk implements Serializable {
    public static final tsh a = new tsh();
    private static final long serialVersionUID = 1;

    private Object readResolve() {
        return a;
    }

    @Override // defpackage.tsk
    protected final int a(Object obj) {
        return obj.hashCode();
    }

    @Override // defpackage.tsk
    protected final boolean b(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
