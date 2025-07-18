package defpackage;

/* compiled from: PG */
@yfp
/* loaded from: classes.dex */
public final class sa {
    public final long a;
    public final yy b;

    public sa(long j, yy yyVar) {
        this.a = j;
        this.b = yyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!yks.e(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        long j = this.a;
        sa saVar = (sa) obj;
        long j2 = saVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && yks.e(this.b, saVar.b);
    }

    public final int hashCode() {
        long j = bnq.a;
        return (a.k(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "OverscrollConfiguration(glowColor=" + ((Object) bnq.g(this.a)) + ", drawPadding=" + this.b + ')';
    }
}
