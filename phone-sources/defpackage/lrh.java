package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lrh {
    public final tst a;

    public lrh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lrh) {
            return this.a.equals(((lrh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GetPlaylistResponse{playList=" + String.valueOf(this.a) + "}";
    }

    public lrh(tst tstVar) {
        this.a = tstVar;
    }
}
