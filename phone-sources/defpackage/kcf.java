package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcf {
    public final long a;
    public final long b;
    public final long c;

    public kcf(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcf)) {
            return false;
        }
        kcf kcfVar = (kcf) obj;
        long j = this.a;
        long j2 = kcfVar.a;
        long j3 = bnq.a;
        return a.s(j, j2) && a.s(this.b, kcfVar.b) && a.s(this.c, kcfVar.c);
    }

    public final int hashCode() {
        long j = bnq.a;
        return (((a.k(this.a) * 31) + a.k(this.b)) * 31) + a.k(this.c);
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.b;
        return "HotAndNewEntityColors(darkTonalColor=" + bnq.g(this.a) + ", primaryLightTonalColor=" + bnq.g(j2) + ", secondaryLightTonalColor=" + bnq.g(j) + ")";
    }
}
