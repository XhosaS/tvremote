package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ndt {
    private final String a = "proto";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ndt) {
            return this.a.equals(((ndt) obj).a);
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
