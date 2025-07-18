package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyh {
    public final ksy a;
    public final tst b;
    private final tst c;
    private final tst d;

    public kyh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyh) {
            kyh kyhVar = (kyh) obj;
            if (this.a.equals(kyhVar.a) && this.c.equals(kyhVar.c) && this.d.equals(kyhVar.d) && this.b.equals(kyhVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tst tstVar = this.b;
        tst tstVar2 = this.d;
        tst tstVar3 = this.c;
        return "ShowDetails{getShowAssetId=" + this.a.toString() + ", getOptionalSeasonAssetId=" + tstVar3.toString() + ", getOptionalEpisodeAssetId=" + tstVar2.toString() + ", detailsPageSelection=" + tstVar.toString() + "}";
    }

    public kyh(ksy ksyVar, tst tstVar, tst tstVar2, tst tstVar3) {
        this.a = ksyVar;
        this.c = tstVar;
        this.d = tstVar2;
        this.b = tstVar3;
    }
}
