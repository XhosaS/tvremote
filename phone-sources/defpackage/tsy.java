package defpackage;

import java.io.Serializable;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsy<T> implements Serializable, tsv {
    private static final long serialVersionUID = 0;
    private final Collection a;

    public tsy(Collection collection) {
        collection.getClass();
        this.a = collection;
    }

    @Override // defpackage.tsv
    public final boolean apply(T t) {
        try {
            return this.a.contains(t);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // defpackage.tsv
    public final boolean equals(Object obj) {
        if (obj instanceof tsy) {
            return this.a.equals(((tsy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.in(" + this.a.toString() + ")";
    }
}
