package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ass extends can {
    private final bcb a;
    private boolean b;

    public ass(Context context) {
        super(context, null, 0, 6, null);
        this.a = new bci(aro.a, bcz.c);
    }

    @Override // defpackage.can
    public final void a(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(576708319);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            ((yjz) this.a.a()).a(baoVarD, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new nu(this, i, 9);
        }
    }

    public final void b(baw bawVar, yjz yjzVar) {
        super.h(bawVar);
        this.a.b(yjzVar);
        this.b = true;
        d();
    }

    @Override // defpackage.can
    protected final boolean c() {
        return this.b;
    }
}
