package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lki {
    public final ieg a;
    public final ieg b;

    public lki() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lki) {
            lki lkiVar = (lki) obj;
            if (this.a.equals(lkiVar.a) && this.b.equals(lkiVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        ieg iegVar = this.b;
        return "CursorAndAsset{cursorResult=" + this.a.toString() + ", assetResult=" + iegVar.toString() + "}";
    }

    public lki(ieg iegVar, ieg iegVar2) {
        if (iegVar == null) {
            throw new NullPointerException("Null cursorResult");
        }
        this.a = iegVar;
        if (iegVar2 == null) {
            throw new NullPointerException("Null assetResult");
        }
        this.b = iegVar2;
    }
}
