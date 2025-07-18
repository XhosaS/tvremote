package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kwq {
    public final ksy a;
    public final kuf b;
    private final ksy c;

    public kwq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kwq) {
            kwq kwqVar = (kwq) obj;
            if (this.a.equals(kwqVar.a) && this.c.equals(kwqVar.c) && this.b.equals(kwqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        kuf kufVar = this.b;
        ksy ksyVar = this.c;
        return "ShowPlaybackInformation{seasonId=" + this.a.toString() + ", episodeId=" + ksyVar.toString() + ", distributorId=" + kufVar.toString() + "}";
    }

    public kwq(ksy ksyVar, ksy ksyVar2, kuf kufVar) {
        this.a = ksyVar;
        this.c = ksyVar2;
        this.b = kufVar;
    }
}
