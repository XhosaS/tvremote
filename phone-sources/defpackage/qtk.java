package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qtk {
    public final boolean a;

    public qtk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof qtk) && this.a == ((qtk) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "AccountCapabilities{shouldHideEmail=" + this.a + "}";
    }

    public qtk(boolean z) {
        this.a = z;
    }
}
