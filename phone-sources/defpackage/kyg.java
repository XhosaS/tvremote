package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyg {
    public final ksy a;
    public final tst b;

    public kyg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyg) {
            kyg kygVar = (kyg) obj;
            if (this.a.equals(kygVar.a) && this.b.equals(kygVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        tst tstVar = this.b;
        return "MovieDetails{getMovieAssetId=" + this.a.toString() + ", detailsPageSelection=" + tstVar.toString() + "}";
    }

    public kyg(ksy ksyVar, tst tstVar) {
        this.a = ksyVar;
        this.b = tstVar;
    }
}
