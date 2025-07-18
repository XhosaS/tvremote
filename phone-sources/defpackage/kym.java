package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kym {
    public final ksy a;
    public final ksy b;
    public final ksy c;

    public kym() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kym) {
            kym kymVar = (kym) obj;
            if (this.a.equals(kymVar.a) && this.b.equals(kymVar.b) && this.c.equals(kymVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ksy ksyVar = this.c;
        ksy ksyVar2 = this.b;
        return "EpisodeDetails{episodeAssetId=" + this.a.toString() + ", seasonAssetId=" + ksyVar2.toString() + ", showAssetId=" + ksyVar.toString() + "}";
    }

    public kym(ksy ksyVar, ksy ksyVar2, ksy ksyVar3) {
        this.a = ksyVar;
        this.b = ksyVar2;
        this.c = ksyVar3;
    }
}
