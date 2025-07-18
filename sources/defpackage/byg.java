package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class byg implements Serializable {
    private static final long serialVersionUID = 0;

    public static byg g(Object obj) {
        return obj == null ? bxw.a : new byi(obj);
    }

    public static byg h(Object obj) {
        obj.getClass();
        return new byi(obj);
    }

    public abstract byg a(byb bybVar);

    public abstract Object b();

    public abstract Object c(byo byoVar);

    public abstract Object d(Object obj);

    public abstract Object e();

    public abstract boolean equals(Object obj);

    public abstract boolean f();

    public abstract int hashCode();
}
