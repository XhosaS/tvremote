package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class luk {
    public final ksn a;
    public final String b;

    public luk() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof luk) {
            luk lukVar = (luk) obj;
            if (this.a.equals(lukVar.a) && this.b.equals(lukVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GetWatchlistRequest{account=" + this.a.toString() + ", snapshotToken=" + this.b + "}";
    }

    public luk(ksn ksnVar, String str) {
        this.a = ksnVar;
        this.b = str;
    }
}
