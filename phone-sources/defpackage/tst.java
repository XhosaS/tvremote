package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class tst<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static tst h(Object obj) {
        return obj == null ? trk.a : new ttd(obj);
    }

    public static tst i(Object obj) {
        obj.getClass();
        return new ttd(obj);
    }

    public abstract tst a(tst tstVar);

    public abstract tst b(tsl tslVar);

    public abstract Object c();

    public abstract Object d(ttm ttmVar);

    public abstract Object e(Object obj);

    public abstract boolean equals(Object obj);

    public abstract Object f();

    public abstract boolean g();

    public abstract int hashCode();
}
