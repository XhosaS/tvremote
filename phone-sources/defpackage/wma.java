package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wma extends vuc implements vvk {
    public static final wma a;
    private static volatile vvq f;
    public vun b;
    public vun c;
    public int d;
    public int e;

    static {
        wma wmaVar = new wma();
        a = wmaVar;
        vuc.y(wma.class, wmaVar);
    }

    private wma() {
        vvt vvtVar = vvt.a;
        this.b = vvtVar;
        this.c = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0004\u0004\u0004", new Object[]{"b", wlz.class, "c", wlz.class, "d", "e"});
        }
        if (i2 == 3) {
            return new wma();
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
        synchronized (wma.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
