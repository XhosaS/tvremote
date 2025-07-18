package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtq extends vuc implements vvk {
    public static final wtq a;
    private static volatile vvq f;
    public wls b;
    public wls c;
    public wtp d;
    public int e;
    private int g;

    static {
        wtq wtqVar = new wtq();
        a = wtqVar;
        vuc.y(wtq.class, wtqVar);
    }

    private wtq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0003\u0004ဉ\u0002", new Object[]{"g", "b", "c", "e", wjk.m, "d"});
        }
        if (i2 == 3) {
            return new wtq();
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
        synchronized (wtq.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
