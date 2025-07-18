package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gwt extends gwu {
    public final hac a;
    private final bqh b;

    public gwt(bqh bqhVar, hac hacVar) {
        hacVar.getClass();
        this.b = bqhVar;
        this.a = hacVar;
    }

    @Override // defpackage.gwu
    public final bqh a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwt)) {
            return false;
        }
        gwt gwtVar = (gwt) obj;
        return yks.e(this.b, gwtVar.b) && yks.e(this.a, gwtVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Success(painter=" + this.b + ", result=" + this.a + ")";
    }
}
