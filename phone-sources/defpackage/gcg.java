package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gcg {
    public static final fzw a;
    private static final fzu b;

    static {
        fzu fzuVar = new fzu(false);
        b = fzuVar;
        a = new fzw(fzt.a, fzuVar, fzuVar);
    }

    public static final gag a(ysx ysxVar, bao baoVar) {
        baoVar.y(388053246);
        yim yimVar = yim.a;
        baoVar.y(5004770);
        boolean zF = baoVar.F(ysxVar);
        bas basVar = (bas) baoVar;
        Object objT = basVar.T();
        if (zF || objT == ban.a) {
            objT = new gag(ysxVar);
            basVar.ae(objT);
        }
        gag gagVar = (gag) objT;
        basVar.aa();
        baoVar.y(-1633490746);
        boolean zH = baoVar.H(yimVar) | baoVar.H(gagVar);
        Object objT2 = basVar.T();
        if (zH || objT2 == ban.a) {
            objT2 = new dbv(yimVar, gagVar, (yih) null, 10);
            basVar.ae(objT2);
        }
        basVar.aa();
        bbn.f(gagVar, (yjz) objT2, baoVar);
        baoVar.y(-1633490746);
        boolean zH2 = baoVar.H(yimVar) | baoVar.H(gagVar);
        Object objT3 = basVar.T();
        if (zH2 || objT3 == ban.a) {
            dbv dbvVar = new dbv(yimVar, gagVar, (yih) null, 11, (byte[]) null);
            basVar.ae(dbvVar);
            objT3 = dbvVar;
        }
        basVar.aa();
        bbn.f(gagVar, (yjz) objT3, baoVar);
        basVar.aa();
        return gagVar;
    }
}
