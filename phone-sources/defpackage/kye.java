package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kye {
    private final String a;

    public kye() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kye) {
            return this.a.equals(((kye) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "OpenClusterPageAction{refreshToken=" + this.a + "}";
    }

    public kye(String str) {
        if (str == null) {
            throw new NullPointerException("Null refreshToken");
        }
        this.a = str;
    }
}
