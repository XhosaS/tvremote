package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yfw<A, B> implements Serializable {
    public final Object a;
    public final Object b;

    public yfw(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfw)) {
            return false;
        }
        yfw yfwVar = (yfw) obj;
        return yks.e(this.a, yfwVar.a) && yks.e(this.b, yfwVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }
}
