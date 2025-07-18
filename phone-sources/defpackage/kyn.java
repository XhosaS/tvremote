package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyn {
    public final ksy a;

    public kyn() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyn) {
            return this.a.equals(((kyn) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "MovieDetails{movieAssetId=" + this.a.toString() + "}";
    }

    public kyn(ksy ksyVar) {
        this.a = ksyVar;
    }
}
