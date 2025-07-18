package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mxu implements lhf {
    public final kuo a;
    public final kxg b;
    public final lio c;

    public mxu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mxu) {
            mxu mxuVar = (mxu) obj;
            if (this.a.equals(mxuVar.a) && this.b.equals(mxuVar.b) && this.c.equals(mxuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        lio lioVar = this.c;
        kxg kxgVar = this.b;
        return "PlayEpisodeClickEvent{episode=" + this.a.toString() + ", watchAction=" + kxgVar.toString() + ", uiElementNode=" + lioVar.toString() + "}";
    }

    public mxu(kuo kuoVar, kxg kxgVar, lio lioVar) {
        if (kuoVar == null) {
            throw new NullPointerException("Null episode");
        }
        this.a = kuoVar;
        this.b = kxgVar;
        if (lioVar == null) {
            throw new NullPointerException("Null uiElementNode");
        }
        this.c = lioVar;
    }
}
