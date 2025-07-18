package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbl implements lhf {
    private final String a;
    private final rzy b;

    public nbl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nbl) {
            nbl nblVar = (nbl) obj;
            if (this.a.equals(nblVar.a) && this.b.equals(nblVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SongInfoCardClickEvent{url=" + this.a + ", uiNode=" + this.b.toString() + "}";
    }

    public nbl(String str, rzy rzyVar) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.a = str;
        this.b = rzyVar;
    }
}
