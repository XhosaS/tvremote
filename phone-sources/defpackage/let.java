package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class let {
    public final Object a;
    public final long b;
    private final les c;
    private final int f = 2;
    private final String d = "";
    private final long e = 0;

    public let(Object obj, les lesVar, long j) {
        this.a = obj;
        this.c = lesVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof let)) {
            return false;
        }
        let letVar = (let) obj;
        if (!yks.e(this.a, letVar.a) || !yks.e(this.c, letVar.c) || this.b != letVar.b) {
            return false;
        }
        int i = letVar.f;
        if (!yks.e(this.d, letVar.d)) {
            return false;
        }
        long j = letVar.e;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.c.hashCode();
        a.bw(2);
        return (((((((iHashCode * 31) + a.k(this.b)) * 31) + 2) * 31) + this.d.hashCode()) * 31) + a.k(0L);
    }

    public final String toString() {
        return "CacheValue(cachedValue=" + this.a + ", key=" + this.c + ", expirationSeconds=" + this.b + ", priority=LOW_PRIORITY, country=" + this.d + ", lastUpdateSeconds=0)";
    }
}
