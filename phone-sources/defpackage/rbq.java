package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbq {
    public final vrn a;
    public final vpi b;
    public final int c;

    public rbq(vrn vrnVar, vpi vpiVar, int i) {
        this.a = vrnVar;
        this.b = vpiVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rbq)) {
            return false;
        }
        rbq rbqVar = (rbq) obj;
        return yks.e(this.a, rbqVar.a) && yks.e(this.b, rbqVar.b) && this.c == rbqVar.c;
    }

    public final int hashCode() {
        int iJ;
        vrn vrnVar = this.a;
        if (vrnVar.A()) {
            iJ = vrnVar.j();
        } else {
            int iJ2 = vrnVar.M;
            if (iJ2 == 0) {
                iJ2 = vrnVar.j();
                vrnVar.M = iJ2;
            }
            iJ = iJ2;
        }
        int iHashCode = ((iJ * 31) + this.b.hashCode()) * 31;
        int i = this.c;
        a.bw(i);
        return iHashCode + i;
    }

    public final String toString() {
        return "AvatarDataWithIdentifier(accountIdentifier=" + this.a + ", avatarData=" + this.b + ", accountState=" + ((Object) vxr.ao(this.c)) + ")";
    }

    public /* synthetic */ rbq(vrn vrnVar, vpi vpiVar) {
        this(vrnVar, vpiVar, 1);
    }
}
