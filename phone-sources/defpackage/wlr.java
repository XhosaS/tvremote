package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlr extends vuc implements vvk {
    public static final vuk a = new vzp(4);
    public static final wlr b;
    private static volatile vvq d;
    public vuj c = vud.a;

    static {
        wlr wlrVar = new wlr();
        b = wlrVar;
        vuc.y(wlr.class, wlrVar);
    }

    private wlr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"c"});
        }
        if (i2 == 3) {
            return new wlr();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wlr.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
