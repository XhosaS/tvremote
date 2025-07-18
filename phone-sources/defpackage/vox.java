package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vox {
    public final vrn a;
    public final vqe b;
    public final vqe c;
    public final vqe d = null;

    public vox(vrn vrnVar, vqe vqeVar, vqe vqeVar2) {
        this.a = vrnVar;
        this.b = vqeVar;
        this.c = vqeVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vox)) {
            return false;
        }
        vox voxVar = (vox) obj;
        if (!yks.e(this.a, voxVar.a) || !yks.e(this.b, voxVar.b) || !yks.e(this.c, voxVar.c)) {
            return false;
        }
        vqe vqeVar = voxVar.d;
        return yks.e(null, null);
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
        return ((((iJ * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
    }

    public final String toString() {
        return "AccountMenuFooterData(accountIdentifier=" + this.a + ", privacyPolicyTitle=" + this.b + ", tosTitle=" + this.c + ", customButtonTitle=null)";
    }
}
