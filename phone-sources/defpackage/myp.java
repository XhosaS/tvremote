package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class myp implements lhf {
    public final ksy a;
    public final lio b;

    public myp() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof myp) {
            myp mypVar = (myp) obj;
            if (this.a.equals(mypVar.a)) {
                if (((lif) this.b).e(mypVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ ((lif) this.b).a();
    }

    public final String toString() {
        lio lioVar = this.b;
        return "PlayHeaderTrailerClickEvent{trailerId=" + this.a.toString() + ", playButtonNode=" + lioVar.toString() + "}";
    }

    public myp(ksy ksyVar, lio lioVar) {
        this.a = ksyVar;
        this.b = lioVar;
    }
}
