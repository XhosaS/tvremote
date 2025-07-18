package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbc implements lhf {
    public final rzy a;

    public nbc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbc) {
            return this.a.equals(((nbc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CloseClickEvent{uiNode=" + this.a.toString() + "}";
    }

    public nbc(rzy rzyVar) {
        if (rzyVar == null) {
            throw new NullPointerException("Null uiNode");
        }
        this.a = rzyVar;
    }
}
