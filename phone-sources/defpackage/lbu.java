package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lbu {
    public final ieg a;

    public lbu() {
        throw null;
    }

    public static lbu a(lbu lbuVar, xbq xbqVar) {
        ieg iegVarF;
        xbp xbpVar = xbqVar.f;
        if (xbpVar == null) {
            xbpVar = xbp.a;
        }
        if ((xbpVar.b & 16) != 0) {
            xbp xbpVar2 = xbqVar.f;
            if (xbpVar2 == null) {
                xbpVar2 = xbp.a;
            }
            xbo xboVar = xbpVar2.c;
            if (xboVar == null) {
                xboVar = xbo.a;
            }
            iegVarF = ieg.f(xboVar);
        } else {
            iegVarF = lbuVar.a;
        }
        return new lbu(iegVarF);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lbu) {
            return this.a.equals(((lbu) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ParentVideoCollectionResourceState{detailsPageSelection=" + this.a.toString() + "}";
    }

    public lbu(ieg iegVar) {
        if (iegVar == null) {
            throw new NullPointerException("Null detailsPageSelection");
        }
        this.a = iegVar;
    }
}
