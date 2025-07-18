package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sky {
    public final boolean a;
    public final int b;

    public sky(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sky)) {
            return false;
        }
        sky skyVar = (sky) obj;
        return this.a == skyVar.a && this.b == skyVar.b;
    }

    public final int hashCode() {
        return ((true != this.a ? 1237 : 1231) * 31) + this.b;
    }

    public final String toString() {
        return "RefOpResult(existing=" + this.a + ", count=" + this.b + ")";
    }
}
