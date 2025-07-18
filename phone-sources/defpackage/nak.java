package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nak implements lhf {
    public final lio a;

    public nak() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof nak)) {
            return false;
        }
        return ((lif) this.a).e(((nak) obj).a);
    }

    public final int hashCode() {
        return ((lif) this.a).a() ^ 1000003;
    }

    public final String toString() {
        return "DownloadClickEvent{downloadButtonNode=" + this.a.toString() + "}";
    }

    public nak(lio lioVar) {
        this.a = lioVar;
    }
}
