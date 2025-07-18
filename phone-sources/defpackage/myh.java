package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myh implements lhf {
    public final boolean a;

    public myh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof myh) && this.a == ((myh) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "FamilyShareSwitchChangeEvent{checked=" + this.a + "}";
    }

    public myh(boolean z) {
        this.a = z;
    }
}
