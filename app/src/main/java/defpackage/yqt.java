package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class yqt implements Serializable {
    private static final long serialVersionUID = 0;

    public static yqt h(Object obj) {
        return obj == null ? ypv.a : new yqz(obj);
    }

    public static yqt i(Object obj) {
        obj.getClass();
        return new yqz(obj);
    }

    public abstract yqt a(yqt yqtVar);

    public abstract yqt b(yqi yqiVar);

    public abstract Object c();

    public abstract Object d(yrp yrpVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();
}
