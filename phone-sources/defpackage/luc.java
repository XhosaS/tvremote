package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luc {
    public final int a;
    public final boolean b;

    public luc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luc) {
            luc lucVar = (luc) obj;
            if (this.a == lucVar.a && this.b == lucVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "NotificationSetting{type=" + this.a + ", optIn=" + this.b + "}";
    }

    public luc(int i, boolean z) {
        this.a = i;
        this.b = z;
    }
}
