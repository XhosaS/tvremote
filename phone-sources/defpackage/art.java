package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class art {
    public static final art a = new art();

    private art() {
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, yjk] */
    public final void a(aqx aqxVar, bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(1565826668);
        if (i3 == 0) {
            i2 = (true != baoVarD.F(aqxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            cqv.y(aqxVar.a, (cns) aqxVar.c, bga.k(1163527043, new aoq(aqxVar, 9), baoVarD), baoVarD, 384, 0);
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new qt(this, aqxVar, i, 15, null);
        }
    }
}
