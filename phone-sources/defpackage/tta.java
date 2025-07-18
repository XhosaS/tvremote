package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tta implements Serializable, tsv {
    private static final long serialVersionUID = 0;
    private final Object a;

    public tta(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.tsv
    public final boolean apply(Object obj) {
        return this.a.equals(obj);
    }

    @Override // defpackage.tsv
    public final boolean equals(Object obj) {
        if (obj instanceof tta) {
            return this.a.equals(((tta) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Predicates.equalTo(" + this.a.toString() + ")";
    }
}
