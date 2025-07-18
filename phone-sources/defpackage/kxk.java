package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kxk {
    public final ksy a;

    public kxk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kxk) {
            return this.a.equals(((kxk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "AndroidAppAction{assetId=" + this.a.toString() + "}";
    }

    public kxk(ksy ksyVar) {
        this.a = ksyVar;
    }
}
