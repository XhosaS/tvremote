package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjz {
    public final String a;

    static {
        new zjz("");
        new zjz("<br>");
        new zjz("<!DOCTYPE html>");
    }

    public zjz(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zjz) {
            return this.a.equals(((zjz) obj).a);
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
