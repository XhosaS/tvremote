package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nai implements lhf {
    public final String a;
    public final lio b;

    public nai() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nai) {
            nai naiVar = (nai) obj;
            if (this.a.equals(naiVar.a) && this.b.equals(naiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "PlayTrailerClickEvent{trailerAssetId=" + this.a + ", uiElementNode=" + this.b.toString() + "}";
    }

    public nai(String str, lio lioVar) {
        if (str == null) {
            throw new NullPointerException("Null trailerAssetId");
        }
        this.a = str;
        if (lioVar == null) {
            throw new NullPointerException("Null uiElementNode");
        }
        this.b = lioVar;
    }
}
