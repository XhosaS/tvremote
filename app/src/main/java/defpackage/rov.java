package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rov extends rpf {
    private final rra a;
    private final long b;

    public rov(rra rraVar, long j) {
        this.a = rraVar;
        this.b = j;
    }

    @Override // defpackage.rpf
    protected final long a() {
        return this.b;
    }

    @Override // defpackage.rpf
    protected final rra b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rpf) {
            rpf rpfVar = (rpf) obj;
            if (this.a.equals(rpfVar.b()) && this.b == rpfVar.a()) {
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
        return "RecentAppFlow{appFlow=" + this.a.toString() + ", loggedTimeNanos=" + this.b + "}";
    }
}
