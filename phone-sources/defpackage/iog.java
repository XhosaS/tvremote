package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iog {
    public final wll a;
    public final String b;

    public iog(wll wllVar, String str) {
        wllVar.getClass();
        str.getClass();
        this.a = wllVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iog)) {
            return false;
        }
        iog iogVar = (iog) obj;
        return yks.e(this.a, iogVar.a) && yks.e(this.b, iogVar.b);
    }

    public final int hashCode() {
        int iJ;
        wll wllVar = this.a;
        if (wllVar.A()) {
            iJ = wllVar.j();
        } else {
            int iJ2 = wllVar.M;
            if (iJ2 == 0) {
                iJ2 = wllVar.j();
                wllVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (iJ * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EntityIdAndAccount(entityId=" + this.a + ", accountName=" + this.b + ")";
    }
}
