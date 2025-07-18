package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxh implements lhf {
    public final mxo a;

    public mxh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxh) {
            return this.a.equals(((mxh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DistributorsDialogImpressionEvent{distributorsViewModel=" + this.a.toString() + "}";
    }

    public mxh(mxo mxoVar) {
        if (mxoVar == null) {
            throw new NullPointerException("Null distributorsViewModel");
        }
        this.a = mxoVar;
    }
}
