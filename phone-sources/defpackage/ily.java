package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ily {
    public final long a;
    public final wlh b;

    public ily(long j, wlh wlhVar) {
        wlhVar.getClass();
        this.a = j;
        this.b = wlhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ily)) {
            return false;
        }
        ily ilyVar = (ily) obj;
        return this.a == ilyVar.a && this.b == ilyVar.b;
    }

    public final int hashCode() {
        return (a.k(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CacheDomain(cacheKey=" + this.a + ", domain=" + this.b + ")";
    }
}
