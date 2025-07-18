package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ikv {
    public final wll a;
    public final wog b;

    public ikv(wll wllVar, wog wogVar) {
        wogVar.getClass();
        this.a = wllVar;
        this.b = wogVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ikv)) {
            return false;
        }
        ikv ikvVar = (ikv) obj;
        return yks.e(this.a, ikvVar.a) && this.b == ikvVar.b;
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
        return "SentimentState(entityId=" + this.a + ", state=" + this.b + ")";
    }
}
