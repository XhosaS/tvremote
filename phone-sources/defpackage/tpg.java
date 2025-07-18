package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpg extends vuc implements vvk {
    public static final tpg a;
    private static volatile vvq f;
    public int b;
    public float c;
    public toz d;
    public vun e = vvt.a;

    static {
        tpg tpgVar = new tpg();
        a = tpgVar;
        vuc.y(tpg.class, tpgVar);
    }

    private tpg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ခ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"b", "c", "d", "e", tpe.class});
        }
        if (i2 == 3) {
            return new tpg();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpg.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
