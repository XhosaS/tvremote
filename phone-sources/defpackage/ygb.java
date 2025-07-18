package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygb implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public ygb(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygb)) {
            return false;
        }
        ygb ygbVar = (ygb) obj;
        return yks.e(this.a, ygbVar.a) && yks.e(this.b, ygbVar.b) && yks.e(this.c, ygbVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = ((obj == null ? 0 : obj.hashCode()) * 31) + this.b.hashCode();
        Object obj2 = this.c;
        return (iHashCode * 31) + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ")";
    }
}
