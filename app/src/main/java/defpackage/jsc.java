package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsc {
    private final String a = "proto";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jsc) {
            return this.a.equals(((jsc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Encoding{name=\"" + this.a + "\"}";
    }
}
