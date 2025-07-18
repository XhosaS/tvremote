package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uqx {
    public static final xpx a = new xpx("com.google.frameworks.client.data.android.auth.AuthContext", null);
    public final String b;
    public final String c;

    public uqx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uqx) {
            uqx uqxVar = (uqx) obj;
            String str = this.b;
            if (str != null ? str.equals(uqxVar.b) : uqxVar.b == null) {
                if (this.c.equals(uqxVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "AuthContext{identifier=" + this.b + ", type=" + this.c + "}";
    }

    public uqx(String str) {
        this.b = str;
        this.c = "google";
    }
}
