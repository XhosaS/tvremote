package defpackage;

import java.io.Serializable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsw<T> implements Serializable, tsv {
    private static final long serialVersionUID = 0;
    private final List a;

    public tsw(List list) {
        this.a = list;
    }

    @Override // defpackage.tsv
    public final boolean apply(T t) {
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return true;
            }
            if (!((tsv) list.get(i)).apply(t)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.tsv
    public final boolean equals(Object obj) {
        if (obj instanceof tsw) {
            return this.a.equals(((tsw) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (T t : this.a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(t);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
