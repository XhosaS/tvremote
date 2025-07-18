package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptm {
    public final String a;
    public final String b;
    public final String c;
    public final vmo d;
    public final vsl e;
    public final String f;
    public final viu g;
    public final vtl h;
    public final int i;

    public ptm() {
        throw null;
    }

    public final boolean equals(Object obj) {
        vsl vslVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptm) {
            ptm ptmVar = (ptm) obj;
            if (this.a.equals(ptmVar.a)) {
                int i = this.i;
                int i2 = ptmVar.i;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && this.b.equals(ptmVar.b) && this.c.equals(ptmVar.c) && this.d.equals(ptmVar.d) && ((vslVar = this.e) != null ? vslVar.equals(ptmVar.e) : ptmVar.e == null) && this.f.equals(ptmVar.f) && this.g.equals(ptmVar.g) && this.h.equals(ptmVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iJ3;
        int iJ4;
        int iHashCode = this.a.hashCode() ^ 1000003;
        int i = this.i;
        a.bw(i);
        int iHashCode2 = (((((iHashCode * 1000003) ^ i) * (-721379959)) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        vmo vmoVar = this.d;
        if (vmoVar.A()) {
            iJ = vmoVar.j();
        } else {
            int iJ5 = vmoVar.M;
            if (iJ5 == 0) {
                iJ5 = vmoVar.j();
                vmoVar.M = iJ5;
            }
            iJ = iJ5;
        }
        int i2 = ((iHashCode2 * 1000003) ^ iJ) * 1000003;
        vsl vslVar = this.e;
        if (vslVar == null) {
            iJ2 = 0;
        } else if (vslVar.A()) {
            iJ2 = vslVar.j();
        } else {
            int iJ6 = vslVar.M;
            if (iJ6 == 0) {
                iJ6 = vslVar.j();
                vslVar.M = iJ6;
            }
            iJ2 = iJ6;
        }
        int iHashCode3 = (((i2 ^ iJ2) * 1000003) ^ this.f.hashCode()) * 1000003;
        viu viuVar = this.g;
        if (viuVar.A()) {
            iJ3 = viuVar.j();
        } else {
            int iJ7 = viuVar.M;
            if (iJ7 == 0) {
                iJ7 = viuVar.j();
                viuVar.M = iJ7;
            }
            iJ3 = iJ7;
        }
        int i3 = (iHashCode3 ^ iJ3) * 1000003;
        vtl vtlVar = this.h;
        if (vtlVar.A()) {
            iJ4 = vtlVar.j();
        } else {
            int iJ8 = vtlVar.M;
            if (iJ8 == 0) {
                iJ8 = vtlVar.j();
                vtlVar.M = iJ8;
            }
            iJ4 = iJ8;
        }
        return i3 ^ iJ4;
    }

    public final String toString() {
        int i = this.i;
        String strU = i != 0 ? ves.u(i) : "null";
        vmo vmoVar = this.d;
        vsl vslVar = this.e;
        viu viuVar = this.g;
        vtl vtlVar = this.h;
        return "ChimeNotificationAction{actionId=" + this.a + ", builtInActionType=" + strU + ", iconResourceId=0, text=" + this.b + ", url=" + this.c + ", threadStateUpdate=" + String.valueOf(vmoVar) + ", payload=" + String.valueOf(vslVar) + ", replyHintText=" + this.f + ", preferenceKey=" + String.valueOf(viuVar) + ", snoozeDuration=" + String.valueOf(vtlVar) + "}";
    }

    public ptm(String str, int i, String str2, String str3, vmo vmoVar, vsl vslVar, String str4, viu viuVar, vtl vtlVar) {
        this.a = str;
        this.i = i;
        this.b = str2;
        this.c = str3;
        this.d = vmoVar;
        this.e = vslVar;
        this.f = str4;
        this.g = viuVar;
        this.h = vtlVar;
    }
}
