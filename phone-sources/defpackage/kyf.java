package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyf {
    public final ksy a;
    public final tst b;

    public kyf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyf) {
            kyf kyfVar = (kyf) obj;
            if (this.a.equals(kyfVar.a) && this.b.equals(kyfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "MovieBundleDetails{getAssetId=" + this.a.toString() + ", detailsPageSelection=Optional.absent()}";
    }

    public kyf(ksy ksyVar, tst tstVar) {
        this.a = ksyVar;
        this.b = tstVar;
    }
}
