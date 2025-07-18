package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcx {
    public final boolean a;

    public hcx(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcx) && this.a == ((hcx) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "AssistantBroadcastSettings(enabled=" + this.a + ")";
    }
}
