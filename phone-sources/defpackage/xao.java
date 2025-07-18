package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xao extends vuc implements vvk {
    public static final xao a;
    private static volatile vvq h;
    public int b;
    public int d;
    public int e;
    public String c = "";
    public boolean f = true;
    public int g = 1;

    static {
        xao xaoVar = new xao();
        a = xaoVar;
        vuc.y(xao.class, xaoVar);
    }

    private xao() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", xal.d});
        }
        if (i2 == 3) {
            return new xao();
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
        synchronized (xao.class) {
            vtxVar = h;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                h = vtxVar;
            }
        }
        return vtxVar;
    }
}
