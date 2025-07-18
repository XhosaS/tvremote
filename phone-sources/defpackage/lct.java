package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lct {
    public final xbq a;
    public final lbu b;

    public lct() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lct) {
            lct lctVar = (lct) obj;
            if (this.a.equals(lctVar.a) && this.b.equals(lctVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        xbq xbqVar = this.a;
        if (xbqVar.A()) {
            iJ = xbqVar.j();
        } else {
            int iJ2 = xbqVar.M;
            if (iJ2 == 0) {
                iJ2 = xbqVar.j();
                xbqVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return ((iJ ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        lbu lbuVar = this.b;
        return "VideoCollectionResourceWrapper{currentResource=" + this.a.toString() + ", parentState=" + lbuVar.toString() + "}";
    }

    public lct(xbq xbqVar, lbu lbuVar) {
        if (xbqVar == null) {
            throw new NullPointerException("Null currentResource");
        }
        this.a = xbqVar;
        this.b = lbuVar;
    }
}
