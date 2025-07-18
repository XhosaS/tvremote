package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class clq {
    public static final clq a = new clq(clw.v(0), clw.v(0));
    public final long b;
    public final long c;

    public clq(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clq)) {
            return false;
        }
        long j = this.b;
        clq clqVar = (clq) obj;
        long j2 = clqVar.b;
        long j3 = cmk.a;
        return a.s(j, j2) && a.s(this.c, clqVar.c);
    }

    public final int hashCode() {
        long j = cmk.a;
        return (a.k(this.b) * 31) + a.k(this.c);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) cmk.d(this.b)) + ", restLine=" + ((Object) cmk.d(this.c)) + ')';
    }
}
