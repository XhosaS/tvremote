package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ank {
    public final long a;
    public final long b;

    public ank(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ank)) {
            return false;
        }
        long j = this.a;
        ank ankVar = (ank) obj;
        long j2 = ankVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, ankVar.b);
    }

    public final int hashCode() {
        long j = bnq.a;
        return (a.k(this.a) * 31) + a.k(this.b);
    }

    public final String toString() {
        return "SelectionColors(selectionHandleColor=" + ((Object) bnq.g(this.a)) + ", selectionBackgroundColor=" + ((Object) bnq.g(this.b)) + ')';
    }
}
