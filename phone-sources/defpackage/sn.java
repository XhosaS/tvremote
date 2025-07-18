package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sn {
    public static final sn a = new sn("text/*");
    public static final sn b = new sn("*/*");
    public final String c;

    public sn(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sn) {
            return yks.e(this.c, ((sn) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "MediaType(representation='" + this.c + "')";
    }
}
