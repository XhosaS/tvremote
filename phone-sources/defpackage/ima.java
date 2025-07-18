package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ima {
    public final String a;
    public final wmd b;

    public ima(String str, wmd wmdVar) {
        str.getClass();
        this.a = str;
        this.b = wmdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ima)) {
            return false;
        }
        ima imaVar = (ima) obj;
        return yks.e(this.a, imaVar.a) && yks.e(this.b, imaVar.b);
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = this.a.hashCode() * 31;
        wmd wmdVar = this.b;
        if (wmdVar.A()) {
            iJ = wmdVar.j();
        } else {
            int iJ2 = wmdVar.M;
            if (iJ2 == 0) {
                iJ2 = wmdVar.j();
                wmdVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return iHashCode + iJ;
    }

    public final String toString() {
        return "LibraryConfig(accountName=" + this.a + ", mediaLibraryConfig=" + this.b + ")";
    }
}
