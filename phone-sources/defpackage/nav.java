package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nav implements lhf {
    public final ksy a;
    public final rzy b;
    private final String c;

    public nav() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nav) {
            nav navVar = (nav) obj;
            if (this.a.equals(navVar.a) && this.c.equals(navVar.c) && this.b.equals(navVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        rzy rzyVar = this.b;
        return "FilmClickEvent{assetId=" + this.a.toString() + ", title=" + this.c + ", uiNode=" + rzyVar.toString() + "}";
    }

    public nav(ksy ksyVar, String str, rzy rzyVar) {
        if (ksyVar == null) {
            throw new NullPointerException("Null assetId");
        }
        this.a = ksyVar;
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.c = str;
        if (rzyVar == null) {
            throw new NullPointerException("Null uiNode");
        }
        this.b = rzyVar;
    }
}
