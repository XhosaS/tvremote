package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class tsu implements Serializable {
    private static final long serialVersionUID = 747826592375603043L;
    public final Object a;
    public final Object b;

    public tsu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tsu) {
            tsu tsuVar = (tsu) obj;
            if (a.Q(this.a, tsuVar.a) && a.Q(this.b, tsuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        Object obj = this.b;
        return "(" + String.valueOf(this.a) + ", " + String.valueOf(obj) + ")";
    }
}
