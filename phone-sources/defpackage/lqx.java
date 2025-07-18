package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqx {
    public final boolean a;

    public lqx() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lqx) && this.a == ((lqx) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "UnshareAssetResponse{statusOk=" + this.a + "}";
    }

    public lqx(boolean z) {
        this.a = z;
    }
}
