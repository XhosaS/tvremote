package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zcd extends zce implements Serializable, yqx {
    public static final zcd a = new zcd(yxh.a, yxf.a);
    private static final long serialVersionUID = 0;
    final yxi b;
    final yxi c;

    public zcd(yxi yxiVar, yxi yxiVar2) {
        this.b = yxiVar;
        this.c = yxiVar2;
        if (yxiVar == yxf.a || yxiVar2 == yxh.a) {
            throw new IllegalArgumentException("Invalid range: ".concat("(-∞..+∞)"));
        }
    }

    @Override // defpackage.yqx
    @Deprecated
    public final /* synthetic */ boolean a(Object obj) {
        ((Comparable) obj).getClass();
        return true;
    }

    public final boolean b() {
        return this.b.equals(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zcd) {
            zcd zcdVar = (zcd) obj;
            if (this.b.equals(zcdVar.b) && this.c.equals(zcdVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.b) * 31) + System.identityHashCode(this.c);
    }

    Object readResolve() {
        zcd zcdVar = a;
        return equals(zcdVar) ? zcdVar : this;
    }

    public final String toString() {
        return "(-∞..+∞)";
    }
}
