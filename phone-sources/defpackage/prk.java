package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class prk {
    public final boolean a;

    public prk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof prk) && this.a == ((prk) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PhotoOptions{allowDefaultImage=" + this.a + "}";
    }

    public prk(boolean z) {
        this.a = z;
    }
}
