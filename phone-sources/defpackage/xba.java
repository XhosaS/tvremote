package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xba extends vuc implements vvk {
    public static final xba a;
    private static volatile vvq f;
    public String b = "";
    public int c = 1;
    public boolean d;
    public int e;
    private int g;

    static {
        xba xbaVar = new xba();
        a = xbaVar;
        vuc.y(xba.class, xbaVar);
    }

    private xba() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0005ဇ\u0002\u0006᠌\u0003", new Object[]{"g", "b", "c", xal.i, "d", "e", xal.h});
        }
        if (i2 == 3) {
            return new xba();
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
        synchronized (xba.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
