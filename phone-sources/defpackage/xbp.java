package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbp extends vuc implements vvk {
    public static final xbp a;
    private static volatile vvq d;
    public int b;
    public xbo c;

    static {
        xbp xbpVar = new xbp();
        a = xbpVar;
        vuc.y(xbp.class, xbpVar);
    }

    private xbp() {
        vvt vvtVar = vvt.a;
        vud vudVar = vud.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\n\n\u0001\u0000\u0000\u0000\nဉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new xbp();
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
        synchronized (xbp.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
