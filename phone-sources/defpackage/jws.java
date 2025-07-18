package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jws {
    public static final jws a = new jws();

    private jws() {
    }

    public final void a(boolean z, long j, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(-1194421087);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = (i2 >> 3) & 14;
            if (z) {
                baoVarD.x(805537235);
                koo.a.b(j, null, baoVarD, i4);
                ((bas) baoVarD).aa();
            } else {
                baoVarD.x(805620377);
                koo.a.a(j, null, baoVarD, i4);
                ((bas) baoVarD).aa();
            }
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwr(this, z, j, i, 2);
        }
    }

    public final void b(boolean z, long j, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1161404937);
        if (i3 == 0) {
            i2 = (true != baoVarD.G(z) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != baoVarD.E(j) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && baoVarD.K()) {
            baoVarD.t();
        } else {
            int i4 = (i2 >> 3) & 14;
            if (z) {
                baoVarD.x(-841980039);
                koo.a.d(j, null, baoVarD, i4);
                ((bas) baoVarD).aa();
            } else {
                baoVarD.x(-841910785);
                koo.a.c(j, null, baoVarD, i4);
                ((bas) baoVarD).aa();
            }
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new jwr(this, z, j, i, 0);
        }
    }
}
