package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmp extends vuc implements vvk {
    public static final wmp a;
    private static volatile vvq d;
    public wni b;
    public wni c;
    private int e;

    static {
        wmp wmpVar = new wmp();
        a = wmpVar;
        vuc.y(wmp.class, wmpVar);
    }

    private wmp() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new wmp();
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
        synchronized (wmp.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
