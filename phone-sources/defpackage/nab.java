package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nab implements lhf {
    public final lio a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nab)) {
            return false;
        }
        return ((lif) this.a).e(((nab) obj).a);
    }

    public final int hashCode() {
        return ((lif) this.a).a() ^ 1000003;
    }

    public final String toString() {
        return "DownloadClickEvent{downloadButtonNode=" + this.a.toString() + "}";
    }
}
