package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxg implements lhf {
    public final mxo a;

    public mxg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxg) {
            return this.a.equals(((mxg) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CollapsedDistributorClickEvent{distributorsViewModel=" + this.a.toString() + "}";
    }

    public mxg(mxo mxoVar) {
        if (mxoVar == null) {
            throw new NullPointerException("Null distributorsViewModel");
        }
        this.a = mxoVar;
    }
}
