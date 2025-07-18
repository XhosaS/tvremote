package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbj extends mix implements nix {
    private final aefu a;

    public nbj(aefu aefuVar) {
        this.a = aefuVar;
    }

    @Override // defpackage.nix
    public final float g() {
        aefu aefuVar = this.a;
        int iA = aefuVar.a(8);
        if (iA != 0) {
            return aefuVar.b.getFloat(iA + aefuVar.a);
        }
        return Float.NaN;
    }

    @Override // defpackage.nix
    public final float h() {
        aefu aefuVar = this.a;
        int iA = aefuVar.a(4);
        if (iA != 0) {
            return aefuVar.b.getFloat(iA + aefuVar.a);
        }
        return Float.NaN;
    }

    @Override // defpackage.nix
    public final float i() {
        aefu aefuVar = this.a;
        int iA = aefuVar.a(6);
        if (iA != 0) {
            return aefuVar.b.getFloat(iA + aefuVar.a);
        }
        return Float.NaN;
    }

    @Override // defpackage.nix
    public final boolean j() {
        return true;
    }

    @Override // defpackage.nix
    public final boolean k() {
        return true;
    }

    @Override // defpackage.nix
    public final boolean l() {
        return true;
    }
}
