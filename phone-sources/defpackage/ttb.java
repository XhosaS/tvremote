package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttb<T> implements Serializable, tsv {
    private static final long serialVersionUID = 0;
    final tsv a;

    public ttb(tsv tsvVar) {
        this.a = tsvVar;
    }

    @Override // defpackage.tsv
    public final boolean apply(T t) {
        return !this.a.apply(t);
    }

    @Override // defpackage.tsv
    public final boolean equals(Object obj) {
        if (obj instanceof ttb) {
            return this.a.equals(((ttb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.not(" + this.a.toString() + ")";
    }
}
