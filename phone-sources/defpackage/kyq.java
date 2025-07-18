package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyq {
    public final String a;
    public final String b;

    public kyq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyq) {
            kyq kyqVar = (kyq) obj;
            if (this.a.equals(kyqVar.a) && this.b.equals(kyqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "QoePing{sessionNonce=" + this.a + ", uri=" + this.b + "}";
    }

    public kyq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
