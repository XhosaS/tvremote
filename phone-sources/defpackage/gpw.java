package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpw {
    private final long a;
    private final long b;

    public gpw(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yks.e(getClass(), obj.getClass())) {
            gpw gpwVar = (gpw) obj;
            if (gpwVar.a == this.a && gpwVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (a.k(this.a) * 31) + a.k(this.b);
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
