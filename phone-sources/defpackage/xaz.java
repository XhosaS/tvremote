package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xaz extends vuc implements vvk {
    public static final xaz a;
    private static volatile vvq g;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";
    public int f = 1;

    static {
        xaz xazVar = new xaz();
        a = xazVar;
        vuc.y(xaz.class, xazVar);
    }

    private xaz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0003\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"b", "c", "f", xal.g, "d", "e"});
        }
        if (i2 == 3) {
            return new xaz();
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
        synchronized (xaz.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
