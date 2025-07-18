package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccp {
    private final long a;
    private final long b;

    public ccp(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && agvy.c(getClass(), obj.getClass())) {
            ccp ccpVar = (ccp) obj;
            if (ccpVar.a == this.a && ccpVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "PeriodicityInfo{repeatIntervalMillis=" + this.a + ", flexIntervalMillis=" + this.b + '}';
    }
}
