package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qjc {
    public final String a;
    public final long b;
    public final Long c;

    public qjc(String str, long j, Long l) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qjc)) {
            return false;
        }
        qjc qjcVar = (qjc) obj;
        return yks.e(this.a, qjcVar.a) && this.b == qjcVar.b && yks.e(this.c, qjcVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.c;
        return ((iHashCode + a.k(this.b)) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "AuthToken(token=" + this.a + ", authTimeMillis=" + this.b + ", expirationTimeSecs=" + this.c + ")";
    }
}
