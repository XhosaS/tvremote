package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tzl {
    public final String a;

    static {
        new tzl("");
        new tzl("<br>");
        new tzl("<!DOCTYPE html>");
    }

    public tzl(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tzl) {
            return this.a.equals(((tzl) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 867184553;
    }

    public final String toString() {
        return "SafeHtml{" + this.a + "}";
    }
}
