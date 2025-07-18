package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjg extends vuc implements vvk {
    public static final wjg a;
    private static volatile vvq g;
    public int b;
    public int d;
    public int f;
    public String c = "";
    public vun e = vvt.a;

    static {
        wjg wjgVar = new wjg();
        a = wjgVar;
        vuc.y(wjg.class, wjgVar);
    }

    private wjg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003\u001a\u0004᠌\u0002", new Object[]{"b", "c", "d", "e", "f", wia.u});
        }
        if (i2 == 3) {
            return new wjg();
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
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wjg.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
