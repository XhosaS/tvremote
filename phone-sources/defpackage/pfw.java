package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pfw {
    private final wes a;
    private final wes b;
    private final wes c;

    public pfw(wes wesVar, wes wesVar2, wes wesVar3) {
        this.a = wesVar;
        this.b = wesVar2;
        this.c = wesVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfw)) {
            return false;
        }
        pfw pfwVar = (pfw) obj;
        return yks.e(this.a, pfwVar.a) && yks.e(this.b, pfwVar.b) && yks.e(this.c, pfwVar.c);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        wes wesVar = this.a;
        if (wesVar.A()) {
            iJ = wesVar.j();
        } else {
            int iJ4 = wesVar.M;
            if (iJ4 == 0) {
                iJ4 = wesVar.j();
                wesVar.M = iJ4;
            }
            iJ = iJ4;
        }
        wes wesVar2 = this.b;
        if (wesVar2.A()) {
            iJ2 = wesVar2.j();
        } else {
            int iJ5 = wesVar2.M;
            if (iJ5 == 0) {
                iJ5 = wesVar2.j();
                wesVar2.M = iJ5;
            }
            iJ2 = iJ5;
        }
        int i = iJ * 31;
        wes wesVar3 = this.c;
        if (wesVar3.A()) {
            iJ3 = wesVar3.j();
        } else {
            int iJ6 = wesVar3.M;
            if (iJ6 == 0) {
                iJ6 = wesVar3.j();
                wesVar3.M = iJ6;
            }
            iJ3 = iJ6;
        }
        return ((i + iJ2) * 31) + iJ3;
    }

    public final String toString() {
        return "PromotionDataColors(backgroundColor=" + this.a + ", titleColor=" + this.b + ", bodyColor=" + this.c + ")";
    }
}
