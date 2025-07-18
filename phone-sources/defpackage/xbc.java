package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbc extends vuc implements vvk {
    public static final xbc a;
    private static volatile vvq d;
    public String b = "";
    public int c;
    private int e;

    static {
        xbc xbcVar = new xbc();
        a = xbcVar;
        vuc.y(xbc.class, xbcVar);
    }

    private xbc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"e", "b", "c", xal.j});
        }
        if (i2 == 3) {
            return new xbc();
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
        synchronized (xbc.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
