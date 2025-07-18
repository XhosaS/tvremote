package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsx<A, B> implements Serializable, tsv {
    private static final long serialVersionUID = 0;
    final tsv a;
    final tsl b;

    public tsx(tsv tsvVar, tsl tslVar) {
        tsvVar.getClass();
        this.a = tsvVar;
        tslVar.getClass();
        this.b = tslVar;
    }

    @Override // defpackage.tsv
    public final boolean apply(A a) {
        return this.a.apply(this.b.apply(a));
    }

    @Override // defpackage.tsv
    public final boolean equals(Object obj) {
        if (obj instanceof tsx) {
            tsx tsxVar = (tsx) obj;
            if (this.b.equals(tsxVar.b) && this.a.equals(tsxVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        tsv tsvVar = this.a;
        return tsvVar.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        tsl tslVar = this.b;
        return this.a.toString() + "(" + tslVar.toString() + ")";
    }
}
