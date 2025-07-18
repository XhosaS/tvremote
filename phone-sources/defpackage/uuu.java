package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uuu {
    private final tuq a;
    private final String b;

    public uuu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uuu) {
            uuu uuuVar = (uuu) obj;
            if (this.a.equals(uuuVar.a)) {
                String str = this.b;
                String str2 = uuuVar.b;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + "}";
    }

    public uuu(tuq tuqVar, String str) {
        this.a = tuqVar;
        this.b = str;
    }
}
