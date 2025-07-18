package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xbr extends vuc implements vvk {
    public static final xbr a;
    private static volatile vvq e;
    public int b;
    public String c = "";
    public int d;

    static {
        xbr xbrVar = new xbr();
        a = xbrVar;
        vuc.y(xbr.class, xbrVar);
    }

    private xbr() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0000\u0003᠌\u0003\u0004ဈ\u0002", new Object[]{"b", "d", xal.r, "c"});
        }
        if (i2 == 3) {
            return new xbr();
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
        synchronized (xbr.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
