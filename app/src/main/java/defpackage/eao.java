package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eao {
    public final dyv a;
    public final eaf b;

    public eao(dyv dyvVar, eaf eafVar) {
        this.a = dyvVar;
        this.b = eafVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            eao eaoVar = (eao) obj;
            if (this.a.equals(eaoVar.a) && this.b.equals(eaoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.d * 31) + this.b.hashCode();
    }

    public final String toString() {
        eaf eafVar = this.b;
        return "PropertyHandle{ mTransitionId='" + String.valueOf(this.a) + "', mProperty=" + String.valueOf(eafVar) + "}";
    }
}
