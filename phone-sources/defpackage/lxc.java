package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lxc {
    public final String a;
    public final int b;

    public lxc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lxc) {
            lxc lxcVar = (lxc) obj;
            if (this.a.equals(lxcVar.a) && this.b == lxcVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        return "Version{versionName=" + this.a + ", versionCode=" + this.b + "}";
    }

    public lxc(String str, int i) {
        if (str == null) {
            throw new NullPointerException("Null versionName");
        }
        this.a = str;
        this.b = i;
    }
}
