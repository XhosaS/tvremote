package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqu {
    public final boolean a;

    public lqu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lqu) && this.a == ((lqu) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "ShareAssetResponse{statusOk=" + this.a + "}";
    }

    public lqu(boolean z) {
        this.a = z;
    }
}
