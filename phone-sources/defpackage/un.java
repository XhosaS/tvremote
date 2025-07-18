package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class un {
    public final long a;
    public final long b;
    public final boolean c = false;

    public un(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final un a(un unVar) {
        return new un(a.D(this.a, unVar.a), Math.max(this.b, unVar.b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof un)) {
            return false;
        }
        un unVar = (un) obj;
        if (!a.s(this.a, unVar.a) || this.b != unVar.b) {
            return false;
        }
        boolean z = unVar.c;
        return true;
    }

    public final int hashCode() {
        return (((a.k(this.a) * 31) + a.k(this.b)) * 31) + a.q(false);
    }

    public final String toString() {
        return "MouseWheelScrollDelta(value=" + ((Object) bmx.d(this.a)) + ", timeMillis=" + this.b + ", shouldApplyImmediately=false)";
    }
}
