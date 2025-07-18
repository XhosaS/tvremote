package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxt implements lhf {
    public final kuo a;
    public final lio b;

    public mxt() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxt) {
            mxt mxtVar = (mxt) obj;
            if (this.a.equals(mxtVar.a) && this.b.equals(mxtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        lio lioVar = this.b;
        return "DownloadEpisodeClickEvent{episode=" + this.a.toString() + ", uiElementNode=" + lioVar.toString() + "}";
    }

    public mxt(kuo kuoVar, lio lioVar) {
        if (kuoVar == null) {
            throw new NullPointerException("Null episode");
        }
        this.a = kuoVar;
        if (lioVar == null) {
            throw new NullPointerException("Null uiElementNode");
        }
        this.b = lioVar;
    }
}
