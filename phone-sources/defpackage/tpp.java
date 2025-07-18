package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpp extends vuc implements vvk {
    public static final vuk a = new qiu(7);
    public static final tpp b;
    private static volatile vvq e;
    public String c = "";
    public vuj d = vud.a;
    private int f;

    static {
        tpp tppVar = new tpp();
        b = tppVar;
        vuc.y(tpp.class, tppVar);
    }

    private tpp() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002ဈ\u0001\u0003ࠞ", new Object[]{"f", "c", "d", kzn.t});
        }
        if (i2 == 3) {
            return new tpp();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpp.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
