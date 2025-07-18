package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class naw implements lhf {
    public final ksy a;
    public final boolean b;
    public final rzy c;

    public naw() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof naw) {
            naw nawVar = (naw) obj;
            if (this.a.equals(nawVar.a) && this.b == nawVar.b && this.c.equals(nawVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        rzy rzyVar = this.c;
        return "WatchlistClickEvent{assetId=" + this.a.toString() + ", isWatchlisted=" + this.b + ", watchlistUiNode=" + rzyVar.toString() + "}";
    }

    public naw(ksy ksyVar, boolean z, rzy rzyVar) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.a = ksyVar;
        this.b = z;
        if (rzyVar == null) {
            throw new NullPointerException("Null watchlistUiNode");
        }
        this.c = rzyVar;
    }
}
