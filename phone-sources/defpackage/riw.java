package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class riw {
    public final String a;
    public final int b;

    public riw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof riw) {
            riw riwVar = (riw) obj;
            if (this.b == riwVar.b) {
                String str = this.a;
                String str2 = riwVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        a.bl(i);
        String str = this.a;
        return ((i ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AuthChannel{type=" + (this.b != 1 ? "ANONYMOUS" : "GAIA") + ", account=" + this.a + "}";
    }

    public riw(int i, String str) {
        this.b = i;
        this.a = str;
    }
}
