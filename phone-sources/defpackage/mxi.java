package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxi implements lhf {
    public final mxe a;

    public mxi() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxi) {
            return this.a.equals(((mxi) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExpandedDistributorClickEvent{distributor=" + this.a.toString() + "}";
    }

    public mxi(mxe mxeVar) {
        if (mxeVar == null) {
            throw new NullPointerException("Null distributor");
        }
        this.a = mxeVar;
    }
}
