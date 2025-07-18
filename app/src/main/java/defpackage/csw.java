package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class csw {
    public Object a;
    public Object b;

    private static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afg)) {
            return false;
        }
        afg afgVar = (afg) obj;
        return a(afgVar.a, this.a) && a(afgVar.b, this.b);
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
