package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lsg {
    public final ksy a;
    public final boolean b;

    public lsg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lsg) {
            lsg lsgVar = (lsg) obj;
            if (this.a.equals(lsgVar.a) && this.b == lsgVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "EidrAsset{assetId=" + this.a.toString() + ", isPlayable=" + this.b + "}";
    }

    public lsg(ksy ksyVar, boolean z) {
        this.a = ksyVar;
        this.b = z;
    }
}
