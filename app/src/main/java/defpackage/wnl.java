package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wnl extends wnr {
    private final wns a;
    private final long b;

    public wnl(wns wnsVar, long j) {
        if (wnsVar == null) {
            throw new NullPointerException("Null constraintType");
        }
        this.a = wnsVar;
        this.b = j;
    }

    @Override // defpackage.wnr
    public final long a() {
        return this.b;
    }

    @Override // defpackage.wnr
    public final wns b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wnr) {
            wnr wnrVar = (wnr) obj;
            if (this.a.equals(wnrVar.b()) && this.b == wnrVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SyncConstraint{constraintType=" + this.a.toString() + ", applicablePeriod=" + this.b + "}";
    }
}
