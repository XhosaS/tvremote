package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpe {
    public final vrn a;
    public final vpi b;
    public final boolean c;

    public vpe(vrn vrnVar, vpi vpiVar, boolean z) {
        this.a = vrnVar;
        this.b = vpiVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vpe)) {
            return false;
        }
        vpe vpeVar = (vpe) obj;
        return yks.e(this.a, vpeVar.a) && yks.e(this.b, vpeVar.b) && this.c == vpeVar.c;
    }

    public final int hashCode() {
        int iJ;
        vrn vrnVar = this.a;
        if (vrnVar == null) {
            iJ = 0;
        } else if (vrnVar.A()) {
            iJ = vrnVar.j();
        } else {
            int iJ2 = vrnVar.M;
            if (iJ2 == 0) {
                iJ2 = vrnVar.j();
                vrnVar.M = iJ2;
            }
            iJ = iJ2;
        }
        vpi vpiVar = this.b;
        return (((iJ * 31) + (vpiVar != null ? vpiVar.hashCode() : 0)) * 31) + a.q(this.c);
    }

    public final String toString() {
        return "AccountMenuToolbarData(selectedAccountIdentifier=" + this.a + ", selectedAccountAvatarData=" + this.b + ", isScrolled=" + this.c + ")";
    }

    public vpe() {
        this(null, null, false);
    }
}
