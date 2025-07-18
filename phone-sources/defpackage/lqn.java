package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqn {
    public final boolean a;

    public lqn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lqn) && this.a == ((lqn) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PreorderCancelResponse{statusOk=" + this.a + "}";
    }

    public lqn(boolean z) {
        this.a = z;
    }
}
