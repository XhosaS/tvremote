package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfu {
    private final String a;
    private final wes b;
    private final wes c;
    private final yjk d;

    public pfu(String str, wes wesVar, wes wesVar2, yjk yjkVar) {
        this.a = str;
        this.b = wesVar;
        this.c = wesVar2;
        this.d = yjkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfu)) {
            return false;
        }
        pfu pfuVar = (pfu) obj;
        return yks.e(this.a, pfuVar.a) && yks.e(this.b, pfuVar.b) && yks.e(this.c, pfuVar.c) && yks.e(this.d, pfuVar.d);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iHashCode = this.a.hashCode() * 31;
        wes wesVar = this.b;
        if (wesVar.A()) {
            iJ = wesVar.j();
        } else {
            int iJ3 = wesVar.M;
            if (iJ3 == 0) {
                iJ3 = wesVar.j();
                wesVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int i = (iHashCode + iJ) * 31;
        wes wesVar2 = this.c;
        if (wesVar2.A()) {
            iJ2 = wesVar2.j();
        } else {
            int iJ4 = wesVar2.M;
            if (iJ4 == 0) {
                iJ4 = wesVar2.j();
                wesVar2.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return ((i + iJ2) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "PromotionAction(text=" + this.a + ", lightThemeTextColor=" + this.b + ", darkThemeTextColor=" + this.c + ", onClick=" + this.d + ")";
    }
}
