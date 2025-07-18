package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lre {
    public final ieg a;
    public final ksy b;
    public final int c;

    public lre() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lre) {
            lre lreVar = (lre) obj;
            if (this.a.equals(lreVar.a) && this.c == lreVar.c && this.b.equals(lreVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.c;
        a.bl(i);
        return (((((iHashCode * 1000003) ^ i) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2;
    }

    public final String toString() {
        int i = this.c;
        return "GetPlaylistRequest{account=" + this.a.toString() + ", window=" + (i != 1 ? "PREVIOUS" : "NEXT") + ", episodeAssetId=" + this.b.toString() + ", maxAsset=2}";
    }

    public lre(ieg iegVar, int i, ksy ksyVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null account");
        }
        this.a = iegVar;
        this.c = i;
        this.b = ksyVar;
    }
}
