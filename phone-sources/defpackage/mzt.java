package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mzt implements lhf {
    public final boolean a;
    private final lio b;

    public mzt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mzt) {
            mzt mztVar = (mzt) obj;
            if (this.a == mztVar.a) {
                if (((lif) this.b).e(mztVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ ((lif) this.b).a();
    }

    public final String toString() {
        return "ExpandSynopsisEvent{isToExpand=" + this.a + ", uiElementNode=" + this.b.toString() + "}";
    }

    public mzt(boolean z, lio lioVar) {
        this.a = z;
        this.b = lioVar;
    }
}
