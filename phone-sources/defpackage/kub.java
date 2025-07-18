package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kub {
    public final String a;

    public kub() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kub) {
            return this.a.equals(((kub) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CastId{castId=" + this.a + "}";
    }

    public kub(String str) {
        if (str == null) {
            throw new NullPointerException("Null castId");
        }
        this.a = str;
    }
}
