package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vpu implements voy {
    public final vrn a;
    private final vrr b = vrr.a;

    public vpu(vrn vrnVar) {
        this.a = vrnVar;
    }

    @Override // defpackage.voy
    public final vrr a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vpu) && yks.e(this.a, ((vpu) obj).a);
    }

    public final int hashCode() {
        vrn vrnVar = this.a;
        if (vrnVar.A()) {
            return vrnVar.j();
        }
        int i = vrnVar.M;
        if (i != 0) {
            return i;
        }
        int iJ = vrnVar.j();
        vrnVar.M = iJ;
        return iJ;
    }

    public final String toString() {
        return "ManageYourGoogleAccountClick(accountIdentifier=" + this.a + ")";
    }
}
