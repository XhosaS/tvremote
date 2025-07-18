package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpj extends vuc implements vvk {
    public static final tpj a;
    private static volatile vvq c;
    public int b = 1;
    private int d;

    static {
        tpj tpjVar = new tpj();
        a = tpjVar;
        vuc.y(tpj.class, tpjVar);
    }

    private tpj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002᠌\u0003", new Object[]{"d", "b", kzn.s});
        }
        if (i2 == 3) {
            return new tpj();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpj.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
