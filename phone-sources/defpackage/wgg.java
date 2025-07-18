package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgg extends vuc implements vvk {
    public static final wgg a;
    private static volatile vvq e;
    public boolean b;
    public int c;
    public String d = "";
    private int f;

    static {
        wgg wggVar = new wgg();
        a = wggVar;
        vuc.y(wgg.class, wggVar);
    }

    private wgg() {
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
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new wgg();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wgg.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
