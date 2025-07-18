package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myg implements lhf {
    public final boolean a;

    public myg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof myg) && this.a == ((myg) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "FamilyLibraryShareDialogDoNotShowAgainEvent{checked=" + this.a + "}";
    }

    public myg(boolean z) {
        this.a = z;
    }
}
