package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsz<T> implements Serializable, tsv {
    private static final long serialVersionUID = 0;
    private final Class a;

    public tsz(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.tsv
    public final boolean apply(T t) {
        return this.a.isInstance(t);
    }

    @Override // defpackage.tsv
    public final boolean equals(Object obj) {
        return (obj instanceof tsz) && this.a == ((tsz) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.instanceOf(" + this.a.getName() + ")";
    }
}
