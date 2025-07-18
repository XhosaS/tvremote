package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lra {
    public final ksn a;
    public final ieg b;

    public lra() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lra) {
            lra lraVar = (lra) obj;
            if (this.a.equals(lraVar.a) && this.b.equals(lraVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.b;
        return "GetRatingSchemesRequest{account=" + this.a.toString() + ", country=" + iegVar.toString() + "}";
    }

    public lra(ksn ksnVar, ieg iegVar) {
        this.a = ksnVar;
        this.b = iegVar;
    }
}
