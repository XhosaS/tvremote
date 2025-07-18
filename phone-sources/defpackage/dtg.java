package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dtg {
    public final long a;
    public final long b;
    public final long c;
    public final czt d;

    public dtg(long j, long j2, long j3, czt cztVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = cztVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtg)) {
            return false;
        }
        dtg dtgVar = (dtg) obj;
        long j = this.a;
        long j2 = dtgVar.a;
        long j3 = ynm.a;
        return a.s(j, j2) && a.s(this.b, dtgVar.b) && a.s(this.c, dtgVar.c) && yks.e(this.d, dtgVar.d);
    }

    public final int hashCode() {
        long j = ynm.a;
        int iK = a.k(this.a) * 31;
        czt cztVar = this.d;
        return ((((iK + a.k(this.b)) * 31) + a.k(this.c)) * 31) + cztVar.hashCode();
    }

    public final String toString() {
        return "TimeoutOptions(initialTimeout=" + ((Object) ynm.r(this.a)) + ", additionalTime=" + ((Object) ynm.r(this.b)) + ", idleTimeout=" + ((Object) ynm.r(this.c)) + ", timeSource=" + this.d + ')';
    }
}
