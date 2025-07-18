package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afa implements ahy {
    public static final afa a = new afa();

    @Override // defpackage.ahy
    public final void a(yjz yjzVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-2101003086);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(yjzVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.F(this) ? 16 : 32;
        }
        if (baoVarD.L((i2 & 19) != 18, i2 & 1)) {
            yjzVar.a(baoVarD, Integer.valueOf(i2 & 14));
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(this, yjzVar, i, 4);
        }
    }
}
