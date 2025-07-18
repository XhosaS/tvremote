package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cui {
    public final Object a;
    public final Object b;

    public cui(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cui)) {
            return false;
        }
        cui cuiVar = (cui) obj;
        return Objects.equals(cuiVar.a, this.a) && Objects.equals(cuiVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
