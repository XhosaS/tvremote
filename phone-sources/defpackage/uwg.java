package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwg extends vuc implements vvk {
    public static final uwg a;
    private static volatile vvq g;
    public int b;
    public uwm c;
    public int d;
    public vwe e;
    public uwf f;

    static {
        uwg uwgVar = new uwg();
        a = uwgVar;
        vuc.y(uwg.class, uwgVar);
    }

    private uwg() {
        vsz vszVar = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0005ဉ\u0002", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new uwg();
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
        synchronized (uwg.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
