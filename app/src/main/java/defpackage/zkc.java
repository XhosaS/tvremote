package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zkc {
    public final String a;

    static {
        new zkc("");
    }

    public zkc(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zkc) {
            return this.a.equals(((zkc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1880570128;
    }

    public final String toString() {
        return "SafeStyleSheet{" + this.a + "}";
    }
}
