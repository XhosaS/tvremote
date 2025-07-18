package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lty {
    public final ksn a;

    public lty() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lty) {
            return this.a.equals(((lty) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetUserConfigurationRequest{account=" + this.a.toString() + "}";
    }

    public lty(ksn ksnVar) {
        this.a = ksnVar;
    }
}
