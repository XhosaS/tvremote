package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbs extends vuc implements vvk {
    public static final xbs a;
    private static volatile vvq h;
    public int b;
    public float d;
    public long e;
    public xbr f;
    public int c = 2;
    public int g = 1;

    static {
        xbs xbsVar = new xbs();
        a = xbsVar;
        vuc.y(xbs.class, xbsVar);
    }

    private xbs() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ခ\u0001\u0003ဃ\u0002\u0007᠌\u0007\bဉ\u0006", new Object[]{"b", "c", xal.q, "d", "e", "g", xal.l, "f"});
        }
        if (i2 == 3) {
            return new xbs();
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
        vvq vvqVar = h;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (xbs.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
