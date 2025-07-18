package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyo {
    public final ksy a;

    public kyo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kyo) {
            return this.a.equals(((kyo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "TrailerDetails{trailerAssetId=" + this.a.toString() + "}";
    }

    public kyo(ksy ksyVar) {
        this.a = ksyVar;
    }
}
