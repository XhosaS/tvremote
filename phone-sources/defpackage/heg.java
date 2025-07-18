package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heg {
    public Object a;
    public Object b;

    public final boolean equals(Object obj) {
        if (!(obj instanceof cui)) {
            return false;
        }
        cui cuiVar = (cui) obj;
        return a.Q(cuiVar.a, this.a) && a.Q(cuiVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.b) + "}";
    }
}
