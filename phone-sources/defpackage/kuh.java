package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuh {
    public final ksn a;
    public final String b;

    public kuh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kuh) {
            kuh kuhVar = (kuh) obj;
            if (this.a.equals(kuhVar.a) && this.b.equals(kuhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "[download " + this.a.toString() + ", " + this.b + "]";
    }

    public kuh(ksn ksnVar, String str) {
        this.a = ksnVar;
        if (str == null) {
            throw new NullPointerException("Null videoId");
        }
        this.b = str;
    }
}
