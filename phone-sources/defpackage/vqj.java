package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqj {
    public final vrn a;
    public final vpi b;
    public final List c;
    public final List d;
    public final vrp e;

    public vqj(vrn vrnVar, vpi vpiVar, List list, List list2, vrp vrpVar) {
        this.a = vrnVar;
        this.b = vpiVar;
        this.c = list;
        this.d = list2;
        this.e = vrpVar;
    }

    public static /* synthetic */ vqj a(vqj vqjVar, vpi vpiVar, List list, vrp vrpVar, int i) {
        vrn vrnVar = (i & 1) != 0 ? vqjVar.a : null;
        if ((i & 2) != 0) {
            vpiVar = vqjVar.b;
        }
        vpi vpiVar2 = vpiVar;
        if ((i & 4) != 0) {
            list = vqjVar.c;
        }
        List list2 = list;
        List list3 = (i & 8) != 0 ? vqjVar.d : null;
        if ((i & 16) != 0) {
            vrpVar = vqjVar.e;
        }
        vrnVar.getClass();
        vpiVar2.getClass();
        list2.getClass();
        list3.getClass();
        return new vqj(vrnVar, vpiVar2, list2, list3, vrpVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vqj)) {
            return false;
        }
        vqj vqjVar = (vqj) obj;
        return yks.e(this.a, vqjVar.a) && yks.e(this.b, vqjVar.b) && yks.e(this.c, vqjVar.c) && yks.e(this.d, vqjVar.d) && yks.e(this.e, vqjVar.e);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        vrn vrnVar = this.a;
        if (vrnVar.A()) {
            iJ = vrnVar.j();
        } else {
            int iJ3 = vrnVar.M;
            if (iJ3 == 0) {
                iJ3 = vrnVar.j();
                vrnVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int iHashCode = (((((iJ * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        vrp vrpVar = this.e;
        if (vrpVar == null) {
            iJ2 = 0;
        } else if (vrpVar.A()) {
            iJ2 = vrpVar.j();
        } else {
            int iJ4 = vrpVar.M;
            if (iJ4 == 0) {
                iJ4 = vrpVar.j();
                vrpVar.M = iJ4;
            }
            iJ2 = iJ4;
        }
        return (iHashCode * 31) + iJ2;
    }

    public final String toString() {
        return "SelectedAccountData(accountIdentifier=" + this.a + ", avatarData=" + this.b + ", greetingMessagePossibleTexts=" + this.c + ", myAccountButtonPossibleTexts=" + this.d + ", selectedAccountAvatarTap=" + this.e + ")";
    }
}
