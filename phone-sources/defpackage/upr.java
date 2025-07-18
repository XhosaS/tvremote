package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upr {
    public final String a;
    public final String b;

    public upr() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof upr) {
            upr uprVar = (upr) obj;
            if (this.a.equals(uprVar.a) && this.b.equals(uprVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "LibraryVersion{libraryName=" + this.a + ", version=" + this.b + "}";
    }

    public upr(String str, String str2) {
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.b = str2;
    }
}
