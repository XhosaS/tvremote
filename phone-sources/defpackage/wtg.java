package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtg extends vuc implements vvk {
    public static final wtg a;
    public static final vvd c;
    private static volatile vvq d;
    public wll b;
    private int e;

    static {
        wtg wtgVar = new wtg();
        a = wtgVar;
        vuc.y(wtg.class, wtgVar);
        c = vuc.C(wkx.a, wtgVar, wtgVar, 354375324, vwo.MESSAGE);
    }

    private wtg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"e", "b"});
        }
        if (i2 == 3) {
            return new wtg();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtg.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
