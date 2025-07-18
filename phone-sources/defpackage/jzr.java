package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jzr implements ixo {
    public final wlf a;
    public final boolean b;

    public jzr(wlf wlfVar, boolean z) {
        wlfVar.getClass();
        this.a = wlfVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzr)) {
            return false;
        }
        jzr jzrVar = (jzr) obj;
        return yks.e(this.a, jzrVar.a) && this.b == jzrVar.b;
    }

    public final int hashCode() {
        int iJ;
        wlf wlfVar = this.a;
        if (wlfVar.A()) {
            iJ = wlfVar.j();
        } else {
            int iJ2 = wlfVar.M;
            if (iJ2 == 0) {
                iJ2 = wlfVar.j();
                wlfVar.M = iJ2;
            }
            iJ = iJ2;
        }
        return (iJ * 31) + a.q(this.b);
    }

    public final String toString() {
        return "DestinationMetadata(destination=" + this.a + ", toolbarPaddingRequired=" + this.b + ")";
    }
}
